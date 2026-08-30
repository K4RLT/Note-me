package com.google.android.gms.internal.ads;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class n40 implements b70 {

    /* renamed from: u, reason: collision with root package name */
    public final h00 f8539u;

    /* renamed from: v, reason: collision with root package name */
    public final be0 f8540v;

    /* renamed from: w, reason: collision with root package name */
    public final qp0 f8541w;

    public n40(h00 h00Var, be0 be0Var, qp0 qp0Var) {
        this.f8539u = h00Var;
        this.f8540v = be0Var;
        this.f8541w = qp0Var;
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        h00 h00Var;
        String str;
        if (((Boolean) g9.r.e.f17698c.a(sl.f11037ye)).booleanValue() && (h00Var = this.f8539u) != null) {
            ViewParent parent = h00Var.U().getParent();
            while (true) {
                if (parent != null) {
                    if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                        str = "1";
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    str = "0";
                    break;
                }
            }
            j6.s a10 = this.f8540v.a();
            a10.k("action", "hcp");
            a10.k("hcp", str);
            a10.i(this.f8541w);
            a10.l();
        }
    }
}
