package w7;
import k1.r;
import r0.a1;

/* loaded from: classes.dex */
public final class o extends ve.i implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28815u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b1.v f28816v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28817w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28818x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28819y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b1.v vVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, te.c cVar) {
        super(2, cVar);
        this.f28816v = vVar;
        this.f28817w = a1Var;
        this.f28818x = a1Var2;
        this.f28819y = a1Var3;
        this.f28820z = a1Var4;
        this.A = a1Var5;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f28815u) {
            case 0:
                return new o((r) this.f28819y, this.f28816v, (o1) this.f28820z, (df.a) this.A, this.f28817w, this.f28818x, cVar);
            default:
                return new o(this.f28816v, this.f28817w, this.f28818x, (a1) this.f28819y, (a1) this.f28820z, (a1) this.A, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f28815u) {
            case 0:
                o oVar = (o) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                oVar.invokeSuspend(zVar2);
                return zVar2;
            default:
                o oVar2 = (o) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                oVar2.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28815u) {
            case 0:
                pe.a.e(obj);
                r rVar = (r) this.f28819y;
                if (rVar != null) {
                    long j10 = rVar.f19523a;
                    boolean booleanValue = ((Boolean) this.f28817w.getValue()).booleanValue();
                    a1 a1Var = this.f28818x;
                    b1.v vVar = this.f28816v;
                    if (booleanValue) {
                        int size = vVar.size();
                        int d2 = n4.d(a1Var);
                        if (d2 < 0 || d2 >= size) {
                            vVar.add(0, new r(j10));
                            a1Var.setValue(0);
                            ((o1) this.f28820z).invoke(new r(j10));
                            ((df.a) this.A).invoke();
                        }
                    }
                    int size2 = vVar.size();
                    int d10 = n4.d(a1Var);
                    if (d10 >= 0 && d10 < size2) {
                        vVar.set(((Number) a1Var.getValue()).intValue(), new r(j10));
                    }
                    ((o1) this.f28820z).invoke(new r(j10));
                    ((df.a) this.A).invoke();
                }
                return pe.z.f22715a;
            default:
                a1 a1Var2 = (a1) this.f28820z;
                a1 a1Var3 = (a1) this.f28819y;
                pe.a.e(obj);
                a1 a1Var4 = this.f28817w;
                String str = (String) a1Var4.getValue();
                a1 a1Var5 = this.f28818x;
                if ((str != null || ((String) a1Var5.getValue()) != null || ((String) a1Var3.getValue()) != null) && ((Boolean) a1Var2.getValue()).booleanValue()) {
                    a1Var2.setValue(Boolean.FALSE);
                    ((a1) this.A).setValue(null);
                }
                b1.v vVar2 = this.f28816v;
                if (!vVar2.isEmpty() && (((String) a1Var4.getValue()) != null || ((String) a1Var5.getValue()) != null || ((String) a1Var3.getValue()) != null)) {
                    vVar2.clear();
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, b1.v vVar, o1 o1Var, df.a aVar, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f28819y = rVar;
        this.f28816v = vVar;
        this.f28820z = o1Var;
        this.A = aVar;
        this.f28817w = a1Var;
        this.f28818x = a1Var2;
    }
}
