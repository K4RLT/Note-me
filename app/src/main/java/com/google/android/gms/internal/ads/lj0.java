package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class lj0 implements di0 {
    @Override // com.google.android.gms.internal.ads.di0
    public final ac.b a(wp0 wp0Var, qp0 qp0Var) {
        Bundle bundle;
        Bundle bundle2;
        JSONObject jSONObject = qp0Var.f9962v;
        String optString = jSONObject.optString("pubid", "");
        aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
        zp0 zp0Var = new zp0();
        zp0Var.f13238o.f2825v = aq0Var.f4591p.f2825v;
        g9.z2 z2Var = aq0Var.f4581d;
        zp0Var.f13226a = z2Var;
        zp0Var.f13227b = aq0Var.f4582f;
        zp0Var.f13247x = aq0Var.f4599x;
        String str = aq0Var.f4583g;
        zp0Var.f13228c = str;
        zp0Var.f13229d = aq0Var.f4578a;
        zp0Var.f13230f = aq0Var.f4584h;
        zp0Var.f13231g = aq0Var.i;
        zp0Var.f13232h = aq0Var.f4585j;
        zp0Var.i = aq0Var.f4586k;
        c9.a aVar = aq0Var.f4588m;
        zp0Var.f13233j = aVar;
        if (aVar != null) {
            zp0Var.e = aVar.f4006u;
        }
        c9.d dVar = aq0Var.f4589n;
        zp0Var.f13234k = dVar;
        if (dVar != null) {
            zp0Var.e = dVar.f4013u;
            zp0Var.f13235l = dVar.f4014v;
        }
        zp0Var.f13239p = aq0Var.f4592q;
        zp0Var.f13240q = aq0Var.f4593r;
        zp0Var.f13241r = aq0Var.f4580c;
        zp0Var.f13242s = aq0Var.f4594s;
        zp0Var.f13243t = aq0Var.f4595t;
        zp0Var.f13244u.set(aq0Var.f4596u.get());
        zp0Var.f13246w = aq0Var.f4598w;
        zp0Var.f13228c = optString;
        zp0Var.f13245v = true;
        Bundle bundle3 = z2Var.G;
        if (bundle3 == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(bundle3);
        }
        Bundle bundle4 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle4 == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle4);
        }
        bundle2.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            bundle2.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            bundle2.putString("_ad", optString3);
        }
        bundle2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = qp0Var.D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle2.putString(next, optString4);
            }
        }
        bundle.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        zp0Var.f13226a = new g9.z2(z2Var.f17721u, z2Var.f17722v, bundle2, z2Var.f17724x, z2Var.f17725y, z2Var.f17726z, z2Var.A, z2Var.B, z2Var.C, z2Var.D, z2Var.E, z2Var.F, bundle, z2Var.H, z2Var.I, z2Var.J, z2Var.K, z2Var.L, z2Var.M, z2Var.N, z2Var.O, z2Var.P, z2Var.Q, z2Var.R, z2Var.S, z2Var.T, z2Var.U, z2Var.V);
        zp0Var.f13246w = qp0Var.H0;
        aq0 a10 = zp0Var.a();
        Bundle bundle5 = new Bundle();
        sp0 sp0Var = (sp0) wp0Var.f12313b.f11471w;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(sp0Var.f11090a));
        bundle6.putInt("refresh_interval", sp0Var.f11092c);
        bundle6.putString("gws_query_id", sp0Var.f11091b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", qp0Var.f9964w);
        bundle7.putString("ad_source_name", qp0Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(qp0Var.f9928c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(qp0Var.f9930d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(qp0Var.f9950p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(qp0Var.f9945m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(qp0Var.f9935g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(qp0Var.f9937h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(qp0Var.i));
        bundle7.putString("transaction_id", qp0Var.f9940j);
        bundle7.putString("valid_from_timestamp", qp0Var.f9942k);
        bundle7.putBoolean("is_closable_area_disabled", qp0Var.P);
        bundle7.putString("recursive_server_response_data", qp0Var.f9949o0);
        bundle7.putBoolean("is_analytics_logging_enabled", qp0Var.W);
        qv qvVar = qp0Var.f9944l;
        if (qvVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", qvVar.f9995v);
            bundle8.putString("rb_type", qvVar.f9994u);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a10, bundle5, qp0Var, wp0Var);
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final boolean b(wp0 wp0Var, qp0 qp0Var) {
        if (!TextUtils.isEmpty(qp0Var.f9962v.optString("pubid", ""))) {
            return true;
        }
        return false;
    }

    public abstract hr0 c(aq0 aq0Var, Bundle bundle, qp0 qp0Var, wp0 wp0Var);
}
