package o0;
import d1.r;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l2.a f21520u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f21521v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21522w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f21523x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f21524y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f21525z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l2.a aVar, df.a aVar2, r rVar, boolean z3, f fVar, int i) {
        super(2);
        this.f21520u = aVar;
        this.f21521v = aVar2;
        this.f21522w = rVar;
        this.f21523x = z3;
        this.f21524y = fVar;
        this.f21525z = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k.c(this.f21520u, this.f21521v, this.f21522w, this.f21523x, this.f21524y, (m) obj, y.L(this.f21525z | 1));
        return pe.z.f22715a;
    }
}
