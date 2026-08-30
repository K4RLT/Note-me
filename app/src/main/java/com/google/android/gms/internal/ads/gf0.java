package com.google.android.gms.internal.ads;
import g9.e3;
import g9.p;
import g9.r;
import g9.y1;
import k9.a0;
import l9.i;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gf0 implements v60, a80, m70 {
    public y1 A;
    public JSONObject E;
    public JSONObject F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: u, reason: collision with root package name */
    public final nf0 f6387u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6388v;

    /* renamed from: w, reason: collision with root package name */
    public final String f6389w;

    /* renamed from: z, reason: collision with root package name */
    public p60 f6392z;
    public String B = "";
    public String C = "";
    public String D = "";

    /* renamed from: x, reason: collision with root package name */
    public int f6390x = 0;

    /* renamed from: y, reason: collision with root package name */
    public ff0 f6391y = ff0.f6055u;

    public gf0(nf0 nf0Var, aq0 aq0Var, String str) {
        this.f6387u = nf0Var;
        this.f6389w = str;
        this.f6388v = aq0Var.f4583g;
    }

    public static JSONObject c(y1 y1Var) {
        JSONObject c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", y1Var.f17716w);
        jSONObject.put("errorCode", y1Var.f17714u);
        jSONObject.put("errorDescription", y1Var.f17715v);
        y1 y1Var2 = y1Var.f17717x;
        if (y1Var2 == null) {
            c10 = null;
        } else {
            c10 = c(y1Var2);
        }
        jSONObject.put("underlyingError", c10);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.m70
    public final void C(z40 z40Var) {
        nf0 nf0Var = this.f6387u;
        if (nf0Var.f()) {
            this.f6392z = z40Var.f13071f;
            this.f6391y = ff0.f6056v;
            if (((Boolean) r.e.f17698c.a(sl.Ia)).booleanValue()) {
                nf0Var.c(this.f6388v, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        nf0 nf0Var = this.f6387u;
        if (nf0Var.f()) {
            tw twVar = wp0Var.f12313b;
            List list = (List) twVar.f11470v;
            int i = 0;
            if (!list.isEmpty()) {
                this.f6390x = ((qp0) list.get(0)).f9926b;
            }
            sp0 sp0Var = (sp0) twVar.f11471w;
            String str = sp0Var.f11099l;
            if (!TextUtils.isEmpty(str)) {
                this.B = str;
            }
            String str2 = sp0Var.f11100m;
            if (!TextUtils.isEmpty(str2)) {
                this.C = str2;
            }
            JSONObject jSONObject = sp0Var.f11103p;
            if (jSONObject.length() > 0) {
                this.F = jSONObject;
            }
            nl nlVar = sl.Ea;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                if (nf0Var.f8708w < ((Long) rVar.f17698c.a(sl.Fa)).longValue()) {
                    String str3 = sp0Var.f11101n;
                    if (!TextUtils.isEmpty(str3)) {
                        this.D = str3;
                    }
                    JSONObject jSONObject2 = sp0Var.f11102o;
                    if (jSONObject2.length() > 0) {
                        this.E = jSONObject2;
                    }
                    JSONObject jSONObject3 = this.E;
                    if (jSONObject3 != null) {
                        i = jSONObject3.toString().length();
                    }
                    if (!TextUtils.isEmpty(this.D)) {
                        i += this.D.length();
                    }
                    long j10 = i;
                    synchronized (nf0Var) {
                        nf0Var.f8708w += j10;
                    }
                    return;
                }
                this.I = true;
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f6391y);
        jSONObject2.put("format", qp0.a(this.f6390x));
        if (((Boolean) r.e.f17698c.a(sl.Ia)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.G);
            if (this.G) {
                jSONObject2.put("shown", this.H);
            }
        }
        p60 p60Var = this.f6392z;
        if (p60Var != null) {
            jSONObject = b(p60Var);
        } else {
            y1 y1Var = this.A;
            JSONObject jSONObject3 = null;
            if (y1Var != null && (iBinder = y1Var.f17718y) != null) {
                p60 p60Var2 = (p60) iBinder;
                jSONObject3 = b(p60Var2);
                if (p60Var2.f9416y.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.A));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject b(p60 p60Var) {
        JSONObject c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", p60Var.f9412u);
        jSONObject.put("responseSecsSinceEpoch", p60Var.f9417z);
        jSONObject.put("responseId", p60Var.f9413v);
        nl nlVar = sl.Ba;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            String str = p60Var.A;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                int i = a0.f19634b;
                i.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.B)) {
            jSONObject.put("adRequestUrl", this.B);
        }
        if (!TextUtils.isEmpty(this.C)) {
            jSONObject.put("postBody", this.C);
        }
        if (!TextUtils.isEmpty(this.D)) {
            jSONObject.put("adResponseBody", this.D);
        }
        Object obj = this.E;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.F;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) rVar.f17698c.a(sl.Ea)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.I);
        }
        JSONArray jSONArray = new JSONArray();
        for (e3 e3Var : p60Var.f9416y) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", e3Var.f17627u);
            jSONObject2.put("latencyMillis", e3Var.f17628v);
            if (((Boolean) r.e.f17698c.a(sl.Ca)).booleanValue()) {
                jSONObject2.put("credentials", p.f17688g.f17689a.m(e3Var.f17630x));
            }
            y1 y1Var = e3Var.f17629w;
            if (y1Var == null) {
                c10 = null;
            } else {
                c10 = c(y1Var);
            }
            jSONObject2.put("error", c10);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
        if (!((Boolean) r.e.f17698c.a(sl.Ia)).booleanValue()) {
            nf0 nf0Var = this.f6387u;
            if (nf0Var.f()) {
                nf0Var.c(this.f6388v, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(y1 y1Var) {
        nf0 nf0Var = this.f6387u;
        if (nf0Var.f()) {
            this.f6391y = ff0.f6057w;
            this.A = y1Var;
            if (((Boolean) r.e.f17698c.a(sl.Ia)).booleanValue()) {
                nf0Var.c(this.f6388v, this);
            }
        }
    }
}
