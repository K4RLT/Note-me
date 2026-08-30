package w7;
import p7.b;
import r0.a1;
import r2.x;
import z.e;
import z0.c;
import z7.m;

/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29546u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f29547v;

    public /* synthetic */ z8(a1 a1Var, int i) {
        this.f29546u = i;
        this.f29547v = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f29546u) {
            case 0:
                this.f29547v.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f29547v.setValue(Boolean.TRUE);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                this.f29547v.setValue(str);
                break;
            case 3:
                e eVar = (e) obj;
                eVar.getClass();
                e.p(eVar, b.values().length, null, new c(-821014053, new ab(this.f29547v, 0), true), 6);
                break;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                this.f29547v.setValue(xVar);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f29547v.setValue(bool);
                break;
            case 6:
                this.f29547v.setValue(Boolean.TRUE);
                break;
            default:
                m mVar = (m) obj;
                mVar.getClass();
                this.f29547v.setValue(mVar);
                break;
        }
        return pe.z.f22715a;
    }
}
