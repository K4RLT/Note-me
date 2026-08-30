package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class oa implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9047u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f9048v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9049w;

    public /* synthetic */ oa(u uVar, tf tfVar) {
        Objects.requireNonNull(uVar);
        this.f9049w = uVar;
        this.f9048v = tfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.measurement.i0] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object ohVar;
        com.google.android.gms.internal.measurement.i0 r52;
        int i = this.f9047u;
        Object obj = this.f9049w;
        switch (i) {
            case 0:
                an1.k("Install Referrer service connected.");
                u uVar = (u) obj;
                int i10 = sh.f10612u;
                if (iBinder == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (queryLocalInterface instanceof th) {
                        ohVar = (th) queryLocalInterface;
                    } else {
                        ohVar = new oh(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                    }
                }
                uVar.f11500x = ohVar;
                uVar.f11497u = 2;
                ((tf) this.f9048v).i(0);
                return;
            default:
                eb.t0 t0Var = (eb.t0) obj;
                if (iBinder == null) {
                    eb.k0 k0Var = t0Var.f16373b.C;
                    eb.d1.d(k0Var);
                    k0Var.D.g("Install Referrer connection returned with null binder");
                    return;
                }
                try {
                    int i11 = com.google.android.gms.internal.measurement.h0.f13766u;
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (queryLocalInterface2 instanceof com.google.android.gms.internal.measurement.i0) {
                        r52 = (com.google.android.gms.internal.measurement.i0) queryLocalInterface2;
                    } else {
                        r52 = new oh(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
                    }
                    eb.k0 k0Var2 = t0Var.f16373b.C;
                    eb.d1.d(k0Var2);
                    k0Var2.I.g("Install Referrer Service connected");
                    eb.y0 y0Var = t0Var.f16373b.D;
                    eb.d1.d(y0Var);
                    y0Var.D(new iv1(this, (com.google.android.gms.internal.measurement.i0) r52, this));
                    return;
                } catch (RuntimeException e) {
                    eb.k0 k0Var3 = t0Var.f16373b.C;
                    eb.d1.d(k0Var3);
                    k0Var3.D.f(e, "Exception occurred while calling Install Referrer API");
                    return;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f9047u) {
            case 0:
                an1.u("Install Referrer service disconnected.");
                u uVar = (u) this.f9049w;
                uVar.f11500x = null;
                uVar.f11497u = 0;
                return;
            default:
                eb.k0 k0Var = ((eb.t0) this.f9049w).f16373b.C;
                eb.d1.d(k0Var);
                k0Var.I.g("Install Referrer Service disconnected");
                return;
        }
    }

    public oa(eb.t0 t0Var, String str) {
        this.f9049w = t0Var;
        this.f9048v = str;
    }
}
