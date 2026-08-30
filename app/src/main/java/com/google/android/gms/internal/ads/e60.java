package com.google.android.gms.internal.ads;
import g9.r;
import h9.c;
import j6.s;
import l9.d;
import la.a;
import oa.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e60 implements k70, c70, b70 {
    public final be0 A;
    public final String B;
    public final b60 C;

    /* renamed from: u, reason: collision with root package name */
    public final Context f5597u;

    /* renamed from: v, reason: collision with root package name */
    public qu f5598v;

    /* renamed from: w, reason: collision with root package name */
    public qu f5599w;

    /* renamed from: x, reason: collision with root package name */
    public final qp0 f5600x;

    /* renamed from: y, reason: collision with root package name */
    public final h00 f5601y;

    /* renamed from: z, reason: collision with root package name */
    public final a f5602z;

    public e60(Context context, qp0 qp0Var, h00 h00Var, wp0 wp0Var, a aVar, be0 be0Var, b60 b60Var) {
        this.f5597u = context;
        this.f5600x = qp0Var;
        this.f5601y = h00Var;
        this.f5602z = aVar;
        this.A = be0Var;
        this.C = b60Var;
        this.B = ((sp0) wp0Var.f12313b.f11471w).f11091b;
    }

    public final void a(long j10, Bundle bundle, String str, String str2) {
        String str3;
        String str4 = null;
        if (bundle != null) {
            str3 = new d().l(bundle, new JSONObject()).toString();
        } else {
            str3 = null;
        }
        this.f5602z.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (str3 != null) {
            str4 = Base64.encodeToString(str3.getBytes(), 1);
        }
        if (!((Boolean) r.e.f17698c.a(sl.se)).booleanValue()) {
            return;
        }
        s a10 = this.A.a();
        a10.k("action", str);
        a10.k("ppwpfl", String.valueOf(elapsedRealtime));
        a10.k("ppwpfst", str2);
        String str5 = this.B;
        if (str5 != null) {
            a10.k("gqi", str5);
        }
        if (str4 != null) {
            a10.k("ppwpferr", str4);
        }
        a10.n();
    }

    public final void b(boolean z3, boolean z9) {
        h00 h00Var;
        Activity f10;
        du duVar = this.f5600x.f9931d0;
        if (duVar == null) {
            return;
        }
        if (z3) {
            String str = duVar.e;
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("targetPackage", str);
                bundle.putString("referrer", duVar.f5520g);
                bundle.putBundle("extra_query_params", duVar.f5521h);
                if (z9 && (h00Var = this.f5601y) != null && (f10 = h00Var.f()) != null && f10.getWindow() != null && f10.getWindow().getDecorView() != null) {
                    bundle.putBinder("window_token", f10.getWindow().getDecorView().getWindowToken());
                }
                d("ppfla", bundle);
                return;
            }
        }
        d("ppwla", null);
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void c(Context context) {
        du duVar = this.f5600x.f9931d0;
        if (duVar != null && g()) {
            if (((Boolean) r.e.f17698c.a(sl.f10928re)).booleanValue()) {
                String str = duVar.e;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        b60 b60Var = this.C;
                        Context context2 = this.f5597u;
                        c a10 = b60Var.a(context2);
                        if (a10 != null) {
                            a10.endSession(new b(context2), str);
                        }
                    } catch (Throwable th) {
                        f("invokeEndSession", th);
                    }
                }
            }
        }
    }

    public final void d(String str, Bundle bundle) {
        try {
            this.f5602z.getClass();
            d60 d60Var = new d60(this, str, SystemClock.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            b60 b60Var = this.C;
            Context context = this.f5597u;
            c a10 = b60Var.a(context);
            if (a10 != null) {
                a10.prewarm(new b(context), arrayList, d60Var);
            }
        } catch (Throwable th) {
            f("invokeHsdpPrewarmOrPrefetch", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        du duVar = this.f5600x.f9931d0;
        if (duVar != null && duVar.f5515a) {
            if (g()) {
                if (h(1)) {
                    b(h(2), ((Boolean) r.e.f17698c.a(sl.f10989ve)).booleanValue());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str = duVar.f5516b;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
    }

    public final void f(String str, Throwable th) {
        boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.f10958te)).booleanValue();
        Context context = this.f5597u;
        if (booleanValue) {
            if (this.f5599w == null) {
                this.f5599w = pu.e(context);
            }
            this.f5599w.c("HsdpServiceUnsampled.".concat(str), th);
        } else {
            if (this.f5598v == null) {
                this.f5598v = pu.a(context);
            }
            this.f5598v.c("HsdpService.".concat(str), th);
        }
    }

    public final boolean g() {
        du duVar;
        if (((Boolean) r.e.f17698c.a(sl.f10913qe)).booleanValue() && (duVar = this.f5600x.f9931d0) != null && duVar.f5518d) {
            return true;
        }
        return false;
    }

    public final boolean h(int i) {
        du duVar = this.f5600x.f9931d0;
        return (duVar == null || (i & duVar.f5519f) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void o(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void w(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        du duVar = this.f5600x.f9931d0;
        if (duVar != null && duVar.f5515a) {
            if (g()) {
                if (h(4)) {
                    b(h(8), ((Boolean) r.e.f17698c.a(sl.f10974ue)).booleanValue());
                    return;
                }
                return;
            }
            if (h(256)) {
                ArrayList arrayList = new ArrayList();
                if (h(512)) {
                    String str = duVar.f5516b;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
    }
}
