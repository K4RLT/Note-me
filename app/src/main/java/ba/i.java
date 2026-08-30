package ba;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements ib.c, ib.e, ib.d, ib.b {

    /* renamed from: u, reason: collision with root package name */
    public final CountDownLatch f3132u;

    public i() {
        this.f3132u = new CountDownLatch(1);
    }

    @Override // ib.b
    public void a() {
        this.f3132u.countDown();
    }

    @Override // ib.e
    public void d(Object obj) {
        this.f3132u.countDown();
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        this.f3132u.countDown();
    }

    @Override // ib.d
    public void w(Exception exc) {
        this.f3132u.countDown();
    }
}
