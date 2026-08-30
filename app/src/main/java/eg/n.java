package eg;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ag.a f16548a;

    public n(ag.a aVar) {
        this.f16548a = aVar;
    }

    @Override // ag.a
    public void a(gg.t tVar, Object obj) {
        int h3 = h(obj);
        cg.d d2 = d();
        d2.getClass();
        gg.t a10 = tVar.a(d2);
        Iterator g8 = g(obj);
        for (int i = 0; i < h3; i++) {
            a10.r(d(), i, this.f16548a, g8.next());
        }
        a10.w(d2);
    }

    @Override // eg.a
    public void j(dg.a aVar, int i, Object obj) {
        m(obj, i, aVar.s(d(), i, this.f16548a, null));
    }

    public abstract void m(Object obj, int i, Object obj2);
}
