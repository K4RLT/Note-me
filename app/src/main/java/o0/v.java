package o0;
import d1.r;
import h1.a;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ df.a f21698u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f21699v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f21700w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f21701x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.p f21702y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f21703z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(df.a aVar, r rVar, boolean z3, u uVar, df.p pVar, int i, int i10) {
        super(2);
        this.f21698u = aVar;
        this.f21699v = rVar;
        this.f21700w = z3;
        this.f21701x = uVar;
        this.f21702y = pVar;
        this.f21703z = i;
        this.A = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a(this.f21698u, this.f21699v, this.f21700w, this.f21701x, this.f21702y, (m) obj, y.L(this.f21703z | 1), this.A);
        return pe.z.f22715a;
    }
}
