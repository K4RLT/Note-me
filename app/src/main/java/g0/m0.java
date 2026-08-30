package g0;
import a1.k;
import k0.j1;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j1 f17206u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17207v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f17208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j1 j1Var, boolean z3, int i) {
        super(2);
        this.f17206u = j1Var;
        this.f17207v = z3;
        this.f17208w = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(this.f17208w | 1);
        k(this.f17206u, this.f17207v, (m) obj, L);
        return pe.z.f22715a;
    }
}
