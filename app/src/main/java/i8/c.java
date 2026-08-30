package i8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.e;
import n9.w;
import n9.x;
import n9.y;

/* loaded from: classes.dex */
public class c implements w, RewardedVideoAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final e f18349a;

    /* renamed from: b, reason: collision with root package name */
    public RewardedVideoAd f18350b;

    /* renamed from: d, reason: collision with root package name */
    public x f18352d;

    /* renamed from: f, reason: collision with root package name */
    public final eb.w f18353f;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18351c = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    public c(e eVar, eb.w wVar) {
        this.f18349a = eVar;
        this.f18353f = wVar;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public final void b(y yVar) {
        Context context = yVar.f21207c;
        String str = yVar.f21209f;
        String placementId = FacebookMediationAdapter.getPlacementId(yVar.f21206b);
        if (TextUtils.isEmpty(placementId)) {
            z8.a aVar = new z8.a(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.e(FacebookMediationAdapter.TAG, "Failed to request ad. PlacementID is null or empty.");
            this.f18349a.z(aVar);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(yVar);
        this.f18353f.getClass();
        this.f18350b = new RewardedVideoAd(context, placementId);
        if (!TextUtils.isEmpty(str)) {
            this.f18350b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        RewardedVideoAd rewardedVideoAd = this.f18350b;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(yVar.f21205a).withAdExperience(a()).build());
    }

    public final void c(Context context) {
        this.f18351c.set(true);
        if (!this.f18350b.show()) {
            z8.a aVar = new z8.a(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.w(FacebookMediationAdapter.TAG, "Failed to present rewarded ad.");
            x xVar = this.f18352d;
            if (xVar != null) {
                xVar.a(aVar);
            }
            this.f18350b.destroy();
            return;
        }
        x xVar2 = this.f18352d;
        if (xVar2 != null) {
            xVar2.f();
            this.f18352d.e();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        x xVar = this.f18352d;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        e eVar = this.f18349a;
        if (eVar != null) {
            this.f18352d = (x) eVar.d(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        z8.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31970b);
        if (this.f18351c.get()) {
            x xVar = this.f18352d;
            if (xVar != null) {
                xVar.a(adError2);
            }
        } else {
            e eVar = this.f18349a;
            if (eVar != null) {
                eVar.z(adError2);
            }
        }
        this.f18350b.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        x xVar = this.f18352d;
        if (xVar != null) {
            xVar.g();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        x xVar;
        if (!this.e.getAndSet(true) && (xVar = this.f18352d) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f18350b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        x xVar;
        if (!this.e.getAndSet(true) && (xVar = this.f18352d) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f18350b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f18352d.c();
        this.f18352d.d();
    }
}
