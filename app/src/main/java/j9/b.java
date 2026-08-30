package j9;

import a6.x;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.f90;
import com.google.android.gms.internal.ads.ii;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.yt;
import eb.y;
import g9.r;
import k9.a0;
import k9.f0;

/* loaded from: classes.dex */
public final class b extends yt implements ii {
    public final boolean A;

    /* renamed from: v, reason: collision with root package name */
    public final AdOverlayInfoParcel f19059v;

    /* renamed from: w, reason: collision with root package name */
    public final Activity f19060w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19061x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19062y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19063z = false;
    public boolean B = false;
    public boolean C = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z3 = false;
        this.f19059v = adOverlayInfoParcel;
        this.f19060w = activity;
        nl nlVar = sl.H5;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if ((((Boolean) qlVar.a(nlVar)).booleanValue() || ((Boolean) qlVar2.a(sl.I5)).booleanValue() || ((Boolean) qlVar2.a(sl.M5)).booleanValue()) && (eVar = adOverlayInfoParcel.f4263u) != null && eVar.D && Build.MANUFACTURER.matches((String) qlVar2.a(sl.K5)) && Build.MODEL.matches((String) qlVar2.a(sl.L5))) {
            z3 = true;
        }
        this.A = z3;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void D() {
        if (this.f19060w.isFinishing()) {
            v4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void F0(Bundle bundle) {
        m mVar;
        nl nlVar = sl.f10780ia;
        r rVar = r.e;
        boolean booleanValue = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        Activity activity = this.f19060w;
        if (booleanValue && !this.f19063z) {
            activity.requestWindowFeature(1);
        }
        boolean z3 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z3 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19059v;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z3) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            g9.a aVar = adOverlayInfoParcel.f4264v;
            if (aVar != null) {
                aVar.L();
            }
            f90 f90Var = adOverlayInfoParcel.O;
            if (f90Var != null) {
                f90Var.M();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (mVar = adOverlayInfoParcel.f4265w) != null) {
                mVar.d();
            }
        }
        if (this.A) {
            if (((Boolean) rVar.f17698c.a(sl.M5)).booleanValue()) {
                f9.k.C.f16816g.g(this);
            }
        }
        e eVar = adOverlayInfoParcel.f4263u;
        c cVar = adOverlayInfoParcel.C;
        y yVar = f9.k.C.f16811a;
        a aVar2 = eVar.C;
        Activity activity2 = this.f19060w;
        if (!y.g(activity2, eVar, cVar, aVar2, null, "")) {
            activity2.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q0() {
        this.f19063z = true;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void a() {
        m mVar = this.f19059v.f4265w;
        if (mVar != null) {
            mVar.o3();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final boolean b() {
        if (((Boolean) r.e.f17698c.a(sl.I5)).booleanValue() && this.A && this.B) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void c2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f19061x);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f() {
        if (this.f19061x) {
            a0.k("LauncherOverlay finishing activity");
            this.f19060w.finish();
            return;
        }
        this.f19061x = true;
        this.B = true;
        m mVar = this.f19059v.f4265w;
        if (mVar != null) {
            mVar.v2();
        }
        if (this.A) {
            if (((Boolean) r.e.f17698c.a(sl.H5)).booleanValue()) {
                f0.f19676l.postDelayed(new x(23, this), ((Integer) r1.f17698c.a(sl.J5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f0() {
        if (this.f19060w.isFinishing()) {
            v4();
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void g0(boolean z3) {
        if (z3) {
            if (this.C) {
                int i = a0.f19634b;
                l9.i.a("Foregrounded: finishing activity from LauncherOverlay");
                this.f19060w.finish();
                return;
            }
            return;
        }
        this.C = true;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void i() {
        this.B = false;
        m mVar = this.f19059v.f4265w;
        if (mVar != null) {
            mVar.T1();
        }
        if (this.f19060w.isFinishing()) {
            v4();
        }
    }

    public final synchronized void v4() {
        try {
            if (!this.f19062y) {
                m mVar = this.f19059v.f4265w;
                if (mVar != null) {
                    mVar.i4(4);
                }
                this.f19062y = true;
                if (this.A) {
                    if (((Boolean) r.e.f17698c.a(sl.M5)).booleanValue()) {
                        f9.k.C.f16816g.i(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Y(oa.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void W3(int i, int i10, Intent intent) {
    }
}
