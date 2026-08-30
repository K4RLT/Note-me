package mb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class k extends oh {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback", 3);
    }

    public final void u4(Bundle bundle) {
        Parcel R = R();
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        r0(R, 3);
    }
}
