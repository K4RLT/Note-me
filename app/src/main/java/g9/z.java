package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public abstract class z extends ph implements a0 {
    public z() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
            qh.f(parcel);
            X0(y1Var);
        } else {
            l();
        }
        parcel2.writeNoException();
        return true;
    }
}
