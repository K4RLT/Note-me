package w7;
import j4.e;
import k1.r;

/* loaded from: classes.dex */
public final class o1 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28824u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f28825v;

    public /* synthetic */ o1(e3 e3Var, int i) {
        this.f28824u = i;
        this.f28825v = e3Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28824u) {
            case 0:
                r rVar = new r(((r) obj).f19523a);
                e3 e3Var = this.f28825v;
                e3Var.L.setValue(rVar);
                e3Var.K.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            default:
                e(this.f28825v, ((r) obj).f19523a);
                return pe.z.f22715a;
        }
    }
}
