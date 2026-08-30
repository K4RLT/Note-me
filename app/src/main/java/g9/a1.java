package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.vr;

/* loaded from: classes.dex */
public final class a1 extends oh implements c1 {
    @Override // g9.c1
    public final vr getAdapterCreator() {
        Parcel u22 = u2(g2(), 2);
        vr v4 = tr.v4(u22.readStrongBinder());
        u22.recycle();
        return v4;
    }

    @Override // g9.c1
    public final l2 getLiteSdkVersion() {
        Parcel u22 = u2(g2(), 1);
        l2 l2Var = (l2) qh.b(u22, l2.CREATOR);
        u22.recycle();
        return l2Var;
    }
}
