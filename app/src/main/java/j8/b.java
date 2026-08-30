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
import n9.p;
import n9.q;

/* loaded from: classes.dex */
public final class b implements p, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final n9.e f19040a;

    /* renamed from: b, reason: collision with root package name */
    public InterstitialAd f19041b;

    /* renamed from: c, reason: collision with root package name */
    public q f19042c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19043d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final w f19044f;

    public b(n9.e eVar, w wVar) {
        this.f19040a = eVar;
        this.f19044f = wVar;
    }

    public final void a(Context context) {
        this.f19043d.set(true);
        if (!this.f19041b.show()) {
            z8.a aVar = new z8.a(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.w(FacebookMediationAdapter.TAG, aVar.toString());
            q qVar = this.f19042c;
            if (qVar != null) {
                qVar.a(aVar);
            }
            this.f19041b.destroy();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        q qVar = this.f19042c;
        if (qVar != null) {
            qVar.h();
            this.f19042c.b();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f19042c = (q) this.f19040a.d(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        z8.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31970b);
        if (this.f19043d.get()) {
            q qVar = this.f19042c;
            if (qVar != null) {
                qVar.a(adError2);
            }
        } else {
            this.f19040a.z(adError2);
        }
        this.f19041b.destroy();
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        q qVar;
        if (!this.e.getAndSet(true) && (qVar = this.f19042c) != null) {
            qVar.onAdClosed();
        }
        InterstitialAd interstitialAd = this.f19041b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        q qVar;
        if (!this.e.getAndSet(true) && (qVar = this.f19042c) != null) {
            qVar.onAdClosed();
        }
        InterstitialAd interstitialAd = this.f19041b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        q qVar = this.f19042c;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        q qVar = this.f19042c;
        if (qVar != null) {
            qVar.g();
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
