package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f15541a;

    public w2(Unsafe unsafe) {
        this.f15541a = unsafe;
    }

    public abstract double a(long j10, Object obj);

    public abstract float b(long j10, Object obj);

    public abstract void c(Object obj, long j10, boolean z3);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d2);

    public abstract void f(Object obj, long j10, float f10);

    public abstract boolean g(long j10, Object obj);
}
