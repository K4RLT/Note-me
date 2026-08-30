package b2;
import k1.p;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1473u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k1 f1474v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(k1 k1Var, int i) {
        super(0);
        this.f1473u = i;
        this.f1474v = k1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f1473u) {
            case 0:
                k1 k1Var = this.f1474v;
                p pVar = k1Var.f1527a0;
                pVar.getClass();
                k1Var.b1(pVar, k1Var.Z);
                return pe.z.f22715a;
            default:
                k1 k1Var2 = this.f1474v.M;
                if (k1Var2 != null) {
                    k1Var2.o1();
                }
                return pe.z.f22715a;
        }
    }
}
