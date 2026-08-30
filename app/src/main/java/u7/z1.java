package u7;
import i1.o;

/* loaded from: classes.dex */
public final class z1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27083u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f27084v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(o oVar, te.c cVar, int i) {
        super(2, cVar);
        this.f27083u = i;
        this.f27084v = oVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27083u) {
            case 0:
                return new z1(this.f27084v, cVar, 0);
            case 1:
                return new z1(this.f27084v, cVar, 1);
            default:
                return new z1(this.f27084v, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27083u) {
            case 0:
                z1 z1Var = (z1) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                z1Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                z1 z1Var2 = (z1) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                z1Var2.invokeSuspend(zVar3);
                return zVar3;
            default:
                z1 z1Var3 = (z1) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                z1Var3.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27083u) {
            case 0:
                pe.a.e(obj);
                o.b(this.f27084v);
                return pe.z.f22715a;
            case 1:
                pe.a.e(obj);
                o.b(this.f27084v);
                return pe.z.f22715a;
            default:
                pe.a.e(obj);
                o.b(this.f27084v);
                return pe.z.f22715a;
        }
    }
}
