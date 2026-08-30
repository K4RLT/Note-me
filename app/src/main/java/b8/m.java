package b8;
import h0.b;
import r0.m;
import a3.a;
import d1.r;
import e1.f;
import e1.m;
import q7.c;
import r0.y;
import r7.e;
import x7.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2380u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f2381v;

    public /* synthetic */ m(int i, int i10, r rVar) {
        this.f2380u = i10;
        this.f2381v = rVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2380u;
        r0.m mVar = (r0.m) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o.e(y.L(7), this.f2381v, mVar);
                break;
            case 1:
                f(y.L(1), this.f2381v, mVar);
                break;
            case 2:
                a(y.L(1), this.f2381v, mVar);
                break;
            case 3:
                e1.m(y.L(1), this.f2381v, mVar);
                break;
            case 4:
                e.a(y.L(1), this.f2381v, mVar);
                break;
            case 5:
                w7.c(y.L(7), this.f2381v, mVar);
                break;
            case 6:
                w7.a(y.L(1), this.f2381v, mVar);
                break;
            default:
                h0.b(y.L(1), this.f2381v, mVar);
                break;
        }
        return pe.z.f22715a;
    }
}
