package com.google.android.gms.internal.ads;
import ac.b;
import ca.i;
import f9.k;
import g9.r;
import k9.a0;
import k9.p;
import k9.r;
import l9.i;

import android.net.Uri;
import android.os.Parcel;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dq implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5481b;

    public dq(yy0 yy0Var) {
        this.f5480a = 14;
        Objects.requireNonNull(yy0Var);
        this.f5481b = yy0Var;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final b l(Object obj) {
        int length;
        hq1 hq1Var;
        boolean z3;
        c81 d02;
        dm0 dm0Var;
        rq0 rq0Var;
        po0 po0Var;
        int i = 0;
        int i10 = 2;
        int i11 = 5;
        int i12 = 3;
        int i13 = 1;
        switch (this.f5480a) {
            case 0:
                bq bqVar = (bq) obj;
                yx yxVar = new yx();
                cq cqVar = new cq(this, yxVar);
                zp zpVar = (zp) this.f5481b;
                Parcel g22 = bqVar.g2();
                qh.c(g22, zpVar);
                qh.e(g22, cqVar);
                bqVar.o3(g22, 2);
                return yxVar;
            case 1:
                mw mwVar = (mw) this.f5481b;
                Map map = (Map) obj;
                mwVar.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                Object obj2 = mwVar.f8444h;
                                synchronized (obj2) {
                                    try {
                                        length = optJSONArray.length();
                                        synchronized (obj2) {
                                            hq1Var = (hq1) mwVar.f8439b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (hq1Var == null) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb2.append("Cannot find the corresponding resource object for ");
                                    sb2.append(str);
                                    b80.k(sb2.toString());
                                } else {
                                    for (int i14 = 0; i14 < length; i14++) {
                                        String string = optJSONArray.getJSONObject(i14).getString("threat_type");
                                        hq1Var.b();
                                        ((jq1) hq1Var.f4845v).F(string);
                                    }
                                    boolean z9 = mwVar.f8442f;
                                    if (length > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    mwVar.f8442f = z9 | z3;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) en.f5728a.p()).booleanValue()) {
                            int i15 = a0.f19634b;
                            i.b("Failed to get SafeBrowsing metadata", e);
                        }
                        return ed1.A(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (mwVar.f8442f) {
                    synchronized (mwVar.f8444h) {
                        pp1 pp1Var = mwVar.f8438a;
                        pp1Var.b();
                        ((qq1) pp1Var.f4845v).N(10);
                    }
                }
                boolean z10 = mwVar.f8442f;
                if ((z10 && mwVar.f8443g.A) || ((mwVar.f8446k && mwVar.f8443g.f8883z) || (!z10 && mwVar.f8443g.f8881x))) {
                    synchronized (mwVar.f8444h) {
                        try {
                            for (hq1 hq1Var2 : mwVar.f8439b.values()) {
                                pp1 pp1Var2 = mwVar.f8438a;
                                jq1 jq1Var = (jq1) hq1Var2.c();
                                pp1Var2.b();
                                ((qq1) pp1Var2.f4845v).G(jq1Var);
                            }
                            pp1 pp1Var3 = mwVar.f8438a;
                            ArrayList arrayList = mwVar.f8440c;
                            pp1Var3.b();
                            ((qq1) pp1Var3.f4845v).L(arrayList);
                            ArrayList arrayList2 = mwVar.f8441d;
                            pp1Var3.b();
                            ((qq1) pp1Var3.f4845v).M(arrayList2);
                            if (((Boolean) en.f5728a.p()).booleanValue()) {
                                String z11 = ((qq1) pp1Var3.f4845v).z();
                                String B = ((qq1) pp1Var3.f4845v).B();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(z11).length() + 38 + String.valueOf(B).length() + 15);
                                sb3.append("Sending SB report\n  url: ");
                                sb3.append(z11);
                                sb3.append("\n  clickUrl: ");
                                sb3.append(B);
                                sb3.append("\n  resources: \n");
                                StringBuilder sb4 = new StringBuilder(sb3.toString());
                                for (jq1 jq1Var2 : Collections.unmodifiableList(((qq1) pp1Var3.f4845v).A())) {
                                    sb4.append("    [");
                                    sb4.append(jq1Var2.A());
                                    sb4.append("] ");
                                    sb4.append(jq1Var2.z());
                                }
                                b80.k(sb4.toString());
                            }
                            p a10 = new r(mwVar.e).a(1, mwVar.f8443g.f8879v, null, ((qq1) pp1Var3.c()).b());
                            if (((Boolean) en.f5728a.p()).booleanValue()) {
                                a10.f12998u.a(af.f4468v, xx.f12651a);
                            }
                            d02 = ed1.d0(a10, i6.f7001d, xx.f12657h);
                        } finally {
                        }
                    }
                    return d02;
                }
                return v81.f11836v;
            case 2:
                String str2 = (String) r.e.f17698c.a(sl.Eb);
                Uri.Builder builder = (Uri.Builder) this.f5481b;
                builder.appendQueryParameter(str2, "12");
                return ed1.e(builder.toString());
            case 3:
                ((p8) this.f5481b).t((Throwable) obj);
                return v81.f11836v;
            case 4:
                return ((tg0) this.f5481b).a((dv) obj);
            case 5:
                wg0 wg0Var = (wg0) obj;
                return ed1.e(new wp0(new bl0(i12, ((jg0) this.f5481b).f7442c), tw.c(new InputStreamReader(wg0Var.f12238a), wg0Var.f12239b.G)));
            case 6:
                kg0 kg0Var = (kg0) this.f5481b;
                return ed1.e(new wp0(new bl0(i12, kg0Var.f7741d), tw.c(new StringReader(((JSONObject) obj).toString()), kg0Var.f7750o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f5481b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return ed1.e(jSONObject);
                } catch (JSONException e8) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e8.getCause())));
                }
            case 8:
                nl0 nl0Var = (nl0) this.f5481b;
                Throwable th = (Throwable) obj;
                if (((Boolean) r.e.f17698c.a(sl.Y2)).booleanValue()) {
                    qn0 qn0Var = (qn0) nl0Var.f8754c;
                    px pxVar = k.C.f16817h;
                    int zzb = qn0Var.zzb();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(zzb).length() + 22);
                    sb5.append("OptionalSignalTimeout:");
                    sb5.append(zzb);
                    pxVar.d(sb5.toString(), th);
                }
                return v81.f11836v;
            case 9:
                Throwable th2 = (Throwable) obj;
                String str5 = "";
                ((wn0) this.f5481b).f12306c.f(new e40(20, th2));
                if (th2 instanceof SecurityException) {
                    dm0Var = new dm0(str5, i10, i13);
                } else if (th2 instanceof IllegalStateException) {
                    dm0Var = new dm0(str5, i12, i13);
                } else if (th2 instanceof IllegalArgumentException) {
                    dm0Var = new dm0(str5, 4, i13);
                } else if (th2 instanceof TimeoutException) {
                    dm0Var = new dm0(str5, i11, i13);
                } else {
                    dm0Var = new dm0(str5, i, i13);
                }
                return ed1.e(dm0Var);
            case 10:
                return ed1.e(new ql0((String) ((am0) this.f5481b).f4540c, i11));
            case 11:
                yd1 yd1Var = (yd1) this.f5481b;
                yq0 yq0Var = (yq0) obj;
                if (yq0Var != null && (rq0Var = yq0Var.f12929a) != null && (po0Var = yq0Var.f12930b) != null) {
                    ik z12 = nk.z();
                    gk A = hk.A();
                    A.b();
                    ((hk) A.f4845v).B();
                    kk A2 = kk.A();
                    A.b();
                    ((hk) A.f4845v).C(A2);
                    z12.b();
                    ((nk) z12.f4845v).A((hk) A.c());
                    rq0Var.f10272a.zza().f6992f.c((nk) z12.c());
                    return yd1Var.g(rq0Var, po0Var.f9567b);
                }
                throw new cg0(1, "Empty prefetch");
            case 12:
                cu0 cu0Var = (cu0) this.f5481b;
                Exception exc = (Exception) obj;
                synchronized (cu0Var) {
                    cu0Var.f5172b = true;
                    throw exc;
                }
            case 13:
                return ed1.e(((dr0) this.f5481b).l(obj));
            case 14:
                wy0 wy0Var = (wy0) obj;
                if (wy0Var != null) {
                    return ed1.e(wy0Var);
                }
                yy0 yy0Var = (yy0) this.f5481b;
                yy0Var.e.b(51);
                return ed1.c0(q81.t(ed1.E(new xy0(yy0Var, yy0Var.f13012f), yy0Var.f13011d)), x20.f12439n, o81.f9033u);
            case 15:
                return ((y01) this.f5481b).f12703b.a();
            default:
                return ((g11) this.f5481b).f6257c.zzb();
        }
    }

    public /* synthetic */ dq(cu0 cu0Var, hx0 hx0Var) {
        this.f5480a = 12;
        this.f5481b = cu0Var;
    }

    public dq(i iVar, zp zpVar) {
        this.f5480a = 0;
        this.f5481b = zpVar;
    }

    public /* synthetic */ dq(int i, Object obj) {
        this.f5480a = i;
        this.f5481b = obj;
    }
}
