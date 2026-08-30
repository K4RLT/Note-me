package r7;
import a.a;
import d.d;
import l.a;
import m.a;
import m.d;
import m.h;

import b2.b0;
import com.daren.scraply.R;
import d1.o;
import df.p;
import k1.c0;
import k1.k0;
import k1.l0;
import o0.x1;
import pe.z;
import q2.s;
import r0.r;
import r0.v0;
import r0.y;
import wa.j7;
import wa.m7;
import wa.n7;
import wa.p9;
import x.o0;
import x.p0;
import x.q;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24619u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f24620v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f24621w;

    public /* synthetic */ d(String str, df.a aVar) {
        this.f24620v = str;
        this.f24621w = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        int i = this.f24619u;
        z zVar = z.f22715a;
        df.a aVar = this.f24621w;
        String str = this.f24620v;
        switch (i) {
            case 0:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Integer) obj2).intValue();
                d1.j jVar = d1.c.f15674y;
                d1.i iVar = d1.c.E;
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    o oVar = o.f15687a;
                    float f10 = 20;
                    d1.r a10 = j7.a(m7.a(androidx.compose.foundation.layout.d.n(oVar, 320), 18, f0.e.a(f10), 0L, k1.r.c(k1.r.f19513b, 0.5f), 12), f0.e.a(f10));
                    long j10 = e.f24622a;
                    k0 k0Var = l0.f19495a;
                    d1.r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(a10, j10, k0Var), f10);
                    float f11 = 12;
                    x.r a11 = q.a(x.h.i(f11), d1.c.H, rVar, 54);
                    int hashCode = Long.hashCode(rVar.T);
                    z0.g l10 = rVar.l();
                    d1.r c10 = d1.a.c(k3, rVar);
                    b2.h.f1471d.getClass();
                    b0 b0Var = b2.g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    b2.f fVar = b2.g.e;
                    y.I(fVar, a11, rVar);
                    b2.f fVar2 = b2.g.f1464d;
                    y.I(fVar2, l10, rVar);
                    b2.f fVar3 = b2.g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                        p.a.t(hashCode, rVar, hashCode, fVar3);
                    }
                    b2.f fVar4 = b2.g.f1463c;
                    y.I(fVar4, c10, rVar);
                    d1.r d2 = androidx.compose.foundation.layout.d.d(oVar, 1.0f);
                    p0 a12 = o0.a(x.h.e, iVar, rVar, 54);
                    int hashCode2 = Long.hashCode(rVar.T);
                    z0.g l11 = rVar.l();
                    d1.r c11 = d1.a.c(d2, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a12, rVar);
                    y.I(fVar2, l11, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                        p.a.t(hashCode2, rVar, hashCode2, fVar3);
                    }
                    y.I(fVar4, c11, rVar);
                    float f12 = 8;
                    p0 a13 = o0.a(x.h.i(f12), iVar, rVar, 54);
                    int hashCode3 = Long.hashCode(rVar.T);
                    z0.g l12 = rVar.l();
                    d1.r c12 = d1.a.c(oVar, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a13, rVar);
                    y.I(fVar2, l12, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                        p.a.t(hashCode3, rVar, hashCode3, fVar3);
                    }
                    y.I(fVar4, c12, rVar);
                    long j11 = k1.r.f19515d;
                    x1.b("Scraply", null, j11, ae.e(18), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200070, 0, 131026);
                    e.a(0, null, rVar);
                    rVar.p(true);
                    d1.r b10 = androidx.compose.foundation.a.b(j7.a(androidx.compose.foundation.layout.d.k(oVar, 26), f0.e.f16629a), k1.r.c(j11, 0.08f), k0Var);
                    Object O = rVar.O();
                    v0 v0Var = r0.l.f24285a;
                    if (O == v0Var) {
                        O = p.a.r(rVar);
                    }
                    v.i iVar2 = (v.i) O;
                    boolean f13 = rVar.f(aVar);
                    Object O2 = rVar.O();
                    if (f13 || O2 == v0Var) {
                        O2 = new b8.z(2, aVar);
                        rVar.k0(O2);
                    }
                    d1.r e = androidx.compose.foundation.a.e(b10, iVar2, null, false, null, (df.a) O2, 28);
                    z1.p0 d10 = x.m.d(jVar, false);
                    int hashCode4 = Long.hashCode(rVar.T);
                    z0.g l13 = rVar.l();
                    d1.r c13 = d1.a.c(e, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, d10, rVar);
                    y.I(fVar2, l13, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode4))) {
                        p.a.t(hashCode4, rVar, hashCode4, fVar3);
                    }
                    y.I(fVar4, c13, rVar);
                    o0.y.b(p9.a(), "Cerrar", androidx.compose.foundation.layout.d.k(oVar, 13), j11, rVar, 3504, 0);
                    rVar.p(true);
                    rVar.p(true);
                    if (str != null) {
                        rVar.a0(-408643799);
                        x1.b(n7.c(R.string.pro_locked_feature, new Object[]{str}, rVar), null, k1.r.c(j11, 0.9f), ae.e(13), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                        z9 = false;
                    } else {
                        z9 = false;
                        rVar.a0(-413002988);
                    }
                    rVar.p(z9);
                    x.e i10 = x.h.i(6);
                    d1.r d11 = androidx.compose.foundation.layout.d.d(oVar, 1.0f);
                    x.r a14 = q.a(i10, d1.c.G, rVar, 6);
                    int hashCode5 = Long.hashCode(rVar.T);
                    z0.g l14 = rVar.l();
                    d1.r c14 = d1.a.c(d11, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, a14, rVar);
                    y.I(fVar2, l14, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode5))) {
                        p.a.t(hashCode5, rVar, hashCode5, fVar3);
                    }
                    y.I(fVar4, c14, rVar);
                    rVar.a0(-160448708);
                    for (String str2 : qe.h(n7.b(R.string.pro_perk_stickers, rVar), n7.b(R.string.pro_perk_frames, rVar), n7.b(R.string.pro_perk_textures, rVar), n7.b(R.string.pro_perk_support, rVar))) {
                        p0 a15 = o0.a(x.h.i(f12), iVar, rVar, 54);
                        int hashCode6 = Long.hashCode(rVar.T);
                        z0.g l15 = rVar.l();
                        d1.r c15 = d1.a.c(oVar, rVar);
                        b2.h.f1471d.getClass();
                        b0 b0Var2 = b2.g.f1462b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(b0Var2);
                        } else {
                            rVar.n0();
                        }
                        y.I(b2.g.e, a15, rVar);
                        y.I(b2.g.f1464d, l15, rVar);
                        b2.f fVar5 = b2.g.f1465f;
                        if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode6))) {
                            p.a.t(hashCode6, rVar, hashCode6, fVar5);
                        }
                        y.I(b2.g.f1463c, c15, rVar);
                        x.a(0, androidx.compose.foundation.a.b(j7.a(androidx.compose.foundation.layout.d.k(oVar, 5), f0.e.f16629a), e.f24623b, k0Var), rVar);
                        x1.b(str2, null, k1.r.c(k1.r.f19515d, 0.75f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
                        rVar.p(true);
                    }
                    rVar.p(false);
                    rVar.p(true);
                    d1.r a16 = j7.a(androidx.compose.foundation.layout.d.d(oVar, 1.0f), f0.e.a(f11));
                    long j12 = k1.r.f19515d;
                    d1.r a17 = androidx.compose.foundation.a(a16, new c0(qe.h(new k1.r(k1.r.c(j12, 0.1f)), new k1.r(k1.r.c(j12, 0.1f))), null, 0L, 9187343241974906880L), 6);
                    Object O3 = rVar.O();
                    if (O3 == v0Var) {
                        O3 = p.a.r(rVar);
                    }
                    v.i iVar3 = (v.i) O3;
                    boolean f14 = rVar.f(null);
                    Object O4 = rVar.O();
                    if (f14 || O4 == v0Var) {
                        O4 = new fg.o(24);
                        rVar.k0(O4);
                    }
                    d1.r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.e(a17, iVar3, null, false, null, (df.a) O4, 24), 0.0f, f11, 1);
                    z1.p0 d12 = x.m.d(jVar, false);
                    int hashCode7 = Long.hashCode(rVar.T);
                    z0.g l16 = rVar.l();
                    d1.r c16 = d1.a.c(m4, rVar);
                    b2.h.f1471d.getClass();
                    b0 b0Var3 = b2.g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var3);
                    } else {
                        rVar.n0();
                    }
                    y.I(b2.g.e, d12, rVar);
                    y.I(b2.g.f1464d, l16, rVar);
                    b2.f fVar6 = b2.g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode7))) {
                        p.a.t(hashCode7, rVar, hashCode7, fVar6);
                    }
                    y.I(b2.g.f1463c, c16, rVar);
                    rVar.a0(1281241883);
                    rVar.p(false);
                    x1.b("Próximamente", null, j12, ae.e(13), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                    rVar.p(true);
                    rVar.p(true);
                    return zVar;
                }
                rVar.U();
                return zVar;
            default:
                ((Integer) obj2).getClass();
                z7.c.b(str, aVar, (r0.m) obj, y.L(49));
                return zVar;
        }
    }

    public /* synthetic */ d(String str, df.a aVar, int i) {
        this.f24620v = str;
        this.f24621w = aVar;
    }
}
