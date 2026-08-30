package a7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f305d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f306a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f307b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f308c;

    public e() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f306a = threadGroup;
        this.f308c = "lottie-" + f305d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f306a, runnable, this.f308c + this.f307b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
