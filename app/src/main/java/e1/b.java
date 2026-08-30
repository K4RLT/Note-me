package e1;
import l.a;
import m.d;

import android.view.autofill.AutofillManager;
import b2.b0;
import b2.i0;
import df.r;
import p.j1;
import pe.z;
import r0.y;
import z1.p0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15872u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15873v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15874w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i, Object obj2) {
        super(4);
        this.f15872u = i;
        this.f15873v = obj;
        this.f15874w = obj2;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        int i10;
        int i11;
        switch (this.f15872u) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                int intValue3 = ((Number) obj3).intValue();
                int intValue4 = ((Number) obj4).intValue();
                c cVar = (c) this.f15873v;
                cVar.f15879f.set(intValue, intValue2, intValue3, intValue4);
                ((AutofillManager) cVar.f15875a.f22681u).requestAutofill(cVar.f15877c, ((i0) this.f15874w).f1490v, cVar.f15879f);
                return z.f22715a;
            default:
                j1 j1Var = (j1) obj;
                d1.r rVar = (d1.r) obj2;
                r0.m mVar = (r0.m) obj3;
                int intValue5 = ((Number) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    if (((r0.r) mVar).f(j1Var)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i = i11 | intValue5;
                } else {
                    i = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    if (((r0.r) mVar).f(rVar)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i |= i10;
                }
                if ((i & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar2 = (r0.r) mVar;
                if (rVar2.R(i & 1, z3)) {
                    d1.r d2 = ((d1.r) this.f15873v).d(rVar);
                    z0.c cVar2 = (z0.c) this.f15874w;
                    p0 d10 = x.d(d1.c.f15670u, false);
                    int hashCode = Long.hashCode(rVar2.T);
                    z0.g l10 = rVar2.l();
                    d1.r c10 = d1.a.c(d2, rVar2);
                    b2.h.f1471d.getClass();
                    b0 b0Var = b2.g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var);
                    } else {
                        rVar2.n0();
                    }
                    y.I(b2.g.e, d10, rVar2);
                    y.I(b2.g.f1464d, l10, rVar2);
                    b2.f fVar = b2.g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                        p.a.t(hashCode, rVar2, hashCode, fVar);
                    }
                    y.I(b2.g.f1463c, c10, rVar2);
                    cVar2.b(j1Var, rVar2, Integer.valueOf(i & 14));
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return z.f22715a;
        }
    }
}
