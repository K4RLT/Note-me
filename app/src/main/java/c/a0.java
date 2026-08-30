package c;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3210u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f3211v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g0 g0Var, int i) {
        super(0);
        this.f3210u = i;
        this.f3211v = g0Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f3210u) {
            case 0:
                this.f3211v.c();
                return pe.z.f22715a;
            case 1:
                this.f3211v.b();
                return pe.z.f22715a;
            default:
                this.f3211v.c();
                return pe.z.f22715a;
        }
    }
}
