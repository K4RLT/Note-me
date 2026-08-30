package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f15545a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f15546b;

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f15547c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15548d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f15549f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f15550g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    static {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.<clinit>():void");
    }

    public static void a(Class cls) {
        if (e) {
            f15547c.f15541a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = d1.f15402a;
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

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = f15547c.f15541a;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (i & (~(255 << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f15547c.f15541a;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i) | (unsafe.getInt(obj, j11) & (~(255 << i))));
    }

    public static int e(long j10, Object obj) {
        return f15547c.f15541a.getInt(obj, j10);
    }

    public static long f(long j10, Object obj) {
        return f15547c.f15541a.getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f15545a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            androidx.datastore.preferences.protobuf.s1.r(e8);
            return null;
        }
    }

    public static Object h(long j10, Object obj) {
        return f15547c.f15541a.getObject(obj, j10);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
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
            Logger.getLogger(x2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void j(long j10, Object obj, int i) {
        f15547c.f15541a.putInt(obj, j10, i);
    }

    public static void k(long j10, Object obj, long j11) {
        f15547c.f15541a.putLong(obj, j10, j11);
    }

    public static void l(Object obj, long j10, Object obj2) {
        f15547c.f15541a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j10, Object obj) {
        if (((byte) ((f15547c.f15541a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j10, Object obj) {
        if (((byte) ((f15547c.f15541a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean o(Class cls) {
        int i = d1.f15402a;
        try {
            Class cls2 = f15546b;
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

    public static int p(Class cls) {
        if (e) {
            return f15547c.f15541a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
