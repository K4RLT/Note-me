package w7;
import k1.m0;
import r0.a1;
import r0.n2;

/* loaded from: classes.dex */
public final class ba implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f27997u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f27998v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f27999w;

    public ba(boolean z3, a1 a1Var, n2 n2Var) {
        this.f27997u = z3;
        this.f27998v = a1Var;
        this.f27999w = n2Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float floatValue;
        float f10;
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        boolean z3 = this.f27997u;
        if (z3) {
            floatValue = ((Number) this.f27998v.getValue()).floatValue();
        } else {
            floatValue = ((Number) this.f27999w.getValue()).floatValue();
        }
        m0Var.n(floatValue);
        if (z3) {
            f10 = 1.06f;
        } else {
            f10 = 1.0f;
        }
        m0Var.h(f10);
        m0Var.i(f10);
        return pe.z.f22715a;
    }
}
