package c0;
import k0.p;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3369u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3370v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i, df.a aVar) {
        super(0);
        this.f3370v = i;
        this.f3371w = aVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f3369u) {
            case 0:
                return new d(this.f3370v, 0.0f, (df.a) this.f3371w);
            default:
                m2.m0 m0Var = ((p) this.f3371w).f19387f;
                return Integer.valueOf(m0Var.f20525b.d(this.f3370v));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p pVar, int i) {
        super(0);
        this.f3371w = pVar;
        this.f3370v = i;
    }
}
