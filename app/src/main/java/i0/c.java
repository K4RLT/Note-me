package i0;
import l.a;

import a0.k0;
import android.graphics.Rect;
import android.view.View;
import b8.l2;
import c2.n2;
import c2.p1;
import g0.i0;
import java.lang.ref.WeakReference;
import m2.m0;
import m2.p0;
import pf.b0;
import pf.r1;
import r2.x;
import sf.d0;
import sf.e0;
import sf.z;
import wa.b8;

/* loaded from: classes.dex */
public final class c implements r2.s {

    /* renamed from: a, reason: collision with root package name */
    public n f18036a;

    /* renamed from: b, reason: collision with root package name */
    public r1 f18037b;

    /* renamed from: c, reason: collision with root package name */
    public r f18038c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f18039d;

    @Override // r2.s
    public final void a() {
        j(null);
    }

    @Override // r2.s
    public final void b() {
        n2 n2Var;
        n nVar = this.f18036a;
        if (nVar != null && (n2Var = (n2) b2.l.h(nVar, p1.f3613p)) != null) {
            ((c2.r1) n2Var).b();
        }
    }

    @Override // r2.s
    public final void c() {
        r1 r1Var = this.f18037b;
        if (r1Var != null) {
            r1Var.j(null);
        }
        this.f18037b = null;
        z i = i();
        if (i != null) {
            d0 d0Var = (d0) i;
            synchronized (d0Var) {
                d0Var.u(d0Var.o() + d0Var.E, d0Var.D, d0Var.o() + d0Var.E, d0Var.o() + d0Var.E + d0Var.F);
            }
        }
    }

    @Override // r2.s
    public final void d(j1.c cVar) {
        Rect rect;
        r rVar = this.f18038c;
        if (rVar != null) {
            rVar.f18082l = new Rect(ff.a.b(cVar.f18763a), ff.a.b(cVar.f18764b), ff.a.b(cVar.f18765c), ff.a.b(cVar.f18766d));
            if (rVar.f18080j.isEmpty() && (rect = rVar.f18082l) != null) {
                rVar.f18073a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // r2.s
    public final void e(x xVar, r2.q qVar, m0 m0Var, k0 k0Var, j1.c cVar, j1.c cVar2) {
        r rVar = this.f18038c;
        if (rVar != null) {
            o oVar = rVar.f18083m;
            synchronized (oVar.f18058c) {
                try {
                    oVar.f18063j = xVar;
                    oVar.f18065l = qVar;
                    oVar.f18064k = m0Var;
                    oVar.f18066m = cVar;
                    oVar.f18067n = cVar2;
                    if (!oVar.e) {
                        if (oVar.f18059d) {
                        }
                    }
                    oVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // r2.s
    public final void f() {
        n2 n2Var;
        n nVar = this.f18036a;
        if (nVar != null && (n2Var = (n2) b2.l.h(nVar, p1.f3613p)) != null) {
            ((c2.r1) n2Var).a();
        }
    }

    @Override // r2.s
    public final void g(x xVar, x xVar2) {
        boolean z3;
        int i;
        int i10;
        int i11;
        r rVar = this.f18038c;
        if (rVar != null) {
            if (p0.a(rVar.f18079h.f24516b, xVar2.f24516b) && kotlin.jvm.internal.a(rVar.f18079h.f24517c, xVar2.f24517c)) {
                z3 = false;
            } else {
                z3 = true;
            }
            rVar.f18079h = xVar2;
            int size = rVar.f18080j.size();
            for (int i12 = 0; i12 < size; i12++) {
                s sVar = (s) ((WeakReference) rVar.f18080j.get(i12)).get();
                if (sVar != null) {
                    sVar.f18089g = xVar2;
                }
            }
            o oVar = rVar.f18083m;
            synchronized (oVar.f18058c) {
                oVar.f18063j = null;
                oVar.f18065l = null;
                oVar.f18064k = null;
                oVar.f18066m = null;
                oVar.f18067n = null;
            }
            int i13 = -1;
            if (kotlin.jvm.internal.a(xVar, xVar2)) {
                if (z3) {
                    m mVar = rVar.f18074b;
                    int e = p0.e(xVar2.f24516b);
                    int d2 = p0.d(xVar2.f24516b);
                    p0 p0Var = rVar.f18079h.f24517c;
                    if (p0Var != null) {
                        i11 = p0.e(p0Var.f20546a);
                    } else {
                        i11 = -1;
                    }
                    p0 p0Var2 = rVar.f18079h.f24517c;
                    if (p0Var2 != null) {
                        i13 = p0.d(p0Var2.f20546a);
                    }
                    mVar.i().updateSelection((View) mVar.f18055w, e, d2, i11, i13);
                    return;
                }
                return;
            }
            if (xVar != null && (!kotlin.jvm.internal.a(xVar.f24515a.f20477v, xVar2.f24515a.f20477v) || (p0.a(xVar.f24516b, xVar2.f24516b) && !kotlin.jvm.internal.a(xVar.f24517c, xVar2.f24517c)))) {
                m mVar2 = rVar.f18074b;
                mVar2.i().restartInput((View) mVar2.f18055w);
                return;
            }
            int size2 = rVar.f18080j.size();
            for (int i14 = 0; i14 < size2; i14++) {
                s sVar2 = (s) ((WeakReference) rVar.f18080j.get(i14)).get();
                if (sVar2 != null) {
                    x xVar3 = rVar.f18079h;
                    m mVar3 = rVar.f18074b;
                    if (sVar2.f18092k) {
                        sVar2.f18089g = xVar3;
                        if (sVar2.i) {
                            mVar3.i().updateExtractedText((View) mVar3.f18055w, sVar2.f18090h, b8.a(xVar3));
                        }
                        p0 p0Var3 = xVar3.f24517c;
                        long j10 = xVar3.f24516b;
                        if (p0Var3 != null) {
                            i = p0.e(p0Var3.f20546a);
                        } else {
                            i = -1;
                        }
                        p0 p0Var4 = xVar3.f24517c;
                        if (p0Var4 != null) {
                            i10 = p0.d(p0Var4.f20546a);
                        } else {
                            i10 = -1;
                        }
                        mVar3.i().updateSelection((View) mVar3.f18055w, p0.e(j10), p0.d(j10), i, i10);
                    }
                }
            }
        }
    }

    @Override // r2.s
    public final void h(x xVar, r2.j jVar, b2.k0 k0Var, i0 i0Var) {
        j(new c3.h(xVar, this, jVar, k0Var, i0Var, 3));
    }

    public final z i() {
        d0 d0Var = this.f18039d;
        if (d0Var != null) {
            return d0Var;
        }
        if (!h0.b.f17821a) {
            return null;
        }
        d0 a10 = e0.a(1, 0, rf.a.f24771w);
        this.f18039d = a10;
        return a10;
    }

    public final void j(c3.h hVar) {
        n nVar = this.f18036a;
        if (nVar == null) {
            return;
        }
        r1 r1Var = null;
        l2 l2Var = new l2(hVar, this, nVar, r1Var, 10);
        if (nVar.H) {
            r1Var = b0.x(nVar.M0(), null, new b5.a(nVar, l2Var, r1Var, 24), 1);
        }
        this.f18037b = r1Var;
    }

    public final void k(n nVar) {
        boolean z3;
        if (this.f18036a == nVar) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            w.a.c("Expected textInputModifierNode to be " + nVar + " but was " + this.f18036a);
        }
        this.f18036a = null;
    }
}
