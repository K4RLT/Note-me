package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public abstract class m1 extends ph implements n1 {
    public m1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
            qh.f(parcel);
            n4(y1Var);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
