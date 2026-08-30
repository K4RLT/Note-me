package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import z1.e;

/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final y1 f14003d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final a2 f14004a;

    /* renamed from: b, reason: collision with root package name */
    public final n.r0 f14005b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14006c = false;

    public /* synthetic */ a2(a2 a2Var, n.r0 r0Var) {
        if (a2Var != null) {
            pa.p(a2Var.f14006c);
        }
        this.f14004a = a2Var;
        this.f14005b = r0Var;
    }

    public static a2 a(a2 a2Var, a2 a2Var2) {
        boolean z3;
        a2Var.getClass();
        a2 a2Var3 = e;
        if (a2Var == a2Var3) {
            return a2Var2;
        }
        a2Var2.getClass();
        if (a2Var2 == a2Var3) {
            return a2Var;
        }
        n4<a2> s10 = n4.s(new Object[]{a2Var, a2Var2}, 2);
        if (s10.isEmpty()) {
            return a2Var3;
        }
        if (s10.size() == 1) {
            return (a2) s10.iterator().next();
        }
        int i = 0;
        for (a2 a2Var4 : s10) {
            do {
                i += a2Var4.f14005b.f20934w;
                a2Var4 = a2Var4.f14004a;
            } while (a2Var4 != null);
        }
        if (i == 0) {
            return e;
        }
        n.r0 r0Var = new n.r0(i);
        for (a2 a2Var5 : s10) {
            do {
                int i10 = 0;
                while (true) {
                    n.r0 r0Var2 = a2Var5.f14005b;
                    if (i10 >= r0Var2.f20934w) {
                        break;
                    }
                    if (r0Var.put((y1) r0Var2.g(i10), r0Var2.j(i10)) == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    pa.q(z3, "Duplicate bindings: %s", r0Var2.g(i10));
                    i10++;
                }
                a2Var5 = a2Var5.f14004a;
            } while (a2Var5 != null);
        }
        return new a2(null, r0Var).b();
    }

    public final a2 b() {
        if (!this.f14006c) {
            this.f14006c = true;
            a2 a2Var = this.f14004a;
            if (a2Var != null && this.f14005b.isEmpty()) {
                return a2Var;
            }
            return this;
        }
        x.o("Already frozen");
        return null;
    }

    public final boolean c() {
        if (!this.f14005b.containsKey(f14003d)) {
            a2 a2Var = this.f14004a;
            if (a2Var == null || !a2Var.c()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (a2 a2Var = this; a2Var != null; a2Var = a2Var.f14004a) {
            for (int i = 0; i < a2Var.f14005b.f20934w; i++) {
                sb2.append(this.f14005b.j(i));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
