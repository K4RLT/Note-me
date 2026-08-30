package com.google.android.gms.internal.ads;
import bb.a;
import f9.k;
import k9.b0;
import k9.f0;
import la.b;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6944u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f6945v;

    public i0() {
        this.f6944u = 1;
        this.f6945v = new a(Looper.getMainLooper(), 1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6944u) {
            case 0:
                ((Executor) this.f6945v).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    try {
                        runnable.run();
                        return;
                    } catch (Throwable th) {
                        f0 f0Var = k.C.f16813c;
                        Context context = k.C.f16817h.e;
                        if (context != null) {
                            try {
                                if (((Boolean) fn.f6128b.p()).booleanValue()) {
                                    b.a(context, th);
                                }
                            } catch (IllegalStateException unused) {
                            }
                        }
                        throw th;
                    }
                }
                ((b0) this.f6945v).post(runnable);
                return;
            default:
                ((io0) this.f6945v).e(runnable);
                return;
        }
    }

    public /* synthetic */ i0(int i, Object obj) {
        this.f6944u = i;
        this.f6945v = obj;
    }
}
