package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oa extends na {
    public final ya C;

    public oa(ya yaVar) {
        yaVar.getClass();
        this.C = yaVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.C.cancel(z3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        this.C.g(runnable, executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.util.concurrent.Future
    public final Object get() {
        return this.C.get();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.C.isCancelled();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.util.concurrent.Future
    public final boolean isDone() {
        return this.C.isDone();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String toString() {
        return this.C.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.C.get(j10, timeUnit);
    }
}
