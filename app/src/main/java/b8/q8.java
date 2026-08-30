package b8;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d.f;
import d1.a;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import f0.e;
import k1.l0;
import k1.r;
import k7.f;
import l.a;
import m.d;
import m7.a;
import o0.x1;
import p.a;
import q2.s;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import u7.m3;
import x2.k;
import x7.n0;
import z0.g;

import java.util.List;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class q8 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2600u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f2601v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2602w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2603x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2604y;

    public /* synthetic */ q8(String str, String str2, df.a aVar, String str3) {
        this.f2600u = 2;
        this.f2603x = str;
        this.f2602w = str2;
        this.f2601v = aVar;
        this.f2604y = str3;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f2600u) {
            case 0:
                ((Integer) obj2).getClass();
                z9.m((f) this.f2602w, (String) this.f2603x, this.f2601v, (df.r) this.f2604y, (m) obj, y.L(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z9.k((List) this.f2602w, (m3) this.f2603x, this.f2601v, (df.l) this.f2604y, (m) obj, y.L(3521));
                break;
            default:
                String str = (String) this.f2603x;
                String str2 = (String) this.f2602w;
                String str3 = (String) this.f2604y;
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
                    r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 32);
                    j jVar = c.f15674y;
                    z1.p0 d10 = x.d(jVar, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c10 = a.c(k3, rVar);
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
                    y.I(fVar4, c10, rVar);
                    o oVar = o.f15687a;
                    float f10 = 24;
                    float f11 = 16;
                    r k4 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(wa.a(androidx.compose.foundation.layout.d.o(oVar, Float.NaN, 400), f10, e.a(f11), 0L, r.c(r.f19513b, 0.5f), 12), d2, e.a(f11)), f10);
                    x.r a10 = x.q.a(x.h.f29962b, c.H, rVar, 48);
                    int hashCode2 = Long.hashCode(rVar.T);
                    g l11 = rVar.l();
                    r c11 = a.c(k4, rVar);
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
                    y.I(fVar4, c11, rVar);
                    long j10 = r.f19515d;
                    x1.b(str, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, f11, 7), j10, ae.e(20), null, s.B, null, 0L, new k(3), 0L, 0, false, 0, 0, null, rVar, 200112, 0, 130512);
                    x1.b(str2, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, f10, 7), r.c(j10, 0.85f), ae.e(15), null, null, null, 0L, new k(3), ae.e(22), 0, false, 0, 0, null, rVar, 3504, 6, 129520);
                    r b10 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(oVar, 1.0f), 48), r.c(j10, 0.1f), e.a(12));
                    df.a aVar = this.f2601v;
                    boolean f12 = rVar.f(aVar);
                    Object O = rVar.O();
                    if (f12 || O == l.f24285a) {
                        O = new n0(0, aVar);
                        rVar.k0(O);
                    }
                    r f13 = androidx.compose.foundation.a.f(null, false, b10, (df.a) O, 7);
                    z1.p0 d11 = x.d(jVar, false);
                    int hashCode3 = Long.hashCode(rVar.T);
                    g l12 = rVar.l();
                    r c12 = a.c(f13, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar, d11, rVar);
                    y.I(fVar2, l12, rVar);
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                        a.t(hashCode3, rVar, hashCode3, fVar3);
                    }
                    y.I(fVar4, c12, rVar);
                    x1.b(str3, null, j10, ae.e(15), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                    rVar.p(true);
                    rVar.p(true);
                    rVar.p(true);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ q8(Object obj, Object obj2, df.a aVar, pe.d dVar, int i, int i10) {
        this.f2600u = i10;
        this.f2602w = obj;
        this.f2603x = obj2;
        this.f2601v = aVar;
        this.f2604y = dVar;
    }
}
