package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ft */
public final class C7964ft implements C2888b<C7850bs> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7850bs bsVar = new C7850bs();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bsVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bsVar.f21690a = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        bsVar.f21691b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        bsVar.f21692c = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bsVar.f21693d = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        bsVar.f21694e = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        bsVar.f21695f = C2896h.m8231b(gVar);
                        break;
                    case 8:
                        bsVar.f21696g = C2896h.m8231b(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bsVar;
            }
        }
    }
}
