package z1;
import r0.u;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31834u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k1 f31835v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, int i) {
        super(2);
        this.f31834u = i;
        this.f31835v = k1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31834u) {
            case 0:
                this.f31835v.a().f31829v = (u) obj2;
                return pe.z.f22715a;
            case 1:
                j0 a10 = this.f31835v.a();
                ((b2.i0) obj).c0(new g0(a10, (df.p) obj2, a10.J));
                return pe.z.f22715a;
            default:
                b2.i0 i0Var = (b2.i0) obj;
                k1 k1Var = this.f31835v;
                m1 m1Var = k1Var.f31839a;
                j0 j0Var = i0Var.f1479b0;
                if (j0Var == null) {
                    j0Var = new j0(i0Var, m1Var);
                    i0Var.f1479b0 = j0Var;
                }
                k1Var.f31840b = j0Var;
                k1Var.a().d();
                j0 a11 = k1Var.a();
                if (a11.f31830w != m1Var) {
                    a11.f31830w = m1Var;
                    a11.e(false);
                    b2.i0.V(a11.f31828u, false, 7);
                }
                return pe.z.f22715a;
        }
    }
}
