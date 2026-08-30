package w7;
import k1.m0;
import r0.a1;

/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28449u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f28450v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28451w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28452x;

    public /* synthetic */ i6(float f10, float f11, a1 a1Var, int i) {
        this.f28449u = i;
        this.f28450v = f10;
        this.f28451w = f11;
        this.f28452x = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i = this.f28449u;
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        switch (i) {
            case 0:
                m0Var.g(this.f28450v);
                float f15 = this.f28451w;
                m0Var.h(f15);
                m0Var.i(f15);
                if (((Boolean) this.f28452x.getValue()).booleanValue()) {
                    f10 = 0.35f;
                } else {
                    f10 = 1.0f;
                }
                m0Var.b(f10);
                break;
            case 1:
                m0Var.g(this.f28450v);
                float f16 = this.f28451w;
                m0Var.h(f16);
                m0Var.i(f16);
                if (((Boolean) this.f28452x.getValue()).booleanValue()) {
                    f11 = 0.35f;
                } else {
                    f11 = 1.0f;
                }
                m0Var.b(f11);
                break;
            case 2:
                m0Var.g(this.f28450v);
                float f17 = this.f28451w;
                m0Var.h(f17);
                m0Var.i(f17);
                if (((Boolean) this.f28452x.getValue()).booleanValue()) {
                    f12 = 0.35f;
                } else {
                    f12 = 1.0f;
                }
                m0Var.b(f12);
                break;
            case 3:
                m0Var.g(this.f28450v);
                float f18 = this.f28451w;
                m0Var.h(f18);
                m0Var.i(f18);
                if (((Boolean) this.f28452x.getValue()).booleanValue()) {
                    f13 = 0.35f;
                } else {
                    f13 = 1.0f;
                }
                m0Var.b(f13);
                break;
            default:
                m0Var.g(this.f28450v);
                float f19 = this.f28451w;
                m0Var.h(f19);
                m0Var.i(f19);
                if (((Boolean) this.f28452x.getValue()).booleanValue()) {
                    f14 = 0.35f;
                } else {
                    f14 = 1.0f;
                }
                m0Var.b(f14);
                break;
        }
        return pe.z.f22715a;
    }
}
