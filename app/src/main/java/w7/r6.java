package w7;
import r0.a1;
import r0.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements df.a {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ e1 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29005u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f29006v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f29007w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.p f29008x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f29009y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e1 f29010z;

    public /* synthetic */ r6(float f10, df.l lVar, df.p pVar, a1 a1Var, e1 e1Var, a1 a1Var2, e1 e1Var2, int i) {
        this.f29005u = i;
        this.f29006v = f10;
        this.f29007w = lVar;
        this.f29008x = pVar;
        this.f29009y = a1Var;
        this.f29010z = e1Var;
        this.A = a1Var2;
        this.B = e1Var2;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f29005u) {
            case 0:
                a1 a1Var = this.f29009y;
                boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                e1 e1Var = this.f29010z;
                if (booleanValue && e1Var.h() < this.f29006v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f29007w.invoke(null);
                Boolean bool = Boolean.FALSE;
                this.A.setValue(bool);
                a1Var.setValue(bool);
                if (z3) {
                    this.f29008x.invoke(Float.valueOf(this.B.h()), Float.valueOf(e1Var.h()));
                }
                return pe.z.f22715a;
            case 1:
                a1 a1Var2 = this.f29009y;
                boolean booleanValue2 = ((Boolean) a1Var2.getValue()).booleanValue();
                e1 e1Var2 = this.f29010z;
                if (booleanValue2 && e1Var2.h() < this.f29006v) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f29007w.invoke(null);
                Boolean bool2 = Boolean.FALSE;
                this.A.setValue(bool2);
                a1Var2.setValue(bool2);
                if (z9) {
                    this.f29008x.invoke(Float.valueOf(this.B.h()), Float.valueOf(e1Var2.h()));
                }
                return pe.z.f22715a;
            case 2:
                a1 a1Var3 = this.f29009y;
                boolean booleanValue3 = ((Boolean) a1Var3.getValue()).booleanValue();
                e1 e1Var3 = this.f29010z;
                if (booleanValue3 && e1Var3.h() < this.f29006v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29007w.invoke(null);
                Boolean bool3 = Boolean.FALSE;
                this.A.setValue(bool3);
                a1Var3.setValue(bool3);
                if (z10) {
                    this.f29008x.invoke(Float.valueOf(this.B.h()), Float.valueOf(e1Var3.h()));
                }
                return pe.z.f22715a;
            default:
                a1 a1Var4 = this.f29009y;
                boolean booleanValue4 = ((Boolean) a1Var4.getValue()).booleanValue();
                e1 e1Var4 = this.f29010z;
                if (booleanValue4 && e1Var4.h() < this.f29006v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29007w.invoke(null);
                Boolean bool4 = Boolean.FALSE;
                this.A.setValue(bool4);
                a1Var4.setValue(bool4);
                if (z11) {
                    this.f29008x.invoke(Float.valueOf(this.B.h()), Float.valueOf(e1Var4.h()));
                }
                return pe.z.f22715a;
        }
    }
}
