package com.google.android.gms.internal.play_billing;
import q.x;

/* loaded from: classes.dex */
public abstract class q1 implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public final r1 f15515u;

    /* renamed from: v, reason: collision with root package name */
    public r1 f15516v;

    public q1(r1 r1Var) {
        this.f15515u = r1Var;
        if (!r1Var.h()) {
            this.f15516v = r1Var.n();
        } else {
            x.n("Default instance must be immutable.");
            throw null;
        }
    }

    public final r1 a() {
        boolean h3 = this.f15516v.h();
        r1 r1Var = this.f15516v;
        if (h3) {
            r1Var.getClass();
            m2.f15489c.a(r1Var.getClass()).b(r1Var);
            r1Var.e();
            r1Var = this.f15516v;
        }
        r1Var.getClass();
        if (r1.i(r1Var, true)) {
            return r1Var;
        }
        throw new r2();
    }

    public final void b() {
        if (!this.f15516v.h()) {
            r1 n10 = this.f15515u.n();
            m2.f15489c.a(n10.getClass()).e(n10, this.f15516v);
            this.f15516v = n10;
        }
    }

    public final Object clone() {
        q1 q1Var = (q1) this.f15515u.j(5);
        boolean h3 = this.f15516v.h();
        r1 r1Var = this.f15516v;
        if (h3) {
            r1Var.getClass();
            m2.f15489c.a(r1Var.getClass()).b(r1Var);
            r1Var.e();
            r1Var = this.f15516v;
        }
        q1Var.f15516v = r1Var;
        return q1Var;
    }
}
