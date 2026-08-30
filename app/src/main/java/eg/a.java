package eg;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements ag.a {
    @Override // ag.a
    public Object b(dg.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(dg.b bVar) {
        Object e = e();
        int f10 = f(e);
        dg.a k3 = bVar.k(d());
        while (true) {
            int t3 = k3.t(d());
            if (t3 != -1) {
                j(k3, t3 + f10, e);
            } else {
                k3.f(d());
                return l(e);
            }
        }
    }

    public abstract void j(dg.a aVar, int i, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
