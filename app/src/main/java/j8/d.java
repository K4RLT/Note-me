package j8;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import n9.t;

/* loaded from: classes.dex */
public final class d implements AdListener, NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final NativeAdBase f19047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19048b;

    public d(e eVar, NativeAdBase nativeAdBase) {
        this.f19048b = eVar;
        this.f19047a = nativeAdBase;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        e eVar = this.f19048b;
        eVar.f19051l.h();
        eVar.f19051l.e();
        eVar.f19051l.b();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [j8.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [j8.c, java.lang.Object] */
    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        boolean z3;
        e eVar = this.f19048b;
        n9.e eVar2 = eVar.f19049j;
        if (ad2 != this.f19047a) {
            z8.a aVar = new z8.a(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.e(FacebookMediationAdapter.TAG, "Ad Loaded is not a Native Ad.");
            eVar2.z(aVar);
            return;
        }
        NativeAdBase nativeAdBase = eVar.f19050k;
        boolean z9 = false;
        if (nativeAdBase.getAdHeadline() != null && nativeAdBase.getAdBodyText() != null && nativeAdBase.getAdIcon() != null && nativeAdBase.getAdCallToAction() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nativeAdBase instanceof NativeBannerAd) {
            z9 = z3;
        } else if (z3 && nativeAdBase.getAdCoverImage() != null && eVar.f19052m != null) {
            z9 = true;
        }
        if (!z9) {
            z8.a aVar2 = new z8.a(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, "Ad from Meta Audience Network doesn't have all required assets.");
            Log.w(str, "Ad from Meta Audience Network doesn't have all required assets.");
            eVar2.z(aVar2);
            return;
        }
        eVar.f21213a = eVar.f19050k.getAdHeadline();
        if (eVar.f19050k.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(Uri.parse(eVar.f19050k.getAdCoverImage().getUrl())));
            eVar.f21214b = arrayList;
        }
        eVar.f21215c = eVar.f19050k.getAdBodyText();
        Drawable preloadedIconViewDrawable = eVar.f19050k.getPreloadedIconViewDrawable();
        NativeAdBase nativeAdBase2 = eVar.f19050k;
        if (preloadedIconViewDrawable == null) {
            if (nativeAdBase2.getAdIcon() == null) {
                eVar.f21216d = new Object();
            } else {
                eVar.f21216d = new c(Uri.parse(eVar.f19050k.getAdIcon().getUrl()));
            }
        } else {
            Drawable preloadedIconViewDrawable2 = nativeAdBase2.getPreloadedIconViewDrawable();
            Object obj = new Object();
            obj.f19045a = preloadedIconViewDrawable2;
            eVar.f21216d = obj;
        }
        eVar.e = eVar.f19050k.getAdCallToAction();
        eVar.f21217f = eVar.f19050k.getAdvertiserName();
        eVar.f19052m.setListener(new ic.c(2, eVar));
        eVar.f21218g = eVar.f19052m;
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, eVar.f19050k.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, eVar.f19050k.getAdSocialContext());
        eVar.f21219h = bundle;
        eVar.f19051l = (t) eVar2.d(eVar);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        z8.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31970b);
        this.f19048b.f19049j.z(adError2);
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
        Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }
}