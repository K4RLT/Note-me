package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class f21 implements y11, ny0 {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f5892g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5893a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5894b;

    /* renamed from: c, reason: collision with root package name */
    public long f5895c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f5896d = 0;
    public long e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5897f = false;

    public f21(Context context, ExecutorService executorService, String[] strArr) {
        this.f5893a = context;
        this.f5894b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void a(HashMap hashMap) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void b(HashMap hashMap) {
        long j10;
        long j11;
        d();
        synchronized (this) {
            try {
                if (this.f5897f) {
                    j10 = this.f5896d - this.f5895c;
                } else {
                    j10 = -1;
                }
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.e;
            this.e = -1L;
        }
        hashMap.put("vf", Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void c(HashMap hashMap, Context context, View view) {
        d();
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f5897f) {
                    this.f5896d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ny0
    public final ac.b zza() {
        if (Build.VERSION.SDK_INT < 30) {
            return v81.f11836v;
        }
        h91 h91Var = new h91(Executors.callable(new qu0(8, this), null));
        this.f5894b.execute(h91Var);
        return h91Var;
    }
}
