package xa;
import p.a;

/* loaded from: classes.dex */
public final class b2 implements j0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Class f30367u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Class f30368v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f30369w;

    public b2(Class cls, Class cls2, i0 i0Var) {
        this.f30367u = cls;
        this.f30368v = cls2;
        this.f30369w = i0Var;
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        Class cls = k2Var.f30449a;
        if (cls != this.f30367u && cls != this.f30368v) {
            return null;
        }
        return this.f30369w;
    }

    public final String toString() {
        String name = this.f30368v.getName();
        String name2 = this.f30367u.getName();
        return a5.a.k(a.q("Factory[type=", name, "+", name2, ",adapter="), String.valueOf(this.f30369w), "]");
    }
}
