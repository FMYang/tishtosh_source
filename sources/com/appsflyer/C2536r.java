package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;

/* renamed from: com.appsflyer.r */
final class C2536r {
    C2536r() {
    }

    /* renamed from: ˋ */
    private static String m7420(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte valueOf : bArr) {
            formatter.format("%02x", new Object[]{Byte.valueOf(valueOf)});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    /* renamed from: ˏ */
    public static String m7421(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m7420(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ॱ */
    public static String m7422(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m7420(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ˊ */
    public static String m7419(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }
}
