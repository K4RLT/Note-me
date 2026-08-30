package com.google.android.gms.internal.ads;
import d.d;
import eb.y;
import f9.k;
import g9.r;
import g9.y1;
import mf.b;
import r.e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class sr0 implements rr0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11111a;

    /* renamed from: p, reason: collision with root package name */
    public final int f11124p;

    /* renamed from: b, reason: collision with root package name */
    public long f11112b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f11113c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11114d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f11125q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f11126r = 2;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f11115f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f11116g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f11117h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f11118j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f11119k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f11120l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f11121m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f11122n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11123o = false;

    public sr0(Context context, int i) {
        this.f11111a = context;
        this.f11124p = i;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 G(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 R(String str) {
        synchronized (this) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Y9)).booleanValue()) {
                this.f11121m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 a(boolean z3) {
        synchronized (this) {
            this.f11114d = z3;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 b(Throwable th) {
        synchronized (this) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Y9)).booleanValue()) {
                String d2 = l9.d.d(pu.f(th), "SHA-256");
                if (d2 == null) {
                    d2 = "";
                }
                this.f11120l = d2;
                String f10 = pu.f(th);
                mf b10 = mf.b(new a31('\n'));
                f10.getClass();
                this.f11119k = (String) ((o31) ((p31) b10.f8338w).f(b10, f10)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final /* bridge */ /* synthetic */ rr0 c() {
        l();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.f11116g = r0;
     */
    @Override // com.google.android.gms.internal.ads.rr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.rr0 e(com.google.android.gms.internal.ads.tw r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f11471w     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.sp0 r0 = (com.google.android.gms.internal.ads.sp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f11091b     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            r2.f11115f = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L32
        L12:
            java.lang.Object r3 = r3.f11470v     // Catch: java.lang.Throwable -> L10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.qp0 r0 = (com.google.android.gms.internal.ads.qp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f9927b0     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            r2.f11116g = r0     // Catch: java.lang.Throwable -> L10
        L30:
            monitor-exit(r2)
            return r2
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sr0.e(com.google.android.gms.internal.ads.tw):com.google.android.gms.internal.ads.rr0");
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 f(g9.y1 y1Var) {
        synchronized (this) {
            try {
                IBinder iBinder = y1Var.f17718y;
                if (iBinder != null) {
                    p60 p60Var = (p60) iBinder;
                    String str = p60Var.f9415x;
                    if (!TextUtils.isEmpty(str)) {
                        this.f11115f = str;
                    }
                    String str2 = p60Var.f9413v;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f11116g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final boolean h() {
        if (!TextUtils.isEmpty(this.f11117h)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 i(int i) {
        synchronized (this) {
            this.f11125q = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 j(String str) {
        synchronized (this) {
            this.f11117h = str;
        }
        return this;
    }

    public final synchronized void k() {
        Configuration configuration;
        f9.k kVar = f9.k.C;
        eb.y yVar = kVar.f16815f;
        Context context = this.f11111a;
        this.e = yVar.n(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f11126r = i;
        kVar.f16819k.getClass();
        this.f11112b = SystemClock.elapsedRealtime();
        this.f11123o = true;
    }

    public final synchronized void l() {
        f9.k.C.f16819k.getClass();
        this.f11113c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final synchronized tr0 m() {
        try {
            if (this.f11122n) {
                return null;
            }
            this.f11122n = true;
            if (!this.f11123o) {
                k();
            }
            if (this.f11113c < 0) {
                l();
            }
            return new tr0(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final rr0 u(int i) {
        synchronized (this) {
            this.f11118j = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final /* bridge */ /* synthetic */ rr0 zza() {
        k();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rr0
    public final synchronized boolean zzb() {
        return this.f11123o;
    }
}
