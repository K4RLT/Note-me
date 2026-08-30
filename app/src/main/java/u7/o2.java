package u7;
import p.a;
import w7.b;

/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26662u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26663v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26664w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26665x;

    public /* synthetic */ o2(m3 m3Var, int i, int i10, int i11) {
        this.f26662u = i11;
        this.f26663v = m3Var;
        this.f26664w = i;
        this.f26665x = i10;
    }

    @Override // df.a
    public final Object invoke() {
        int i;
        int i10;
        switch (this.f26662u) {
            case 0:
                this.f26663v.A(this.f26664w, this.f26665x);
                return pe.z.f22715a;
            case 1:
                this.f26663v.A(this.f26664w, this.f26665x);
                return pe.z.f22715a;
            case 2:
                m3 m3Var = this.f26663v;
                v7.k kVar = m3Var.f26542p;
                String y10 = m3Var.y(this.f26664w);
                kVar.getClass();
                Integer num = (Integer) a.h(y10, Integer.valueOf(this.f26665x), kVar.f27443d);
                boolean z3 = false;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                m3 m3Var2 = this.f26663v;
                v7.k kVar2 = m3Var2.f26542p;
                String y11 = m3Var2.y(this.f26664w);
                kVar2.getClass();
                Integer num2 = (Integer) a.h(y11, Integer.valueOf(this.f26665x), kVar2.e);
                boolean z9 = false;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 4:
                return new b(this.f26663v.C0(this.f26664w), this.f26665x);
            case 5:
                this.f26663v.K(this.f26664w, this.f26665x);
                return pe.z.f22715a;
            case 6:
                this.f26663v.J(this.f26664w, this.f26665x);
                return pe.z.f22715a;
            case 7:
                this.f26663v.J(this.f26664w, this.f26665x);
                return pe.z.f22715a;
            default:
                this.f26663v.K(this.f26664w, this.f26665x);
                return pe.z.f22715a;
        }
    }
}
