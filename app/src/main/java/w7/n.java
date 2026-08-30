package w7;
import k1.r;
import r0.a1;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f28744u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f28745v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z3, long j10, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f28744u = z3;
        this.f28745v = j10;
        this.f28746w = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new n(this.f28744u, this.f28745v, this.f28746w, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        nVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        if (this.f28744u) {
            this.f28746w.setValue(new r(this.f28745v));
        }
        return pe.z.f22715a;
    }
}
