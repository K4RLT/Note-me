package c7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3987a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3988b = Executors.defaultThreadFactory();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3989c = new AtomicInteger(1);

    public s() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3987a) {
            case 0:
                Thread newThread = this.f3988b.newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + this.f3989c.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = this.f3988b.newThread(runnable);
                int andIncrement = this.f3989c.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb2.append("gads-");
                sb2.append(andIncrement);
                newThread2.setName(sb2.toString());
                return newThread2;
        }
    }

    public s(c cVar) {
    }
}
