package g0;
import j1.b;
import v1.r;
import v1.t;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17123u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p1 f17124v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(p1 p1Var, int i) {
        super(1);
        this.f17123u = i;
        this.f17124v = p1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17123u) {
            case 0:
                this.f17124v.a(((b) obj).f18762a);
                return pe.z.f22715a;
            default:
                t tVar = (t) obj;
                this.f17124v.d(r.g(tVar, false));
                tVar.a();
                return pe.z.f22715a;
        }
    }
}
