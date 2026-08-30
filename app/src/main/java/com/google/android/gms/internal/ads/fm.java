package com.google.android.gms.internal.ads;
import c1.a;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;
import la.a;
import m.e;
import m.j;
import r2.a;
import r3.a;
import r7.e;
import s9.b;
import s9.p;
import u.c;
import z8.f;
import z8.g;

import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fm {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6107a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6108b;

    /* renamed from: c, reason: collision with root package name */
    public final b f6109c;

    /* renamed from: d, reason: collision with root package name */
    public final fe0 f6110d;
    public f e;

    /* renamed from: f, reason: collision with root package name */
    public dm f6111f;

    /* renamed from: g, reason: collision with root package name */
    public j f6112g;

    /* renamed from: h, reason: collision with root package name */
    public String f6113h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f6114j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f6115k;

    /* renamed from: l, reason: collision with root package name */
    public Context f6116l;

    public fm(ScheduledExecutorService scheduledExecutorService, p pVar, b bVar, fe0 fe0Var) {
        this.f6107a = scheduledExecutorService;
        this.f6108b = pVar;
        this.f6109c = bVar;
        this.f6110d = fe0Var;
    }

    public final void a(String str) {
        try {
            j jVar = this.f6112g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f6114j).toString());
            e(jSONObject);
            if (((Boolean) bn.f4838c.p()).booleanValue()) {
                jSONObject.put("as", this.f6109c.b());
            }
            jVar.a(jSONObject.toString());
            em emVar = new em(this, str);
            if (((Boolean) bn.e.p()).booleanValue()) {
                this.f6108b.a(this.f6112g, emVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            c.g(this.f6116l, new g((f) new a(6).g(bundle)), emVar);
        } catch (JSONException e) {
            int i = a0.f19634b;
            i.d("Error creating JSON: ", e);
        }
    }

    public final JSONObject b(String str, String str2) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) bn.e.p()).booleanValue()) {
            j10 = ((Long) bn.f4842h.p()).longValue();
        } else {
            j10 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j10);
        e(jSONObject);
        if (((Boolean) bn.f4838c.p()).booleanValue()) {
            jSONObject.put("as", this.f6109c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) bn.e.p()).booleanValue()) {
            j10 = ((Long) bn.f4842h.p()).longValue();
        } else {
            j10 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j10);
        e(jSONObject);
        if (((Boolean) bn.f4838c.p()).booleanValue()) {
            jSONObject.put("as", this.f6109c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r7.i) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r1 = r7.f6112g;
        r2 = android.net.Uri.parse(r7.f6113h);
        r1.getClass();
        r3 = new android.os.Bundle();
        r4 = r1.f20417c;
        r1 = r1.f20416b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r5 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r5.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r3.putAll(r5);
        r1.requestPostMessageChannelWithExtras(r4, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r1.requestPostMessageChannel(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (((java.lang.Boolean) r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10842mb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.dm r0 = r7.f6111f
            if (r0 != 0) goto Lc
            int r0 = a0.f19634b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            i.c(r0)
            return
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f5455a
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r7.f6113h
            if (r0 == 0) goto L92
            j r0 = r7.f6112g
            if (r0 == 0) goto L92
            java.util.concurrent.ScheduledExecutorService r0 = r7.f6107a
            if (r0 == 0) goto L92
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            goto L3c
        L2a:
            k r1 = k.C
            a r1 = r1.f16819k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3c
            goto L4e
        L3c:
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10842mb
            r r2 = r.e
            com.google.android.gms.internal.ads.ql r2 = r2.f17698c
            java.lang.Object r1 = a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L92
        L4e:
            j r1 = r7.f6112g
            java.lang.String r2 = r7.f6113h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            e r4 = r1.f20417c
            android.support.customtabs.ICustomTabsService r1 = r1.f20416b
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L7a
            r5.<init>()     // Catch: android.os.RemoteException -> L7a
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L7a
            if (r6 == 0) goto L6e
            r5 = 0
        L6e:
            if (r5 == 0) goto L77
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L7a
            r1.requestPostMessageChannelWithExtras(r4, r2, r3)     // Catch: android.os.RemoteException -> L7a
            goto L7a
        L77:
            r1.requestPostMessageChannel(r4, r2)     // Catch: android.os.RemoteException -> L7a
        L7a:
            com.google.android.gms.internal.ads.f r1 = e
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f10859nb
            r r3 = r.e
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r2 = a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L92:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            a0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fm.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f6115k == null) {
                this.f6115k = new JSONArray((String) r.e.f17698c.a(sl.f10893pb));
            }
            jSONObject.put("eids", this.f6115k);
        } catch (JSONException e) {
            int i = a0.f19634b;
            i.d("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
