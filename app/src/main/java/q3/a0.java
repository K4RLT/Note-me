package q3;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public z f23378a;

    public a0(int i, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f23378a = new y(w.h(i, interpolator, j10));
        } else {
            this.f23378a = new z(i, interpolator, j10);
        }
    }
}
