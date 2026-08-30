package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class j7 {

    /* renamed from: b, reason: collision with root package name */
    public i3 f7362b;

    /* renamed from: c, reason: collision with root package name */
    public p2 f7363c;

    /* renamed from: d, reason: collision with root package name */
    public h7 f7364d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f7365f;

    /* renamed from: g, reason: collision with root package name */
    public long f7366g;

    /* renamed from: h, reason: collision with root package name */
    public int f7367h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public long f7369k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7370l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7371m;

    /* renamed from: a, reason: collision with root package name */
    public final f7 f7361a = new f7();

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.e4 f7368j = new com.google.android.gms.internal.measurement.e4(3, false);

    public void a(boolean z3) {
        int i;
        if (z3) {
            this.f7368j = new com.google.android.gms.internal.measurement.e4(3, false);
            this.f7365f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f7367h = i;
        this.e = -1L;
        this.f7366g = 0L;
    }

    public abstract long b(xk0 xk0Var);

    public abstract boolean c(xk0 xk0Var, long j10, com.google.android.gms.internal.measurement.e4 e4Var);

    public void d(long j10) {
        this.f7366g = j10;
    }
}
