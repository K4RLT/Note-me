package b8;
import k1.m0;

/* loaded from: classes.dex */
public final class g9 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q.d f2133u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2134v;

    public g9(q.d dVar, float f10) {
        this.f2133u = dVar;
        this.f2134v = f10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        float floatValue = ((Number) this.f2133u.e()).floatValue();
        m0Var.b(wa.b9.d(floatValue, 0.0f, 1.0f));
        float f10 = 1.0f - floatValue;
        m0Var.r(m0Var.J.a() * 32 * f10);
        float f11 = (floatValue * 0.12f) + 0.88f;
        m0Var.h(f11);
        m0Var.i(f11);
        m0Var.g(f10 * this.f2134v);
        m0Var.d(m0Var.J.a() * 14.0f);
        return pe.z.f22715a;
    }
}
