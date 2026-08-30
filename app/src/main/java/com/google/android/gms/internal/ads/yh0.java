package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class yh0 implements zh0 {
    public final Object A;

    /* renamed from: u, reason: collision with root package name */
    public String f12878u;

    /* renamed from: v, reason: collision with root package name */
    public int f12879v;

    /* renamed from: w, reason: collision with root package name */
    public int f12880w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f12881x;

    /* renamed from: y, reason: collision with root package name */
    public final Serializable f12882y;

    /* renamed from: z, reason: collision with root package name */
    public Object f12883z;

    public yh0(Class cls, Class[] clsArr) {
        this.f12878u = null;
        HashSet hashSet = new HashSet();
        this.f12881x = hashSet;
        this.f12882y = new HashSet();
        this.f12879v = 0;
        this.f12880w = 0;
        this.A = new HashSet();
        hashSet.add(ic.r.a(cls));
        for (Class cls2 : clsArr) {
            wa.j8.a(cls2, "Null interface");
            ((HashSet) this.f12881x).add(ic.r.a(cls2));
        }
    }

    public void a(ic.j jVar) {
        if (!((HashSet) this.f12881x).contains(jVar.f18407a)) {
            ((HashSet) this.f12882y).add(jVar);
        } else {
            q.x.n("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public ic.a b() {
        boolean z3;
        if (((ic.d) this.f12883z) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return new ic.a(this.f12878u, new HashSet((HashSet) this.f12881x), new HashSet((HashSet) this.f12882y), this.f12879v, this.f12880w, (ic.d) this.f12883z, (HashSet) this.A);
        }
        q.x.o("Missing required property: factory.");
        return null;
    }

    public void c(int i) {
        boolean z3;
        if (this.f12879v == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f12879v = i;
        } else {
            q.x.o("Instantiation type has already been set.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public Object zza() {
        String str = this.f12878u;
        String str2 = (String) this.f12881x;
        String str3 = (String) this.f12882y;
        int i = this.f12879v;
        WebView webView = (WebView) this.A;
        String str4 = (String) this.f12883z;
        int i10 = this.f12880w;
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                zt0 zt0Var = new zt0(str, str2);
                yt0 k3 = v80.k("javascript");
                yt0 k4 = v80.k(str3);
                ut0 n10 = v80.n(wd0.h(i));
                yt0 yt0Var = yt0.NONE;
                if (k3 == yt0Var) {
                    int i11 = k9.a0.f19634b;
                    l9.i.f("Omid js session error; Unable to parse impression owner: javascript");
                    return null;
                }
                if (n10 == null) {
                    String x9 = wd0.x(i);
                    int i12 = k9.a0.f19634b;
                    l9.i.f("Omid js session error; Unable to parse creative type: ".concat(x9));
                    return null;
                }
                if (n10 == ut0.VIDEO && k4 == yt0Var) {
                    String valueOf = String.valueOf(str3);
                    int i13 = k9.a0.f19634b;
                    l9.i.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf));
                    return null;
                }
                a8 a8Var = new a8(zt0Var, webView, str4, "", st0.JAVASCRIPT);
                xv0 a10 = xv0.a(n10, v80.m(wd0.i(i10)), k3, k4, true);
                if (ct.D.f8992v) {
                    return new bi0(new tt0(a10, a8Var, UUID.randomUUID().toString()), a8Var);
                }
                q.x.o("Method called before OM SDK activation");
                return null;
            }
            q.x.n("Version is null or empty");
            return null;
        }
        q.x.n("Name is null or empty");
        return null;
    }

    public /* synthetic */ yh0(String str, String str2, String str3, int i, WebView webView, String str4, int i10) {
        this.f12878u = str;
        this.f12881x = str2;
        this.f12882y = str3;
        this.f12879v = i;
        this.A = webView;
        this.f12883z = str4;
        this.f12880w = i10;
    }

    public yh0(ic.r rVar, ic.r[] rVarArr) {
        this.f12878u = null;
        HashSet hashSet = new HashSet();
        this.f12881x = hashSet;
        this.f12882y = new HashSet();
        this.f12879v = 0;
        this.f12880w = 0;
        this.A = new HashSet();
        hashSet.add(rVar);
        for (ic.r rVar2 : rVarArr) {
            wa.j8.a(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f12881x, rVarArr);
    }
}
