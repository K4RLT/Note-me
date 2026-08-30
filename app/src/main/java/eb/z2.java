package eb;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.d6;

/* loaded from: classes.dex */
public final class z2 extends l {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, l1 l1Var, int i) {
        super(l1Var);
        this.e = i;
        this.f16472f = obj;
    }

    @Override // eb.l
    public final void c() {
        switch (this.e) {
            case 0:
                d6 d6Var = (d6) this.f16472f;
                v2 v2Var = (v2) d6Var.f5318x;
                v2Var.u();
                d1 d1Var = (d1) v2Var.f3443v;
                d1Var.H.getClass();
                d6Var.n(SystemClock.elapsedRealtime(), false, false);
                q j10 = d1Var.j();
                d1Var.H.getClass();
                j10.y(SystemClock.elapsedRealtime());
                return;
            default:
                c3 c3Var = (c3) this.f16472f;
                c3Var.B();
                c3Var.f().I.g("Starting upload from DelayedRunnable");
                c3Var.f16125w.b0();
                return;
        }
    }
}
