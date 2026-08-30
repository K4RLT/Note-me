package c3;
import n.a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0 f3789u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f3790v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f3791w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z0.c f3792x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f3793y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3794z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a0 a0Var, df.a aVar, b0 b0Var, z0.c cVar, int i, int i10) {
        super(2);
        this.f3789u = a0Var;
        this.f3790v = aVar;
        this.f3791w = b0Var;
        this.f3792x = cVar;
        this.f3793y = i;
        this.f3794z = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a(this.f3789u, this.f3790v, this.f3791w, this.f3792x, (r0.m) obj, r0.y.L(this.f3793y | 1), this.f3794z);
        return pe.z.f22715a;
    }
}
