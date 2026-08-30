package fc;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16951u;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16951u) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
