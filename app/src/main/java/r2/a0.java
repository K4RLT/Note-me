package r2;
import l.a;

import a0.k0;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import j.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m2.m0;
import m2.p0;
import r.m1;
import ya.eb;

/* loaded from: classes.dex */
public final class a0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public final View f24447a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f24448b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.a f24449c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24450d;
    public kotlin.jvm.internal.m e;

    /* renamed from: f, reason: collision with root package name */
    public df.l f24451f;

    /* renamed from: g, reason: collision with root package name */
    public x f24452g;

    /* renamed from: h, reason: collision with root package name */
    public j f24453h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f24454j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f24455k;

    /* renamed from: l, reason: collision with root package name */
    public final c f24456l;

    /* renamed from: m, reason: collision with root package name */
    public final t0.e f24457m;

    /* renamed from: n, reason: collision with root package name */
    public a6.e f24458n;

    public a0(View view, c2.x xVar) {
        i0 i0Var = new i0(view);
        i7.a aVar = new i7.a(1, Choreographer.getInstance());
        this.f24447a = view;
        this.f24448b = i0Var;
        this.f24449c = aVar;
        this.e = b.f24461x;
        this.f24451f = b.f24462y;
        this.f24452g = new x("", p0.f20544b, 4);
        this.f24453h = j.f24491g;
        this.i = new ArrayList();
        this.f24454j = pe.a.c(pe.h.f22691v, new m1(2, this));
        this.f24456l = new c(xVar, i0Var);
        this.f24457m = new t0.e(new z[16]);
    }

    @Override // r2.s
    public final void a() {
        i(z.f24520u);
    }

    @Override // r2.s
    public final void b() {
        i(z.f24522w);
    }

    @Override // r2.s
    public final void c() {
        this.f24450d = false;
        this.e = b.f24463z;
        this.f24451f = b.A;
        this.f24455k = null;
        i(z.f24521v);
    }

    @Override // r2.s
    public final void d(j1.c cVar) {
        Rect rect;
        this.f24455k = new Rect(ff.a.b(cVar.f18763a), ff.a.b(cVar.f18764b), ff.a.b(cVar.f18765c), ff.a.b(cVar.f18766d));
        if (this.i.isEmpty() && (rect = this.f24455k) != null) {
            this.f24447a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // r2.s
    public final void e(x xVar, q qVar, m0 m0Var, k0 k0Var, j1.c cVar, j1.c cVar2) {
        c cVar3 = this.f24456l;
        synchronized (cVar3.f24469c) {
            try {
                cVar3.f24474j = xVar;
                cVar3.f24476l = qVar;
                cVar3.f24475k = m0Var;
                cVar3.f24477m = k0Var;
                cVar3.f24478n = cVar;
                cVar3.f24479o = cVar2;
                if (!cVar3.e) {
                    if (cVar3.f24470d) {
                    }
                }
                cVar3.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.s
    public final void f() {
        i(z.f24523x);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, pe.g] */
    @Override // r2.s
    public final void g(x xVar, x xVar2) {
        boolean z3;
        int i;
        int i10;
        int i11;
        if (p0.a(this.f24452g.f24516b, xVar2.f24516b) && kotlin.jvm.internal.a(this.f24452g.f24517c, xVar2.f24517c)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f24452g = xVar2;
        int size = this.i.size();
        for (int i12 = 0; i12 < size; i12++) {
            t tVar = (t) ((WeakReference) this.i.get(i12)).get();
            if (tVar != null) {
                tVar.f24505d = xVar2;
            }
        }
        c cVar = this.f24456l;
        synchronized (cVar.f24469c) {
            cVar.f24474j = null;
            cVar.f24476l = null;
            cVar.f24475k = null;
            cVar.f24477m = b.f24459v;
            cVar.f24478n = null;
            cVar.f24479o = null;
        }
        int i13 = -1;
        if (kotlin.jvm.internal.a(xVar, xVar2)) {
            if (z3) {
                i0 i0Var = this.f24448b;
                int e = p0.e(xVar2.f24516b);
                int d2 = p0.d(xVar2.f24516b);
                p0 p0Var = this.f24452g.f24517c;
                if (p0Var != null) {
                    i11 = p0.e(p0Var.f20546a);
                } else {
                    i11 = -1;
                }
                p0 p0Var2 = this.f24452g.f24517c;
                if (p0Var2 != null) {
                    i13 = p0.d(p0Var2.f20546a);
                }
                ((InputMethodManager) i0Var.f18637w.getValue()).updateSelection((View) i0Var.f18636v, e, d2, i11, i13);
                return;
            }
            return;
        }
        if (xVar != null && (!kotlin.jvm.internal.a(xVar.f24515a.f20477v, xVar2.f24515a.f20477v) || (p0.a(xVar.f24516b, xVar2.f24516b) && !kotlin.jvm.internal.a(xVar.f24517c, xVar2.f24517c)))) {
            i0 i0Var2 = this.f24448b;
            ((InputMethodManager) i0Var2.f18637w.getValue()).restartInput((View) i0Var2.f18636v);
            return;
        }
        int size2 = this.i.size();
        for (int i14 = 0; i14 < size2; i14++) {
            t tVar2 = (t) ((WeakReference) this.i.get(i14)).get();
            if (tVar2 != null) {
                x xVar3 = this.f24452g;
                i0 i0Var3 = this.f24448b;
                if (tVar2.f24508h) {
                    tVar2.f24505d = xVar3;
                    if (tVar2.f24506f) {
                        ((InputMethodManager) i0Var3.f18637w.getValue()).updateExtractedText((View) i0Var3.f18636v, tVar2.e, eb.a(xVar3));
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
                    ((InputMethodManager) i0Var3.f18637w.getValue()).updateSelection((View) i0Var3.f18636v, p0.e(j10), p0.d(j10), i, i10);
                }
            }
        }
    }

    @Override // r2.s
    public final void h(x xVar, j jVar, b2.k0 k0Var, g0.i0 i0Var) {
        this.f24450d = true;
        this.f24452g = xVar;
        this.f24453h = jVar;
        this.e = k0Var;
        this.f24451f = i0Var;
        i(z.f24520u);
    }

    public final void i(z zVar) {
        this.f24457m.b(zVar);
        if (this.f24458n == null) {
            a6.e eVar = new a6.e(25, this);
            this.f24449c.execute(eVar);
            this.f24458n = eVar;
        }
    }
}
