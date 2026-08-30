package z1;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final l f31843v;

    /* renamed from: w, reason: collision with root package name */
    public static final l f31844w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31845u;

    static {
        int i = 2;
        f31843v = new l(i, 0);
        f31844w = new l(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i10) {
        super(i);
        this.f31845u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f31845u) {
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
                }
                return pe.z.f22715a;
            default:
                ((n0) obj2).getClass();
                return pe.z.f22715a;
        }
    }
}
