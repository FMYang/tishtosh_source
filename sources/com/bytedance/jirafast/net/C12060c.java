package com.bytedance.jirafast.net;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;

/* renamed from: com.bytedance.jirafast.net.c */
public final class C12060c extends RequestBody {

    /* renamed from: a */
    public C12061a f31888a;

    /* renamed from: b */
    private File f31889b;

    /* renamed from: com.bytedance.jirafast.net.c$a */
    public interface C12061a {
    }

    public final long contentLength() throws IOException {
        return this.f31889b.length();
    }

    public final MediaType contentType() {
        return MediaType.parse("multipart/form-data");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        this.f31889b.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f31889b);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    bufferedSink.write(bArr, 0, read);
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            } finally {
                fileInputStream.close();
            }
        }
    }

    public C12060c(File file, C12061a aVar) {
        this.f31889b = file;
        this.f31888a = aVar;
    }
}
