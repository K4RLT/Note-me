package k0;
import b0.x;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19300u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j1 f19301v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(j1 j1Var, int i) {
        super(0);
        this.f19300u = i;
        this.f19301v = j1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.a
    public final Object invoke() {
        switch (this.f19300u) {
            case 0:
                Object r02 = this.f19301v.f19323g;
                if (r02 != 0) {
                    r02.invoke();
                }
                return pe.z.f22715a;
            case 1:
                j1 j1Var = this.f19301v;
                pf.z zVar = j1Var.i;
                if (zVar != null) {
                    pf.x(zVar, null, new i1(j1Var, null, 0), 1);
                }
                j1Var.l();
                return pe.z.f22715a;
            case 2:
                j1 j1Var2 = this.f19301v;
                pf.z zVar2 = j1Var2.i;
                if (zVar2 != null) {
                    pf.x(zVar2, null, new i1(j1Var2, null, 1), 1);
                }
                j1Var2.l();
                return pe.z.f22715a;
            case 3:
                j1 j1Var3 = this.f19301v;
                pf.z zVar3 = j1Var3.i;
                if (zVar3 != null) {
                    pf.x(zVar3, null, new i1(j1Var3, null, 2), 1);
                }
                j1Var3.l();
                return pe.z.f22715a;
            default:
                this.f19301v.n();
                return pe.z.f22715a;
        }
    }
}