package d7;
import b.a;
import d.b;

import androidx.compose.foundation.layout.FillElement;
import b2.b0;
import b2.f;
import b8.e1;
import b8.z9;
import com.daren.scraply.MainActivity;
import df.p;
import kotlin.jvm.internal.l;
import pe.z;
import r0.m;
import r0.r;
import r0.y;
import u7.k6;
import x7.j;
import z0.g;
import z0.h;
import z1.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15764u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15765v;

    public /* synthetic */ b(MainActivity mainActivity, int i) {
        this.f15764u = i;
        this.f15765v = mainActivity;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        int i = this.f15764u;
        z zVar = z.f22715a;
        MainActivity mainActivity = this.f15765v;
        int i10 = 1;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i11 = MainActivity.P;
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    a8.a(false, false, h.d(-811856355, new b(mainActivity, i10), rVar), rVar, 384);
                } else {
                    rVar.U();
                }
                return zVar;
            default:
                int i12 = MainActivity.P;
                if ((intValue & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.R(intValue & 1, z9)) {
                    FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                    p0 d2 = x.m.d(d1.c.f15670u, false);
                    int hashCode = Long.hashCode(rVar2.T);
                    g l10 = rVar2.l();
                    d1.r c10 = d1.a.c(fillElement, rVar2);
                    b2.h.f1471d.getClass();
                    b0 b0Var = b2.g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var);
                    } else {
                        rVar2.n0();
                    }
                    y.I(b2.g.e, d2, rVar2);
                    y.I(b2.g.f1464d, l10, rVar2);
                    f fVar = b2.g.f1465f;
                    if (rVar2.S || !l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                        p.a.t(hashCode, rVar2, hashCode, fVar);
                    }
                    y.I(b2.g.f1463c, c10, rVar2);
                    boolean h3 = rVar2.h(mainActivity);
                    Object O = rVar2.O();
                    if (h3 || O == r0.l.f24285a) {
                        O = new a(mainActivity, 1);
                        rVar2.k0(O);
                    }
                    k6.c(null, null, (df.a) O, rVar2, 0);
                    j.m(6, rVar2);
                    q7.f.a(0, rVar2);
                    t7.d.b(6, rVar2);
                    z9.o(0, rVar2);
                    e1.d(0, rVar2);
                    e7.a(0, rVar2);
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return zVar;
        }
    }
}
