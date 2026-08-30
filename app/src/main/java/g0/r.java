package g0;
import a1.d;
import d1.r;
import m2.q0;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f17262u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d1.r f17263v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f17264w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f17265x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f17266y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f17267z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, d1.r rVar, q0 q0Var, int i, boolean z3, int i10, int i11, int i12) {
        super(2);
        this.f17262u = str;
        this.f17263v = rVar;
        this.f17264w = q0Var;
        this.f17265x = i;
        this.f17266y = z3;
        this.f17267z = i10;
        this.A = i11;
        this.B = i12;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d(this.f17262u, this.f17263v, this.f17264w, this.f17265x, this.f17266y, this.f17267z, this.A, (m) obj, y.L(this.B | 1));
        return pe.z.f22715a;
    }
}
