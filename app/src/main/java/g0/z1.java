package g0;

/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17373u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d2 f17374v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(d2 d2Var, int i) {
        super(0);
        this.f17373u = i;
        this.f17374v = d2Var;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        switch (this.f17373u) {
            case 0:
                if (this.f17374v.f17047a.h() > 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                d2 d2Var = this.f17374v;
                if (d2Var.f17047a.h() < d2Var.f17048b.h()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}
