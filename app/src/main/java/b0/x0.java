package b0;
import a.a;
import b0.x;
import w.a;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1280u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z0 f1281v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(z0 z0Var, int i) {
        super(1);
        this.f1280u = i;
        this.f1281v = z0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1280u) {
            case 0:
                z zVar = (z) this.f1281v.I.invoke();
                int a10 = zVar.a();
                int i = 0;
                while (true) {
                    if (i < a10) {
                        if (!zVar.b(i).equals(obj)) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Number) obj).intValue();
                z0 z0Var = this.f1281v;
                z zVar2 = (z) z0Var.I.invoke();
                if (intValue < 0 || intValue >= zVar2.a()) {
                    StringBuilder m4 = g3.a.m("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    m4.append(zVar2.a());
                    m4.append(')');
                    a.a(m4.toString());
                }
                pf.x(z0Var.M0(), null, new y0(z0Var, intValue, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
