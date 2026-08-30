package r;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24083u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i1 f24084v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(i1 i1Var, int i) {
        super(0);
        this.f24083u = i;
        this.f24084v = i1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f24083u) {
            case 0:
                return Float.valueOf(this.f24084v.I.f24114a.h());
            default:
                return Float.valueOf(this.f24084v.I.f24117d.h());
        }
    }
}
