package com.google.android.gms.common;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

/* renamed from: com.google.android.gms.common.h */
final class C15385h {
    /* renamed from: a */
    static ApplicationInfo m31966a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C11010c.m22280a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C18970b.f52271a == null) {
            C18970b.f52271a = packageManager.getApplicationInfo(str, i);
        }
        return C18970b.f52271a;
    }
}
