package lb;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class q1 extends ResultReceiver {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ib.h f20237u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r1 f20238v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Handler handler, ib.h hVar) {
        super(handler);
        this.f20237u = hVar;
        this.f20238v = r1Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        ib.h hVar = this.f20237u;
        if (i != 1) {
            if (i != 2) {
                hVar.c(new da.k(-100, 1));
                return;
            } else {
                hVar.d(0);
                return;
            }
        }
        hVar.d(-1);
        this.f20238v.e.f20122a = null;
    }
}
