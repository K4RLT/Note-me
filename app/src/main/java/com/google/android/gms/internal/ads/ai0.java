package com.google.android.gms.internal.ads;
import ac.a;
import f9.k;
import g9.r;
import j6.s;
import k9.a0;
import l9.a;
import l9.i;
import r.e;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ai0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4512a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.a f4513b;

    /* renamed from: c, reason: collision with root package name */
    public final qp0 f4514c;

    /* renamed from: d, reason: collision with root package name */
    public final h00 f4515d;
    public final be0 e;

    /* renamed from: f, reason: collision with root package name */
    public xt0 f4516f;

    public ai0(Context context, l9.a aVar, qp0 qp0Var, h00 h00Var, be0 be0Var) {
        this.f4512a = context;
        this.f4513b = aVar;
        this.f4514c = qp0Var;
        this.f4515d = h00Var;
        this.e = be0Var;
    }

    public final synchronized boolean a() {
        h00 h00Var;
        String str;
        qp0 qp0Var = this.f4514c;
        if (qp0Var.T) {
            nl nlVar = sl.f10760h6;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                if (((Boolean) rVar.f17698c.a(sl.f10807k6)).booleanValue() && (h00Var = this.f4515d) != null) {
                    if (this.f4516f != null) {
                        int i = k9.a0.f19634b;
                        l9.i.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f4512a;
                    f9.k kVar = f9.k.C;
                    kVar.f16832x.getClass();
                    if (!v80.d(context)) {
                        int i10 = k9.a0.f19634b;
                        l9.i.f("Unable to initialize omid.");
                        return false;
                    }
                    jk0 jk0Var = qp0Var.V;
                    jk0Var.getClass();
                    if (((JSONObject) jk0Var.f7466v).optBoolean((String) rVar.f17698c.a(sl.f10837m6), true)) {
                        l9.a aVar = this.f4513b;
                        v80 v80Var = kVar.f16832x;
                        WebView u9 = h00Var.u();
                        v80Var.getClass();
                        xt0 xt0Var = (xt0) v80.o(new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(aVar, 7, u9));
                        if (((Boolean) rVar.f17698c.a(sl.f10822l6)).booleanValue()) {
                            be0 be0Var = this.e;
                            if (xt0Var != null) {
                                str = "1";
                            } else {
                                str = "0";
                            }
                            j6.s a10 = be0Var.a();
                            a10.k("omid_js_session_success", str);
                            a10.l();
                        }
                        if (xt0Var == null) {
                            int i11 = k9.a0.f19634b;
                            l9.i.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i12 = k9.a0.f19634b;
                        l9.i.e("Created omid javascript session service.");
                        this.f4516f = xt0Var;
                        h00Var.M0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        h00 h00Var;
        try {
            xt0 xt0Var = this.f4516f;
            if (xt0Var != null && (h00Var = this.f4515d) != null) {
                ArrayList p02 = h00Var.p0();
                int size = p02.size();
                int i = 0;
                while (i < size) {
                    Object obj = p02.get(i);
                    i++;
                    f9.k.C.f16832x.getClass();
                    v80.p(new ac.a(xt0Var, 19, (View) obj));
                }
                h00Var.b("onSdkLoaded", d61.A);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        h00 h00Var;
        if (this.f4516f != null && (h00Var = this.f4515d) != null) {
            h00Var.b("onSdkImpression", d61.A);
        }
    }
}
