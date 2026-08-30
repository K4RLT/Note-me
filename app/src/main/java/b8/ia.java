package b8;
import r0.i1;
import r0.y;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class ia {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2220a;

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f2221b;

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f2222c;

    /* renamed from: d, reason: collision with root package name */
    public static final i1 f2223d;
    public static boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static int f2224f;

    /* renamed from: g, reason: collision with root package name */
    public static long f2225g;

    /* renamed from: h, reason: collision with root package name */
    public static final i1 f2226h;

    static {
        Boolean bool = Boolean.FALSE;
        f2221b = y.B(bool);
        f2222c = y.B(bool);
        f2223d = y.B(0);
        f2226h = y.B(bool);
    }

    public static boolean a() {
        return ((Boolean) f2221b.getValue()).booleanValue();
    }

    public static void b() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        i1 i1Var = f2222c;
        if (!((Boolean) i1Var.getValue()).booleanValue()) {
            i1Var.setValue(Boolean.TRUE);
            c(false);
            Context context = f2220a;
            if (context != null && (sharedPreferences = context.getSharedPreferences("universe_notice", 0)) != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("done", true)) != null) {
                putBoolean.apply();
            }
        }
    }

    public static void c(boolean z3) {
        f2226h.setValue(Boolean.valueOf(z3));
    }

    public static boolean d() {
        if (a() && !((Boolean) f2222c.getValue()).booleanValue() && !e && f2224f < 2 && System.currentTimeMillis() - f2225g >= 172800000) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (!((Boolean) f2226h.getValue()).booleanValue() && !((Boolean) z6.f3089c.getValue()).booleanValue()) {
            if (!((Boolean) z5.f3080g.f25140u.getValue()).booleanValue() || !d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
