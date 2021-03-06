package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState */
public final class CutVideoState implements C11932s {
    private final C49561h nextEvent;
    private final C49561h quitEvent;

    public CutVideoState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoState copy$default(CutVideoState cutVideoState, C49561h hVar, C49561h hVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = cutVideoState.quitEvent;
        }
        if ((i & 2) != 0) {
            hVar2 = cutVideoState.nextEvent;
        }
        return cutVideoState.copy(hVar, hVar2);
    }

    public final C49561h component1() {
        return this.quitEvent;
    }

    public final C49561h component2() {
        return this.nextEvent;
    }

    public final CutVideoState copy(C49561h hVar, C49561h hVar2) {
        return new CutVideoState(hVar, hVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.nextEvent, (java.lang.Object) r3.nextEvent) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState) r3
            com.ss.android.ugc.gamora.jedi.h r0 = r2.quitEvent
            com.ss.android.ugc.gamora.jedi.h r1 = r3.quitEvent
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.jedi.h r0 = r2.nextEvent
            com.ss.android.ugc.gamora.jedi.h r3 = r3.nextEvent
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState.equals(java.lang.Object):boolean");
    }

    public final C49561h getNextEvent() {
        return this.nextEvent;
    }

    public final C49561h getQuitEvent() {
        return this.quitEvent;
    }

    public final int hashCode() {
        C49561h hVar = this.quitEvent;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C49561h hVar2 = this.nextEvent;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoState(quitEvent=");
        sb.append(this.quitEvent);
        sb.append(", nextEvent=");
        sb.append(this.nextEvent);
        sb.append(")");
        return sb.toString();
    }

    public CutVideoState(C49561h hVar, C49561h hVar2) {
        this.quitEvent = hVar;
        this.nextEvent = hVar2;
    }

    public /* synthetic */ CutVideoState(C49561h hVar, C49561h hVar2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        if ((i & 2) != 0) {
            hVar2 = null;
        }
        this(hVar, hVar2);
    }
}
