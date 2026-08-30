package b8;
import j.t;
import x1.b;
import b.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.a;
import d1.c;
import d1.i;
import d1.j;
import d1.o;
import d1.r;
import f0.e;
import k1.l0;
import o0.k;
import o0.m;
import o0.x1;
import q2.s;
import r0.a1;
import r0.l;
import r0.v0;
import r0.y;

import com.daren.scraply.R;
import ya.ae;
import ya.yb;

/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2787u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f2788v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f2789w;

    public /* synthetic */ t6(df.a aVar, df.a aVar2) {
        this.f2787u = 2;
        this.f2788v = aVar;
        this.f2789w = aVar2;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        float f10;
        boolean z9;
        df.l lVar;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        int i;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        String str;
        float f11;
        long c10;
        int i10 = this.f2787u;
        pe.z zVar = pe.z.f22715a;
        df.a aVar = this.f2789w;
        df.a aVar2 = this.f2788v;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                i(aVar2, aVar, (m) obj, y.L(7));
                return zVar;
            case 1:
                ((Integer) obj2).getClass();
                yb.a(aVar2, aVar, (m) obj, y.L(55));
                return zVar;
            case 2:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    long d2 = l0.d(4062323239L);
                    Object O = rVar.O();
                    v0 v0Var = l.f24285a;
                    if (O == v0Var) {
                        O = y.B(Boolean.FALSE);
                        rVar.k0(O);
                    }
                    a1 a1Var = (a1) O;
                    r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 32);
                    j jVar = c.f15674y;
                    z1.p0 d10 = x.d(jVar, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c11 = a.c(k3, rVar);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    f fVar = g.e;
                    y.I(fVar, d10, rVar);
                    f fVar2 = g.f1464d;
                    y.I(fVar2, l10, rVar);
                    f fVar3 = g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar, hashCode, fVar3);
                    }
                    f fVar4 = g.f1463c;
                    y.I(fVar4, c11, rVar);
                    o oVar = o.f15687a;
                    float f12 = 24;
                    float f13 = 16;
                    r k4 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d.o(oVar, Float.NaN, 400), f12, e.a(f13), 0L, r.c(r.f19513b, 0.5f), 12), d2, e.a(f13)), f12);
                    h hVar = c.H;
                    x.c cVar = x.h.f29962b;
                    x.r a10 = x.q.a(cVar, hVar, rVar, 48);
                    int hashCode2 = Long.hashCode(rVar.T);
                    g l11 = rVar.l();
                    r c12 = a.c(k4, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a10, rVar);
                    y.I(fVar2, l11, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar, hashCode2, fVar3);
                    }
                    y.I(fVar4, c12, rVar);
                    String b10 = wa.n7.b(R.string.welcome_title, rVar);
                    long j24 = r.f19515d;
                    float f14 = 12;
                    x1.b(b10, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, f14, 7), j24, ae.e(20), null, s.B, null, 0L, new k(3), 0L, 0, false, 0, 0, null, rVar, 200112, 0, 130512);
                    x1.b(wa.n7.b(R.string.welcome_body, rVar), androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, 20, 7), r.c(j24, 0.85f), ae.e(14), null, null, null, 0L, new k(3), ae.e(20), 0, false, 0, 0, null, rVar, 3504, 6, 129520);
                    i iVar = c.E;
                    float f15 = 8;
                    r a11 = wa.a(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, f12, 7), e.a(f15));
                    Object O2 = rVar.O();
                    if (O2 == v0Var) {
                        f10 = f15;
                        O2 = new w7.h9(a1Var, 9);
                        rVar.k0(O2);
                    } else {
                        f10 = f15;
                    }
                    float f16 = 4;
                    r l12 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, a11, (df.a) O2, 7), f16, f16);
                    x.p0 a12 = x.a(x.h.f29961a, iVar, rVar, 48);
                    int hashCode3 = Long.hashCode(rVar.T);
                    g l13 = rVar.l();
                    r c13 = a.c(l12, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a12, rVar);
                    y.I(fVar2, l13, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                        a.t(hashCode3, rVar, hashCode3, fVar3);
                    }
                    y.I(fVar4, c13, rVar);
                    boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                    Object O3 = rVar.O();
                    if (O3 == v0Var) {
                        O3 = new w7.z8(a1Var, 5);
                        rVar.k0(O3);
                    }
                    df.l lVar2 = (df.l) O3;
                    long d11 = l0.d(4284246976L);
                    long c14 = r.c(j24, 0.5f);
                    long j25 = r.f19521l;
                    m mVar2 = (m) rVar.j(o.f21604a);
                    f fVar5 = mVar2.K;
                    if (fVar5 == null) {
                        long b11 = o.b(mVar2, a.f23049d);
                        long j26 = r.f19520k;
                        int i11 = a.f23047b;
                        long b12 = o.b(mVar2, i11);
                        int i12 = a.f23048c;
                        z9 = booleanValue;
                        lVar = lVar2;
                        fVar5 = new f(b11, j26, b12, j26, r.c(o.b(mVar2, i12), 0.38f), j26, r.c(o.b(mVar2, i12), 0.38f), o.b(mVar2, i11), o.b(mVar2, a.f23050f), r.c(o.b(mVar2, i12), 0.38f), r.c(o.b(mVar2, a.e), 0.38f), r.c(o.b(mVar2, i12), 0.38f));
                        mVar2.K = fVar5;
                    } else {
                        z9 = booleanValue;
                        lVar = lVar2;
                    }
                    long j27 = r.f19520k;
                    if (j24 != 16) {
                        j11 = j24;
                        j10 = 16;
                    } else {
                        j10 = 16;
                        j11 = fVar5.f21467a;
                    }
                    if (j27 != j10) {
                        j12 = j27;
                    } else {
                        j12 = fVar5.f21468b;
                    }
                    if (d11 != j10) {
                        j13 = j27;
                        j14 = d11;
                    } else {
                        j13 = j27;
                        j14 = fVar5.f21469c;
                    }
                    if (j27 != j10) {
                        j15 = j13;
                    } else {
                        j15 = fVar5.f21470d;
                    }
                    int i13 = (j25 > j10 ? 1 : (j25 == j10 ? 0 : -1));
                    if (i13 != 0) {
                        i = i13;
                        j16 = j25;
                    } else {
                        i = i13;
                        j16 = fVar5.e;
                    }
                    if (j27 != j10) {
                        j17 = j13;
                    } else {
                        j17 = fVar5.f21471f;
                    }
                    if (i != 0) {
                        j18 = j25;
                    } else {
                        j18 = fVar5.f21472g;
                    }
                    if (d11 != j10) {
                        j19 = d11;
                    } else {
                        j19 = fVar5.f21473h;
                    }
                    if (c14 != j10) {
                        j20 = c14;
                    } else {
                        j20 = fVar5.i;
                    }
                    if (i != 0) {
                        j21 = j25;
                    } else {
                        j21 = fVar5.f21474j;
                    }
                    if (i != 0) {
                        j22 = j25;
                    } else {
                        j22 = fVar5.f21475k;
                    }
                    if (i != 0) {
                        j23 = j25;
                    } else {
                        j23 = fVar5.f21476l;
                    }
                    k.a(z9, lVar, null, false, new f(j11, j12, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23), rVar, 48);
                    x.b(androidx.compose.foundation.layout.d.n(oVar, f10), rVar);
                    x.r a13 = x.q.a(cVar, c.G, rVar, 0);
                    int hashCode4 = Long.hashCode(rVar.T);
                    g l14 = rVar.l();
                    r c15 = a.c(oVar, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a13, rVar);
                    y.I(fVar2, l14, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode4))) {
                        a.t(hashCode4, rVar, hashCode4, fVar3);
                    }
                    y.I(fVar4, c15, rVar);
                    x1.b(wa.n7.b(R.string.welcome_terms_prefix, rVar), null, r.c(j24, 0.8f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
                    String b13 = wa.n7.b(R.string.welcome_terms_link, rVar);
                    long d12 = l0.d(4284246976L);
                    long e = ae.e(12);
                    s sVar = s.A;
                    r o10 = androidx.compose.foundation.layout.a.o(oVar, 0.0f, 2, 0.0f, 0.0f, 13);
                    boolean f17 = rVar.f(aVar);
                    Object O4 = rVar.O();
                    if (!f17 && O4 != v0Var) {
                        str = b13;
                    } else {
                        str = b13;
                        O4 = new z(28, aVar);
                        rVar.k0(O4);
                    }
                    x1.b(str, androidx.compose.foundation.a.f(null, false, o10, (df.a) O4, 7), d12, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131024);
                    rVar.p(true);
                    rVar.p(true);
                    r f18 = androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(oVar, 1.0f), 48);
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        f11 = 0.15f;
                    } else {
                        f11 = 0.05f;
                    }
                    r b14 = androidx.compose.foundation.a.b(f18, r.c(j24, f11), e.a(f14));
                    boolean booleanValue2 = ((Boolean) a1Var.getValue()).booleanValue();
                    boolean f19 = rVar.f(aVar2);
                    Object O5 = rVar.O();
                    if (f19 || O5 == v0Var) {
                        O5 = new z(29, aVar2);
                        rVar.k0(O5);
                    }
                    r f20 = androidx.compose.foundation.a.f(null, booleanValue2, b14, (df.a) O5, 6);
                    z1.p0 d13 = x.d(jVar, false);
                    int hashCode5 = Long.hashCode(rVar.T);
                    g l15 = rVar.l();
                    r c16 = a.c(f20, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, d13, rVar);
                    y.I(fVar2, l15, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode5))) {
                        a.t(hashCode5, rVar, hashCode5, fVar3);
                    }
                    y.I(fVar4, c16, rVar);
                    String b15 = wa.n7.b(R.string.welcome_start, rVar);
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        c10 = j24;
                    } else {
                        c10 = r.c(j24, 0.3f);
                    }
                    x1.b(b15, null, c10, ae.e(15), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 199680, 0, 131026);
                    rVar.p(true);
                    rVar.p(true);
                    rVar.p(true);
                    return zVar;
                }
                rVar.U();
                return zVar;
            default:
                ((Integer) obj2).getClass();
                j.t(aVar2, aVar, (m) obj, y.L(49));
                return zVar;
        }
    }

    public /* synthetic */ t6(df.a aVar, df.a aVar2, int i, int i10) {
        this.f2787u = i10;
        this.f2788v = aVar;
        this.f2789w = aVar2;
    }
}
