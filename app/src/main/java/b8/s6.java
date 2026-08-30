package b8;
import j4.d;
import r0.a1;

/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2716u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f2717v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f2718w;

    public /* synthetic */ s6(int i, a1 a1Var, a1 a1Var2) {
        this.f2716u = i;
        this.f2717v = a1Var;
        this.f2718w = a1Var2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.a
    public final Object invoke() {
        switch (this.f2716u) {
            case 0:
                this.f2717v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f2718w.setValue(null);
                return pe.z.f22715a;
            case 1:
                this.f2717v.setValue("free");
                this.f2718w.setValue("");
                return pe.z.f22715a;
            case 2:
                this.f2717v.setValue("ad");
                this.f2718w.setValue("");
                return pe.z.f22715a;
            case 3:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 4:
                this.f2717v.setValue(null);
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 5:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 6:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 7:
                this.f2717v.setValue("terminos");
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 8:
                if (System.currentTimeMillis() - ((Number) this.f2717v.getValue()).longValue() > 200) {
                    this.f2718w.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                }
                return pe.z.f22715a;
            case 9:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 10:
                if (System.currentTimeMillis() - ((Number) this.f2717v.getValue()).longValue() > 200) {
                    this.f2718w.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                }
                return pe.z.f22715a;
            case 11:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 12:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(null);
                return pe.z.f22715a;
            case 13:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 14:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 15:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 16:
                this.f2717v.setValue(null);
                w7.n4.S0(this.f2718w, 0L);
                return pe.z.f22715a;
            case 17:
                w7.d(this.f2717v, System.currentTimeMillis());
                this.f2718w.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 18:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 19:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(-1);
                return pe.z.f22715a;
            case 20:
                this.f2717v.setValue(Long.valueOf(System.currentTimeMillis()));
                this.f2718w.setValue(-1);
                return pe.z.f22715a;
            default:
                this.f2717v.setValue(Boolean.FALSE);
                this.f2718w.setValue(null);
                return pe.z.f22715a;
        }
    }
}
