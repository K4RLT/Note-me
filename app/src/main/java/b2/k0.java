package b2;
import a0.f0;
import a1.k;
import b0.u;
import b1.v;
import c.g0;
import c0.d0;
import c2.x;
import d.e;
import g0.e1;
import g0.g2;
import g0.k2;
import g0.l1;
import g0.l;
import g0.n1;
import g0.t1;
import g0.w0;
import g1.a;
import g1.f;
import i1.j;
import i1.s;
import j.i0;
import j1.c;
import k0.e1;
import k0.j1;
import k0.l;
import k0.m1;
import k0.n1;
import k0.s;
import k1.b;
import k1.m0;
import k1.n;
import k1.o0;
import k1.p;
import k1.r;
import k1.t0;
import l.a;
import m.g;
import m1.b;
import m1.d;
import m1.e;
import m1.g;
import n1.b;
import p.c0;
import p.g0;
import p.j1;
import p.p0;
import p.p;
import p.q0;
import p.v0;
import p.v1;
import p.z;
import p0.b;
import p0.d;
import p0.e;
import q.b;
import q.c;
import q.d;
import q.e;
import q.j;
import q.l;
import q.x;
import r0.a1;
import r0.i1;
import s.f;
import s.k;
import t.i;
import t.j;
import t.m0;
import t.p;
import t.r1;
import t.v1;
import t.x1;
import t.z1;
import v1.h0;
import v1.t;
import v1.w;
import x.a;
import x.g0;
import x.h0;
import x.i0;
import z1.a1;
import z1.r0;
import z1.x;
import z1.z0;

import android.graphics.Canvas;
import android.os.Build;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.measurement.e4;
import java.util.List;
import java.util.concurrent.CancellationException;
import r0.n2;
import wa.r6;
import wa.s6;
import wa.s8;
import ya.be;
import ya.ed;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1518u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1519v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1520w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1521x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(s sVar, j jVar, df.l lVar) {
        super(1);
        this.f1518u = 9;
        this.f1519v = sVar;
        this.f1520w = jVar;
        this.f1521x = (kotlin.jvm.internal.m) lVar;
    }

    private final Object e(Object obj) {
        float b10;
        n00 n00Var = (n00) this.f1519v;
        ed.a(n00Var, (t) obj);
        h0 h0Var = (h0) ((w) this.f1520w);
        h0Var.getClass();
        float e = l.u(h0Var).U.e();
        long b11 = n00Var.b(be.a(e, e));
        n00Var.c();
        rf.h hVar = ((r1) this.f1521x).O;
        if (hVar != null) {
            int i = m0.f25467a;
            float f10 = 0.0f;
            if (Float.isNaN(y2.b(b11))) {
                b10 = 0.0f;
            } else {
                b10 = y2.b(b11);
            }
            if (!Float.isNaN(y2.c(b11))) {
                f10 = y2.c(b11);
            }
            hVar.e(new p(be.a(b10, f10)));
        }
        return pe.z.f22715a;
    }

    private final Object g(Object obj) {
        z0 z0Var = (z0) obj;
        r0 r0Var = (r0) this.f1521x;
        g0 g0Var = (g0) this.f1519v;
        boolean z3 = g0Var.K;
        a1 a1Var = (a1) this.f1520w;
        float f10 = g0Var.I;
        if (z3) {
            z0.k(z0Var, a1Var, r0Var.t0(f10), r0Var.t0(g0Var.J));
        } else {
            z0.i(z0Var, a1Var, r0Var.t0(f10), r0Var.t0(g0Var.J));
        }
        return pe.z.f22715a;
    }

    private final Object h(Object obj) {
        z0 z0Var = (z0) obj;
        h0 h0Var = (h0) this.f1519v;
        long j10 = ((y2.j) h0Var.I.invoke((r0) this.f1520w)).f30808a;
        boolean z3 = h0Var.J;
        a1 a1Var = (a1) this.f1521x;
        if (z3) {
            z0.l(z0Var, a1Var, (int) (j10 >> 32), (int) (j10 & 4294967295L));
        } else {
            z0.n(z0Var, a1Var, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
        }
        return pe.z.f22715a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.l
    public final Object invoke(Object obj) {
        n nVar;
        x xVar;
        long j10;
        boolean z3;
        n c10;
        x2.n nVar2;
        p pVar;
        long j11;
        float f10;
        m2.e eVar;
        Integer e;
        Integer d2;
        Integer d10;
        Integer e8;
        m2.m0 m0Var;
        m2.m0 m0Var2;
        g2 g2Var;
        g2 g2Var2;
        m2.m0 m0Var3;
        m2.m0 m0Var4;
        g2 g2Var3;
        g2 g2Var4;
        Integer d11;
        Integer e10;
        Integer e11;
        Integer d12;
        e4 e4Var;
        float f11;
        float f12;
        float f13;
        long j12;
        long j13;
        float f14;
        int i = this.f1518u;
        int i10 = 3;
        int i11 = 4;
        int i12 = 2;
        int i13 = 8;
        boolean z9 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        r2.x xVar2 = null;
        r10 = null;
        t0 t0Var = null;
        Object obj2 = null;
        xVar2 = null;
        int i14 = 1;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f1520w;
        Object obj4 = this.f1519v;
        Object obj5 = this.f1521x;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                l0 l0Var = (l0) obj4;
                b bVar = l0Var.f1533u;
                n nVar3 = l0Var.f1534v;
                l0Var.f1534v = (n) obj3;
                try {
                    y2.c l10 = dVar.p0().l();
                    y2.m o10 = dVar.p0().o();
                    p j14 = dVar.p0().j();
                    long r8 = dVar.p0().r();
                    b bVar2 = (b) dVar.p0().f18637w;
                    c0 c0Var = (c0) obj5;
                    y2.c l11 = bVar.f20424v.l();
                    y2.m o11 = bVar.f20424v.o();
                    p j15 = bVar.f20424v.j();
                    long r10 = bVar.f20424v.r();
                    i0 i0Var = bVar.f20424v;
                    try {
                        b bVar3 = (b) i0Var.f18637w;
                        i0Var.G(l10);
                        i0Var.H(o10);
                        i0Var.F(j14);
                        i0Var.I(r8);
                        i0Var.f18637w = bVar2;
                        j14.l();
                        try {
                            c0Var.invoke(l0Var);
                            j14.s();
                            i0 i0Var2 = bVar.f20424v;
                            i0Var2.G(l11);
                            i0Var2.H(o11);
                            i0Var2.F(j15);
                            i0Var2.I(r10);
                            i0Var2.f18637w = bVar3;
                            l0Var.f1534v = nVar3;
                            return zVar;
                        } catch (Throwable th) {
                            nVar = nVar3;
                            try {
                                j14.s();
                                i0 i0Var3 = bVar.f20424v;
                                i0Var3.G(l11);
                                i0Var3.H(o11);
                                i0Var3.F(j15);
                                i0Var3.I(r10);
                                i0Var3.f18637w = bVar3;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                l0Var.f1534v = nVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        nVar = nVar3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    nVar = nVar3;
                }
            case 1:
                b3.s sVar = (b3.s) obj4;
                i0 i0Var4 = (i0) obj3;
                b3.s sVar2 = (b3.s) obj5;
                p j16 = ((d) obj).p0().j();
                if (sVar.getView().getVisibility() != 8) {
                    sVar.R = true;
                    v1 v1Var = i0Var4.H;
                    if (v1Var instanceof x) {
                        xVar = (x) v1Var;
                    } else {
                        xVar = null;
                    }
                    if (xVar != null) {
                        Canvas a10 = b.a(j16);
                        xVar.getAndroidViewsHandler$ui_release().getClass();
                        sVar2.draw(a10);
                    }
                    sVar.R = false;
                }
                return zVar;
            case 2:
                e eVar2 = (e) obj5;
                ((g0) obj4).a((androidx.lifecycle.w) obj3, eVar2);
                return new u(7, eVar2);
            case 3:
                r2.x xVar3 = (r2.x) obj;
                ((a1) obj3).setValue(xVar3);
                a1 a1Var = (a1) obj5;
                boolean a11 = kotlin.jvm.internal.a((String) a1Var.getValue(), xVar3.f24515a.f20477v);
                m2.g gVar = xVar3.f24515a;
                a1Var.setValue(gVar.f20477v);
                if (!a11) {
                    ((df.l) obj4).invoke(gVar.f20477v);
                }
                return zVar;
            case 4:
                d dVar2 = (d) obj;
                e1 e1Var = (e1) obj4;
                g2 d13 = e1Var.d();
                if (d13 != null) {
                    r2.x xVar4 = (r2.x) obj3;
                    r2.q qVar = (r2.q) obj5;
                    p j17 = dVar2.p0().j();
                    long j18 = ((m2.p0) e1Var.f17085z.getValue()).f20546a;
                    long j19 = ((m2.p0) e1Var.A.getValue()).f20546a;
                    m2.m0 m0Var5 = d13.f17113a;
                    m2.q qVar2 = m0Var5.f20525b;
                    m2.l0 l0Var2 = m0Var5.f20524a;
                    f0 f0Var = e1Var.f17083x;
                    long j20 = e1Var.f17084y;
                    if (!m2.b(j18)) {
                        f0Var.H(j20);
                        int g8 = qVar.g(m2.e(j18));
                        int g10 = qVar.g(m2.d(j18));
                        if (g8 != g10) {
                            j17.f(m0Var5.j(g8, g10), f0Var);
                        }
                    } else if (!m2.b(j19)) {
                        long b10 = l0Var2.f20515b.b();
                        r rVar = new r(b10);
                        if (b10 == 16) {
                            rVar = null;
                        }
                        if (rVar != null) {
                            j10 = rVar.f19523a;
                        } else {
                            j10 = r.f19513b;
                        }
                        f0Var.H(r.c(j10, r.d(j10) * 0.2f));
                        int g11 = qVar.g(m2.e(j19));
                        int g12 = qVar.g(m2.d(j19));
                        if (g11 != g12) {
                            j17.f(m0Var5.j(g11, g12), f0Var);
                        }
                    } else if (!m2.b(xVar4.f24516b)) {
                        f0Var.H(j20);
                        long j21 = xVar4.f24516b;
                        int g13 = qVar.g(m2.e(j21));
                        int g14 = qVar.g(m2.d(j21));
                        if (g13 != g14) {
                            j17.f(m0Var5.j(g13, g14), f0Var);
                        }
                    }
                    if (m0Var5.e() && l0Var2.f20518f != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        long j22 = m0Var5.f20526c;
                        c a12 = s8.a(0L, (Float.floatToRawIntBits((int) (j22 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j22 & 4294967295L)) & 4294967295L));
                        j17.l();
                        p.t(j17, a12);
                    }
                    m2.h0 h0Var = l0Var2.f20515b.f20555a;
                    x2.l lVar = h0Var.f20494m;
                    x2.o oVar = h0Var.f20484a;
                    if (lVar == null) {
                        lVar = x2.l.f30061b;
                    }
                    x2.l lVar2 = lVar;
                    o0 o0Var = h0Var.f20495n;
                    if (o0Var == null) {
                        o0Var = o0.f19508d;
                    }
                    o0 o0Var2 = o0Var;
                    e eVar3 = h0Var.f20497p;
                    if (eVar3 == null) {
                        eVar3 = g.f20429a;
                    }
                    e eVar4 = eVar3;
                    try {
                        c10 = oVar.c();
                        nVar2 = x2.n.f30066a;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        if (c10 != null) {
                            if (oVar != nVar2) {
                                f10 = oVar.a();
                            } else {
                                f10 = 1.0f;
                            }
                            pVar = j17;
                            qVar2.j(pVar, c10, f10, o0Var2, lVar2, eVar4);
                        } else {
                            pVar = j17;
                            if (oVar != nVar2) {
                                j11 = oVar.b();
                            } else {
                                j11 = r.f19513b;
                            }
                            qVar2.i(pVar, j11, o0Var2, lVar2, eVar4);
                        }
                        if (!z3) {
                            return zVar;
                        }
                        pVar.s();
                        return zVar;
                    } catch (Throwable th6) {
                        th = th6;
                        if (z3) {
                            j17.s();
                        }
                        throw th;
                    }
                }
                return zVar;
            case 5:
                m2.e eVar5 = (m2.e) obj;
                m2.e eVar6 = (m2.e) obj3;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj4;
                if (uVar.f19783u) {
                    Object obj6 = eVar5.f20451a;
                    int i15 = eVar5.f20453c;
                    int i16 = eVar5.f20452b;
                    if ((obj6 instanceof m2.h0) && i16 == eVar6.f20452b && i15 == eVar6.f20453c) {
                        m2.h0 h0Var2 = (m2.h0) obj5;
                        if (h0Var2 == null) {
                            h0Var2 = new m2.h0(0L, 0L, (q2.s) null, (q2.o) null, (q2.p) null, (q2.i) null, (String) null, 0L, (x2.a) null, (x2.p) null, (t2.b) null, 0L, (x2.l) null, (o0) null, 65535);
                        }
                        eVar = new m2.e(h0Var2, i16, i15);
                        uVar.f19783u = eVar6.equals(eVar5);
                        return eVar;
                    }
                }
                eVar = eVar5;
                uVar.f19783u = eVar6.equals(eVar5);
                return eVar;
            case 6:
                df.l lVar3 = (df.l) obj3;
                r2.b0 b0Var = (r2.b0) ((kotlin.jvm.internal.y) obj5).f19787u;
                r2.x g15 = ((mu) obj4).g((List) obj);
                if (b0Var != null) {
                    b0Var.a(null, g15);
                }
                lVar3.invoke(g15);
                return zVar;
            case 7:
                e1 e1Var2 = (e1) obj;
                t1 t1Var = (t1) obj3;
                int i17 = 15;
                switch (((w0) obj4).ordinal()) {
                    case 0:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (m2.b(e1Var2.f19268f)) {
                                e1Var2.i();
                                break;
                            } else {
                                boolean f15 = e1Var2.f();
                                long j23 = e1Var2.f19268f;
                                if (f15) {
                                    int e12 = m2.e(j23);
                                    e1Var2.p(e12, e12);
                                    break;
                                } else {
                                    int d14 = m2.d(j23);
                                    e1Var2.p(d14, d14);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (m2.b(e1Var2.f19268f)) {
                                e1Var2.l();
                                break;
                            } else {
                                boolean f16 = e1Var2.f();
                                long j24 = e1Var2.f19268f;
                                if (f16) {
                                    int d15 = m2.d(j24);
                                    e1Var2.p(d15, d15);
                                    break;
                                } else {
                                    int e13 = m2.e(j24);
                                    e1Var2.p(e13, e13);
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        n1 n1Var = e1Var2.e;
                        n1Var.f19375a = null;
                        m2.g gVar2 = e1Var2.f19269g;
                        String str = gVar2.f20477v;
                        String str2 = gVar2.f20477v;
                        if (str.length() > 0) {
                            if (e1Var2.f()) {
                                n1Var.f19375a = null;
                                if (str2.length() > 0 && (d2 = e1Var2.d()) != null) {
                                    int intValue = d2.intValue();
                                    e1Var2.p(intValue, intValue);
                                    break;
                                }
                            } else {
                                n1Var.f19375a = null;
                                if (str2.length() > 0 && (e = e1Var2.e()) != null) {
                                    int intValue2 = e.intValue();
                                    e1Var2.p(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        n1 n1Var2 = e1Var2.e;
                        n1Var2.f19375a = null;
                        m2.g gVar3 = e1Var2.f19269g;
                        String str3 = gVar3.f20477v;
                        String str4 = gVar3.f20477v;
                        if (str3.length() > 0) {
                            if (e1Var2.f()) {
                                n1Var2.f19375a = null;
                                if (str4.length() > 0 && (e8 = e1Var2.e()) != null) {
                                    int intValue3 = e8.intValue();
                                    e1Var2.p(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                n1Var2.f19375a = null;
                                if (str4.length() > 0 && (d10 = e1Var2.d()) != null) {
                                    int intValue4 = d10.intValue();
                                    e1Var2.p(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        e1Var2.j();
                        break;
                    case 5:
                        e1Var2.k();
                        break;
                    case 6:
                        e1Var2.n();
                        break;
                    case 7:
                        e1Var2.m();
                        break;
                    case 8:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (e1Var2.f()) {
                                e1Var2.n();
                                break;
                            } else {
                                e1Var2.m();
                                break;
                            }
                        }
                        break;
                    case 9:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (e1Var2.f()) {
                                e1Var2.m();
                                break;
                            } else {
                                e1Var2.n();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (m0Var = e1Var2.f19266c) != null) {
                            int g16 = e1Var2.g(m0Var, -1);
                            e1Var2.p(g16, g16);
                            break;
                        }
                        break;
                    case 11:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (m0Var2 = e1Var2.f19266c) != null) {
                            int g17 = e1Var2.g(m0Var2, 1);
                            e1Var2.p(g17, g17);
                            break;
                        }
                        break;
                    case 12:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (g2Var = e1Var2.i) != null) {
                            int h3 = e1Var2.h(g2Var, -1);
                            e1Var2.p(h3, h3);
                            break;
                        }
                        break;
                    case 13:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (g2Var2 = e1Var2.i) != null) {
                            int h10 = e1Var2.h(g2Var2, 1);
                            e1Var2.p(h10, h10);
                            break;
                        }
                        break;
                    case 14:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            e1Var2.p(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        e1Var2.e.f19375a = null;
                        m2.g gVar4 = e1Var2.f19269g;
                        if (gVar4.f20477v.length() > 0) {
                            int length = gVar4.f20477v.length();
                            e1Var2.p(length, length);
                            break;
                        }
                        break;
                    case 16:
                        t1Var.f17287b.b(false);
                        break;
                    case 17:
                        t1Var.f17287b.m();
                        break;
                    case 18:
                        t1Var.f17287b.d();
                        break;
                    case 19:
                        List a13 = e1Var2.a(l.B);
                        if (a13 != null) {
                            t1Var.a(a13);
                            break;
                        }
                        break;
                    case 20:
                        List a14 = e1Var2.a(l.C);
                        if (a14 != null) {
                            t1Var.a(a14);
                            break;
                        }
                        break;
                    case gl.zzm /* 21 */:
                        List a15 = e1Var2.a(l.D);
                        if (a15 != null) {
                            t1Var.a(a15);
                            break;
                        }
                        break;
                    case 22:
                        List a16 = e1Var2.a(l.E);
                        if (a16 != null) {
                            t1Var.a(a16);
                            break;
                        }
                        break;
                    case 23:
                        List a17 = e1Var2.a(l.F);
                        if (a17 != null) {
                            t1Var.a(a17);
                            break;
                        }
                        break;
                    case 24:
                        List a18 = e1Var2.a(l.G);
                        if (a18 != null) {
                            t1Var.a(a18);
                            break;
                        }
                        break;
                    case 25:
                        e1Var2.e.f19375a = null;
                        m2.g gVar5 = e1Var2.f19269g;
                        if (gVar5.f20477v.length() > 0) {
                            e1Var2.p(0, gVar5.f20477v.length());
                            break;
                        }
                        break;
                    case 26:
                        e1Var2.i();
                        e1Var2.o();
                        break;
                    case 27:
                        e1Var2.l();
                        e1Var2.o();
                        break;
                    case 28:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (m0Var3 = e1Var2.f19266c) != null) {
                            int g18 = e1Var2.g(m0Var3, -1);
                            e1Var2.p(g18, g18);
                        }
                        e1Var2.o();
                        break;
                    case 29:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (m0Var4 = e1Var2.f19266c) != null) {
                            int g19 = e1Var2.g(m0Var4, 1);
                            e1Var2.p(g19, g19);
                        }
                        e1Var2.o();
                        break;
                    case 30:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (g2Var3 = e1Var2.i) != null) {
                            int h11 = e1Var2.h(g2Var3, -1);
                            e1Var2.p(h11, h11);
                        }
                        e1Var2.o();
                        break;
                    case 31:
                        if (e1Var2.f19269g.f20477v.length() > 0 && (g2Var4 = e1Var2.i) != null) {
                            int h12 = e1Var2.h(g2Var4, 1);
                            e1Var2.p(h12, h12);
                        }
                        e1Var2.o();
                        break;
                    case 32:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            e1Var2.p(0, 0);
                        }
                        e1Var2.o();
                        break;
                    case 33:
                        e1Var2.e.f19375a = null;
                        m2.g gVar6 = e1Var2.f19269g;
                        if (gVar6.f20477v.length() > 0) {
                            int length2 = gVar6.f20477v.length();
                            e1Var2.p(length2, length2);
                        }
                        e1Var2.o();
                        break;
                    case 34:
                        n1 n1Var3 = e1Var2.e;
                        n1Var3.f19375a = null;
                        m2.g gVar7 = e1Var2.f19269g;
                        String str5 = gVar7.f20477v;
                        String str6 = gVar7.f20477v;
                        if (str5.length() > 0) {
                            if (e1Var2.f()) {
                                n1Var3.f19375a = null;
                                if (str6.length() > 0 && (e10 = e1Var2.e()) != null) {
                                    int intValue5 = e10.intValue();
                                    e1Var2.p(intValue5, intValue5);
                                }
                            } else {
                                n1Var3.f19375a = null;
                                if (str6.length() > 0 && (d11 = e1Var2.d()) != null) {
                                    int intValue6 = d11.intValue();
                                    e1Var2.p(intValue6, intValue6);
                                }
                            }
                        }
                        e1Var2.o();
                        break;
                    case 35:
                        n1 n1Var4 = e1Var2.e;
                        n1Var4.f19375a = null;
                        m2.g gVar8 = e1Var2.f19269g;
                        String str7 = gVar8.f20477v;
                        String str8 = gVar8.f20477v;
                        if (str7.length() > 0) {
                            if (e1Var2.f()) {
                                n1Var4.f19375a = null;
                                if (str8.length() > 0 && (d12 = e1Var2.d()) != null) {
                                    int intValue7 = d12.intValue();
                                    e1Var2.p(intValue7, intValue7);
                                }
                            } else {
                                n1Var4.f19375a = null;
                                if (str8.length() > 0 && (e11 = e1Var2.e()) != null) {
                                    int intValue8 = e11.intValue();
                                    e1Var2.p(intValue8, intValue8);
                                }
                            }
                        }
                        e1Var2.o();
                        break;
                    case 36:
                        e1Var2.j();
                        e1Var2.o();
                        break;
                    case 37:
                        e1Var2.k();
                        e1Var2.o();
                        break;
                    case 38:
                        e1Var2.n();
                        e1Var2.o();
                        break;
                    case 39:
                        e1Var2.m();
                        e1Var2.o();
                        break;
                    case 40:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (e1Var2.f()) {
                                e1Var2.n();
                            } else {
                                e1Var2.m();
                            }
                        }
                        e1Var2.o();
                        break;
                    case 41:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            if (e1Var2.f()) {
                                e1Var2.m();
                            } else {
                                e1Var2.n();
                            }
                        }
                        e1Var2.o();
                        break;
                    case 42:
                        e1Var2.e.f19375a = null;
                        if (e1Var2.f19269g.f20477v.length() > 0) {
                            long j25 = e1Var2.f19268f;
                            int i18 = m2.p0.f20545c;
                            int i19 = (int) (4294967295L & j25);
                            e1Var2.p(i19, i19);
                            break;
                        }
                        break;
                    case 43:
                        if (!t1Var.e) {
                            t1Var.a(qe.g(new r2.a("\n", 1)));
                            break;
                        } else {
                            t1Var.f17286a.f17082w.invoke(new r2.i(t1Var.f17295l));
                            break;
                        }
                    case 44:
                        if (!t1Var.e) {
                            t1Var.a(qe.g(new r2.a("\t", 1)));
                            break;
                        } else {
                            ((kotlin.jvm.internal.u) obj5).f19783u = false;
                            break;
                        }
                    case 45:
                        k2 k2Var = t1Var.f17292h;
                        if (k2Var != null) {
                            k2Var.a(r2.a(e1Var2.f19270h, e1Var2.f19269g, e1Var2.f19268f, 4));
                        }
                        k2 k2Var2 = t1Var.f17292h;
                        if (k2Var2 != null) {
                            e4 e4Var2 = k2Var2.f17182a;
                            if (e4Var2 != null && (e4Var = (e4) e4Var2.f13728v) != null) {
                                k2Var2.f17182a = e4Var;
                                k2Var2.f17184c -= ((r2.x) e4Var2.f13729w).f24515a.f20477v.length();
                                k2Var2.f17183b = new e4(i17, k2Var2.f17183b, (r2.x) e4Var2.f13729w, objArr == true ? 1 : 0);
                                xVar2 = (r2.x) e4Var.f13729w;
                            }
                            if (xVar2 != null) {
                                t1Var.f17294k.invoke(xVar2);
                                break;
                            }
                        }
                        break;
                    case 46:
                        k2 k2Var3 = t1Var.f17292h;
                        if (k2Var3 != null) {
                            e4 e4Var3 = k2Var3.f17183b;
                            if (e4Var3 != null) {
                                k2Var3.f17183b = (e4) e4Var3.f13728v;
                                r2.x xVar5 = (r2.x) e4Var3.f13729w;
                                k2Var3.f17182a = new e4(i17, k2Var3.f17182a, xVar5, objArr2 == true ? 1 : 0);
                                k2Var3.f17184c = xVar5.f24515a.f20477v.length() + k2Var3.f17184c;
                                obj2 = (r2.x) e4Var3.f13729w;
                            }
                            if (obj2 != null) {
                                t1Var.f17294k.invoke(obj2);
                                break;
                            }
                        }
                        break;
                }
                return zVar;
            case 8:
                j2 j2Var = (j2) obj;
                f fVar = (f) j2Var;
                if (((a) ((x) l.v((f) obj3)).m196getDragAndDropManager()).f17376b.contains(fVar) && r6.a(fVar, s6.a((z5.h) obj5))) {
                    ((kotlin.jvm.internal.y) obj4).f19787u = j2Var;
                    return i2.f1503w;
                }
                return i2.f1501u;
            case 9:
                s sVar3 = (s) obj;
                if (!kotlin.jvm.internal.a(sVar3, (s) obj4)) {
                    if (!kotlin.jvm.internal.a(sVar3, ((j) obj3).f18108c)) {
                        z9 = ((Boolean) ((kotlin.jvm.internal.m) obj5).invoke(sVar3)).booleanValue();
                    } else {
                        x.o("Focus search landed at the root.");
                        return null;
                    }
                }
                return Boolean.valueOf(z9);
            case 10:
                t tVar = (t) obj;
                if (((l) obj4).h(tVar.f27343c, (s) obj3)) {
                    tVar.a();
                    ((kotlin.jvm.internal.u) obj5).f19783u = true;
                }
                return zVar;
            case 11:
                f fVar2 = (f) obj;
                j1 j1Var = (j1) obj5;
                int i20 = ((l1) ((n2) obj4).getValue()).f17198a;
                k kVar = (k) obj3;
                n1 n1Var5 = n1.f17222v;
                if ((i20 & 4) == 4) {
                    f.b(fVar2, new d0(i13, n1Var5), new m1(kVar, j1Var, objArr3 == true ? 1 : 0));
                }
                n1 n1Var6 = n1.f17223w;
                if ((i20 & 1) == 1) {
                    f.b(fVar2, new d0(i13, n1Var6), new m1(kVar, j1Var, i14));
                }
                n1 n1Var7 = n1.f17224x;
                if ((i20 & 2) == 2) {
                    f.b(fVar2, new d0(i13, n1Var7), new m1(kVar, j1Var, i12));
                }
                n1 n1Var8 = n1.f17225y;
                if ((i20 & 8) == 8) {
                    f.b(fVar2, new d0(i13, n1Var8), new m1(kVar, j1Var, i10));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    n1 n1Var9 = n1.f17226z;
                    if (j1Var.h() && m2.b(j1Var.k().f24516b)) {
                        f.b(fVar2, new d0(i13, n1Var9), new m1(kVar, j1Var, i11));
                    }
                }
                return zVar;
            case 12:
                return new k(i14, (v) obj4, obj3, (p) obj5);
            case 13:
                if (((Boolean) obj).booleanValue() == ((Boolean) ((z) obj4).f22294b.f22905d.getValue()).booleanValue()) {
                    return (c) obj3;
                }
                return (c) obj5;
            case 14:
                m0 m0Var6 = (m0) obj;
                n2 n2Var = (n2) obj3;
                n2 n2Var2 = (n2) obj4;
                if (n2Var2 != null) {
                    f11 = ((Number) n2Var2.getValue()).floatValue();
                } else {
                    f11 = 1.0f;
                }
                m0Var6.b(f11);
                if (n2Var != null) {
                    f12 = ((Number) n2Var.getValue()).floatValue();
                } else {
                    f12 = 1.0f;
                }
                m0Var6.h(f12);
                if (n2Var != null) {
                    f13 = ((Number) n2Var.getValue()).floatValue();
                } else {
                    f13 = 1.0f;
                }
                m0Var6.i(f13);
                n2 n2Var3 = (n2) obj5;
                if (n2Var3 != null) {
                    j12 = ((t0) n2Var3.getValue()).f19531a;
                } else {
                    j12 = t0.f19529b;
                }
                m0Var6.m(j12);
                return zVar;
            case 15:
                v1 v1Var2 = ((p0) obj3).f22224a;
                q0 q0Var = (q0) obj5;
                int ordinal = ((g0) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            v0 v0Var = q0Var.f22233a.f22281d;
                            if (v0Var != null) {
                                t0Var = new t0(v0Var.f22276b);
                            } else {
                                v0 v0Var2 = v1Var2.f22281d;
                                if (v0Var2 != null) {
                                    t0Var = new t0(v0Var2.f22276b);
                                }
                            }
                        } else {
                            l4.a.o();
                            return null;
                        }
                    } else {
                        t0Var = (t0) obj4;
                    }
                } else {
                    v0 v0Var3 = v1Var2.f22281d;
                    if (v0Var3 != null) {
                        t0Var = new t0(v0Var3.f22276b);
                    } else {
                        v0 v0Var4 = q0Var.f22233a.f22281d;
                        if (v0Var4 != null) {
                            t0Var = new t0(v0Var4.f22276b);
                        }
                    }
                }
                if (t0Var != null) {
                    j13 = t0Var.f19531a;
                } else {
                    j13 = t0.f19529b;
                }
                return new t0(j13);
            case 16:
                z0 z0Var = (z0) obj;
                x d16 = z0Var.d();
                if (d16 != null) {
                    j1 j1Var2 = (j1) obj3;
                    if (!((r0) obj4).j0()) {
                        j1Var2.A = d16;
                    } else {
                        j1Var2.B = d16;
                    }
                }
                z0Var.h((a1) obj5, 0, 0, 0.0f);
                return zVar;
            case 17:
                j jVar = (j) obj;
                d dVar3 = (d) obj4;
                e.t(jVar, dVar3.f22865c);
                i1 i1Var = jVar.e;
                Object a19 = d.a(dVar3, i1Var.getValue());
                if (!kotlin.jvm.internal.a(a19, i1Var.getValue())) {
                    dVar3.f22865c.f22937v.setValue(a19);
                    ((l) obj3).f22937v.setValue(a19);
                    jVar.a();
                    ((kotlin.jvm.internal.u) obj5).f19783u = true;
                }
                return zVar;
            case 18:
                float floatValue = ((Number) obj).floatValue();
                i iVar = (i) obj4;
                if (iVar.K) {
                    f14 = 1.0f;
                } else {
                    f14 = -1.0f;
                }
                z1 z1Var = iVar.J;
                long e14 = z1Var.e(z1Var.h(f14 * floatValue));
                z1 z1Var2 = ((x1) obj5).f25580a;
                float g20 = z1Var.g(z1Var.e(z1.a(z1Var2, z1Var2.f25607j, e14, 1))) * f14;
                if (Math.abs(g20) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g20 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((pf.d1) obj3).j(cancellationException);
                }
                return zVar;
            case 19:
                j jVar2 = (j) obj;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                float floatValue2 = ((Number) jVar2.e.getValue()).floatValue() - vVar.f19784u;
                float a20 = ((v1) obj3).a(floatValue2);
                vVar.f19784u = ((Number) jVar2.e.getValue()).floatValue();
                ((kotlin.jvm.internal.v) obj5).f19784u = ((Number) jVar2.f22923a.f22944b.invoke(jVar2.f22927f)).floatValue();
                if (Math.abs(floatValue2 - a20) > 0.5f) {
                    jVar2.a();
                }
                return zVar;
            case 20:
                return e(obj);
            case gl.zzm /* 21 */:
                return g(obj);
            case 22:
                return h(obj);
            default:
                z0 z0Var2 = (z0) obj;
                r0 r0Var = (r0) obj5;
                i0 i0Var5 = (i0) obj4;
                boolean z10 = i0Var5.M;
                a1 a1Var2 = (a1) obj3;
                float f17 = i0Var5.I;
                if (z10) {
                    z0.k(z0Var2, a1Var2, r0Var.t0(f17), r0Var.t0(i0Var5.J));
                } else {
                    z0.i(z0Var2, a1Var2, r0Var.t0(f17), r0Var.t0(i0Var5.J));
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f1518u = i;
        this.f1519v = obj;
        this.f1520w = obj2;
        this.f1521x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.v vVar, v1 v1Var, kotlin.jvm.internal.v vVar2, j jVar) {
        super(1);
        this.f1518u = 19;
        this.f1519v = vVar;
        this.f1520w = v1Var;
        this.f1521x = vVar2;
    }
}
