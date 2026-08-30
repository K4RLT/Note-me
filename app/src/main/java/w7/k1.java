package w7;
import r0.e1;

/* loaded from: classes.dex */
public final class k1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e1 f28550v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f28551w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e1 f28552x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e1 f28553y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f10, e1 e1Var, e1 e1Var2, e1 e1Var3, e1 e1Var4, te.c cVar) {
        super(2, cVar);
        this.f28549u = f10;
        this.f28550v = e1Var;
        this.f28551w = e1Var2;
        this.f28552x = e1Var3;
        this.f28553y = e1Var4;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new k1(this.f28549u, this.f28550v, this.f28551w, this.f28552x, this.f28553y, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        k1 k1Var = (k1) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        k1Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        if (this.f28549u < 0.5f) {
            this.f28550v.i(1.0f);
            this.f28551w.i(0.0f);
            this.f28552x.i(0.0f);
            this.f28553y.i(0.0f);
        }
        return pe.z.f22715a;
    }
}
