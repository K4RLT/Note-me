package w7;
import k1.m0;
import z1.a1;
import z1.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class eb implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28182u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f28183v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28184w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28185x;

    public /* synthetic */ eb(float f10, u7.d dVar, float f11) {
        this.f28183v = f10;
        this.f28185x = dVar;
        this.f28184w = f11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28182u) {
            case 0:
                u7.d dVar = (u7.d) this.f28185x;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.g(this.f28183v + dVar.i);
                float f10 = this.f28184w;
                m0Var.h(f10);
                m0Var.i(f10);
                break;
            default:
                a1 a1Var = (a1) this.f28185x;
                z0 z0Var = (z0) obj;
                z0Var.getClass();
                z0Var.h(a1Var, ff.a.b(this.f28183v - (a1Var.f31769u / 2.0f)), ff.a.b(this.f28184w - (a1Var.f31770v / 2.0f)), 0.0f);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ eb(a1 a1Var, float f10, float f11) {
        this.f28185x = a1Var;
        this.f28183v = f10;
        this.f28184w = f11;
    }
}
