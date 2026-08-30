package c2;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y0 f3718u;

    public x0(y0 y0Var) {
        this.f3718u = y0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f3718u.f3724x.removeCallbacks(this);
        y0.a0(this.f3718u);
        y0 y0Var = this.f3718u;
        synchronized (y0Var.f3725y) {
            if (!y0Var.D) {
                return;
            }
            y0Var.D = false;
            ArrayList arrayList = y0Var.A;
            y0Var.A = y0Var.B;
            y0Var.B = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j10);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y0.a0(this.f3718u);
        y0 y0Var = this.f3718u;
        synchronized (y0Var.f3725y) {
            if (y0Var.A.isEmpty()) {
                y0Var.f3723w.removeFrameCallback(this);
                y0Var.D = false;
            }
        }
    }
}
