package com.p683ss.android.ugc.aweme.notice.repo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo */
public final class TutorialVideoInfo {
    @C17952c(mo34828a = "item_id")
    private final String awemeId;
    @C17952c(mo34828a = "button")
    private final String button;
    @C17952c(mo34828a = "content")
    private final String content;
    @C17952c(mo34828a = "title")
    private final String title;

    public static /* synthetic */ TutorialVideoInfo copy$default(TutorialVideoInfo tutorialVideoInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tutorialVideoInfo.awemeId;
        }
        if ((i & 2) != 0) {
            str2 = tutorialVideoInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = tutorialVideoInfo.content;
        }
        if ((i & 8) != 0) {
            str4 = tutorialVideoInfo.button;
        }
        return tutorialVideoInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.content;
    }

    public final String component4() {
        return this.button;
    }

    public final TutorialVideoInfo copy(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "awemeId");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, C42311c.f106865i);
        C52711k.m112240b(str4, "button");
        return new TutorialVideoInfo(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.button, (java.lang.Object) r3.button) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo r3 = (com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo) r3
            java.lang.String r0 = r2.awemeId
            java.lang.String r1 = r3.awemeId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.button
            java.lang.String r3 = r3.button
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo.equals(java.lang.Object):boolean");
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.awemeId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.button;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialVideoInfo(awemeId=");
        sb.append(this.awemeId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(")");
        return sb.toString();
    }

    public TutorialVideoInfo(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "awemeId");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, C42311c.f106865i);
        C52711k.m112240b(str4, "button");
        this.awemeId = str;
        this.title = str2;
        this.content = str3;
        this.button = str4;
    }
}
