package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.y81;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class eb implements Executor {

    /* renamed from: z, reason: collision with root package name */
    public static final y81 f14249z = new y81(eb.class, 1);

    /* renamed from: u, reason: collision with root package name */
    public final Executor f14250u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f14251v = new ArrayDeque();

    /* renamed from: y, reason: collision with root package name */
    public int f14254y = 1;

    /* renamed from: w, reason: collision with root package name */
    public long f14252w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final ou1 f14253x = new ou1(this, 5);

    public eb(Executor executor) {
        executor.getClass();
        this.f14250u = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        ArrayDeque arrayDeque = this.f14251v;
        synchronized (arrayDeque) {
            int i = this.f14254y;
            if (i != 4 && i != 3) {
                long j10 = this.f14252w;
                z9 z9Var = new z9(this, runnable);
                arrayDeque.add(z9Var);
                this.f14254y = 2;
                try {
                    this.f14250u.execute(this.f14253x);
                    if (this.f14254y == 2) {
                        synchronized (this.f14251v) {
                            try {
                                if (this.f14252w == j10 && this.f14254y == 2) {
                                    this.f14254y = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ArrayDeque arrayDeque2 = this.f14251v;
                    synchronized (arrayDeque2) {
                        try {
                            int i10 = this.f14254y;
                            boolean z3 = false;
                            if ((i10 == 1 || i10 == 2) && arrayDeque2.removeLastOccurrence(z9Var)) {
                                z3 = true;
                            }
                            if ((th instanceof RejectedExecutionException) && !z3) {
                                return;
                            } else {
                                throw th;
                            }
                        } finally {
                        }
                    }
                }
            }
            arrayDeque.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(this.f14250u) + "}";
    }
}
