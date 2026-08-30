package c2;
import n.d0;
import n0.m;
import r0.f1;
import x.n;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3575u;

    public /* synthetic */ m(int i) {
        this.f3575u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3575u) {
            case 0:
                d0 d0Var = x.f3685e1;
                synchronized (d0Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = d0Var.f20855a;
                        int i10 = d0Var.f20856b;
                        int i11 = 0;
                        if (i < 30) {
                            while (i11 < i10) {
                                x xVar = (x) objArr[i11];
                                boolean showLayoutBounds = xVar.getShowLayoutBounds();
                                Class cls = x.f3682b1;
                                xVar.setShowLayoutBounds(n0.m());
                                if (showLayoutBounds != xVar.getShowLayoutBounds()) {
                                    n(xVar.getRoot());
                                }
                                i11++;
                            }
                        } else {
                            while (i11 < i10) {
                                n(((x) objArr[i11]).getRoot());
                                i11++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                d7.d.f15769b = true;
                return;
            case 2:
                Context context = e7.o.e;
                if (e7.o.i && context != null) {
                    e7.o oVar = e7.o.f15975a;
                    if (e7.o.b()) {
                        e7.o.d(context);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Context context2 = e7.o.e;
                if (e7.o.i && context2 != null) {
                    e7.o oVar2 = e7.o.f15975a;
                    if (e7.o.b()) {
                        e7.o.f15978d = null;
                        e7.o.d(context2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                f1 f1Var = p7.e.e;
                f1Var.i(f1Var.h() + 1);
                u7.n2 n2Var = p7.e.f22448f;
                if (n2Var != null) {
                    n2Var.invoke();
                    return;
                }
                return;
            default:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f4209a;
                return;
        }
    }
}
