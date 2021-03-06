package com.p683ss.android.medialib.jni;

import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.ttve.nativePort.C20129b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.medialib.jni.PhotoFaceDetection */
public class PhotoFaceDetection {
    private long handle = nativeCreate();
    private C19347a listener;

    /* renamed from: com.ss.android.medialib.jni.PhotoFaceDetection$a */
    public interface C19347a {
    }

    static {
        C20129b.m49687d();
    }

    private native long nativeCreate();

    private static native String[] nativeGetDetectModelList();

    private native int nativeStartDetect(long j, String[] strArr);

    private native void nativeStop(long j);

    public static List<String> getDetectModelList() {
        return Arrays.asList(nativeGetDetectModelList());
    }

    public synchronized void stop() {
        if (this.handle != 0) {
            nativeStop(this.handle);
            this.handle = 0;
        }
    }

    public void setListener(C19347a aVar) {
        this.listener = aVar;
    }

    public int startDetect(String[] strArr) {
        if (this.handle == 0) {
            return -1;
        }
        return nativeStartDetect(this.handle, strArr);
    }

    public void onImage(int[] iArr, int i, int i2, int i3) {
        if (this.listener != null) {
            new CoverInfo(i, i2, iArr);
        }
    }
}
