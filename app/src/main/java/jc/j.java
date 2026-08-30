package jc;

import android.os.Process;
import android.util.Log;
import ya.hb;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19149u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f19150v;

    public /* synthetic */ j(int i, Runnable runnable) {
        this.f19149u = i;
        this.f19150v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19149u) {
            case 0:
                this.f19150v.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f19150v.run();
                return;
            case 2:
                try {
                    this.f19150v.run();
                    return;
                } catch (Exception e) {
                    hb.b("Executor", "Background execution failure.", e);
                    return;
                }
            default:
                try {
                    this.f19150v.run();
                    return;
                } catch (RuntimeException e8) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e8);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f19149u) {
            case 0:
                return this.f19150v.toString();
            default:
                return super.toString();
        }
    }
}
