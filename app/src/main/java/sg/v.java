package sg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import q.x;

/* loaded from: classes.dex */
public class v {

    /* renamed from: d, reason: collision with root package name */
    public static final u f25310d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f25311a;

    /* renamed from: b, reason: collision with root package name */
    public long f25312b;

    /* renamed from: c, reason: collision with root package name */
    public long f25313c;

    public v a() {
        this.f25311a = false;
        return this;
    }

    public v b() {
        this.f25313c = 0L;
        return this;
    }

    public long c() {
        if (this.f25311a) {
            return this.f25312b;
        }
        x.o("No deadline");
        return 0L;
    }

    public v d(long j10) {
        this.f25311a = true;
        this.f25312b = j10;
        return this;
    }

    public boolean e() {
        return this.f25311a;
    }

    public void f() {
        if (!Thread.interrupted()) {
            if (this.f25311a && this.f25312b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public v g(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j10 >= 0) {
            this.f25313c = timeUnit.toNanos(j10);
            return this;
        }
        x.j(g3.a.h(j10, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.f25313c;
    }

    public final void i(Object obj) {
        obj.getClass();
        try {
            boolean e = e();
            long h3 = h();
            long j10 = 0;
            if (!e && h3 == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (e && h3 != 0) {
                h3 = Math.min(h3, c() - nanoTime);
            } else if (e) {
                h3 = c() - nanoTime;
            }
            if (h3 > 0) {
                long j11 = h3 / 1000000;
                obj.wait(j11, (int) (h3 - (1000000 * j11)));
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < h3) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
