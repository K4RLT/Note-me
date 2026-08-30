package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class z81 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13117u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Executor f13118v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Future f13119w;

    public /* synthetic */ z81(Executor executor, Future future, int i) {
        this.f13117u = i;
        this.f13118v = executor;
        this.f13119w = future;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f13117u) {
            case 0:
                Executor executor = this.f13118v;
                p81 p81Var = (p81) this.f13119w;
                try {
                    executor.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    p81Var.e(e);
                    return;
                }
            default:
                Executor executor2 = this.f13118v;
                com.google.android.gms.internal.mlkit_vision_digital_ink.ma maVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.ma) this.f13119w;
                try {
                    executor2.execute(runnable);
                    return;
                } catch (RejectedExecutionException e8) {
                    maVar.o(e8);
                    return;
                }
        }
    }
}
