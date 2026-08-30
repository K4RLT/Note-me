package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lh0 {

    /* renamed from: a, reason: collision with root package name */
    public long f8026a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8027b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f8028c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f8029d = 0;
    public long e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8030f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f8031g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f8032h = new Object();
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final Object f8033j = new Object();

    public final synchronized long a() {
        long j10;
        synchronized (this.f8030f) {
            j10 = this.f8026a;
        }
        return j10;
    }

    public final synchronized long b() {
        long j10;
        synchronized (this.i) {
            j10 = this.f8029d;
        }
        return j10;
    }
}
