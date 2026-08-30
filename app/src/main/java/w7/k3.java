package w7;
import j4.d;
import p7.q0;
import r0.a1;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28565u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f28566v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f28567w;

    public /* synthetic */ k3(e3 e3Var, a1 a1Var) {
        this.f28565u = 5;
        this.f28567w = e3Var;
        this.f28566v = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f28565u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f28566v;
        e3 e3Var = this.f28567w;
        switch (i) {
            case 0:
                d(a1Var, System.currentTimeMillis());
                e3Var.B(false);
                return zVar;
            case 1:
                d(a1Var, System.currentTimeMillis());
                e3Var.B(false);
                return zVar;
            case 2:
                d(a1Var, System.currentTimeMillis());
                e3Var.B(false);
                return zVar;
            case 3:
                d(a1Var, System.currentTimeMillis());
                e3Var.B(false);
                return zVar;
            case 4:
                d(a1Var, System.currentTimeMillis());
                e3Var.B(false);
                return zVar;
            default:
                List d2 = e3Var.d();
                List list = q0.d("unicornio").f22547c;
                gf.c cVar = gf.d.f17754u;
                e3Var.C.setValue(qe.l.F(d2, qe.l.G(list)));
                a1Var.setValue(Integer.valueOf(qe.m.f(e3Var.d())));
                return zVar;
        }
    }

    public /* synthetic */ k3(int i, a1 a1Var, e3 e3Var) {
        this.f28565u = i;
        this.f28566v = a1Var;
        this.f28567w = e3Var;
    }
}
