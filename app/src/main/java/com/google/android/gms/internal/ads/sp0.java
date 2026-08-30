package com.google.android.gms.internal.ads;
import g9.r;
import wa.g9;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sp0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11092c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11093d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11094f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11095g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11096h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final w91 f11097j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f11098k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11099l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11100m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11101n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f11102o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f11103p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11104q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11105r;

    /* renamed from: s, reason: collision with root package name */
    public final long f11106s;

    /* renamed from: t, reason: collision with root package name */
    public final long f11107t;

    public sp0(JsonReader jsonReader) {
        String str;
        Bundle h3;
        double d2;
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int i = 0;
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        boolean z3 = false;
        w91 w91Var = null;
        long j10 = -1;
        long j11 = -1;
        long j12 = 0;
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = g9.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z3 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i12 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j12 = jsonReader.nextLong();
            } else {
                nl nlVar = sl.f11000w9;
                str = str2;
                r rVar = r.e;
                long j13 = j10;
                ql qlVar = rVar.f17698c;
                ql qlVar2 = rVar.f17698c;
                if (((Boolean) qlVar.a(nlVar)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    w91 w91Var2 = new w91();
                    jsonReader.beginObject();
                    String str10 = str;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1724546052) {
                            if (hashCode == 3059181 && nextName2.equals("code")) {
                                jsonReader.nextInt();
                            }
                            jsonReader.skipValue();
                        } else if (nextName2.equals("description")) {
                            str10 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    w91Var2.f12196b = str10;
                    w91Var = w91Var2;
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    if (((Boolean) qlVar2.a(sl.Ob)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str9 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) qlVar2.a(sl.H7)).booleanValue()) {
                            try {
                                Bundle h10 = g9.h(g9.c(jsonReader));
                                if (h10 != null) {
                                    bundle = h10;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) qlVar2.a(sl.Da)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) qlVar2.a(sl.Da)).booleanValue()) {
                            str6 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        nl nlVar2 = sl.Ea;
                        if (((Boolean) qlVar2.a(nlVar2)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str8 = jsonReader.nextString();
                        } else if (((Boolean) qlVar2.a(nlVar2)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = g9.c(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i11 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) qlVar2.a(sl.Ma)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = g9.c(jsonReader);
                            } else if (((Boolean) qlVar2.a(sl.K2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    h3 = g9.h(g9.c(jsonReader));
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                                if (h3 != null) {
                                    double d10 = h3.getDouble("start_time");
                                    if (d10 <= 9.223372036854776E18d && d10 >= -9.223372036854776E18d) {
                                        j11 = (long) d10;
                                        d2 = h3.getDouble("end_time");
                                        if (d2 > 9.223372036854776E18d && d2 >= -9.223372036854776E18d) {
                                            j10 = (long) d2;
                                        } else {
                                            j10 = -1;
                                        }
                                        str2 = str;
                                    }
                                    j11 = -1;
                                    d2 = h3.getDouble("end_time");
                                    if (d2 > 9.223372036854776E18d) {
                                    }
                                    j10 = -1;
                                    str2 = str;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            j10 = j13;
                            str2 = str;
                        }
                    }
                    j10 = j13;
                    str2 = str;
                }
                j10 = j13;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j14 = j10;
        jsonReader.endObject();
        this.f11090a = list;
        this.f11092c = i;
        if (((Boolean) cn.e.p()).booleanValue()) {
            this.f11093d = -1;
        } else {
            nb nbVar = mm.f8377a;
            if (((Long) nbVar.p()).longValue() > -1) {
                this.f11093d = ((Long) nbVar.p()).intValue();
            } else {
                this.f11093d = i10;
            }
        }
        this.f11091b = str3;
        this.e = str4;
        this.f11094f = i12;
        this.f11095g = j12;
        this.f11097j = w91Var;
        this.f11096h = z3;
        this.i = str5;
        this.f11098k = bundle;
        this.f11099l = str6;
        this.f11100m = str7;
        this.f11101n = str8;
        this.f11102o = jSONObject;
        this.f11103p = jSONObject2;
        this.f11104q = str9;
        nb nbVar2 = an.f4547a;
        this.f11105r = ((Long) nbVar2.p()).longValue() > 0 ? ((Long) nbVar2.p()).intValue() : i11;
        this.f11106s = j11;
        this.f11107t = j14;
    }
}
