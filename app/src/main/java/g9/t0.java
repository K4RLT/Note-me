package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class t0 extends oh implements u0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 0);
    }

    @Override // g9.u0
    public final void e0(String str, String str2) {
        Parcel g22 = g2();
        g22.writeString(str);
        g22.writeString(str2);
        v2(g22, 1);
    }
}
