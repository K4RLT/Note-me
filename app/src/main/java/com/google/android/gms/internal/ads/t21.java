package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class t21 implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ bj0 f11230u;

    public /* synthetic */ t21(bj0 bj0Var) {
        this.f11230u = bj0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bj0 bj0Var = this.f11230u;
        ((w91) bj0Var.f4807x).b("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        bj0Var.a(new t81(this, 28, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bj0 bj0Var = this.f11230u;
        ((w91) bj0Var.f4807x).b("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        bj0Var.a(new qu0(9, this));
    }
}
