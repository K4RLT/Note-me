package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class e81 extends h81 {
    public static final y81 I = new y81(e81.class, 0);
    public z41 F;
    public final boolean G;
    public final boolean H;

    public e81(z41 z41Var, boolean z3, boolean z9) {
        int size = z41Var.size();
        this.B = null;
        this.C = size;
        this.F = z41Var;
        this.G = z3;
        this.H = z9;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final void f() {
        z41 z41Var = this.F;
        boolean z3 = true;
        t(1);
        boolean z9 = this.f13105u instanceof k71;
        if (z41Var == null) {
            z3 = false;
        }
        if (z3 & z9) {
            boolean n10 = n();
            m61 a10 = z41Var.a();
            while (a10.hasNext()) {
                ((ac.b) a10.next()).cancel(n10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        z41 z41Var = this.F;
        if (z41Var != null) {
            return "futures=".concat(z41Var.toString());
        }
        return super.h();
    }

    public abstract void t(int i);

    public final void u(int i, ac.b bVar) {
        try {
            if (bVar.isCancelled()) {
                this.F = null;
                cancel(false);
            } else {
                try {
                    y(i, ct.d(bVar));
                } catch (ExecutionException e) {
                    v(e.getCause());
                } catch (Throwable th) {
                    v(th);
                }
            }
        } finally {
            w(null);
        }
    }

    public final void v(Throwable th) {
        String str;
        String str2;
        th.getClass();
        if (this.G && !e(th)) {
            Set set = this.B;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f13105u instanceof k71)) {
                    Throwable c10 = c();
                    Objects.requireNonNull(c10);
                    while (c10 != null && newSetFromMap.add(c10)) {
                        c10 = c10.getCause();
                    }
                }
                h81.D.k(this, newSetFromMap);
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

    public final void w(z41 z41Var) {
        boolean z3;
        int v2 = h81.D.v(this);
        int i = 0;
        if (v2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.L("Less than 0 remaining futures", z3);
        if (v2 == 0) {
            if (z41Var != null) {
                m61 a10 = z41Var.a();
                while (a10.hasNext()) {
                    ac.b bVar = (ac.b) a10.next();
                    if (!bVar.isCancelled()) {
                        try {
                            y(i, ct.d(bVar));
                        } catch (ExecutionException e) {
                            v(e.getCause());
                        } catch (Throwable th) {
                            v(th);
                        }
                    }
                    i++;
                }
            }
            this.B = null;
            z();
            t(2);
        }
    }

    public final void x() {
        z41 z41Var;
        Objects.requireNonNull(this.F);
        if (this.F.isEmpty()) {
            z();
            return;
        }
        z41 z41Var2 = this.F;
        o81 o81Var = o81.f9033u;
        if (this.G) {
            m61 a10 = z41Var2.a();
            int i = 0;
            while (a10.hasNext()) {
                ac.b bVar = (ac.b) a10.next();
                int i10 = i + 1;
                if (bVar.isDone()) {
                    u(i, bVar);
                } else {
                    bVar.a(new pf0(i, 1, this, bVar), o81Var);
                }
                i = i10;
            }
            return;
        }
        if (true != this.H) {
            z41Var = null;
        } else {
            z41Var = z41Var2;
        }
        t81 t81Var = new t81(this, 29, z41Var);
        m61 a11 = z41Var2.a();
        while (a11.hasNext()) {
            ac.b bVar2 = (ac.b) a11.next();
            if (bVar2.isDone()) {
                w(z41Var);
            } else {
                bVar2.a(t81Var, o81Var);
            }
        }
    }

    public abstract void y(int i, Object obj);

    public abstract void z();
}
