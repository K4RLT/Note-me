package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lx extends pa {
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lx, com.google.android.gms.internal.mlkit_vision_digital_ink.pa] */
    public static lx w(ya yaVar) {
        if (yaVar instanceof lx) {
            return (lx) yaVar;
        }
        return new pa(yaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lx, com.google.android.gms.internal.mlkit_vision_digital_ink.pa] */
    public final lx u(Class cls, m2 m2Var, Executor executor) {
        int i = g2.f14354a;
        f2 f2Var = new f2(q1.b(), 0, m2Var);
        int i10 = g9.F;
        ya yaVar = this.f14794v;
        g9 g9Var = new g9(yaVar, cls, f2Var);
        yaVar.g(g9Var, f7.l(executor, g9Var));
        return new pa(g9Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lx, com.google.android.gms.internal.mlkit_vision_digital_ink.pa] */
    public final lx v(Class cls, ea eaVar, Executor executor) {
        int i = g2.f14354a;
        return new pa(n5.k(this.f14794v, cls, new r0(q1.b(), 3, eaVar), executor));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lx, com.google.android.gms.internal.mlkit_vision_digital_ink.pa] */
    public final lx x(m2 m2Var, Executor executor) {
        int i = g2.f14354a;
        return new pa(n5.p(this.f14794v, new f2(q1.b(), 0, m2Var), executor));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.lx, com.google.android.gms.internal.mlkit_vision_digital_ink.pa] */
    public final lx y(ea eaVar, Executor executor) {
        int i = g2.f14354a;
        return new pa(n5.q(this.f14794v, new r0(q1.b(), 3, eaVar), executor));
    }
}
