package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f13688a;

    public d6(Unsafe unsafe) {
        this.f13688a = unsafe;
    }

    public abstract double a(long j10, Object obj);

    public final void b(long j10, Object obj, int i) {
        this.f13688a.putInt(obj, j10, i);
    }

    public final void c(long j10, Object obj, long j11) {
        this.f13688a.putLong(obj, j10, j11);
    }

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d2);

    public abstract void f(Object obj, long j10, float f10);

    public abstract void g(Object obj, long j10, boolean z3);

    public abstract float h(long j10, Object obj);

    public abstract boolean i(long j10, Object obj);

    public final int j(long j10, Object obj) {
        return this.f13688a.getInt(obj, j10);
    }

    public final long k(long j10, Object obj) {
        return this.f13688a.getLong(obj, j10);
    }
}
