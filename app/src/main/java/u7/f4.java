package u7;
import k1.m0;
import r0.n2;

import wa.b9;

/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26178u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f26179v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f26180w;

    public /* synthetic */ f4(float f10, n2 n2Var, int i) {
        this.f26178u = i;
        this.f26179v = f10;
        this.f26180w = n2Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f26178u;
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        switch (i) {
            case 0:
                n2 n2Var = this.f26180w;
                float floatValue = ((Number) n2Var.getValue()).floatValue() * this.f26179v;
                m0Var.h(floatValue);
                m0Var.i(floatValue);
                m0Var.b(b9.d(((Number) n2Var.getValue()).floatValue(), 0.0f, 1.0f));
                break;
            default:
                m0Var.n(b9.d(((Number) this.f26180w.getValue()).floatValue(), 0.0f, this.f26179v));
                break;
        }
        return pe.z.f22715a;
    }
}
