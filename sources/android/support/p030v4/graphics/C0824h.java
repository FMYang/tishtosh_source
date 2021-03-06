package android.support.p030v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p030v4.content.p035a.C0712c.C0714b;
import android.support.p030v4.content.p035a.C0712c.C0715c;
import android.support.p030v4.p036d.C0747b.C0753b;
import com.p683ss.ttm.player.MediaPlayer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.h */
public class C0824h {

    /* renamed from: android.support.v4.graphics.h$a */
    interface C0827a<T> {
        /* renamed from: a */
        boolean mo2668a(T t);

        /* renamed from: b */
        int mo2669b(T t);
    }

    C0824h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0753b mo2667a(C0753b[] bVarArr, int i) {
        return (C0753b) m2375a(bVarArr, i, new C0827a<C0753b>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo2668a(Object obj) {
                return ((C0753b) obj).f2594d;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo2669b(Object obj) {
                return ((C0753b) obj).f2593c;
            }
        });
    }

    /* renamed from: a */
    protected static Typeface m2374a(Context context, InputStream inputStream) {
        File a = C0828i.m2386a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0828i.m2392a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    private static <T> T m2375a(T[] tArr, int i, C0827a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.mo2669b(t2) - i2) * 2;
            if (aVar.mo2668a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo2663a(Context context, C0714b bVar, Resources resources, int i) {
        C0715c cVar = (C0715c) m2375a(bVar.f2503a, i, new C0827a<C0715c>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo2668a(Object obj) {
                return ((C0715c) obj).f2506c;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo2669b(Object obj) {
                return ((C0715c) obj).f2505b;
            }
        });
        if (cVar == null) {
            return null;
        }
        return C0807c.m2313a(context, resources, cVar.f2509f, cVar.f2504a, i);
    }

    /* renamed from: a */
    public Typeface mo2604a(Context context, CancellationSignal cancellationSignal, C0753b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2667a(bVarArr, i).f2591a);
            try {
                Typeface a = m2374a(context, inputStream);
                C0828i.m2390a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0828i.m2390a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0828i.m2390a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0828i.m2390a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0828i.m2390a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo2664a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0828i.m2386a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0828i.m2391a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
