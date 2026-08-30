package b2;
import b2.a;
import d0.a;
import d0.c;
import r0.k1;
import t0.a;
import a.a;
import b.c;
import d0.b;
import d0.d;
import d0.e;
import d0.f;
import x.n;
import x.o;
import a0.g;
import b1.i;
import b1.w;
import b2.g1;
import b2.k1;
import b2.l;
import b2.q;
import b2.r0;
import b2.w1;
import c2.x;
import c2.y1;
import j.i0;
import k1.d0;
import k1.e0;
import k1.f0;
import k1.g0;
import k1.h;
import k1.l0;
import k1.m0;
import k1.p;
import k1.r;
import k1.t0;
import k1.y;
import k1.z;
import n.c0;
import r0.l1;
import r0.u1;
import z1.a1;
import z1.h1;
import z1.o0;
import z1.q0;
import z1.t;

import android.os.Build;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.x90;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import ya.rd;
import ya.td;
import ya.vd;

/* loaded from: classes.dex */
public abstract class k1 extends r0 implements o0, x, w1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final m0 f1522f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final v f1523g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final float[] f1524h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final g1 f1525i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final g1 f1526j0;
    public final i0 I;
    public boolean J;
    public boolean K;
    public k1 L;
    public k1 M;
    public boolean N;
    public boolean O;
    public df.l P;
    public y2.c Q;
    public y2.m R;
    public q0 T;
    public c0 U;
    public float W;
    public a X;
    public v Y;
    public b Z;

    /* renamed from: a0, reason: collision with root package name */
    public p f1527a0;

    /* renamed from: b0, reason: collision with root package name */
    public g f1528b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1530d0;

    /* renamed from: e0, reason: collision with root package name */
    public u1 f1531e0;
    public float S = 0.8f;
    public long V = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final h1 f1529c0 = new h1(this, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [m0, java.lang.Object] */
    static {
        Object obj = new Object();
        obj.f19500v = 1.0f;
        obj.f19501w = 1.0f;
        obj.f19502x = 1.0f;
        long j10 = z.f19535a;
        obj.B = j10;
        obj.C = j10;
        obj.E = 8.0f;
        obj.F = t0.f19529b;
        obj.G = l0.f19495a;
        obj.I = 9205357640488583168L;
        obj.J = rd.a();
        obj.K = y2.m.f30814u;
        obj.L = 3;
        f1522f0 = obj;
        f1523g0 = new v();
        f1524h0 = d0.a();
        f1525i0 = new g1(0);
        f1526j0 = new g1(1);
    }

    public k1(i0 i0Var) {
        this.I = i0Var;
        this.Q = i0Var.S;
        this.R = i0Var.T;
    }

    public static k1 A1(x xVar) {
        l0 l0Var;
        k1 k1Var;
        if (xVar instanceof l0) {
            l0Var = (l0) xVar;
        } else {
            l0Var = null;
        }
        if (l0Var != null && (k1Var = l0Var.f31846u.I) != null) {
            return k1Var;
        }
        xVar.getClass();
        return (k1) xVar;
    }

    @Override // x
    public final void A(x xVar, float[] fArr) {
        k1 A1 = A1(xVar);
        A1.r1();
        k1 d12 = d1(A1);
        d0.d(fArr);
        A1.D1(d12, fArr);
        C1(d12, fArr);
    }

    public final c B1() {
        if (h1().H) {
            x i = h1.i(this);
            a aVar = this.X;
            if (aVar == null) {
                aVar = new a();
                this.X = aVar;
            }
            long Y0 = Y0(g1());
            int i10 = (int) (Y0 >> 32);
            aVar.f18758a = -Float.intBitsToFloat(i10);
            int i11 = (int) (Y0 & 4294967295L);
            aVar.f18759b = -Float.intBitsToFloat(i11);
            aVar.f18760c = Float.intBitsToFloat(i10) + f0();
            aVar.f18761d = Float.intBitsToFloat(i11) + e0();
            k1 k1Var = this;
            while (k1Var != i) {
                k1Var.x1(aVar, false, true);
                if (!aVar.b()) {
                    k1Var = k1Var.M;
                    k1Var.getClass();
                }
            }
            return new c(aVar.f18758a, aVar.f18759b, aVar.f18760c, aVar.f18761d);
        }
        return c.e;
    }

    public final void C1(k1 k1Var, float[] fArr) {
        float[] a10;
        if (!kotlin.jvm.internal.a(k1Var, this)) {
            k1 k1Var2 = this.M;
            k1Var2.getClass();
            k1Var2.C1(k1Var, fArr);
            if (!y2.a(this.V, 0L)) {
                float[] fArr2 = f1524h0;
                d0.d(fArr2);
                long j10 = this.V;
                d0.f(fArr2, -((int) (j10 >> 32)), -((int) (j10 & 4294967295L)));
                d0.e(fArr, fArr2);
            }
            u1 u1Var = this.f1531e0;
            if (u1Var != null && (a10 = ((y1) u1Var).a()) != null) {
                d0.e(fArr, a10);
            }
        }
    }

    public final void D1(k1 k1Var, float[] fArr) {
        k1 k1Var2 = this;
        while (!k1Var2.equals(k1Var)) {
            u1 u1Var = k1Var2.f1531e0;
            if (u1Var != null) {
                d0.e(fArr, ((y1) u1Var).b());
            }
            if (!y2.a(k1Var2.V, 0L)) {
                float[] fArr2 = f1524h0;
                d0.d(fArr2);
                d0.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                d0.e(fArr, fArr2);
            }
            k1Var2 = k1Var2.M;
            k1Var2.getClass();
        }
    }

    @Override // x
    public final long E(long j10) {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x i = h1.i(this);
        x xVar = (x) m0.a(this.I);
        xVar.C();
        return q1(i, b.g(d0.b(j10, xVar.f3702q0), i.W(0L)));
    }

    public final void E1(df.l lVar, boolean z3) {
        boolean z9;
        v1 v1Var;
        e eVar;
        Reference poll;
        g gVar;
        e eVar2;
        Reference poll2;
        Object obj;
        i0 i0Var = this.I;
        if (!z3 && this.P == lVar && kotlin.jvm.internal.a(this.Q, i0Var.S) && this.R == i0Var.T) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.Q = i0Var.S;
        this.R = i0Var.T;
        boolean I = i0Var.I();
        h1 h1Var = this.f1529c0;
        if (I && lVar != null) {
            this.P = lVar;
            if (this.f1531e0 == null) {
                v1 a10 = m0.a(i0Var);
                g gVar2 = this.f1528b0;
                if (gVar2 == null) {
                    g gVar3 = new g(this, 4, new h1(this, 0));
                    this.f1528b0 = gVar3;
                    gVar = gVar3;
                } else {
                    gVar = gVar2;
                }
                x xVar = (x) a10;
                x90 x90Var = xVar.O0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) x90Var.f12503w;
                    eVar2 = (e) x90Var.f12502v;
                    poll2 = referenceQueue.poll();
                    if (poll2 != null) {
                        eVar2.m(poll2);
                    }
                } while (poll2 != null);
                while (true) {
                    int i = eVar2.f25619w;
                    if (i != 0) {
                        obj = ((Reference) eVar2.n(i - 1)).get();
                        if (obj != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                u1 u1Var = (u1) obj;
                if (u1Var != null) {
                    y1 y1Var = (y1) u1Var;
                    y yVar = y1Var.f3728v;
                    if (yVar != null) {
                        if (!y1Var.f3727u.f21029s) {
                            a.a("layer should have been released before reuse");
                        }
                        y1Var.f3727u = yVar.b();
                        y1Var.A = false;
                        y1Var.f3730x = gVar;
                        y1Var.f3731y = h1Var;
                        y1Var.K = false;
                        y1Var.L = false;
                        y1Var.M = true;
                        d0.d(y1Var.B);
                        float[] fArr = y1Var.C;
                        if (fArr != null) {
                            d0.d(fArr);
                        }
                        y1Var.I = t0.f19529b;
                        y1Var.N = false;
                        long j10 = Integer.MAX_VALUE;
                        y1Var.f3732z = (j10 & 4294967295L) | (j10 << 32);
                        y1Var.J = null;
                        y1Var.H = 0;
                    } else {
                        throw wd0.m("currently reuse is only supported when we manage the layer lifecycle");
                    }
                } else {
                    u1Var = new y1(xVar.getGraphicsContext().b(), xVar.getGraphicsContext(), xVar, gVar, h1Var);
                }
                y1 y1Var2 = (y1) u1Var;
                y1Var2.e(this.f31771w);
                y1Var2.d(this.V);
                this.f1531e0 = u1Var;
                F1(true);
                i0Var.f1481d0 = true;
                h1Var.invoke();
                return;
            }
            if (z9 && F1(true)) {
                ((x) m0.a(i0Var)).getRectManager().e(i0Var);
                return;
            }
            return;
        }
        this.P = null;
        u1 u1Var2 = this.f1531e0;
        if (u1Var2 != null) {
            y1 y1Var3 = (y1) u1Var2;
            y1Var3.f3730x = null;
            y1Var3.f3731y = null;
            y1Var3.A = true;
            y1Var3.f(false);
            y yVar2 = y1Var3.f3728v;
            if (yVar2 != null) {
                yVar2.a(y1Var3.f3727u);
                x xVar2 = y1Var3.f3729w;
                x90 x90Var2 = xVar2.O0;
                do {
                    ReferenceQueue referenceQueue2 = (ReferenceQueue) x90Var2.f12503w;
                    eVar = (e) x90Var2.f12502v;
                    poll = referenceQueue2.poll();
                    if (poll != null) {
                        eVar.m(poll);
                    }
                } while (poll != null);
                eVar.b(new WeakReference(y1Var3, (ReferenceQueue) x90Var2.f12503w));
                xVar2.R.remove(y1Var3);
            }
            i0Var.f1481d0 = true;
            h1Var.invoke();
            if (h1().H && i0Var.J() && (v1Var = i0Var.H) != null) {
                ((x) v1Var).y(i0Var);
            }
        }
        this.f1531e0 = null;
        this.f1530d0 = false;
    }

    public final boolean F1(boolean z3) {
        i0 i0Var;
        long j10;
        boolean z9;
        boolean z10;
        v1 v1Var;
        df.a aVar;
        df.a aVar2;
        u1 u1Var = this.f1531e0;
        df.l lVar = this.P;
        if (u1Var != null) {
            if (lVar != null) {
                m0 m0Var = f1522f0;
                m0Var.h(1.0f);
                m0Var.i(1.0f);
                m0Var.b(1.0f);
                m0Var.n(0.0f);
                m0Var.r(0.0f);
                m0Var.j(0.0f);
                long j11 = z.f19535a;
                m0Var.c(j11);
                m0Var.l(j11);
                m0Var.g(0.0f);
                m0Var.d(8.0f);
                long j12 = t0.f19529b;
                m0Var.m(j12);
                m0Var.k(l0.f19495a);
                m0Var.f(false);
                if (m0Var.L != 3) {
                    m0Var.f19499u |= 524288;
                    m0Var.L = 3;
                }
                m0Var.I = 9205357640488583168L;
                m0Var.M = null;
                m0Var.f19499u = 0;
                i0 i0Var2 = this.I;
                m0Var.J = i0Var2.S;
                m0Var.K = i0Var2.T;
                m0Var.I = vd.c(this.f31771w);
                ((x) m0.a(i0Var2)).getSnapshotObserver().a(this, d.f1427y, new c(2, lVar));
                v vVar = this.Y;
                if (vVar == null) {
                    vVar = new v();
                    this.Y = vVar;
                }
                v vVar2 = f1523g0;
                vVar2.getClass();
                vVar2.f1605a = vVar.f1605a;
                vVar2.f1606b = vVar.f1606b;
                vVar2.f1607c = vVar.f1607c;
                vVar2.f1608d = vVar.f1608d;
                vVar2.e = vVar.e;
                vVar2.f1609f = vVar.f1609f;
                vVar2.f1610g = vVar.f1610g;
                float f10 = m0Var.f19500v;
                vVar.f1605a = f10;
                vVar.f1606b = m0Var.f19501w;
                vVar.f1607c = m0Var.f19503y;
                vVar.f1608d = m0Var.f19504z;
                vVar.e = m0Var.D;
                vVar.f1609f = m0Var.E;
                long j13 = m0Var.F;
                vVar.f1610g = j13;
                y1 y1Var = (y1) u1Var;
                x xVar = y1Var.f3729w;
                int i = m0Var.f19499u | y1Var.H;
                y1Var.F = m0Var.K;
                y1Var.E = m0Var.J;
                int i10 = i & 4096;
                if (i10 != 0) {
                    y1Var.I = j13;
                }
                if ((i & 1) != 0) {
                    d dVar = y1Var.f3727u.f21013a;
                    if (dVar.b() != f10) {
                        dVar.y(f10);
                    }
                }
                if ((i & 2) != 0) {
                    b bVar = y1Var.f3727u;
                    float f11 = m0Var.f19501w;
                    d dVar2 = bVar.f21013a;
                    if (dVar2.K() != f11) {
                        dVar2.l(f11);
                    }
                }
                if ((i & 4) != 0) {
                    b bVar2 = y1Var.f3727u;
                    float f12 = m0Var.f19502x;
                    d dVar3 = bVar2.f21013a;
                    if (dVar3.a() != f12) {
                        dVar3.s(f12);
                    }
                }
                if ((i & 8) != 0) {
                    b bVar3 = y1Var.f3727u;
                    float f13 = m0Var.f19503y;
                    d dVar4 = bVar3.f21013a;
                    if (dVar4.B() != f13) {
                        dVar4.F(f13);
                    }
                }
                if ((i & 16) != 0) {
                    b bVar4 = y1Var.f3727u;
                    float f14 = m0Var.f19504z;
                    d dVar5 = bVar4.f21013a;
                    if (dVar5.t() != f14) {
                        dVar5.f(f14);
                    }
                }
                if ((i & 32) != 0) {
                    b bVar5 = y1Var.f3727u;
                    float f15 = m0Var.A;
                    d dVar6 = bVar5.f21013a;
                    if (dVar6.J() != f15) {
                        dVar6.c(f15);
                        bVar5.f21018g = true;
                        bVar5.a();
                    }
                    if (m0Var.A > 0.0f && !y1Var.N && (aVar2 = y1Var.f3731y) != null) {
                        aVar2.invoke();
                    }
                }
                if ((i & 64) != 0) {
                    b bVar6 = y1Var.f3727u;
                    long j14 = m0Var.B;
                    d dVar7 = bVar6.f21013a;
                    i0Var = i0Var2;
                    long q10 = dVar7.q();
                    int i11 = r.f19522m;
                    if (!pe.a(j14, q10)) {
                        dVar7.w(j14);
                    }
                } else {
                    i0Var = i0Var2;
                }
                if ((i & 128) != 0) {
                    b bVar7 = y1Var.f3727u;
                    long j15 = m0Var.C;
                    d dVar8 = bVar7.f21013a;
                    long v2 = dVar8.v();
                    int i12 = r.f19522m;
                    if (!pe.a(j15, v2)) {
                        dVar8.G(j15);
                    }
                }
                if ((i & 1024) != 0) {
                    b bVar8 = y1Var.f3727u;
                    float f16 = m0Var.D;
                    d dVar9 = bVar8.f21013a;
                    if (dVar9.o() != f16) {
                        dVar9.e(f16);
                    }
                }
                if ((i & 256) != 0) {
                    d dVar10 = y1Var.f3727u.f21013a;
                    if (dVar10.D() != 0.0f) {
                        dVar10.r();
                    }
                }
                if ((i & 512) != 0) {
                    d dVar11 = y1Var.f3727u.f21013a;
                    if (dVar11.m() != 0.0f) {
                        dVar11.u();
                    }
                }
                if ((i & 2048) != 0) {
                    b bVar9 = y1Var.f3727u;
                    float f17 = m0Var.E;
                    d dVar12 = bVar9.f21013a;
                    if (dVar12.z() != f17) {
                        dVar12.I(f17);
                    }
                }
                if (i10 != 0) {
                    boolean a10 = t0.a(y1Var.I, j12);
                    b bVar10 = y1Var.f3727u;
                    if (a10) {
                        j10 = 4294967295L;
                        if (!b.c(bVar10.f21032v, 9205357640488583168L)) {
                            bVar10.f21032v = 9205357640488583168L;
                            bVar10.f21013a.p(9205357640488583168L);
                        }
                    } else {
                        j10 = 4294967295L;
                        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y1Var.I >> 32)) * ((int) (y1Var.f3732z >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y1Var.I & 4294967295L)) * ((int) (y1Var.f3732z & 4294967295L))) & 4294967295L);
                        if (!b.c(bVar10.f21032v, floatToRawIntBits)) {
                            bVar10.f21032v = floatToRawIntBits;
                            bVar10.f21013a.p(floatToRawIntBits);
                        }
                    }
                } else {
                    j10 = 4294967295L;
                }
                if ((i & 16384) != 0) {
                    b bVar11 = y1Var.f3727u;
                    boolean z11 = m0Var.H;
                    if (bVar11.f21033w != z11) {
                        bVar11.f21033w = z11;
                        bVar11.f21018g = true;
                        bVar11.a();
                    }
                }
                if ((131072 & i) != 0) {
                    d dVar13 = y1Var.f3727u.f21013a;
                }
                if ((262144 & i) != 0) {
                    d dVar14 = y1Var.f3727u.f21013a;
                    if (!kotlin.jvm.internal.a(dVar14.k(), null)) {
                        dVar14.x();
                    }
                }
                if ((i & 524288) != 0) {
                    b bVar12 = y1Var.f3727u;
                    int i13 = m0Var.L;
                    d dVar15 = bVar12.f21013a;
                    if (dVar15.M() != i13) {
                        dVar15.h(i13);
                    }
                }
                if ((32768 & i) != 0) {
                    d dVar16 = y1Var.f3727u.f21013a;
                    if (dVar16.j() != 0) {
                        dVar16.E(0);
                    }
                }
                if ((i & 7963) != 0) {
                    y1Var.K = true;
                    y1Var.L = true;
                }
                if (!kotlin.jvm.internal.a(y1Var.J, m0Var.M)) {
                    l0 l0Var = m0Var.M;
                    y1Var.J = l0Var;
                    if (l0Var != null) {
                        b bVar13 = y1Var.f3727u;
                        if (l0Var instanceof f0) {
                            c cVar = ((f0) l0Var).e;
                            float f18 = cVar.f18763a;
                            float f19 = cVar.f18764b;
                            bVar13.f((Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f19) & j10), (Float.floatToRawIntBits(cVar.f18765c - f18) << 32) | (Float.floatToRawIntBits(cVar.f18766d - f19) & j10), 0.0f);
                        } else if (l0Var instanceof e0) {
                            i0 i0Var3 = ((e0) l0Var).e;
                            bVar13.f21021k = null;
                            bVar13.i = 9205357640488583168L;
                            bVar13.f21019h = 0L;
                            bVar13.f21020j = 0.0f;
                            bVar13.f21018g = true;
                            bVar13.f21024n = false;
                            bVar13.f21022l = i0Var3;
                            bVar13.a();
                        } else if (l0Var instanceof g0) {
                            g0 g0Var = (g0) l0Var;
                            h hVar = g0Var.f19480f;
                            if (hVar != null) {
                                bVar13.f21021k = null;
                                bVar13.i = 9205357640488583168L;
                                bVar13.f21019h = 0L;
                                bVar13.f21020j = 0.0f;
                                bVar13.f21018g = true;
                                bVar13.f21024n = false;
                                bVar13.f21022l = hVar;
                                bVar13.a();
                            } else {
                                d dVar17 = g0Var.e;
                                float f20 = dVar17.f18768b;
                                float f21 = dVar17.f18767a;
                                bVar13.f((Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(f20) & j10), (Float.floatToRawIntBits(dVar17.f18769c - f21) << 32) | (Float.floatToRawIntBits(dVar17.f18770d - f20) & j10), Float.intBitsToFloat((int) (dVar17.f18773h >> 32)));
                            }
                        } else {
                            l4.a.o();
                            return false;
                        }
                        if ((l0Var instanceof e0) && Build.VERSION.SDK_INT < 33 && (aVar = y1Var.f3731y) != null) {
                            aVar.invoke();
                        }
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                y1Var.H = m0Var.f19499u;
                if (i != 0 || z9) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = xVar.getParent();
                        if (parent != null) {
                            parent.onDescendantInvalidated(xVar, xVar);
                        }
                    } else {
                        xVar.invalidate();
                    }
                    if (xVar.f3716z) {
                        xVar.L(0.0f);
                    }
                }
                boolean z12 = this.O;
                this.O = m0Var.H;
                this.S = m0Var.f19502x;
                if (vVar2.f1605a == vVar.f1605a && vVar2.f1606b == vVar.f1606b && vVar2.f1607c == vVar.f1607c && vVar2.f1608d == vVar.f1608d && vVar2.e == vVar.e && vVar2.f1609f == vVar.f1609f && t0.a(vVar2.f1610g, vVar.f1610g)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = !z10;
                if (z3 && ((!z10 || z12 != this.O) && (v1Var = i0Var.H) != null)) {
                    ((x) v1Var).y(i0Var);
                }
                return z13;
            }
            throw wd0.m("updateLayerParameters requires a non-null layerBlock");
        }
        if (lVar == null) {
            return false;
        }
        a.b("null layer with a non-null layerBlock");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G1(long r26) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.k1.G1(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // a1, o0
    public final Object H() {
        i0 i0Var = this.I;
        if (!i0Var.Z.n(64)) {
            return null;
        }
        h1();
        Object obj = null;
        for (q qVar = (g2) i0Var.Z.f1460z; qVar != null; qVar = qVar.f15692y) {
            if ((qVar.f15690w & 64) != 0) {
                k kVar = qVar;
                Object r62 = 0;
                while (kVar != 0) {
                    if (kVar instanceof y1) {
                        obj = ((y1) kVar).k(i0Var.S, obj);
                    } else if ((kVar.f15690w & 64) != 0 && (kVar instanceof k)) {
                        q qVar2 = kVar.J;
                        int i = 0;
                        kVar = kVar;
                        r62 = r62;
                        while (qVar2 != null) {
                            if ((qVar2.f15690w & 64) != 0) {
                                i++;
                                r62 = r62;
                                if (i == 1) {
                                    kVar = qVar2;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new e(new q[16]);
                                    }
                                    if (kVar != 0) {
                                        r62.b(kVar);
                                        kVar = 0;
                                    }
                                    r62.b(qVar2);
                                }
                            }
                            qVar2 = qVar2.f15693z;
                            kVar = kVar;
                            r62 = r62;
                        }
                        if (i == 1) {
                        }
                    }
                    kVar = e(r62);
                }
            }
        }
        return obj;
    }

    @Override // x
    public final x J() {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        r1();
        return ((k1) this.I.Z.f1459y).M;
    }

    @Override // r0
    public final r0 L0() {
        return this.L;
    }

    @Override // r0
    public final boolean N0() {
        if (this.T != null) {
            return true;
        }
        return false;
    }

    @Override // r0
    public final i0 O0() {
        return this.I;
    }

    @Override // r0
    public final q0 P0() {
        q0 q0Var = this.T;
        if (q0Var != null) {
            return q0Var;
        }
        x.o("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // r0
    public final r0 Q0() {
        return this.M;
    }

    @Override // r0
    public final long R0() {
        return this.V;
    }

    @Override // x
    public final long U(long j10) {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return q1(h1.i(this), ((x) m0.a(this.I)).G(j10));
    }

    @Override // r0
    public final void V0() {
        r0(this.V, this.W, this.P);
    }

    @Override // x
    public final long W(long j10) {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        r1();
        for (k1 k1Var = this; k1Var != null; k1Var = k1Var.M) {
            u1 u1Var = k1Var.f1531e0;
            if (u1Var != null) {
                y1 y1Var = (y1) u1Var;
                float[] b10 = y1Var.b();
                if (!y1Var.M) {
                    j10 = d0.b(j10, b10);
                }
            }
            j10 = td.a(j10, k1Var.V);
        }
        return j10;
    }

    public final void W0(k1 k1Var, a aVar, boolean z3) {
        if (k1Var != this) {
            k1 k1Var2 = this.M;
            if (k1Var2 != null) {
                k1Var2.W0(k1Var, aVar, z3);
            }
            long j10 = this.V;
            float f10 = (int) (j10 >> 32);
            aVar.f18758a -= f10;
            aVar.f18760c -= f10;
            float f11 = (int) (j10 & 4294967295L);
            aVar.f18759b -= f11;
            aVar.f18761d -= f11;
            u1 u1Var = this.f1531e0;
            if (u1Var != null) {
                y1 y1Var = (y1) u1Var;
                float[] a10 = y1Var.a();
                if (!y1Var.M) {
                    if (a10 == null) {
                        aVar.f18758a = 0.0f;
                        aVar.f18759b = 0.0f;
                        aVar.f18760c = 0.0f;
                        aVar.f18761d = 0.0f;
                    } else {
                        d0.c(a10, aVar);
                    }
                }
                if (this.O && z3) {
                    long j11 = this.f31771w;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
            }
        }
    }

    public final long X0(k1 k1Var, long j10) {
        if (k1Var == this) {
            return j10;
        }
        k1 k1Var2 = this.M;
        if (k1Var2 != null && !kotlin.jvm.internal.a(k1Var, k1Var2)) {
            return e1(k1Var2.X0(k1Var, j10));
        }
        return e1(j10);
    }

    public final long Y0(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - f0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - e0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float Z0(long j10, long j11) {
        float f02;
        float e02;
        if (f0() >= Float.intBitsToFloat((int) (j11 >> 32)) && e0() >= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long Y0 = Y0(j11);
        float intBitsToFloat = Float.intBitsToFloat((int) (Y0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Y0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (intBitsToFloat3 < 0.0f) {
            f02 = -intBitsToFloat3;
        } else {
            f02 = intBitsToFloat3 - f0();
        }
        float max = Math.max(0.0f, f02);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            e02 = -intBitsToFloat4;
        } else {
            e02 = intBitsToFloat4 - e0();
        }
        float max2 = Math.max(0.0f, e02);
        long floatToRawIntBits = (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i10 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i);
                    float intBitsToFloat6 = Float.intBitsToFloat(i10);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // y2.c
    public final float a() {
        return this.I.S.a();
    }

    public final void a1(p pVar, b bVar) {
        boolean z3;
        u1 u1Var = this.f1531e0;
        if (u1Var != null) {
            y1 y1Var = (y1) u1Var;
            b bVar2 = y1Var.G;
            y1Var.g();
            if (y1Var.f3727u.f21013a.J() > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            y1Var.N = z3;
            i0 i0Var = bVar2.f20424v;
            i0Var.F(pVar);
            i0Var.f18637w = bVar;
            ya.a(bVar2, y1Var.f3727u);
            return;
        }
        long j10 = this.V;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        pVar.q(f10, f11);
        b1(pVar, bVar);
        pVar.q(-f10, -f11);
    }

    public final void b1(p pVar, b bVar) {
        p pVar2;
        b bVar2;
        q i12 = i1(4);
        if (i12 == null) {
            v1(pVar, bVar);
            return;
        }
        i0 i0Var = this.I;
        i0Var.getClass();
        l0 sharedDrawScope = ((x) m0.a(i0Var)).getSharedDrawScope();
        long c10 = vd.c(this.f31771w);
        sharedDrawScope.getClass();
        e eVar = null;
        while (i12 != null) {
            if (i12 instanceof n) {
                pVar2 = pVar;
                bVar2 = bVar;
                sharedDrawScope.c(pVar2, c10, this, (n) i12, bVar2);
            } else {
                pVar2 = pVar;
                bVar2 = bVar;
                if ((i12.f15690w & 4) != 0 && (i12 instanceof k)) {
                    int i = 0;
                    for (q qVar = ((k) i12).J; qVar != null; qVar = qVar.f15693z) {
                        if ((qVar.f15690w & 4) != 0) {
                            i++;
                            if (i == 1) {
                                i12 = qVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new e(new q[16]);
                                }
                                if (i12 != null) {
                                    eVar.b(i12);
                                    i12 = null;
                                }
                                eVar.b(qVar);
                            }
                        }
                    }
                    if (i == 1) {
                        pVar = pVar2;
                        bVar = bVar2;
                    }
                }
            }
            i12 = e(eVar);
            pVar = pVar2;
            bVar = bVar2;
        }
    }

    public abstract void c1();

    @Override // x
    public final long d(x xVar, long j10) {
        return q1(xVar, j10);
    }

    public final k1 d1(k1 k1Var) {
        i0 i0Var = k1Var.I;
        i0 i0Var2 = this.I;
        if (i0Var == i0Var2) {
            q h12 = k1Var.h1();
            q h13 = h1();
            if (!h13.f15688u.H) {
                a.b("visitLocalAncestors called on an unattached node");
            }
            for (q qVar = h13.f15688u.f15692y; qVar != null; qVar = qVar.f15692y) {
                if ((qVar.f15690w & 2) != 0 && qVar == h12) {
                    return k1Var;
                }
            }
            return this;
        }
        while (i0Var.J > i0Var2.J) {
            i0Var = i0Var.v();
            i0Var.getClass();
        }
        i0 i0Var3 = i0Var2;
        while (i0Var3.J > i0Var.J) {
            i0Var3 = i0Var3.v();
            i0Var3.getClass();
        }
        while (i0Var != i0Var3) {
            i0Var = i0Var.v();
            i0Var3 = i0Var3.v();
            if (i0Var == null || i0Var3 == null) {
                x.n("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (i0Var3 != i0Var2) {
            if (i0Var != k1Var.I) {
                return (s) i0Var.Z.f1458x;
            }
            return k1Var;
        }
        return this;
    }

    public final long e1(long j10) {
        long j11 = this.V;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - ((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        u1 u1Var = this.f1531e0;
        if (u1Var != null) {
            y1 y1Var = (y1) u1Var;
            float[] a10 = y1Var.a();
            if (a10 == null) {
                return 9187343241974906880L;
            }
            if (!y1Var.M) {
                return d0.b(floatToRawIntBits, a10);
            }
            return floatToRawIntBits;
        }
        return floatToRawIntBits;
    }

    @Override // x
    public final long f(long j10) {
        long W = W(j10);
        x xVar = (x) m0.a(this.I);
        xVar.C();
        return d0.b(W, xVar.f3701p0);
    }

    public abstract s0 f1();

    public final long g1() {
        return this.Q.B0(this.I.U.d());
    }

    @Override // t
    public final y2.m getLayoutDirection() {
        return this.I.T;
    }

    public abstract q h1();

    @Override // x
    public final boolean i() {
        return h1().H;
    }

    @Override // y2.c
    public final float i0() {
        return this.I.S.i0();
    }

    public final q i1(int i) {
        boolean g8 = g(i);
        q h12 = h1();
        if (g8 || (h12 = h12.f15692y) != null) {
            for (q j12 = j1(g8); j12 != null && (j12.f15691x & i) != 0; j12 = j12.f15693z) {
                if ((j12.f15690w & i) != 0) {
                    return j12;
                }
                if (j12 == h12) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // x
    public final void j(float[] fArr) {
        v1 a10 = m0.a(this.I);
        k1 A1 = A1(h1.i(this));
        D1(A1, fArr);
        if (a10 instanceof x) {
            ((x) a10).t(fArr);
            return;
        }
        long v2 = A1.v(0L);
        if ((9223372034707292159L & v2) != 9205357640488583168L) {
            d0.f(fArr, Float.intBitsToFloat((int) (v2 >> 32)), Float.intBitsToFloat((int) (v2 & 4294967295L)));
        }
    }

    public final q j1(boolean z3) {
        q h12;
        f1 f1Var = this.I.Z;
        if (((k1) f1Var.f1459y) == this) {
            return (q) f1Var.A;
        }
        k1 k1Var = this.M;
        if (z3) {
            if (k1Var != null && (h12 = k1Var.h1()) != null) {
                return h12.f15693z;
            }
            return null;
        }
        if (k1Var != null) {
            return k1Var.h1();
        }
        return null;
    }

    @Override // x
    public final long k() {
        return this.f31771w;
    }

    public final void k1(q qVar, g1 g1Var, long j10, q qVar2, int i, boolean z3) {
        if (qVar == null) {
            n1(g1Var, j10, qVar2, i, z3);
            return;
        }
        int i10 = qVar2.f1580w;
        d0 d0Var = qVar2.f1578u;
        qVar2.b(i10 + 1, d0Var.f20856b);
        qVar2.f1580w++;
        d0Var.a(qVar);
        qVar2.f1579v.a(a(-1.0f, z3, false));
        k1(d(qVar, g1Var.b()), g1Var, j10, qVar2, i, z3);
        qVar2.f1580w = i10;
    }

    public final void l1(q qVar, g1 g1Var, long j10, q qVar2, int i, boolean z3, float f10) {
        if (qVar == null) {
            n1(g1Var, j10, qVar2, i, z3);
            return;
        }
        int i10 = qVar2.f1580w;
        d0 d0Var = qVar2.f1578u;
        qVar2.b(i10 + 1, d0Var.f20856b);
        qVar2.f1580w++;
        d0Var.a(qVar);
        qVar2.f1579v.a(a(f10, z3, false));
        u1(d(qVar, g1Var.b()), g1Var, j10, qVar2, i, z3, f10, true);
        qVar2.f1580w = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (l.g(r18.a(), b2.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1(g1 r15, long r16, q r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.b()
            q r1 = r14.i1(r0)
            boolean r0 = r14.G1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.g1()
            float r0 = r14.Z0(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.f1580w
            d0 r7 = r5.f1578u
            int r7 = r7.f20856b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = b2.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = l.g(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            l1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.n1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.f0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.e0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.k1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.g1()
            float r2 = r14.Z0(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.f1580w
            d0 r9 = r5.f1578u
            int r9 = r9.f20856b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = b2.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = l.g(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            u1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.k1.m1(g1, long, q, int, boolean):void");
    }

    public void n1(g1 g1Var, long j10, q qVar, int i, boolean z3) {
        k1 k1Var = this.L;
        if (k1Var != null) {
            k1Var.m1(g1Var, k1Var.e1(j10), qVar, i, z3);
        }
    }

    public final void o1() {
        u1 u1Var = this.f1531e0;
        if (u1Var != null) {
            ((y1) u1Var).c();
            return;
        }
        k1 k1Var = this.M;
        if (k1Var != null) {
            k1Var.o1();
        }
    }

    public final boolean p1() {
        if (this.f1531e0 != null && this.S <= 0.0f) {
            return true;
        }
        k1 k1Var = this.M;
        if (k1Var != null) {
            return k1Var.p1();
        }
        return false;
    }

    public final long q1(x xVar, long j10) {
        if (xVar instanceof l0) {
            l0 l0Var = (l0) xVar;
            l0Var.f31846u.I.r1();
            return l0Var.b(this, j10 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        k1 A1 = A1(xVar);
        A1.r1();
        k1 d12 = d1(A1);
        while (A1 != d12) {
            u1 u1Var = A1.f1531e0;
            if (u1Var != null) {
                y1 y1Var = (y1) u1Var;
                float[] b10 = y1Var.b();
                if (!y1Var.M) {
                    j10 = d0.b(j10, b10);
                }
            }
            j10 = td.a(j10, A1.V);
            A1 = A1.M;
            A1.getClass();
        }
        return X0(d12, j10);
    }

    @Override // w1
    public final boolean r() {
        if (this.f1531e0 != null && !this.N && this.I.I()) {
            return true;
        }
        return false;
    }

    public final void r1() {
        this.I.f1478a0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void s1() {
        df.l lVar;
        q qVar;
        boolean g8 = g(128);
        q j12 = j1(g8);
        if (j12 != null && (j12.f15688u.f15691x & 128) != 0) {
            i d2 = w.d();
            if (d2 != null) {
                lVar = d2.e();
            } else {
                lVar = null;
            }
            i g10 = w.g(d2);
            try {
                if (g8) {
                    qVar = h1();
                } else {
                    qVar = h1().f15692y;
                    if (qVar == null) {
                    }
                }
                for (q j13 = j1(g8); j13 != null; j13 = j13.f15693z) {
                    if ((j13.f15691x & 128) == 0) {
                        break;
                    }
                    if ((j13.f15690w & 128) != 0) {
                        k kVar = j13;
                        Object r8 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof w) {
                                ((w) kVar).m(this.f31771w);
                            } else if ((kVar.f15690w & 128) != 0 && (kVar instanceof k)) {
                                q qVar2 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r8 = r8;
                                while (qVar2 != null) {
                                    if ((qVar2.f15690w & 128) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            kVar = qVar2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new e(new q[16]);
                                            }
                                            if (kVar != 0) {
                                                r8.b(kVar);
                                                kVar = 0;
                                            }
                                            r8.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.f15693z;
                                    kVar = kVar;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = e(r8);
                        }
                    }
                    if (j13 == qVar) {
                        break;
                    }
                }
            } finally {
                w.j(d2, g10, lVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void t1() {
        boolean g8 = g(128);
        q h12 = h1();
        if (g8 || (h12 = h12.f15692y) != null) {
            for (q j12 = j1(g8); j12 != null && (j12.f15691x & 128) != 0; j12 = j12.f15693z) {
                if ((j12.f15690w & 128) != 0) {
                    k kVar = j12;
                    Object r52 = 0;
                    while (kVar != 0) {
                        if (kVar instanceof w) {
                            ((w) kVar).f(this);
                        } else if ((kVar.f15690w & 128) != 0 && (kVar instanceof k)) {
                            q qVar = kVar.J;
                            int i = 0;
                            kVar = kVar;
                            r52 = r52;
                            while (qVar != null) {
                                if ((qVar.f15690w & 128) != 0) {
                                    i++;
                                    r52 = r52;
                                    if (i == 1) {
                                        kVar = qVar;
                                    } else {
                                        if (r52 == 0) {
                                            r52 = new e(new q[16]);
                                        }
                                        if (kVar != 0) {
                                            r52.b(kVar);
                                            kVar = 0;
                                        }
                                        r52.b(qVar);
                                    }
                                }
                                qVar = qVar.f15693z;
                                kVar = kVar;
                                r52 = r52;
                            }
                            if (i == 1) {
                            }
                        }
                        kVar = e(r52);
                    }
                }
                if (j12 == h12) {
                    return;
                }
            }
        }
    }

    @Override // x
    public final c u(x xVar, boolean z3) {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!xVar.i()) {
            a.b("LayoutCoordinates " + xVar + " is not attached!");
        }
        k1 A1 = A1(xVar);
        A1.r1();
        k1 d12 = d1(A1);
        a aVar = this.X;
        if (aVar == null) {
            aVar = new a();
            this.X = aVar;
        }
        aVar.f18758a = 0.0f;
        aVar.f18759b = 0.0f;
        aVar.f18760c = (int) (xVar.k() >> 32);
        aVar.f18761d = (int) (xVar.k() & 4294967295L);
        while (A1 != d12) {
            A1.x1(aVar, z3, false);
            if (aVar.b()) {
                return c.e;
            }
            A1 = A1.M;
            A1.getClass();
        }
        W0(d12, aVar, z3);
        return new c(aVar.f18758a, aVar.f18759b, aVar.f18760c, aVar.f18761d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [q] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [q] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [q] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [e] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [e] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    public final void u1(q qVar, g1 g1Var, long j10, q qVar2, int i, boolean z3, float f10, boolean z9) {
        int a10;
        int a11;
        q e;
        if (qVar == null) {
            n1(g1Var, j10, qVar2, i, z3);
            return;
        }
        int i10 = i;
        if (i10 == 3 || i10 == 4) {
            k kVar = qVar;
            e eVar = null;
            while (true) {
                if (kVar == 0) {
                    break;
                }
                if (kVar instanceof a2) {
                    long l10 = ((a2) kVar).l();
                    int i11 = (int) (j10 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i11);
                    i0 i0Var = this.I;
                    y2.m mVar = i0Var.T;
                    int i12 = h2.f1476b;
                    long j11 = Long.MIN_VALUE & l10;
                    y2.m mVar2 = y2.m.f30814u;
                    if (j11 != 0 && mVar != mVar2) {
                        a10 = a(2, l10);
                    } else {
                        a10 = a(0, l10);
                    }
                    if (intBitsToFloat >= (-a10)) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i11);
                        int f02 = f0();
                        y2.m mVar3 = i0Var.T;
                        if (j11 != 0 && mVar3 != mVar2) {
                            a11 = a(0, l10);
                        } else {
                            a11 = a(2, l10);
                        }
                        if (intBitsToFloat2 < f02 + a11) {
                            int i13 = (int) (j10 & 4294967295L);
                            if (Float.intBitsToFloat(i13) >= (-a(1, l10))) {
                                if (Float.intBitsToFloat(i13) < a(3, l10) + e0()) {
                                    i1 i1Var = new i1(this, qVar, g1Var, j10, qVar2, i10, z3, f10, z9);
                                    z zVar = qVar2.f1579v;
                                    d0 d0Var = qVar2.f1578u;
                                    int i14 = qVar2.f1580w;
                                    int i15 = d0Var.f20856b;
                                    if (i14 == i15 - 1) {
                                        qVar2.b(i14 + 1, i15);
                                        qVar2.f1580w++;
                                        d0Var.a(qVar);
                                        zVar.a(a(0.0f, z3, true));
                                        i1Var.invoke();
                                        qVar2.f1580w = i14;
                                        return;
                                    }
                                    long a12 = qVar2.a();
                                    int i16 = qVar2.f1580w;
                                    if (l.n(a12)) {
                                        int i17 = d0Var.f20856b;
                                        int i18 = i17 - 1;
                                        qVar2.f1580w = i18;
                                        qVar2.b(i17, d0Var.f20856b);
                                        qVar2.f1580w++;
                                        d0Var.a(qVar);
                                        zVar.a(a(0.0f, z3, true));
                                        i1Var.invoke();
                                        qVar2.f1580w = i18;
                                        if (l.j(qVar2.a()) < 0.0f) {
                                            qVar2.b(i16 + 1, qVar2.f1580w + 1);
                                        }
                                        qVar2.f1580w = i16;
                                        return;
                                    }
                                    if (l.j(a12) > 0.0f) {
                                        int i19 = qVar2.f1580w;
                                        qVar2.b(i19 + 1, d0Var.f20856b);
                                        qVar2.f1580w++;
                                        d0Var.a(qVar);
                                        zVar.a(a(0.0f, z3, true));
                                        i1Var.invoke();
                                        qVar2.f1580w = i19;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((kVar.f15690w & 16) != 0 && (kVar instanceof k)) {
                        q qVar3 = kVar.J;
                        int i20 = 0;
                        e = kVar;
                        eVar = eVar;
                        while (qVar3 != null) {
                            if ((qVar3.f15690w & 16) != 0) {
                                i20++;
                                eVar = eVar;
                                if (i20 == 1) {
                                    e = qVar3;
                                } else {
                                    if (eVar == null) {
                                        eVar = new e(new q[16]);
                                    }
                                    if (e != null) {
                                        eVar.b(e);
                                        e = null;
                                    }
                                    eVar.b(qVar3);
                                }
                            }
                            qVar3 = qVar3.f15693z;
                            e = e;
                            eVar = eVar;
                        }
                        if (i20 == 1) {
                            i10 = i;
                            kVar = e;
                            eVar = eVar;
                        }
                    }
                    e = e(eVar);
                    i10 = i;
                    kVar = e;
                    eVar = eVar;
                }
            }
        }
        if (z9) {
            l1(qVar, g1Var, j10, qVar2, i, z3, f10);
            return;
        }
        switch (g1Var.f1470a) {
            case 0:
                Object r52 = 0;
                k kVar2 = qVar;
                while (kVar2 != 0) {
                    if (kVar2 instanceof a2) {
                        ((a2) kVar2).X();
                    } else if ((kVar2.f15690w & 16) != 0 && (kVar2 instanceof k)) {
                        q qVar4 = kVar2.J;
                        int i21 = 0;
                        kVar2 = kVar2;
                        r52 = r52;
                        while (qVar4 != null) {
                            if ((qVar4.f15690w & 16) != 0) {
                                i21++;
                                r52 = r52;
                                if (i21 == 1) {
                                    kVar2 = qVar4;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new e(new q[16]);
                                    }
                                    if (kVar2 != 0) {
                                        r52.b(kVar2);
                                        kVar2 = 0;
                                    }
                                    r52.b(qVar4);
                                }
                            }
                            qVar4 = qVar4.f15693z;
                            kVar2 = kVar2;
                            r52 = r52;
                        }
                        if (i21 == 1) {
                        }
                    }
                    kVar2 = e(r52);
                }
                break;
        }
        u1(d(qVar, g1Var.b()), g1Var, j10, qVar2, i, z3, f10, false);
    }

    @Override // x
    public final long v(long j10) {
        if (!h1().H) {
            a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((x) m0.a(this.I)).u(W(j10));
    }

    public abstract void v1(p pVar, b bVar);

    public final void w1(long j10, float f10, df.l lVar) {
        E1(lVar, false);
        boolean a10 = y2.a(this.V, j10);
        i0 i0Var = this.I;
        if (!a10) {
            ((x) m0.a(i0Var)).L(-4.0f);
            this.V = j10;
            i0Var.f1478a0.f1558p.H0();
            u1 u1Var = this.f1531e0;
            if (u1Var != null) {
                ((y1) u1Var).d(j10);
            } else {
                k1 k1Var = this.M;
                if (k1Var != null) {
                    k1Var.o1();
                }
            }
            e z3 = i0Var.z();
            Object[] objArr = z3.f25617u;
            int i = z3.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                ((i0) objArr[i10]).F();
            }
            r0.T0(this);
            v1 v1Var = i0Var.H;
            if (v1Var != null) {
                ((x) v1Var).y(i0Var);
            }
        }
        this.W = f10;
        if (!this.E) {
            H0(P0());
        }
        if (this == ((k1) i0Var.Z.f1459y)) {
            ((x) m0.a(i0Var)).getRectManager().f(i0Var, !i0Var.f1478a0.f1558p.E);
        }
    }

    public final void x1(a aVar, boolean z3, boolean z9) {
        u1 u1Var = this.f1531e0;
        if (u1Var != null) {
            if (this.O) {
                if (z9) {
                    long g12 = g1();
                    float intBitsToFloat = Float.intBitsToFloat((int) (g12 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (g12 & 4294967295L)) / 2.0f;
                    long j10 = this.f31771w;
                    aVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j10 >> 32)) + intBitsToFloat, ((int) (j10 & 4294967295L)) + intBitsToFloat2);
                } else if (z3) {
                    long j11 = this.f31771w;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            y1 y1Var = (y1) u1Var;
            float[] b10 = y1Var.b();
            if (!y1Var.M) {
                if (b10 == null) {
                    aVar.f18758a = 0.0f;
                    aVar.f18759b = 0.0f;
                    aVar.f18760c = 0.0f;
                    aVar.f18761d = 0.0f;
                } else {
                    d0.c(b10, aVar);
                }
            }
        }
        long j12 = this.V;
        float f10 = (int) (j12 >> 32);
        aVar.f18758a += f10;
        aVar.f18760c += f10;
        float f11 = (int) (j12 & 4294967295L);
        aVar.f18759b += f11;
        aVar.f18761d += f11;
    }

    public final void y1() {
        if (this.f1531e0 != null) {
            E1(null, false);
            this.I.U(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [e] */
    public final void z1(q0 q0Var) {
        k1 k1Var;
        q0 q0Var2 = this.T;
        if (q0Var != q0Var2) {
            this.T = q0Var;
            i0 i0Var = this.I;
            int i = 0;
            if (q0Var2 == null || q0Var.getWidth() != q0Var2.getWidth() || q0Var.getHeight() != q0Var2.getHeight()) {
                int width = q0Var.getWidth();
                int height = q0Var.getHeight();
                u1 u1Var = this.f1531e0;
                if (u1Var != null) {
                    ((y1) u1Var).e((width << 32) | (height & 4294967295L));
                } else if (i0Var.J() && (k1Var = this.M) != null) {
                    k1Var.o1();
                }
                x0((height & 4294967295L) | (width << 32));
                if (this.P != null) {
                    F1(false);
                }
                boolean g8 = g(4);
                q h12 = h1();
                if (g8 || (h12 = h12.f15692y) != null) {
                    for (q j12 = j1(g8); j12 != null && (j12.f15691x & 4) != 0; j12 = j12.f15693z) {
                        if ((j12.f15690w & 4) != 0) {
                            k kVar = j12;
                            Object r92 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof n) {
                                    ((n) kVar).W();
                                } else if ((kVar.f15690w & 4) != 0 && (kVar instanceof k)) {
                                    q qVar = kVar.J;
                                    int i10 = 0;
                                    kVar = kVar;
                                    r92 = r92;
                                    while (qVar != null) {
                                        if ((qVar.f15690w & 4) != 0) {
                                            i10++;
                                            r92 = r92;
                                            if (i10 == 1) {
                                                kVar = qVar;
                                            } else {
                                                if (r92 == 0) {
                                                    r92 = new e(new q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r92.b(kVar);
                                                    kVar = 0;
                                                }
                                                r92.b(qVar);
                                            }
                                        }
                                        qVar = qVar.f15693z;
                                        kVar = kVar;
                                        r92 = r92;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar = e(r92);
                            }
                        }
                        if (j12 == h12) {
                            break;
                        }
                    }
                }
                v1 v1Var = i0Var.H;
                if (v1Var != null) {
                    ((x) v1Var).y(i0Var);
                }
            }
            c0 c0Var = this.U;
            if ((c0Var != null && c0Var.e != 0) || !q0Var.b().isEmpty()) {
                c0 c0Var2 = this.U;
                Map b10 = q0Var.b();
                if (c0Var2 != null && c0Var2.e == b10.size()) {
                    Object[] objArr = c0Var2.f20850b;
                    int[] iArr = c0Var2.f20851c;
                    long[] jArr = c0Var2.f20849a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        loop0: while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = i; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr[i14];
                                        int i15 = iArr[i14];
                                        Integer num = (Integer) b10.get((o) obj);
                                        if (num == null || num.intValue() != i15) {
                                            break loop0;
                                        }
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    return;
                                }
                            }
                            if (i11 != length) {
                                i11++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                i0Var.f1478a0.f1558p.Q.f();
                c0 c0Var3 = this.U;
                if (c0Var3 == null) {
                    c0 c0Var4 = m0.f20916a;
                    c0Var3 = new c0();
                    this.U = c0Var3;
                }
                c0Var3.a();
                for (Map.Entry entry : q0Var.b().entrySet()) {
                    c0Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    @Override // r0
    public final x M0() {
        return this;
    }
}