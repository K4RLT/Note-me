package b0;
import j1.d;
import m.d;
import a.a;
import d1.c;
import d1.o;
import d1.r;
import p.c0;
import q.f1;
import q.g1;
import q.j1;
import q.k1;
import q.l1;
import q.m1;
import q.z;
import r0.l;
import r0.m;
import r0.y;
import z0.g;

import g0.f2;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1152u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1153v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1154w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1155x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.p f1156y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(df.a aVar, r rVar, n0 n0Var, df.p pVar, int i) {
        super(2);
        this.f1153v = aVar;
        this.f1154w = rVar;
        this.f1155x = n0Var;
        this.f1156y = pVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        float f10;
        switch (this.f1152u) {
            case 0:
                ((Number) obj2).intValue();
                a((df.a) this.f1153v, (r) this.f1154w, (n0) this.f1155x, this.f1156y, (m) obj, y.L(1));
                return pe.z.f22715a;
            default:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    g1 g1Var = (g1) this.f1153v;
                    f2 f2Var = new f2(6, (k1) this.f1154w);
                    l1 l1Var = m1.f22948a;
                    Object c10 = g1Var.c();
                    rVar.a0(-438678252);
                    Object obj3 = this.f1155x;
                    float f11 = 0.0f;
                    if (kotlin.jvm.internal.a(c10, obj3)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    rVar.p(false);
                    Float valueOf = Float.valueOf(f10);
                    Object value = g1Var.f22905d.getValue();
                    rVar.a0(-438678252);
                    if (kotlin.jvm.internal.a(value, obj3)) {
                        f11 = 1.0f;
                    }
                    rVar.p(false);
                    f1 d2 = j1.d(g1Var, valueOf, Float.valueOf(f11), (z) f2Var.b(g1Var.f(), rVar, 0), l1Var, rVar, 0);
                    boolean f12 = rVar.f(d2);
                    Object O = rVar.O();
                    if (f12 || O == l.f24285a) {
                        O = new c0(1, d2);
                        rVar.k0(O);
                    }
                    r a10 = androidx.compose.ui.graphics.a(o.f15687a, (df.l) O);
                    c cVar = (c) this.f1156y;
                    z1.p0 d10 = m.d(c.f15670u, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c11 = a.c(a10, rVar);
                    b2.h.f1471d.getClass();
                    b2.b0 b0Var = b2.g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var);
                    } else {
                        rVar.n0();
                    }
                    y.I(b2.g.e, d10, rVar);
                    y.I(b2.g.f1464d, l10, rVar);
                    b2.f fVar = b2.g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar, hashCode, fVar);
                    }
                    y.I(b2.g.f1463c, c11, rVar);
                    cVar.b(obj3, rVar, 0);
                    rVar.p(true);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g1 g1Var, k1 k1Var, Object obj, c cVar) {
        super(2);
        this.f1153v = g1Var;
        this.f1154w = k1Var;
        this.f1155x = obj;
        this.f1156y = cVar;
    }
}
