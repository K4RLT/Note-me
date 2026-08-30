package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.y81;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class s9 implements ya {
    public static final tl A;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f14965x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final y81 f14966y = new y81(n9.class, 1);

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f14967z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f14968u;

    /* renamed from: v, reason: collision with root package name */
    public volatile k9 f14969v;

    /* renamed from: w, reason: collision with root package name */
    public volatile r9 f14970w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.tl] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        boolean z3;
        Object obj;
        Throwable th;
        Throwable th2;
        Object r02;
        Object obj2;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f14967z = z3;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property != null && !property.contains("Android")) {
            try {
                obj2 = new Object();
            } catch (NoClassDefFoundError unused2) {
                obj2 = new Object();
            }
        } else {
            try {
                obj2 = new Object();
            } catch (Error | Exception e) {
                try {
                    obj = new Object();
                } catch (Error | Exception e8) {
                    th3 = e8;
                    obj = new Object();
                }
                th = th3;
                th2 = e;
                r02 = obj;
            }
        }
        th = null;
        th2 = null;
        r02 = obj2;
        A = r02;
        if (th != null) {
            y81 y81Var = f14966y;
            Logger a10 = y81Var.a();
            Level level = Level.SEVERE;
            a10.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            y81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(r9 r9Var) {
        r9Var.f14895a = null;
        while (true) {
            r9 r9Var2 = this.f14970w;
            if (r9Var2 != r9.f14894c) {
                r9 r9Var3 = null;
                while (r9Var2 != null) {
                    r9 r9Var4 = r9Var2.f14896b;
                    if (r9Var2.f14895a != null) {
                        r9Var3 = r9Var2;
                    } else if (r9Var3 != null) {
                        r9Var3.f14896b = r9Var4;
                        if (r9Var3.f14895a == null) {
                            break;
                        }
                    } else if (!A.z(this, r9Var2, r9Var4)) {
                        break;
                    }
                    r9Var2 = r9Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}