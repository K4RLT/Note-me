package a0;
import b0.j0;
import b0.u;
import b0.v;
import c0.d;
import c0.o0;
import i0.s;
import j.i0;
import j0.a;
import k0.j0;
import k0.k0;
import k0.l0;
import k0.o;
import l.a;
import n.d0;
import n.f0;
import n.j0;
import n.k;
import n0.c;
import p.a;
import p.z;
import q.x;
import u.c;
import w.a;

import android.content.res.Resources;
import android.os.CancellationSignal;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.w0;
import b2.i2;
import b2.k1;
import b2.k2;
import c2.b2;
import c2.s1;
import c2.x1;
import c2.y1;
import com.google.android.gms.internal.ads.gl;
import g0.d2;
import g0.r0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k1.q0;
import r0.e1;
import t.f1;
import z1.h1;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f80u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f81v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, f1 f1Var) {
        super(1);
        this.f80u = 8;
        this.f81v = o0Var;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [z1.a1, b2.a] */
    @Override // df.l
    public final Object invoke(Object obj) {
        z zVar;
        boolean z3;
        float f10;
        switch (this.f80u) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                l0 l0Var = (l0) this.f81v;
                float f11 = -floatValue;
                if ((f11 < 0.0f && !l0Var.c()) || (f11 > 0.0f && !l0Var.b())) {
                    f11 = 0.0f;
                } else {
                    if (Math.abs(l0Var.f91g) > 0.5f) {
                        a.c("entered drag with non-zero pending scroll");
                    }
                    float f12 = l0Var.f91g + f11;
                    l0Var.f91g = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = l0Var.f91g;
                        int b10 = ff.a.b(f13);
                        z d2 = ((z) l0Var.e.getValue()).d(b10, !l0Var.f87b);
                        if (d2 != null && (zVar = l0Var.f88c) != null) {
                            z d10 = zVar.d(b10, true);
                            if (d10 != null) {
                                l0Var.f88c = d10;
                            } else {
                                d2 = null;
                            }
                        }
                        if (d2 != null) {
                            l0Var.f(d2, l0Var.f87b, true);
                            l0Var.f101r.setValue(pe.z.f22715a);
                            l0Var.h(f13 - l0Var.f91g, d2);
                        } else {
                            b2.i0 i0Var = l0Var.f93j;
                            if (i0Var != null) {
                                i0Var.k();
                            }
                            l0Var.h(f13 - l0Var.f91g, l0Var.g());
                        }
                    }
                    if (Math.abs(l0Var.f91g) > 0.5f) {
                        f11 -= l0Var.f91g;
                        l0Var.f91g = 0.0f;
                    }
                }
                return Float.valueOf(-f11);
            case 1:
                Throwable th = (Throwable) obj;
                l6.j jVar = ((a6.k) this.f81v).f279u;
                if (th == null) {
                    if (!jVar.isDone()) {
                        x.n("Failed requirement.");
                        return null;
                    }
                } else if (th instanceof CancellationException) {
                    jVar.cancel(true);
                } else {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    jVar.l(th);
                }
                return pe.z.f22715a;
            case 2:
                return new u(0, (v) this.f81v);
            case 3:
                return new u(2, (j0) this.f81v);
            case 4:
                a1.o oVar = (a1.o) this.f81v;
                if (oVar != null) {
                    z3 = oVar.b(obj);
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 5:
                b2.a aVar = (b2.a) obj;
                b2.j0 j0Var = (b2.j0) this.f81v;
                if (aVar.Q()) {
                    if (aVar.b().f1506b) {
                        aVar.P();
                    }
                    for (Map.Entry entry : aVar.b().f1510g.entrySet()) {
                        b2.a(j0Var, (z1.o) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.g());
                    }
                    k1 k1Var = aVar.g().M;
                    k1Var.getClass();
                    while (!k1Var.equals(j0Var.f1505a.g())) {
                        for (z1.o oVar2 : j0Var.b(k1Var).keySet()) {
                            b2.a(j0Var, oVar2, j0Var.c(k1Var, oVar2), k1Var);
                        }
                        k1Var = k1Var.M;
                        k1Var.getClass();
                    }
                }
                return pe.z.f22715a;
            case 6:
                ((t0.e) this.f81v).b((d1.p) obj);
                return Boolean.TRUE;
            case 7:
                ((b2.i0) this.f81v).Z((y2.c) obj);
                return pe.z.f22715a;
            case 8:
                float floatValue2 = ((Number) obj).floatValue();
                d dVar = ((o0) this.f81v).f3387b;
                if (dVar.o() != 0) {
                    f10 = floatValue2 / dVar.o();
                } else {
                    f10 = 0.0f;
                }
                dVar.f3348s.i(dVar.i(dVar.j() + ff.a.b(f10)));
                return pe.z.f22715a;
            case 9:
                return Boolean.valueOf(((k) this.f81v).a(((j2.n) obj).f18825g));
            case 10:
                return Boolean.valueOf(c2.c((j2.n) obj, (Resources) this.f81v));
            case 11:
                return new u(3, (s1) this.f81v);
            case 12:
                boolean compareAndSet = x1.f3720b.compareAndSet(false, true);
                pe.z zVar2 = pe.z.f22715a;
                if (compareAndSet) {
                    ((rf.h) this.f81v).e(zVar2);
                }
                return zVar2;
            case 13:
                m1.d dVar2 = (m1.d) obj;
                y1 y1Var = (y1) this.f81v;
                k1.p j10 = dVar2.p0().j();
                df.p pVar = y1Var.f3730x;
                if (pVar != null) {
                    pVar.invoke(j10, (n1.b) dVar2.p0().f18637w);
                }
                return pe.z.f22715a;
            case 14:
                r2.m mVar = (r2.m) obj;
                s sVar = mVar.f24500b;
                if (sVar != null) {
                    sVar.closeConnection();
                    mVar.f24500b = null;
                }
                b2 b2Var = (b2) this.f81v;
                t0.e eVar = b2Var.f3475d;
                Object[] objArr = eVar.f25617u;
                int i = eVar.f25619w;
                int i10 = 0;
                while (true) {
                    if (i10 < i) {
                        if (!kotlin.jvm.internal.a((k2) objArr[i10], mVar)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    eVar.n(i10);
                }
                if (eVar.f25619w == 0) {
                    b2Var.f3473b.invoke();
                }
                return pe.z.f22715a;
            case 15:
                ((j2.j) obj).k(l0.f19351c, new k0.k0(r0.f17268u, ((o) this.f81v).a(), j0.f19315v, true));
                return pe.z.f22715a;
            case 16:
                float[] fArr = ((k1.d0) obj).f19471a;
                z1.x xVar = (z1.x) this.f81v;
                if (xVar.i()) {
                    h1.i(xVar).A(xVar, fArr);
                }
                return pe.z.f22715a;
            case 17:
                float floatValue3 = ((Number) obj).floatValue();
                d2 d2Var = (d2) this.f81v;
                e1 e1Var = d2Var.f17047a;
                float h3 = e1Var.h() + floatValue3;
                e1 e1Var2 = d2Var.f17048b;
                if (h3 > e1Var2.h()) {
                    floatValue3 = e1Var2.h() - e1Var.h();
                } else if (h3 < 0.0f) {
                    floatValue3 = -e1Var.h();
                }
                e1Var.i(e1Var.h() + floatValue3);
                return Float.valueOf(floatValue3);
            case 18:
                g1.f fVar = (g1.f) obj;
                if (!fVar.f15688u.H) {
                    return i2.f1502v;
                }
                g1.f fVar2 = fVar.J;
                i2 i2Var = i2.f1501u;
                if (fVar2 != null) {
                    k0 k0Var = new k0(18, (z5.h) this.f81v);
                    if (k0Var.invoke(fVar2) == i2Var) {
                        b2.l.y(fVar2, k0Var);
                    }
                }
                fVar.J = null;
                fVar.I = null;
                return i2Var;
            case 19:
                k1.m0 m0Var = (k1.m0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f81v;
                m0Var.j(m0Var.J.a() * shadowGraphicsLayerElement.f605a);
                m0Var.k(shadowGraphicsLayerElement.f606b);
                m0Var.f(shadowGraphicsLayerElement.f607c);
                m0Var.c(shadowGraphicsLayerElement.f608d);
                m0Var.l(shadowGraphicsLayerElement.e);
                return pe.z.f22715a;
            case 20:
                ((s) this.f81v).a((r2.g) obj);
                return pe.z.f22715a;
            case gl.zzm /* 21 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f81v).cancel();
                }
                return pe.z.f22715a;
            case 22:
                j2.c((j2.j) obj, ((j2.g) this.f81v).f18786a);
                return pe.z.f22715a;
            case 23:
                ((List) obj).add((Float) ((w0) this.f81v).invoke());
                return true;
            case 24:
                k1.m0 m0Var2 = (k1.m0) obj;
                q0 q0Var = (q0) this.f81v;
                m0Var2.h(q0Var.I);
                m0Var2.i(q0Var.J);
                m0Var2.b(q0Var.K);
                m0Var2.n(0.0f);
                m0Var2.r(0.0f);
                m0Var2.j(q0Var.L);
                m0Var2.g(q0Var.M);
                m0Var2.d(q0Var.N);
                m0Var2.m(q0Var.O);
                m0Var2.k(q0Var.P);
                m0Var2.f(q0Var.Q);
                m0Var2.c(q0Var.R);
                m0Var2.l(q0Var.S);
                int i11 = q0Var.T;
                if (m0Var2.L != i11) {
                    m0Var2.f19499u |= 524288;
                    m0Var2.L = i11;
                }
                return pe.z.f22715a;
            case 25:
                if (obj == ((d0) this.f81v)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 26:
                if (obj == ((f0) this.f81v)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 27:
                if (obj == ((j0) this.f81v)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 28:
                m1.d dVar3 = (m1.d) obj;
                n1.b bVar = (n1.b) this.f81v;
                k1.i0 i0Var2 = bVar.f21022l;
                if (bVar.f21024n && bVar.f21033w && i0Var2 != null) {
                    i0 p02 = dVar3.p0();
                    long r8 = p02.r();
                    p02.j().l();
                    try {
                        ((ic.c) p02.f18636v).d(i0Var2, 1);
                        bVar.c(dVar3);
                    } finally {
                        a.v(p02, r8);
                    }
                } else {
                    bVar.c(dVar3);
                }
                return pe.z.f22715a;
            default:
                return ((z) this.f81v).e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, Object obj) {
        super(1);
        this.f80u = i;
        this.f81v = obj;
    }
}
