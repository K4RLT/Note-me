package r0;

/* loaded from: classes.dex */
public final class h implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final h f24258v = new h(0);

    /* renamed from: w, reason: collision with root package name */
    public static final h f24259w = new h(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24260u;

    public /* synthetic */ h(int i) {
        this.f24260u = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        switch (this.f24260u) {
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
                m mVar2 = (m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (!rVar2.R(intValue2 & 1, z9)) {
                    rVar2.U();
                }
                return pe.z.f22715a;
        }
    }
}
