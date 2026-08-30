package com.google.android.gms.internal.consent_sdk;
import q.x;
import x.n;

/* loaded from: classes.dex */
public abstract class p5 implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public final q5 f13522u;

    /* renamed from: v, reason: collision with root package name */
    public q5 f13523v;

    public p5(q5 q5Var) {
        this.f13522u = q5Var;
        if (!q5Var.e()) {
            this.f13523v = (q5) q5Var.f(4);
        } else {
            q.x.n("Default instance must be immutable.");
            throw null;
        }
    }

    public final q5 a() {
        boolean e = this.f13523v.e();
        q5 q5Var = this.f13523v;
        if (e) {
            q5Var.getClass();
            j6.f13458c.a(q5Var.getClass()).a(q5Var);
            q5Var.j();
            q5Var = this.f13523v;
        }
        q5Var.getClass();
        boolean z3 = true;
        byte byteValue = ((Byte) q5Var.f(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z3 = false;
            } else {
                z3 = j6.f13458c.a(q5Var.getClass()).h(q5Var);
                q5Var.f(2);
            }
        }
        if (z3) {
            return q5Var;
        }
        throw new ab.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", 8);
    }

    public final void b() {
        if (!this.f13523v.e()) {
            q5 q5Var = (q5) this.f13522u.f(4);
            j6.f13458c.a(q5Var.getClass()).f(q5Var, this.f13523v);
            this.f13523v = q5Var;
        }
    }

    public final Object clone() {
        p5 p5Var = (p5) this.f13522u.f(5);
        boolean e = this.f13523v.e();
        q5 q5Var = this.f13523v;
        if (e) {
            q5Var.getClass();
            j6.f13458c.a(q5Var.getClass()).a(q5Var);
            q5Var.j();
            q5Var = this.f13523v;
        }
        p5Var.f13523v = q5Var;
        return p5Var;
    }
}
