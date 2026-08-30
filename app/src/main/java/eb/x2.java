package eb;

import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.js;

/* loaded from: classes.dex */
public final class x2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16454u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16455v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v2 f16456w;

    public /* synthetic */ x2(v2 v2Var, long j10, int i) {
        this.f16454u = i;
        this.f16455v = j10;
        this.f16456w = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16454u) {
            case 0:
                v2 v2Var = this.f16456w;
                v2Var.u();
                v2Var.B();
                js jsVar = v2Var.f().I;
                long j10 = this.f16455v;
                jsVar.f(Long.valueOf(j10), "Activity paused, time");
                j6.c cVar = v2Var.B;
                v2 v2Var2 = (v2) cVar.f18915w;
                ((d1) v2Var2.f3443v).H.getClass();
                y2 y2Var = new y2(cVar, System.currentTimeMillis(), j10);
                cVar.f18914v = y2Var;
                v2Var2.f16440x.postDelayed(y2Var, 2000L);
                if (((d1) v2Var.f3443v).A.I()) {
                    ((z2) v2Var.A.f5317w).a();
                    return;
                }
                return;
            default:
                v2 v2Var3 = this.f16456w;
                v2Var3.u();
                d6 d6Var = v2Var3.A;
                v2Var3.B();
                js jsVar2 = v2Var3.f().I;
                long j11 = this.f16455v;
                jsVar2.f(Long.valueOf(j11), "Activity resumed, time");
                d1 d1Var = (d1) v2Var3.f3443v;
                boolean F = d1Var.A.F(null, v.F0);
                e eVar = d1Var.A;
                if (F) {
                    if (eVar.I() || v2Var3.f16441y) {
                        ((v2) d6Var.f5318x).u();
                        ((z2) d6Var.f5317w).a();
                        d6Var.f5315u = j11;
                        d6Var.f5316v = j11;
                    }
                } else if (eVar.I() || v2Var3.s().O.b()) {
                    ((v2) d6Var.f5318x).u();
                    ((z2) d6Var.f5317w).a();
                    d6Var.f5315u = j11;
                    d6Var.f5316v = j11;
                }
                j6.c cVar2 = v2Var3.B;
                v2 v2Var4 = (v2) cVar2.f18915w;
                v2Var4.u();
                y2 y2Var2 = (y2) cVar2.f18914v;
                if (y2Var2 != null) {
                    v2Var4.f16440x.removeCallbacks(y2Var2);
                }
                v2Var4.s().O.a(false);
                v2Var4.u();
                v2Var4.f16441y = false;
                pd.c cVar3 = v2Var3.f16442z;
                v2 v2Var5 = (v2) cVar3.f22681u;
                d1 d1Var2 = (d1) v2Var5.f3443v;
                v2Var5.u();
                if (d1Var2.e()) {
                    d1Var2.H.getClass();
                    cVar3.v(System.currentTimeMillis());
                    return;
                }
                return;
        }
    }
}
