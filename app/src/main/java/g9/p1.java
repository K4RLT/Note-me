package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class p1 extends oh implements q1 {
    public p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 0);
    }

    @Override // g9.q1
    public final boolean b() {
        boolean z3;
        Parcel u22 = u2(g2(), 2);
        ClassLoader classLoader = qh.f9846a;
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // g9.q1
    public final void y1(d3 d3Var) {
        Parcel g22 = g2();
        qh.c(g22, d3Var);
        v2(g22, 1);
    }
}
