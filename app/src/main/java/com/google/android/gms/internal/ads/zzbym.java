package com.google.android.gms.internal.ads;
import f9.k;
import fa.y;
import g9.r;
import j9.e;
import k9.f0;
import l9.a;
import l9.i;
import n9.f;
import n9.s;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes.dex */
public final class zzbym implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f13345a;

    /* renamed from: b, reason: collision with root package name */
    public s f13346b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f13347c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        i.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        i.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        i.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        this.f13346b = sVar;
        if (sVar == null) {
            i.f("Listener not set for mediation. Returning.");
            return;
        }
        if (context instanceof Activity) {
            if (!cm.a(context)) {
                i.f("Default browser does not support custom tabs. Bailing out.");
                ((hq0) this.f13346b).b();
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                i.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                ((hq0) this.f13346b).b();
                return;
            }
            this.f13345a = (Activity) context;
            this.f13347c = Uri.parse(string);
            hq0 hq0Var = (hq0) this.f13346b;
            hq0Var.getClass();
            y.d("#008 Must be called on the main UI thread.");
            i.a("Adapter called onAdLoaded.");
            try {
                ((as) hq0Var.f6872v).f();
                return;
            } catch (RemoteException e) {
                i.i(e, "#007 Could not call remote method.");
                return;
            }
        }
        i.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
        ((hq0) this.f13346b).b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        com.google.android.gms.internal.mlkit_vision_digital_ink.iw a10 = new d(7).a();
        ((Intent) a10.f14489v).setData(this.f13347c);
        f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(8, this, new AdOverlayInfoParcel(new e((Intent) a10.f14489v, null), null, new gt(this), null, new a(0, 0, false), null, null, ""), false));
        k kVar = k.C;
        ox oxVar = kVar.f16817h.f9642m;
        oxVar.getClass();
        kVar.f16819k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (oxVar.f9256a) {
            try {
                if (oxVar.f9258c == 3) {
                    if (oxVar.f9257b + ((Long) r.e.f17698c.a(sl.R6)).longValue() <= currentTimeMillis) {
                        oxVar.f9258c = 1;
                    }
                }
            } finally {
            }
        }
        kVar.f16819k.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (oxVar.f9256a) {
            try {
                if (oxVar.f9258c != 2) {
                    return;
                }
                oxVar.f9258c = 3;
                if (oxVar.f9258c == 3) {
                    oxVar.f9257b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
