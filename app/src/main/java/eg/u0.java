package eg;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u0 extends n {

    /* renamed from: b, reason: collision with root package name */
    public final t0 f16587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ag.a aVar) {
        super(aVar);
        aVar.getClass();
        this.f16587b = new t0(aVar.d());
    }

    @Override // eg.n, ag.a
    public final void a(gg.t tVar, Object obj) {
        int h3 = h(obj);
        t0 t0Var = this.f16587b;
        t0Var.getClass();
        gg.t a10 = tVar.a(t0Var);
        o(a10, obj, h3);
        a10.w(t0Var);
    }

    @Override // eg.a, ag.a
    public final Object b(dg.b bVar) {
        return i(bVar);
    }

    @Override // ag.a
    public final cg.d d() {
        return this.f16587b;
    }

    @Override // eg.a
    public final Object e() {
        return (s0) k(n());
    }

    @Override // eg.a
    public final int f(Object obj) {
        s0 s0Var = (s0) obj;
        s0Var.getClass();
        return s0Var.d();
    }

    @Override // eg.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // eg.a
    public final Object l(Object obj) {
        s0 s0Var = (s0) obj;
        s0Var.getClass();
        return s0Var.a();
    }

    @Override // eg.n
    public final void m(Object obj, int i, Object obj2) {
        ((s0) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(gg.t tVar, Object obj, int i);
}
