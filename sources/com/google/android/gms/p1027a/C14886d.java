package com.google.android.gms.p1027a;

import android.os.IBinder;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.a.d */
public final class C14886d<T> extends C14883a {

    /* renamed from: a */
    private final T f38416a;

    private C14886d(T t) {
        this.f38416a = t;
    }

    /* renamed from: a */
    public static <T> C14882b m30544a(T t) {
        return new C14886d(t);
    }

    /* renamed from: a */
    public static <T> T m30545a(C14882b bVar) {
        if (bVar instanceof C14886d) {
            return ((C14886d) bVar).f38416a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
