package p;
import b1.v;
import c0.d0;
import d1.o;
import d1.r;
import g0.q1;
import l.a;
import q.d1;
import q.g1;
import r0.i1;
import r0.l;
import r0.m;
import z0.c;
import z0.h;

import g0.f2;
import ya.h9;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g1 f22146u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22147v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f22148w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f22149x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f22150y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f22151z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g1 g1Var, Object obj, df.l lVar, p pVar, v vVar, c cVar) {
        super(2);
        this.f22146u = g1Var;
        this.f22147v = obj;
        this.f22148w = lVar;
        this.f22149x = pVar;
        this.f22150y = vVar;
        this.f22151z = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        Object obj3;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            Object O = rVar.O();
            df.l lVar = this.f22148w;
            p pVar = this.f22149x;
            Object obj4 = l.f24285a;
            if (O == obj4) {
                O = (d0) lVar.invoke(pVar);
                rVar.k0(O);
            }
            d0 d0Var = (d0) O;
            g1 g1Var = this.f22146u;
            d1 f10 = g1Var.f();
            i1 i1Var = g1Var.f22905d;
            Object c10 = f10.c();
            Object obj5 = this.f22147v;
            boolean g8 = rVar.g(kotlin.jvm.internal.a(c10, obj5));
            Object O2 = rVar.O();
            if (g8 || O2 == obj4) {
                if (kotlin.jvm.internal.a(g1Var.f().c(), obj5)) {
                    obj3 = q0.f22231b;
                } else {
                    obj3 = ((d0) lVar.invoke(pVar)).f22123b;
                }
                O2 = obj3;
                rVar.k0(O2);
            }
            q0 q0Var = (q0) O2;
            Object O3 = rVar.O();
            if (O3 == obj4) {
                O3 = new l(kotlin.jvm.internal.a(obj5, i1Var.getValue()));
                rVar.k0(O3);
            }
            l lVar2 = (l) O3;
            p0 p0Var = d0Var.f22122a;
            boolean h3 = rVar.h(d0Var);
            Object O4 = rVar.O();
            if (h3 || O4 == obj4) {
                O4 = new f2(5, d0Var);
                rVar.k0(O4);
            }
            r b10 = androidx.compose.ui.layout.a.b(o.f15687a, (df.q) O4);
            lVar2.f22196a.setValue(Boolean.valueOf(kotlin.jvm.internal.a(obj5, i1Var.getValue())));
            r d2 = b10.d(lVar2);
            boolean h10 = rVar.h(obj5);
            Object O5 = rVar.O();
            if (h10 || O5 == obj4) {
                O5 = new f(0, obj5);
                rVar.k0(O5);
            }
            df.l lVar3 = (df.l) O5;
            boolean f11 = rVar.f(q0Var);
            Object O6 = rVar.O();
            if (f11 || O6 == obj4) {
                O6 = new d0(13, q0Var);
                rVar.k0(O6);
            }
            h9.a(g1Var, lVar3, d2, p0Var, q0Var, (df.p) O6, h.d(-616195562, new q1(this.f22150y, obj5, pVar, this.f22151z, 1), rVar), rVar, 12582912);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
