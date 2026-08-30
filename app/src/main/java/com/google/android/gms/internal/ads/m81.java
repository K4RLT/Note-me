package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m81 extends x81 {

    /* renamed from: w, reason: collision with root package name */
    public final Executor f8273w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n81 f8274x;

    /* renamed from: y, reason: collision with root package name */
    public final Callable f8275y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n81 f8276z;

    public m81(n81 n81Var, Callable callable, Executor executor) {
        this.f8276z = n81Var;
        this.f8274x = n81Var;
        executor.getClass();
        this.f8273w = executor;
        this.f8275y = callable;
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final Object a() {
        return this.f8275y.call();
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final String c() {
        return this.f8275y.toString();
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final boolean d() {
        return this.f8274x.isDone();
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final void e(Object obj) {
        this.f8274x.J = null;
        this.f8276z.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final void f(Throwable th) {
        n81 n81Var = this.f8274x;
        n81Var.J = null;
        if (th instanceof ExecutionException) {
            n81Var.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            n81Var.cancel(false);
        } else {
            n81Var.e(th);
        }
    }
}
