package o6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21808u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f21809v;

    public /* synthetic */ f(j jVar, int i) {
        this.f21808u = i;
        this.f21809v = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21808u) {
            case 0:
                j jVar = this.f21809v;
                Semaphore semaphore = jVar.U;
                x6.c cVar = jVar.C;
                if (cVar != null) {
                    try {
                        semaphore.acquire();
                        cVar.m(jVar.f21820v.a());
                        if (j.f21814c0 && jVar.T) {
                            if (jVar.V == null) {
                                jVar.V = new Handler(Looper.getMainLooper());
                                jVar.W = new f(jVar, 1);
                            }
                            jVar.V.post(jVar.W);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        semaphore.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
            default:
                Drawable drawable = this.f21809v;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
        }
    }
}
