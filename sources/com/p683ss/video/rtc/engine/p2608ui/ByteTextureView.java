package com.p683ss.video.rtc.engine.p2608ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p683ss.video.rtc.engine.mediaio.IVideoSink;
import java.nio.ByteBuffer;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;

/* renamed from: com.ss.video.rtc.engine.ui.ByteTextureView */
public class ByteTextureView extends TextureView implements IVideoSink {
    private boolean isRelease = true;
    private EglBase mEglBase;
    private boolean mIsStart;
    private VideoFrameRender mVideoFrameRender;

    public int getBufferType() {
        return 0;
    }

    public EGLContext getEGLContextHandle() {
        return null;
    }

    public int getPixelFormat() {
        return 1;
    }

    public void onStop() {
        this.mIsStart = false;
    }

    private void init() {
        this.mVideoFrameRender = new VideoFrameRender("ByteSurfaceViewRender");
        this.mVideoFrameRender.setRenderView((TextureView) this, (SurfaceTextureListener) null);
    }

    public boolean onStart() {
        this.mIsStart = true;
        this.mVideoFrameRender.onStart();
        return true;
    }

    public void onDispose() {
        if (!this.isRelease) {
            this.isRelease = true;
            this.mVideoFrameRender.release();
            if (this.mEglBase != null) {
                this.mEglBase.release();
            }
        }
    }

    public boolean onInitialize() {
        if (!this.isRelease) {
            return false;
        }
        this.mEglBase = EglBase$$CC.create$$STATIC$$();
        this.mVideoFrameRender.init(this.mEglBase.getEglBaseContext());
        this.isRelease = false;
        return true;
    }

    public ByteTextureView(Context context) {
        super(context);
        init();
    }

    public ByteTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ByteTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ByteTextureView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeByteArrayFrame(bArr, byteBuffer, i, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeByteBufferFrame(byteBuffer, byteBuffer2, i, i2, i3, i4, j);
        }
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeTextureFrame(i, byteBuffer, i2, i3, i4, i5, j, fArr);
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        this.mVideoFrameRender.consumeYUVByteArrayFrame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j, byteBuffer);
    }
}
