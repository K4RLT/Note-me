package w7;
import d1.o;
import d1.r;
import h0.a;
import k1.l0;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29058u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29059v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f29060w;

    public /* synthetic */ s5(Object obj, int i, int i10) {
        this.f29058u = i10;
        this.f29060w = obj;
        this.f29059v = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        int i;
        switch (this.f29058u) {
            case 0:
                ((Integer) obj2).intValue();
                n4.h0((t9) this.f29060w, (m) obj, y.L(this.f29059v | 1));
                return pe.z.f22715a;
            case 1:
                u7.b bVar = (u7.b) this.f29060w;
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 15);
                    f0.d dVar = f0.e.f16629a;
                    r a10 = wa.j7.a(k3, dVar);
                    Integer num = bVar.f25926l;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = this.f29059v;
                    }
                    m.a(0, ya.a(androidx.compose.foundation.a.b(a10, l0.c(i), l0.f19495a), 1, r.c(r.f19515d, 0.7f), dVar), rVar);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                ((Integer) obj2).getClass();
                x7.a(y.L(this.f29059v | 1), (r) this.f29060w, (m) obj);
                return pe.z.f22715a;
        }
    }
}
