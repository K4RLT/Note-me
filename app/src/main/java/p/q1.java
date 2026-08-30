package p;
import z0.j;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r1 f22234u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f22235v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f22236w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22237x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1.r0 f22238y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z1.a1 f22239z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, long j10, int i, int i10, z1.r0 r0Var, z1.a1 a1Var) {
        super(1);
        this.f22234u = r1Var;
        this.f22235v = j10;
        this.f22236w = i;
        this.f22237x = i10;
        this.f22238y = r0Var;
        this.f22239z = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        z1.j((z1.z0) obj, this.f22239z, this.f22234u.J.a(this.f22235v, (this.f22237x & 4294967295L) | (this.f22236w << 32), this.f22238y.getLayoutDirection()));
        return pe.z.f22715a;
    }
}
