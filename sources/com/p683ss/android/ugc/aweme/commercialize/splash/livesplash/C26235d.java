package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.d */
public final class C26235d {

    /* renamed from: a */
    public static final C26235d f69271a = new C26235d();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.d$a */
    public static final class C26236a extends C17956a<LiveAwesomeData> {
        C26236a() {
        }
    }

    private C26235d() {
    }

    /* renamed from: b */
    public static final boolean m63571b(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final LiveAwesomeSplashInfo m63575f(Aweme aweme) {
        if (aweme != null) {
            return aweme.getLiveAwesomeSplashInfo();
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m63570a(Aweme aweme) {
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.getTopviewValid()) {
                return liveAwesomeSplashInfo.isTopViewData();
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m63572c(Aweme aweme) {
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && !liveAwesomeSplashInfo.isTopViewData()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m63573d(Aweme aweme) {
        if (!m63570a(aweme)) {
            return true;
        }
        if (aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo != null && liveAwesomeSplashInfo.getHasShown()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m63574e(Aweme aweme) {
        if (m63570a(aweme) && aweme != null) {
            LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
            if (liveAwesomeSplashInfo == null || !liveAwesomeSplashInfo.getTopviewValid()) {
                return true;
            }
            long endTime = liveAwesomeSplashInfo.getEndTime();
            if (endTime != 0 && endTime >= System.currentTimeMillis() / 1000) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData m63576g(com.p683ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo r2 = r2.getLiveAwesomeSplashInfo()
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = r2.getLiveData()
            goto L_0x000f
        L_0x000e:
            r2 = r0
        L_0x000f:
            if (r2 != 0) goto L_0x0012
            return r0
        L_0x0012:
            com.google.gson.f r0 = new com.google.gson.f
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.d$a r1 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.d$a
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f49843c
            java.lang.Object r2 = r0.mo34885a(r2, r1)
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData r2 = (com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63576g(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData");
    }
}
