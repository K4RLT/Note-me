package w7;
import k1.l0;
import k1.r;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p7 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e3 f28911u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28912v;

    public p7(e3 e3Var, int i) {
        this.f28911u = e3Var;
        this.f28912v = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long j10 = ((r) obj).f19523a;
        e3 e3Var = this.f28911u;
        ArrayList R = qe.l.R(e3Var.d());
        R.set(this.f28912v, Integer.valueOf(l0.F(j10)));
        e3Var.C.setValue(R);
        return pe.z.f22715a;
    }
}
