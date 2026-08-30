package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
public final class q0 extends oh implements r0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 0);
    }

    @Override // g9.r0
    public final void O(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 18);
    }

    @Override // g9.r0
    public final void m1(tr trVar) {
        Parcel g22 = g2();
        qh.e(g22, trVar);
        v2(g22, 8);
    }
}
