package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;
import w7.i1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class y9 extends ma implements Runnable {
    public static final /* synthetic */ int E = 0;
    public ya C;
    public Object D;

    public y9(ya yaVar, Object obj) {
        yaVar.getClass();
        this.C = yaVar;
        this.D = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        String str;
        ya yaVar = this.C;
        Object obj = this.D;
        String d2 = super.d();
        if (yaVar != null) {
            str = a.k("inputFuture=[", yaVar.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return i1.d(str, "function=[", obj.toString(), "]");
        }
        if (d2 != null) {
            return str.concat(d2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        l(this.C);
        this.C = null;
        this.D = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        ya yaVar = this.C;
        Object obj = this.D;
        boolean z9 = this.f14968u instanceof h9;
        boolean z10 = true;
        if (yaVar == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z11 = z9 | z3;
        if (obj != null) {
            z10 = false;
        }
        if (z11 | z10) {
            return;
        }
        this.C = null;
        if (!yaVar.isCancelled()) {
            try {
                try {
                    Object t3 = t(obj, n5.r(yaVar));
                    this.D = null;
                    u(t3);
                    return;
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        o(th);
                        return;
                    } finally {
                        this.D = null;
                    }
                }
            } catch (Error e) {
                o(e);
                return;
            } catch (CancellationException unused) {
                cancel(false);
                return;
            } catch (ExecutionException e8) {
                o(e8.getCause());
                return;
            } catch (Exception e10) {
                o(e10);
                return;
            }
        }
        f(yaVar);
    }

    public abstract Object t(Object obj, Object obj2);

    public abstract void u(Object obj);
}
