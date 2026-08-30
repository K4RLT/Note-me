package u7;
import q.x;
import r0.a1;

/* loaded from: classes.dex */
public final class b6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f25960u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f25961v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f25962w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f25963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(boolean z3, boolean z9, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f25961v = z3;
        this.f25962w = z9;
        this.f25963x = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new b6(this.f25961v, this.f25962w, this.f25963x, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b6) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f25960u;
        pe.z zVar = pe.z.f22715a;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            float f10 = k6.f26414a;
            if (((Boolean) this.f25963x.getValue()).booleanValue() && this.f25961v && this.f25962w) {
                this.f25960u = 1;
                Object j10 = pf.b0.j(2500L, this);
                ue.a aVar = ue.a.f27192u;
                if (j10 == aVar) {
                    return aVar;
                }
            }
            return zVar;
        }
        if (((Boolean) t7.b.f25651a.getValue()).booleanValue()) {
            sf.n0 n0Var = t7.b.f25653c;
            Boolean bool = Boolean.TRUE;
            n0Var.getClass();
            n0Var.k(null, bool);
        }
        return zVar;
    }
}
