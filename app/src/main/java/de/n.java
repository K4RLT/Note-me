package de;

import fa.y;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15856u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f15857v;

    public /* synthetic */ n(int i, Runnable runnable) {
        this.f15856u = i;
        this.f15857v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15856u) {
            case 0:
                Deque deque = (Deque) g.f15842v.get();
                y.h(deque);
                Runnable runnable = this.f15857v;
                deque.add(runnable);
                if (deque.size() > 1) {
                    return;
                }
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            default:
                g.f15842v.set(new ArrayDeque());
                this.f15857v.run();
                return;
        }
    }
}
