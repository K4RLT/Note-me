package x;
import z0.j;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1 f29938u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29939v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1.a1 f29940w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29941x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1.r0 f29942y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, int i, z1.a1 a1Var, int i10, z1.r0 r0Var) {
        super(1);
        this.f29938u = b1Var;
        this.f29939v = i;
        this.f29940w = a1Var;
        this.f29941x = i10;
        this.f29942y = r0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, df.p] */
    @Override // df.l
    public final Object invoke(Object obj) {
        Object r02 = this.f29938u.J;
        z1.j((z1.z0) obj, this.f29940w, ((y2.j) r02.invoke(new y2.l(((this.f29939v - r1.f31769u) << 32) | ((this.f29941x - r1.f31770v) & 4294967295L)), this.f29942y.getLayoutDirection())).f30808a);
        return pe.z.f22715a;
    }
}