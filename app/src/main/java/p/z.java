package p;
import a0.k0;
import j1.c;
import q.c1;
import q.g1;
import q.r0;
import r0.i1;
import r0.y;

import r0.n2;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f22293a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f22294b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f22295c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f22296d;
    public r0 e = a0.f22092a;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f22297f = y.B(null);

    public z(j1 j1Var, g1 g1Var, c1 c1Var, k1 k1Var) {
        this.f22293a = j1Var;
        this.f22294b = g1Var;
        this.f22295c = y.B(c1Var);
        this.f22296d = y.B(k1Var);
    }

    public final void a(c cVar, c cVar2) {
        if (this.f22293a.a()) {
            i1 i1Var = this.f22297f;
            if (((n2) i1Var.getValue()) == null) {
                ((k1) this.f22296d.getValue()).getClass();
                this.e = m1.f22209a;
            }
            i1Var.setValue(((c1) this.f22295c.getValue()).a(new k0(29, this), new b2.k0(13, this, cVar2, cVar)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.f22294b.f22905d.getValue()).booleanValue();
    }

    public final c c() {
        n2 n2Var;
        if (this.f22293a.a() && (n2Var = (n2) this.f22297f.getValue()) != null) {
            return (c) n2Var.getValue();
        }
        return null;
    }
}
