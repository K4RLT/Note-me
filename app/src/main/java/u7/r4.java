package u7;
import q.d;

/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26789u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1 f26790v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f26791w;

    public /* synthetic */ r4(d dVar, o1 o1Var) {
        this.f26791w = dVar;
        this.f26790v = o1Var;
    }

    @Override // df.a
    public final Object invoke() {
        int i;
        switch (this.f26789u) {
            case 0:
                return new pe.j(Integer.valueOf(ff.a.b(((Number) this.f26791w.e()).floatValue())), Integer.valueOf(ff.a.b(((Number) this.f26790v.f26661q.e()).floatValue())));
            default:
                float floatValue = ((Number) this.f26791w.e()).floatValue();
                o1 o1Var = this.f26790v;
                o1Var.getClass();
                int b10 = ff.a.b(floatValue);
                g1 i10 = o1Var.i();
                int[] iArr = (int[]) qe.k.o(i10.e, o1Var.k());
                if (iArr != null && b10 >= 0 && b10 < iArr.length) {
                    i = iArr[b10];
                } else {
                    i = -1;
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ r4(o1 o1Var, d dVar) {
        this.f26790v = o1Var;
        this.f26791w = dVar;
    }
}
