package le;

import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import com.google.mlkit.vision.digitalink.recognition.internal.DigitalInkRecognizerJni;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import je.i;

/* loaded from: classes.dex */
public final class b implements je.d {

    /* renamed from: y, reason: collision with root package name */
    public static final i f20333y = new i("", new je.e(0.0f, 0.0f));

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f20334u;

    /* renamed from: v, reason: collision with root package name */
    public final je.a f20335v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f20336w;

    /* renamed from: x, reason: collision with root package name */
    public final pd.c f20337x = new pd.c(27, false);

    public b(DigitalInkRecognizerJni digitalInkRecognizerJni, je.a aVar, Executor executor) {
        this.f20334u = new AtomicReference(digitalInkRecognizerJni);
        this.f20335v = aVar;
        this.f20336w = executor;
        ((AtomicInteger) digitalInkRecognizerJni.f15846c).incrementAndGet();
    }

    @Override // je.d, java.io.Closeable, java.lang.AutoCloseable
    @e0(o.ON_DESTROY)
    public void close() {
        DigitalInkRecognizerJni digitalInkRecognizerJni = (DigitalInkRecognizerJni) this.f20334u.getAndSet(null);
        if (digitalInkRecognizerJni != null) {
            digitalInkRecognizerJni.g(this.f20336w);
        }
    }
}
