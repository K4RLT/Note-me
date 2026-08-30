package d9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f15814u;

    /* renamed from: v, reason: collision with root package name */
    public final long f15815v;

    /* renamed from: w, reason: collision with root package name */
    public final CountDownLatch f15816w = new CountDownLatch(1);

    /* renamed from: x, reason: collision with root package name */
    public boolean f15817x = false;

    public d(b bVar, long j10) {
        this.f15814u = new WeakReference(bVar);
        this.f15815v = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f15814u;
        try {
            if (!this.f15816w.await(this.f15815v, TimeUnit.MILLISECONDS) && (bVar = (b) weakReference.get()) != null) {
                bVar.c();
                this.f15817x = true;
            }
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f15817x = true;
            }
        }
    }
}
