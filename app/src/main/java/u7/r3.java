package u7;
import l.d;
import k6.q;
import r0.m;
import r0.y;
import z7.l;

/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f26787v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f26788w;

    public /* synthetic */ r3(boolean z3, df.a aVar, int i, int i10) {
        this.f26786u = i10;
        this.f26787v = z3;
        this.f26788w = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26786u;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q(this.f26787v, this.f26788w, mVar, y.L(1));
                break;
            case 1:
                q(this.f26787v, this.f26788w, mVar, y.L(1));
                break;
            default:
                l.d(this.f26787v, this.f26788w, mVar, y.L(49));
                break;
        }
        return pe.z.f22715a;
    }
}
