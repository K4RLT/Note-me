package sg;
import a.a;

import java.io.Serializable;
import java.util.Arrays;
import q.x;

/* loaded from: classes.dex */
public class h implements Serializable, Comparable {

    /* renamed from: x, reason: collision with root package name */
    public static final char[] f25275x = tg.a.f25759a;

    /* renamed from: y, reason: collision with root package name */
    public static final h f25276y = tg.a.f25760b;

    /* renamed from: u, reason: collision with root package name */
    public transient int f25277u;

    /* renamed from: v, reason: collision with root package name */
    public transient String f25278v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f25279w;

    public h(byte[] bArr) {
        this.f25279w = bArr;
    }

    public static final void a(String str) {
        char[] cArr = tg.a.f25759a;
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i10 = i * 2;
                bArr[i] = (byte) (tg.a(str.charAt(i10 + 1)) + (tg.a(str.charAt(i10)) << 4));
            }
            return;
        }
        x.j("Unexpected hex string: ".concat(str));
    }

    public int b() {
        char[] cArr = tg.a.f25759a;
        return this.f25279w.length;
    }

    public String c() {
        char[] cArr = tg.a.f25759a;
        byte[] bArr = this.f25279w;
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b10 : bArr) {
            int i10 = i + 1;
            char[] cArr3 = f25275x;
            cArr2[i] = cArr3[(b10 >> 4) & 15];
            i += 2;
            cArr2[i10] = cArr3[b10 & 15];
        }
        return new String(cArr2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        int b10 = b();
        int b11 = hVar.b();
        int min = Math.min(b10, b11);
        for (int i = 0; i < min; i++) {
            int e = e(i) & 255;
            int e8 = hVar.e(i) & 255;
            if (e != e8) {
                if (e < e8) {
                    return -1;
                }
                return 1;
            }
        }
        if (b10 == b11) {
            return 0;
        }
        if (b10 < b11) {
            return -1;
        }
        return 1;
    }

    public byte[] d() {
        char[] cArr = tg.a.f25759a;
        return this.f25279w;
    }

    public byte e(int i) {
        char[] cArr = tg.a.f25759a;
        return this.f25279w[i];
    }

    public boolean equals(Object obj) {
        char[] cArr = tg.a.f25759a;
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                int b10 = hVar.b();
                byte[] bArr = this.f25279w;
                if (b10 == bArr.length && hVar.f(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean f(int i, int i10, int i11, byte[] bArr) {
        bArr.getClass();
        char[] cArr = tg.a.f25759a;
        if (i >= 0) {
            byte[] bArr2 = this.f25279w;
            if (i <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (bArr2[i12 + i] == bArr[i12 + i10]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean g(h hVar, int i) {
        hVar.getClass();
        return hVar.f(0, 0, i, this.f25279w);
    }

    public h h() {
        byte b10;
        char[] cArr = tg.a.f25759a;
        int i = 0;
        while (true) {
            byte[] bArr = this.f25279w;
            if (i < bArr.length) {
                byte b11 = bArr[i];
                byte b12 = (byte) 65;
                if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b11 + 32);
                    for (int i10 = i + 1; i10 < copyOf.length; i10++) {
                        byte b13 = copyOf[i10];
                        if (b13 >= b12 && b13 <= b10) {
                            copyOf[i10] = (byte) (b13 + 32);
                        }
                    }
                    return new h(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public int hashCode() {
        char[] cArr = tg.a.f25759a;
        int i = this.f25277u;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f25279w);
        this.f25277u = hashCode;
        return hashCode;
    }

    public String i() {
        char[] cArr = tg.a.f25759a;
        String str = this.f25278v;
        if (str == null) {
            String str2 = new String(this.f25279w, mf.a.f20798a);
            this.f25278v = str2;
            return str2;
        }
        return str;
    }

    public void j(f fVar) {
        byte[] bArr = this.f25279w;
        fVar.m228write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x007d, code lost:
    
        if (57343 >= r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0080, code lost:
    
        if (r9 < r13) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.h.toString():java.lang.String");
    }
}
