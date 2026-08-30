package q3;
import c.b;
import k.a;
import q.h;
import q0.c;
import v.e;
import v.g;
import v.j;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.zb1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final zb1 f23434a;

    /* renamed from: b, reason: collision with root package name */
    public q0 f23435b;

    public u(View view, zb1 zb1Var) {
        q0 q0Var;
        g0 b0Var;
        this.f23434a = zb1Var;
        boolean z3 = p.f23420a;
        q0 a10 = a(view);
        if (a10 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                b0Var = new f0(a10);
            } else if (i >= 30) {
                b0Var = new e0(a10);
            } else if (i >= 29) {
                b0Var = new d0(a10);
            } else {
                b0Var = new b0(a10);
            }
            q0Var = b0Var.b();
        } else {
            q0Var = null;
        }
        this.f23435b = q0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j10;
        int[] iArr;
        boolean z3;
        boolean z9;
        if (!view.isLaidOut()) {
            this.f23435b = c(windowInsets, view);
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        q0 c10 = c(windowInsets, view);
        n0 n0Var = c10.f23423a;
        if (this.f23435b == null) {
            boolean z10 = p.f23420a;
            this.f23435b = a(view);
        }
        if (this.f23435b == null) {
            this.f23435b = c10;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            zb1 j11 = j(view);
            if (j11 != null && Objects.equals((q0) j11.f13135v, c10)) {
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                q0 q0Var = this.f23435b;
                int i = 1;
                while (i <= 512) {
                    j3.c g8 = n0Var.g(i);
                    j3.c g10 = q0Var.f23423a.g(i);
                    int i10 = g8.f18874a;
                    int i11 = g8.f18877d;
                    int i12 = g8.f18876c;
                    int i13 = g8.f18875b;
                    int i14 = g10.f18874a;
                    int i15 = g10.f18877d;
                    int[] iArr4 = iArr2;
                    int i16 = g10.f18876c;
                    int i17 = g10.f18875b;
                    if (i10 <= i14 && i13 <= i17 && i12 <= i16 && i11 <= i15) {
                        iArr = iArr3;
                        z3 = false;
                    } else {
                        iArr = iArr3;
                        z3 = true;
                    }
                    if (i10 >= i14 && i13 >= i17 && i12 >= i16 && i11 >= i15) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z3 != z9) {
                        if (z3) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i18 = iArr2[0];
                int i19 = iArr3[0];
                int i20 = i18 | i19;
                if (i20 == 0) {
                    this.f23435b = c10;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    q0 q0Var2 = this.f23435b;
                    if ((i18 & 8) != 0) {
                        interpolator = e;
                    } else if ((i19 & 8) != 0) {
                        interpolator = v.f23436f;
                    } else if ((i18 & 519) != 0) {
                        interpolator = v.f23437g;
                    } else if ((i19 & 519) != 0) {
                        interpolator = v.f23438h;
                    } else {
                        interpolator = null;
                    }
                    if ((i20 & 8) != 0) {
                        j10 = 160;
                    } else {
                        j10 = 250;
                    }
                    a0 a0Var = new a0(i20, interpolator, j10);
                    a0Var.f23378a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a0Var.f23378a.b());
                    j3.c g11 = n0Var.g(i20);
                    j3.c g12 = q0Var2.f23423a.g(i20);
                    int min = Math.min(g11.f18874a, g12.f18874a);
                    int i21 = g11.f18875b;
                    int i22 = g12.f18875b;
                    int min2 = Math.min(i21, i22);
                    int i23 = g11.f18876c;
                    int i24 = g12.f18876c;
                    int min3 = Math.min(i23, i24);
                    int i25 = g11.f18877d;
                    int i26 = g12.f18877d;
                    j6.l lVar = new j6.l(j3.b(min, min2, min3, Math.min(i25, i26)), 18, j3.b(Math.max(g11.f18874a, g12.f18874a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
                    g(view, a0Var, c10, false);
                    duration.addUpdateListener(new s(a0Var, c10, q0Var2, i20, view));
                    duration.addListener(new t(view, a0Var));
                    b9.a aVar = new b9.a(view, a0Var, lVar, duration, 10);
                    if (view != null) {
                        e eVar = new e(view, aVar);
                        view.getViewTreeObserver().addOnPreDrawListener(eVar);
                        view.addOnAttachStateChangeListener(eVar);
                    } else {
                        g5.h("view == null");
                    }
                    this.f23435b = c10;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                    return windowInsets;
                }
            }
        }
        return windowInsets;
    }
}
