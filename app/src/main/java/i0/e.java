package i0;

import c2.n2;
import c2.r1;
import g0.e1;
import pe.z;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18043u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f18044v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i) {
        super(0);
        this.f18043u = i;
        this.f18044v = gVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f18043u) {
            case 0:
                b2.l.r(this.f18044v);
                return z.f22715a;
            case 1:
                this.f18044v.Q.d();
                return Boolean.TRUE;
            case 2:
                this.f18044v.Q.m();
                return Boolean.TRUE;
            case 3:
                g gVar = this.f18044v;
                gVar.M.f17082w.invoke(new r2.i(gVar.R.e));
                return Boolean.TRUE;
            case 4:
                g gVar2 = this.f18044v;
                e1 e1Var = gVar2.M;
                i1.o oVar = gVar2.S;
                if (!e1Var.b()) {
                    i1.o.b(oVar);
                } else {
                    n2 n2Var = e1Var.f17064c;
                    if (n2Var != null) {
                        ((r1) n2Var).b();
                    }
                }
                return Boolean.TRUE;
            case 5:
                this.f18044v.Q.f(true);
                return Boolean.TRUE;
            case 6:
                this.f18044v.Q.b(true);
                return Boolean.TRUE;
            default:
                b2.l.r(this.f18044v);
                return z.f22715a;
        }
    }
}
