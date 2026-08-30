package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class z71 implements ac.b {
    public static final ay0 A;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f13102x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final y81 f13103y = new y81(r71.class, 0);

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f13104z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f13105u;

    /* renamed from: v, reason: collision with root package name */
    public volatile o71 f13106v;

    /* renamed from: w, reason: collision with root package name */
    public volatile y71 f13107w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.ads.ay0] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        boolean z3;
        Object obj;
        Throwable th;
        Throwable th2;
        ?? r02;
        Object obj2;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f13104z = z3;
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
            y81 y81Var = f13103y;
            Logger a10 = y81Var.a();
            Level level = Level.SEVERE;
            a10.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            y81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(y71 y71Var) {
        y71Var.f12807a = null;
        while (true) {
            y71 y71Var2 = this.f13107w;
            if (y71Var2 != y71.f12806c) {
                y71 y71Var3 = null;
                while (y71Var2 != null) {
                    y71 y71Var4 = y71Var2.f12808b;
                    if (y71Var2.f12807a != null) {
                        y71Var3 = y71Var2;
                    } else if (y71Var3 != null) {
                        y71Var3.f12808b = y71Var4;
                        if (y71Var3.f12807a == null) {
                            break;
                        }
                    } else if (!A.x(this, y71Var2, y71Var4)) {
                        break;
                    }
                    y71Var2 = y71Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}
