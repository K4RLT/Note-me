package o0;
import d1.r;
import k.b;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f21505u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l2.a f21506v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21507w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f21508x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f21509y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z3, l2.a aVar, r rVar, f fVar, int i) {
        super(2);
        this.f21505u = z3;
        this.f21506v = aVar;
        this.f21507w = rVar;
        this.f21508x = fVar;
        this.f21509y = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b(this.f21505u, this.f21506v, this.f21507w, this.f21508x, (m) obj, y.L(this.f21509y | 1));
        return pe.z.f22715a;
    }
}
