package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.y81;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k0 implements r0 {
    public static final wa.e0 A;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f15470x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final y81 f15471y = new y81(t0.class, 2);

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f15472z;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f15473u;

    /* renamed from: v, reason: collision with root package name */
    public volatile f0 f15474v;

    /* renamed from: w, reason: collision with root package name */
    public volatile j0 f15475w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [wa.e0] */
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
        f15472z = z3;
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
            y81 y81Var = f15471y;
            Logger a10 = y81Var.a();
            Level level = Level.SEVERE;
            a10.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            y81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(j0 j0Var) {
        j0Var.f15458a = null;
        while (true) {
            j0 j0Var2 = this.f15475w;
            if (j0Var2 != j0.f15457c) {
                j0 j0Var3 = null;
                while (j0Var2 != null) {
                    j0 j0Var4 = j0Var2.f15459b;
                    if (j0Var2.f15458a != null) {
                        j0Var3 = j0Var2;
                    } else if (j0Var3 != null) {
                        j0Var3.f15459b = j0Var4;
                        if (j0Var3.f15458a == null) {
                            break;
                        }
                    } else if (!A.g(this, j0Var2, j0Var4)) {
                        break;
                    }
                    j0Var2 = j0Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}
