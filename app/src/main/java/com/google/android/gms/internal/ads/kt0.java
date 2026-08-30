package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kt0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7873b;

    /* renamed from: c, reason: collision with root package name */
    public final la.a f7874c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7875d;
    public final double e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7876f;

    public kt0(Object obj, la.a aVar, double d2, int i) {
        if (aVar != null) {
            this.f7872a = obj;
            this.f7874c = aVar;
            this.f7873b = System.currentTimeMillis();
            this.f7875d = Math.min(Math.max(((Long) g9.r.e.f17698c.a(sl.f10722f0)).longValue() * 1000, 10000L), 21600000L);
            this.e = d2;
            this.f7876f = i;
            return;
        }
        q.x.n("Clock cannot be null.");
        throw null;
    }

    public final long a() {
        this.f7874c.getClass();
        return this.f7875d - (System.currentTimeMillis() - this.f7873b);
    }
}
