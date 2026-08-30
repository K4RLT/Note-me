package j8;

import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eb.w;
import n9.k;
import n9.l;

/* loaded from: classes.dex */
public final class a implements k, AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final n9.e f19036a;

    /* renamed from: b, reason: collision with root package name */
    public AdView f19037b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f19038c;

    /* renamed from: d, reason: collision with root package name */
    public l f19039d;

    public a(n9.e eVar, w wVar) {
        this.f19036a = eVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        l lVar = this.f19039d;
        if (lVar != null) {
            lVar.h();
            this.f19039d.e();
            this.f19039d.b();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f19039d = (l) this.f19036a.d(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        z8.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31970b);
        this.f19036a.z(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        l lVar = this.f19039d;
        if (lVar != null) {
            lVar.g();
        }
    }
}
