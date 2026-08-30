package k0;
import e1.m;
import g0.r0;
import i1.o;
import j1.b;
import j1.c;
import k0.a1;
import k0.n;
import k0.q;
import k0.r;
import k0.t0;
import k0.v0;
import l.a;
import n.a0;
import n.y;
import r0.d;
import r0.e;
import r0.i1;

import b8.n3;
import c2.o2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f19413a;
    public r1.a e;

    /* renamed from: f, reason: collision with root package name */
    public df.l f19417f;

    /* renamed from: g, reason: collision with root package name */
    public o2 f19418g;

    /* renamed from: j, reason: collision with root package name */
    public b f19420j;

    /* renamed from: k, reason: collision with root package name */
    public z1.x f19421k;

    /* renamed from: r, reason: collision with root package name */
    public m0 f19428r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19429s;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f19414b = y.B(null);

    /* renamed from: c, reason: collision with root package name */
    public final i1 f19415c = y.B(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f19416d = new a0(this, 8);

    /* renamed from: h, reason: collision with root package name */
    public final o f19419h = new o();
    public final i1 i = y.B(Boolean.FALSE);

    /* renamed from: l, reason: collision with root package name */
    public final i1 f19422l = y.B(new b(0));

    /* renamed from: m, reason: collision with root package name */
    public final i1 f19423m = y.B(new b(0));

    /* renamed from: n, reason: collision with root package name */
    public final i1 f19424n = y.B(null);

    /* renamed from: o, reason: collision with root package name */
    public final i1 f19425o = y.B(null);

    /* renamed from: p, reason: collision with root package name */
    public final i1 f19426p = y.B(null);

    /* renamed from: q, reason: collision with root package name */
    public final i1 f19427q = y.B(null);

    public t0(a1 a1Var) {
        this.f19413a = a1Var;
        int i = 1;
        a1Var.e = new a0(this, i);
        a1Var.f19221f = new m(i, this);
        a1Var.f19222g = new r0(this);
        a1Var.f19223h = new y(this, 2);
        a1Var.i = new a0(this, 2);
        a1Var.f19224j = new a0(this, 3);
    }

    public static final long a(t0 t0Var, z1.x xVar, long j10) {
        z1.x xVar2 = t0Var.f19421k;
        if (xVar2 != null && xVar2.i()) {
            return t0Var.j().d(xVar, j10);
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r10 = this;
            r r0 = r10.e()
            r1 = 0
            if (r0 == 0) goto L62
            a1 r0 = r10.f19413a
            a0 r2 = a()
            int r2 = r2.e
            if (r2 != 0) goto L12
            goto L62
        L12:
            m2.d r2 = new m2.d
            r2.<init>()
            z1.x r3 = r10.j()
            java.util.ArrayList r3 = c(r3)
            int r4 = r3.size()
            r5 = 0
        L24:
            if (r5 >= r4) goto L5d
            java.lang.Object r6 = r3.get(r5)
            n r6 = (n) r6
            a0 r7 = a()
            long r8 = r6.f19361a
            java.lang.Object r7 = r7.e(r8)
            r r7 = (r) r7
            if (r7 == 0) goto L5a
            q r8 = r7.f19399a
            q r9 = r7.f19400b
            m2.g r6 = r6.d()
            boolean r7 = r7.f19401c
            if (r7 == 0) goto L4f
            int r7 = r9.f19393b
            int r8 = r8.f19393b
            m2.g r6 = r6.subSequence(r7, r8)
            goto L57
        L4f:
            int r7 = r8.f19393b
            int r8 = r9.f19393b
            m2.g r6 = r6.subSequence(r7, r8)
        L57:
            r2.a(r6)
        L5a:
            int r5 = r5 + 1
            goto L24
        L5d:
            m2.g r0 = r2.c()
            goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L77
            java.lang.String r2 = r0.f20477v
            int r2 = r2.length()
            if (r2 <= 0) goto L6e
            r1 = r0
        L6e:
            if (r1 == 0) goto L77
            df.l r0 = r10.f19417f
            if (r0 == 0) goto L77
            r0.invoke(r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.t0.b():void");
    }

    public final n c(q qVar) {
        return (n) this.f19413a.f19219c.e(qVar.f19394c);
    }

    public final r0 d() {
        return (r0) this.f19426p.getValue();
    }

    public final r e() {
        return (r) this.f19414b.getValue();
    }

    public final boolean f() {
        r rVar;
        z1.x j10 = j();
        a1 a1Var = this.f19413a;
        ArrayList c10 = a1Var.c(j10);
        if (!c10.isEmpty()) {
            int size = c10.size();
            for (int i = 0; i < size; i++) {
                n nVar = (n) c10.get(i);
                m2.g d2 = nVar.d();
                if (d2.f20477v.length() != 0 && ((rVar = (r) a1Var.a().e(nVar.f19361a)) == null || Math.abs(rVar.f19399a.f19393b - rVar.f19400b.f19393b) != d2.f20477v.length())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.f19415c.getValue()).booleanValue();
    }

    public final boolean h() {
        r e = e();
        if (e != null) {
            q qVar = e.f19400b;
            q qVar2 = e.f19399a;
            if (!kotlin.jvm.internal.a(qVar2, qVar)) {
                if (qVar2.f19394c != qVar.f19394c) {
                    z1.x j10 = j();
                    a1 a1Var = this.f19413a;
                    ArrayList c10 = a1Var.c(j10);
                    int size = c10.size();
                    for (int i = 0; i < size; i++) {
                        r rVar = (r) a1Var.a().e(((n) c10.get(i)).f19361a);
                        if (rVar != null && rVar.f19399a.f19393b != rVar.f19400b.f19393b) {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.m, df.l] */
    public final void i() {
        r1.a aVar;
        a0 a0Var = o.f20920a;
        a0Var.getClass();
        this.f19413a.f19225k.setValue(a0Var);
        this.f19429s = false;
        p();
        if (e() != null) {
            this.f19416d.invoke(null);
            if (g() && (aVar = this.e) != null) {
                aVar.a(9);
            }
        }
    }

    public final z1.x j() {
        z1.x xVar = this.f19421k;
        if (xVar != null) {
            if (!xVar.i()) {
                a.a("unattached coordinates");
            }
            return xVar;
        }
        a.b("null coordinates");
        l4.a.p();
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.m, df.l] */
    public final void k() {
        r rVar;
        ArrayList arrayList;
        int i;
        z1.x j10 = j();
        a1 a1Var = this.f19413a;
        ArrayList c10 = a1Var.c(j10);
        if (c10.isEmpty()) {
            return;
        }
        a0 a0Var = o.f20920a;
        a0 a0Var2 = new a0();
        int size = c10.size();
        int i10 = 0;
        r rVar2 = null;
        r rVar3 = null;
        while (i10 < size) {
            n nVar = (n) c10.get(i10);
            long j11 = nVar.f19361a;
            m2.m0 m0Var = (m2.m0) nVar.f19363c.invoke();
            if (m0Var == null) {
                arrayList = c10;
                i = size;
                rVar = null;
            } else {
                int length = m0Var.f20524a.f20514a.f20477v.length();
                arrayList = c10;
                i = size;
                rVar = new r(new q(m0Var.a(0), 0, j11), new q(m0Var.a(Math.max(length - 1, 0)), length, j11), false);
            }
            if (rVar != null) {
                if (rVar2 == null) {
                    rVar2 = rVar;
                }
                long j12 = nVar.f19361a;
                int c11 = a0Var2.c(j12);
                Object[] objArr = a0Var2.f20837c;
                Object obj = objArr[c11];
                a0Var2.f20836b[c11] = j12;
                objArr[c11] = rVar;
                rVar3 = rVar;
            }
            i10++;
            c10 = arrayList;
            size = i;
        }
        if (a0Var2.e == 0) {
            return;
        }
        if (rVar2 != rVar3) {
            rVar2.getClass();
            q qVar = rVar2.f19399a;
            rVar3.getClass();
            rVar2 = new r(qVar, rVar3.f19400b, false);
        }
        a1Var.f19225k.setValue(a0Var2);
        this.f19416d.invoke(rVar2);
        this.f19428r = null;
    }

    public final void l(boolean z3) {
        i1 i1Var = this.f19415c;
        if (((Boolean) i1Var.getValue()).booleanValue() != z3) {
            i1Var.setValue(Boolean.valueOf(z3));
            p();
        }
    }

    public final void m(r rVar) {
        this.f19414b.setValue(rVar);
        if (rVar != null) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (v0.p(r10, r11) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r20 = this;
            r0 = r20
            r r1 = e()
            z1.x r2 = r0.f19421k
            r3 = 0
            if (r1 == 0) goto L14
            q r4 = r1.f19399a
            if (r4 == 0) goto L14
            n r4 = c(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            q r5 = r1.f19400b
            if (r5 == 0) goto L20
            n r5 = c(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            z1.x r6 = r4.c()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            z1.x r7 = r5.c()
            goto L31
        L30:
            r7 = r3
        L31:
            i1 r8 = r0.f19425o
            i1 r9 = r0.f19424n
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.i()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            c r10 = v0.y(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.d(r6, r11)
            b r4 = new b
            r4.<init>(r11)
            r0 r6 = d()
            r0 r15 = r0.f17269v
            if (r6 == r15) goto L7e
            boolean r6 = v0.p(r10, r11)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.d(r7, r4)
            b r4 = new b
            r4.<init>(r1)
            r0 r5 = d()
            r0 r6 = r0.f17270w
            if (r5 == r6) goto La6
            boolean r1 = v0.p(r10, r1)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.t0.n():void");
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.jvm.internal.m, df.l] */
    public final boolean o(long j10, long j11, boolean z3, s sVar) {
        r0 r0Var;
        r e;
        ArrayList arrayList;
        m0 m0Var;
        a1 a1Var;
        int i;
        int i10;
        int i11;
        int i12;
        m2.m0 m0Var2;
        long j12;
        long g8;
        int i13;
        long j13;
        float f10;
        j jVar;
        j jVar2;
        n0 n0Var;
        long j14;
        q qVar;
        j jVar3;
        j jVar4;
        a1 a1Var2;
        boolean z9;
        ArrayList arrayList2;
        j jVar5;
        j jVar6;
        ArrayList arrayList3;
        j n10;
        j jVar7;
        int i14;
        j jVar8;
        int i15;
        int i16;
        int i17;
        q qVar2;
        int s10;
        int i18;
        q qVar3;
        q qVar4;
        if (z3) {
            r0Var = r0.f17269v;
        } else {
            r0Var = r0.f17270w;
        }
        this.f19426p.setValue(r0Var);
        this.f19427q.setValue(new b(j10));
        z1.x j15 = j();
        a1 a1Var3 = this.f19413a;
        ArrayList c10 = a1Var3.c(j15);
        int i19 = n.f20917a;
        y yVar = new y(6);
        int size = c10.size();
        for (int i20 = 0; i20 < size; i20++) {
            yVar.e(i20, ((n) c10.get(i20)).f19361a);
        }
        n3 n3Var = new n3(4, yVar);
        long j16 = 9223372034707292159L;
        long j17 = 9205357640488583168L;
        if ((j11 & 9223372034707292159L) == 9205357640488583168L) {
            e = null;
        } else {
            e = e();
        }
        n0 n0Var2 = new n0(j10, j11, j15, z3, e, n3Var);
        int size2 = c10.size();
        int i21 = 0;
        while (true) {
            arrayList = n0Var2.f19372h;
            if (i21 >= size2) {
                break;
            }
            n nVar = (n) c10.get(i21);
            z1.x c11 = nVar.c();
            if (c11 == null || (m0Var2 = (m2.m0) nVar.f19363c.invoke()) == null) {
                a1Var2 = a1Var3;
                i13 = size2;
                i14 = i21;
                arrayList2 = c10;
                j12 = j16;
                j13 = j17;
            } else {
                j12 = j16;
                long d2 = n0Var2.f19368c.d(c11, 0L);
                ArrayList arrayList4 = c10;
                long g10 = b.g(n0Var2.f19366a, d2);
                long j18 = n0Var2.f19367b;
                if ((j18 & j12) == j17) {
                    g8 = j17;
                } else {
                    g8 = b.g(j18, d2);
                }
                long j19 = nVar.f19361a;
                i13 = size2;
                int i22 = i21;
                long j20 = m0Var2.f20526c;
                float f11 = (int) (j20 >> 32);
                float f12 = (int) (j20 & 4294967295L);
                int i23 = (int) (g10 >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i23);
                j jVar9 = j.f19312w;
                j jVar10 = j.f19310u;
                j13 = j17;
                j jVar11 = j.f19311v;
                if (intBitsToFloat < 0.0f) {
                    f10 = 0.0f;
                    jVar = jVar10;
                } else if (Float.intBitsToFloat(i23) > f11) {
                    f10 = 0.0f;
                    jVar = jVar9;
                } else {
                    f10 = 0.0f;
                    jVar = jVar11;
                }
                int i24 = (int) (g10 & 4294967295L);
                if (Float.intBitsToFloat(i24) < f10) {
                    jVar2 = jVar10;
                } else if (Float.intBitsToFloat(i24) > f12) {
                    jVar2 = jVar9;
                } else {
                    jVar2 = jVar11;
                }
                boolean z10 = n0Var2.f19369d;
                r rVar = n0Var2.e;
                if (z10) {
                    n0Var = n0Var2;
                    if (rVar != null) {
                        qVar4 = rVar.f19400b;
                    } else {
                        qVar4 = null;
                    }
                    j14 = j19;
                    a1Var2 = a1Var3;
                    jVar6 = v0.n(jVar, jVar2, n0Var, j14, qVar4);
                    z9 = z10;
                    i14 = i22;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList;
                    jVar8 = jVar;
                    jVar3 = jVar8;
                    jVar4 = jVar2;
                    jVar7 = jVar4;
                    n10 = jVar6;
                    jVar5 = n10;
                } else {
                    n0Var = n0Var2;
                    j14 = j19;
                    if (rVar != null) {
                        qVar = rVar.f19399a;
                    } else {
                        qVar = null;
                    }
                    jVar3 = jVar;
                    jVar4 = jVar2;
                    a1Var2 = a1Var3;
                    z9 = z10;
                    arrayList2 = arrayList4;
                    jVar5 = jVar3;
                    jVar6 = jVar4;
                    arrayList3 = arrayList;
                    n10 = v0.n(jVar, jVar2, n0Var, j14, qVar);
                    jVar7 = n10;
                    i14 = i22;
                    jVar8 = jVar7;
                }
                n0Var2 = n0Var;
                j x9 = v0.x(jVar3, jVar4);
                if (x9 == jVar11 || x9 != n10) {
                    int length = m0Var2.f20524a.f20514a.f20477v.length();
                    n3 n3Var2 = n0Var2.f19370f;
                    if (z9) {
                        int s11 = v0.s(g10, m0Var2);
                        if (rVar != null && (qVar3 = rVar.f19400b) != null) {
                            i18 = s11;
                            int compare = n3Var2.compare(Long.valueOf(qVar3.f19394c), Long.valueOf(j14));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = qVar3.f19393b;
                            }
                        } else {
                            i18 = s11;
                            length = i18;
                        }
                        i17 = length;
                        i16 = i18;
                    } else {
                        int s12 = v0.s(g10, m0Var2);
                        if (rVar != null && (qVar2 = rVar.f19399a) != null) {
                            i15 = s12;
                            int compare2 = n3Var2.compare(Long.valueOf(qVar2.f19394c), Long.valueOf(j14));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = qVar2.f19393b;
                            }
                            i16 = length;
                        } else {
                            i15 = s12;
                            i16 = i15;
                        }
                        i17 = i15;
                    }
                    if ((g8 & j12) == j13) {
                        s10 = -1;
                    } else {
                        s10 = v0.s(g8, m0Var2);
                    }
                    int i25 = n0Var2.f19374k + 2;
                    n0Var2.f19374k = i25;
                    long j21 = j14;
                    p pVar = new p(j21, i25, i16, i17, s10, m0Var2);
                    n0Var2.i = n0Var2.a(n0Var2.i, jVar8, jVar7);
                    n0Var2.f19373j = n0Var2.a(n0Var2.f19373j, jVar5, jVar6);
                    n0Var2.f19371g.e(arrayList3.size(), j21);
                    arrayList3.add(pVar);
                }
            }
            i21 = i14 + 1;
            size2 = i13;
            c10 = arrayList2;
            j16 = j12;
            j17 = j13;
            a1Var3 = a1Var2;
        }
        a1 a1Var4 = a1Var3;
        int i26 = n0Var2.f19374k + 1;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i27 = n0Var2.i;
                if (i27 == -1) {
                    i11 = i26;
                } else {
                    i11 = i27;
                }
                int i28 = n0Var2.f19373j;
                if (i28 == -1) {
                    i12 = i26;
                } else {
                    i12 = i28;
                }
                m0Var = new m(n0Var2.f19371g, arrayList, i11, i12, n0Var2.f19369d, n0Var2.e);
            } else {
                p pVar2 = (p) qe.l.I(arrayList);
                int i29 = n0Var2.i;
                if (i29 == -1) {
                    i = i26;
                } else {
                    i = i29;
                }
                int i30 = n0Var2.f19373j;
                if (i30 == -1) {
                    i10 = i26;
                } else {
                    i10 = i30;
                }
                m0Var = new d1(n0Var2.f19369d, i, i10, n0Var2.e, pVar2);
            }
        } else {
            m0Var = null;
        }
        if (m0Var == null || !m0Var.f(this.f19428r)) {
            return false;
        }
        r a10 = sVar.a(m0Var);
        if (!kotlin.jvm.internal.a(a10, e())) {
            if (g()) {
                a1Var = a1Var4;
                ArrayList arrayList5 = a1Var.f19218b;
                int size4 = arrayList5.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size4) {
                        break;
                    }
                    if (((n) arrayList5.get(i31)).d().f20477v.length() > 0) {
                        r1.a aVar = this.e;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                    } else {
                        i31++;
                    }
                }
            } else {
                a1Var = a1Var4;
            }
            a1Var.f19225k.setValue(m0Var.e(a10));
            this.f19416d.invoke(a10);
        }
        this.f19428r = m0Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.t0.p():void");
    }
}
