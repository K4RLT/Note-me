package w7;
import r0.a1;

/* loaded from: classes.dex */
public final class o2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28826u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f28827v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(float f10, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f28826u = f10;
        this.f28827v = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new o2(this.f28826u, this.f28827v, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        o2 o2Var = (o2) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        o2Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        if (this.f28826u >= 0.99f) {
            a1 a1Var = this.f28827v;
            if (!n4.Y(a1Var)) {
                a1Var.setValue(Boolean.TRUE);
            }
        }
        return pe.z.f22715a;
    }
}
