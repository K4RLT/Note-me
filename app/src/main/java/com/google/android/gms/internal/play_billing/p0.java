package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class p0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final r0 f15506u;

    /* renamed from: v, reason: collision with root package name */
    public final ba.q f15507v;

    public p0(r0 r0Var, ba.q qVar) {
        this.f15506u = r0Var;
        this.f15507v = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable c10;
        r0 r0Var = this.f15506u;
        boolean z3 = r0Var instanceof k0;
        ba.q qVar = this.f15507v;
        if (z3 && (c10 = ((k0) r0Var).c()) != null) {
            qVar.b(c10);
            return;
        }
        try {
            if (r0Var.isDone()) {
                boolean z9 = false;
                while (true) {
                    try {
                        obj = r0Var.get();
                        break;
                    } catch (InterruptedException unused) {
                        z9 = true;
                    } catch (Throwable th) {
                        if (z9) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                c7.b0 b0Var = (c7.b0) qVar.f3160x;
                if (intValue > 0) {
                    int i = qVar.f3157u;
                    int intValue2 = num.intValue();
                    b0Var.getClass();
                    c7.f a10 = c7.e0.a(intValue2, "Billing override value was set by a license tester.");
                    b0Var.J(93, i, a10);
                    ((p3.a) qVar.f3158v).accept(a10);
                    return;
                }
                ((Runnable) qVar.f3159w).run();
                return;
            }
            throw new IllegalStateException(wa.b0.a("Future was expected to be done: %s", r0Var));
        } catch (ExecutionException e) {
            qVar.b(e.getCause());
        } catch (Throwable th2) {
            qVar.b(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.l, java.lang.Object] */
    public final String toString() {
        ra.e eVar = new ra.e(p0.class.getSimpleName(), 26);
        ?? obj = new Object();
        ((l) eVar.f24677x).f15480b = obj;
        eVar.f24677x = obj;
        obj.f15479a = this.f15507v;
        return eVar.toString();
    }
}
