package g5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static final ExecutorService a(boolean z3) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a6.b(z3));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }
}
