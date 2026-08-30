package v1;
import n.d0;
import n.q;

import com.google.android.gms.internal.ads.mf;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final t0.e f27325a = new t0.e(new i[16]);

    /* renamed from: b, reason: collision with root package name */
    public final d0 f27326b = new d0(10);

    public boolean a(q qVar, z1.x xVar, mf mfVar, boolean z3) {
        t0.e eVar = this.f27325a;
        Object[] objArr = eVar.f25617u;
        int i = eVar.f25619w;
        boolean z9 = false;
        for (int i10 = 0; i10 < i; i10++) {
            if (!((i) objArr[i10]).a(qVar, xVar, mfVar, z3) && !z9) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        return z9;
    }

    public void b(mf mfVar) {
        t0.e eVar = this.f27325a;
        int i = eVar.f25619w;
        while (true) {
            i--;
            if (-1 < i) {
                if (((i) eVar.f25617u[i]).f27320d.f12866a == 0) {
                    eVar.n(i);
                }
            } else {
                return;
            }
        }
    }
}
