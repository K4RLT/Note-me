package o0;
import d1.r;
import f1.a;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ df.a f21738u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f21739v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f21740w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f21741x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f21742y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f21743z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(df.a aVar, r rVar, long j10, float f10, long j11, int i, float f11, int i10, int i11) {
        super(2);
        this.f21738u = aVar;
        this.f21739v = rVar;
        this.f21740w = j10;
        this.f21741x = f10;
        this.f21742y = j11;
        this.f21743z = i;
        this.A = f11;
        this.B = i10;
        this.C = i11;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a(this.f21738u, this.f21739v, this.f21740w, this.f21741x, this.f21742y, this.f21743z, this.A, (m) obj, y.L(this.B | 1), this.C);
        return pe.z.f22715a;
    }
}
