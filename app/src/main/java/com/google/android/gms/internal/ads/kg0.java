package com.google.android.gms.internal.ads;
import l9.a;
import a5.a;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;
import r.e;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kg0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f7737p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final y10 f7738a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7739b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.a f7740c;

    /* renamed from: d, reason: collision with root package name */
    public final aq0 f7741d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f7742f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7743g;

    /* renamed from: h, reason: collision with root package name */
    public final ur0 f7744h;
    public final zd0 i;

    /* renamed from: j, reason: collision with root package name */
    public final xs0 f7745j;

    /* renamed from: k, reason: collision with root package name */
    public final z70 f7746k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7747l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f7748m;

    /* renamed from: n, reason: collision with root package name */
    public List f7749n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f7750o;

    public kg0(y10 y10Var, Context context, l9.a aVar, aq0 aq0Var, wx wxVar, String str, ur0 ur0Var, zd0 zd0Var, fp fpVar, ScheduledExecutorService scheduledExecutorService, xs0 xs0Var, z70 z70Var) {
        this.f7738a = y10Var;
        this.f7739b = context;
        this.f7740c = aVar;
        this.f7741d = aq0Var;
        this.e = wxVar;
        this.f7743g = str;
        this.f7744h = ur0Var;
        this.i = zd0Var;
        this.f7742f = scheduledExecutorService;
        this.f7745j = xs0Var;
        this.f7746k = z70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.r71 a(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kg0.a(java.lang.String, java.lang.String):com.google.android.gms.internal.ads.r71");
    }

    public final void b(int i) {
        if (((Boolean) g9.r.e.f17698c.a(sl.e8)).booleanValue()) {
            a5.a.u(f9.k.C.f16819k, this.i, wd0.f(i));
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f7743g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = k9.a0.f19634b;
            l9.i.f(concat);
            return str;
        }
    }
}
