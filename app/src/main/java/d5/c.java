package d5;
import a.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15728u;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15728u) {
            case 0:
                runnable.run();
                return;
            default:
                k.a().f19208a.f19210b.execute(runnable);
                return;
        }
    }
}
