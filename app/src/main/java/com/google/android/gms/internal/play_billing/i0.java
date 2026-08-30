package com.google.android.gms.internal.play_billing;
import q.k;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class i0 extends wa.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f15440a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f15441b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f15442c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f15443d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f15444f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
            }
            try {
                f15442c = unsafe.objectFieldOffset(k0.class.getDeclaredField("w"));
                f15441b = unsafe.objectFieldOffset(k0.class.getDeclaredField("v"));
                f15443d = unsafe.objectFieldOffset(k0.class.getDeclaredField("u"));
                e = unsafe.objectFieldOffset(j0.class.getDeclaredField("a"));
                f15444f = unsafe.objectFieldOffset(j0.class.getDeclaredField("b"));
                f15440a = unsafe;
            } catch (NoSuchFieldException e8) {
                g5.q.k(e8);
            }
        } catch (PrivilegedActionException e10) {
            l4.a.k("Could not initialize intrinsics", e10.getCause());
        }
    }

    @Override // wa.e0
    public final f0 a(t0 t0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.f15416d;
        do {
            f0Var = t0Var.f15474v;
            if (f0Var2 == f0Var) {
                break;
            }
        } while (!e(t0Var, f0Var, f0Var2));
        return f0Var;
    }

    @Override // wa.e0
    public final j0 b(t0 t0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f15457c;
        do {
            j0Var = t0Var.f15475w;
            if (j0Var2 == j0Var) {
                break;
            }
        } while (!g(t0Var, j0Var, j0Var2));
        return j0Var;
    }

    @Override // wa.e0
    public final void c(j0 j0Var, j0 j0Var2) {
        f15440a.putObject(j0Var, f15444f, j0Var2);
    }

    @Override // wa.e0
    public final void d(j0 j0Var, Thread thread) {
        f15440a.putObject(j0Var, e, thread);
    }

    @Override // wa.e0
    public final boolean e(t0 t0Var, f0 f0Var, f0 f0Var2) {
        return m0.a(f15440a, t0Var, f15441b, f0Var, f0Var2);
    }

    @Override // wa.e0
    public final boolean f(k0 k0Var, Object obj, Object obj2) {
        return m0.a(f15440a, k0Var, f15443d, obj, obj2);
    }

    @Override // wa.e0
    public final boolean g(k0 k0Var, j0 j0Var, j0 j0Var2) {
        return m0.a(f15440a, k0Var, f15442c, j0Var, j0Var2);
    }
}
