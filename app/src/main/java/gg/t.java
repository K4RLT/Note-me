package gg;
import k.b;
import l.a;
import t.s;
import u.a;

import c7.f0;
import c7.x;
import eg.t0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f17799a;

    /* renamed from: b, reason: collision with root package name */
    public final fg.c f17800b;

    /* renamed from: c, reason: collision with root package name */
    public final w f17801c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f17802d;
    public final fg.j e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17803f;

    /* renamed from: g, reason: collision with root package name */
    public String f17804g;

    /* renamed from: h, reason: collision with root package name */
    public String f17805h;

    public t(f0 f0Var, fg.c cVar, w wVar, t[] tVarArr) {
        f0Var.getClass();
        this.f17799a = f0Var;
        this.f17800b = cVar;
        this.f17801c = wVar;
        this.f17802d = tVarArr;
        this.e = cVar.f16965a;
        int ordinal = wVar.ordinal();
        if (tVarArr != null) {
            t tVar = tVarArr[ordinal];
            if (tVar != null || tVar != this) {
                tVarArr[ordinal] = this;
            }
        }
    }

    public final t a(cg.d dVar) {
        t tVar;
        dVar.getClass();
        fg.c cVar = this.f17800b;
        w n10 = k.n(dVar, cVar);
        char c10 = n10.f17813u;
        f0 f0Var = this.f17799a;
        f0Var.f(c10);
        f0Var.b();
        String str = this.f17804g;
        if (str != null) {
            String str2 = this.f17805h;
            if (str2 == null) {
                str2 = dVar.a();
            }
            f0Var.c();
            f0Var.k(str);
            f0Var.f(':');
            f0Var.m();
            u(str2);
            this.f17804g = null;
            this.f17805h = null;
        }
        if (this.f17801c == n10) {
            return this;
        }
        t[] tVarArr = this.f17802d;
        if (tVarArr != null && (tVar = tVarArr[n10.ordinal()]) != null) {
            return tVar;
        }
        return new t(f0Var, cVar, n10, tVarArr);
    }

    public final void b(boolean z3) {
        if (this.f17803f) {
            u(String.valueOf(z3));
        } else {
            ((x) this.f17799a.f3950v).m(String.valueOf(z3));
        }
    }

    public final void c(cg.d dVar, int i, boolean z3) {
        dVar.getClass();
        g(dVar, i);
        b(z3);
    }

    public final void d(byte b10) {
        if (this.f17803f) {
            u(String.valueOf((int) b10));
        } else {
            this.f17799a.e(b10);
        }
    }

    public final void e(char c10) {
        u(String.valueOf(c10));
    }

    public final void f(double d2) {
        boolean z3 = this.f17803f;
        f0 f0Var = this.f17799a;
        if (z3) {
            u(String.valueOf(d2));
        } else {
            ((x) f0Var.f3950v).m(String.valueOf(d2));
        }
        if (Math.abs(d2) <= Double.MAX_VALUE) {
        } else {
            throw b(Double.valueOf(d2), ((x) f0Var.f3950v).toString());
        }
    }

    public final void g(cg.d dVar, int i) {
        dVar.getClass();
        int ordinal = this.f17801c.ordinal();
        f0 f0Var = this.f17799a;
        boolean z3 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!f0Var.f3949u) {
                        f0Var.f(',');
                    }
                    f0Var.c();
                    k.m(dVar, this.f17800b);
                    u(dVar.g(i));
                    f0Var.f(':');
                    f0Var.m();
                    return;
                }
                if (i == 0) {
                    this.f17803f = true;
                }
                if (i == 1) {
                    f0Var.f(',');
                    f0Var.m();
                    this.f17803f = false;
                    return;
                }
                return;
            }
            if (!f0Var.f3949u) {
                if (i % 2 == 0) {
                    f0Var.f(',');
                    f0Var.c();
                } else {
                    f0Var.f(':');
                    f0Var.m();
                    z3 = false;
                }
                this.f17803f = z3;
                return;
            }
            this.f17803f = true;
            f0Var.c();
            return;
        }
        if (!f0Var.f3949u) {
            f0Var.f(',');
        }
        f0Var.c();
    }

    public final void h(float f10) {
        boolean z3 = this.f17803f;
        f0 f0Var = this.f17799a;
        if (z3) {
            u(String.valueOf(f10));
        } else {
            ((x) f0Var.f3950v).m(String.valueOf(f10));
        }
        if (Math.abs(f10) <= Float.MAX_VALUE) {
        } else {
            throw b(Float.valueOf(f10), ((x) f0Var.f3950v).toString());
        }
    }

    public final void i(cg.d dVar, int i, float f10) {
        dVar.getClass();
        g(dVar, i);
        h(f10);
    }

    public final t j(cg.d dVar) {
        dVar.getClass();
        boolean a10 = a(dVar);
        w wVar = this.f17801c;
        fg.c cVar = this.f17800b;
        f0 f0Var = this.f17799a;
        if (a10) {
            if (!(f0Var instanceof f)) {
                f0Var = new f((x) f0Var.f3950v, this.f17803f);
            }
            return new t(f0Var, cVar, wVar, null);
        }
        if (dVar.isInline() && dVar.equals(fg.n.f16990a)) {
            if (!(f0Var instanceof e)) {
                f0Var = new e((x) f0Var.f3950v, this.f17803f);
            }
            return new t(f0Var, cVar, wVar, null);
        }
        if (this.f17804g != null) {
            this.f17805h = dVar.a();
        }
        return this;
    }

    public final t k(t0 t0Var, int i) {
        t0Var.getClass();
        g(t0Var, i);
        return j(t0Var.i(i));
    }

    public final void l(int i) {
        if (this.f17803f) {
            u(String.valueOf(i));
        } else {
            this.f17799a.g(i);
        }
    }

    public final void m(int i, int i10, cg.d dVar) {
        dVar.getClass();
        g(dVar, i);
        l(i10);
    }

    public final void n(long j10) {
        if (this.f17803f) {
            u(String.valueOf(j10));
        } else {
            this.f17799a.h(j10);
        }
    }

    public final void o(cg.d dVar, int i, long j10) {
        dVar.getClass();
        g(dVar, i);
        n(j10);
    }

    public final void p() {
        f0 f0Var = this.f17799a;
        f0Var.getClass();
        ((x) f0Var.f3950v).m("null");
    }

    public final void q(cg.d dVar, int i, ag.a aVar, Object obj) {
        dVar.getClass();
        aVar.getClass();
        if (obj == null && !this.e.f16986d) {
            return;
        }
        dVar.getClass();
        aVar.getClass();
        g(dVar, i);
        if (aVar.d().c()) {
            s(aVar, obj);
        } else if (obj == null) {
            p();
        } else {
            s(aVar, obj);
        }
    }

    public final void r(cg.d dVar, int i, ag.a aVar, Object obj) {
        dVar.getClass();
        aVar.getClass();
        g(dVar, i);
        s(aVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        if (kotlin.jvm.internal.a(r2, cg.i.e) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r2 != fg.a.f16956u) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(ag.a r7, java.lang.Object r8) {
        /*
            r6 = this;
            r7.getClass()
            fg.c r0 = r6.f17800b
            fg.j r0 = r0.f16965a
            boolean r1 = r7 instanceof ag.c
            fg.a r2 = r0.f16989h
            r3 = 0
            if (r1 == 0) goto L13
            fg.a r4 = fg.a.f16956u
            if (r2 == r4) goto L65
            goto L3c
        L13:
            int r2 = r2.ordinal()
            if (r2 == 0) goto L65
            r4 = 1
            if (r2 == r4) goto L24
            r0 = 2
            if (r2 != r0) goto L20
            goto L65
        L20:
            l4.a.o()
            return
        L24:
            cg.d r2 = r7.d()
            wa.z r2 = r2.e()
            cg.i r4 = cg.i.f4134b
            boolean r4 = kotlin.jvm.internal.a(r2, r4)
            if (r4 != 0) goto L3c
            cg.i r4 = cg.i.e
            boolean r2 = kotlin.jvm.internal.a(r2, r4)
            if (r2 == 0) goto L65
        L3c:
            cg.d r2 = r7.d()
            r2.getClass()
            java.util.List r2 = r2.getAnnotations()
            java.util.Iterator r2 = r2.iterator()
        L4b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r2.next()
            java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
            boolean r5 = r4 instanceof fg.i
            if (r5 == 0) goto L4b
            fg.i r4 = (fg.i) r4
            java.lang.String r0 = r4.discriminator()
            goto L66
        L62:
            java.lang.String r0 = r0.f16987f
            goto L66
        L65:
            r0 = r3
        L66:
            if (r1 != 0) goto L7a
            if (r0 == 0) goto L76
            cg.d r1 = r7.d()
            java.lang.String r1 = r1.a()
            r6.f17804g = r0
            r6.f17805h = r1
        L76:
            r7.a(r6, r8)
            return
        L7a:
            ag.c r7 = (ag.c) r7
            r8.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.s(ag.a, java.lang.Object):void");
    }

    public final void t(short s10) {
        if (this.f17803f) {
            u(String.valueOf((int) s10));
        } else {
            this.f17799a.j(s10);
        }
    }

    public final void u(String str) {
        str.getClass();
        this.f17799a.k(str);
    }

    public final void v(cg.d dVar, int i, String str) {
        dVar.getClass();
        str.getClass();
        g(dVar, i);
        u(str);
    }

    public final void w(cg.d dVar) {
        dVar.getClass();
        f0 f0Var = this.f17799a;
        f0Var.n();
        f0Var.d();
        f0Var.f(this.f17801c.f17814v);
    }

    public final boolean x(cg.d dVar) {
        dVar.getClass();
        return this.e.f16983a;
    }
}
