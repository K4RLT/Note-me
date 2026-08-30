package ma;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import jc.j;
import oc.t;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20761b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20762c;

    public a(String str) {
        this.f20760a = 0;
        this.f20762c = Executors.defaultThreadFactory();
        this.f20761b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f20760a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f20762c).newThread(new j(1, runnable));
                newThread.setName(this.f20761b);
                return newThread;
            default:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new t(runnable));
                newThread2.setName(this.f20761b + ((AtomicLong) this.f20762c).getAndIncrement());
                return newThread2;
        }
    }

    public a(String str, AtomicLong atomicLong) {
        this.f20760a = 1;
        this.f20761b = str;
        this.f20762c = atomicLong;
    }
}
