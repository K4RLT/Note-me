package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class v61 implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f11821u = new ArrayDeque(4);

    /* renamed from: v, reason: collision with root package name */
    public Throwable f11822v;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.f11822v;
        while (true) {
            ArrayDeque arrayDeque = this.f11821u;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        u61.f11559a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.f11822v == null && th != null) {
            Object obj = u31.f11530a;
            if (!IOException.class.isInstance(th)) {
                if (!(th instanceof RuntimeException)) {
                    if (!(th instanceof Error)) {
                        g5.q.f(th);
                        return;
                    }
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            }
            throw ((Throwable) IOException.class.cast(th));
        }
    }
}
