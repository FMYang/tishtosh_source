package com.p683ss.android.push.daemon;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.push.daemon.g */
public interface C19640g extends IInterface {

    /* renamed from: com.ss.android.push.daemon.g$a */
    public static abstract class C19641a extends Binder implements C19640g {
        public IBinder asBinder() {
            return this;
        }

        public C19641a() {
            attachInterface(this, "com.ss.android.push.daemon.IPushService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.push.daemon.IPushService";
            if (i == 1) {
                parcel.enforceInterface(str);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }
}
