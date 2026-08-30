package xa;
import p.a;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class p1 implements j0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30497u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0 f30498v;

    public /* synthetic */ p1(i0 i0Var, int i) {
        this.f30497u = i;
        this.f30498v = i0Var;
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        switch (this.f30497u) {
            case 0:
                if (k2Var.f30449a == Number.class) {
                    return (q1) this.f30498v;
                }
                return null;
            default:
                Class cls = k2Var.f30449a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (o1) this.f30498v;
        }
    }

    public String toString() {
        switch (this.f30497u) {
            case 1:
                o1 o1Var = (o1) this.f30498v;
                String name = Calendar.class.getName();
                String name2 = GregorianCalendar.class.getName();
                return a5.a.k(a.q("Factory[type=", name, "+", name2, ",adapter="), String.valueOf(o1Var), "]");
            default:
                return super.toString();
        }
    }
}
