package com.google.android.gms.internal.ads;
import g9.z2;
import k9.a0;
import l9.i;
import oa.b;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class we0 implements oe0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12219a;

    /* renamed from: b, reason: collision with root package name */
    public final tf f12220b;

    /* renamed from: c, reason: collision with root package name */
    public final mp0 f12221c;

    public we0(long j10, Context context, tf tfVar, y10 y10Var, String str) {
        this.f12219a = j10;
        this.f12220b = tfVar;
        this.f12221c = (mp0) ((rr1) new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(y10Var.f12709b, context, str).f14822w).zzb();
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void a(z2 z2Var) {
        try {
            this.f12221c.w0(z2Var, new ue0(this));
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.i(e, "#007 Could not call remote method.");
        }
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.oe0
    public final void zzb() {
        try {
            mp0 mp0Var = this.f12221c;
            mp0Var.B2(new ve0(this));
            mp0Var.Y0(new b(null));
        } catch (RemoteException e) {
            int i = a0.f19634b;
            i.i(e, "#007 Could not call remote method.");
        }
    }
}
