package u7;

/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26884u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1 f26885v;

    public /* synthetic */ t3(o1 o1Var, int i) {
        this.f26884u = i;
        this.f26885v = o1Var;
    }

    @Override // df.a
    public final Object invoke() {
        String a10;
        switch (this.f26884u) {
            case 0:
                this.f26885v.f26655k.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            default:
                o1 o1Var = this.f26885v;
                if (o1Var.m()) {
                    a10 = o1Var.i().a(o1Var.e());
                    if (a10 == null || a10.length() <= 0) {
                        return null;
                    }
                } else {
                    a10 = o1Var.i().a(o1Var.k());
                    if (a10 == null || a10.length() <= 0) {
                        return null;
                    }
                }
                return a10;
        }
    }
}
