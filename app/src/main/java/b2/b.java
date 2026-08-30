package b2;
import d1.p;
import x.a0;
import x.s0;
import x.v0;
import x.v;
import x.y0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1421u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f1422v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i) {
        super(0);
        this.f1421u = i;
        this.f1422v = cVar;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f1421u) {
            case 0:
                this.f1422v.a1();
                return pe.z.f22715a;
            default:
                c cVar = this.f1422v;
                p pVar = cVar.I;
                pVar.getClass();
                a0 a0Var = (a0) pVar;
                a0Var.getClass();
                v0 v0Var = (v0) cVar.b(y0.f30031a);
                v0 v0Var2 = a0Var.f29935a;
                a0Var.f29936b.setValue(new v(v0Var2, v0Var));
                a0Var.f29937c.setValue(new s0(v0Var, v0Var2));
                return pe.z.f22715a;
        }
    }
}
