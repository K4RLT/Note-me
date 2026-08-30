package g0;
import g0.i;
import c2.p1;
import d.g;
import d1.o;
import d1.r;
import m2.g0;
import m2.h0;
import m2.q0;
import r0.l;
import r0.m;
import r0.v0;
import s1.a;

import r0.n2;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17283u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f17284v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f17285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i, int i10, q0 q0Var) {
        super(3);
        this.f17283u = i;
        this.f17284v = i10;
        this.f17285w = q0Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i;
        int i10;
        Integer valueOf;
        float f10;
        ((Number) obj3).intValue();
        r rVar = (r) ((m) obj2);
        rVar.a0(408240218);
        int i11 = this.f17283u;
        int i12 = this.f17284v;
        a1.B(i11, i12);
        o oVar = o.f15687a;
        if (i11 == 1 && i12 == Integer.MAX_VALUE) {
            rVar.p(false);
            return oVar;
        }
        y2.c cVar = (y2.c) rVar.j(p1.f3606h);
        q2.h hVar = (q2.h) rVar.j(p1.f3608k);
        y2.m mVar = (y2.m) rVar.j(p1.f3611n);
        q0 q0Var = this.f17285w;
        boolean f11 = rVar.f(q0Var) | rVar.f(mVar);
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (f11 || O == v0Var) {
            O = g0.i(q0Var, mVar);
            rVar.k0(O);
        }
        q0 q0Var2 = (q0) O;
        boolean f12 = rVar.f(hVar) | rVar.f(q0Var2);
        Object O2 = rVar.O();
        if (f12 || O2 == v0Var) {
            h0 h0Var = q0Var2.f20555a;
            q2.i iVar = h0Var.f20488f;
            q2.s sVar = h0Var.f20486c;
            if (sVar == null) {
                sVar = q2.s.f23367y;
            }
            q2.o oVar2 = h0Var.f20487d;
            if (oVar2 != null) {
                i = oVar2.f23361a;
            } else {
                i = 0;
            }
            q2.p pVar = h0Var.e;
            if (pVar != null) {
                i10 = pVar.f23362a;
            } else {
                i10 = 65535;
            }
            O2 = ((q2.j) hVar).b(iVar, sVar, i, i10);
            rVar.k0(O2);
        }
        n2 n2Var = (n2) O2;
        boolean f13 = rVar.f(n2Var.getValue()) | rVar.f(cVar) | rVar.f(hVar) | rVar.f(q0Var) | rVar.f(mVar);
        Object O3 = rVar.O();
        if (f13 || O3 == v0Var) {
            O3 = Integer.valueOf((int) (a(q0Var2, cVar, hVar, s1.f17279a, 1) & 4294967295L));
            rVar.k0(O3);
        }
        int intValue = ((Number) O3).intValue();
        boolean f14 = rVar.f(n2Var.getValue()) | rVar.f(cVar) | rVar.f(hVar) | rVar.f(q0Var) | rVar.f(mVar);
        Object O4 = rVar.O();
        if (f14 || O4 == v0Var) {
            StringBuilder sb2 = new StringBuilder();
            String str = s1.f17279a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            O4 = Integer.valueOf((int) (a(q0Var2, cVar, hVar, sb2.toString(), 2) & 4294967295L));
            rVar.k0(O4);
        }
        int intValue2 = ((Number) O4).intValue() - intValue;
        Integer num = null;
        if (i11 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i11 - 1) * intValue2) + intValue);
        }
        if (i12 != Integer.MAX_VALUE) {
            num = Integer.valueOf(((i12 - 1) * intValue2) + intValue);
        }
        float f15 = Float.NaN;
        if (valueOf != null) {
            f10 = cVar.Y(valueOf.intValue());
        } else {
            f10 = Float.NaN;
        }
        if (num != null) {
            f15 = cVar.Y(num.intValue());
        }
        r g8 = androidx.compose.foundation.layout.g(oVar, f10, f15);
        rVar.p(false);
        return g8;
    }
}
