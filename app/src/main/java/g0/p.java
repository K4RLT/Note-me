package g0;
import a1.b;
import d1.r;
import m2.q0;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ i B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f17241u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f17242v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f17243w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f17244x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f17245y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f17246z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, r rVar, q0 q0Var, int i, boolean z3, int i10, int i11, i iVar, int i12, int i13) {
        super(2);
        this.f17241u = str;
        this.f17242v = rVar;
        this.f17243w = q0Var;
        this.f17244x = i;
        this.f17245y = z3;
        this.f17246z = i10;
        this.A = i11;
        this.B = iVar;
        this.C = i12;
        this.D = i13;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b(this.f17241u, this.f17242v, this.f17243w, this.f17244x, this.f17245y, this.f17246z, this.A, this.B, (m) obj, y.L(this.C | 1), this.D);
        return pe.z.f22715a;
    }
}
