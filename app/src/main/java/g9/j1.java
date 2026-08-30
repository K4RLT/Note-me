package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class j1 extends oh implements k1 {
    @Override // g9.k1
    public final String a() {
        Parcel u22 = u2(g2(), 1);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // g9.k1
    public final String b() {
        Parcel u22 = u2(g2(), 2);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }
}
