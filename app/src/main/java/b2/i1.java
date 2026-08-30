package b2;
import d1.q;
import l.d;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.m implements df.a {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ float B;
    public final /* synthetic */ boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k1 f1495u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f1496v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f1497w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f1498x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f1499y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f1500z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, q qVar, g1 g1Var, long j10, q qVar2, int i, boolean z3, float f10, boolean z9) {
        super(0);
        this.f1495u = k1Var;
        this.f1496v = qVar;
        this.f1497w = g1Var;
        this.f1498x = j10;
        this.f1499y = qVar2;
        this.f1500z = i;
        this.A = z3;
        this.B = f10;
        this.C = z9;
    }

    @Override // df.a
    public final Object invoke() {
        this.f1495u.u1(d(this.f1496v, this.f1497w.b()), this.f1497w, this.f1498x, this.f1499y, this.f1500z, this.A, this.B, this.C);
        return pe.z.f22715a;
    }
}
