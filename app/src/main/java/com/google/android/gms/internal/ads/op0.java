package com.google.android.gms.internal.ads;
import fa.y;
import g9.r;
import oa.a;
import oa.b;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class op0 extends ph {

    /* renamed from: u, reason: collision with root package name */
    public final kp0 f9189u;

    /* renamed from: v, reason: collision with root package name */
    public final hp0 f9190v;

    /* renamed from: w, reason: collision with root package name */
    public final xp0 f9191w;

    /* renamed from: x, reason: collision with root package name */
    public yc0 f9192x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9193y;

    public op0(kp0 kp0Var, hp0 hp0Var, xp0 xp0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f9193y = false;
        this.f9189u = kp0Var;
        this.f9190v = hp0Var;
        this.f9191w = xp0Var;
    }

    public final synchronized void B1(a aVar) {
        try {
            y.d("showAd must be called on the main UI thread.");
            if (this.f9192x != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object z12 = b.z1(aVar);
                    if (z12 instanceof Activity) {
                        activity = (Activity) z12;
                    }
                }
                this.f9192x.c(activity, this.f9193y);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void J0(a aVar) {
        Context context;
        y.d("resume must be called on the main UI thread.");
        if (this.f9192x != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.z1(aVar);
            }
            e70 e70Var = this.f9192x.f13069c;
            e70Var.getClass();
            e70Var.P1(new d70(context));
        }
    }

    public final synchronized void Q(a aVar) {
        Context context;
        y.d("pause must be called on the main UI thread.");
        if (this.f9192x != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.z1(aVar);
            }
            e70 e70Var = this.f9192x.f13069c;
            e70Var.getClass();
            e70Var.P1(new rl(context, 1));
        }
    }

    public final synchronized void g4(a aVar) {
        y.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f9190v.f6864v.set(null);
        if (this.f9192x != null) {
            if (aVar != null) {
                context = (Context) b.z1(aVar);
            }
            e70 e70Var = this.f9192x.f13069c;
            e70Var.getClass();
            e70Var.P1(new ll(context, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x021e, code lost:
    
        if (java.util.regex.Pattern.matches(r2, r7) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0243, code lost:
    
        if (((java.lang.Boolean) r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10981v6)).booleanValue() == false) goto L163;
     */
    @Override // com.google.android.gms.internal.ads.ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u4(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.op0.u4(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final synchronized boolean v4() {
        yc0 yc0Var = this.f9192x;
        if (yc0Var != null) {
            if (!yc0Var.f12847r.f6602v.get()) {
                return true;
            }
        }
        return false;
    }
}
