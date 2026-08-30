package w7;
import r0.a1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28542u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f28543v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28544w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28545x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f28546y;

    public /* synthetic */ k(a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, int i) {
        this.f28542u = i;
        this.f28543v = a1Var;
        this.f28544w = a1Var2;
        this.f28545x = a1Var3;
        this.f28546y = a1Var4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.a
    public final Object invoke() {
        switch (this.f28542u) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                a1 a1Var = this.f28543v;
                if (currentTimeMillis - ((Number) a1Var.getValue()).longValue() > 200) {
                    a1 a1Var2 = this.f28544w;
                    boolean c10 = n4.c(a1Var2);
                    a1 a1Var3 = this.f28545x;
                    if (c10 && ((Boolean) a1Var3.getValue()).booleanValue()) {
                        n4.f(a1Var, a1Var2, a1Var3);
                    } else {
                        this.f28546y.setValue(-1);
                        Boolean bool = Boolean.TRUE;
                        a1Var3.setValue(bool);
                        a1Var2.setValue(bool);
                    }
                }
                return pe.z.f22715a;
            case 1:
                this.f28543v.setValue(null);
                this.f28544w.setValue(null);
                this.f28545x.setValue(null);
                this.f28546y.setValue(null);
                return pe.z.f22715a;
            default:
                this.f28543v.setValue(null);
                this.f28544w.setValue(null);
                this.f28545x.setValue(null);
                this.f28546y.setValue(null);
                return pe.z.f22715a;
        }
    }
}
