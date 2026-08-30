package p;
import b0.b;
import d1.r;
import l.a;
import n.i0;
import q.c1;
import q.g1;
import q.i0;
import q.j1;
import q.m1;
import r0.i1;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;

import androidx.compose.animation.SharedBoundsNodeElement;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f1 f22167u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22168v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j1 f22169w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e1 f22170x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l1 f22171y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k1 f22172z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f1 f1Var, g1 g1Var, j1 j1Var, e1 e1Var, l1 l1Var, k1 k1Var) {
        super(3);
        this.f22167u = f1Var;
        this.f22168v = g1Var;
        this.f22169w = j1Var;
        this.f22170x = e1Var;
        this.f22171y = l1Var;
        this.f22172z = k1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        g1 e;
        boolean z3;
        r rVar = (r) obj;
        ((Number) obj3).intValue();
        d dVar = d.H;
        r rVar2 = (r) ((m) obj2);
        rVar2.a0(-1843478929);
        String str = this.f22167u.f22144a;
        rVar2.Y(-359689844, str);
        Object O = rVar2.O();
        j1 j1Var = this.f22169w;
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            i0 i0Var = j1Var.D;
            a1 a1Var = (a1) i0Var.g(str);
            if (a1Var == null) {
                a1Var = new a1(str, j1Var);
                i0Var.m(str, a1Var);
            }
            O = a1Var;
            rVar2.k0(O);
        }
        a1 a1Var2 = (a1) O;
        g1 g1Var = this.f22168v;
        rVar2.Y(-359686031, g1Var);
        if (g1Var != null) {
            rVar2.a0(1734686048);
            String obj4 = str.toString();
            boolean f10 = rVar2.f(g1Var);
            Object O2 = rVar2.O();
            if (f10 || O2 == v0Var) {
                O2 = g1Var.c();
                rVar2.k0(O2);
            }
            if (g1Var.g()) {
                O2 = g1Var.c();
            }
            rVar2.a0(1329676753);
            Boolean bool = (Boolean) dVar.invoke(O2);
            rVar2.p(false);
            Object value = g1Var.f22905d.getValue();
            rVar2.a0(1329676753);
            Boolean bool2 = (Boolean) dVar.invoke(value);
            rVar2.p(false);
            e = j1.b(g1Var, bool, bool2, obj4, rVar2, 0);
            rVar2 = rVar2;
            rVar2.p(false);
        } else {
            rVar2.a0(1734936683);
            boolean z9 = true;
            kotlin.jvm.internal.b(1, dVar);
            Boolean bool3 = (Boolean) dVar.invoke(pe.z.f22715a);
            boolean booleanValue = bool3.booleanValue();
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                if (a1Var2.a() != null) {
                    if (booleanValue) {
                        z9 = false;
                    }
                } else {
                    z9 = booleanValue;
                }
                O3 = new i0(Boolean.valueOf(z9));
                rVar2.k0(O3);
            }
            i0 i0Var2 = (i0) O3;
            i0Var2.f22920c.setValue(bool3);
            e = j1.e(i0Var2, rVar2, 0, 2);
            rVar2.p(false);
        }
        g1 g1Var2 = e;
        rVar2.Y(-359623378, Boolean.valueOf(j1Var.a()));
        c1 c10 = j1.c(g1Var2, m1.i, null, rVar2, 0, 2);
        rVar2.p(false);
        boolean f11 = rVar2.f(g1Var2);
        Object O4 = rVar2.O();
        k1 k1Var = this.f22172z;
        if (f11 || O4 == v0Var) {
            O4 = new z(j1Var, g1Var2, c10, k1Var);
            rVar2.k0(O4);
        }
        z zVar = (z) O4;
        if (!kotlin.jvm.internal.a((c1) zVar.f22295c.getValue(), c10)) {
            zVar.f22295c.setValue(c10);
            zVar.f22297f.setValue(null);
            zVar.e = a0.f22092a;
        }
        zVar.f22296d.setValue(k1Var);
        rVar2.p(false);
        Object O5 = rVar2.O();
        e1 e1Var = this.f22170x;
        f1 f1Var = this.f22167u;
        l1 l1Var = this.f22171y;
        if (O5 == v0Var) {
            z3 = false;
            b1 b1Var = new b1(a1Var2, zVar, e1Var, l1Var, f1Var);
            rVar2.k0(b1Var);
            O5 = b1Var;
        } else {
            z3 = false;
        }
        b1 b1Var2 = (b1) O5;
        f1Var.f22145b.setValue(b1Var2);
        b1Var2.f22109x.setValue(a1Var2);
        i1 i1Var = b1Var2.A;
        Boolean bool4 = Boolean.TRUE;
        i1Var.setValue(bool4);
        b1Var2.f22110y.setValue(zVar);
        b1Var2.f22111z.setValue(e1Var);
        b1Var2.B.setValue(l1Var);
        b1Var2.f22107v.i(0.0f);
        b1Var2.f22108w.setValue(bool4);
        b1Var2.C.setValue(f1Var);
        rVar2.p(z3);
        r d2 = rVar.d(new SharedBoundsNodeElement(b1Var2));
        rVar2.p(z3);
        return d2;
    }
}
