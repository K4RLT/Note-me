package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class zo1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f13219a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f13220b;

    /* renamed from: c, reason: collision with root package name */
    public static final um1 f13221c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13222d;
    public static final boolean e;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    static {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zo1.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f13219a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            androidx.datastore.preferences.protobuf.s1.r(e8);
            return null;
        }
    }

    public static int b(long j10, Object obj) {
        return ((Unsafe) f13221c.f11688u).getInt(obj, j10);
    }

    public static void c(long j10, Object obj, int i) {
        ((Unsafe) f13221c.f11688u).putInt(obj, j10, i);
    }

    public static long d(long j10, Object obj) {
        return ((Unsafe) f13221c.f11688u).getLong(obj, j10);
    }

    public static void e(long j10, Object obj, long j11) {
        ((Unsafe) f13221c.f11688u).putLong(obj, j10, j11);
    }

    public static Object f(long j10, Object obj) {
        return ((Unsafe) f13221c.f11688u).getObject(obj, j10);
    }

    public static void g(Object obj, long j10, Object obj2) {
        ((Unsafe) f13221c.f11688u).putObject(obj, j10, obj2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zo1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean i(Class cls) {
        int i = em1.f5727a;
        try {
            Class cls2 = f13220b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean j(long j10, Object obj) {
        if (((byte) ((((Unsafe) f13221c.f11688u).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean k(long j10, Object obj) {
        if (((byte) ((((Unsafe) f13221c.f11688u).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void l(Object obj, long j10, boolean z3) {
        Unsafe unsafe = (Unsafe) f13221c.f11688u;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((z3 ? 1 : 0) << i10) | ((~(255 << i10)) & i));
    }

    public static /* synthetic */ void m(Object obj, long j10, boolean z3) {
        Unsafe unsafe = (Unsafe) f13221c.f11688u;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((z3 ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j11)));
    }

    public static void n(Class cls) {
        if (f13222d) {
            ((Unsafe) f13221c.f11688u).arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f13222d) {
            ((Unsafe) f13221c.f11688u).arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field field;
        Field field2;
        int i = em1.f5727a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }
}
