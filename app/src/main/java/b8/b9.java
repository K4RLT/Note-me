package b8;
import r0.a1;
import u7.k6;

/* loaded from: classes.dex */
public final class b9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1886u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1887v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f1888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(boolean z3, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f1886u = i;
        this.f1887v = z3;
        this.f1888w = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1886u) {
            case 0:
                return new b9(this.f1887v, this.f1888w, cVar, 0);
            default:
                return new b9(this.f1887v, this.f1888w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1886u) {
            case 0:
                b9 b9Var = (b9) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                b9Var.invokeSuspend(zVar2);
                return zVar2;
            default:
                b9 b9Var2 = (b9) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                b9Var2.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1886u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f1888w;
        boolean z3 = this.f1887v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                if (!z3) {
                    q.t tVar = z9.f3099a;
                    a1Var.setValue(Boolean.TRUE);
                }
                return zVar;
            default:
                pe.a.e(obj);
                if (!z3) {
                    float f10 = k6.f26414a;
                    a1Var.setValue(Boolean.FALSE);
                }
                return zVar;
        }
    }
}
