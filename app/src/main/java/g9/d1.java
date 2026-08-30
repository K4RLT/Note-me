package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.iq;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.vr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 extends oh implements f1 {
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 0);
    }

    @Override // g9.f1
    public final void D2(vr vrVar) {
        Parcel g22 = g2();
        qh.e(g22, vrVar);
        v2(g22, 11);
    }

    @Override // g9.f1
    public final void E3(u2 u2Var) {
        Parcel g22 = g2();
        qh.c(g22, u2Var);
        v2(g22, 14);
    }

    @Override // g9.f1
    public final void R1() {
        v2(g2(), 19);
    }

    @Override // g9.f1
    public final void T(String str) {
        Parcel g22 = g2();
        g22.writeString(str);
        v2(g22, 18);
    }

    @Override // g9.f1
    public final void W1(oa.a aVar, String str) {
        Parcel g22 = g2();
        g22.writeString(null);
        qh.e(g22, aVar);
        v2(g22, 6);
    }

    @Override // g9.f1
    public final void a() {
        v2(g2(), 1);
    }

    @Override // g9.f1
    public final List j() {
        Parcel u22 = u2(g2(), 13);
        ArrayList createTypedArrayList = u22.createTypedArrayList(eq.CREATOR);
        u22.recycle();
        return createTypedArrayList;
    }

    @Override // g9.f1
    public final void t4(iq iqVar) {
        Parcel g22 = g2();
        qh.e(g22, iqVar);
        v2(g22, 12);
    }
}
