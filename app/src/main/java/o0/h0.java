package o0;
import d1.r;
import k1.p0;
import r0.m;
import r0.y;
import v.i;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f21498u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f21499v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f21500w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21501x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s1 f21502y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p0 f21503z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, boolean z3, i iVar, r rVar, s1 s1Var, p0 p0Var, float f10, float f11, int i, int i10) {
        super(2);
        this.f21498u = j0Var;
        this.f21499v = z3;
        this.f21500w = iVar;
        this.f21501x = rVar;
        this.f21502y = s1Var;
        this.f21503z = p0Var;
        this.A = f10;
        this.B = f11;
        this.C = i;
        this.D = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f21498u.a(this.f21499v, this.f21500w, this.f21501x, this.f21502y, this.f21503z, this.A, this.B, (m) obj, y.L(this.C | 1), this.D);
        return pe.z.f22715a;
    }
}
