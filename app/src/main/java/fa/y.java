package fa;
import x.m;
import x.n;
import x.o;
import q.h;
import q.l;
import q.x;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f16928a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16929b;

    /* renamed from: c, reason: collision with root package name */
    public static int f16930c;

    public static void a(String str, boolean z3) {
        if (z3) {
            return;
        }
        x.n(str);
    }

    public static void b(boolean z3) {
        if (z3) {
            return;
        }
        x.m();
    }

    public static void c(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            g3.a.t(sb2, "Must be called on ", name, " thread, but got ", str);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        x.o(str);
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        x.n("Given String is empty or null");
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        x.n(str2);
    }

    public static void g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        x.o(str);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        g5.h("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        g5.h(str);
    }

    public static void j(String str, boolean z3) {
        if (z3) {
            return;
        }
        x.o(str);
    }

    public static void k(boolean z3) {
        if (z3) {
            return;
        }
        g5.l();
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
