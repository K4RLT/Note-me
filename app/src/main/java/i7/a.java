package i7;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18329u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f18330v;

    public /* synthetic */ a(int i, Object obj) {
        this.f18329u = i;
        this.f18330v = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f18329u) {
            case 0:
                ((Executor) this.f18330v).execute(new a6.e(14, runnable));
                return;
            default:
                ((Choreographer) this.f18330v).postFrameCallback(new f5.e(runnable));
                return;
        }
    }
}
