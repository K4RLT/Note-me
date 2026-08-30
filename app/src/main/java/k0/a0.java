package k0;
import b0.u;
import g0.a1;
import g0.w0;
import i1.r;
import j1.b;
import l.a;
import r0.i1;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19214u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t0 f19215v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(t0 t0Var, int i) {
        super(1);
        this.f19214u = i;
        this.f19215v = t0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        q qVar;
        q qVar2;
        b bVar;
        boolean z3;
        switch (this.f19214u) {
            case 0:
                return new u(10, this.f19215v);
            case 1:
                long longValue = ((Number) obj).longValue();
                t0 t0Var = this.f19215v;
                if (t0Var.f19413a.a().b(longValue)) {
                    t0Var.n();
                    t0Var.p();
                }
                return pe.z.f22715a;
            case 2:
                long longValue2 = ((Number) obj).longValue();
                t0 t0Var2 = this.f19215v;
                if (t0Var2.f19413a.a().b(longValue2)) {
                    t0Var2.i();
                    t0Var2.m(null);
                }
                return pe.z.f22715a;
            case 3:
                long longValue3 = ((Number) obj).longValue();
                t0 t0Var3 = this.f19215v;
                r e = t0Var3.e();
                if (e != null && (qVar2 = e.f19399a) != null && longValue3 == qVar2.f19394c) {
                    t0Var3.f19424n.setValue(null);
                }
                r e8 = t0Var3.e();
                if (e8 != null && (qVar = e8.f19400b) != null && longValue3 == qVar.f19394c) {
                    t0Var3.f19425o.setValue(null);
                }
                if (t0Var3.f19413a.a().b(longValue3)) {
                    t0Var3.p();
                }
                return pe.z.f22715a;
            case 4:
                z1.x xVar = (z1.x) obj;
                t0 t0Var4 = this.f19215v;
                t0Var4.f19421k = xVar;
                if (((Boolean) t0Var4.i.getValue()).booleanValue() && t0Var4.e() != null) {
                    if (xVar != null) {
                        bVar = new b(xVar.f(0L));
                    } else {
                        bVar = null;
                    }
                    if (!kotlin.jvm.internal.a(t0Var4.f19420j, bVar)) {
                        t0Var4.f19420j = bVar;
                        t0Var4.n();
                        t0Var4.p();
                    }
                }
                return pe.z.f22715a;
            case 5:
                r rVar = (r) obj;
                t0 t0Var5 = this.f19215v;
                i1 i1Var = t0Var5.i;
                if (!rVar.a() && ((Boolean) i1Var.getValue()).booleanValue()) {
                    t0Var5.i();
                }
                i1Var.setValue(Boolean.valueOf(rVar.a()));
                return pe.z.f22715a;
            case 6:
                this.f19215v.l(((Boolean) obj).booleanValue());
                return pe.z.f22715a;
            case 7:
                if (a1.f17011a.a(((t1.b) obj).f25635a) == w0.L) {
                    this.f19215v.b();
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                this.f19215v.m((r) obj);
                return pe.z.f22715a;
        }
    }
}
