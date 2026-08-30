package com.google.android.gms.internal.ads;
import ac.b;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hr0 implements ac.b {

    /* renamed from: u, reason: collision with root package name */
    public final Object f6875u;

    /* renamed from: v, reason: collision with root package name */
    public final String f6876v;

    /* renamed from: w, reason: collision with root package name */
    public final ac.b f6877w;

    public hr0(Object obj, String str, ac.b bVar) {
        this.f6875u = obj;
        this.f6876v = str;
        this.f6877w = bVar;
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.f6877w.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f6877w.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6877w.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6877w.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6877w.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.f6876v;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(identityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f6877w.get(j10, timeUnit);
    }
}
