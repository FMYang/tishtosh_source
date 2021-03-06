package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.util.UnsafeUtils;

final class StreamingXXHash32JavaUnsafe extends AbstractStreamingXXHash32Java {

    static class Factory implements Factory {
        public static final Factory INSTANCE = new Factory();

        Factory() {
        }

        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JavaUnsafe(i);
        }
    }

    public final int getValue() {
        int i;
        if (this.totalLen >= 16) {
            i = Integer.rotateLeft(this.f132152v1, 1) + Integer.rotateLeft(this.f132153v2, 7) + Integer.rotateLeft(this.f132154v3, 12) + Integer.rotateLeft(this.f132155v4, 18);
        } else {
            i = this.seed + 374761393;
        }
        int i2 = (int) (((long) i) + this.totalLen);
        int i3 = 0;
        while (i3 <= this.memSize - 4) {
            i2 = Integer.rotateLeft(i2 + (UnsafeUtils.readIntLE(this.memory, i3) * -1028477379), 17) * 668265263;
            i3 += 4;
        }
        while (i3 < this.memSize) {
            i2 = Integer.rotateLeft(i2 + ((UnsafeUtils.readByte(this.memory, i3) & 255) * 374761393), 11) * -1640531535;
            i3++;
        }
        int i4 = (i2 ^ (i2 >>> 15)) * -2048144777;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477379;
        return i5 ^ (i5 >>> 16);
    }

    StreamingXXHash32JavaUnsafe(int i) {
        super(i);
    }

    public final void update(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        this.totalLen += (long) i2;
        if (this.memSize + i2 < 16) {
            System.arraycopy(bArr, i, this.memory, this.memSize, i2);
            this.memSize += i2;
            return;
        }
        int i3 = i2 + i;
        if (this.memSize > 0) {
            System.arraycopy(bArr, i, this.memory, this.memSize, 16 - this.memSize);
            this.f132152v1 += UnsafeUtils.readIntLE(this.memory, 0) * -2048144777;
            this.f132152v1 = Integer.rotateLeft(this.f132152v1, 13);
            this.f132152v1 *= -1640531535;
            this.f132153v2 += UnsafeUtils.readIntLE(this.memory, 4) * -2048144777;
            this.f132153v2 = Integer.rotateLeft(this.f132153v2, 13);
            this.f132153v2 *= -1640531535;
            this.f132154v3 += UnsafeUtils.readIntLE(this.memory, 8) * -2048144777;
            this.f132154v3 = Integer.rotateLeft(this.f132154v3, 13);
            this.f132154v3 *= -1640531535;
            this.f132155v4 += UnsafeUtils.readIntLE(this.memory, 12) * -2048144777;
            this.f132155v4 = Integer.rotateLeft(this.f132155v4, 13);
            this.f132155v4 *= -1640531535;
            i += 16 - this.memSize;
            this.memSize = 0;
        }
        int i4 = i3 - 16;
        int i5 = this.f132152v1;
        int i6 = this.f132153v2;
        int i7 = this.f132154v3;
        int i8 = this.f132155v4;
        while (i <= i4) {
            i5 = Integer.rotateLeft(i5 + (UnsafeUtils.readIntLE(bArr, i) * -2048144777), 13) * -1640531535;
            int i9 = i + 4;
            i6 = Integer.rotateLeft(i6 + (UnsafeUtils.readIntLE(bArr, i9) * -2048144777), 13) * -1640531535;
            int i10 = i9 + 4;
            i7 = Integer.rotateLeft(i7 + (UnsafeUtils.readIntLE(bArr, i10) * -2048144777), 13) * -1640531535;
            int i11 = i10 + 4;
            i8 = Integer.rotateLeft(i8 + (UnsafeUtils.readIntLE(bArr, i11) * -2048144777), 13) * -1640531535;
            i = i11 + 4;
        }
        this.f132152v1 = i5;
        this.f132153v2 = i6;
        this.f132154v3 = i7;
        this.f132155v4 = i8;
        if (i < i3) {
            int i12 = i3 - i;
            System.arraycopy(bArr, i, this.memory, 0, i12);
            this.memSize = i12;
        }
    }
}
