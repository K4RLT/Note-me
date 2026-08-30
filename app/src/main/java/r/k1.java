package r;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24108u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l1 f24109v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(l1 l1Var, int i) {
        super(0);
        this.f24108u = i;
        this.f24109v = l1Var;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        switch (this.f24108u) {
            case 0:
                if (this.f24109v.f24114a.h() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                l1 l1Var = this.f24109v;
                if (l1Var.f24114a.h() < l1Var.f24117d.h()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}
