package q3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23425a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f23426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23427c;

    public r0(Window window, k6.i iVar, int i) {
        WindowInsetsController insetsController;
        this.f23425a = i;
        switch (i) {
            case 1:
                insetsController = window.getInsetsController();
                this.f23427c = insetsController;
                this.f23426b = window;
                return;
            default:
                this.f23426b = window;
                this.f23427c = iVar;
                return;
        }
    }

    public final void a() {
        switch (this.f23425a) {
            case 0:
                for (int i = 1; i <= 512; i <<= 1) {
                    if ((519 & i) != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 8) {
                                    ((ic.c) ((k6.i) this.f23427c).f19569v).v();
                                }
                            } else {
                                f(2);
                            }
                        } else {
                            f(4);
                        }
                    }
                }
                return;
            default:
                ((WindowInsetsController) this.f23427c).hide(519);
                return;
        }
    }

    public void b(boolean z3) {
        switch (this.f23425a) {
            case 1:
                Window window = this.f23426b;
                if (z3) {
                    if (window != null) {
                        f(16);
                    }
                    ((WindowInsetsController) this.f23427c).setSystemBarsAppearance(16, 16);
                    return;
                } else {
                    if (window != null) {
                        g(16);
                    }
                    ((WindowInsetsController) this.f23427c).setSystemBarsAppearance(0, 16);
                    return;
                }
            default:
                return;
        }
    }

    public final void d(boolean z3) {
        switch (this.f23425a) {
            case 0:
                if (z3) {
                    Window window = this.f23426b;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    f(8192);
                    return;
                }
                g(8192);
                return;
            default:
                Window window2 = this.f23426b;
                if (z3) {
                    if (window2 != null) {
                        f(8192);
                    }
                    ((WindowInsetsController) this.f23427c).setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    if (window2 != null) {
                        g(8192);
                    }
                    ((WindowInsetsController) this.f23427c).setSystemBarsAppearance(0, 8);
                    return;
                }
        }
    }

    public void e() {
        switch (this.f23425a) {
            case 0:
                this.f23426b.getDecorView().setTag(356039078, 2);
                g(2048);
                f(4096);
                return;
            default:
                Window window = this.f23426b;
                if (window == null) {
                    ((WindowInsetsController) this.f23427c).setSystemBarsBehavior(2);
                    return;
                }
                window.getDecorView().setTag(356039078, 2);
                g(2048);
                f(4096);
                return;
        }
    }

    public final void f(int i) {
        switch (this.f23425a) {
            case 0:
                View decorView = this.f23426b.getDecorView();
                decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
                return;
            default:
                View decorView2 = this.f23426b.getDecorView();
                decorView2.setSystemUiVisibility(i | decorView2.getSystemUiVisibility());
                return;
        }
    }

    public final void g(int i) {
        switch (this.f23425a) {
            case 0:
                View decorView = this.f23426b.getDecorView();
                decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
                return;
            default:
                View decorView2 = this.f23426b.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                return;
        }
    }

    public final void c(boolean z3) {
    }
}
