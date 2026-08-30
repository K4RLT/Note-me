package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import j6.s;
import k9.a0;
import l9.i;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class jp implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7503u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f7504v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f7505w;

    public jp(ca0 ca0Var, View view) {
        this.f7503u = 3;
        this.f7504v = new WeakReference(ca0Var);
        if (((Boolean) r.e.f17698c.a(sl.f11037ye)).booleanValue()) {
            this.f7505w = new WeakReference(view);
        } else {
            this.f7505w = new WeakReference(null);
        }
    }

    public void a(String str, vp vpVar) {
        synchronized (this.f7504v) {
            ((HashMap) this.f7505w).put(str, vpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        String concat;
        vp vpVar;
        String str;
        switch (this.f7503u) {
            case 0:
                h00 h00Var = (h00) obj;
                lp.b(map, (f90) this.f7504v);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    int i = a0.f19634b;
                    i.f("URL missing from click GMSG.");
                    return;
                }
                g30 g30Var = (g30) this.f7505w;
                q81 t3 = q81.t(lp.a(h00Var, str2));
                int i10 = 0;
                kp kpVar = new kp(g30Var, str2, i10);
                wx wxVar = xx.f12651a;
                b81 c02 = ed1.c0(t3, kpVar, wxVar);
                c02.a(new t81(c02, i10, new lx0(8, h00Var)), wxVar);
                return;
            case 1:
                Map map2 = (Map) this.f7505w;
                k kVar = k.C;
                ww wwVar = kVar.f16833y;
                ww wwVar2 = kVar.f16833y;
                Context context = (Context) this.f7504v;
                if (wwVar.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int hashCode = str3.hashCode();
                    if (hashCode != 94399) {
                        if (hashCode != 94401) {
                            if (hashCode == 94407 && str3.equals("_ai")) {
                                Map map3 = (Map) map2.get("_ai");
                                wwVar2.getClass();
                                wwVar2.h(context, "_ai", str4, ww.f(map3));
                                return;
                            }
                        } else if (str3.equals("_ac")) {
                            Map map4 = (Map) map2.get("_ac");
                            wwVar2.getClass();
                            wwVar2.h(context, "_ac", str4, ww.f(map4));
                            return;
                        }
                    } else if (str3.equals("_aa")) {
                        wwVar2.h(context, "_aa", str4, null);
                        return;
                    }
                    int i11 = a0.f19634b;
                    i.c("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str5 = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                if (TextUtils.isEmpty(str8)) {
                    concat = "";
                } else {
                    concat = "\n".concat(String.valueOf(str8));
                }
                synchronized (this.f7504v) {
                    try {
                        vpVar = (vp) ((HashMap) this.f7505w).remove(str5);
                    } catch (JSONException e) {
                        vpVar.t(e.getMessage());
                    } finally {
                    }
                    if (vpVar == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb2.append("Received result for unexpected method invocation: ");
                        sb2.append(str5);
                        String sb3 = sb2.toString();
                        int i12 = a0.f19634b;
                        i.f(sb3);
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str7).length() + concat.length());
                        sb4.append(str7);
                        sb4.append(concat);
                        vpVar.t(sb4.toString());
                        return;
                    }
                    if (str9 == null) {
                        vpVar.a(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (a0.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb5.append("Result GMSG: ");
                        sb5.append(jSONObject2);
                        a0.k(sb5.toString());
                    }
                    vpVar.a(jSONObject);
                    return;
                }
            case 3:
                ca0 ca0Var = (ca0) ((WeakReference) this.f7504v).get();
                if (ca0Var != null) {
                    ca0Var.A.l();
                    nl nlVar = sl.f11037ye;
                    r rVar = r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        View view = (View) ((WeakReference) this.f7505w).get();
                        qp0 qp0Var = ca0Var.D;
                        cb0 cb0Var = ca0Var.Y;
                        cb0Var.getClass();
                        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && view != null) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent != null) {
                                    if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                                        str = "1";
                                    } else {
                                        parent = parent.getParent();
                                    }
                                } else {
                                    str = "0";
                                }
                            }
                            s a10 = cb0Var.f5069a.a();
                            a10.k("action", "hcp");
                            a10.k("hcp", str);
                            a10.i(qp0Var);
                            a10.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                eb0 eb0Var = (eb0) this.f7504v;
                try {
                    eb0Var.f5639z = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i13 = a0.f19634b;
                    i.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                vo voVar = (vo) this.f7505w;
                eb0Var.f5638y = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str10 = (String) map.get("asset_id");
                if (voVar == null) {
                    int i14 = a0.f19634b;
                    i.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel g22 = voVar.g2();
                    g22.writeString(str10);
                    voVar.v2(g22, 1);
                    return;
                } catch (RemoteException e8) {
                    i.i(e8, "#007 Could not call remote method.");
                    return;
                }
            case 5:
                fd0 fd0Var = (fd0) this.f7504v;
                h00 h00Var2 = (h00) this.f7505w;
                u30 u30Var = fd0Var.i;
                synchronized (u30Var) {
                    u30Var.f11526w.add(h00Var2);
                    q30 q30Var = u30Var.f11524u;
                    h00Var2.h1("/updateActiveView", q30Var.e);
                    h00Var2.h1("/untrackActiveViewUnit", q30Var.f9729f);
                }
                return;
            default:
                h00 h00Var3 = (h00) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    int i15 = a0.f19634b;
                    i.f("URL missing from httpTrack GMSG.");
                    return;
                }
                qp0 J = h00Var3.J();
                if (J != null && !J.f9939i0) {
                    ((xs0) this.f7504v).b(str11, J.f9967x0, null, null);
                    return;
                }
                sp0 A0 = h00Var3.A0();
                if (A0 == null) {
                    k.C.f16817h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                rh0 rh0Var = (rh0) this.f7505w;
                k.C.f16819k.getClass();
                rb rbVar = new rb(2, System.currentTimeMillis(), A0.f11091b, str11);
                rh0Var.getClass();
                rh0Var.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(rh0Var, 7, rbVar));
                return;
        }
    }

    public jp() {
        this.f7503u = 2;
        this.f7504v = new Object();
        this.f7505w = new HashMap();
    }

    public /* synthetic */ jp(Object obj, int i, Object obj2) {
        this.f7503u = i;
        this.f7504v = obj;
        this.f7505w = obj2;
    }
}
