package p;
import q.g1;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22247u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22248v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(g1 g1Var, int i) {
        super(0);
        this.f22247u = i;
        this.f22248v = g1Var;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        switch (this.f22247u) {
            case 0:
                g1 g1Var = this.f22248v;
                Object c10 = g1Var.c();
                g0 g0Var = g0.f22154w;
                if (c10 == g0Var && g1Var.f22905d.getValue() == g0Var) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                return Long.valueOf(this.f22248v.b());
        }
    }
}
