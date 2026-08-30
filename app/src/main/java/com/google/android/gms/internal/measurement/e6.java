package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class e6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f13733a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f13734b;

    /* renamed from: c, reason: collision with root package name */
    public static final d6 f13735c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13736d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f13737f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f13738g;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    static {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e6.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f13733a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            androidx.datastore.preferences.protobuf.s1.r(e8);
            return null;
        }
    }

    public static void b(long j10, Object obj, int i) {
        f13735c.b(j10, obj, i);
    }

    public static void c(Object obj, long j10, Object obj2) {
        f13735c.f13688a.putObject(obj, j10, obj2);
    }

    public static int d(Class cls) {
        if (e) {
            return f13735c.f13688a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(Class cls) {
        if (e) {
            f13735c.f13688a.arrayIndexScale(cls);
        }
    }

    public static void g(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int j12 = f13735c.j(j11, obj);
        int i = ((~((int) j10)) & 3) << 3;
        b(j11, obj, ((255 & b10) << i) | (j12 & (~(255 << i))));
    }

    public static void h(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        b(j11, obj, ((255 & b10) << i) | (f13735c.j(j11, obj) & (~(255 << i))));
    }

    public static boolean i(Class cls) {
        try {
            Class cls2 = f13734b;
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

    public static Object j(long j10, Object obj) {
        return f13735c.f13688a.getObject(obj, j10);
    }

    public static Field k() {
        Field field;
        Field field2;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
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
}
