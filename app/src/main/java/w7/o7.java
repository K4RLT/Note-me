package w7;
import r0.a1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28847u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28848v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28849w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28850x;

    public /* synthetic */ o7(int i, a1 a1Var, a1 a1Var2) {
        this.f28848v = i;
        this.f28849w = a1Var;
        this.f28850x = a1Var2;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28847u) {
            case 0:
                a1 a1Var = (a1) this.f28850x;
                if (System.currentTimeMillis() - ((Number) this.f28849w.getValue()).longValue() > 200) {
                    int intValue = ((Number) a1Var.getValue()).intValue();
                    int i = this.f28848v;
                    if (intValue == i) {
                        i = -1;
                    }
                    a1Var.setValue(Integer.valueOf(i));
                }
                return pe.z.f22715a;
            default:
                e3 e3Var = (e3) this.f28850x;
                ArrayList R = qe.l.R(e3Var.d());
                R.remove(this.f28848v);
                e3Var.C.setValue(R);
                this.f28849w.setValue(-1);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ o7(int i, a1 a1Var, e3 e3Var) {
        this.f28850x = e3Var;
        this.f28848v = i;
        this.f28849w = a1Var;
    }
}
