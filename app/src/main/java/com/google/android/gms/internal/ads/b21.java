package com.google.android.gms.internal.ads;
import ac.b;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b21 implements y11, ny0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4698a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f4699b;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f4700c = null;

    public b21(Context context, ExecutorService executorService) {
        this.f4698a = context;
        this.f4699b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void b(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j10;
        synchronized (this) {
            networkCapabilities = this.f4700c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f4700c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j10 = 2;
                    } else if (this.f4700c.hasTransport(1)) {
                        j10 = 1;
                    } else if (this.f4700c.hasTransport(0)) {
                        j10 = 0;
                    }
                }
                j10 = -1;
            } finally {
            }
        }
        hashMap.put("nt", Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.ny0
    public final ac.b zza() {
        h91 h91Var = new h91(Executors.callable(new qu0(7, this), null));
        this.f4699b.execute(h91Var);
        return h91Var;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void a(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void c(HashMap hashMap, Context context, View view) {
    }
}
