package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f3216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f3217d;

    public c0(z zVar, z zVar2, a0 a0Var, a0 a0Var2) {
        this.f3214a = zVar;
        this.f3215b = zVar2;
        this.f3216c = a0Var;
        this.f3217d = a0Var2;
    }

    public final void onBackCancelled() {
        this.f3217d.invoke();
    }

    public final void onBackInvoked() {
        this.f3216c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Object obj;
        backEvent.getClass();
        a.k(backEvent);
        a.l(backEvent);
        a.f(backEvent);
        a.j(backEvent);
        g0 g0Var = this.f3215b.f3278v;
        if (g0Var.f3234c == null) {
            qe.j jVar = g0Var.f3233b;
            ListIterator listIterator = jVar.listIterator(jVar.size());
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
    }

    public final void onBackStarted(BackEvent backEvent) {
        Object obj;
        backEvent.getClass();
        a.k(backEvent);
        a.l(backEvent);
        a.f(backEvent);
        a.j(backEvent);
        g0 g0Var = this.f3214a.f3278v;
        qe.j jVar = g0Var.f3233b;
        ListIterator listIterator = jVar.listIterator(jVar.size());
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
        y yVar = (y) obj;
        if (g0Var.f3234c != null) {
            g0Var.b();
        }
        g0Var.f3234c = yVar;
    }
}
