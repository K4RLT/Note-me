package c;
import l.a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: u, reason: collision with root package name */
    public final long f3244u = SystemClock.uptimeMillis() + 10000;

    /* renamed from: v, reason: collision with root package name */
    public Runnable f3245v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3246w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f3247x;

    public k(o oVar) {
        this.f3247x = oVar;
    }

    public final void a(View view) {
        if (!this.f3246w) {
            this.f3246w = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f3245v = runnable;
        View decorView = this.f3247x.getWindow().getDecorView();
        decorView.getClass();
        if (this.f3246w) {
            if (kotlin.jvm.internal.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new a6.e(2, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f3245v;
        if (runnable != null) {
            runnable.run();
            this.f3245v = null;
            x xVar = (x) this.f3247x.A.getValue();
            synchronized (xVar.f3271b) {
                z3 = xVar.f3272c;
            }
            if (z3) {
                this.f3246w = false;
                this.f3247x.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f3244u) {
            this.f3246w = false;
            this.f3247x.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3247x.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
