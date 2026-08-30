package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a2 implements e6 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4313u;

    /* renamed from: v, reason: collision with root package name */
    public int f4314v;

    /* renamed from: w, reason: collision with root package name */
    public int f4315w;

    /* renamed from: x, reason: collision with root package name */
    public int f4316x;

    /* renamed from: y, reason: collision with root package name */
    public int f4317y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4318z;

    public a2(m2.g gVar, long j10) {
        this.f4313u = 4;
        String str = gVar.f20477v;
        l3 l3Var = new l3(8, (byte) 0);
        l3Var.e = str;
        l3Var.f7925b = -1;
        l3Var.f7926c = -1;
        this.f4318z = l3Var;
        this.f4314v = m2.p0.e(j10);
        this.f4315w = m2.p0.d(j10);
        this.f4316x = -1;
        this.f4317y = -1;
        int e = m2.p0.e(j10);
        int d2 = m2.p0.d(j10);
        if (e >= 0 && e <= str.length()) {
            if (d2 >= 0 && d2 <= str.length()) {
                if (e <= d2) {
                    return;
                }
                q.x.n(w7.i1.c("Do not set reversed range: ", e, d2, " > "));
                throw null;
            }
            l4.a.d(str.length(), g3.a.m("end (", d2, ") offset is outside of text region "));
            throw null;
        }
        l4.a.d(str.length(), g3.a.m("start (", e, ") offset is outside of text region "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
    
        if (r4.h(1) > 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01aa, B:57:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:64:0x01df, B:66:0x01e5, B:68:0x01ea, B:69:0x01ed, B:72:0x01f8, B:73:0x01ff, B:76:0x0206, B:78:0x020c, B:80:0x0218, B:87:0x023c, B:90:0x0247, B:95:0x0238, B:100:0x01d9), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218 A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0083, B:18:0x00c9, B:20:0x00d7, B:22:0x00e5, B:24:0x010d, B:26:0x0113, B:28:0x0124, B:30:0x012d, B:32:0x0135, B:34:0x0146, B:36:0x0153, B:38:0x0164, B:40:0x016a, B:42:0x017b, B:44:0x0181, B:46:0x0192, B:48:0x019a, B:50:0x01a4, B:52:0x01a7, B:55:0x01aa, B:57:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:64:0x01df, B:66:0x01e5, B:68:0x01ea, B:69:0x01ed, B:72:0x01f8, B:73:0x01ff, B:76:0x0206, B:78:0x020c, B:80:0x0218, B:87:0x023c, B:90:0x0247, B:95:0x0238, B:100:0x01d9), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.a2 j(byte[] r21) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a2.j(byte[]):com.google.android.gms.internal.ads.a2");
    }

    public void a(int i, int i10) {
        long b10 = m2.g0.b(i, i10);
        ((l3) this.f4318z).n("", i, i10);
        long a10 = ya.db.a(m2.g0.b(this.f4314v, this.f4315w), b10);
        i(m2.p0.e(a10));
        h(m2.p0.d(a10));
        int i11 = this.f4316x;
        if (i11 != -1) {
            long a11 = ya.db.a(m2.g0.b(i11, this.f4317y), b10);
            if (m2.p0.b(a11)) {
                this.f4316x = -1;
                this.f4317y = -1;
            } else {
                this.f4316x = m2.p0.e(a11);
                this.f4317y = m2.p0.d(a11);
            }
        }
    }

    public char b(int i) {
        l3 l3Var = (l3) this.f4318z;
        androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) l3Var.f7927d;
        if (iVar == null) {
            return ((String) l3Var.e).charAt(i);
        }
        if (i < l3Var.f7925b) {
            return ((String) l3Var.e).charAt(i);
        }
        int a10 = iVar.f734v - iVar.a();
        int i10 = l3Var.f7925b;
        if (i < a10 + i10) {
            int i11 = i - i10;
            int i12 = iVar.f735w;
            char[] cArr = (char[]) iVar.f737y;
            if (i11 < i12) {
                return cArr[i11];
            }
            return cArr[(i11 - i12) + iVar.f736x];
        }
        return ((String) l3Var.e).charAt(i - ((a10 - l3Var.f7926c) + i10));
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int c() {
        xk0 xk0Var = (xk0) this.f4318z;
        int i = this.f4315w;
        if (i == 8) {
            return xk0Var.K();
        }
        if (i == 16) {
            return xk0Var.L();
        }
        int i10 = this.f4316x;
        this.f4316x = i10 + 1;
        if (i10 % 2 == 0) {
            int K = xk0Var.K();
            this.f4317y = K;
            return (K & 240) >> 4;
        }
        return this.f4317y & 15;
    }

    public m2.p0 d() {
        int i = this.f4316x;
        if (i != -1) {
            return new m2.p0(m2.g0.b(i, this.f4317y));
        }
        return null;
    }

    public void e(String str, int i, int i10) {
        l3 l3Var = (l3) this.f4318z;
        if (i >= 0 && i <= l3Var.c()) {
            if (i10 >= 0 && i10 <= l3Var.c()) {
                if (i <= i10) {
                    l3Var.n(str, i, i10);
                    i(str.length() + i);
                    h(str.length() + i);
                    this.f4316x = -1;
                    this.f4317y = -1;
                    return;
                }
                q.x.n(w7.i1.c("Do not set reversed range: ", i, i10, " > "));
                return;
            }
            l4.a.d(l3Var.c(), g3.a.m("end (", i10, ") offset is outside of text region "));
            return;
        }
        l4.a.d(l3Var.c(), g3.a.m("start (", i, ") offset is outside of text region "));
    }

    public void f(int i, int i10) {
        l3 l3Var = (l3) this.f4318z;
        if (i >= 0 && i <= l3Var.c()) {
            if (i10 >= 0 && i10 <= l3Var.c()) {
                if (i < i10) {
                    this.f4316x = i;
                    this.f4317y = i10;
                    return;
                } else {
                    q.x.n(w7.i1.c("Do not set reversed or empty range: ", i, i10, " > "));
                    return;
                }
            }
            l4.a.d(l3Var.c(), g3.a.m("end (", i10, ") offset is outside of text region "));
            return;
        }
        l4.a.d(l3Var.c(), g3.a.m("start (", i, ") offset is outside of text region "));
    }

    public void g(int i, int i10) {
        l3 l3Var = (l3) this.f4318z;
        if (i >= 0 && i <= l3Var.c()) {
            if (i10 >= 0 && i10 <= l3Var.c()) {
                if (i <= i10) {
                    i(i);
                    h(i10);
                    return;
                } else {
                    q.x.n(w7.i1.c("Do not set reversed range: ", i, i10, " > "));
                    return;
                }
            }
            l4.a.d(l3Var.c(), g3.a.m("end (", i10, ") offset is outside of text region "));
            return;
        }
        l4.a.d(l3Var.c(), g3.a.m("start (", i, ") offset is outside of text region "));
    }

    public void h(int i) {
        boolean z3;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            s2.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f4315w = i;
    }

    public void i(int i) {
        boolean z3;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            s2.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f4314v = i;
    }

    public void k() {
        int i = 1;
        int i10 = this.f4317y + 1;
        this.f4317y = i10;
        if (i10 == 8) {
            this.f4317y = 0;
            int i11 = this.f4316x;
            if (true == s(i11 + 1)) {
                i = 2;
            }
            this.f4316x = i11 + i;
        }
        t();
    }

    public long l() {
        int i = this.f4316x;
        if (i != 0) {
            long[] jArr = (long[]) this.f4318z;
            int i10 = this.f4314v;
            long j10 = jArr[i10];
            this.f4314v = this.f4317y & (i10 + 1);
            this.f4316x = i - 1;
            return j10;
        }
        l4.a.c();
        return 0L;
    }

    public void m(int i) {
        int i10 = this.f4316x;
        int i11 = i / 8;
        int i12 = i10 + i11;
        this.f4316x = i12;
        int i13 = (i - (i11 * 8)) + this.f4317y;
        this.f4317y = i13;
        if (i13 > 7) {
            this.f4316x = i12 + 1;
            this.f4317y = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.f4316x) {
                if (s(i10)) {
                    this.f4316x++;
                    i10 += 2;
                }
            } else {
                t();
                return;
            }
        }
    }

    public boolean n(int i) {
        int i10 = this.f4314v;
        int i11 = this.f4316x;
        int i12 = i / 8;
        int i13 = i11 + i12;
        int i14 = (this.f4317y + i) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 > i10) {
                break;
            }
            if (s(i11)) {
                i13++;
                i11 += 2;
            }
        }
        if (i13 < i10) {
            return true;
        }
        if (i13 == i10 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean o() {
        int i = ((byte[]) this.f4318z)[this.f4316x] & (128 >> this.f4317y);
        k();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public int p(int i) {
        int i10;
        int i11;
        byte[] bArr = (byte[]) this.f4318z;
        this.f4317y += i;
        int i12 = 0;
        while (true) {
            i10 = this.f4317y;
            i11 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.f4317y = i13;
            int i14 = this.f4316x;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != s(i14 + 1)) {
                i11 = 1;
            }
            this.f4316x = i14 + i11;
        }
        int i15 = this.f4316x;
        int i16 = ((bArr[i15] & 255) >> (8 - i10)) | i12;
        int i17 = 32 - i;
        if (i10 == 8) {
            this.f4317y = 0;
            if (true != s(i15 + 1)) {
                i11 = 1;
            }
            this.f4316x = i15 + i11;
        }
        int i18 = ((-1) >>> i17) & i16;
        t();
        return i18;
    }

    public int q() {
        int r8 = r();
        int i = r8 % 2;
        int i10 = 1;
        int i11 = r8 + 1;
        if (i == 0) {
            i10 = -1;
        }
        return (i11 / 2) * i10;
    }

    public int r() {
        int i = 0;
        int i10 = 0;
        while (!o()) {
            i10++;
        }
        int i11 = 1 << i10;
        if (i10 > 0) {
            i = p(i10);
        }
        return (i11 - 1) + i;
    }

    public boolean s(int i) {
        int i10 = i - 2;
        if (this.f4315w <= i10 && i < this.f4314v) {
            byte[] bArr = (byte[]) this.f4318z;
            if (bArr[i] == 3 && bArr[i10] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void t() {
        int i;
        int i10 = this.f4316x;
        boolean z3 = false;
        if (i10 >= 0 && (i10 < (i = this.f4314v) || (i10 == i && this.f4317y == 0))) {
            z3 = true;
        }
        b80.K(z3);
    }

    public String toString() {
        switch (this.f4313u) {
            case 4:
                return ((l3) this.f4318z).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zza() {
        return this.f4314v;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzb() {
        return -1;
    }

    public a2(int i, String str, int i10, int i11, int i12) {
        this.f4313u = 0;
        this.f4314v = i;
        this.f4318z = str;
        this.f4315w = i10;
        this.f4316x = i11;
        this.f4317y = i12;
    }

    public a2(zv0 zv0Var) {
        this.f4313u = 1;
        xk0 xk0Var = zv0Var.f13276c;
        this.f4318z = xk0Var;
        xk0Var.E(12);
        this.f4315w = xk0Var.h() & 255;
        this.f4314v = xk0Var.h();
    }

    public a2(byte[] bArr, int i, int i10) {
        this.f4313u = 3;
        this.f4318z = bArr;
        this.f4315w = i;
        this.f4316x = i;
        this.f4314v = i10;
        this.f4317y = 0;
        t();
    }
}
