package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import f9.k;
import g9.r;
import k9.f0;
import p.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class vb0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11876d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11873a = i;
        this.f11874b = obj;
        this.f11875c = obj2;
        this.f11876d = obj3;
        this.e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        Bundle bundle;
        Bundle bundle2;
        switch (this.f11873a) {
            case 0:
                tw twVar = (tw) this.f11874b;
                wp0 wp0Var = (wp0) this.f11875c;
                qp0 qp0Var = (qp0) this.f11876d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (((Boolean) r.e.f17698c.a(sl.Q2)).booleanValue()) {
                    a.u(k.C.f16819k, (zd0) twVar.f11473y, "native-assets-loading-basic-start");
                }
                ra0 ra0Var = new ra0();
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (ra0Var) {
                    ra0Var.f10165a = optInt;
                }
                String optString = jSONObject.optString("custom_template_id");
                synchronized (ra0Var) {
                    ra0Var.f10183u = optString;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("omid_partner_name");
                } else {
                    str = null;
                }
                synchronized (ra0Var) {
                    ra0Var.f10187y = str;
                }
                aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
                if (aq0Var.f4584h.contains(Integer.toString(ra0Var.q()))) {
                    if (ra0Var.q() == 3) {
                        if (ra0Var.g() != null) {
                            if (!aq0Var.i.contains(ra0Var.g())) {
                                throw new cg0(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new cg0(1, "No custom template id for custom template ad response.");
                        }
                    }
                    double optDouble = jSONObject.optDouble("rating", -1.0d);
                    synchronized (ra0Var) {
                        ra0Var.f10180r = optDouble;
                    }
                    String optString2 = jSONObject.optString("headline", null);
                    if (qp0Var.M) {
                        k kVar = k.C;
                        f0 f0Var = kVar.f16813c;
                        Resources c10 = kVar.f16817h.c();
                        if (c10 != null) {
                            str2 = c10.getString(R.string.s7);
                        } else {
                            str2 = "Test Ad";
                        }
                        optString2 = a.o(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(optString2).length()), str2, " : ", optString2);
                    }
                    ra0Var.o("headline", optString2);
                    ra0Var.o("body", jSONObject.optString("body", null));
                    ra0Var.o("call_to_action", jSONObject.optString("call_to_action", null));
                    ra0Var.o("store", jSONObject.optString("store", null));
                    ra0Var.o("price", jSONObject.optString("price", null));
                    ra0Var.o("advertiser", jSONObject.optString("advertiser", null));
                    return ra0Var;
                }
                int q10 = ra0Var.q();
                throw new cg0(1, a.f(q10, "Invalid template ID: ", new StringBuilder(String.valueOf(q10).length() + 21)));
            case 1:
                if (((Boolean) r.e.f17698c.a(sl.J2)).booleanValue() && (bundle = ((dv) this.f11874b).G) != null) {
                    k.C.f16819k.getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new ch0((gh0) ((hr0) this.f11875c).f6877w.get(), (JSONObject) ((hr0) this.f11876d).f6877w.get(), (ev) ((hr0) this.e).f6877w.get());
            case 2:
                Iterator it = ((ArrayList) this.f11874b).iterator();
                while (true) {
                    Object obj = this.f11875c;
                    if (it.hasNext()) {
                        pn0 pn0Var = (pn0) ((b) it.next()).get();
                        if (pn0Var != null) {
                            pn0Var.l(obj);
                        }
                    } else {
                        if (((Boolean) r.e.f17698c.a(sl.J2)).booleanValue() && (bundle2 = (Bundle) this.f11876d) != null) {
                            Bundle bundle3 = (Bundle) this.e;
                            k.C.f16819k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (obj instanceof Bundle) {
                                bundle2.putLong("client-signals-end", currentTimeMillis);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", currentTimeMillis);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                }
                break;
            case 3:
                View view = (View) this.f11876d;
                Activity activity = (Activity) this.e;
                y01 y01Var = (y01) this.f11874b;
                Context context = (Context) this.f11875c;
                h21 h21Var = y01Var.f12705d;
                xv0 b10 = y01Var.f12702a.b();
                if (b10 == null) {
                    h21Var.b(15004);
                    return "";
                }
                String d2 = b10.d(context, view, activity);
                if (d2 != null) {
                    return d2;
                }
                h21Var.b(15007);
                return "";
            case 4:
                y01 y01Var2 = (y01) this.f11874b;
                Context context2 = (Context) this.f11875c;
                String str3 = (String) this.f11876d;
                View view2 = (View) this.e;
                h21 h21Var2 = y01Var2.f12705d;
                xv0 b11 = y01Var2.f12702a.b();
                if (b11 == null) {
                    h21Var2.b(15004);
                    return "";
                }
                String f10 = b11.f(context2, str3, view2, null);
                if (f10 != null) {
                    return f10;
                }
                h21Var2.b(15008);
                return "";
            case 5:
                View view3 = (View) this.f11876d;
                Activity activity2 = (Activity) this.e;
                c11 c11Var = (c11) this.f11874b;
                Context context3 = (Context) this.f11875c;
                HashMap hashMap = new HashMap();
                c11Var.f4947f.f(20106, new iz(c11Var, hashMap, context3, view3, activity2));
                String h3 = c11Var.h(hashMap);
                hashMap.clear();
                return h3;
            case 6:
                c11 c11Var2 = (c11) this.f11874b;
                Context context4 = (Context) this.f11875c;
                String str4 = (String) this.f11876d;
                View view4 = (View) this.e;
                HashMap hashMap2 = new HashMap();
                c11Var2.f4947f.f(20106, new iz(c11Var2, hashMap2, context4, view4, str4));
                String h10 = c11Var2.h(hashMap2);
                hashMap2.clear();
                return h10;
            default:
                ((q11) this.f11874b).f9704a.a((vy0) this.f11875c, (byte[]) this.f11876d, (byte[]) this.e);
                return null;
        }
    }
}
