package c4;
import k.a;

import android.os.Trace;
import com.google.android.gms.internal.measurement.k4;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3852u;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3852u) {
            case 0:
                try {
                    int i = l3.e.f19887a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.d()) {
                        a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i10 = l3.e.f19887a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                return;
            default:
                k4.i.incrementAndGet();
                return;
        }
    }

    private final void a() {
    }
}
