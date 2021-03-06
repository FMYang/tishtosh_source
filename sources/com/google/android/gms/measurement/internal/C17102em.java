package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15514e;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.em */
public final class C17102em extends C17029bv {

    /* renamed from: b */
    private static final String[] f48277b = {"firebase_", "google_", "ga_"};

    /* renamed from: a */
    Integer f48278a;

    /* renamed from: c */
    private SecureRandom f48279c;

    /* renamed from: d */
    private final AtomicLong f48280d = new AtomicLong(0);

    /* renamed from: e */
    private int f48281e;

    C17102em(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32871d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo32872e() {
        mo32840c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo32854q().f48448e.mo33376a("Utils falling back to Random for random id");
            }
        }
        this.f48280d.set(nextLong);
    }

    /* renamed from: f */
    public final long mo33153f() {
        long andIncrement;
        long j;
        if (this.f48280d.get() == 0) {
            synchronized (this.f48280d) {
                long nextLong = new Random(System.nanoTime() ^ mo32849l().mo28523a()).nextLong();
                int i = this.f48281e + 1;
                this.f48281e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f48280d) {
            this.f48280d.compareAndSet(-1, 1);
            andIncrement = this.f48280d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final SecureRandom mo33155g() {
        mo32840c();
        if (this.f48279c == null) {
            this.f48279c = new SecureRandom();
        }
        return this.f48279c;
    }

    /* renamed from: a */
    static boolean m41662a(String str) {
        C15464q.m32125a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo33137a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(C42311c.f106865i, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo32854q().f48448e.mo33377a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33146a(String str, String str2) {
        if (str2 == null) {
            mo32854q().f48445b.mo33377a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo32854q().f48445b.mo33377a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo32854q().f48445b.mo33378a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo32854q().f48445b.mo33378a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m41672d(String str, String str2) {
        if (str2 == null) {
            mo32854q().f48445b.mo33377a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo32854q().f48445b.mo33377a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo32854q().f48445b.mo33378a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo32854q().f48445b.mo33378a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33147a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo32854q().f48445b.mo33377a("Name is required and can't be null. Type", str);
            return false;
        }
        C15464q.m32123a(str2);
        String[] strArr2 = f48277b;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo32854q().f48445b.mo33378a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C15464q.m32123a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m41671c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo32854q().f48445b.mo33378a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33145a(String str, int i, String str2) {
        if (str2 == null) {
            mo32854q().f48445b.mo33377a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo32854q().f48445b.mo33379a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo33148b(String str) {
        if (!m41672d("event", str)) {
            return 2;
        }
        if (!mo33147a("event", C17031bx.f48054a, str)) {
            return 13;
        }
        if (!mo33145a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo33151c(String str) {
        if (!m41672d("user property", str)) {
            return 6;
        }
        if (!mo33147a("user property", C17033bz.f48058a, str)) {
            return 15;
        }
        if (!mo33145a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m41663a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            mo32854q().f48448e.mo33379a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            if ((obj instanceof Parcelable[]) && z) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        mo32854q().f48448e.mo33378a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo32854q().f48448e.mo33378a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo33150b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m41674g(str)) {
                if (this.f48052r.mo32929h()) {
                    mo32854q().f48445b.mo33377a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C17133r.m41997a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f48052r.mo32929h()) {
                mo32854q().f48445b.mo33376a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m41674g(str2)) {
            mo32854q().f48445b.mo33377a("Invalid admob_app_id. Analytics disabled.", C17133r.m41997a(str2));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m41664a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: g */
    private static boolean m41674g(String str) {
        C15464q.m32123a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: a */
    private static Object m41656a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m41658a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m41658a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    static Object m41657a(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = UnReadVideoExperiment.BROWSE_RECORD_LIST;
        if (equals) {
            return m41656a((int) UnReadVideoExperiment.BROWSE_RECORD_LIST, obj, true);
        }
        if (!m41673e(str)) {
            i = 100;
        }
        return m41656a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m41666a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo33145a("event param", 40, r14) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (mo33145a("event param", 40, r14) == false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo33139a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r6 = r17
            r7 = r20
            r8 = r21
            r9 = 0
            if (r7 == 0) goto L_0x0172
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r20.keySet()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r13 = 0
        L_0x0018:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0033
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0075
        L_0x0033:
            r1 = 14
            if (r22 == 0) goto L_0x0055
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo33146a(r2, r14)
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r2 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo33147a(r2, r9, r14)
            if (r2 != 0) goto L_0x004c
            r2 = 14
            goto L_0x0056
        L_0x004c:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo33145a(r2, r15, r14)
            if (r2 != 0) goto L_0x0055
            goto L_0x003f
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "event param"
            boolean r2 = r6.m41672d(r2, r14)
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            r1 = 3
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo33147a(r2, r9, r14)
            if (r2 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "event param"
            boolean r1 = r6.mo33145a(r1, r15, r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0060
        L_0x0074:
            r1 = r2
        L_0x0075:
            r5 = 1
            if (r1 == 0) goto L_0x0091
            boolean r2 = m41661a(r10, r1)
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = m41658a(r14, r15, r5)
            java.lang.String r3 = "_ev"
            r10.putString(r3, r2)
            if (r1 != r0) goto L_0x008c
            m41659a(r10, r14)
        L_0x008c:
            r10.remove(r14)
            goto L_0x012d
        L_0x0091:
            java.lang.Object r4 = r7.get(r14)
            r17.mo32840c()
            if (r23 == 0) goto L_0x00cc
            java.lang.String r0 = "param"
            boolean r1 = r4 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00a5
            r1 = r4
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            int r1 = r1.length
            goto L_0x00b0
        L_0x00a5:
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00c5
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        L_0x00b0:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L_0x00c5
            com.google.android.gms.measurement.internal.r r2 = r17.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48448e
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo33379a(r3, r0, r14, r1)
            r0 = 0
            goto L_0x00c6
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            if (r0 != 0) goto L_0x00cc
            r0 = 17
            r9 = 1
            goto L_0x010a
        L_0x00cc:
            com.google.android.gms.measurement.internal.eu r0 = r17.mo32856s()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C17122h.f48361Y
            r3 = r18
            boolean r0 = r0.mo33278c(r3, r1)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = m41673e(r19)
            if (r0 != 0) goto L_0x00e6
        L_0x00e0:
            boolean r0 = m41673e(r14)
            if (r0 == 0) goto L_0x00f7
        L_0x00e6:
            java.lang.String r1 = "param"
            r16 = 256(0x100, float:3.59E-43)
            r0 = r17
            r2 = r14
            r3 = r16
            r9 = 1
            r5 = r23
            boolean r0 = r0.m41663a(r1, r2, r3, r4, r5)
            goto L_0x0105
        L_0x00f7:
            r9 = 1
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r17
            r2 = r14
            r5 = r23
            boolean r0 = r0.m41663a(r1, r2, r3, r4, r5)
        L_0x0105:
            if (r0 == 0) goto L_0x0109
            r0 = 0
            goto L_0x010a
        L_0x0109:
            r0 = 4
        L_0x010a:
            if (r0 == 0) goto L_0x0130
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0130
            boolean r0 = m41661a(r10, r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = m41658a(r14, r15, r9)
            java.lang.String r1 = "_ev"
            r10.putString(r1, r0)
            java.lang.Object r0 = r7.get(r14)
            m41659a(r10, r0)
        L_0x012a:
            r10.remove(r14)
        L_0x012d:
            r9 = 0
            goto L_0x0018
        L_0x0130:
            boolean r0 = m41662a(r14)
            if (r0 == 0) goto L_0x016f
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x016f
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.r r1 = r17.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            com.google.android.gms.measurement.internal.p r2 = r17.mo32851n()
            r3 = r19
            java.lang.String r2 = r2.mo33369a(r3)
            com.google.android.gms.measurement.internal.p r4 = r17.mo32851n()
            java.lang.String r4 = r4.mo33366a(r7)
            r1.mo33378a(r0, r2, r4)
            r0 = 5
            m41661a(r10, r0)
            r10.remove(r14)
            goto L_0x012d
        L_0x016f:
            r3 = r19
            goto L_0x012d
        L_0x0172:
            r10 = 0
        L_0x0173:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17102em.mo33139a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m41661a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m41659a(Bundle bundle, Object obj) {
        C15464q.m32123a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: h */
    private static int m41675h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return UnReadVideoExperiment.BROWSE_RECORD_LIST;
        }
        return 36;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo33149b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m41663a("user property referrer", str, m41675h(str), obj, false);
        } else {
            z = m41663a("user property", str, m41675h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* renamed from: c */
    static Object m41669c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m41656a(m41675h(str), obj, true);
        }
        return m41656a(m41675h(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33143a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo32854q().f48450g.mo33378a("Not putting event parameter. Invalid value type. name, type", mo32851n().mo33370b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo33141a(int i, String str, String str2, int i2) {
        mo33144a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33144a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m41661a(bundle, i);
        if (mo32856s().mo33280d(str, C17122h.f48386av)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f48052r.mo32925d().mo32991a("auto", "_err", bundle);
    }

    /* renamed from: h */
    static MessageDigest m41676h() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static long m41655a(byte[] bArr) {
        C15464q.m32123a(bArr);
        int i = 0;
        C15464q.m32129a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m41660a(Context context, boolean z) {
        C15464q.m32123a(context);
        if (VERSION.SDK_INT >= 24) {
            return m41668b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m41668b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: b */
    private static boolean m41668b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo33152d(String str) {
        mo32840c();
        if (C15377d.m31951a(mo32850m()).mo28316a(str) == 0) {
            return true;
        }
        mo32854q().f48452i.mo33377a("Permission not granted", str);
        return false;
    }

    /* renamed from: e */
    static boolean m41673e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: c */
    public static boolean m41671c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo33154f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo32856s().mo33289j().equals(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo33138a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = m41657a(str, bundle.get(str));
                if (a == null) {
                    mo32854q().f48448e.mo33377a("Param value can't be null", mo32851n().mo33370b(str));
                } else {
                    mo33143a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzag mo33140a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo33148b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            zzag zzag = new zzag(str2, new zzad(mo33138a(mo33139a(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j);
            return zzag;
        }
        mo32854q().f48445b.mo33377a("Invalid conditional property event name", mo32851n().mo33371c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo33136a(Context context, String str) {
        mo32840c();
        C15464q.m32123a(context);
        C15464q.m32125a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = m41676h();
        if (h == null) {
            mo32854q().f48445b.mo33376a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m41670c(context, str)) {
                    PackageInfo b = C15377d.m31951a(context).mo28321b(mo32850m().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m41655a(h.digest(b.signatures[0].toByteArray()));
                    }
                    mo32854q().f48448e.mo33376a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo32854q().f48445b.mo33377a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: c */
    private final boolean m41670c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C15377d.m31951a(context).mo28321b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo32854q().f48445b.mo33377a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo32854q().f48445b.mo33377a("Package name not found", e2);
        }
        return true;
    }

    /* renamed from: a */
    static byte[] m41665a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m41667b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public static long m41654a(long j, long j2) {
        return (j + (j2 * 60000)) / FbUploadTokenTime.group0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final String mo33156i() {
        byte[] bArr = new byte[16];
        mo33155g().nextBytes(bArr);
        return C2240a.m6773a(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33142a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo32854q().f48448e.mo33377a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
