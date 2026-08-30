package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ga extends xa {
    public final Object A;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f14366w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ha f14367x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f14368y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ha f14369z;

    public ga(ha haVar, Object obj, Executor executor, int i) {
        this.f14368y = i;
        this.f14369z = haVar;
        this.f14367x = haVar;
        executor.getClass();
        this.f14366w = executor;
        this.A = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final Object a() {
        switch (this.f14368y) {
            case 0:
                return ((iw) this.A).zza();
            default:
                return ((Callable) this.A).call();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final String b() {
        switch (this.f14368y) {
            case 0:
                return ((iw) this.A).toString();
            default:
                return ((Callable) this.A).toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final void d(Throwable th) {
        ha haVar = this.f14367x;
        haVar.H = null;
        if (th instanceof ExecutionException) {
            haVar.o(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            haVar.cancel(false);
        } else {
            haVar.o(th);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final void e(Object obj) {
        this.f14367x.H = null;
        switch (this.f14368y) {
            case 0:
                this.f14369z.f((ya) obj);
                return;
            default:
                this.f14369z.n(obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final boolean f() {
        return this.f14367x.isDone();
    }
}
