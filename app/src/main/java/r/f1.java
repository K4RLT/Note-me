package r;
import r.b1;
import r.d1;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class f1 extends d1 {
    @Override // d1, b1
    public final void a(long j10, long j11) {
        if (!Float.isNaN(Float.NaN)) {
            this.f24055a.setZoom(Float.NaN);
        }
        long j12 = 9223372034707292159L & j11;
        Magnifier magnifier = this.f24055a;
        if (j12 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }
}
