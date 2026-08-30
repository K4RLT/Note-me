package w7;
import j4.e;
import k1.r;
import r0.a1;

/* loaded from: classes.dex */
public final class p implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28864u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28865v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28866w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28867x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28868y;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f28864u = i;
        this.f28865v = obj;
        this.f28866w = obj2;
        this.f28867x = obj3;
        this.f28868y = obj4;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28864u) {
            case 0:
                long j10 = ((r) obj).f19523a;
                b1.v vVar = (b1.v) this.f28865v;
                int size = vVar.size();
                a1 a1Var = (a1) this.f28868y;
                int d2 = n4.d(a1Var);
                if (d2 >= 0 && d2 < size) {
                    vVar.set(((Number) a1Var.getValue()).intValue(), new r(j10));
                    ((o1) this.f28867x).invoke(new r(j10));
                } else {
                    vVar.add(0, new r(j10));
                    a1Var.setValue(0);
                    ((p) this.f28866w).invoke(new r(j10));
                }
                return pe.z.f22715a;
            default:
                e((e3) this.f28865v, ((r) obj).f19523a);
                ((e3) this.f28866w).s(false);
                ((e3) this.f28867x).C(false);
                ((e3) this.f28868y).v(false);
                return pe.z.f22715a;
        }
    }
}
