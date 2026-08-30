package com.google.android.gms.internal.ads;
import g9.r;
import r3.e;
import r3.i;
import r4.a;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10028d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10029f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10030g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10031h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10032j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10033k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10034l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10035m;

    /* renamed from: n, reason: collision with root package name */
    public final long f10036n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qy(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            if (r4 == 0) goto Lc
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc
            r1.<init>(r4)     // Catch: org.json.JSONException -> Lc
            r0 = r1
        Lc:
            java.lang.String r4 = "aggressive_media_codec_release"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10931s0
            boolean r4 = a(r0, r4, r1)
            r3.f10025a = r4
            java.lang.String r4 = "byte_buffer_precache_limit"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10847n
            int r4 = b(r0, r4, r1)
            r3.f10026b = r4
            java.lang.String r4 = "exo_cache_buffer_size"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.A
            int r4 = b(r0, r4, r1)
            r3.f10027c = r4
            java.lang.String r4 = "exo_connect_timeout_millis"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10785j
            int r4 = b(r0, r4, r1)
            r3.f10028d = r4
            java.lang.String r4 = "exo_player_version"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.i
            if (r0 == 0) goto L3e
            r0.getString(r4)     // Catch: org.json.JSONException -> L3e
            goto L48
        L3e:
            r r4 = r.e
            com.google.android.gms.internal.ads.ql r4 = r4.f17698c
            java.lang.Object r4 = a(r1)
            java.lang.String r4 = (java.lang.String) r4
        L48:
            java.lang.String r4 = "exo_read_timeout_millis"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10802k
            int r4 = b(r0, r4, r1)
            e = r4
            java.lang.String r4 = "load_check_interval_bytes"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10816l
            int r4 = b(r0, r4, r1)
            r3.f10029f = r4
            java.lang.String r4 = "player_precache_limit"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10832m
            int r4 = b(r0, r4, r1)
            r3.f10030g = r4
            java.lang.String r4 = "socket_receive_buffer_size"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10864o
            int r4 = b(r0, r4, r1)
            r3.f10031h = r4
            java.lang.String r4 = "use_cache_data_source"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10775i5
            boolean r4 = a(r0, r4, r1)
            i = r4
            java.lang.String r4 = "min_retry_count"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10881p
            b(r0, r4, r1)
            java.lang.String r4 = "treat_load_exception_as_non_fatal"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10915r
            boolean r4 = a(r0, r4, r1)
            r3.f10032j = r4
            java.lang.String r4 = "enable_multiple_video_playback"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f11026y2
            boolean r4 = a(r0, r4, r1)
            r3.f10033k = r4
            java.lang.String r4 = "use_range_http_data_source"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.A2
            boolean r4 = a(r0, r4, r1)
            r3.f10034l = r4
            java.lang.String r4 = "range_http_data_source_high_water_mark"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.B2
            if (r0 == 0) goto Laa
            long r1 = r0.getLong(r4)     // Catch: org.json.JSONException -> Laa
            goto Lb8
        Laa:
            r r4 = r.e
            com.google.android.gms.internal.ads.ql r4 = r4.f17698c
            java.lang.Object r4 = a(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r1 = r4.longValue()
        Lb8:
            r3.f10035m = r1
            java.lang.String r4 = "range_http_data_source_low_water_mark"
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.C2
            if (r0 == 0) goto Lc5
            long r0 = r0.getLong(r4)     // Catch: org.json.JSONException -> Lc5
            goto Ld3
        Lc5:
            r r4 = r.e
            com.google.android.gms.internal.ads.ql r4 = r4.f17698c
            java.lang.Object r4 = a(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
        Ld3:
            r3.f10036n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qy.<init>(java.lang.String):void");
    }

    public static final boolean a(JSONObject jSONObject, String str, nl nlVar) {
        boolean booleanValue = ((Boolean) r.e.f17698c.a(nlVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, nl nlVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) r.e.f17698c.a(nlVar)).intValue();
    }
}
