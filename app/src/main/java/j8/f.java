package j8;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eb.w;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.h;
import n9.i;

/* loaded from: classes.dex */
public final class f implements h, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final n9.e f19055a;

    /* renamed from: b, reason: collision with root package name */
    public InterstitialAd f19056b;

    /* renamed from: c, reason: collision with root package name */
    public i f19057c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19058d;
    public final AtomicBoolean e;

    public f(n9.e eVar, w wVar) {
        eVar.getClass();
        wVar.getClass();
        this.f19055a = eVar;
        this.f19058d = new AtomicBoolean();
        this.e = new AtomicBoolean();
    }

    public final void a(Context context) {
        context.getClass();
        this.f19058d.set(true);
        InterstitialAd interstitialAd = this.f19056b;
        if (interstitialAd != null && !interstitialAd.show()) {
            z8.a aVar = new z8.a(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.w(FacebookMediationAdapter.TAG, aVar.toString());
            i iVar = this.f19057c;
            if (iVar != null) {
                iVar.a(aVar);
            }
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        ad2.getClass();
        i iVar = this.f19057c;
        if (iVar != null) {
            iVar.h();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        ad2.getClass();
        this.f19057c = (i) this.f19055a.d(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        ad2.getClass();
        adError.getClass();
        z8.a adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getClass();
        Log.w(FacebookMediationAdapter.TAG, adError2.f31970b);
        if (this.f19058d.get()) {
            i iVar = this.f19057c;
            if (iVar != null) {
                iVar.a(adError2);
                return;
            }
            return;
        }
        this.f19055a.z(adError2);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        i iVar;
        if (!this.e.getAndSet(true) && (iVar = this.f19057c) != null) {
            iVar.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        i iVar;
        ad2.getClass();
        if (!this.e.getAndSet(true) && (iVar = this.f19057c) != null) {
            iVar.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        ad2.getClass();
        i iVar = this.f19057c;
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        ad2.getClass();
        i iVar = this.f19057c;
        if (iVar != null) {
            iVar.g();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
