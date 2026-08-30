package ya;
import a5.a;
import mf.c;

/* loaded from: classes.dex */
public abstract class g9 {
    public static final void a(long j10, byte[] bArr, int i, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = c.f20805a[(int) ((j10 >> (i12 << 3)) & 255)];
            int i15 = i + 1;
            bArr[i] = (byte) (i14 >> 8);
            i += 2;
            bArr[i15] = (byte) i14;
            if (i12 != i13) {
                i12--;
            } else {
                return;
            }
        }
    }

    public static final void b(String str, int i, String str2) {
        StringBuilder m4 = a.m("Expected ", str2, " at index ", i, ", but was '");
        m4.append(str.charAt(i));
        m4.append('\'');
        throw new IllegalArgumentException(m4.toString());
    }
}
