package w7;
import b.a;
import k1.b;
import k1.p;
import m1.d;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28059u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l9 f28060v;

    public /* synthetic */ d1(l9 l9Var, int i) {
        this.f28059u = i;
        this.f28060v = l9Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f28059u;
        pe.z zVar = pe.z.f22715a;
        l9 l9Var = this.f28060v;
        d dVar = (d) obj;
        switch (i) {
            case 0:
                dVar.getClass();
                p j10 = dVar.p0().j();
                p9 p9Var = p9.f28915a;
                p9.q(b.a(j10), l9Var, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar.e())));
                return zVar;
            default:
                dVar.getClass();
                p j11 = dVar.p0().j();
                p9 p9Var2 = p9.f28915a;
                p9.q(b.a(j11), l9Var, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar.e())));
                return zVar;
        }
    }
}
