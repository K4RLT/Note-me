package r0;
import j1.b;
import v1.t;

/* loaded from: classes.dex */
public final class q implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24322u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f24323v;

    public /* synthetic */ q(int i, Object obj) {
        this.f24322u = i;
        this.f24323v = obj;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f24322u) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (!rVar.R(intValue & 1, z3)) {
                    rVar.U();
                    return pe.z.f22715a;
                }
                throw null;
            default:
                t tVar = (t) obj;
                long j10 = ((b) obj2).f18762a;
                tVar.getClass();
                tVar.a();
                a1 a1Var = (a1) this.f24323v;
                a1Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)) + ((Number) a1Var.getValue()).floatValue()));
                return pe.z.f22715a;
        }
    }
}
