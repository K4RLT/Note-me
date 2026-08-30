package a6;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f254b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f255c;

    public b(boolean z3) {
        this.f253a = 0;
        this.f254b = z3;
        this.f255c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        switch (this.f253a) {
            case 0:
                runnable.getClass();
                if (this.f254b) {
                    str = "WM.task-";
                } else {
                    str = "androidx.work-";
                }
                return new Thread(runnable, str + ((AtomicInteger) this.f255c).incrementAndGet());
            default:
                Thread thread = new Thread(runnable, (String) this.f255c);
                thread.setDaemon(this.f254b);
                return thread;
        }
    }

    public b(String str, boolean z3) {
        this.f253a = 1;
        this.f255c = str;
        this.f254b = z3;
    }
}
