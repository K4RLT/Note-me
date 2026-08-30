package n9;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public abstract z8.r getSDKVersionInfo();

    public abstract z8.r getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<o> list);

    public void loadAppOpenAd(j jVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(m mVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(r rVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(u uVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(u uVar, e eVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(y yVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(y yVar, e eVar) {
        eVar.z(new z8.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
