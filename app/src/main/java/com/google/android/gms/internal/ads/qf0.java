package com.google.android.gms.internal.ads;
import eb.y;
import f9.k;
import g9.n1;
import g9.r;
import j9.m;
import k9.a0;
import l9.a;
import l9.i;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final class qf0 implements m, a10 {
    public long A;
    public n1 B;
    public boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9833u;

    /* renamed from: v, reason: collision with root package name */
    public final a f9834v;

    /* renamed from: w, reason: collision with root package name */
    public nf0 f9835w;

    /* renamed from: x, reason: collision with root package name */
    public h00 f9836x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9837y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9838z;

    public qf0(Context context, a aVar) {
        this.f9833u = context;
        this.f9834v = aVar;
    }

    @Override // m
    public final void R0() {
    }

    @Override // m
    public final void T1() {
    }

    public final synchronized void a(n1 n1Var, np npVar, cp cpVar, np npVar2) {
        if (!c(n1Var)) {
            return;
        }
        try {
            k kVar = k.C;
            fp fpVar = kVar.f16814d;
            h00 e = fp.e(this.f9833u, new x0(0, 0, 0), "", false, false, null, null, this.f9834v, null, null, new jj(), null, null, null, null, null);
            this.f9836x = e;
            x00 j02 = e.j0();
            if (j02 == null) {
                int i = a0.f19634b;
                i.f("Failed to obtain a web view for the ad inspector");
                try {
                    kVar.f16817h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                    n1Var.n4(x21.J(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e8) {
                    k.C.f16817h.d("InspectorUi.openInspector 3", e8);
                    return;
                }
            }
            this.B = n1Var;
            Context context = this.f9833u;
            j02.p(null, null, null, null, null, false, null, null, null, null, null, null, null, npVar, null, new cp(6, context), cpVar, npVar2, null, null, null, null, null);
            j02.A = this;
            this.f9836x.loadUrl((String) r.e.f17698c.a(sl.f10826la));
            y.c(context, new AdOverlayInfoParcel(this, this.f9836x, this.f9834v), true, null);
            kVar.f16819k.getClass();
            this.A = System.currentTimeMillis();
        } catch (o00 e10) {
            int i10 = a0.f19634b;
            i.g("Failed to obtain a web view for the ad inspector", e10);
            try {
                k.C.f16817h.d("InspectorUi.openInspector 0", e10);
                n1Var.n4(x21.J(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e11) {
                k.C.f16817h.d("InspectorUi.openInspector 1", e11);
            }
        }
    }

    public final synchronized void b() {
        if (this.f9837y && this.f9838z) {
            xx.f12655f.execute(new e40(10, this));
        }
    }

    public final synchronized boolean c(n1 n1Var) {
        if (!((Boolean) r.e.f17698c.a(sl.f10811ka)).booleanValue()) {
            int i = a0.f19634b;
            i.f("Ad inspector had an internal error.");
            try {
                n1Var.n4(x21.J(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f9835w == null) {
            int i10 = a0.f19634b;
            i.f("Ad inspector had an internal error.");
            try {
                k.C.f16817h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                n1Var.n4(x21.J(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f9837y && !this.f9838z) {
            k.C.f16819k.getClass();
            if (System.currentTimeMillis() >= this.A + ((Integer) r1.f17698c.a(sl.f10858na)).intValue()) {
                return true;
            }
        }
        int i11 = a0.f19634b;
        i.f("Ad inspector cannot be opened because it is already open.");
        try {
            n1Var.n4(x21.J(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // m
    public final synchronized void d() {
        this.f9838z = true;
        b();
    }

    @Override // m
    public final void g2() {
    }

    @Override // com.google.android.gms.internal.ads.a10
    public final synchronized void h(String str, int i, String str2, boolean z3) {
        if (z3) {
            a0.k("Ad inspector loaded.");
            this.f9837y = true;
            b();
            return;
        }
        int i10 = a0.f19634b;
        i.f("Ad inspector failed to load.");
        try {
            px pxVar = k.C.f16817h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            pxVar.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb2.toString()));
            n1 n1Var = this.B;
            if (n1Var != null) {
                n1Var.n4(x21.J(17, null, null));
            }
        } catch (RemoteException e) {
            k.C.f16817h.d("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.C = true;
        this.f9836x.destroy();
    }

    @Override // m
    public final synchronized void i4(int i) {
        this.f9836x.destroy();
        if (!this.C) {
            a0.k("Inspector closed.");
            n1 n1Var = this.B;
            if (n1Var != null) {
                try {
                    n1Var.n4(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f9838z = false;
        this.f9837y = false;
        this.A = 0L;
        this.C = false;
        this.B = null;
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

    @Override // m
    public final void z1() {
    }
}
