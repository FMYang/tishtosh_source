package p2628d.p2650m;

import p2628d.p2647j.C52751c;

/* renamed from: d.m.b */
public class C52806b {
    /* renamed from: a */
    public static final boolean m112364a(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m112363a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C52751c(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final int m112362a(char c, int i) {
        return Character.digit(c, i);
    }
}
