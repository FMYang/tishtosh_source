package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationState */
public final class DiscoverV4NavigationState implements C11932s {
    private final C11787a<DiscoverV4CategoryResponse> categoryResp;

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse>, for r1v0, types: [com.bytedance.jedi.arch.a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState copy$default(com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState r0, com.bytedance.jedi.arch.C11787a<com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse> r1 = r0.categoryResp
        L_0x0006:
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState.copy$default(com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationState, com.bytedance.jedi.arch.a, int, java.lang.Object):com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationState");
    }

    public final C11787a<DiscoverV4CategoryResponse> component1() {
        return this.categoryResp;
    }

    public final DiscoverV4NavigationState copy(C11787a<DiscoverV4CategoryResponse> aVar) {
        C52711k.m112240b(aVar, "categoryResp");
        return new DiscoverV4NavigationState(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.categoryResp, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState) r2).categoryResp) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationState r2 = (com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState) r2
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse> r0 = r1.categoryResp
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse> r2 = r2.categoryResp
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NavigationState.equals(java.lang.Object):boolean");
    }

    public final C11787a<DiscoverV4CategoryResponse> getCategoryResp() {
        return this.categoryResp;
    }

    public final int hashCode() {
        C11787a<DiscoverV4CategoryResponse> aVar = this.categoryResp;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4NavigationState(categoryResp=");
        sb.append(this.categoryResp);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4NavigationState(C11787a<DiscoverV4CategoryResponse> aVar) {
        C52711k.m112240b(aVar, "categoryResp");
        this.categoryResp = aVar;
    }
}
