package com.google.android.gms.internal.ads;
import r3.e;
import r3.i;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ev {

    /* renamed from: a, reason: collision with root package name */
    public final List f5815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5816b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5817c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5818d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5819f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5820g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f5821h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5822j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5823k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5824l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5825m;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ev(org.json.JSONObject r4) {
        /*
            r3 = this;
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.<init>()
            java.lang.String r1 = "url"
            java.lang.String r1 = r4.optString(r1)
            r3.f5819f = r1
            java.lang.String r1 = "base_uri"
            java.lang.String r1 = r4.optString(r1)
            r3.f5816b = r1
            java.lang.String r1 = "post_parameters"
            java.lang.String r1 = r4.optString(r1)
            r3.f5817c = r1
            java.lang.String r1 = "drt_include"
            java.lang.String r1 = r4.optString(r1)
            boolean r1 = a(r1)
            r3.f5818d = r1
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r4.optString(r1)
            r3.f5825m = r1
            java.lang.String r1 = "use_compression"
            java.lang.String r1 = r4.optString(r1)
            boolean r1 = a(r1)
            r3.f5824l = r1
            java.lang.String r1 = "cookies_include"
            java.lang.String r2 = "true"
            java.lang.String r1 = r4.optString(r1, r2)
            boolean r1 = a(r1)
            r3.e = r1
            java.lang.String r1 = "request_id"
            r4.optString(r1)
            java.lang.String r1 = "type"
            r4.optString(r1)
            java.lang.String r1 = "errors"
            java.lang.String r1 = r4.optString(r1)
            if (r1 != 0) goto L63
            r1 = 0
            goto L6d
        L63:
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
        L6d:
            r3.f5815a = r1
            java.lang.String r1 = "valid"
            r2 = 0
            int r1 = r4.optInt(r1, r2)
            r2 = 1
            if (r1 != r2) goto L7a
            r2 = -2
        L7a:
            r3.f5820g = r2
            java.lang.String r1 = "fetched_ad"
            r4.optString(r1)
            java.lang.String r1 = "render_test_ad_label"
            r4.optBoolean(r1)
            java.lang.String r1 = "preprocessor_flags"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 != 0) goto L93
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L93:
            r3.f5821h = r1
            java.lang.String r1 = "analytics_query_ad_event_id"
            r4.optString(r1)
            java.lang.String r1 = "is_analytics_logging_enabled"
            r4.optBoolean(r1)
            java.lang.String r1 = "pool_key"
            java.lang.String r1 = r4.optString(r1)
            r3.i = r1
            java.lang.String r1 = "start_time"
            java.lang.String r1 = r4.optString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Lb5
        Lb3:
            r1 = r0
            goto Lb9
        Lb5:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> Lb3
        Lb9:
            long r1 = r1.longValue()
            r3.f5822j = r1
            java.lang.String r1 = "end_time"
            java.lang.String r4 = r4.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lcc
            goto Ld0
        Lcc:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Ld0
        Ld0:
            long r0 = r0.longValue()
            r3.f5823k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev.<init>(org.json.JSONObject):void");
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
