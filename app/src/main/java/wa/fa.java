package wa;
import na.b;
import q.x;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class fa implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f29665z = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public int f29666u;

    /* renamed from: v, reason: collision with root package name */
    public long f29667v;

    /* renamed from: w, reason: collision with root package name */
    public long f29668w;

    /* renamed from: x, reason: collision with root package name */
    public long f29669x = 2147483647L;

    /* renamed from: y, reason: collision with root package name */
    public long f29670y = -2147483648L;

    public fa(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f29667v;
        if (j10 != 0) {
            k(j10);
        } else {
            x.o("Did you forget to call start()?");
        }
    }

    public void f() {
        this.f29667v = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void j(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f29668w;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f29666u = 0;
            this.f29667v = 0L;
            this.f29669x = 2147483647L;
            this.f29670y = -2147483648L;
        }
        this.f29668w = elapsedRealtimeNanos;
        this.f29666u++;
        this.f29669x = Math.min(this.f29669x, j10);
        this.f29670y = Math.max(this.f29670y, j10);
        if (this.f29666u % 50 == 0) {
            Locale locale = Locale.US;
            b();
        }
        if (this.f29666u % 500 == 0) {
            this.f29666u = 0;
            this.f29667v = 0L;
            this.f29669x = 2147483647L;
            this.f29670y = -2147483648L;
        }
    }

    public void k(long j10) {
        j((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
