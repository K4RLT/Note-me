package com.google.android.gms.internal.ads;
import g9.r;
import la.a;
import r.e;

import java.util.Random;

/* loaded from: classes.dex */
public final class et0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5771a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5772b;

    /* renamed from: f, reason: collision with root package name */
    public final la.a f5775f;

    /* renamed from: g, reason: collision with root package name */
    public final bl0 f5776g;

    /* renamed from: h, reason: collision with root package name */
    public long f5777h;

    /* renamed from: d, reason: collision with root package name */
    public long f5774d = 5;
    public long e = 0;
    public final Random i = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f5773c = 0;

    public et0(long j10, long j11, la.a aVar, bl0 bl0Var) {
        this.f5771a = j10;
        this.f5772b = j11;
        this.f5776g = bl0Var;
        this.f5775f = aVar;
        a();
    }

    public final synchronized void a() {
        this.f5777h = this.f5771a;
        this.f5773c = 0L;
        this.e = 0L;
    }

    public final synchronized long b() {
        double d2;
        double d10;
        long j10;
        d2 = this.f5777h;
        d10 = 0.2d * d2;
        j10 = (long) (d2 + d10);
        return ((long) (d2 - d10)) + ((long) (this.i.nextDouble() * ((j10 - r0) + 1)));
    }

    public final synchronized void c() {
        long b10 = b();
        this.f5775f.getClass();
        this.e = System.currentTimeMillis() + b10;
        double d2 = this.f5777h;
        long j10 = this.f5772b;
        this.f5777h = Math.min((long) (d2 + d2), j10);
        this.f5773c++;
        if (((Boolean) g9.r.e.f17698c.a(sl.M)).booleanValue()) {
            this.f5776g.k(System.currentTimeMillis(), this.f5773c, this.f5777h, this.f5774d, j10);
        }
    }

    public final synchronized boolean d() {
        if (((Integer) g9.r.e.f17698c.a(sl.N)).intValue() < 0) {
            return false;
        }
        if (this.f5773c > Math.max(this.f5774d, ((Integer) r1.f17698c.a(r0)).intValue())) {
            if (this.f5777h >= this.f5772b) {
                return true;
            }
        }
        return false;
    }
}
