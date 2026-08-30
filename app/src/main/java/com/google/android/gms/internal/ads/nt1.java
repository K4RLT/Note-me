package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nt1 {

    /* renamed from: c, reason: collision with root package name */
    public final ku1 f8852c;

    /* renamed from: d, reason: collision with root package name */
    public final io0 f8853d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public int f8854f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8855g;

    /* renamed from: h, reason: collision with root package name */
    public lt1 f8856h;
    public lt1 i;

    /* renamed from: j, reason: collision with root package name */
    public lt1 f8857j;

    /* renamed from: k, reason: collision with root package name */
    public lt1 f8858k;

    /* renamed from: l, reason: collision with root package name */
    public lt1 f8859l;

    /* renamed from: m, reason: collision with root package name */
    public int f8860m;

    /* renamed from: n, reason: collision with root package name */
    public Object f8861n;

    /* renamed from: o, reason: collision with root package name */
    public long f8862o;

    /* renamed from: q, reason: collision with root package name */
    public final bl0 f8864q;

    /* renamed from: a, reason: collision with root package name */
    public final qg f8850a = new qg();

    /* renamed from: b, reason: collision with root package name */
    public final ah f8851b = new ah();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f8863p = new ArrayList();

    public nt1(ku1 ku1Var, io0 io0Var, bl0 bl0Var) {
        this.f8852c = ku1Var;
        this.f8853d = io0Var;
        this.f8864q = bl0Var;
    }

    public static yx1 a(uh uhVar, Object obj, long j10, ah ahVar, qg qgVar) {
        uhVar.o(obj, qgVar);
        uhVar.b(qgVar.f9841c, ahVar, 0L);
        uhVar.e(obj);
        qgVar.f9843f.getClass();
        uhVar.o(obj, qgVar);
        qgVar.f9843f.a(-1);
        return new yx1(obj, j10, -1);
    }

    public final lt1 A(xx1 xx1Var) {
        for (int i = 0; i < this.f8863p.size(); i++) {
            lt1 lt1Var = (lt1) this.f8863p.get(i);
            if (lt1Var.f8136a == xx1Var) {
                return lt1Var;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f8860m == 0) {
            return;
        }
        lt1 lt1Var = this.f8856h;
        lt1Var.getClass();
        this.f8861n = lt1Var.f8137b;
        this.f8862o = lt1Var.f8141g.f8413a.f13006d;
        while (lt1Var != null) {
            lt1Var.h();
            lt1Var = lt1Var.f8146m;
        }
        this.f8856h = null;
        this.f8858k = null;
        this.i = null;
        this.f8857j = null;
        this.f8860m = 0;
        b();
    }

    public final int C(uh uhVar, long j10, long j11, long j12) {
        long j13;
        mt1 mt1Var;
        int i;
        mt1 mt1Var2;
        mt1 mt1Var3;
        mt1 mt1Var4;
        long j14;
        int i10;
        int i11;
        int i12;
        uh uhVar2 = uhVar;
        lt1 lt1Var = this.f8856h;
        lt1 lt1Var2 = null;
        while (lt1Var != null) {
            mt1 mt1Var5 = lt1Var.f8141g;
            yx1 yx1Var = mt1Var5.f8413a;
            if (lt1Var2 == null) {
                mt1Var2 = D(uhVar2, mt1Var5);
                mt1Var3 = mt1Var5;
                j13 = -9223372036854775807L;
                i = 0;
            } else {
                mt1 e = e(uhVar2, lt1Var2, j10);
                if (e != null) {
                    long j15 = mt1Var5.f8415c;
                    if (yx1Var.equals(e.f8413a)) {
                        long j16 = mt1Var5.f8414b;
                        j13 = -9223372036854775807L;
                        long j17 = e.f8414b;
                        if (j16 == j17) {
                            mt1Var = mt1Var5;
                            i = 0;
                        } else if (j15 != -9223372036854775807L) {
                            mt1Var = mt1Var5;
                            i = 0;
                            long j18 = e.f8415c;
                            if (j18 != -9223372036854775807L) {
                                if (Math.abs((j17 - j18) - (j16 - j15)) >= 5000000) {
                                }
                            }
                        }
                        if (j16 != j17) {
                            mt1Var2 = e.a(j16, j15);
                        } else {
                            mt1Var2 = e;
                        }
                        mt1Var3 = mt1Var;
                    }
                }
                return y(lt1Var2);
            }
            long j19 = mt1Var3.f8416d;
            if (j19 == mt1Var2.f8416d) {
                mt1Var4 = mt1Var2;
            } else {
                mt1Var4 = new mt1(mt1Var2.f8413a, mt1Var2.f8414b, mt1Var2.f8415c, j19, mt1Var2.e, mt1Var2.f8417f, mt1Var2.f8418g, mt1Var2.f8419h);
            }
            lt1Var.f8141g = mt1Var4;
            long j20 = mt1Var3.e;
            long j21 = mt1Var2.e;
            if (j20 != j21) {
                if (j21 == j13) {
                    j14 = Long.MAX_VALUE;
                } else {
                    j14 = j21 + lt1Var.f8149p;
                }
                if (lt1Var == this.i && (j11 == Long.MIN_VALUE || j11 >= j14)) {
                    i10 = 1;
                } else {
                    i10 = i;
                }
                if (lt1Var == this.f8857j && (j12 == Long.MIN_VALUE || j12 >= j14)) {
                    i11 = 1;
                } else {
                    i11 = i;
                }
                int y10 = y(lt1Var);
                if (y10 != 0) {
                    return y10;
                }
                if (i10 != 0 && (j20 != j13 || yx1Var.e != -1)) {
                    i12 = 1;
                } else {
                    i12 = i;
                }
                if (i11 != 0) {
                    return i12 | 2;
                }
                return i12;
            }
            lt1Var2 = lt1Var;
            lt1Var = lt1Var.f8146m;
            uhVar2 = uhVar;
        }
        return 0;
    }

    public final mt1 D(uh uhVar, mt1 mt1Var) {
        boolean z3;
        yx1 yx1Var = mt1Var.f8413a;
        boolean b10 = yx1Var.b();
        int i = yx1Var.e;
        if (!b10 && i == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z3;
        boolean h3 = h(uhVar, yx1Var);
        boolean i10 = i(uhVar, yx1Var, z9);
        long j10 = j(uhVar, yx1Var);
        Object obj = yx1Var.f13003a;
        qg qgVar = this.f8850a;
        uhVar.o(obj, qgVar);
        if (yx1Var.b()) {
            qgVar.c(yx1Var.f13004b);
        } else if (i != -1) {
            qgVar.c(i);
        }
        return new mt1(yx1Var, mt1Var.f8414b, mt1Var.f8415c, mt1Var.f8416d, j10, z9, h3, i10);
    }

    public final yx1 E(vt1 vt1Var, uh uhVar, Object obj, boolean z3, boolean z9) {
        long c10;
        int e;
        qg qgVar = this.f8850a;
        int i = uhVar.o(obj, qgVar).f9841c;
        Object obj2 = this.f8861n;
        if (obj2 != null && (e = uhVar.e(obj2)) != -1 && uhVar.d(e, qgVar, false).f9841c == i) {
            c10 = this.f8862o;
        } else {
            lt1 lt1Var = this.f8856h;
            while (true) {
                if (lt1Var != null) {
                    if (lt1Var.f8137b.equals(obj)) {
                        c10 = lt1Var.f8141g.f8413a.f13006d;
                        break;
                    }
                    lt1Var = lt1Var.f8146m;
                } else {
                    lt1 lt1Var2 = this.f8856h;
                    while (true) {
                        if (lt1Var2 != null) {
                            int e8 = uhVar.e(lt1Var2.f8137b);
                            if (e8 != -1 && uhVar.d(e8, qgVar, false).f9841c == i) {
                                c10 = lt1Var2.f8141g.f8413a.f13006d;
                                break;
                            }
                            lt1Var2 = lt1Var2.f8146m;
                        } else {
                            c10 = c(obj);
                            if (c10 == -1) {
                                c10 = this.e;
                                this.e = 1 + c10;
                                if (this.f8856h == null) {
                                    this.f8861n = obj;
                                    this.f8862o = c10;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j10 = c10;
        if (!z3 && !z9) {
            yx1 yx1Var = vt1Var.f11986b;
            yx1 a10 = a(uhVar, obj, j10, this.f8851b, qgVar);
            if (yx1Var.b() && yx1Var.equals(a10)) {
                return yx1Var;
            }
            uhVar.o(obj, qgVar);
            return new yx1(obj, j10, -1);
        }
        uhVar.o(obj, qgVar);
        int i10 = qgVar.f9841c;
        ah ahVar = this.f8851b;
        uhVar.b(i10, ahVar, 0L);
        for (int e10 = uhVar.e(obj); e10 >= ahVar.f4506k; e10--) {
            uhVar.d(e10, qgVar, true);
            qgVar.f9843f.getClass();
            qgVar.f9843f.a(-1);
        }
        return a(uhVar, obj, j10, ahVar, qgVar);
    }

    public final void b() {
        yx1 yx1Var;
        b51 b51Var = d51.f5314v;
        y41 y41Var = new y41(4);
        for (lt1 lt1Var = this.f8856h; lt1Var != null; lt1Var = lt1Var.f8146m) {
            y41Var.a(lt1Var.f8141g.f8413a);
        }
        lt1 lt1Var2 = this.i;
        if (lt1Var2 == null) {
            yx1Var = null;
        } else {
            yx1Var = lt1Var2.f8141g.f8413a;
        }
        this.f8853d.e(new r1(13, this, y41Var, yx1Var));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.f8863p.size(); i++) {
            lt1 lt1Var = (lt1) this.f8863p.get(i);
            if (lt1Var.f8137b.equals(obj)) {
                return lt1Var.f8141g.f8413a.f13006d;
            }
        }
        return -1L;
    }

    public final int d(uh uhVar) {
        uh uhVar2;
        lt1 lt1Var;
        lt1 lt1Var2 = this.f8856h;
        if (lt1Var2 == null) {
            return 0;
        }
        int e = uhVar.e(lt1Var2.f8137b);
        while (true) {
            uhVar2 = uhVar;
            e = uhVar2.l(e, this.f8850a, this.f8851b, this.f8854f, this.f8855g);
            while (true) {
                lt1Var = lt1Var2.f8146m;
                if (lt1Var == null || lt1Var2.f8141g.f8417f) {
                    break;
                }
                lt1Var2 = lt1Var;
            }
            if (e == -1 || lt1Var == null || uhVar2.e(lt1Var.f8137b) != e) {
                break;
            }
            lt1Var2 = lt1Var;
            uhVar = uhVar2;
        }
        int y10 = y(lt1Var2);
        lt1Var2.f8141g = D(uhVar2, lt1Var2.f8141g);
        return y10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.mt1 e(com.google.android.gms.internal.ads.uh r23, com.google.android.gms.internal.ads.lt1 r24, long r25) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.e(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.lt1, long):com.google.android.gms.internal.ads.mt1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f9843f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.mt1 f(com.google.android.gms.internal.ads.uh r14, java.lang.Object r15, int r16, int r17, long r18, long r20) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.yx1 r0 = new com.google.android.gms.internal.ads.yx1
            r6 = -1
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r6)
            com.google.android.gms.internal.ads.qg r4 = r13.f8850a
            com.google.android.gms.internal.ads.qg r14 = r14.o(r15, r4)
            long r8 = r14.b(r2, r3)
            com.google.android.gms.internal.ads.eu r14 = r4.f9843f
            com.google.android.gms.internal.ads.a r14 = r14.a(r2)
            r15 = 0
        L1e:
            int[] r1 = r14.f4290d
            int r5 = r1.length
            if (r15 >= r5) goto L2e
            r1 = r1[r15]
            if (r1 == 0) goto L2e
            r5 = 1
            if (r1 != r5) goto L2b
            goto L2e
        L2b:
            int r15 = r15 + 1
            goto L1e
        L2e:
            if (r3 != r15) goto L35
            com.google.android.gms.internal.ads.eu r14 = r4.f9843f
            r14.getClass()
        L35:
            r4.c(r2)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r1 = 0
            if (r14 == 0) goto L4e
            int r14 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r14 > 0) goto L4e
            r14 = -1
            long r14 = r14 + r8
            long r1 = java.lang.Math.max(r1, r14)
        L4e:
            r2 = r1
            r1 = r0
            com.google.android.gms.internal.ads.mt1 r0 = new com.google.android.gms.internal.ads.mt1
            r11 = 0
            r12 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r6 = r18
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.f(com.google.android.gms.internal.ads.uh, java.lang.Object, int, int, long, long):com.google.android.gms.internal.ads.mt1");
    }

    public final mt1 g(uh uhVar, Object obj, long j10, long j11, long j12, long j13) {
        long j14;
        qg qgVar = this.f8850a;
        uhVar.o(obj, qgVar);
        qgVar.getClass();
        yx1 yx1Var = new yx1(obj, j13, -1);
        boolean z3 = !yx1Var.b();
        boolean h3 = h(uhVar, yx1Var);
        boolean i = i(uhVar, yx1Var, z3);
        long j15 = j(uhVar, yx1Var);
        if (j15 != -9223372036854775807L && j10 >= j15) {
            j14 = Math.max(0L, (-1) + j15);
        } else {
            j14 = j10;
        }
        return new mt1(yx1Var, j14, j11, j12, j15, z3, h3, i);
    }

    public final boolean h(uh uhVar, yx1 yx1Var) {
        if (!yx1Var.b() && yx1Var.e == -1) {
            Object obj = yx1Var.f13003a;
            int i = uhVar.o(obj, this.f8850a).f9841c;
            if (uhVar.b(i, this.f8851b, 0L).f4507l == uhVar.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(uh uhVar, yx1 yx1Var, boolean z3) {
        int e = uhVar.e(yx1Var.f13003a);
        qg qgVar = this.f8850a;
        int i = uhVar.d(e, qgVar, false).f9841c;
        ah ahVar = this.f8851b;
        if (uhVar.b(i, ahVar, 0L).f4503g || uhVar.l(e, qgVar, ahVar, this.f8854f, this.f8855g) != -1 || !z3) {
            return false;
        }
        return true;
    }

    public final long j(uh uhVar, yx1 yx1Var) {
        Object obj = yx1Var.f13003a;
        qg qgVar = this.f8850a;
        uhVar.o(obj, qgVar);
        if (yx1Var.b()) {
            return qgVar.b(yx1Var.f13004b, yx1Var.f13005c);
        }
        int i = yx1Var.e;
        if (i != -1) {
            qgVar.f9843f.a(i).getClass();
            return 0L;
        }
        return qgVar.f9842d;
    }

    public final int k(uh uhVar, int i) {
        this.f8854f = i;
        return d(uhVar);
    }

    public final int l(uh uhVar, boolean z3) {
        this.f8855g = z3;
        return d(uhVar);
    }

    public final void m(ps1 ps1Var) {
        ps1Var.getClass();
        r();
    }

    public final void n(long j10) {
        boolean z3;
        lt1 lt1Var = this.f8858k;
        if (lt1Var != null) {
            if (lt1Var.f8146m == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
            if (lt1Var.e) {
                lt1Var.f8136a.g(j10 - lt1Var.f8149p);
            }
        }
    }

    public final boolean o() {
        lt1 lt1Var = this.f8858k;
        if (lt1Var != null) {
            if (lt1Var.f8141g.f8419h || !lt1Var.b() || this.f8858k.f8141g.e == -9223372036854775807L || this.f8860m >= 100) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final mt1 p(long j10, vt1 vt1Var) {
        lt1 lt1Var = this.f8858k;
        if (lt1Var == null) {
            uh uhVar = vt1Var.f11985a;
            yx1 yx1Var = vt1Var.f11986b;
            long j11 = vt1Var.f11987c;
            long j12 = vt1Var.f12000r;
            Object obj = yx1Var.f13003a;
            uhVar.o(obj, this.f8850a);
            if (yx1Var.b()) {
                return f(uhVar, obj, yx1Var.f13004b, yx1Var.f13005c, j11, yx1Var.f13006d);
            }
            return g(uhVar, obj, j12, -9223372036854775807L, j11, yx1Var.f13006d);
        }
        return e(vt1Var.f11985a, lt1Var, j10);
    }

    public final lt1 q(mt1 mt1Var) {
        long j10;
        lt1 lt1Var;
        long j11 = mt1Var.f8414b;
        lt1 lt1Var2 = this.f8858k;
        if (lt1Var2 == null) {
            j10 = 1000000000000L;
        } else {
            j10 = (lt1Var2.f8149p + lt1Var2.f8141g.e) - j11;
        }
        long j12 = j10;
        int i = 0;
        while (true) {
            if (i < this.f8863p.size()) {
                mt1 mt1Var2 = ((lt1) this.f8863p.get(i)).f8141g;
                long j13 = mt1Var2.e;
                long j14 = mt1Var.e;
                if ((j13 == -9223372036854775807L || j13 == j14) && mt1Var2.f8414b == j11 && mt1Var2.f8413a.equals(mt1Var.f8413a)) {
                    lt1Var = (lt1) this.f8863p.remove(i);
                    break;
                }
                i++;
            } else {
                lt1Var = null;
                break;
            }
        }
        if (lt1Var == null) {
            et1 et1Var = (et1) this.f8864q.f4819v;
            w i10 = et1Var.f5806z.i(et1Var.N);
            et1Var.f5796t0.getClass();
            u uVar = et1Var.f5805y;
            lt1Var = new lt1(et1Var.f5799v, j12, et1Var.f5803x, i10, et1Var.L, mt1Var, uVar);
        } else {
            lt1Var.f8141g = mt1Var;
            lt1Var.f8149p = j12;
        }
        lt1 lt1Var3 = this.f8858k;
        if (lt1Var3 != null) {
            if (lt1Var != lt1Var3.f8146m) {
                lt1Var3.l();
                lt1Var3.f8146m = lt1Var;
            }
        } else {
            this.f8856h = lt1Var;
            this.i = lt1Var;
            this.f8857j = lt1Var;
        }
        this.f8861n = null;
        this.f8858k = lt1Var;
        this.f8860m++;
        b();
        return lt1Var;
    }

    public final void r() {
        if (!this.f8863p.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f8863p.size(); i++) {
                ((lt1) this.f8863p.get(i)).h();
            }
            this.f8863p = arrayList;
            this.f8859l = null;
            z();
        }
    }

    public final lt1 s() {
        return this.f8856h;
    }

    public final lt1 t() {
        return this.i;
    }

    public final lt1 u() {
        return this.f8857j;
    }

    public final lt1 v() {
        lt1 lt1Var = this.f8857j;
        lt1 lt1Var2 = this.i;
        if (lt1Var == lt1Var2) {
            lt1Var2.getClass();
            this.f8857j = lt1Var2.f8146m;
        }
        lt1Var2.getClass();
        this.i = lt1Var2.f8146m;
        b();
        lt1 lt1Var3 = this.i;
        lt1Var3.getClass();
        return lt1Var3;
    }

    public final void w() {
        lt1 lt1Var;
        lt1 lt1Var2 = this.f8857j;
        if (lt1Var2 != null && (lt1Var = lt1Var2.f8146m) != null) {
            this.f8857j = lt1Var;
            b();
            return;
        }
        throw null;
    }

    public final lt1 x() {
        lt1 lt1Var = this.f8856h;
        if (lt1Var == null) {
            return null;
        }
        if (lt1Var == this.i) {
            this.i = lt1Var.f8146m;
        }
        if (lt1Var == this.f8857j) {
            this.f8857j = lt1Var.f8146m;
        }
        lt1Var.h();
        int i = this.f8860m - 1;
        this.f8860m = i;
        if (i == 0) {
            this.f8858k = null;
            lt1 lt1Var2 = this.f8856h;
            this.f8861n = lt1Var2.f8137b;
            this.f8862o = lt1Var2.f8141g.f8413a.f13006d;
        }
        this.f8856h = this.f8856h.f8146m;
        b();
        return this.f8856h;
    }

    public final int y(lt1 lt1Var) {
        lt1Var.getClass();
        int i = 0;
        if (lt1Var.equals(this.f8858k)) {
            return 0;
        }
        this.f8858k = lt1Var;
        int i10 = 0;
        while (true) {
            lt1Var = lt1Var.f8146m;
            if (lt1Var == null) {
                break;
            }
            if (lt1Var == this.i) {
                lt1 lt1Var2 = this.f8856h;
                this.i = lt1Var2;
                this.f8857j = lt1Var2;
                i10 = 3;
            }
            if (lt1Var == this.f8857j) {
                this.f8857j = this.i;
                i10 |= 2;
            }
            lt1Var.h();
            this.f8860m--;
        }
        lt1 lt1Var3 = this.f8858k;
        lt1Var3.getClass();
        if (lt1Var3.f8146m != null) {
            lt1Var3.l();
            lt1Var3.f8146m = null;
            while (true) {
                u uVar = lt1Var3.f8148o;
                if (i >= uVar.f11497u) {
                    break;
                }
                uVar.c(i);
                r rVar = ((r[]) lt1Var3.f8148o.f11499w)[i];
                i++;
            }
        }
        b();
        return i10;
    }

    public final void z() {
        lt1 lt1Var = this.f8859l;
        if (lt1Var == null || lt1Var.c()) {
            this.f8859l = null;
            for (int i = 0; i < this.f8863p.size(); i++) {
                lt1 lt1Var2 = (lt1) this.f8863p.get(i);
                if (!lt1Var2.c()) {
                    this.f8859l = lt1Var2;
                    return;
                }
            }
        }
    }
}
