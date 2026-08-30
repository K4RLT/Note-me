package eg;
import a1.m;

/* loaded from: classes.dex */
public final class o0 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16555a = pe.a.c(pe.h.f22690u, new m(this));

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        obj.getClass();
        tVar.a(d()).w(d());
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d d2 = d();
        dg.a k3 = bVar.k(d2);
        int t3 = k3.t(d());
        if (t3 == -1) {
            k3.f(d2);
            return pe.z.f22715a;
        }
        throw new IllegalArgumentException(g3.a.g(t3, "Unexpected index "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pe.g] */
    @Override // ag.a
    public final cg.d d() {
        return (cg.d) this.f16555a.getValue();
    }
}
