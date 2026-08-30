package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7590u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Handler f7591v;

    public k0(lx0 lx0Var, Handler handler) {
        this.f7590u = 1;
        this.f7591v = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7590u) {
            case 0:
                this.f7591v.post(runnable);
                return;
            case 1:
                this.f7591v.post(runnable);
                return;
            default:
                this.f7591v.post(runnable);
                return;
        }
    }

    public /* synthetic */ k0(Handler handler, int i) {
        this.f7590u = i;
        this.f7591v = handler;
    }
}
