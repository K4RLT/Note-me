package com.google.android.gms.internal.ads;
import ac.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class e21 extends BroadcastReceiver implements y11, ny0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5583a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5584b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5585c = true;

    public e21(Context context, ExecutorService executorService) {
        this.f5583a = context;
        this.f5584b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void a(HashMap hashMap) {
        boolean z3;
        synchronized (this) {
            z3 = this.f5585c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void b(HashMap hashMap) {
        boolean z3;
        synchronized (this) {
            z3 = this.f5585c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void c(HashMap hashMap, Context context, View view) {
        boolean z3;
        synchronized (this) {
            z3 = this.f5585c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f5585c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f5585c = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ny0
    public final ac.b zza() {
        return ed1.E(new bo0(10, this), this.f5584b);
    }
}
