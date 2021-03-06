package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C16959h implements Creator<CircleOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        LatLng latLng = null;
        List list = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    latLng = (LatLng) C15467a.m32145a(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    d = C15467a.m32161l(parcel2, a);
                    break;
                case 4:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 5:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 6:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 7:
                    f2 = C15467a.m32159j(parcel2, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 10:
                    list = C15467a.m32151c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        CircleOptions circleOptions = new CircleOptions(latLng, d, f, i, i2, f2, z, z2, list);
        return circleOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
