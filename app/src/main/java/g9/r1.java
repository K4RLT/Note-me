package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class r1 extends oh implements s1 {
    public r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 0);
    }

    @Override // g9.s1
    public final void E1(String str, oa.a aVar, oa.a aVar2) {
        Parcel g22 = g2();
        g22.writeString(str);
        qh.e(g22, aVar);
        qh.e(g22, aVar2);
        v2(g22, 1);
    }
}
