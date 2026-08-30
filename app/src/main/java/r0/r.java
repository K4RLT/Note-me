package r0;
import b0.b;
import b1.p;
import b1.z;
import b2.t;
import c1.c;
import c1.d;
import c1.f;
import c1.i;
import l.a;
import m.a;
import m.b;
import m.c;
import m.f;
import n.c0;
import n.d0;
import n.i0;
import n.j0;
import n.l0;
import n.q0;
import n.u;
import n.w;
import n1.a;
import p.m;
import r0.a2;
import r0.h;
import r0.l;
import r0.p0;
import r0.q1;
import r0.q;
import r0.r;
import r0.s;
import r0.v0;
import r0.x;
import r1.a;
import s.a;
import s.c;
import s.e;
import s0.a;
import s0.b0;
import s0.b;
import s0.c0;
import s0.c;
import s0.e0;
import s0.e;
import s0.f0;
import s0.h0;
import s0.k0;
import s0.l;
import s0.m;
import s0.n;
import s0.o;
import s0.p;
import s0.q;
import s0.r;
import s0.w;
import s0.x;
import s0.z;
import t0.e;
import z0.c;
import z0.g;
import z0.h;

import android.os.Trace;
import b8.x4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import ya.gc;
import ya.sb;

/* loaded from: classes.dex */
public final class r implements m {
    public int A;
    public int B;
    public boolean C;
    public final z D;
    public final ArrayList E;
    public boolean F;
    public a2 G;
    public b2 H;
    public e2 I;
    public boolean J;
    public g K;
    public a L;
    public final b M;
    public a N;
    public c O;
    public vd.n P;
    public final c Q;
    public final te.g R;
    public boolean S;
    public long T;
    public w U;

    /* renamed from: a, reason: collision with root package name */
    public final ra.e f24335a;

    /* renamed from: b, reason: collision with root package name */
    public final u f24336b;

    /* renamed from: c, reason: collision with root package name */
    public final b2 f24337c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f24338d;
    public final a e;

    /* renamed from: f, reason: collision with root package name */
    public final a f24339f;

    /* renamed from: g, reason: collision with root package name */
    public final ic.c f24340g;

    /* renamed from: h, reason: collision with root package name */
    public final x f24341h;

    /* renamed from: j, reason: collision with root package name */
    public m1 f24342j;

    /* renamed from: k, reason: collision with root package name */
    public int f24343k;

    /* renamed from: l, reason: collision with root package name */
    public int f24344l;

    /* renamed from: m, reason: collision with root package name */
    public int f24345m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f24347o;

    /* renamed from: p, reason: collision with root package name */
    public u f24348p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24349q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24350r;

    /* renamed from: v, reason: collision with root package name */
    public w f24354v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24355w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24357y;
    public final ArrayList i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final t f24346n = new t(3, (byte) 0);

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f24351s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final t f24352t = new t(3, (byte) 0);

    /* renamed from: u, reason: collision with root package name */
    public g f24353u = g.f31761x;

    /* renamed from: x, reason: collision with root package name */
    public final t f24356x = new t(3, (byte) 0);

    /* renamed from: z, reason: collision with root package name */
    public int f24358z = -1;

    public r(ra.e eVar, u uVar, b2 b2Var, l0 l0Var, a aVar, a aVar2, ic.c cVar, x xVar) {
        boolean z3;
        this.f24335a = eVar;
        this.f24336b = uVar;
        this.f24337c = b2Var;
        this.f24338d = l0Var;
        this.e = aVar;
        this.f24339f = aVar2;
        this.f24340g = cVar;
        this.f24341h = xVar;
        if (!uVar.e() && !uVar.c()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.C = z3;
        this.D = new z(1, this);
        this.E = new ArrayList();
        a2 g8 = b2Var.g();
        g8.c();
        this.G = g8;
        b2 b2Var2 = new b2();
        if (uVar.e()) {
            b2Var2.b();
        }
        if (uVar.c()) {
            b2Var2.E = new w();
        }
        this.H = b2Var2;
        e2 k3 = b2Var2.k();
        k3.e(true);
        this.I = k3;
        this.M = new b(this, aVar);
        a2 g10 = this.H.g();
        try {
            a a10 = g10.a(0);
            g10.c();
            this.N = a10;
            this.O = new c();
            this.Q = new c(this);
            te.g i = uVar.i();
            te.g B = B();
            this.R = i.V(B == null ? te.h.f25707u : B);
        } catch (Throwable th) {
            g10.c();
            throw th;
        }
    }

    public static final int Q(r rVar, int i, boolean z3, int i10) {
        boolean z9;
        int i11;
        o oVar;
        a2 a2Var = rVar.G;
        b bVar = rVar.M;
        boolean j10 = a2Var.j(i);
        int[] iArr = a2Var.f24179b;
        if (j10) {
            int i12 = a2Var.i(i);
            Object p10 = a2Var.p(i, iArr);
            if (i12 == 206 && kotlin.jvm.internal.a(p10, e)) {
                Object h3 = a2Var.h(i, 0);
                if (h3 instanceof o) {
                    oVar = (o) h3;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    for (r rVar2 : oVar.f24307u.e) {
                        b2 b2Var = rVar2.f24337c;
                        if (b2Var.f24192v > 0 && (b2Var.f24191u[1] & 67108864) != 0) {
                            x xVar = rVar2.f24341h;
                            synchronized (xVar.f24429x) {
                                xVar.o();
                                i0 i0Var = xVar.H;
                                xVar.H = gc.b();
                                try {
                                    xVar.N.h0(i0Var);
                                } finally {
                                }
                            }
                            a aVar = new a();
                            rVar2.L = aVar;
                            a2 g8 = rVar2.f24337c.g();
                            try {
                                rVar2.G = g8;
                                b bVar2 = rVar2.M;
                                a aVar2 = bVar2.f24855b;
                                try {
                                    bVar2.f24855b = aVar;
                                    rVar2.P(0);
                                    b bVar3 = rVar2.M;
                                    bVar3.b();
                                    if (bVar3.f24856c) {
                                        bVar3.f24855b.f24852a.e(b0.f24864c);
                                        if (bVar3.f24856c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.f24855b.f24852a.e(m.f24889c);
                                            bVar3.f24856c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                g8.c();
                            }
                        }
                        rVar.f24336b.n(rVar2.f24341h);
                    }
                }
                return a2Var.o(i);
            }
            if (!a2Var.l(i)) {
                return a2Var.o(i);
            }
        } else if (a2Var.d(i)) {
            int i13 = iArr[(i * 5) + 3] + i;
            int i14 = 0;
            for (int i15 = i + 1; i15 < i13; i15 += iArr[(i15 * 5) + 3]) {
                boolean l10 = a2Var.l(i15);
                if (l10) {
                    bVar.c();
                    Object n10 = a2Var.n(i15);
                    bVar.c();
                    bVar.f24860h.add(n10);
                }
                if (!l10 && !z3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (l10) {
                    i11 = 0;
                } else {
                    i11 = i10 + i14;
                }
                i14 += Q(rVar, i15, z9, i11);
                if (l10) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!a2Var.l(i)) {
                return i14;
            }
        } else if (!a2Var.l(i)) {
            return a2Var.o(i);
        }
        return 1;
    }

    public final boolean A() {
        if (D() && !this.f24355w) {
            q1 z3 = z();
            if (z3 == null || (z3.f24330b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final c B() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean C() {
        return this.S;
    }

    public final boolean D() {
        q1 z3;
        if (!this.S && !this.f24357y && !this.f24355w && (z3 = z()) != null && (z3.f24330b & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void E(ArrayList arrayList) {
        a aVar = this.f24339f;
        b bVar = this.M;
        a aVar2 = bVar.f24855b;
        try {
            bVar.f24855b = aVar;
            aVar.f24852a.e(z.f24905c);
            if (arrayList.size() <= 0) {
                bVar.f24855b.f24852a.e(n.f24890c);
                bVar.f24858f = 0;
            } else {
                pe.j jVar = (pe.j) arrayList.get(0);
                z0 z0Var = (z0) jVar.f22693u;
                z0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f24855b = aVar2;
        }
    }

    public final void F(g gVar, Object obj) {
        boolean z3;
        Y(126665345, null);
        G();
        l0(obj);
        long j10 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                e2.y(this.I);
            }
            if (this.S || kotlin.jvm.internal.a(this.G.f(), gVar)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                M(gVar);
            }
            V(202, 0, s.f24369c, gVar);
            this.K = null;
            boolean z9 = this.f24355w;
            this.f24355w = z3;
            h.c(this, new c(316014703, new q(0, obj), true));
            this.f24355w = z9;
        } finally {
        }
    }

    public final Object G() {
        boolean z3 = this.S;
        v0 v0Var = l.f24285a;
        if (z3) {
            if (this.f24350r) {
                c("A call to createNode(), emitNode() or useNode() expected");
                return v0Var;
            }
        } else {
            Object m4 = this.G.m();
            if (!this.f24357y || (m4 instanceof o)) {
                return m4;
            }
        }
        return v0Var;
    }

    public final List H() {
        x xVar;
        u uVar = this.f24336b;
        t g8 = uVar.g();
        if (g8 != null) {
            xVar = (x) g8;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            b2 b2Var = xVar.f24431z;
            a2 g10 = b2Var.g();
            try {
                Integer b10 = wa.b(g10, uVar, 0, g10.f24180c);
                if (b10 != null) {
                    try {
                        return wa.c(b2Var.g(), b10.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return qe.s.f24023u;
    }

    public final int I(int i) {
        int q10 = this.G.q(i) + 1;
        int i10 = 0;
        while (q10 < i) {
            if (!this.G.k(q10)) {
                i10++;
            }
            q10 += this.G.f24179b[(q10 * 5) + 3];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(x r9, x r10, java.lang.Integer r11, java.util.List r12, df.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f24343k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r8.f24343k = r2     // Catch: java.lang.Throwable -> L27
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            r4 = r2
        L12:
            r5 = 0
            if (r4 >= r3) goto L2f
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L27
            pe.j r6 = (pe.j) r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.f22693u     // Catch: java.lang.Throwable -> L27
            q1 r7 = (q1) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.f22694v     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r8.g0(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r9 = move-exception
            goto L65
        L29:
            r8.g0(r7, r5)     // Catch: java.lang.Throwable -> L27
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            if (r9 == 0) goto L5c
            if (r11 == 0) goto L38
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L27
            goto L39
        L38:
            r11 = -1
        L39:
            if (r10 == 0) goto L56
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L56
            if (r11 < 0) goto L56
            r9.J = r10     // Catch: java.lang.Throwable -> L27
            r9.K = r11     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L50
            r9.J = r5     // Catch: java.lang.Throwable -> L27
            r9.K = r2     // Catch: java.lang.Throwable -> L27
            goto L5a
        L50:
            r10 = move-exception
            r9.J = r5     // Catch: java.lang.Throwable -> L27
            r9.K = r2     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L56:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L5a:
            if (r10 != 0) goto L60
        L5c:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L60:
            r8.F = r0
            r8.f24343k = r1
            return r10
        L65:
            r8.F = r0
            r8.f24343k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.J(x, x, java.lang.Integer, java.util.List, df.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.f24318b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0340  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.K():void");
    }

    public final void L() {
        int i;
        P(this.G.f24183g);
        b bVar = this.M;
        bVar.d(false);
        t tVar = bVar.f24857d;
        r rVar = bVar.f24854a;
        a2 a2Var = rVar.G;
        if (a2Var.f24180c > 0 && tVar.c(-2) != (i = a2Var.i)) {
            if (!bVar.f24856c && bVar.e) {
                bVar.d(false);
                bVar.f24855b.f24852a.e(q.f24893c);
                bVar.f24856c = true;
            }
            if (i > 0) {
                a a10 = a2Var.a(i);
                tVar.e(i);
                bVar.d(false);
                k0 k0Var = bVar.f24855b.f24852a;
                k0Var.e(p.f24892c);
                sb.a(k0Var, 0, a10);
                bVar.f24856c = true;
            }
        }
        bVar.f24855b.f24852a.e(x.f24903c);
        int i10 = bVar.f24858f;
        a2 a2Var2 = rVar.G;
        bVar.f24858f = a2Var2.f24179b[(a2Var2.f24183g * 5) + 3] + i10;
    }

    public final void M(g gVar) {
        w wVar = this.f24354v;
        if (wVar == null) {
            wVar = new w();
            this.f24354v = wVar;
        }
        wVar.i(this.G.f24183g, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(int r7, int r8, int r9) {
        /*
            r6 = this;
            a2 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = q(r7)
            int r2 = q(r8)
            if (r1 != r2) goto L2b
            int r9 = q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = q(r9)
            int r1 = q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = l(r7)
            if (r1 == 0) goto L7a
            b r1 = r6.M
            a()
        L7a:
            int r7 = q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.N(int, int, int):void");
    }

    public final Object O() {
        boolean z3 = this.S;
        v0 v0Var = l.f24285a;
        if (z3) {
            if (this.f24350r) {
                c("A call to createNode(), emitNode() or useNode() expected");
                return v0Var;
            }
        } else {
            Object m4 = this.G.m();
            if (!this.f24357y || (m4 instanceof o)) {
                if (m4 instanceof w1) {
                    return ((w1) m4).f24424a;
                }
                return m4;
            }
        }
        return v0Var;
    }

    public final void P(int i) {
        boolean l10 = this.G.l(i);
        b bVar = this.M;
        if (l10) {
            bVar.c();
            Object n10 = this.G.n(i);
            bVar.c();
            bVar.f24860h.add(n10);
        }
        Q(this, i, l10, 0);
        bVar.c();
        if (l10) {
            bVar.a();
        }
    }

    public final boolean R(int i, boolean z3) {
        if ((i & 1) == 0 && (this.S || this.f24357y)) {
            if (this.P != null) {
                z();
                return true;
            }
        } else if (!z3 && D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.S():void");
    }

    public final void T() {
        int i;
        a2 a2Var = this.G;
        int i10 = a2Var.i;
        if (i10 >= 0) {
            i = a2Var.f24179b[(i10 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.f24344l = i;
        a2Var.t();
    }

    public final void U() {
        if (this.f24344l != 0) {
            c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            q1 z3 = z();
            if (z3 != null) {
                int i = z3.f24330b;
                if ((i & 128) == 0) {
                    z3.f24330b = i | 16;
                }
            }
            if (this.f24351s.isEmpty()) {
                T();
            } else {
                K();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.V(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void W() {
        V(-127, 0, null, null);
    }

    public final void X(int i, c1 c1Var) {
        V(i, 0, c1Var, null);
    }

    public final void Y(int i, Object obj) {
        V(i, 0, obj, null);
    }

    public final void Z(Object obj, boolean z3) {
        if (z3) {
            a2 a2Var = this.G;
            if (a2Var.f24186k <= 0) {
                if ((a2Var.f24179b[(a2Var.f24183g * 5) + 1] & 1073741824) == 0) {
                    a("Expected a node group");
                }
                a2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            k0 k0Var = bVar.f24855b.f24852a;
            k0Var.e(e0.f24871c);
            sb.a(k0Var, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.f24346n.f1592a = 0;
        this.f24352t.f1592a = 0;
        this.f24356x.f1592a = 0;
        this.f24354v = null;
        c cVar = this.O;
        cVar.f24866b.a();
        cVar.f24865a.a();
        this.T = 0;
        this.A = 0;
        this.f24350r = false;
        this.S = false;
        this.f24357y = false;
        this.F = false;
        this.f24358z = -1;
        a2 a2Var = this.G;
        if (!a2Var.f24182f) {
            a2Var.c();
        }
        if (!this.I.f24237w) {
            x();
        }
    }

    public final void a0(int i) {
        int i10;
        int i11;
        if (this.f24342j != null) {
            V(i, 0, null, null);
            return;
        }
        if (this.f24350r) {
            c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.f24345m;
        this.f24345m++;
        a2 a2Var = this.G;
        boolean z3 = this.S;
        v0 v0Var = l.f24285a;
        if (z3) {
            a2Var.f24186k++;
            this.I.P(i, v0Var, v0Var, false);
            w(false, null);
            return;
        }
        if (a2Var.g() == i && ((i11 = a2Var.f24183g) >= a2Var.f24184h || (a2Var.f24179b[(i11 * 5) + 1] & 536870912) == 0)) {
            a2Var.u();
            w(false, null);
            return;
        }
        if (a2Var.f24186k <= 0 && (i10 = a2Var.f24183g) != a2Var.f24184h) {
            int i12 = this.f24343k;
            L();
            this.M.e(i12, a2Var.s());
            a(i10, a2Var.f24183g, this.f24351s);
        }
        a2Var.f24186k++;
        this.S = true;
        this.K = null;
        if (this.I.f24237w) {
            e2 k3 = this.H.k();
            this.I = k3;
            k3.L();
            this.J = false;
            this.K = null;
        }
        e2 e2Var = this.I;
        e2Var.d();
        int i13 = e2Var.f24234t;
        e2Var.P(i, v0Var, v0Var, false);
        this.N = e2Var.b(i13);
        w(false, null);
    }

    public final void b(df.p pVar, Object obj) {
        if (this.S) {
            k0 k0Var = this.O.f24865a;
            k0Var.e(f0.f24873c);
            sb.a(k0Var, 0, obj);
            pVar.getClass();
            kotlin.jvm.internal.b(2, pVar);
            sb.a(k0Var, 1, pVar);
            return;
        }
        b bVar = this.M;
        bVar.b();
        k0 k0Var2 = bVar.f24855b.f24852a;
        k0Var2.e(f0.f24873c);
        pVar.getClass();
        kotlin.jvm.internal.b(2, pVar);
        sb.b(k0Var2, 0, obj, 1, pVar);
    }

    public final void b0(int i) {
        V(i, 0, null, null);
    }

    public final boolean c(float f10) {
        Object G = G();
        if ((G instanceof Float) && f10 == ((Number) G).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f10));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r0.r c0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            ic.c r0 = r6.f24340g
            java.util.ArrayList r1 = r6.E
            x r2 = r6.f24341h
            if (r7 == 0) goto L26
            q1 r7 = new q1
            r7.<init>(r2)
            r1.add(r7)
            r6.l0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.f24330b
            r1 = r1 & (-17)
            r7.f24330b = r1
            h()
            return r6
        L26:
            a2 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.f24351s
            int r7 = r0.e(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            p0 r7 = (p0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            a2 r3 = r6.G
            java.lang.Object r3 = r3.m()
            v0 r4 = l.f24285a
            boolean r4 = kotlin.jvm.internal.a(r3, r4)
            if (r4 == 0) goto L51
            q1 r3 = new q1
            r3.<init>(r2)
            r6.l0(r3)
            goto L56
        L51:
            r3.getClass()
            q1 r3 = (q1) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.f24330b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.f24330b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.f24330b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.f24330b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.f24330b
            r7 = r7 & (-17)
            r3.f24330b = r7
            h()
            int r7 = r3.f24330b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb4
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.f24330b = r7
            b r7 = r6.M
            a r7 = r7.f24855b
            k0 r7 = r7.f24852a
            c0 r0 = c0.f24867c
            r7.e(r0)
            ya.sb.a(r7, r2, r3)
            boolean r7 = r6.f24357y
            if (r7 != 0) goto Lb4
            int r7 = r3.f24330b
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lb4
            r6.f24357y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f24330b = r7
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.c0(int):r0.r");
    }

    public final boolean d(int i) {
        Object G = G();
        if ((G instanceof Integer) && i == ((Number) G).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !kotlin.jvm.internal.a(this.G.f(), obj) && this.f24358z < 0) {
            this.f24358z = this.G.f24183g;
            this.f24357y = true;
        }
        V(207, 0, null, obj);
    }

    public final boolean e(long j10) {
        Object G = G();
        if ((G instanceof Long) && j10 == ((Number) G).longValue()) {
            return false;
        }
        l0(Long.valueOf(j10));
        return true;
    }

    public final void e0() {
        V(125, 2, null, null);
        this.f24350r = true;
    }

    public final boolean f(Object obj) {
        if (!kotlin.jvm.internal.a(G(), obj)) {
            l0(obj);
            return true;
        }
        return false;
    }

    public final void f0() {
        this.f24345m = 0;
        this.G = this.f24337c.g();
        V(100, 0, null, null);
        u uVar = this.f24336b;
        uVar.o();
        g h3 = uVar.h();
        this.f24356x.e(this.f24355w ? 1 : 0);
        this.f24355w = f(h3);
        this.K = null;
        if (!this.f24349q) {
            this.f24349q = uVar.d();
        }
        if (!this.C) {
            this.C = uVar.e();
        }
        if (this.C) {
            o2 o2Var = d.f3447a;
            o2Var.getClass();
            h3 = h3.e(o2Var, new p2(B()));
        }
        this.f24353u = h3;
        Set set = (Set) y.E(h3, f.f3449a);
        if (set != null) {
            w wVar = this.U;
            if (wVar == null) {
                wVar = new w(this.f24341h);
                this.U = wVar;
            }
            set.add(wVar);
            uVar.l(set);
        }
        V(Long.hashCode(uVar.f()), 0, null, null);
    }

    public final boolean g(boolean z3) {
        Object G = G();
        if ((G instanceof Boolean) && z3 == ((Boolean) G).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z3));
        return true;
    }

    public final boolean g0(q1 q1Var, Object obj) {
        a aVar = q1Var.f24331c;
        if (aVar != null) {
            int a10 = this.G.f24178a.a(aVar);
            if (this.F && a10 >= this.G.f24183g) {
                ArrayList arrayList = this.f24351s;
                int e = e(a10, arrayList);
                if (e < 0) {
                    int i = -(e + 1);
                    if (!(obj instanceof g0)) {
                        obj = null;
                    }
                    arrayList.add(i, new p0(q1Var, a10, obj));
                    return true;
                }
                p0 p0Var = (p0) arrayList.get(e);
                if (obj instanceof g0) {
                    Object obj2 = p0Var.f24319c;
                    if (obj2 == null) {
                        p0Var.f24319c = obj;
                        return true;
                    }
                    if (obj2 instanceof j0) {
                        ((j0) obj2).a(obj);
                        return true;
                    }
                    int i10 = q0.f20928a;
                    j0 j0Var = new j0(2);
                    j0Var.j(obj2);
                    j0Var.j(obj);
                    p0Var.f24319c = j0Var;
                    return true;
                }
                p0Var.f24319c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h(Object obj) {
        if (G() != obj) {
            l0(obj);
            return true;
        }
        return false;
    }

    public final void h0(i0 i0Var) {
        ArrayList arrayList = this.f24351s;
        for (int f10 = qe.f(arrayList); -1 < f10; f10--) {
            p0 p0Var = (p0) arrayList.get(f10);
            a aVar = p0Var.f24317a.f24331c;
            if (aVar != null && aVar.a()) {
                int i = p0Var.f24318b;
                int i10 = aVar.f24176a;
                if (i != i10) {
                    p0Var.f24318b = i10;
                }
            } else {
                arrayList.remove(f10);
            }
        }
        Object[] objArr = i0Var.f20893b;
        Object[] objArr2 = i0Var.f20894c;
        long[] jArr = i0Var.f20892a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            obj.getClass();
                            q1 q1Var = (q1) obj;
                            a aVar2 = q1Var.f24331c;
                            if (aVar2 != null) {
                                int i15 = aVar2.f24176a;
                                if (obj2 == v0.f24420y) {
                                    obj2 = null;
                                }
                                arrayList.add(new p0(q1Var, i15, obj2));
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        qe.m(arrayList, s.f24371f);
    }

    public final void i() {
        this.f24342j = null;
        this.f24343k = 0;
        this.f24344l = 0;
        this.T = 0L;
        this.f24350r = false;
        b bVar = this.M;
        bVar.f24856c = false;
        bVar.f24857d.f1592a = 0;
        bVar.f24858f = 0;
        bVar.e = true;
        bVar.f24859g = 0;
        bVar.f24860h.clear();
        bVar.i = -1;
        bVar.f24861j = -1;
        bVar.f24862k = -1;
        bVar.f24863l = 0;
        this.E.clear();
        this.f24347o = null;
        this.f24348p = null;
    }

    public final void i0(int i, int i10) {
        if (m0(i) != i10) {
            if (i < 0) {
                u uVar = this.f24348p;
                if (uVar == null) {
                    uVar = new u();
                    this.f24348p = uVar;
                }
                uVar.f(i, i10);
                return;
            }
            int[] iArr = this.f24347o;
            if (iArr == null) {
                int i11 = this.G.f24180c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f24347o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i10;
        }
    }

    public final Object j(p1 p1Var) {
        return y.E(l(), p1Var);
    }

    public final void j0(int i, int i10) {
        int m0 = m0(i);
        if (m0 != i10) {
            int i11 = i10 - m0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int m02 = m0(i) + i11;
                i0(i, m02);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        m1 m1Var = (m1) arrayList.get(i12);
                        if (m1Var != null && m1Var.a(i, m02)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                a2 a2Var = this.G;
                if (i < 0) {
                    i = a2Var.i;
                } else if (!a2Var.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final void k(df.a aVar) {
        if (!this.f24350r) {
            c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f24350r = false;
        if (!this.S) {
            c("createNode() can only be called when inserting");
        }
        t tVar = this.f24346n;
        int i = tVar.f1593b[tVar.f1592a - 1];
        e2 e2Var = this.I;
        a b10 = e2Var.b(e2Var.f24236v);
        this.f24344l++;
        c cVar = this.O;
        k0 k0Var = cVar.f24865a;
        k0Var.e(s0.r.f24894d);
        sb.a(k0Var, 0, aVar);
        k0Var.f24885c[k0Var.f24886d - k0Var.f24883a[k0Var.f24884b - 1].f24879a] = i;
        sb.a(k0Var, 1, b10);
        k0 k0Var2 = cVar.f24866b;
        k0Var2.e(s0.r.e);
        k0Var2.f24885c[k0Var2.f24886d - k0Var2.f24883a[k0Var2.f24884b - 1].f24879a] = i;
        sb.a(k0Var2, 0, b10);
    }

    public final void k0(Object obj) {
        int i;
        a2 a2Var;
        int i10;
        e2 e2Var;
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            a aVar = null;
            if (this.S) {
                e2 e2Var2 = this.I;
                int i11 = e2Var2.f24234t;
                if (i11 > e2Var2.f24236v + 1) {
                    int i12 = i11 - 1;
                    int D = e2Var2.D(i12, e2Var2.f24218b);
                    while (true) {
                        i10 = i12;
                        i12 = D;
                        e2Var = this.I;
                        if (i12 == e2Var.f24236v || i12 < 0) {
                            break;
                        } else {
                            D = e2Var.D(i12, e2Var.f24218b);
                        }
                    }
                    aVar = e2Var.b(i10);
                }
            } else {
                a2 a2Var2 = this.G;
                int i13 = a2Var2.f24183g;
                if (i13 > a2Var2.i + 1) {
                    int i14 = i13 - 1;
                    int q10 = a2Var2.q(i14);
                    while (true) {
                        i = i14;
                        i14 = q10;
                        a2Var = this.G;
                        if (i14 == a2Var.i || i14 < 0) {
                            break;
                        } else {
                            q10 = a2Var.q(i14);
                        }
                    }
                    aVar = a2Var.a(i);
                }
            }
            w1 w1Var = new w1(v1Var, aVar);
            if (this.S) {
                k0 k0Var = this.M.f24855b.f24852a;
                k0Var.e(w.f24902c);
                sb.a(k0Var, 0, w1Var);
            }
            this.f24338d.add(obj);
            obj = w1Var;
        }
        l0(obj);
    }

    public final g l() {
        g gVar;
        g gVar2 = this.K;
        if (gVar2 != null) {
            return gVar2;
        }
        int i = this.G.i;
        boolean z3 = this.S;
        c1 c1Var = s.f24369c;
        if (z3 && this.J) {
            int i10 = this.I.f24236v;
            while (i10 > 0) {
                e2 e2Var = this.I;
                if (e2Var.f24218b[e2Var.r(i10) * 5] == 202 && kotlin.jvm.internal.a(this.I.s(i10), c1Var)) {
                    Object q10 = this.I.q(i10);
                    q10.getClass();
                    g gVar3 = (g) q10;
                    this.K = gVar3;
                    return gVar3;
                }
                e2 e2Var2 = this.I;
                i10 = e2Var2.D(i10, e2Var2.f24218b);
            }
        }
        if (this.G.f24180c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    a2 a2Var = this.G;
                    if (kotlin.jvm.internal.a(a2Var.p(i, a2Var.f24179b), c1Var)) {
                        w wVar = this.f24354v;
                        if (wVar == null || (gVar = (g) wVar.b(i)) == null) {
                            a2 a2Var2 = this.G;
                            Object b10 = a2Var2.b(i, a2Var2.f24179b);
                            b10.getClass();
                            gVar = (g) b10;
                        }
                        this.K = gVar;
                        return gVar;
                    }
                }
                i = this.G.q(i);
            }
        }
        g gVar4 = this.f24353u;
        this.K = gVar4;
        return gVar4;
    }

    public final void l0(Object obj) {
        if (this.S) {
            e2 e2Var = this.I;
            if (e2Var.f24228n > 0 && e2Var.i != e2Var.f24225k) {
                w wVar = e2Var.f24233s;
                if (wVar == null) {
                    wVar = new w();
                }
                e2Var.f24233s = wVar;
                int i = e2Var.f24236v;
                Object b10 = wVar.b(i);
                if (b10 == null) {
                    b10 = new d0();
                    wVar.i(i, b10);
                }
                ((d0) b10).a(obj);
                return;
            }
            e2Var.E(obj);
            return;
        }
        a2 a2Var = this.G;
        boolean z3 = a2Var.f24189n;
        b bVar = this.M;
        if (z3) {
            int b11 = (a2Var.f24187l - d2.b(a2Var.i, a2Var.f24179b)) - 1;
            if (bVar.f24854a.G.i - bVar.f24858f < 0) {
                a2 a2Var2 = this.G;
                a a10 = a2Var2.a(a2Var2.i);
                k0 k0Var = bVar.f24855b.f24852a;
                k0Var.e(s0.r.f24895f);
                sb.b(k0Var, 0, obj, 1, a10);
                k0Var.f24885c[k0Var.f24886d - k0Var.f24883a[k0Var.f24884b - 1].f24879a] = b11;
                return;
            }
            bVar.d(true);
            k0 k0Var2 = bVar.f24855b.f24852a;
            k0Var2.e(s0.r.f24896g);
            sb.a(k0Var2, 0, obj);
            k0Var2.f24885c[k0Var2.f24886d - k0Var2.f24883a[k0Var2.f24884b - 1].f24879a] = b11;
            return;
        }
        a a11 = a2Var.a(a2Var.i);
        k0 k0Var3 = bVar.f24855b.f24852a;
        k0Var3.e(e.f24870c);
        sb.b(k0Var3, 0, a11, 1, obj);
    }

    public final List m() {
        boolean z3 = this.C;
        List list = qe.s.f24023u;
        if (!z3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        e2 e2Var = this.I;
        arrayList.addAll(wa.a(e2Var, null, e2Var.f24234t, null));
        a2 a2Var = this.G;
        if (!a2Var.f24182f && a2Var.f24180c != 0) {
            i iVar = new i(a2Var);
            int i = a2Var.i;
            Object valueOf = Integer.valueOf(a2Var.f24187l - d2.b(i, a2Var.f24179b));
            while (i >= 0) {
                iVar.m(a2Var.f24178a.o(i), valueOf);
                valueOf = a2Var.a(i);
                i = a2Var.q(i);
            }
            list = (ArrayList) iVar.f3443v;
        }
        arrayList.addAll(list);
        arrayList.addAll(H());
        return arrayList;
    }

    public final int m0(int i) {
        int i10;
        if (i < 0) {
            u uVar = this.f24348p;
            if (uVar == null || uVar.c(i) < 0) {
                return 0;
            }
            int c10 = uVar.c(i);
            if (c10 >= 0) {
                return uVar.f20949c[c10];
            }
            l4.a.h(g3.a.g(i, "Cannot find value for key "));
            return 0;
        }
        int[] iArr = this.f24347o;
        if (iArr != null && (i10 = iArr[i]) >= 0) {
            return i10;
        }
        return this.G.o(i);
    }

    public final void n(i0 i0Var, df.p pVar) {
        ArrayList arrayList = this.f24351s;
        if (this.F) {
            c("Reentrant composition is not supported");
        }
        this.f24340g.h();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(p.k().g());
            this.f24354v = null;
            h0(i0Var);
            this.f24343k = 0;
            this.F = true;
            try {
                f0();
                Object G = G();
                if (G != pVar && pVar != null) {
                    l0(pVar);
                }
                z zVar = this.D;
                e q10 = y.q();
                try {
                    q10.b(zVar);
                    c1 c1Var = s.f24367a;
                    if (pVar != null) {
                        X(200, c1Var);
                        h.c(this, pVar);
                        p(false);
                    } else if (this.f24355w && G != null && !G.equals(l.f24285a)) {
                        X(200, c1Var);
                        kotlin.jvm.internal.b(2, G);
                        h.c(this, (df.p) G);
                        p(false);
                    } else {
                        S();
                    }
                    q10.n(q10.f25619w - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f24237w) {
                        c("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    q10.n(q10.f25619w - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n0() {
        if (!this.f24350r) {
            c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f24350r = false;
        if (this.S) {
            c("useNode() called while inserting");
        }
        a2 a2Var = this.G;
        Object n10 = a2Var.n(a2Var.i);
        b bVar = this.M;
        bVar.c();
        bVar.f24860h.add(n10);
        if (this.f24357y && (n10 instanceof j)) {
            bVar.b();
            bVar.f24855b.f24852a.e(h0.f24877c);
        }
    }

    public final void o(int i, int i10) {
        if (i > 0 && i != i10) {
            o(this.G.q(i), i10);
            if (this.G.l(i)) {
                Object n10 = this.G.n(i);
                b bVar = this.M;
                bVar.c();
                bVar.f24860h.add(n10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05be  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.r.p(boolean):void");
    }

    public final void q() {
        p(false);
        q1 z3 = z();
        if (z3 != null) {
            int i = z3.f24330b;
            if ((i & 1) != 0) {
                z3.f24330b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    public final q1 t() {
        q1 q1Var;
        q1 q1Var2;
        a a10;
        x4 x4Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            q1Var = (q1) arrayList.remove(arrayList.size() - 1);
        } else {
            q1Var = null;
        }
        if (q1Var != null) {
            q1Var.f24330b &= -9;
            this.f24340g.h();
            int i = this.B;
            c0 c0Var = q1Var.f24333f;
            if (c0Var != null && (q1Var.f24330b & 16) == 0) {
                Object[] objArr = c0Var.f20850b;
                int[] iArr = c0Var.f20851c;
                long[] jArr = c0Var.f20849a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j10 & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    if (iArr[i13] != i) {
                                        x4Var = new x4(q1Var, i, c0Var);
                                        break loop0;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            x4Var = null;
            b bVar = this.M;
            if (x4Var != null) {
                k0 k0Var = bVar.f24855b.f24852a;
                k0Var.e(l.f24888c);
                sb.b(k0Var, 0, x4Var, 1, this.f24341h);
            }
            int i14 = q1Var.f24330b;
            if ((i14 & 512) != 0) {
                q1Var.f24330b = i14 & (-513);
                k0 k0Var2 = bVar.f24855b.f24852a;
                k0Var2.e(o.f24891c);
                sb.a(k0Var2, 0, q1Var);
                int i15 = q1Var.f24330b;
                q1Var.f24330b = i15 & (-129);
                if ((i15 & 1024) != 0) {
                    q1Var.f24330b = i15 & (-1153);
                    this.f24357y = false;
                }
            }
        }
        if (q1Var != null) {
            int i16 = q1Var.f24330b;
            if ((i16 & 16) == 0 && ((i16 & 1) != 0 || this.f24349q)) {
                if (q1Var.f24331c == null) {
                    if (this.S) {
                        e2 e2Var = this.I;
                        a10 = e2Var.b(e2Var.f24236v);
                    } else {
                        a2 a2Var = this.G;
                        a10 = a2Var.a(a2Var.i);
                    }
                    q1Var.f24331c = a10;
                }
                q1Var.f24330b &= -5;
                q1Var2 = q1Var;
                p(false);
                return q1Var2;
            }
        }
        q1Var2 = null;
        p(false);
        return q1Var2;
    }

    public final void u() {
        if (this.F || this.f24358z != 100) {
            a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f24358z = -1;
        this.f24357y = false;
    }

    public final void v() {
        boolean z3 = false;
        p(false);
        this.f24336b.b();
        p(false);
        b bVar = this.M;
        if (bVar.f24856c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f24855b.f24852a.e(m.f24889c);
            bVar.f24856c = false;
        }
        bVar.b();
        if (bVar.f24857d.f1592a != 0) {
            c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            c("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.f24356x.d() != 0) {
            z3 = true;
        }
        this.f24355w = z3;
    }

    public final void w(boolean z3, m1 m1Var) {
        this.i.add(this.f24342j);
        this.f24342j = m1Var;
        int i = this.f24344l;
        t tVar = this.f24346n;
        tVar.e(i);
        tVar.e(this.f24345m);
        tVar.e(this.f24343k);
        if (z3) {
            this.f24343k = 0;
        }
        this.f24344l = 0;
        this.f24345m = 0;
    }

    public final void x() {
        b2 b2Var = new b2();
        if (this.C) {
            b2Var.b();
        }
        if (this.f24336b.c()) {
            b2Var.E = new w();
        }
        this.H = b2Var;
        e2 k3 = b2Var.k();
        k3.e(true);
        this.I = k3;
    }

    public final g y() {
        return l();
    }

    public final q1 z() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (q1) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }
}
