package w7;
import r0.a1;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28976u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f28977v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28978w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28979x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f28980y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f28981z;

    public /* synthetic */ r0(a1 a1Var, a1 a1Var2, a1 a1Var3, e3 e3Var, e3 e3Var2) {
        this.f28977v = a1Var;
        this.f28978w = a1Var2;
        this.f28979x = a1Var3;
        this.f28980y = e3Var;
        this.f28981z = e3Var2;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28976u) {
            case 0:
                this.f28977v.setValue(Boolean.FALSE);
                this.f28978w.setValue(null);
                this.f28980y.B(false);
                this.f28981z.A(false);
                this.f28979x.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            default:
                a1 a1Var = this.f28977v;
                if (((Boolean) a1Var.getValue()).booleanValue()) {
                    a1Var.setValue(Boolean.FALSE);
                } else {
                    a1Var.setValue(Boolean.TRUE);
                    this.f28978w.setValue(Boolean.FALSE);
                    this.f28979x.setValue(null);
                    this.f28980y.B(false);
                    this.f28981z.A(false);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ r0(a1 a1Var, a1 a1Var2, e3 e3Var, e3 e3Var2, a1 a1Var3) {
        this.f28977v = a1Var;
        this.f28978w = a1Var2;
        this.f28980y = e3Var;
        this.f28981z = e3Var2;
        this.f28979x = a1Var3;
    }
}
