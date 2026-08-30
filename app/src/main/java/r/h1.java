package r;
import o0.f0;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i1 f24090u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24091v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1.a1 f24092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, int i, z1.a1 a1Var) {
        super(1);
        this.f24090u = i1Var;
        this.f24091v = i;
        this.f24092w = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        z1.z0 z0Var = (z1.z0) obj;
        i1 i1Var = this.f24090u;
        int h3 = i1Var.I.f24114a.h();
        if (h3 < 0) {
            h3 = 0;
        }
        int i10 = this.f24091v;
        if (h3 > i10) {
            h3 = i10;
        }
        int i11 = -h3;
        boolean z3 = i1Var.J;
        if (z3) {
            i = 0;
        } else {
            i = i11;
        }
        if (!z3) {
            i11 = 0;
        }
        f0 f0Var = new f0(this.f24092w, i, i11, 1);
        z0Var.f31904u = true;
        f0Var.invoke(z0Var);
        z0Var.f31904u = false;
        return pe.z.f22715a;
    }
}
