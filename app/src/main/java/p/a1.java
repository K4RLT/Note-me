package p;
import b1.b0;
import b1.v;
import j1.c;
import l.a;
import q.g1;
import q.x;
import r0.i1;
import r0.y;

import wa.s8;
import ya.vd;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22093a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f22094b;

    /* renamed from: f, reason: collision with root package name */
    public b1 f22097f;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f22095c = y.B(null);

    /* renamed from: d, reason: collision with root package name */
    public final i1 f22096d = y.B(Boolean.FALSE);
    public final i1 e = y.B(null);

    /* renamed from: g, reason: collision with root package name */
    public final v f22098g = new v();

    /* renamed from: h, reason: collision with root package name */
    public final c0 f22099h = new c0(3, this);
    public final a2.c i = new a2.c(23, this);

    public a1(String str, j1 j1Var) {
        this.f22093a = str;
        this.f22094b = j1Var;
    }

    public final c a() {
        return (c) this.e.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f22096d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.m, df.a] */
    public final c c() {
        c cVar;
        b1 b1Var = this.f22097f;
        if (b1Var != null) {
            Object invoke = b1Var.E.invoke();
            if (invoke != null) {
                z1.x xVar = (z1.x) invoke;
                z1.x xVar2 = b1Var.e().f22094b.B;
                if (xVar2 != null) {
                    long d2 = xVar2.d(xVar, 0L);
                    Object invoke2 = b1Var.E.invoke();
                    if (invoke2 != null) {
                        cVar = s8.a(d2, vd.c(((z1.x) invoke2).k()));
                    } else {
                        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + ((Object) b1Var.e().f22093a) + '.').toString());
                    }
                } else {
                    x.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
            } else {
                x.n("Error: lookahead coordinates is null.");
                return null;
            }
        } else {
            cVar = null;
        }
        i1 i1Var = this.f22095c;
        i1Var.setValue(cVar);
        return (c) i1Var.getValue();
    }

    public final boolean d() {
        v vVar = this.f22098g;
        int size = vVar.size();
        for (int i = 0; i < size; i++) {
            if (((b1) vVar.get(i)).c().b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        v vVar = this.f22098g;
        int size = vVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            g1 g1Var = ((b1) vVar.get(i)).c().f22294b;
            while (true) {
                g1 g1Var2 = g1Var.f22903b;
                if (g1Var2 == null) {
                    break;
                }
                g1Var = g1Var2;
            }
            if (!kotlin.jvm.internal.a(g1Var.c(), g1Var.f22905d.getValue())) {
                if (b()) {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pe.g] */
    public final void f() {
        boolean d2 = d();
        v vVar = this.f22098g;
        int size = vVar.size();
        i1 i1Var = this.f22096d;
        j1 j1Var = this.f22094b;
        if (size > 1 && d2) {
            i1Var.setValue(Boolean.TRUE);
        } else if (j1Var.a()) {
            if (!d2) {
                i1Var.setValue(Boolean.FALSE);
            }
        } else {
            i1Var.setValue(Boolean.FALSE);
        }
        if (!vVar.isEmpty() && !j1Var.f22190w) {
            ((b0) j1.E.getValue()).d(this, this.f22099h, this.i);
        }
    }

    public final void g() {
        v vVar = this.f22098g;
        int size = vVar.size() - 1;
        b1 b1Var = null;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                b1 b1Var2 = (b1) vVar.get(size);
                if (b1Var2.c().b()) {
                    b1Var = b1Var2;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (kotlin.jvm.internal.a(b1Var, this.f22097f)) {
            return;
        }
        this.f22097f = b1Var;
        this.f22095c.setValue(null);
    }
}
