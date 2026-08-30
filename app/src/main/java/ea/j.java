package ea;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16013u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f16014v;

    public j(Handler handler) {
        handler.getClass();
        this.f16014v = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16013u) {
            case 0:
                this.f16014v.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f16014v;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
