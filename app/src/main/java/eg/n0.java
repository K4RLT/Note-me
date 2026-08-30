package eg;
import l.a;

/* loaded from: classes.dex */
public final class n0 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public final ag.a f16549a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f16550b;

    public n0(ag.a aVar) {
        aVar.getClass();
        this.f16549a = aVar;
        this.f16550b = new x0(aVar.d());
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        if (obj != null) {
            tVar.s(this.f16549a, obj);
        } else {
            tVar.p();
        }
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        if (bVar.p()) {
            return bVar.q(this.f16549a);
        }
        return null;
    }

    @Override // ag.a
    public final cg.d d() {
        return this.f16550b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass() && kotlin.jvm.internal.a(this.f16549a, ((n0) obj).f16549a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16549a.hashCode();
    }
}
