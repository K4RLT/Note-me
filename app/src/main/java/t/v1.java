package t;
import q.k0;
import t.f1;

/* loaded from: classes.dex */
public final class v1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f25548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f25549b;

    public v1(z1 z1Var, x1 x1Var) {
        this.f25548a = z1Var;
        this.f25549b = x1Var;
    }

    @Override // f1
    public final float a(float f10) {
        float abs = Math.abs(f10);
        z1 z1Var = this.f25548a;
        if (abs == 0.0f || ((f10 <= 0.0f || z1Var.f25600a.c()) && ((f10 >= 0.0f || z1Var.f25600a.b()) && ((Boolean) z1Var.f25605g.invoke()).booleanValue()))) {
            return z1Var.d(z1Var.g(this.f25549b.a(2, z1Var.e(z1Var.h(f10)))));
        }
        throw new k0("The fling animation was cancelled", 2);
    }
}
