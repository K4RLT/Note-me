package j9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f19090a;

    public n(o oVar) {
        this.f19090a = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o oVar = this.f19090a;
        oVar.setEnabled(true);
        oVar.f19091u.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.f19090a;
        oVar.setEnabled(true);
        oVar.f19091u.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o oVar = this.f19090a;
        oVar.setEnabled(false);
        oVar.f19091u.setEnabled(false);
    }
}
