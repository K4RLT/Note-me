package c;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3232a;

    /* renamed from: b, reason: collision with root package name */
    public final qe.j f3233b = new qe.j();

    /* renamed from: c, reason: collision with root package name */
    public y f3234c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3235d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3236f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3237g;

    public g0(Runnable runnable) {
        OnBackInvokedCallback b0Var;
        this.f3232a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                b0Var = new c0(new z(this, 0), new z(this, 1), new a0(this, 0), new a0(this, 1));
            } else {
                b0Var = new b0(0, new a0(this, 2));
            }
            this.f3235d = b0Var;
        }
    }

    public final void a(androidx.lifecycle.w wVar, y yVar) {
        wVar.getClass();
        yVar.getClass();
        androidx.lifecycle.y g8 = wVar.g();
        if (g8.f1084d == androidx.lifecycle.p.f1048u) {
            return;
        }
        yVar.f3275b.add(new d0(this, g8, yVar));
        e();
        yVar.f3276c = new f0(0, this, g0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        if (this.f3234c == null) {
            qe.j jVar = this.f3233b;
            ListIterator<E> listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((y) obj).f3274a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        }
        this.f3234c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        y yVar;
        y yVar2 = this.f3234c;
        if (yVar2 == null) {
            qe.j jVar = this.f3233b;
            ListIterator listIterator = jVar.listIterator(jVar.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                    yVar = listIterator.previous();
                    if (((y) yVar).f3274a) {
                        break;
                    }
                } else {
                    yVar = 0;
                    break;
                }
            }
            yVar2 = yVar;
        }
        this.f3234c = null;
        if (yVar2 != null) {
            yVar2.a();
        } else {
            this.f3232a.run();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3235d) != null) {
            if (z3 && !this.f3236f) {
                i.g(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f3236f = true;
            } else if (!z3 && this.f3236f) {
                i.h(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f3236f = false;
            }
        }
    }

    public final void e() {
        boolean z3 = this.f3237g;
        boolean z9 = false;
        qe.j jVar = this.f3233b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((y) it.next()).f3274a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f3237g = z9;
        if (z9 != z3 && Build.VERSION.SDK_INT >= 33) {
            d(z9);
        }
    }
}
