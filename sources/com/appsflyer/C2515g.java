package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import java.lang.ref.WeakReference;

/* renamed from: com.appsflyer.g */
final class C2515g {

    /* renamed from: com.appsflyer.g$_lancet */
    class _lancet {
        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m7373xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo */
        static NetworkInfo m7374x228a3316(ConnectivityManager connectivityManager, int i) {
            try {
                return connectivityManager.getNetworkInfo(i);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo */
        static NetworkInfo m7375x228a3316(ConnectivityManager connectivityManager, Network network) {
            try {
                return connectivityManager.getNetworkInfo(network);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    /* renamed from: com.appsflyer.g$b */
    static final class C2516b {

        /* renamed from: ˊ */
        public final String f7815;

        /* renamed from: ˋ */
        public final String f7816;

        /* renamed from: ˎ */
        public final String f7817;

        C2516b() {
        }

        /* renamed from: ॱ */
        static void m7376(Context context) {
            Context applicationContext = context.getApplicationContext();
            AFLogger.afInfoLog("onBecameBackground");
            AppsFlyerLib.getInstance().mo6952();
            AFLogger.afInfoLog("callStatsBackground background call");
            AppsFlyerLib.getInstance().mo6948(new WeakReference<>(applicationContext));
            C2537s r0 = C2537s.m7429();
            if (r0.f7887) {
                r0.mo7044();
                if (applicationContext != null) {
                    C2537s.m7425(applicationContext.getPackageName(), applicationContext.getPackageManager());
                }
                r0.mo7041();
            } else {
                AFLogger.afDebugLog("RD status is OFF");
            }
            AFExecutor.getInstance().mo6915();
        }

        C2516b(String str, String str2, String str3) {
            this.f7816 = str;
            this.f7817 = str2;
            this.f7815 = str3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa A[SYNTHETIC, Splitter:B:57:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb A[Catch:{ Throwable -> 0x00b1 }] */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.appsflyer.C2515g.C2516b m7372(android.content.Context r10) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 0
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r10.getSystemService(r2)     // Catch:{ Throwable -> 0x00c2 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Throwable -> 0x00c2 }
            if (r2 == 0) goto L_0x0095
            r3 = 21
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00c2 }
            r5 = 0
            r6 = 1
            if (r3 > r4) goto L_0x004c
            android.net.Network[] r3 = r2.getAllNetworks()     // Catch:{ Throwable -> 0x00c2 }
            int r4 = r3.length     // Catch:{ Throwable -> 0x00c2 }
            r7 = 0
        L_0x001b:
            if (r7 >= r4) goto L_0x0049
            r8 = r3[r7]     // Catch:{ Throwable -> 0x00c2 }
            android.net.NetworkInfo r8 = com.appsflyer.C2515g._lancet.m7375x228a3316(r2, r8)     // Catch:{ Throwable -> 0x00c2 }
            if (r8 == 0) goto L_0x002d
            boolean r9 = r8.isConnectedOrConnecting()     // Catch:{ Throwable -> 0x00c2 }
            if (r9 == 0) goto L_0x002d
            r9 = 1
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            if (r9 == 0) goto L_0x0046
            int r2 = r8.getType()     // Catch:{ Throwable -> 0x00c2 }
            if (r6 != r2) goto L_0x003a
            java.lang.String r2 = "WIFI"
            goto L_0x0097
        L_0x003a:
            int r2 = r8.getType()     // Catch:{ Throwable -> 0x00c2 }
            if (r2 != 0) goto L_0x0043
            java.lang.String r2 = "MOBILE"
            goto L_0x0097
        L_0x0043:
            java.lang.String r2 = "unknown"
            goto L_0x0097
        L_0x0046:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x0049:
            java.lang.String r2 = "unknown"
            goto L_0x0097
        L_0x004c:
            android.net.NetworkInfo r3 = com.appsflyer.C2515g._lancet.m7374x228a3316(r2, r6)     // Catch:{ Throwable -> 0x00c2 }
            if (r3 == 0) goto L_0x005a
            boolean r3 = r3.isConnectedOrConnecting()     // Catch:{ Throwable -> 0x00c2 }
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0060
            java.lang.String r2 = "WIFI"
            goto L_0x0097
        L_0x0060:
            android.net.NetworkInfo r3 = com.appsflyer.C2515g._lancet.m7374x228a3316(r2, r5)     // Catch:{ Throwable -> 0x00c2 }
            if (r3 == 0) goto L_0x006e
            boolean r3 = r3.isConnectedOrConnecting()     // Catch:{ Throwable -> 0x00c2 }
            if (r3 == 0) goto L_0x006e
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x0074
            java.lang.String r2 = "MOBILE"
            goto L_0x0097
        L_0x0074:
            android.net.NetworkInfo r2 = com.appsflyer.C2515g._lancet.m7373xea89a0b0(r2)     // Catch:{ Throwable -> 0x00c2 }
            if (r2 == 0) goto L_0x0081
            boolean r3 = r2.isConnectedOrConnecting()     // Catch:{ Throwable -> 0x00c2 }
            if (r3 == 0) goto L_0x0081
            r5 = 1
        L_0x0081:
            if (r5 == 0) goto L_0x0095
            int r3 = r2.getType()     // Catch:{ Throwable -> 0x00c2 }
            if (r6 != r3) goto L_0x008c
            java.lang.String r2 = "WIFI"
            goto L_0x0097
        L_0x008c:
            int r2 = r2.getType()     // Catch:{ Throwable -> 0x00c2 }
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "MOBILE"
            goto L_0x0097
        L_0x0095:
            java.lang.String r2 = "unknown"
        L_0x0097:
            r0 = r2
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch:{ Throwable -> 0x00c2 }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ Throwable -> 0x00c2 }
            java.lang.String r2 = r10.getSimOperatorName()     // Catch:{ Throwable -> 0x00c2 }
            java.lang.String r3 = r10.getNetworkOperatorName()     // Catch:{ Throwable -> 0x00c0 }
            if (r3 == 0) goto L_0x00b4
            boolean r1 = r3.isEmpty()     // Catch:{ Throwable -> 0x00b1 }
            if (r1 == 0) goto L_0x00be
            goto L_0x00b4
        L_0x00b1:
            r10 = move-exception
            r1 = r3
            goto L_0x00c4
        L_0x00b4:
            r1 = 2
            int r10 = r10.getPhoneType()     // Catch:{ Throwable -> 0x00b1 }
            if (r1 != r10) goto L_0x00be
            java.lang.String r10 = "CDMA"
            goto L_0x00ca
        L_0x00be:
            r10 = r3
            goto L_0x00ca
        L_0x00c0:
            r10 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r10 = move-exception
            r2 = r1
        L_0x00c4:
            java.lang.String r3 = "Exception while collecting network info. "
            com.appsflyer.AFLogger.afErrorLog(r3, r10)
            r10 = r1
        L_0x00ca:
            com.appsflyer.g$b r1 = new com.appsflyer.g$b
            r1.<init>(r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C2515g.m7372(android.content.Context):com.appsflyer.g$b");
    }
}
