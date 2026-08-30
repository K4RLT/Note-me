package k0;
import g0.r0;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f19258u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f19259v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f19260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, boolean z3, boolean z9) {
        super(1);
        this.f19258u = oVar;
        this.f19259v = z3;
        this.f19260w = z9;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        r0 r0Var;
        j0 j0Var;
        boolean z3;
        j2.j jVar = (j2.j) obj;
        long a10 = this.f19258u.a();
        j2.v vVar = l0.f19351c;
        if (this.f19259v) {
            r0Var = r0.f17269v;
        } else {
            r0Var = r0.f17270w;
        }
        if (this.f19260w) {
            j0Var = j0.f19314u;
        } else {
            j0Var = j0.f19316w;
        }
        if ((9223372034707292159L & a10) != 9205357640488583168L) {
            z3 = true;
        } else {
            z3 = false;
        }
        jVar.k(vVar, new k0(r0Var, a10, j0Var, z3));
        return pe.z.f22715a;
    }
}
