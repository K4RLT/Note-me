package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class dp {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f14197a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f14198b;

    /* renamed from: c, reason: collision with root package name */
    public static final cp f14199c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f14200d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f14201f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f14202g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    static {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.dp.<clinit>():void");
    }

    public static void a(Class cls) {
        if (e) {
            ((Unsafe) f14199c.f14164a).arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = nm.f14715a;
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
        Unsafe unsafe = (Unsafe) f14199c.f14164a;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (i & (~(255 << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = (Unsafe) f14199c.f14164a;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i) | (unsafe.getInt(obj, j11) & (~(255 << i))));
    }

    public static int e(long j10, Object obj) {
        return ((Unsafe) f14199c.f14164a).getInt(obj, j10);
    }

    public static long f(long j10, Object obj) {
        return ((Unsafe) f14199c.f14164a).getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f14197a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            androidx.datastore.preferences.protobuf.s1.r(e8);
            return null;
        }
    }

    public static Object h(long j10, Object obj) {
        return ((Unsafe) f14199c.f14164a).getObject(obj, j10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        f14199c.h(bArr, f14201f + j10, b10);
    }

    public static void k(long j10, Object obj, int i) {
        ((Unsafe) f14199c.f14164a).putInt(obj, j10, i);
    }

    public static void l(long j10, Object obj, long j11) {
        ((Unsafe) f14199c.f14164a).putLong(obj, j10, j11);
    }

    public static void m(Object obj, long j10, Object obj2) {
        ((Unsafe) f14199c.f14164a).putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean n(long j10, Object obj) {
        if (((byte) ((((Unsafe) f14199c.f14164a).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean o(long j10, Object obj) {
        if (((byte) ((((Unsafe) f14199c.f14164a).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean p(Class cls) {
        int i = nm.f14715a;
        try {
            Class cls2 = f14198b;
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

    public static int q(Class cls) {
        if (e) {
            return ((Unsafe) f14199c.f14164a).arrayBaseOffset(cls);
        }
        return -1;
    }
}
