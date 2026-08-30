package f7;

import android.view.Choreographer;
import wa.n6;

/* loaded from: classes.dex */
public final class d implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (!n6.f29759a) {
            return;
        }
        if (n6.f29761c == 0) {
            n6.f29761c = j10;
        }
        long j11 = n6.f29762d;
        if (j11 != 0) {
            float f10 = ((float) (j10 - j11)) / 1000000.0f;
            if (f10 > n6.e) {
                n6.e = f10;
            }
        }
        n6.f29762d = j10;
        n6.f29760b++;
        long j12 = j10 - n6.f29761c;
        if (j12 >= 8000000000L) {
            n6.a(j12);
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
