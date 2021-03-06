package android.support.p030v4.graphics;

import android.graphics.Color;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v4.graphics.a */
public final class C0803a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f2730a = new ThreadLocal<>();

    /* renamed from: c */
    private static int m2299c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / NormalGiftView.ALPHA_255);
    }

    /* renamed from: b */
    public static int m2298b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    public static int m2295a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = m2299c(alpha2, alpha);
        return Color.argb(c, m2297a(Color.red(i), alpha2, Color.red(i2), alpha, c), m2297a(Color.green(i), alpha2, Color.green(i2), alpha, c), m2297a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: a */
    public static int m2296a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static int m2297a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * NormalGiftView.ALPHA_255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * NormalGiftView.ALPHA_255);
    }
}
