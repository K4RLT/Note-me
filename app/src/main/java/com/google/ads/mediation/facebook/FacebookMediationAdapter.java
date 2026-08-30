package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.bt;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.tf;
import eb.w;
import g9.i2;
import g9.p;
import i8.c;
import j8.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l9.i;
import n9.d;
import n9.e;
import n9.j;
import n9.m;
import n9.o;
import n9.u;
import n9.y;
import p9.b;
import z8.a;
import z8.r;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    /* renamed from: a, reason: collision with root package name */
    public final w f4208a = new w(24);

    public static a getAdError(AdError adError) {
        return new a(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads", null);
    }

    public static String getPlacementId(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        if (string == null) {
            return bundle.getString("pubid");
        }
        return string;
    }

    public static void setMixedAudience(d dVar) {
        r rVar;
        int i;
        int i10;
        i2.d();
        String[] split = TextUtils.split("25.4.0", "\\.");
        if (split.length != 3) {
            rVar = new r(0, 0, 0);
        } else {
            try {
                rVar = new r(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } catch (NumberFormatException unused) {
                rVar = new r(0, 0, 0);
            }
        }
        int i11 = rVar.f32000a;
        if (i11 > 1 || (i11 == 1 && ((i10 = rVar.f32001b) > 2 || (i10 == 2 && rVar.f32002c >= 0)))) {
            i2.d().f17659j.getClass();
        }
        int i12 = dVar.f21208d;
        if (i12 != 1 && (i = dVar.e) != 1) {
            if (i12 == 0 || i == 0) {
                AdSettings.setMixedAudience(false);
                return;
            }
            return;
        }
        AdSettings.setMixedAudience(true);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(p9.a aVar, b bVar) {
        String bidderToken = BidderTokenProvider.getBidderToken(aVar.f22620a);
        tf tfVar = (tf) bVar;
        tfVar.getClass();
        try {
            ((bt) tfVar.f11339v).G(bidderToken);
        } catch (RemoteException e) {
            i.d("", e);
        }
    }

    @Override // n9.a
    public r getSDKVersionInfo() {
        String[] split = "6.22.0".split("\\.");
        if (split.length >= 3) {
            return new r(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, "Unexpected SDK version format: 6.22.0.Returning 0.0.0 for SDK version.");
        return new r(0, 0, 0);
    }

    @Override // n9.a
    public r getVersionInfo() {
        String[] split = "6.22.0.0".split("\\.");
        if (split.length >= 4) {
            return new r(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, "Unexpected adapter version format: 6.22.0.0.Returning 0.0.0 for adapter version.");
        return new r(0, 0, 0);
    }

    @Override // n9.a
    public void initialize(Context context, n9.b bVar, List<o> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<o> it = list.iterator();
        while (it.hasNext()) {
            String placementId = getPlacementId(it.next().f21211a);
            if (!TextUtils.isEmpty(placementId)) {
                arrayList.add(placementId);
            }
        }
        if (i8.a.f18344d == null) {
            i8.a.f18344d = new i8.a();
        }
        i8.a aVar = i8.a.f18344d;
        i8.b bVar2 = new i8.b(bVar);
        if (aVar.f18345a) {
            aVar.f18347c.add(bVar2);
            return;
        }
        if (aVar.f18346b) {
            lx0 lx0Var = (lx0) bVar;
            lx0Var.getClass();
            try {
                ((gq) lx0Var.f8177v).a();
                return;
            } catch (RemoteException e) {
                i.d("", e);
                return;
            }
        }
        aVar.f18345a = true;
        if (aVar == null) {
            i8.a.f18344d = new i8.a();
        }
        i8.a.f18344d.f18347c.add(bVar2);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.22.0.0").withPlacementIds(arrayList).withInitListener(aVar).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(j jVar, e eVar) {
        InterstitialAd.InterstitialAdLoadConfigBuilder withBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener;
        InterstitialAd interstitialAd;
        f fVar = new f(eVar, this.f4208a);
        jVar.getClass();
        String str = jVar.f21209f;
        String placementId = getPlacementId(jVar.f21206b);
        InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig = null;
        if (TextUtils.isEmpty(placementId)) {
            a aVar = new a(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty. ");
            eVar.z(aVar);
            return;
        }
        setMixedAudience(jVar);
        fVar.f19056b = new InterstitialAd(jVar.f21207c, placementId);
        if (!TextUtils.isEmpty(str) && (interstitialAd = fVar.f19056b) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        InterstitialAd interstitialAd2 = fVar.f19056b;
        if (interstitialAd2 != null) {
            InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd2.buildLoadAdConfig();
            if (buildLoadAdConfig != null && (withBid = buildLoadAdConfig.withBid(jVar.f21205a)) != null && (withAdListener = withBid.withAdListener(fVar)) != null) {
                interstitialLoadAdConfig = withAdListener.build();
            }
            interstitialAd2.loadAd(interstitialLoadAdConfig);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(m mVar, e eVar) {
        w wVar = this.f4208a;
        j8.a aVar = new j8.a(eVar, wVar);
        Bundle bundle = mVar.f21206b;
        String str = mVar.f21209f;
        String str2 = mVar.f21205a;
        Context context = mVar.f21207c;
        String placementId = getPlacementId(bundle);
        if (TextUtils.isEmpty(placementId)) {
            a aVar2 = new a(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty.");
            eVar.z(aVar2);
            return;
        }
        setMixedAudience(mVar);
        try {
            wVar.getClass();
            aVar.f19037b = new AdView(context, placementId, str2);
            if (!TextUtils.isEmpty(str)) {
                aVar.f19037b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
            }
            int i = mVar.f21210g.f31986a;
            int i10 = -1;
            if (i != -3) {
                if (i != -1) {
                    l9.d dVar = p.f17688g.f17689a;
                    i10 = l9.d.b(context, i);
                } else {
                    i10 = context.getResources().getDisplayMetrics().widthPixels;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, -2);
            aVar.f19038c = new FrameLayout(context);
            aVar.f19037b.setLayoutParams(layoutParams);
            aVar.f19038c.addView(aVar.f19037b);
            AdView adView = aVar.f19037b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(aVar).withBid(str2).build());
        } catch (Exception e) {
            String str3 = "Failed to create banner ad: " + e.getMessage();
            a aVar3 = new a(ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, str3, ERROR_DOMAIN, null);
            Log.e(TAG, str3);
            eVar.z(aVar3);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(n9.r rVar, e eVar) {
        j8.b bVar = new j8.b(eVar, this.f4208a);
        Bundle bundle = rVar.f21206b;
        String str = rVar.f21209f;
        String placementId = getPlacementId(bundle);
        if (TextUtils.isEmpty(placementId)) {
            a aVar = new a(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty. ");
            bVar.f19040a.z(aVar);
            return;
        }
        setMixedAudience(rVar);
        Context context = rVar.f21207c;
        bVar.f19044f.getClass();
        bVar.f19041b = new InterstitialAd(context, placementId);
        if (!TextUtils.isEmpty(str)) {
            bVar.f19041b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        InterstitialAd interstitialAd = bVar.f19041b;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(rVar.f21205a).withAdListener(bVar).build());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(u uVar, e eVar) {
        j8.e eVar2 = new j8.e(eVar, this.f4208a);
        Bundle bundle = uVar.f21206b;
        String str = uVar.f21209f;
        String str2 = uVar.f21205a;
        Context context = uVar.f21207c;
        String placementId = getPlacementId(bundle);
        boolean isEmpty = TextUtils.isEmpty(placementId);
        e eVar3 = eVar2.f19049j;
        if (isEmpty) {
            a aVar = new a(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN, null);
            Log.e(TAG, "Failed to request ad. PlacementID is null or empty.");
            eVar3.z(aVar);
            return;
        }
        setMixedAudience(uVar);
        eVar2.f19054o.getClass();
        eVar2.f19052m = new MediaView(context);
        try {
            eVar2.f19050k = NativeAdBase.fromBidPayload(context, placementId, str2);
            if (!TextUtils.isEmpty(str)) {
                eVar2.f19050k.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
            }
            eVar2.f19053n = rn.a(uVar.f21212g);
            NativeAdBase nativeAdBase = eVar2.f19050k;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new j8.d(eVar2, eVar2.f19050k)).withBid(str2).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            String str3 = "Failed to create native ad from bid payload: " + e.getMessage();
            a aVar2 = new a(ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, str3, ERROR_DOMAIN, null);
            Log.w(TAG, str3);
            eVar3.z(aVar2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(y yVar, e eVar) {
        new c(eVar, this.f4208a).b(yVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(y yVar, e eVar) {
        new c(eVar, this.f4208a).b(yVar);
    }
}
