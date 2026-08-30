package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.c0;
import r.e;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class sx implements ii {

    /* renamed from: v, reason: collision with root package name */
    public final k9.c0 f11184v;

    /* renamed from: w, reason: collision with root package name */
    public final z11 f11185w;

    /* renamed from: x, reason: collision with root package name */
    public final qx f11186x;

    /* renamed from: u, reason: collision with root package name */
    public final Object f11183u = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f11187y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f11188z = new HashSet();
    public boolean A = false;

    public sx(String str, k9.c0 c0Var) {
        this.f11186x = new qx(str, c0Var);
        this.f11184v = c0Var;
        z11 z11Var = new z11(5, false);
        z11Var.f13046v = BigInteger.ONE;
        z11Var.f13047w = "0";
        this.f11185w = z11Var;
    }

    public final void a(lx lxVar) {
        synchronized (this.f11183u) {
            this.f11187y.add(lxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void g0(boolean z3) {
        long j10;
        int i;
        f9.k.C.f16819k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        k9.c0 c0Var = this.f11184v;
        if (z3) {
            c0Var.i();
            synchronized (c0Var.f19642a) {
                j10 = c0Var.f19654o;
            }
            long j11 = currentTimeMillis - j10;
            long longValue = ((Long) g9.r.e.f17698c.a(sl.C1)).longValue();
            qx qxVar = this.f11186x;
            if (j11 > longValue) {
                qxVar.f10014d = -1;
            } else {
                c0Var.i();
                synchronized (c0Var.f19642a) {
                    i = c0Var.f19656q;
                }
                qxVar.f10014d = i;
            }
            this.A = true;
            return;
        }
        c0Var.i();
        synchronized (c0Var.f19642a) {
            try {
                if (c0Var.f19654o != currentTimeMillis) {
                    c0Var.f19654o = currentTimeMillis;
                    SharedPreferences.Editor editor = c0Var.f19647g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        c0Var.f19647g.apply();
                    }
                    c0Var.j();
                }
            } finally {
            }
        }
        int i10 = this.f11186x.f10014d;
        c0Var.i();
        synchronized (c0Var.f19642a) {
            try {
                if (c0Var.f19656q == i10) {
                    return;
                }
                c0Var.f19656q = i10;
                SharedPreferences.Editor editor2 = c0Var.f19647g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i10);
                    c0Var.f19647g.apply();
                }
                c0Var.j();
            } finally {
            }
        }
    }
}
