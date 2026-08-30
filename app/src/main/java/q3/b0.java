package q3;
import q0.c;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b0 extends g0 {
    public static Field e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f23382f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f23383g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f23384h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f23385c;

    /* renamed from: d, reason: collision with root package name */
    public j3.c f23386d;

    public b0() {
        this.f23385c = i();
    }

    private static WindowInsets i() {
        if (!f23382f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
            }
            f23382f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f23384h) {
            try {
                f23383g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f23384h = true;
        }
        Constructor constructor = f23383g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // q3.g0
    public q0 b() {
        a();
        q0 c10 = c(this.f23385c, null);
        j3.c[] cVarArr = this.f23395b;
        n0 n0Var = c10.f23423a;
        n0Var.r(cVarArr);
        n0Var.u(this.f23386d);
        return c10;
    }

    @Override // q3.g0
    public void e(j3.c cVar) {
        this.f23386d = cVar;
    }

    @Override // q3.g0
    public void g(j3.c cVar) {
        WindowInsets windowInsets = this.f23385c;
        if (windowInsets != null) {
            this.f23385c = windowInsets.replaceSystemWindowInsets(cVar.f18874a, cVar.f18875b, cVar.f18876c, cVar.f18877d);
        }
    }

    public b0(q0 q0Var) {
        super(q0Var);
        this.f23385c = q0Var.b();
    }
}
