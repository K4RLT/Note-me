package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ac0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4439a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0 f4440b;

    /* renamed from: c, reason: collision with root package name */
    public final of f4441c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.a f4442d;
    public final j6.l e;

    /* renamed from: f, reason: collision with root package name */
    public final jj f4443f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f4444g;

    /* renamed from: h, reason: collision with root package name */
    public final rn f4445h;
    public final fc0 i;

    /* renamed from: j, reason: collision with root package name */
    public final gd0 f4446j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f4447k;

    /* renamed from: l, reason: collision with root package name */
    public final vc0 f4448l;

    /* renamed from: m, reason: collision with root package name */
    public final be0 f4449m;

    /* renamed from: n, reason: collision with root package name */
    public final xs0 f4450n;

    /* renamed from: o, reason: collision with root package name */
    public final rh0 f4451o;

    /* renamed from: p, reason: collision with root package name */
    public final wh0 f4452p;

    /* renamed from: q, reason: collision with root package name */
    public final cq0 f4453q;

    /* renamed from: r, reason: collision with root package name */
    public final zd0 f4454r;

    /* renamed from: s, reason: collision with root package name */
    public final me0 f4455s;

    /* renamed from: t, reason: collision with root package name */
    public final b60 f4456t;

    public ac0(Context context, tb0 tb0Var, of ofVar, l9.a aVar, j6.l lVar, jj jjVar, wx wxVar, aq0 aq0Var, fc0 fc0Var, gd0 gd0Var, ScheduledExecutorService scheduledExecutorService, be0 be0Var, xs0 xs0Var, rh0 rh0Var, vc0 vc0Var, wh0 wh0Var, cq0 cq0Var, zd0 zd0Var, me0 me0Var, b60 b60Var) {
        this.f4439a = context;
        this.f4440b = tb0Var;
        this.f4441c = ofVar;
        this.f4442d = aVar;
        this.e = lVar;
        this.f4443f = jjVar;
        this.f4444g = wxVar;
        this.f4445h = aq0Var.f4585j;
        this.i = fc0Var;
        this.f4446j = gd0Var;
        this.f4447k = scheduledExecutorService;
        this.f4449m = be0Var;
        this.f4450n = xs0Var;
        this.f4451o = rh0Var;
        this.f4448l = vc0Var;
        this.f4452p = wh0Var;
        this.f4453q = cq0Var;
        this.f4454r = zd0Var;
        this.f4455s = me0Var;
        this.f4456t = b60Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final g9.k2 f(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("reason");
            String optString2 = jSONObject.optString("ping_url");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                return new g9.k2(optString, optString2);
            }
            return null;
        }
        return null;
    }

    public final ac.b a(JSONArray jSONArray, boolean z3, boolean z9, int i) {
        int i10;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z9) {
                i10 = jSONArray.length();
            } else {
                i10 = 1;
            }
            if (((Boolean) g9.r.e.f17698c.a(sl.Q2)).booleanValue()) {
                a5.a.u(f9.k.C.f16819k, this.f4454r, wd0.f(i));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b(jSONArray.optJSONObject(i11), z3, 0));
            }
            return ed1.d0(new k81(d51.u(arrayList), true), i6.i, this.f4444g);
        }
        return ed1.e(Collections.EMPTY_LIST);
    }

    public final ac.b b(JSONObject jSONObject, boolean z3, int i) {
        double d2;
        ac.b d02;
        if (jSONObject == null) {
            return v81.f11836v;
        }
        nl nlVar = sl.O4;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        boolean booleanValue = ((Boolean) qlVar.a(nlVar)).booleanValue();
        HashMap hashMap = null;
        if (booleanValue && jSONObject.has((String) qlVar2.a(sl.P4))) {
            hashMap = new HashMap();
            for (String str : ((String) qlVar2.a(sl.Q4)).split(",")) {
                try {
                    hashMap.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap hashMap2 = hashMap;
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) && hashMap2 == null) {
            return v81.f11836v;
        }
        nl nlVar2 = sl.Q2;
        g9.r rVar2 = g9.r.e;
        if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue() && i != 0) {
            a5.a.u(f9.k.C.f16819k, this.f4454r, wd0.f(i));
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (!z3) {
            if (hashMap2 != null) {
                d2 = optDouble;
            } else {
                final tb0 tb0Var = this.f4440b;
                Executor executor = tb0Var.f11306c;
                if (((Boolean) rVar2.f17698c.a(sl.f10682c7)).booleanValue() && optString != null && optString.startsWith("data:")) {
                    d02 = ed1.E(new Callable() { // from class: com.google.android.gms.internal.ads.rb0
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            tb0 tb0Var2 = tb0.this;
                            tb0Var2.getClass();
                            String str2 = optString;
                            int indexOf = str2.indexOf(",");
                            if (indexOf != -1) {
                                if (str2.substring(0, indexOf).endsWith(";base64")) {
                                    int indexOf2 = str2.indexOf(":");
                                    int indexOf3 = str2.indexOf(";");
                                    if (indexOf2 != -1 && str2.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
                                        return tb0Var2.a(Base64.decode(str2.substring(indexOf + 1), 0), optDouble, optBoolean);
                                    }
                                    q.x.n("Bad data URL: only image media is supported");
                                    return null;
                                }
                                q.x.n("Bad data URL: only base64 is supported");
                                return null;
                            }
                            q.x.n("Bad data URL: no ',' found for base64 data");
                            return null;
                        }
                    }, executor);
                } else {
                    tb0Var.f11304a.getClass();
                    yx yxVar = new yx();
                    k9.r.f19717a.u(new k9.q(optString, yxVar));
                    d02 = ed1.d0(yxVar, new f31() { // from class: com.google.android.gms.internal.ads.sb0
                        @Override // com.google.android.gms.internal.ads.f31
                        public final /* synthetic */ Object apply(Object obj) {
                            tb0 tb0Var2 = tb0.this;
                            tb0Var2.getClass();
                            return tb0Var2.a(((eb) obj).f5631b, optDouble, optBoolean);
                        }
                    }, executor);
                }
                return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), ed1.d0(d02, new f31() { // from class: com.google.android.gms.internal.ads.wb0
                    @Override // com.google.android.gms.internal.ads.f31
                    public final /* synthetic */ Object apply(Object obj) {
                        return new pn(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.f4444g));
            }
        } else {
            d2 = optDouble;
        }
        return ed1.e(new pn(null, Uri.parse(optString), d2, optInt, optInt2, hashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.b81 d(org.json.JSONObject r12, com.google.android.gms.internal.ads.qp0 r13, com.google.android.gms.internal.ads.sp0 r14, f9.a r15, com.google.android.gms.internal.ads.mw r16) {
        /*
            r11 = this;
            java.lang.String r0 = "base_url"
            java.lang.String r8 = r12.optString(r0)
            java.lang.String r0 = "html"
            java.lang.String r9 = r12.optString(r0)
            java.lang.String r0 = "width"
            r1 = 0
            int r0 = r12.optInt(r0, r1)
            java.lang.String r2 = "height"
            int r12 = r12.optInt(r2, r1)
            if (r0 != 0) goto L24
            if (r12 == 0) goto L1e
            goto L25
        L1e:
            g9.c3 r12 = g9.c3.a()
            r3 = r12
            goto L32
        L24:
            r1 = r0
        L25:
            g9.c3 r0 = new g9.c3
            z8.h r2 = new z8.h
            r2.<init>(r1, r12)
            android.content.Context r12 = r11.f4439a
            r0.<init>(r12, r2)
            r3 = r0
        L32:
            com.google.android.gms.internal.ads.fc0 r2 = r11.i
            r2.getClass()
            com.google.android.gms.internal.ads.nl r12 = com.google.android.gms.internal.ads.sl.Q2
            g9.r r0 = g9.r.e
            com.google.android.gms.internal.ads.ql r0 = r0.f17698c
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L54
            com.google.android.gms.internal.ads.zd0 r12 = r2.f6017j
            f9.k r0 = f9.k.C
            la.a r0 = r0.f16819k
            java.lang.String r1 = "native-assets-loading-video-composition-start"
            a5.a.u(r0, r12, r1)
        L54:
            com.google.android.gms.internal.ads.v81 r12 = com.google.android.gms.internal.ads.v81.f11836v
            com.google.android.gms.internal.ads.xb0 r1 = new com.google.android.gms.internal.ads.xb0
            r10 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r2.f6011b
            com.google.android.gms.internal.ads.b81 r12 = com.google.android.gms.internal.ads.ed1.c0(r12, r1, r13)
            com.google.android.gms.internal.ads.yb0 r13 = new com.google.android.gms.internal.ads.yb0
            r14 = 1
            r13.<init>(r12, r14)
            com.google.android.gms.internal.ads.wx r14 = com.google.android.gms.internal.ads.xx.f12657h
            com.google.android.gms.internal.ads.b81 r12 = com.google.android.gms.internal.ads.ed1.c0(r12, r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ac0.d(org.json.JSONObject, com.google.android.gms.internal.ads.qp0, com.google.android.gms.internal.ads.sp0, f9.a, com.google.android.gms.internal.ads.mw):com.google.android.gms.internal.ads.b81");
    }

    public final p81 e(String str, boolean z3, ac.b bVar) {
        if (((Boolean) g9.r.e.f17698c.a(sl.R2)).booleanValue()) {
            x21.i(bVar, str, this.f4444g);
        }
        if (z3) {
            return ed1.c0(bVar, new qr(1, bVar), xx.f12657h);
        }
        return ed1.U(bVar, Exception.class, new x20(1), xx.f12657h);
    }
}
