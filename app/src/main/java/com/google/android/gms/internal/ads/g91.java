package com.google.android.gms.internal.ads;
import ac.b;
import g5.q;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g91 extends x81 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6331w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h91 f6332x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6333y;

    public g91(h91 h91Var, Callable callable) {
        this.f6332x = h91Var;
        callable.getClass();
        this.f6333y = callable;
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final Object a() {
        switch (this.f6331w) {
            case 0:
                i81 i81Var = (i81) this.f6333y;
                b mo207zza = i81Var.mo207zza();
                if (mo207zza == null) {
                    q.h(ay0.B("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", i81Var));
                    return null;
                }
                return mo207zza;
            default:
                return ((Callable) this.f6333y).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final String c() {
        switch (this.f6331w) {
            case 0:
                return ((i81) this.f6333y).toString();
            default:
                return ((Callable) this.f6333y).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final boolean d() {
        switch (this.f6331w) {
            case 0:
                return this.f6332x.isDone();
            default:
                return this.f6332x.isDone();
        }
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final void e(Object obj) {
        switch (this.f6331w) {
            case 0:
                this.f6332x.o((b) obj);
                return;
            default:
                this.f6332x.d(obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.x81
    public final void f(Throwable th) {
        switch (this.f6331w) {
            case 0:
                this.f6332x.e(th);
                return;
            default:
                this.f6332x.e(th);
                return;
        }
    }

    public g91(h91 h91Var, i81 i81Var) {
        this.f6332x = h91Var;
        this.f6333y = i81Var;
    }
}
