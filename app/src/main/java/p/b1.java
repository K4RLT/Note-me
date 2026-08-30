package p;
import b0.x;
import b1.b0;
import b1.c0;
import b1.v;
import l.a;
import r0.e1;
import r0.i1;
import r0.v1;
import r0.y;

import b8.o3;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class b1 implements v1 {
    public final i1 A;
    public final i1 B;
    public final i1 C;
    public k1.i0 D;
    public kotlin.jvm.internal.m E;
    public b1 F;
    public final i1 G;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22106u;

    /* renamed from: v, reason: collision with root package name */
    public final e1 f22107v = new e1(0.0f);

    /* renamed from: w, reason: collision with root package name */
    public final i1 f22108w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f22109x;

    /* renamed from: y, reason: collision with root package name */
    public final i1 f22110y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f22111z;

    public b1(a1 a1Var, z zVar, e1 e1Var, l1 l1Var, f1 f1Var) {
        Boolean bool = Boolean.TRUE;
        this.f22108w = y.B(bool);
        this.f22109x = y.B(a1Var);
        this.f22110y = y.B(zVar);
        this.f22111z = y.B(e1Var);
        this.A = y.B(bool);
        this.B = y.B(l1Var);
        this.C = y.B(f1Var);
        this.E = j0.f22185y;
        this.G = y.B(null);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, pe.g] */
    @Override // v1
    public final void b() {
        j1 j1Var = e().f22094b;
        j1Var.getClass();
        a1 e = e();
        j1 j1Var2 = e.f22094b;
        v vVar = e.f22098g;
        vVar.remove(this);
        if (vVar.isEmpty()) {
            e.f();
            j1Var2.getClass();
            ((b0) j1.E.getValue()).b(e);
        } else {
            c0 c0Var = e.f22099h;
            a2.c cVar = e.i;
            if (!j1Var2.f22190w) {
                ((b0) j1.E.getValue()).d(e, c0Var, cVar);
            }
        }
        j1Var.f22193z.invoke(j1Var);
        j1Var2.c();
        j1Var.C.remove(this);
        if (vVar.isEmpty()) {
            pf.x(j1Var2.f22188u, null, new o3(e, null, 3), 3);
        }
        e().g();
    }

    public final z c() {
        return (z) this.f22110y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, pe.g] */
    @Override // v1
    public final void d() {
        j1 j1Var = e().f22094b;
        j1Var.getClass();
        a1 e = e();
        e.f22098g.add(this);
        j1 j1Var2 = e.f22094b;
        c0 c0Var = e.f22099h;
        a2.c cVar = e.i;
        if (!j1Var2.f22190w) {
            ((b0) j1.E.getValue()).d(e, c0Var, cVar);
        }
        j1Var.f22193z.invoke(j1Var);
        j1Var2.c();
        v vVar = j1Var.C;
        ListIterator listIterator = vVar.listIterator();
        int i = 0;
        while (true) {
            c0 c0Var2 = (c0) listIterator;
            if (c0Var2.hasNext()) {
                b1 b1Var = (b1) c0Var2.next();
                a1 a1Var = null;
                if (b1Var == null) {
                    b1Var = null;
                }
                if (b1Var != null) {
                    a1Var = b1Var.e();
                }
                if (kotlin.jvm.internal.a(a1Var, e())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i != vVar.size() - 1 && i != -1) {
            vVar.add(i + 1, this);
        } else {
            vVar.add(this);
        }
        e().g();
    }

    public final a1 e() {
        return (a1) this.f22109x.getValue();
    }

    public final boolean f() {
        if (!kotlin.jvm.internal.a(e().f22097f, this) && ((Boolean) this.A.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (f() && e().b() && ((Boolean) this.f22108w.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // v1
    public final void a() {
    }
}
