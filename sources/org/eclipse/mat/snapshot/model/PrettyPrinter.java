package org.eclipse.mat.snapshot.model;

import com.C2240a;
import org.eclipse.mat.SnapshotException;

public final class PrettyPrinter {
    private PrettyPrinter() {
    }

    public static String objectAsString(IObject iObject, int i) throws SnapshotException {
        Integer num = (Integer) iObject.resolveValue("count");
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            return "";
        }
        IPrimitiveArray iPrimitiveArray = (IPrimitiveArray) iObject.resolveValue("value");
        if (iPrimitiveArray == null) {
            return null;
        }
        Integer num2 = (Integer) iObject.resolveValue("offset");
        if (num2 == null) {
            return null;
        }
        return arrayAsString(iPrimitiveArray, num2.intValue(), num.intValue(), i);
    }

    public static String arrayAsString(IPrimitiveArray iPrimitiveArray, int i, int i2, int i3) {
        int i4;
        char[] cArr;
        if (iPrimitiveArray.getType() != 5) {
            return null;
        }
        int length = iPrimitiveArray.getLength();
        if (i2 <= i3) {
            i4 = i2;
        } else {
            i4 = i3;
        }
        int i5 = length - i;
        if (i4 > i5) {
            i4 = i5;
        }
        if (i == 0 && length == i4) {
            cArr = (char[]) iPrimitiveArray.getValueArray();
        } else {
            cArr = (char[]) iPrimitiveArray.getValueArray(i, i4);
        }
        if (cArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(cArr.length);
        for (char c : cArr) {
            if (c < ' ' || c >= 127) {
                sb.append("\\u");
                sb.append(C2240a.m6772a("%04x", new Object[]{Integer.valueOf(c & 65535)}));
            } else {
                sb.append(c);
            }
        }
        if (i3 < i2) {
            sb.append("...");
        }
        return sb.toString();
    }
}
