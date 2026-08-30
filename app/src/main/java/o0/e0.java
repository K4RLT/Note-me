package o0;
import j1.d;
import j1.e;
import o0.a;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c2.c2;
import c2.q0;
import d.d;
import d1.c;
import d1.o;
import d1.r;
import g0.l0;
import k1.p0;
import q.d1;
import q.e;
import q.f1;
import q.g1;
import q.i0;
import q.j1;
import q.k1;
import q.l1;
import q.m1;
import q.w;
import q.y;
import r0.a1;
import r0.c0;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import x.j0;
import x.o0;

import r0.o2;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21456a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f21457b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21458c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f21459d = 8;
    public static final float e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f21460f = 280;

    static {
        float f10 = 48;
        f21456a = f10;
        f21457b = f10;
    }

    public static final void a(r rVar, i0 i0Var, a1 a1Var, l1 l1Var, p0 p0Var, long j10, float f10, float f11, c cVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f12;
        i1 i1Var;
        w wVar;
        k1 s10;
        boolean z3;
        float f13;
        boolean z9;
        k1 s11;
        r rVar2;
        boolean z10;
        boolean z11;
        r rVar3 = (r) mVar;
        rVar3.c0(-151448888);
        if (rVar3.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i19 = i | i10;
        if (rVar3.f(i0Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i20 = i19 | i11;
        if (rVar3.f(l1Var)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i21 = i20 | i12;
        if (rVar3.f(p0Var)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i22 = i21 | i13;
        if (rVar3.e(j10)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i23 = i22 | i14;
        if (rVar3.c(f10)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i24 = i23 | i15;
        if (rVar3.c(f11)) {
            i16 = 8388608;
        } else {
            i16 = 4194304;
        }
        int i25 = i24 | i16;
        if (rVar3.f(null)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        int i26 = i25 | i17;
        if (rVar3.h(cVar)) {
            i18 = 536870912;
        } else {
            i18 = 268435456;
        }
        int i27 = i26 | i18;
        if ((306783379 & i27) == 306783378 && rVar3.D()) {
            rVar3.U();
            rVar2 = rVar3;
        } else {
            g1 e8 = j1.e(i0Var, rVar3, (((i27 >> 3) & 14) | 48) & 126, 0);
            l1 l1Var2 = m1.f22948a;
            Object c10 = e8.c();
            i1 i1Var2 = e8.f22905d;
            boolean booleanValue = ((Boolean) c10).booleanValue();
            rVar3.a0(2139028452);
            float f14 = 0.8f;
            float f15 = 1.0f;
            if (booleanValue) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            rVar3.p(false);
            Float valueOf = Float.valueOf(f12);
            boolean booleanValue2 = ((Boolean) i1Var2.getValue()).booleanValue();
            rVar3.a0(2139028452);
            if (booleanValue2) {
                f14 = 1.0f;
            }
            rVar3.p(false);
            Float valueOf2 = Float.valueOf(f14);
            d1 f16 = e8.f();
            rVar3.a0(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (f16.b(bool, bool2)) {
                i1Var = i1Var2;
                s10 = e.s(120, 0, y.f23032b, 2);
                z3 = false;
                wVar = null;
            } else {
                i1Var = i1Var2;
                wVar = null;
                s10 = e.s(1, 74, null, 4);
                z3 = false;
            }
            rVar3.p(z3);
            boolean z12 = z3;
            f1 d2 = j1.d(e8, valueOf, valueOf2, s10, l1Var2, rVar3, 0);
            boolean booleanValue3 = ((Boolean) e8.c()).booleanValue();
            rVar3.a0(-249413128);
            if (booleanValue3) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            rVar3.p(z12);
            Float valueOf3 = Float.valueOf(f13);
            boolean booleanValue4 = ((Boolean) i1Var.getValue()).booleanValue();
            rVar3.a0(-249413128);
            if (!booleanValue4) {
                f15 = 0.0f;
            }
            rVar3.p(z12);
            Float valueOf4 = Float.valueOf(f15);
            d1 f17 = e8.f();
            rVar3.a0(-1355418157);
            if (f17.b(bool, bool2)) {
                z9 = false;
                s11 = e.s(30, 0, wVar, 6);
            } else {
                z9 = false;
                s11 = e.s(75, 0, wVar, 6);
            }
            rVar3.p(z9);
            f1 d10 = j1.d(e8, valueOf3, valueOf4, s11, l1Var2, rVar3, 0);
            rVar2 = rVar3;
            boolean booleanValue5 = ((Boolean) rVar2.j(c2.f3492a)).booleanValue();
            boolean g8 = rVar2.g(booleanValue5) | rVar2.f(d2);
            if ((i27 & 112) != 32) {
                z10 = z9;
            } else {
                z10 = true;
            }
            boolean f18 = g8 | z10 | rVar2.f(d10);
            Object O = rVar2.O();
            if (!f18 && O != l.f24285a) {
                z11 = z9;
            } else {
                z11 = z9;
                l0 l0Var = new l0(booleanValue5, i0Var, a1Var, d2, d10);
                rVar2.k0(l0Var);
                O = l0Var;
            }
            r a10 = androidx.compose.ui.graphics.a(o.f15687a, (df.l) O);
            c d11 = h.d(1573559053, new q0(3, rVar, l1Var, cVar), rVar2);
            c0 c0Var = o1.f21612a;
            o2 o2Var = o.f21604a;
            rVar2.a0(-1680936624);
            m mVar2 = (m) rVar2.j(o.f21604a);
            long j11 = mVar2.f21555a;
            long j12 = mVar2.f21569q;
            int i28 = r.f19522m;
            if (pe.a(j10, j11)) {
                j12 = mVar2.f21556b;
            } else if (pe.a(j10, mVar2.f21559f)) {
                j12 = mVar2.f21560g;
            } else if (pe.a(j10, mVar2.f21562j)) {
                j12 = mVar2.f21563k;
            } else if (pe.a(j10, mVar2.f21566n)) {
                j12 = mVar2.f21567o;
            } else if (pe.a(j10, mVar2.f21575w)) {
                j12 = mVar2.f21576x;
            } else if (pe.a(j10, mVar2.f21557c)) {
                j12 = mVar2.f21558d;
            } else if (pe.a(j10, mVar2.f21561h)) {
                j12 = mVar2.i;
            } else if (pe.a(j10, mVar2.f21564l)) {
                j12 = mVar2.f21565m;
            } else if (pe.a(j10, mVar2.f21577y)) {
                j12 = mVar2.f21578z;
            } else if (pe.a(j10, mVar2.f21573u)) {
                j12 = mVar2.f21574v;
            } else if (!pe.a(j10, mVar2.f21568p)) {
                if (pe.a(j10, mVar2.f21570r)) {
                    j12 = mVar2.f21571s;
                } else if (!pe.a(j10, mVar2.D) && !pe.a(j10, mVar2.F) && !pe.a(j10, mVar2.G) && !pe.a(j10, mVar2.H) && !pe.a(j10, mVar2.I) && !pe.a(j10, mVar2.J)) {
                    j12 = r.f19521l;
                }
            }
            if (j12 == 16) {
                j12 = ((r) rVar2.j(q.f21634a)).f19523a;
            }
            rVar2.p(z11);
            c0 c0Var2 = o1.f21612a;
            float f19 = ((y2.f) rVar2.j(c0Var2)).f30805u + f10;
            y.b(new k9.z[]{q.f21634a.a(new r(j12)), c0Var2.a(new y2.f(f19))}, h.d(-70914509, new n1(a10, p0Var, j10, f19, f11, d11), rVar2), rVar2, 56);
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new a(rVar, i0Var, a1Var, l1Var, p0Var, j10, f10, f11, cVar, i);
        }
    }

    public static final void b(c cVar, df.a aVar, r rVar, boolean z3, c0 c0Var, j0 j0Var, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        r rVar2 = (r) mVar;
        rVar2.c0(-1564716777);
        if ((i & 6) == 0) {
            if (rVar2.h(cVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(aVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(rVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i & 3072) == 0) {
            if (rVar2.h(null)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((i & 24576) == 0) {
            if (rVar2.h(null)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((196608 & i) == 0) {
            if (rVar2.g(z3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((1572864 & i) == 0) {
            if (rVar2.f(c0Var)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        }
        if ((12582912 & i) == 0) {
            if (rVar2.f(j0Var)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((100663296 & i) == 0) {
            if (rVar2.f(null)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i10 |= i11;
        }
        if ((i10 & 38347923) == 38347922 && rVar2.D()) {
            rVar2.U();
        } else {
            r j10 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.d(androidx.compose.foundation.a.e(rVar, null, a(true, 0.0f, rVar2, 6, 6), z3, null, aVar, 24), 1.0f), e, f21457b, f21460f, Float.NaN), j0Var);
            p0 a10 = o0.a(h.f29961a, c.E, rVar2, 48);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(j10, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(g.e, a10, rVar2);
            y.I(g.f1464d, l10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar2);
            a(((b2) rVar2.j(c2.f21442a)).f21426m, h.d(1065051884, new d0(c0Var, z3, cVar), rVar2), rVar2, 48);
            rVar2.p(true);
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new c(cVar, aVar, rVar, z3, c0Var, j0Var, i, 1);
        }
    }
}
