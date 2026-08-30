package com.google.android.gms.internal.ads;
import ac.a;
import f9.k;
import g9.r;
import j9.m;
import l9.a;
import n.r0;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t90 implements k70, m, b70 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f11293u;

    /* renamed from: v, reason: collision with root package name */
    public final h00 f11294v;

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f11295w;

    /* renamed from: x, reason: collision with root package name */
    public final a f11296x;

    /* renamed from: y, reason: collision with root package name */
    public final ai0 f11297y;

    /* renamed from: z, reason: collision with root package name */
    public bi0 f11298z;

    public t90(Context context, h00 h00Var, qp0 qp0Var, a aVar, ai0 ai0Var) {
        this.f11293u = context;
        this.f11294v = h00Var;
        this.f11295w = qp0Var;
        this.f11296x = aVar;
        this.f11297y = ai0Var;
    }

    @Override // m
    public final void R0() {
    }

    @Override // m
    public final void T1() {
    }

    public final boolean a() {
        xt0 xt0Var;
        if (((Boolean) r.e.f17698c.a(sl.f10807k6)).booleanValue()) {
            ai0 ai0Var = this.f11297y;
            synchronized (ai0Var) {
                xt0Var = ai0Var.f4516f;
            }
            if (xt0Var != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, r0] */
    @Override // m
    public final void d() {
        h00 h00Var;
        if (!((Boolean) r.e.f17698c.a(sl.f10854n6)).booleanValue() && (h00Var = this.f11294v) != 0) {
            if (this.f11298z != null || a()) {
                if (this.f11298z != null) {
                    h00Var.b("onSdkImpression", new r0(0));
                } else {
                    this.f11297y.c();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, r0] */
    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        h00 h00Var;
        String str;
        qp0 qp0Var = this.f11295w;
        if (qp0Var.T && (h00Var = this.f11294v) != 0) {
            k kVar = k.C;
            v80 v80Var = kVar.f16832x;
            v80 v80Var2 = kVar.f16832x;
            v80Var.getClass();
            if (v80.d(this.f11293u)) {
                if (a()) {
                    this.f11297y.b();
                    return;
                }
                a aVar = this.f11296x;
                int i = aVar.f20030v;
                int i10 = aVar.f20031w;
                int i11 = 1;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
                sb2.append(i);
                sb2.append(".");
                sb2.append(i10);
                String sb3 = sb2.toString();
                jk0 jk0Var = qp0Var.V;
                if (jk0Var.G() - 1 != 1) {
                    str = "javascript";
                } else {
                    str = null;
                }
                String str2 = str;
                int i12 = 2;
                if (jk0Var.G() == 1) {
                    i11 = 3;
                } else if (qp0Var.Y == 2) {
                    i12 = 4;
                } else {
                    i12 = 1;
                }
                int i13 = i12;
                int i14 = i11;
                String str3 = qp0Var.l0;
                WebView u9 = h00Var.u();
                v80Var2.getClass();
                bi0 f10 = v80.f(i13, i14, u9, sb3, str2, str3);
                this.f11298z = f10;
                if (f10 != null) {
                    tt0 tt0Var = f10.f4801a;
                    if (((Boolean) r.e.f17698c.a(sl.f10792j6)).booleanValue()) {
                        WebView u10 = h00Var.u();
                        v80Var2.getClass();
                        v80.i(tt0Var, u10);
                        ArrayList p02 = h00Var.p0();
                        int size = p02.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = p02.get(i15);
                            i15++;
                            k.C.f16832x.getClass();
                            v80.p(new a(tt0Var, 18, (View) obj));
                        }
                    } else {
                        View U = h00Var.U();
                        v80Var2.getClass();
                        v80.i(tt0Var, U);
                    }
                    h00Var.S0(this.f11298z);
                    k.C.f16832x.getClass();
                    v80.g(tt0Var);
                    h00Var.b("onSdkLoaded", new r0(0));
                }
            }
        }
    }

    @Override // m
    public final void g2() {
    }

    @Override // m
    public final void i4(int i) {
        this.f11298z = null;
    }

    @Override // m
    public final void o3() {
    }

    @Override // m
    public final void r0() {
    }

    @Override // m
    public final void t1() {
    }

    @Override // m
    public final void u2() {
    }

    @Override // m
    public final void v2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, r0] */
    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        h00 h00Var;
        if (a()) {
            this.f11297y.c();
        } else if (this.f11298z != null && (h00Var = this.f11294v) != 0) {
            if (((Boolean) r.e.f17698c.a(sl.f10854n6)).booleanValue()) {
                h00Var.b("onSdkImpression", new r0(0));
            }
        }
    }

    @Override // m
    public final void z1() {
    }
}
