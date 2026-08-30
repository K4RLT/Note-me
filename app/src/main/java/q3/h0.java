package q3;
import c.a;
import c.b;
import q0.a;
import q0.c;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.datastore.preferences.protobuf.s1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import ya.ea;

/* loaded from: classes.dex */
public class h0 extends n0 {
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f23396j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f23397k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f23398l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f23399m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f23400c;

    /* renamed from: d, reason: collision with root package name */
    public j3.c[] f23401d;
    public j3.c e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f23402f;

    /* renamed from: g, reason: collision with root package name */
    public j3.c f23403g;

    /* renamed from: h, reason: collision with root package name */
    public int f23404h;

    public h0(q0 q0Var, h0 h0Var) {
        this(q0Var, new WindowInsets(h0Var.f23400c));
    }

    private static void B() {
        try {
            f23396j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f23397k = cls;
            f23398l = cls.getDeclaredField("mVisibleInsets");
            f23399m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f23398l.setAccessible(true);
            f23399m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean C(int i10, int i11) {
        if ((i10 & 6) == (i11 & 6)) {
            return true;
        }
        return false;
    }

    private j3.c w(int i10, boolean z3) {
        j3.c cVar = j3.c.e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVar = j3.a(cVar, x(i11, z3));
            }
        }
        return cVar;
    }

    private j3.c y() {
        q0 q0Var = this.f23402f;
        if (q0Var != null) {
            return q0Var.f23423a.j();
        }
        return j3.c.e;
    }

    private j3.c z(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!i) {
                B();
            }
            Method method = f23396j;
            if (method != null && f23397k != null && f23398l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f23398l.get(f23399m.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return j3.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        s1.k("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    public boolean A(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !x(i10, false).equals(j3.c.e);
    }

    @Override // q3.n0
    public void d(View view) {
        j3.c z3 = z(view);
        if (z3 == null) {
            z3 = j3.c.e;
        }
        s(z3);
    }

    @Override // q3.n0
    public void e(q0 q0Var) {
        q0Var.f23423a.t(this.f23402f);
        j3.c cVar = this.f23403g;
        n0 n0Var = q0Var.f23423a;
        n0Var.s(cVar);
        n0Var.v(this.f23404h);
    }

    @Override // q3.n0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!Objects.equals(this.f23403g, h0Var.f23403g) || !C(this.f23404h, h0Var.f23404h)) {
            return false;
        }
        return true;
    }

    @Override // q3.n0
    public j3.c g(int i10) {
        return w(i10, false);
    }

    @Override // q3.n0
    public j3.c h(int i10) {
        return w(i10, true);
    }

    @Override // q3.n0
    public final j3.c l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f23400c;
            this.e = j3.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // q3.n0
    public q0 n(int i10, int i11, int i12, int i13) {
        g0 b0Var;
        q0 c10 = c(this.f23400c, null);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            b0Var = new f0(c10);
        } else if (i14 >= 30) {
            b0Var = new e0(c10);
        } else if (i14 >= 29) {
            b0Var = new d0(c10);
        } else {
            b0Var = new b0(c10);
        }
        b0Var.g(a(l(), i10, i11, i12, i13));
        b0Var.e(a(j(), i10, i11, i12, i13));
        return b0Var.b();
    }

    @Override // q3.n0
    public boolean p() {
        return this.f23400c.isRound();
    }

    @Override // q3.n0
    public boolean q(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !A(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // q3.n0
    public void r(j3.c[] cVarArr) {
        this.f23401d = cVarArr;
    }

    @Override // q3.n0
    public void s(j3.c cVar) {
        this.f23403g = cVar;
    }

    @Override // q3.n0
    public void t(q0 q0Var) {
        this.f23402f = q0Var;
    }

    @Override // q3.n0
    public void v(int i10) {
        this.f23404h = i10;
    }

    public j3.c x(int i10, boolean z3) {
        int i11;
        c f10;
        int i12;
        int i13;
        int i14;
        j3.c cVar = j3.c.e;
        int i15 = 0;
        if (i10 != 1) {
            j3.c cVar2 = null;
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 == 128) {
                                    q0 q0Var = this.f23402f;
                                    if (q0Var != null) {
                                        f10 = q0Var.f23423a.f();
                                    } else {
                                        f10 = f();
                                    }
                                    if (f10 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = f3.k.h(f10.f23387a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = f3.k.j(f10.f23387a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = f3.k.i(f10.f23387a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = f3.k.g(f10.f23387a);
                                        }
                                        return j3.b(i12, i13, i14, i15);
                                    }
                                }
                            } else {
                                return m();
                            }
                        } else {
                            return i();
                        }
                    } else {
                        return k();
                    }
                } else {
                    j3.c[] cVarArr = this.f23401d;
                    if (cVarArr != null) {
                        cVar2 = cVarArr[ea.a(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    j3.c l10 = l();
                    j3.c y10 = y();
                    int i17 = l10.f18877d;
                    if (i17 > y10.f18877d) {
                        return j3.b(0, 0, 0, i17);
                    }
                    j3.c cVar3 = this.f23403g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i11 = this.f23403g.f18877d) > y10.f18877d) {
                        return j3.b(0, 0, 0, i11);
                    }
                }
            } else {
                if (z3) {
                    j3.c y11 = y();
                    j3.c j10 = j();
                    return j3.b(Math.max(y11.f18874a, j10.f18874a), 0, Math.max(y11.f18876c, j10.f18876c), Math.max(y11.f18877d, j10.f18877d));
                }
                if ((this.f23404h & 2) == 0) {
                    j3.c l11 = l();
                    q0 q0Var2 = this.f23402f;
                    if (q0Var2 != null) {
                        cVar2 = q0Var2.f23423a.j();
                    }
                    int i18 = l11.f18877d;
                    if (cVar2 != null) {
                        i18 = Math.min(i18, cVar2.f18877d);
                    }
                    return j3.b(l11.f18874a, 0, l11.f18876c, i18);
                }
            }
        } else {
            if (z3) {
                return j3.b(0, Math.max(y().f18875b, l().f18875b), 0, 0);
            }
            if ((this.f23404h & 4) == 0) {
                return j3.b(0, l().f18875b, 0, 0);
            }
        }
        return cVar;
    }

    public h0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var);
        this.e = null;
        this.f23400c = windowInsets;
    }
}
