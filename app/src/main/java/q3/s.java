package q3;
import q0.a;
import v.e;
import v.h;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f23428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f23429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f23430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23431d;
    public final /* synthetic */ View e;

    public s(a0 a0Var, q0 q0Var, q0 q0Var2, int i, View view) {
        this.f23428a = a0Var;
        this.f23429b = q0Var;
        this.f23430c = q0Var2;
        this.f23431d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g0 b0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a0 a0Var = this.f23428a;
        z zVar = a0Var.f23378a;
        zVar.e(animatedFraction);
        float c10 = zVar.c();
        PathInterpolator pathInterpolator = e;
        int i = Build.VERSION.SDK_INT;
        q0 q0Var = this.f23429b;
        if (i >= 34) {
            b0Var = new f0(q0Var);
        } else if (i >= 30) {
            b0Var = new e0(q0Var);
        } else if (i >= 29) {
            b0Var = new d0(q0Var);
        } else {
            b0Var = new b0(q0Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int i11 = this.f23431d & i10;
            n0 n0Var = q0Var.f23423a;
            if (i11 == 0) {
                b0Var.c(i10, n0Var.g(i10));
            } else {
                j3.c g8 = n0Var.g(i10);
                j3.c g10 = this.f23430c.f23423a.g(i10);
                float f10 = 1.0f - c10;
                b0Var.c(i10, a(g8, (int) (((g8.f18874a - g10.f18874a) * f10) + 0.5d), (int) (((g8.f18875b - g10.f18875b) * f10) + 0.5d), (int) (((g8.f18876c - g10.f18876c) * f10) + 0.5d), (int) (((g8.f18877d - g10.f18877d) * f10) + 0.5d)));
            }
        }
        h(this.e, b0Var.b(), Collections.singletonList(a0Var));
    }
}
