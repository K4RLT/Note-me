package q3;
import v.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f23432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23433b;

    public t(View view, a0 a0Var) {
        this.f23432a = a0Var;
        this.f23433b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a0 a0Var = this.f23432a;
        a0Var.f23378a.e(1.0f);
        f(this.f23433b, a0Var);
    }
}
