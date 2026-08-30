package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class q9 extends tl {

    /* renamed from: c, reason: collision with root package name */
    public static final Unsafe f14846c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f14847d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f14848f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14849g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f14850h;

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
                e = unsafe.objectFieldOffset(s9.class.getDeclaredField("w"));
                f14847d = unsafe.objectFieldOffset(s9.class.getDeclaredField("v"));
                f14848f = unsafe.objectFieldOffset(s9.class.getDeclaredField("u"));
                f14849g = unsafe.objectFieldOffset(r9.class.getDeclaredField("a"));
                f14850h = unsafe.objectFieldOffset(r9.class.getDeclaredField("b"));
                f14846c = unsafe;
            } catch (NoSuchFieldException e8) {
                g5.q.k(e8);
            }
        } catch (PrivilegedActionException e10) {
            l4.a.k("Could not initialize intrinsics", e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final k9 b(n9 n9Var) {
        k9 k9Var;
        k9 k9Var2 = k9.f14560d;
        do {
            k9Var = n9Var.f14969v;
            if (k9Var2 == k9Var) {
                break;
            }
        } while (!w(n9Var, k9Var, k9Var2));
        return k9Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final r9 k(n9 n9Var) {
        r9 r9Var;
        r9 r9Var2 = r9.f14894c;
        do {
            r9Var = n9Var.f14970w;
            if (r9Var2 == r9Var) {
                break;
            }
        } while (!z(n9Var, r9Var, r9Var2));
        return r9Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void r(r9 r9Var, r9 r9Var2) {
        f14846c.putObject(r9Var, f14850h, r9Var2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final void u(r9 r9Var, Thread thread) {
        f14846c.putObject(r9Var, f14849g, thread);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean w(n9 n9Var, k9 k9Var, k9 k9Var2) {
        return u9.a(f14846c, n9Var, f14847d, k9Var, k9Var2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean y(s9 s9Var, Object obj, Object obj2) {
        return u9.a(f14846c, s9Var, f14848f, obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.tl
    public final boolean z(s9 s9Var, r9 r9Var, r9 r9Var2) {
        return u9.a(f14846c, s9Var, e, r9Var, r9Var2);
    }
}
