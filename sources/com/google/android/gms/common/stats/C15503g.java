package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.g */
public final class C15503g implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 6:
                    list = C15467a.m32170u(parcel2, a);
                    break;
                case 8:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 10:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 11:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 12:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 13:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 14:
                    i4 = C15467a.m32154e(parcel2, a);
                    break;
                case 15:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 16:
                    j3 = C15467a.m32156g(parcel2, a);
                    break;
                case 17:
                    str5 = C15467a.m32163n(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        WakeLockEvent wakeLockEvent = new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
        return wakeLockEvent;
    }
}
