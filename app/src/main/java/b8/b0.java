package b8;
import d1.r;
import e1.e;
import m7.j;
import r0.m;
import r0.y;
import z7.c;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1863u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1864v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f1865w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1866x;

    public /* synthetic */ b0(int i, r rVar, df.a aVar, boolean z3) {
        this.f1864v = z3;
        this.f1865w = aVar;
        this.f1866x = rVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1863u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(385);
                e((k0) this.f1866x, this.f1864v, this.f1865w, (m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                w7.j(y.L(1), (r) this.f1866x, this.f1865w, (m) obj, this.f1864v);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(385);
                c.a(this.f1864v, (String) this.f1866x, this.f1865w, (m) obj, L2);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ b0(k0 k0Var, boolean z3, df.a aVar, int i) {
        this.f1866x = k0Var;
        this.f1864v = z3;
        this.f1865w = aVar;
    }

    public /* synthetic */ b0(boolean z3, String str, df.a aVar, int i) {
        this.f1864v = z3;
        this.f1866x = str;
        this.f1865w = aVar;
    }
}
