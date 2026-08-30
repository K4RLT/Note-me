package k0;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f19430u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19431v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f19432w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m0 f19433x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19434y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, int i, int i10, m0 m0Var, pe.g gVar) {
        super(0);
        this.f19430u = pVar;
        this.f19431v = i;
        this.f19432w = i10;
        this.f19433x = m0Var;
        this.f19434y = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pe.g] */
    @Override // df.a
    public final Object invoke() {
        boolean z3;
        int intValue = ((Number) this.f19434y.getValue()).intValue();
        m0 m0Var = this.f19433x;
        boolean a10 = m0Var.a();
        if (m0Var.i() == i.f19302u) {
            z3 = true;
        } else {
            z3 = false;
        }
        p pVar = this.f19430u;
        m2.m0 m0Var2 = pVar.f19387f;
        int i = this.f19431v;
        long k3 = m0Var2.k(i);
        m2.m0 m0Var3 = pVar.f19387f;
        m2.q qVar = m0Var3.f20525b;
        int i10 = m2.p0.f20545c;
        int i11 = (int) (k3 >> 32);
        int d2 = qVar.d(i11);
        int i12 = qVar.f20551f;
        if (d2 != intValue) {
            if (intValue >= i12) {
                i11 = m0Var3.h(i12 - 1);
            } else {
                i11 = m0Var3.h(intValue);
            }
        }
        int i13 = (int) (k3 & 4294967295L);
        if (qVar.d(i13) != intValue) {
            if (intValue >= i12) {
                i13 = qVar.c(i12 - 1, false);
            } else {
                i13 = qVar.c(intValue, false);
            }
        }
        int i14 = this.f19432w;
        if (i11 == i14) {
            return pVar.a(i13);
        }
        if (i13 == i14) {
            return pVar.a(i11);
        }
        if (!(a10 ^ z3) ? i >= i11 : i > i13) {
            i11 = i13;
        }
        return pVar.a(i11);
    }
}
