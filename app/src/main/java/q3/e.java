package q3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public final View f23389u;

    /* renamed from: v, reason: collision with root package name */
    public ViewTreeObserver f23390v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f23391w;

    public e(View view, Runnable runnable) {
        this.f23389u = view;
        this.f23390v = view.getViewTreeObserver();
        this.f23391w = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f23390v.isAlive();
        View view = this.f23389u;
        if (isAlive) {
            this.f23390v.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f23391w.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f23390v = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f23390v.isAlive();
        View view2 = this.f23389u;
        if (isAlive) {
            this.f23390v.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
