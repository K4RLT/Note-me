package i7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18331a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f18332b;

    public c(int i) {
        this.f18331a = i;
        switch (i) {
            case 1:
                this.f18332b = new AtomicInteger(0);
                return;
            default:
                this.f18332b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f18331a) {
            case 0:
                runnable.getClass();
                return new Thread(runnable, g3.a.g(this.f18332b.incrementAndGet(), "scraply_db_"));
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f18332b.getAndIncrement());
                return thread;
        }
    }
}
