package w7;
import r0.a1;
import r2.x;

/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28947u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f28948v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28949w;

    public /* synthetic */ q3(df.l lVar, a1 a1Var, int i) {
        this.f28947u = i;
        this.f28948v = lVar;
        this.f28949w = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28947u) {
            case 0:
                this.f28949w.setValue(Boolean.FALSE);
                this.f28948v.invoke(x7.q.EVERYTHING);
                break;
            default:
                this.f28948v.invoke(((x) this.f28949w.getValue()).f24515a.f20477v);
                break;
        }
        return pe.z.f22715a;
    }
}
