package com.p683ss.android.ugc.aweme.protection.antiaddiction.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme */
public final class TiktokRelieveAweme extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "aweme_id")
    private final String awemeId;

    public static /* synthetic */ TiktokRelieveAweme copy$default(TiktokRelieveAweme tiktokRelieveAweme, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tiktokRelieveAweme.awemeId;
        }
        return tiktokRelieveAweme.copy(str);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final TiktokRelieveAweme copy(String str) {
        C52711k.m112240b(str, "awemeId");
        return new TiktokRelieveAweme(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.awemeId, (java.lang.Object) ((com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme) r2).awemeId) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme r2 = (com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme) r2
            java.lang.String r0 = r1.awemeId
            java.lang.String r2 = r2.awemeId
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme.equals(java.lang.Object):boolean");
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int hashCode() {
        String str = this.awemeId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TiktokRelieveAweme(awemeId=");
        sb.append(this.awemeId);
        sb.append(")");
        return sb.toString();
    }

    public TiktokRelieveAweme(String str) {
        C52711k.m112240b(str, "awemeId");
        this.awemeId = str;
    }
}
