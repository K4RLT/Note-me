package com.google.android.gms.internal.ads;
import g9.a;
import g9.b;
import g9.c;
import g9.d;
import g9.d3;
import g9.h;
import ic.c;
import l9.g;
import l9.h;
import wa.g9;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qp0 {
    public final nw A;
    public final AbstractCollection A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final y51 C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final Bundle F0;
    public final String G;
    public final boolean G0;
    public final String H;
    public final JSONArray H0;
    public final String I;
    public final int I0;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final jk0 V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;

    /* renamed from: a, reason: collision with root package name */
    public final List f9924a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f9925a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f9926b;

    /* renamed from: b0, reason: collision with root package name */
    public final String f9927b0;

    /* renamed from: c, reason: collision with root package name */
    public final List f9928c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f9929c0;

    /* renamed from: d, reason: collision with root package name */
    public final List f9930d;

    /* renamed from: d0, reason: collision with root package name */
    public final du f9931d0;
    public final int e;

    /* renamed from: e0, reason: collision with root package name */
    public final g9.d3 f9932e0;

    /* renamed from: f, reason: collision with root package name */
    public final List f9933f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f9934f0;

    /* renamed from: g, reason: collision with root package name */
    public final List f9935g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f9936g0;

    /* renamed from: h, reason: collision with root package name */
    public final List f9937h;

    /* renamed from: h0, reason: collision with root package name */
    public final JSONObject f9938h0;
    public final List i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f9939i0;

    /* renamed from: j, reason: collision with root package name */
    public final String f9940j;

    /* renamed from: j0, reason: collision with root package name */
    public final JSONObject f9941j0;

    /* renamed from: k, reason: collision with root package name */
    public final String f9942k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f9943k0;

    /* renamed from: l, reason: collision with root package name */
    public final qv f9944l;
    public final String l0;

    /* renamed from: m, reason: collision with root package name */
    public final List f9945m;
    public final boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public final List f9946n;

    /* renamed from: n0, reason: collision with root package name */
    public final String f9947n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f9948o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f9949o0;

    /* renamed from: p, reason: collision with root package name */
    public final List f9950p;

    /* renamed from: p0, reason: collision with root package name */
    public final String f9951p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f9952q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f9953q0;

    /* renamed from: r, reason: collision with root package name */
    public final List f9954r;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f9955r0;

    /* renamed from: s, reason: collision with root package name */
    public final up0 f9956s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f9957s0;

    /* renamed from: t, reason: collision with root package name */
    public final List f9958t;

    /* renamed from: t0, reason: collision with root package name */
    public final String f9959t0;

    /* renamed from: u, reason: collision with root package name */
    public final List f9960u;

    /* renamed from: u0, reason: collision with root package name */
    public final AbstractCollection f9961u0;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f9962v;

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f9963v0;

    /* renamed from: w, reason: collision with root package name */
    public final String f9964w;

    /* renamed from: w0, reason: collision with root package name */
    public final HashMap f9965w0;

    /* renamed from: x, reason: collision with root package name */
    public final String f9966x;

    /* renamed from: x0, reason: collision with root package name */
    public final ic.c f9967x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f9968y;

    /* renamed from: y0, reason: collision with root package name */
    public final l9.g f9969y0;

    /* renamed from: z, reason: collision with root package name */
    public final String f9970z;

    /* renamed from: z0, reason: collision with root package name */
    public final double f9971z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x00fb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v81, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.ArrayList] */
    public qp0(JsonReader jsonReader) {
        String str;
        List list;
        List list2;
        List list3;
        List list4;
        String str2;
        l9.h hVar;
        List list5;
        List list6;
        ne0 ne0Var;
        List list7 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        HashMap hashMap = new HashMap();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        String str3 = "";
        List list8 = list7;
        List list9 = list8;
        List list10 = list9;
        List list11 = list10;
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        JSONObject jSONObject12 = jSONObject6;
        y51 y51Var2 = y51Var;
        y51 y51Var3 = y51Var2;
        y51 y51Var4 = y51Var3;
        HashMap hashMap2 = hashMap;
        Bundle bundle2 = bundle;
        String str4 = "";
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        String str21 = str20;
        String str22 = str21;
        String str23 = str22;
        double d2 = 0.0d;
        int i = 0;
        int i10 = 0;
        qv qvVar = null;
        int i11 = 0;
        up0 up0Var = null;
        nw nwVar = null;
        boolean z3 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = -1;
        int i13 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i14 = 0;
        int i15 = -1;
        boolean z18 = false;
        du duVar = null;
        g9.d3 d3Var = null;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        String str24 = null;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        int i16 = 0;
        boolean z26 = false;
        ic.c cVar = null;
        l9.g gVar = null;
        int i17 = 2;
        boolean z27 = false;
        boolean z28 = false;
        int i18 = -1;
        boolean z29 = true;
        JSONArray jSONArray = null;
        List list12 = list11;
        List list13 = list12;
        List list14 = list13;
        List list15 = list14;
        List list16 = list15;
        List list17 = list16;
        List list18 = list17;
        List list19 = list18;
        List list20 = list19;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName == null) {
                str = str3;
            } else {
                str = nextName;
            }
            int hashCode = str.hashCode();
            String str25 = FacebookMediationAdapter.KEY_ID;
            switch (hashCode) {
                case -2138196627:
                    String str26 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str26.equals("ad_source_instance_name")) {
                        str18 = jsonReader.nextString();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1980587809:
                    String str27 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str27.equals("debug_signals")) {
                        jSONObject8 = wa.g9.c(jsonReader);
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1965512151:
                    String str28 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str28.equals("omid_settings")) {
                        jSONObject10 = wa.g9.c(jsonReader);
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1964744830:
                    String str29 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str29.equals("offline_ad_config")) {
                        if (((Boolean) sl.M9.d()).booleanValue()) {
                            JSONObject c10 = wa.g9.c(jsonReader);
                            gVar = new l9.g(c10.optInt("impression_prerequisite", 0), c10.optInt("click_prerequisite", 0), c10.optBoolean("notification_flow_enabled", false));
                        } else {
                            jsonReader.skipValue();
                        }
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1871425831:
                    String str30 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str30.equals("recursive_server_response_data")) {
                        str21 = jsonReader.nextString();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1843156475:
                    String str31 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str31.equals("is_consent")) {
                        z25 = jsonReader.nextBoolean();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1840512279:
                    String str32 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    if (str32.equals("presentation_urls")) {
                        y51Var3 = wa.g9.b(jsonReader);
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1828733410:
                    String str33 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str33.equals("network_ping_config")) {
                        if (((Boolean) sl.K9.d()).booleanValue()) {
                            JSONObject optJSONObject = wa.g9.c(jsonReader).optJSONObject("ping_strategy");
                            if (optJSONObject == null) {
                                hVar = new l9.h(1, 0, 1.0d, false);
                                str2 = str3;
                            } else {
                                str2 = str3;
                                hVar = new l9.h(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false));
                            }
                            cVar = new ic.c(10, hVar);
                            list20 = list;
                            list19 = list4;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        } else {
                            str2 = str3;
                            jsonReader.skipValue();
                            list20 = list;
                            list19 = list4;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        }
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1812055556:
                    String str34 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str34.equals("play_prewarm_options")) {
                        JSONObject c11 = wa.g9.c(jsonReader);
                        du duVar2 = new du(c11.optBoolean("enable_prewarming", false), c11.optString("prefetch_url", str3), c11.optBoolean("skip_offline_notification_flow", false), c11.optBoolean("enable_hsdp_service", false), c11.optString("target_package", str3), c11.optInt("hsdp_invocation_callback_bitmask", 0), c11.optString("referrer", str3), c11.optString("extra_query_params", "{}"));
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        duVar = duVar2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1785028569:
                    String str35 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str35.equals("parallel_key")) {
                        str23 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1776946669:
                    String str36 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str36.equals("ad_source_name")) {
                        str16 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1662989631:
                    String str37 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str37.equals("is_interscroller")) {
                        z19 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1620552059:
                    String str38 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str38.equals("preload_sort_type")) {
                        int nextInt = jsonReader.nextInt();
                        int[] iArr = {1, 2, 3};
                        int i19 = 0;
                        while (true) {
                            if (i19 < 3) {
                                int i20 = iArr[i19];
                                int i21 = i20 - 1;
                                if (i20 != 0) {
                                    if (i21 == nextInt) {
                                        i17 = i20;
                                    } else {
                                        i19++;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                i17 = 2;
                            }
                        }
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    } else {
                        str2 = str3;
                        jsonReader.skipValue();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                case -1620470467:
                    String str39 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str39.equals("backend_query_id")) {
                        str13 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1550155393:
                    String str40 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str40.equals("nofill_urls")) {
                        list19 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1440104884:
                    String str41 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str41.equals("is_custom_close_blocked")) {
                        z13 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1439500848:
                    String str42 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str42.equals("orientation")) {
                        String nextString = jsonReader.nextString();
                        if ("landscape".equalsIgnoreCase(nextString)) {
                            i12 = 6;
                        } else if ("portrait".equalsIgnoreCase(nextString)) {
                            i12 = 7;
                        } else {
                            i12 = -1;
                        }
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1428969291:
                    String str43 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str43.equals("enable_omid")) {
                        z15 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1406227629:
                    String str44 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str44.equals("buffer_click_url_as_ready_to_ping")) {
                        z23 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1403779768:
                    String str45 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str45.equals("showable_impression_type")) {
                        i14 = jsonReader.nextInt();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1375413093:
                    String str46 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str46.equals("ad_cover")) {
                        jSONObject11 = wa.g9.c(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1360811658:
                    String str47 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str47.equals("ad_sizes")) {
                        list11 = rp0.a(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1306015996:
                    String str48 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str48.equals("adapters")) {
                        list10 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1303332046:
                    String str49 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str49.equals("test_mode_enabled")) {
                        z12 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1289032093:
                    String str50 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str50.equals("extras")) {
                        jSONObject9 = wa.g9.c(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1240082064:
                    String str51 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str51.equals("ad_event_value")) {
                        JSONObject c12 = wa.g9.c(jsonReader);
                        g9.d3 d3Var2 = new g9.d3(c12.getInt("type_num"), c12.getInt("precision_num"), c12.getLong("value"), c12.getString("currency"));
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        d3Var = d3Var2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1234181075:
                    String str52 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str52.equals("allow_pub_rendered_attribution")) {
                        z3 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1168140544:
                    String str53 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str53.equals("presentation_error_urls")) {
                        list20 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1152230954:
                    String str54 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str54.equals("ad_type")) {
                        String nextString2 = jsonReader.nextString();
                        if ("banner".equals(nextString2)) {
                            i = 1;
                        } else if ("interstitial".equals(nextString2)) {
                            i = 2;
                        } else if ("native_express".equals(nextString2)) {
                            i = 3;
                        } else if ("native".equals(nextString2)) {
                            i = 4;
                        } else if ("rewarded".equals(nextString2)) {
                            i = 5;
                        } else if ("app_open_ad".equals(nextString2)) {
                            i = 6;
                        } else if ("rewarded_interstitial".equals(nextString2)) {
                            i = 7;
                        } else {
                            i = 0;
                        }
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1146534047:
                    String str55 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str55.equals("is_scroll_aware")) {
                        z17 = jsonReader.nextBoolean();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1115838944:
                    String str56 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str56.equals("fill_urls")) {
                        list3 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1081936678:
                    String str57 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str57.equals("allocation_id")) {
                        str6 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1078050970:
                    String str58 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str58.equals("video_complete_urls")) {
                        list17 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -1051269058:
                    String str59 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str59.equals("active_view")) {
                        str9 = wa.g9.c(jsonReader).toString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -982608540:
                    String str60 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str60.equals("valid_from_timestamp")) {
                        str5 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -972056451:
                    String str61 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str61.equals("ad_source_instance_id")) {
                        str19 = jsonReader.nextString();
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -776859333:
                    String str62 = str;
                    list = list20;
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    if (str62.equals("click_urls")) {
                        list12 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -652881372:
                    String str63 = str;
                    list = list20;
                    JsonReader jsonReader2 = jsonReader;
                    if (str63.equals("on_device_storage_configs")) {
                        if (((Boolean) sl.H8.d()).booleanValue()) {
                            b51 b51Var2 = d51.f5314v;
                            String str64 = "initialCapacity";
                            ed1.u(4, "initialCapacity");
                            Object[] objArr = new Object[4];
                            jsonReader2.beginArray();
                            int i22 = 0;
                            while (jsonReader2.hasNext()) {
                                y51 y51Var5 = y51.f12781y;
                                jsonReader2.beginObject();
                                y51 y51Var6 = y51Var5;
                                Long l10 = null;
                                while (jsonReader2.hasNext()) {
                                    String nextName2 = jsonReader2.nextName();
                                    if (Objects.equals(nextName2, str25)) {
                                        l10 = Long.valueOf(jsonReader2.nextLong());
                                    } else {
                                        if (Objects.equals(nextName2, "event_types")) {
                                            ed1.u(4, str64);
                                            Object[] objArr2 = new Object[4];
                                            jsonReader.beginArray();
                                            int i23 = 0;
                                            while (jsonReader.hasNext()) {
                                                Integer valueOf = Integer.valueOf(jsonReader.nextInt());
                                                String str65 = str64;
                                                int length = objArr2.length;
                                                String str66 = str25;
                                                int i24 = i23 + 1;
                                                List list21 = list19;
                                                int d10 = y41.d(length, i24);
                                                if (d10 > length) {
                                                    objArr2 = Arrays.copyOf(objArr2, d10);
                                                }
                                                objArr2[i23] = valueOf;
                                                i23 = i24;
                                                str64 = str65;
                                                str25 = str66;
                                                list19 = list21;
                                            }
                                            jsonReader.endArray();
                                            y51Var6 = d51.w(objArr2, i23);
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                        jsonReader2 = jsonReader;
                                    }
                                }
                                List list22 = list19;
                                String str67 = str64;
                                String str68 = str25;
                                jsonReader.endObject();
                                if (l10 == null || y51Var6.isEmpty()) {
                                    list5 = list17;
                                    list6 = list18;
                                    ne0Var = null;
                                } else {
                                    long longValue = l10.longValue();
                                    y51 y51Var7 = y51Var6;
                                    int i25 = y51Var7.f12783x;
                                    list6 = list18;
                                    int[] iArr2 = new int[i25];
                                    list5 = list17;
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        iArr2[i26] = ((Integer) y51Var7.get(i26)).intValue();
                                    }
                                    ne0Var = new ne0(longValue, iArr2);
                                }
                                if (ne0Var != null) {
                                    int length2 = objArr.length;
                                    int i27 = i22;
                                    int i28 = i27 + 1;
                                    int d11 = y41.d(length2, i28);
                                    objArr = d11 > length2 ? Arrays.copyOf(objArr, d11) : objArr;
                                    objArr[i27] = ne0Var;
                                    jsonReader2 = jsonReader;
                                    i22 = i28;
                                } else {
                                    jsonReader2 = jsonReader;
                                }
                                str64 = str67;
                                str25 = str68;
                                list19 = list22;
                                list18 = list6;
                                list17 = list5;
                            }
                            list2 = list17;
                            list3 = list18;
                            jsonReader.endArray();
                            y51Var4 = d51.w(objArr, i22);
                            str2 = str3;
                            list20 = list;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        } else {
                            list2 = list17;
                            list3 = list18;
                            list4 = list19;
                            jsonReader.skipValue();
                            str2 = str3;
                            list20 = list;
                            list19 = list4;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        }
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                    break;
                case -570101180:
                    String str69 = str;
                    list = list20;
                    if (str69.equals("late_load_urls")) {
                        list3 = list18;
                        y51Var2 = wa.g9.b(jsonReader);
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -544216775:
                    String str70 = str;
                    list = list20;
                    if (str70.equals("safe_browsing")) {
                        JSONObject c13 = wa.g9.c(jsonReader);
                        nw nwVar2 = new nw(c13.optString("click_string", str3), c13.optString("report_url", str3), c13.optBoolean("rendered_ad_enabled", false), c13.optBoolean("non_malicious_reporting_enabled", false), wa.g9.a(c13.optJSONArray("allowed_headers"), null), c13.optBoolean("protection_enabled", false), c13.optBoolean("malicious_reporting_enabled", false), wa.g9.a(c13.optJSONArray("webview_permissions"), null));
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        nwVar = nwVar2;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -437057161:
                    String str71 = str;
                    list = list20;
                    if (str71.equals("imp_urls")) {
                        list13 = wa.g9.b(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -404433734:
                    String str72 = str;
                    list = list20;
                    if (str72.equals("rtb_native_required_assets")) {
                        list3 = list18;
                        jSONObject12 = wa.g9.c(jsonReader);
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -404326515:
                    String str73 = str;
                    list = list20;
                    if (str73.equals("render_timeout_ms")) {
                        i13 = jsonReader.nextInt();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -397704715:
                    String str74 = str;
                    list = list20;
                    if (str74.equals("ad_close_time_ms")) {
                        i15 = jsonReader.nextInt();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -388807511:
                    String str75 = str;
                    list = list20;
                    if (str75.equals("content_url")) {
                        str24 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -369773488:
                    String str76 = str;
                    list = list20;
                    if (str76.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list2 = list17;
                        list3 = list18;
                        list4 = list19;
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -213449460:
                    String str77 = str;
                    list = list20;
                    if (str77.equals("force_disable_hardware_acceleration")) {
                        z22 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -213424028:
                    String str78 = str;
                    list = list20;
                    if (str78.equals("watermark")) {
                        str12 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -180214626:
                    String str79 = str;
                    list = list20;
                    if (str79.equals("native_required_asset_viewability")) {
                        z21 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -154616268:
                    String str80 = str;
                    list = list20;
                    if (str80.equals("is_offline_ad")) {
                        z20 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case -29338502:
                    String str81 = str;
                    list = list20;
                    if (str81.equals("allow_custom_click_gesture")) {
                        z10 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 3107:
                    String str82 = str;
                    list = list20;
                    if (!str82.equals("ad")) {
                        list2 = list17;
                        list3 = list18;
                        list4 = list19;
                        str2 = str3;
                        jsonReader.skipValue();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    } else {
                        list3 = list18;
                        up0Var = new up0(jsonReader);
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                case 3355:
                    String str83 = str;
                    list = list20;
                    if (str83.equals(FacebookMediationAdapter.KEY_ID)) {
                        str7 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 3076010:
                    String str84 = str;
                    list = list20;
                    if (str84.equals("data")) {
                        list3 = list18;
                        jSONObject7 = wa.g9.c(jsonReader);
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 37109963:
                    String str85 = str;
                    list = list20;
                    if (str85.equals("request_id")) {
                        str20 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 63195984:
                    String str86 = str;
                    list = list20;
                    if (str86.equals("render_test_label")) {
                        z11 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 107433883:
                    String str87 = str;
                    list = list20;
                    if (str87.equals("qdata")) {
                        str8 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 230323073:
                    String str88 = str;
                    list = list20;
                    if (str88.equals("ad_load_urls")) {
                        list14 = wa.g9.b(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 281223176:
                    String str89 = str;
                    list = list20;
                    if (str89.equals("is_secondary_analytics_logging_enabled")) {
                        z29 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 418392395:
                    String str90 = str;
                    list = list20;
                    if (str90.equals("is_closable_area_disabled")) {
                        z14 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 542250332:
                    String str91 = str;
                    list = list20;
                    if (str91.equals("consent_form_action_identifier")) {
                        i16 = jsonReader.nextInt();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 549176928:
                    String str92 = str;
                    list = list20;
                    if (str92.equals("presentation_error_timeout_ms")) {
                        i11 = jsonReader.nextInt();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 597473788:
                    String str93 = str;
                    list = list20;
                    if (str93.equals("debug_dialog_string")) {
                        str10 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 639133141:
                    String str94 = str;
                    list = list20;
                    if (str94.equals("response_info_extras_override")) {
                        if (((Boolean) sl.I7.d()).booleanValue()) {
                            try {
                                Bundle h3 = wa.g9.h(wa.g9.c(jsonReader));
                                if (h3 != null) {
                                    bundle2 = h3;
                                }
                                list3 = list18;
                                str2 = str3;
                                list20 = list;
                            } catch (IllegalStateException unused) {
                                jsonReader.skipValue();
                            }
                            str3 = str2;
                            list18 = list3;
                        } else {
                            jsonReader.skipValue();
                        }
                        list2 = list17;
                        list3 = list18;
                        list4 = list19;
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 754887508:
                    String str95 = str;
                    list = list20;
                    if (str95.equals("container_sizes")) {
                        list3 = list18;
                        list9 = rp0.a(jsonReader);
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 791122864:
                    String str96 = str;
                    list = list20;
                    if (str96.equals("impression_type")) {
                        int nextInt2 = jsonReader.nextInt();
                        if (nextInt2 != 0 && nextInt2 != 1 && nextInt2 != 3 && nextInt2 != 4) {
                            i10 = 0;
                        } else {
                            i10 = nextInt2;
                        }
                        list3 = list18;
                        str2 = str3;
                        list20 = list;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                    break;
                case 805095541:
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) sl.K0.d()).booleanValue()) {
                            HashMap hashMap3 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                HashMap hashMap4 = new HashMap();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    hashMap4.put(jsonReader.nextName(), jsonReader.nextString());
                                    list20 = list20;
                                }
                                jsonReader.endObject();
                                hashMap3.put(nextName3, hashMap4);
                            }
                            jsonReader.endObject();
                            list3 = list18;
                            hashMap2 = hashMap3;
                            str2 = str3;
                            str3 = str2;
                            list18 = list3;
                        } else {
                            list = list20;
                            jsonReader.skipValue();
                            list2 = list17;
                            list3 = list18;
                            list4 = list19;
                            str2 = str3;
                            list20 = list;
                            list19 = list4;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        }
                    } else {
                        list = list20;
                        list2 = list17;
                        list3 = list18;
                        list4 = list19;
                        str2 = str3;
                        jsonReader.skipValue();
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                case 1010584092:
                    if (str.equals("transaction_id")) {
                        str4 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1100650276:
                    if (str.equals("rewards")) {
                        qvVar = qv.a(wa.g9.d(jsonReader));
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1141602460:
                    if (str.equals("adapter_response_info_key")) {
                        str22 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1186014765:
                    if (str.equals("cache_hit_urls")) {
                        wa.g9.b(jsonReader);
                        list2 = list17;
                        list3 = list18;
                        list4 = list19;
                        list = list20;
                        str2 = str3;
                        list20 = list;
                        list19 = list4;
                        list17 = list2;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1303622534:
                    if (str.equals("preload_sort_value")) {
                        list3 = list18;
                        str2 = str3;
                        d2 = jsonReader.nextDouble();
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1321720943:
                    if (str.equals("allow_pub_owned_ad_view")) {
                        z9 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1422388341:
                    if (str.equals("is_collapsible")) {
                        z24 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1437255331:
                    if (str.equals("ad_source_id")) {
                        str17 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1556932485:
                    if (str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) sl.f10879oe.d()).booleanValue()) {
                            i18 = jsonReader.nextInt();
                            list3 = list18;
                            str2 = str3;
                            str3 = str2;
                            list18 = list3;
                        } else {
                            jsonReader.skipValue();
                            list2 = list17;
                            list3 = list18;
                            list4 = list19;
                            list = list20;
                            str2 = str3;
                            list20 = list;
                            list19 = list4;
                            list17 = list2;
                            str3 = str2;
                            list18 = list3;
                        }
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1565514205:
                    if (str.equals("adapter_only_third_party_impression")) {
                        z28 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1637553475:
                    if (str.equals("bid_response")) {
                        str11 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1638957285:
                    if (str.equals("video_start_urls")) {
                        list15 = wa.g9.b(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1686319423:
                    if (str.equals("ad_network_class_name")) {
                        str15 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1688341040:
                    if (str.equals("video_reward_urls")) {
                        list16 = wa.g9.b(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1799285870:
                    if (str.equals("use_third_party_container_height")) {
                        z18 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1839650832:
                    if (str.equals("renderers")) {
                        list7 = wa.g9.b(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 1875425491:
                    if (str.equals("is_analytics_logging_enabled")) {
                        z16 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 2004337096:
                    if (str.equals("recursive_signal_collection")) {
                        jSONArray = wa.g9.d(jsonReader);
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 2068142375:
                    if (str.equals("rule_line_external_id")) {
                        str14 = jsonReader.nextString();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 2072888499:
                    if (str.equals("manual_tracking_urls")) {
                        list3 = list18;
                        list8 = wa.g9.b(jsonReader);
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 2075506442:
                    if (str.equals("render_serially")) {
                        z26 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                case 2117205836:
                    if (str.equals("flow_control")) {
                        z27 = jsonReader.nextBoolean();
                        list3 = list18;
                        str2 = str3;
                        str3 = str2;
                        list18 = list3;
                    }
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
                default:
                    list2 = list17;
                    list3 = list18;
                    list4 = list19;
                    list = list20;
                    str2 = str3;
                    jsonReader.skipValue();
                    list20 = list;
                    list19 = list4;
                    list17 = list2;
                    str3 = str2;
                    list18 = list3;
            }
        }
        jsonReader.endObject();
        this.f9924a = list7;
        this.f9926b = i;
        this.f9928c = list12;
        this.f9930d = list13;
        this.f9933f = list14;
        this.e = i10;
        this.f9935g = list15;
        this.f9937h = list16;
        this.i = list17;
        this.f9940j = str4;
        this.f9942k = str5;
        this.f9944l = qvVar;
        this.f9945m = list18;
        this.f9946n = list19;
        this.f9948o = list20;
        this.f9950p = list8;
        this.f9952q = i11;
        this.f9954r = list9;
        this.f9956s = up0Var;
        this.f9958t = list10;
        this.f9960u = list11;
        this.f9964w = str6;
        this.f9962v = jSONObject7;
        this.f9966x = str7;
        this.f9968y = str8;
        this.f9970z = str9;
        this.A = nwVar;
        this.B = str10;
        this.C = jSONObject8;
        this.D = jSONObject9;
        this.J = z3;
        this.K = z9;
        this.L = z10;
        this.M = z11;
        this.N = z12;
        this.O = z13;
        this.P = z14;
        this.Q = i12;
        this.R = i13;
        this.T = z15;
        this.U = str11;
        this.V = new jk0(28, jSONObject10);
        this.W = z16;
        this.X = z17;
        this.Y = i14;
        this.Z = str12;
        this.f9925a0 = i15;
        this.f9927b0 = str13;
        this.f9929c0 = z18;
        this.f9931d0 = duVar;
        this.f9932e0 = d3Var;
        this.f9934f0 = str14;
        this.f9936g0 = z19;
        this.f9938h0 = jSONObject11;
        this.E = str15;
        this.F = str16;
        this.G = str17;
        this.H = str18;
        this.I = str19;
        this.f9939i0 = z20;
        this.f9941j0 = jSONObject12;
        this.f9943k0 = z21;
        this.l0 = str24;
        this.m0 = z22;
        this.S = z23;
        this.f9947n0 = str20;
        this.f9949o0 = str21;
        this.f9951p0 = str22;
        this.f9953q0 = z24;
        this.f9955r0 = z25;
        this.f9957s0 = i16;
        this.f9961u0 = y51Var2;
        this.f9959t0 = str23;
        this.f9963v0 = z26;
        this.f9965w0 = hashMap2;
        this.f9967x0 = cVar;
        this.f9969y0 = gVar;
        this.f9971z0 = d2;
        this.I0 = i17;
        this.A0 = y51Var3;
        this.B0 = z27;
        this.C0 = y51Var4;
        this.D0 = z28;
        this.E0 = i18;
        this.F0 = bundle2;
        this.G0 = z29;
        this.H0 = jSONArray;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean b() {
        return this.f9939i0 || this.f9969y0 != null;
    }
}
