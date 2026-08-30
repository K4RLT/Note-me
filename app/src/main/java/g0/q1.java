package g0;
import p0.b;
import a0.j0;
import b1.v;
import b2.k0;
import c2.d2;
import c2.p1;
import d1.o;
import d1.r;
import i0.h;
import k1.r0;
import m2.g;
import m2.p0;
import n.i0;
import p.k;
import p.p;
import p.x;
import p.y;
import r0.l;
import r0.m;
import r0.v0;
import z0.c;

import c2.u2;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17259w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17260x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17261y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.f17257u = i;
        this.f17258v = obj;
        this.f17259w = obj2;
        this.f17260x = obj3;
        this.f17261y = obj4;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        Object obj4;
        boolean z9;
        boolean h3;
        int i;
        switch (this.f17257u) {
            case 0:
                r rVar = (r) obj;
                ((Number) obj3).intValue();
                e1 e1Var = (e1) this.f17259w;
                r0 r0Var = (r0) this.f17258v;
                r2.x xVar = (r2.x) this.f17260x;
                r rVar2 = (r) ((m) obj2);
                rVar2.a0(-84507373);
                boolean booleanValue = ((Boolean) rVar2.j(p1.f3620w)).booleanValue();
                boolean g8 = rVar2.g(booleanValue);
                Object O = rVar2.O();
                v0 v0Var = l.f24285a;
                if (g8 || O == v0Var) {
                    O = new h(booleanValue);
                    rVar2.k0(O);
                }
                h hVar = (h) O;
                if (r0Var.f19524a == 16) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (((Boolean) ((d2) ((u2) rVar2.j(p1.f3617t))).f3506a.getValue()).booleanValue() && e1Var.b() && p0.b(xVar.f24516b) && z3) {
                    rVar2.a0(808460990);
                    g gVar = xVar.f24515a;
                    p0 p0Var = new p0(xVar.f24516b);
                    boolean h10 = rVar2.h(hVar);
                    Object O2 = rVar2.O();
                    if (h10 || O2 == v0Var) {
                        O2 = new j0(hVar, null, 6);
                        rVar2.k0(O2);
                    }
                    y.g(gVar, p0Var, (df.p) O2, rVar2);
                    boolean f10 = rVar2.f(xVar) | rVar2.h(hVar) | rVar2.h((r2.q) this.f17261y) | rVar2.h(e1Var) | rVar2.f(r0Var);
                    r2.q qVar = (r2.q) this.f17261y;
                    r2.x xVar2 = (r2.x) this.f17260x;
                    Object O3 = rVar2.O();
                    if (f10 || O3 == v0Var) {
                        c3.h hVar2 = new c3.h(hVar, qVar, xVar2, e1Var, r0Var, 2);
                        rVar2.k0(hVar2);
                        O3 = hVar2;
                    }
                    obj4 = androidx.compose.ui.draw.a.c(rVar, (df.l) O3);
                    rVar2.p(false);
                } else {
                    rVar2.a0(810474750);
                    rVar2.p(false);
                    obj4 = o.f15687a;
                }
                rVar2.p(false);
                return obj4;
            default:
                x xVar3 = (x) obj;
                m mVar = (m) obj2;
                int intValue = ((Number) obj3).intValue();
                v vVar = (v) this.f17258v;
                p pVar = (p) this.f17260x;
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h3 = ((r) mVar).f(xVar3);
                    } else {
                        h3 = ((r) mVar).h(xVar3);
                    }
                    if (h3) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar3 = (r) mVar;
                if (rVar3.R(intValue & 1, z9)) {
                    boolean f11 = rVar3.f(vVar);
                    Object obj5 = this.f17259w;
                    boolean h11 = f11 | rVar3.h(obj5) | rVar3.h(pVar);
                    Object O4 = rVar3.O();
                    v0 v0Var2 = l.f24285a;
                    if (h11 || O4 == v0Var2) {
                        O4 = new k0(12, vVar, obj5, pVar);
                        rVar3.k0(O4);
                    }
                    y.c(xVar3, (df.l) O4, rVar3);
                    i0 i0Var = pVar.f22222c;
                    xVar3.getClass();
                    i0Var.m(obj5, ((y) xVar3).f22292b);
                    Object O5 = rVar3.O();
                    if (O5 == v0Var2) {
                        O5 = new k(xVar3);
                        rVar3.k0(O5);
                    }
                    ((c) this.f17261y).d((k) O5, obj5, rVar3, 0);
                } else {
                    rVar3.U();
                }
                return pe.z.f22715a;
        }
    }
}
