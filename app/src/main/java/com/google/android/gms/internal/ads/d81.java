package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import p.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class d81 extends p81 implements Runnable {
    public static final /* synthetic */ int D = 0;
    public ac.b B;
    public Object C;

    public d81(ac.b bVar, Object obj) {
        bVar.getClass();
        this.B = bVar;
        this.C = obj;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final void f() {
        p(this.B);
        this.B = null;
        this.C = null;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        String str;
        ac.b bVar = this.B;
        Object obj = this.C;
        String h3 = super.h();
        if (bVar != null) {
            String obj2 = bVar.toString();
            str = p.a.o(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            int length = str.length();
            String obj3 = obj.toString();
            return a5.a.l(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, "]");
        }
        if (h3 != null) {
            return str.concat(h3);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        ac.b bVar = this.B;
        Object obj = this.C;
        boolean z9 = this.f13105u instanceof k71;
        boolean z10 = true;
        if (bVar == null) {
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
        this.B = null;
        if (!bVar.isCancelled()) {
            try {
                try {
                    Object v2 = v(obj, ed1.j0(bVar));
                    this.C = null;
                    u(v2);
                    return;
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        e(th);
                        return;
                    } finally {
                        this.C = null;
                    }
                }
            } catch (Error e) {
                e(e);
                return;
            } catch (CancellationException unused) {
                cancel(false);
                return;
            } catch (ExecutionException e8) {
                e(e8.getCause());
                return;
            } catch (Exception e10) {
                e(e10);
                return;
            }
        }
        o(bVar);
    }

    public abstract void u(Object obj);

    public abstract Object v(Object obj, Object obj2);
}
