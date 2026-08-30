package com.google.android.gms.internal.ads;
import g9.r;
import g9.z2;
import r.e;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ol0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final aq0 f9156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9157b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9158c;

    public ol0(aq0 aq0Var, long j10, long j11) {
        this.f9156a = aq0Var;
        this.f9157b = j10;
        this.f9158c = j11;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Bundle bundle = (Bundle) obj;
        aq0 aq0Var = this.f9156a;
        g9.z2 z2Var = aq0Var.f4581d;
        int i = z2Var.Q;
        Bundle bundle2 = z2Var.f17723w;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", aq0Var.f4583g);
        int i10 = aq0Var.f4591p.f2825v;
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 1) {
                if (i11 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            long j10 = this.f9157b;
            bundle.putLong("start_signals_timestamp", j10);
            if (((Boolean) g9.r.e.f17698c.a(sl.f10690cf)).booleanValue()) {
                bundle.putLong("tsi", j10 - this.f9158c);
            }
            b80.E(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
            b80.u(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            long j11 = z2Var.f17722v;
            String format = simpleDateFormat.format(new Date(j11));
            if (j11 != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.u(bundle, "cust_age", format, z3);
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            int i12 = z2Var.f17724x;
            if (i12 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            b80.z(bundle, "cust_gender", i12, z9);
            List list = z2Var.f17725y;
            if (list != null) {
                bundle.putStringArrayList("kw", new ArrayList<>(list));
            }
            int i13 = z2Var.A;
            if (i13 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            b80.z(bundle, "tag_for_child_directed_treatment", i13, z10);
            if (z2Var.f17726z) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", z2Var.S);
            int i14 = z2Var.f17721u;
            if (i14 >= 2 && z2Var.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            b80.z(bundle, "d_imp_hdr", 1, z11);
            String str = z2Var.C;
            if (i14 >= 2 && !TextUtils.isEmpty(str)) {
                z12 = true;
            } else {
                z12 = false;
            }
            b80.u(bundle, "ppid", str, z12);
            Location location = z2Var.E;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = 1.0E7d * location.getLongitude();
                Bundle bundle3 = new Bundle();
                bundle3.putFloat("radius", accuracy);
                bundle3.putLong("lat", (long) latitude);
                bundle3.putLong("long", (long) longitude);
                bundle3.putLong("time", time);
                bundle.putBundle("uule", bundle3);
            }
            b80.H("url", bundle, z2Var.F);
            List list2 = z2Var.P;
            if (list2 != null) {
                bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
            }
            Bundle bundle4 = z2Var.H;
            if (bundle4 != null) {
                bundle.putBundle("custom_targeting", bundle4);
            }
            List list3 = z2Var.I;
            if (list3 != null) {
                bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
            }
            b80.H("request_agent", bundle, z2Var.J);
            b80.H("request_pkg", bundle, z2Var.K);
            boolean z17 = z2Var.L;
            if (i14 >= 7) {
                z13 = true;
            } else {
                z13 = false;
            }
            b80.E(bundle, "is_designed_for_families", z17, z13);
            if (i14 >= 8) {
                int i15 = z2Var.N;
                if (i15 != -1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                b80.z(bundle, "tag_for_under_age_of_consent", i15, z16);
                b80.H("max_ad_content_rating", bundle, z2Var.O);
            }
            int i16 = z2Var.V;
            if (i16 != -1) {
                z14 = true;
            } else {
                z14 = false;
            }
            b80.z(bundle, "tfat", i16, z14);
            Bundle bundle5 = aq0Var.e;
            bundle.putInt("plcs", bundle5.getInt("plcs"));
            bundle.putInt("plbs", bundle5.getInt("plbs"));
            b80.H("plid", bundle, bundle5.getString("plid"));
            if (aq0Var.f4597v && (z2Var.M != null || z2Var.R != null)) {
                z15 = true;
            } else {
                z15 = false;
            }
            b80.z(bundle, "s2s_rr", 1, z15);
            return;
        }
        throw null;
    }
}
