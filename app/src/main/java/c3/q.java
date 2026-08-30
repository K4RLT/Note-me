package c3;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final q f3798v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f3799w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3800u;

    static {
        int i = 2;
        f3798v = new q(i, 0);
        f3799w = new q(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i10) {
        super(i);
        this.f3800u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        switch (this.f3800u) {
            case 0:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar = (r0.r) mVar;
                if (!rVar.R(intValue & 1, z3)) {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                r0.m mVar2 = (r0.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar2 = (r0.r) mVar2;
                if (!rVar2.R(intValue2 & 1, z9)) {
                    rVar2.U();
                }
                return pe.z.f22715a;
        }
    }
}
