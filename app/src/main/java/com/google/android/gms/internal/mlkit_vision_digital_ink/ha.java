package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.ads.y81;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class ha extends ca {
    public static final y81 I = new y81(ha.class, 1);
    public c4 F;
    public final boolean G;
    public ga H;

    public ha(c4 c4Var, boolean z3) {
        int size = c4Var.size();
        this.B = null;
        this.C = size;
        this.F = c4Var;
        this.G = z3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        c4 c4Var = this.F;
        if (c4Var != null) {
            return "futures=".concat(c4Var.toString());
        }
        return super.d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        boolean z3;
        c4 c4Var = this.F;
        this.F = null;
        this.H = null;
        boolean z9 = this.f14968u instanceof h9;
        if (c4Var != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z9 & z3) {
            boolean p10 = p();
            k5 k3 = c4Var.k();
            while (k3.hasNext()) {
                ((Future) k3.next()).cancel(p10);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void j() {
        ga gaVar = this.H;
        if (gaVar != null) {
            gaVar.g();
        }
    }

    public final void t() {
        boolean z3;
        int a10 = ca.D.a(this);
        if (a10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        pa.s("Less than 0 remaining futures", z3);
        if (a10 == 0) {
            this.B = null;
            ga gaVar = this.H;
            if (gaVar != null) {
                try {
                    gaVar.f14366w.execute(gaVar);
                } catch (RejectedExecutionException e) {
                    gaVar.f14367x.o(e);
                }
            }
            this.F = null;
        }
    }

    public final void u(Throwable th) {
        String str;
        String str2;
        th.getClass();
        if (this.G && !o(th)) {
            Set set = this.B;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f14968u instanceof h9)) {
                    Throwable c10 = c();
                    Objects.requireNonNull(c10);
                    while (c10 != null && newSetFromMap.add(c10)) {
                        c10 = c10.getCause();
                    }
                }
                ca.D.n(this, newSetFromMap);
                Set set2 = this.B;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            if (true == (th instanceof Error)) {
                str2 = "Input Future failed with Error";
            } else {
                str2 = "Got more than one input Future failure. Logging failures after the first";
            }
            I.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str2, th);
            return;
        }
        boolean z3 = th instanceof Error;
        if (z3) {
            if (true == z3) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            I.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
        }
    }

    public final void v(ya yaVar) {
        try {
            boolean z3 = false;
            if (yaVar.isCancelled()) {
                this.F = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            yaVar.get();
                            break;
                        } catch (InterruptedException unused) {
                            z3 = true;
                        } catch (Throwable th) {
                            if (z3) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        u(e.getCause());
                    } catch (Throwable th2) {
                        u(th2);
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            t();
        }
    }

    public final void w() {
        Objects.requireNonNull(this.F);
        if (this.F.isEmpty()) {
            ga gaVar = this.H;
            if (gaVar != null) {
                try {
                    gaVar.f14366w.execute(gaVar);
                    return;
                } catch (RejectedExecutionException e) {
                    gaVar.f14367x.o(e);
                    return;
                }
            }
            return;
        }
        c4 c4Var = this.F;
        ia iaVar = ia.f14473u;
        if (this.G) {
            k5 k3 = c4Var.k();
            int i = 0;
            while (k3.hasNext()) {
                ya yaVar = (ya) k3.next();
                int i10 = i + 1;
                if (yaVar.isDone()) {
                    v(yaVar);
                } else {
                    yaVar.g(new pu1(this, i, yaVar), iaVar);
                }
                i = i10;
            }
            return;
        }
        z9 z9Var = new z9(this);
        k5 k4 = c4Var.k();
        while (k4.hasNext()) {
            ya yaVar2 = (ya) k4.next();
            if (yaVar2.isDone()) {
                t();
            } else {
                yaVar2.g(z9Var, iaVar);
            }
        }
    }
}
