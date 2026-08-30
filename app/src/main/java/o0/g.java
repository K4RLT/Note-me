package o0;
import d1.r;
import k.a;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f21486u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f21487v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21488w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f21489x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f21490y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z3, df.l lVar, r rVar, boolean z9, f fVar, int i) {
        super(2);
        this.f21486u = z3;
        this.f21487v = lVar;
        this.f21488w = rVar;
        this.f21489x = z9;
        this.f21490y = fVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(49);
        a(this.f21486u, this.f21487v, this.f21488w, this.f21489x, this.f21490y, (m) obj, L);
        return pe.z.f22715a;
    }
}
