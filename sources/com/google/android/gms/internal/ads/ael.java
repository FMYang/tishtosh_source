package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@C16299uq
public final class ael {
    /* renamed from: a */
    public static boolean m32733a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
        if (bundle2 == null || !bundle2.getBoolean("render_test_ad_label", false)) {
            return false;
        }
        return true;
    }
}
