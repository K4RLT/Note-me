package ba;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h f3129v = new h(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h f3130w = new h(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3131u;

    public /* synthetic */ h(int i) {
        this.f3131u = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3131u) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
