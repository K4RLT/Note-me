package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class x71 extends ay0 {
    public static final Unsafe G;
    public static final long H;
    public static final long I;
    public static final long J;
    public static final long K;
    public static final long L;

    static {
        Unsafe Y;
        try {
            try {
                Y = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    Y = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, a81.f4411a);
                } catch (Exception unused2) {
                    Y = Y();
                    Unsafe unsafe = Y;
                }
            }
            try {
                I = Y.objectFieldOffset(z71.class.getDeclaredField("w"));
                H = Y.objectFieldOffset(z71.class.getDeclaredField("v"));
                J = Y.objectFieldOffset(z71.class.getDeclaredField("u"));
                K = Y.objectFieldOffset(y71.class.getDeclaredField("a"));
                L = Y.objectFieldOffset(y71.class.getDeclaredField("b"));
                G = Y;
            } catch (NoSuchFieldException e) {
                g5.q.k(e);
            }
        } catch (Exception e8) {
            l4.a.k("Could not initialize intrinsics", e8);
        }
    }

    public static /* synthetic */ Unsafe Y() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean D(r71 r71Var, o71 o71Var, o71 o71Var2) {
        return w71.a(G, r71Var, H, o71Var, o71Var2);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final y71 H(r71 r71Var) {
        y71 y71Var;
        y71 y71Var2 = y71.f12806c;
        do {
            y71Var = r71Var.f13107w;
            if (y71Var2 == y71Var) {
                break;
            }
        } while (!x(r71Var, y71Var, y71Var2));
        return y71Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final o71 N(r71 r71Var) {
        o71 o71Var;
        o71 o71Var2 = o71.f8996d;
        do {
            o71Var = r71Var.f13106v;
            if (o71Var2 == o71Var) {
                break;
            }
        } while (!D(r71Var, o71Var, o71Var2));
        return o71Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean T(z71 z71Var, Object obj, Object obj2) {
        return v71.a(G, z71Var, J, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void j(y71 y71Var, Thread thread) {
        G.putObject(y71Var, K, thread);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final void q(y71 y71Var, y71 y71Var2) {
        G.putObject(y71Var, L, y71Var2);
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final boolean x(z71 z71Var, y71 y71Var, y71 y71Var2) {
        return u71.a(G, z71Var, I, y71Var, y71Var2);
    }
}
