package b1;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1412b;

    public /* synthetic */ z(int i, Object obj) {
        this.f1411a = i;
        this.f1412b = obj;
    }

    public final void a() {
        switch (this.f1411a) {
            case 0:
                a0 a0Var = (a0) this.f1412b;
                a0Var.f1302j--;
                return;
            default:
                r0.r rVar = (r0.r) this.f1412b;
                rVar.A--;
                return;
        }
    }

    public final void b() {
        switch (this.f1411a) {
            case 0:
                ((a0) this.f1412b).f1302j++;
                return;
            default:
                ((r0.r) this.f1412b).A++;
                return;
        }
    }
}
