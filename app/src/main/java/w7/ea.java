package w7;
import lb.g;
import r0.a1;
import x.o;

/* loaded from: classes.dex */
public final class ea extends ve.i implements df.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public int f28176u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28177v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f28178w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.p f28179x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f28180y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f28181z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(int i, Integer num, df.p pVar, float f10, float f11, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f28177v = i;
        this.f28178w = num;
        this.f28179x = pVar;
        this.f28180y = f10;
        this.f28181z = f11;
        this.A = a1Var;
        this.B = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new ea(this.f28177v, this.f28178w, this.f28179x, this.f28180y, this.f28181z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ea) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        ea eaVar;
        int i = this.f28176u;
        a1 a1Var = this.A;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                eaVar = this;
            } else {
                q.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            q.r0 r8 = q.e.r(0.8f, 1500.0f, null, 4);
            da daVar = new da(this.f28180y, this.f28181z, a1Var);
            this.f28176u = 1;
            eaVar = this;
            Object d2 = q.e.d(0.0f, 1.0f, r8, daVar, eaVar, 4);
            ue.a aVar = ue.a.f27192u;
            if (d2 == aVar) {
                return aVar;
            }
        }
        Integer num = eaVar.f28178w;
        int intValue = num.intValue();
        int i10 = eaVar.f28177v;
        if (i10 != intValue) {
            eaVar.f28179x.invoke(num, new Integer(i10));
        }
        eaVar.B.setValue(null);
        g(0.0f, a1Var);
        return pe.z.f22715a;
    }
}
