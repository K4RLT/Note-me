package b2;
import d1.q;
import l.d;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.m implements df.a {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ float B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k1 f1512u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f1513v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f1514w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f1515x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f1516y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f1517z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, q qVar, g1 g1Var, long j10, q qVar2, int i, boolean z3, float f10) {
        super(0);
        this.f1512u = k1Var;
        this.f1513v = qVar;
        this.f1514w = g1Var;
        this.f1515x = j10;
        this.f1516y = qVar2;
        this.f1517z = i;
        this.A = z3;
        this.B = f10;
    }

    @Override // df.a
    public final Object invoke() {
        this.f1512u.u1(d(this.f1513v, this.f1514w.b()), this.f1514w, this.f1515x, this.f1516y, this.f1517z, this.A, this.B, false);
        return pe.z.f22715a;
    }
}
