package eb;

import android.os.Handler;
import com.google.android.gms.internal.ads.pu1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: d, reason: collision with root package name */
    public static volatile bb.a f16217d;

    /* renamed from: a, reason: collision with root package name */
    public final l1 f16218a;

    /* renamed from: b, reason: collision with root package name */
    public final pu1 f16219b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f16220c;

    public l(l1 l1Var) {
        fa.y.h(l1Var);
        this.f16218a = l1Var;
        this.f16219b = new pu1(8, this, l1Var, false);
    }

    public final void a() {
        this.f16220c = 0L;
        d().removeCallbacks(this.f16219b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f16218a.zzb().getClass();
            this.f16220c = System.currentTimeMillis();
            if (!d().postDelayed(this.f16219b, j10)) {
                this.f16218a.f().A.f(Long.valueOf(j10), "Failed to schedule delayed post. time");
            }
        }
    }

    public abstract void c();

    public final Handler d() {
        bb.a aVar;
        if (f16217d != null) {
            return f16217d;
        }
        synchronized (l.class) {
            try {
                if (f16217d == null) {
                    f16217d = new bb.a(this.f16218a.zza().getMainLooper(), 2);
                }
                aVar = f16217d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
