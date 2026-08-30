package i0;

import android.os.CancellationSignal;
import g0.e1;
import k0.j1;
import m2.p0;
import pf.r1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18051b;

    public /* synthetic */ k(int i, Object obj) {
        this.f18050a = i;
        this.f18051b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f18050a) {
            case 0:
                j1 j1Var = (j1) this.f18051b;
                if (j1Var != null) {
                    e1 e1Var = j1Var.f19321d;
                    if (e1Var != null) {
                        e1Var.e(p0.f20544b);
                    }
                    e1 e1Var2 = j1Var.f19321d;
                    if (e1Var2 != null) {
                        e1Var2.f(p0.f20544b);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((r1) this.f18051b).j(null);
                return;
        }
    }
}
