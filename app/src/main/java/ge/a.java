package ge;

import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import com.google.android.gms.internal.ads.vl;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ne.f;

/* loaded from: classes.dex */
public abstract class a implements Closeable, v {

    /* renamed from: y, reason: collision with root package name */
    public static final vl f17744y = new vl("MobileVisionBase");

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f17745u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final f f17746v;

    /* renamed from: w, reason: collision with root package name */
    public final pd.c f17747w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f17748x;

    public a(f fVar, Executor executor) {
        this.f17746v = fVar;
        pd.c cVar = new pd.c(27, false);
        this.f17747w = cVar;
        this.f17748x = executor;
        ((AtomicInteger) fVar.f15846c).incrementAndGet();
        fVar.b(executor, d.f17752a, (pd.c) cVar.f22681u).d(c.f17750v);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @e0(o.ON_DESTROY)
    public synchronized void close() {
        if (!this.f17745u.getAndSet(true)) {
            this.f17747w.h();
            this.f17746v.g(this.f17748x);
        }
    }
}
