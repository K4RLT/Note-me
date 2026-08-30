package c2;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.media.RouteDiscoveryPreference;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.y51;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z1 {
    public static /* synthetic */ void B() {
    }

    public static /* bridge */ /* synthetic */ int b(TelephonyDisplayInfo telephonyDisplayInfo) {
        return telephonyDisplayInfo.getOverrideNetworkType();
    }

    public static /* bridge */ /* synthetic */ BlobHandle e(Object obj) {
        return (BlobHandle) obj;
    }

    public static /* bridge */ /* synthetic */ BlobStoreManager g(Object obj) {
        return (BlobStoreManager) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder j(y51 y51Var) {
        return new RouteDiscoveryPreference.Builder(y51Var, false);
    }
}
