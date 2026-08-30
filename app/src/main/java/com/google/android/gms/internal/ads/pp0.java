package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pp0 {

    /* renamed from: a, reason: collision with root package name */
    public final la.a f9577a;

    /* renamed from: b, reason: collision with root package name */
    public final be0 f9578b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9579c = new Object();
    public volatile int e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f9580d = 0;

    public pp0(la.a aVar, be0 be0Var) {
        this.f9577a = aVar;
        this.f9578b = be0Var;
    }

    public final void a(boolean z3) {
        String str;
        if (((Boolean) g9.r.e.f17698c.a(sl.Ge)).booleanValue()) {
            j6.s a10 = this.f9578b.a();
            a10.k("action", "mbs_state");
            if (true != z3) {
                str = "0";
            } else {
                str = "1";
            }
            a10.k("mbs_state", str);
            a10.l();
        }
        if (z3) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.f9577a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9579c) {
            try {
                if (this.e == 3) {
                    if (this.f9580d + ((Long) g9.r.e.f17698c.a(sl.R6)).longValue() <= currentTimeMillis) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i10) {
        b();
        Object obj = this.f9579c;
        this.f9577a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i10;
                if (this.e == 3) {
                    this.f9580d = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
