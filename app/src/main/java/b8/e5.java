package b8;
import j1.b;
import r0.a1;
import r0.e1;

/* loaded from: classes.dex */
public final class e5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f2025u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f2026v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f2027w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f2028x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f2029y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(boolean z3, df.l lVar, e1 e1Var, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f2025u = z3;
        this.f2026v = lVar;
        this.f2027w = e1Var;
        this.f2028x = a1Var;
        this.f2029y = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new e5(this.f2025u, this.f2026v, this.f2027w, this.f2028x, this.f2029y, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        e5 e5Var = (e5) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        e5Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        pe.a.e(obj);
        a1 a1Var = this.f2029y;
        e1 e1Var = this.f2027w;
        boolean z9 = this.f2025u;
        if (!z9) {
            int i = m5.f2418b;
            if (e1Var.h() != 1.0f) {
                e1Var.i(1.0f);
                this.f2028x.setValue(new b(0L));
                a1Var.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            }
        }
        if (z9) {
            int i10 = m5.f2418b;
            if (e1Var.h() > 1.01f) {
                z3 = true;
            } else {
                z3 = false;
            }
            a1Var.setValue(Boolean.valueOf(z3));
            Boolean bool = (Boolean) a1Var.getValue();
            bool.booleanValue();
            this.f2026v.invoke(bool);
        }
        return pe.z.f22715a;
    }
}
