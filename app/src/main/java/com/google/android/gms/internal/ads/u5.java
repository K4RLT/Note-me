package com.google.android.gms.internal.ads;
import b0.a;
import r0.e;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class u5 implements n2 {
    public p2 e;

    /* renamed from: f, reason: collision with root package name */
    public i3 f11539f;

    /* renamed from: h, reason: collision with root package name */
    public int f11541h;
    public m8 i;

    /* renamed from: j, reason: collision with root package name */
    public m8 f11542j;

    /* renamed from: l, reason: collision with root package name */
    public long f11544l;

    /* renamed from: m, reason: collision with root package name */
    public long f11545m;

    /* renamed from: o, reason: collision with root package name */
    public int f11547o;

    /* renamed from: p, reason: collision with root package name */
    public y5 f11548p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11549q;

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f11535a = new xk0(10);

    /* renamed from: b, reason: collision with root package name */
    public final y2 f11536b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final v2 f11537c = new v2();

    /* renamed from: k, reason: collision with root package name */
    public long f11543k = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final hx0 f11538d = new hx0(2);

    /* renamed from: g, reason: collision with root package name */
    public i3 f11540g = new l2();

    /* renamed from: n, reason: collision with root package name */
    public long f11546n = -1;

    static {
        int i = x21.f12448h0;
    }

    public final boolean a(o2 o2Var, boolean z3) {
        int i;
        int i10;
        int a10;
        o2Var.h();
        if (o2Var.n() == 0) {
            m8 c10 = this.f11538d.c(o2Var, null, 131072);
            this.i = c10;
            if (c10 != null) {
                this.f11537c.a(c10);
            }
            i = (int) o2Var.m();
            if (!z3) {
                o2Var.u(i);
            }
            i10 = 0;
        } else {
            i = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (c(o2Var)) {
                if (i11 <= 0) {
                    d();
                    throw new EOFException();
                }
            } else {
                xk0 xk0Var = this.f11535a;
                xk0Var.E(0);
                int b10 = xk0Var.b();
                if ((i10 != 0 && ((-128000) & b10) != (i10 & (-128000))) || (a10 = ed1.a(b10)) == -1) {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z3) {
                            return false;
                        }
                        d();
                        throw new EOFException();
                    }
                    if (z3) {
                        o2Var.h();
                        o2Var.s(i + i13);
                    } else {
                        o2Var.u(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                } else {
                    i11++;
                    if (i11 == 1) {
                        this.f11536b.a(b10);
                        i10 = b10;
                    } else if (i11 == 4) {
                        break;
                    }
                    o2Var.s(a10 - 4);
                }
            }
        }
        if (z3) {
            o2Var.u(i + i12);
        } else {
            o2Var.h();
        }
        this.f11541h = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.m() > (r2 - 4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.android.gms.internal.ads.o2 r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.y5 r0 = r8.f11548p
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = e()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.m()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L29
        L1b:
            com.google.android.gms.internal.ads.xk0 r0 = r8.f11535a     // Catch: java.io.EOFException -> L29
            byte[] r0 = r0.f12580a     // Catch: java.io.EOFException -> L29
            r2 = 4
            r3 = 0
            boolean r9 = r9.E(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L29
            if (r9 != 0) goto L28
            goto L29
        L28:
            return r3
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u5.c(com.google.android.gms.internal.ads.o2):boolean");
    }

    public final void d() {
        y5 y5Var = this.f11548p;
        if ((y5Var instanceof r5) && ((r5) y5Var).zzb()) {
            long j10 = this.f11546n;
            if (j10 != -1 && j10 != this.f11548p.e()) {
                r5 r5Var = (r5) this.f11548p;
                this.f11548p = new r5(this.f11546n, r5Var.f10092h, r5Var.i, r5Var.f10093j, false);
                p2 p2Var = this.e;
                p2Var.getClass();
                p2Var.B(this.f11548p);
                this.f11539f.getClass();
                this.f11548p.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        return a(o2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.e = p2Var;
        i3 A = p2Var.A(0, 1);
        this.f11539f = A;
        this.f11540g = A;
        this.e.z();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f11541h = 0;
        this.f11543k = -9223372036854775807L;
        this.f11544l = 0L;
        this.f11547o = 0;
        this.f11546n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0371, code lost:
    
        if (com.google.android.gms.internal.ads.k31.f7643u.l(r10) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03a7, code lost:
    
        if (((com.google.android.gms.internal.ads.d5) r9).f12467a.equals("TLEN") != false) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0350  */
    /* JADX WARN: Type inference failed for: r2v59, types: [com.google.android.gms.internal.ads.a3, com.google.android.gms.internal.ads.y5] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r3v35, types: [com.google.android.gms.internal.ads.p2] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r44, a r45) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u5.h(com.google.android.gms.internal.ads.o2, a):int");
    }
}
