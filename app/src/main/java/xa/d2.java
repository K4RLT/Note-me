package xa;

import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f30405a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x005c, B:20:0x006c, B:21:0x006e, B:23:0x007a, B:24:0x007d, B:26:0x0083, B:30:0x008d, B:35:0x009d, B:37:0x00a5, B:38:0x00a9, B:40:0x00af, B:44:0x00bc, B:48:0x00c7, B:53:0x00f2, B:55:0x00f8, B:59:0x01a9, B:64:0x010a, B:65:0x0125, B:66:0x0126, B:68:0x0131, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x01db, B:82:0x01e2, B:83:0x00d7, B:84:0x00da, B:87:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x005c, B:20:0x006c, B:21:0x006e, B:23:0x007a, B:24:0x007d, B:26:0x0083, B:30:0x008d, B:35:0x009d, B:37:0x00a5, B:38:0x00a9, B:40:0x00af, B:44:0x00bc, B:48:0x00c7, B:53:0x00f2, B:55:0x00f8, B:59:0x01a9, B:64:0x010a, B:65:0x0125, B:66:0x0126, B:68:0x0131, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x01db, B:82:0x01e2, B:83:0x00d7, B:84:0x00da, B:87:0x00c3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.d2.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int b(String str, int i, int i10) {
        int i11;
        int i12;
        if (i >= 0 && i10 <= str.length() && i <= i10) {
            if (i < i10) {
                i12 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i11 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i10)));
                }
            } else {
                i11 = 0;
                i12 = i;
            }
            while (i12 < i10) {
                int i13 = i12 + 1;
                int digit2 = Character.digit(str.charAt(i12), 10);
                if (digit2 >= 0) {
                    i11 = (i11 * 10) - digit2;
                    i12 = i13;
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i10)));
                }
            }
            return -i11;
        }
        throw new NumberFormatException(str);
    }

    public static boolean c(String str, int i, char c10) {
        if (i < str.length() && str.charAt(i) == c10) {
            return true;
        }
        return false;
    }
}
