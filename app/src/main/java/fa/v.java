package fa;

import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class v extends oh implements x {
    public final boolean e() {
        boolean z3;
        Parcel R0 = R0(o1(), 7);
        int i = ua.g.f27145a;
        if (R0.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        R0.recycle();
        return z3;
    }
}
