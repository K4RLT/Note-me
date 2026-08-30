package com.google.android.gms.internal.ads;
import f9.k;
import fa.y;
import g9.o1;
import g9.q1;
import g9.r;
import g9.v1;
import g9.z2;
import k9.a0;
import k9.f0;
import l9.a;
import l9.i;
import oa.a;
import oa.b;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mp0 extends uv {
    public final l9.a A;
    public final of B;
    public final be0 C;
    public yc0 D;
    public boolean E;

    /* renamed from: v, reason: collision with root package name */
    public final kp0 f8392v;

    /* renamed from: w, reason: collision with root package name */
    public final hp0 f8393w;

    /* renamed from: x, reason: collision with root package name */
    public final String f8394x;

    /* renamed from: y, reason: collision with root package name */
    public final xp0 f8395y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f8396z;

    public mp0(String str, kp0 kp0Var, Context context, hp0 hp0Var, xp0 xp0Var, l9.a aVar, of ofVar, be0 be0Var) {
        this.f8394x = str;
        this.f8392v = kp0Var;
        this.f8393w = hp0Var;
        this.f8395y = xp0Var;
        this.f8396z = context;
        this.A = aVar;
        nl nlVar = sl.f10833m1;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.E = true;
        } else {
            this.E = ((Boolean) rVar.f17698c.a(sl.f10817l1)).booleanValue();
        }
        this.B = ofVar;
        this.C = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void B2(zv zvVar) {
        fa.y.d("#008 Must be called on the main UI thread.");
        this.f8393w.f6866x.set(zvVar);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void D1(g9.o1 o1Var) {
        hp0 hp0Var = this.f8393w;
        if (o1Var == null) {
            hp0Var.f6864v.set(null);
        } else {
            hp0Var.f6864v.set(new lp0(this, o1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void J3(hw hwVar) {
        fa.y.d("#008 Must be called on the main UI thread.");
        xp0 xp0Var = this.f8395y;
        xp0Var.f12600a = hwVar.f6903u;
        xp0Var.f12601b = hwVar.f6904v;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void L1(oa.a aVar, boolean z3) {
        fa.y.d("#008 Must be called on the main UI thread.");
        if (this.D == null) {
            int i = k9.a0.f19634b;
            l9.i.f("Rewarded can not be shown before loaded");
            this.f8393w.o(x21.J(9, null, null));
        } else {
            if (((Boolean) g9.r.e.f17698c.a(sl.C3)).booleanValue()) {
                this.B.f9103b.e(new Throwable().getStackTrace());
            }
            this.D.c((Activity) oa.b.z1(aVar), z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void V3(boolean z3) {
        fa.y.d("setImmersiveMode must be called on the main UI thread.");
        this.E = z3;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void X(long j10) {
        c60 c60Var;
        yc0 yc0Var = this.D;
        if (yc0Var != null && (c60Var = yc0Var.f13074j) != null) {
            c60Var.a(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void Y0(oa.a aVar) {
        L1(aVar, this.E);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void Y3(g9.z2 z2Var, dw dwVar) {
        v4(z2Var, dwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Bundle b() {
        Bundle bundle;
        fa.y.d("#008 Must be called on the main UI thread.");
        yc0 yc0Var = this.D;
        if (yc0Var != null) {
            n70 n70Var = yc0Var.f12846q;
            synchronized (n70Var) {
                bundle = new Bundle(n70Var.f8582w);
            }
            return bundle;
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final boolean d() {
        fa.y.d("#008 Must be called on the main UI thread.");
        yc0 yc0Var = this.D;
        if (yc0Var != null && !yc0Var.f12852w) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void e1(ew ewVar) {
        fa.y.d("#008 Must be called on the main UI thread.");
        this.f8393w.f6868z.set(ewVar);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void f4(g9.q1 q1Var) {
        fa.y.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!q1Var.b()) {
                this.C.b();
            }
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f8393w.B.set(q1Var);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized String g() {
        yc0 yc0Var = this.D;
        if (yc0Var != null) {
            return yc0Var.f13071f.f9412u;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final g9.v1 h() {
        yc0 yc0Var;
        if (((Boolean) g9.r.e.f17698c.a(sl.F7)).booleanValue() && (yc0Var = this.D) != null) {
            return yc0Var.f13071f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final sv i() {
        fa.y.d("#008 Must be called on the main UI thread.");
        yc0 yc0Var = this.D;
        if (yc0Var != null) {
            return yc0Var.f12848s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final String m() {
        return this.f8394x;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized long q() {
        c60 c60Var;
        yc0 yc0Var = this.D;
        if (yc0Var != null && (c60Var = yc0Var.f13074j) != null) {
            return c60Var.f5014a.get();
        }
        return 0L;
    }

    public final synchronized void v4(g9.z2 z2Var, dw dwVar, int i) {
        try {
            if (!z2Var.b()) {
                boolean z3 = false;
                if (((Boolean) um.f11684k.p()).booleanValue()) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                        z3 = true;
                    }
                }
                if (this.A.f20031w < ((Integer) g9.r.e.f17698c.a(sl.Dc)).intValue() || !z3) {
                    fa.y.d("#008 Must be called on the main UI thread.");
                }
            }
            hp0 hp0Var = this.f8393w;
            hp0Var.f6865w.set(dwVar);
            k9.f0 f0Var = f9.k.C.f16813c;
            if (k9.f0.h(this.f8396z) && z2Var.M == null) {
                int i10 = k9.a0.f19634b;
                l9.i.c("Failed to load the ad because app ID is missing.");
                hp0Var.x(x21.J(4, null, null));
            } else {
                if (this.D != null) {
                    return;
                }
                an1 an1Var = new an1(19);
                kp0 kp0Var = this.f8392v;
                kp0Var.f7840h.f13238o.f2825v = i;
                kp0Var.a(z2Var, this.f8394x, an1Var, new jk0(27, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final synchronized void w0(g9.z2 z2Var, dw dwVar) {
        v4(z2Var, dwVar, 2);
    }
}
