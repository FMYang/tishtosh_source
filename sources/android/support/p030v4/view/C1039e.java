package android.support.p030v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: android.support.v4.view.e */
public final class C1039e {
    /* renamed from: a */
    public static int m2968a(int i, int i2) {
        if (VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(i, i2);
        }
        return i & -8388609;
    }

    /* renamed from: a */
    public static void m2969a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
