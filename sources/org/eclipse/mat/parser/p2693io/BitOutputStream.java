package org.eclipse.mat.parser.p2693io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.mat.parser.internal.Messages;

/* renamed from: org.eclipse.mat.parser.io.BitOutputStream */
public class BitOutputStream implements Closeable, Flushable {
    private int avail;
    private byte[] buffer;
    private int current;
    private int free;

    /* renamed from: os */
    private OutputStream f133290os;
    private int pos;
    private byte[] tempBuffer = new byte[128];

    private int align() throws IOException {
        if (this.free != 8) {
            return writeInCurrent(0, this.free);
        }
        return 0;
    }

    public void close() throws IOException {
        flush();
        this.f133290os.close();
        this.f133290os = null;
        this.buffer = null;
        this.tempBuffer = null;
    }

    public void flush() throws IOException {
        align();
        this.f133290os.write(this.buffer, 0, this.pos);
        this.pos = 0;
        this.avail = this.buffer.length;
        this.f133290os.flush();
    }

    public int writeBit(int i) throws IOException {
        return writeInCurrent(i, 1);
    }

    public BitOutputStream(OutputStream outputStream) {
        this.f133290os = outputStream;
        this.buffer = new byte[16384];
        this.avail = 16384;
        this.free = 8;
    }

    private void write(int i) throws IOException {
        int i2 = this.avail;
        this.avail = i2 - 1;
        if (i2 == 0) {
            if (this.f133290os == null) {
                this.avail = 0;
                throw new IOException(Messages.BitOutputStream_Error_ArrayFull);
            } else if (this.buffer == null) {
                this.f133290os.write(i);
                this.avail = 0;
                return;
            } else {
                this.f133290os.write(this.buffer);
                this.avail = this.buffer.length - 1;
                this.pos = 0;
            }
        }
        byte[] bArr = this.buffer;
        int i3 = this.pos;
        this.pos = i3 + 1;
        bArr[i3] = (byte) i;
    }

    private int writeInCurrent(int i, int i2) throws IOException {
        int i3 = this.current;
        int i4 = i & ((1 << i2) - 1);
        int i5 = this.free - i2;
        this.free = i5;
        this.current = (i4 << i5) | i3;
        if (this.free == 0) {
            write(this.current);
            this.free = 8;
            this.current = 0;
        }
        return i2;
    }

    public int writeInt(int i, int i2) throws IOException {
        if (i2 <= this.free) {
            return writeInCurrent(i, i2);
        }
        int i3 = (i2 - this.free) & 7;
        int i4 = (i2 - this.free) >> 3;
        if (i3 != 0) {
            this.tempBuffer[i4] = (byte) i;
            i >>= i3;
        }
        int i5 = i;
        int i6 = i4;
        while (true) {
            int i7 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            this.tempBuffer[i7] = (byte) i5;
            i5 >>>= 8;
            i6 = i7;
        }
        writeInCurrent(i5, this.free);
        for (int i8 = 0; i8 < i4; i8++) {
            write(this.tempBuffer[i8]);
        }
        if (i3 != 0) {
            writeInCurrent(this.tempBuffer[i4], i3);
        }
        return i2;
    }
}
