package og;

import java.io.IOException;
import java.util.Locale;
import ya.dc;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final sg.h f22002a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f22003b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f22004c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22005d;

    static {
        char[] cArr = sg.h.f25275x;
        f22002a = dc.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f22003b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f22004c = new String[64];
        f22005d = new String[256];
        int i = 0;
        int i10 = 0;
        while (true) {
            String[] strArr = f22005d;
            if (i10 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i10)};
            byte[] bArr = jg.b.f19199a;
            strArr[i10] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i10++;
        }
        String[] strArr2 = f22004c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = a5.a.k(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f22004c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = a5.a.k(sb2, strArr3[i13], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f22004c;
            if (i < strArr4.length) {
                if (strArr4[i] == null) {
                    strArr4[i] = f22005d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z3, int i, int i10, byte b10, byte b11) {
        String format;
        String str;
        String str2;
        String str3;
        String[] strArr = f22003b;
        if (b10 < strArr.length) {
            format = strArr[b10];
        } else {
            Object[] objArr = {Byte.valueOf(b10)};
            byte[] bArr = jg.b.f19199a;
            format = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b11 == 0) {
            str = "";
        } else {
            String[] strArr2 = f22005d;
            if (b10 != 2 && b10 != 3) {
                if (b10 != 4 && b10 != 6) {
                    if (b10 != 7 && b10 != 8) {
                        String[] strArr3 = f22004c;
                        if (b11 < strArr3.length) {
                            str2 = strArr3[b11];
                        } else {
                            str2 = strArr2[b11];
                        }
                        if (b10 == 5 && (b11 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        } else if (b10 == 0 && (b11 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (b11 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[b11];
                }
            }
            str = strArr2[b11];
        }
        if (z3) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        Object[] objArr2 = {str3, Integer.valueOf(i), Integer.valueOf(i10), format, str};
        byte[] bArr2 = jg.b.f19199a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = jg.b.f19199a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = jg.b.f19199a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
