package w7;
import lb.g;
import r0.a1;

/* loaded from: classes.dex */
public final class da implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28105u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f28106v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28107w;

    public da(float f10, float f11, a1 a1Var) {
        this.f28105u = f10;
        this.f28106v = f11;
        this.f28107w = a1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float f10 = this.f28106v;
        float f11 = this.f28105u;
        g(((f10 - f11) * floatValue) + f11, this.f28107w);
        return pe.z.f22715a;
    }
}
