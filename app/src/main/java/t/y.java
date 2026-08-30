package t;
import j1.b;
import r0.l;
import r0.m;
import r0.r;
import r0.x0;
import v1.t;
import v1.z;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25581u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f25582v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, df.l lVar) {
        super(3);
        this.f25581u = i;
        this.f25582v = lVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f25581u) {
            case 0:
                long j10 = ((b) obj3).f18762a;
                this.f25582v.invoke(new b(((t) obj2).f27343c));
                return pe.z.f22715a;
            default:
                ((Number) obj3).intValue();
                r rVar = (r) ((m) obj2);
                rVar.a0(374375707);
                Object O = rVar.O();
                if (O == l.f24285a) {
                    O = new z();
                    rVar.k0(O);
                }
                z zVar = (z) O;
                zVar.f27372a = this.f25582v;
                x0 x0Var = zVar.f27373b;
                if (x0Var != null) {
                    x0Var.f24433v = null;
                }
                zVar.f27373b = null;
                rVar.p(false);
                return zVar;
        }
    }
}
