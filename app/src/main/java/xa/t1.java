package xa;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class t1 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f30537a;

    public t1(w1 w1Var) {
        this.f30537a = w1Var;
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        if (l2Var.c0() == 9) {
            l2Var.Y();
            return null;
        }
        Object c10 = c();
        Map map = this.f30537a.f30696a;
        try {
            l2Var.V();
            while (l2Var.a0()) {
                s1 s1Var = (s1) map.get(l2Var.N());
                if (s1Var == null) {
                    l2Var.Z();
                } else {
                    e(c10, l2Var, s1Var);
                }
            }
            l2Var.X();
            return d(c10);
        } catch (IllegalAccessException e) {
            u0 u0Var = g2.f30419a;
            l4.a.k("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e8) {
            throw new ab.b(21, e8);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, l2 l2Var, s1 s1Var);
}
