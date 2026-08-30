package b8;
import b8.z5;
import e0.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final z5 f3075a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final sf.n0 f3076b;

    /* renamed from: c, reason: collision with root package name */
    public static final sf.a0 f3077c;

    /* renamed from: d, reason: collision with root package name */
    public static final sf.n0 f3078d;
    public static final sf.a0 e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf.n0 f3079f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf.a0 f3080g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf.n0 f3081h;
    public static final sf.a0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final sf.n0 f3082j;

    /* renamed from: k, reason: collision with root package name */
    public static final sf.a0 f3083k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile u6 f3084l;

    /* renamed from: m, reason: collision with root package name */
    public static final sf.n0 f3085m;

    /* renamed from: n, reason: collision with root package name */
    public static final sf.a0 f3086n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b8.z5] */
    static {
        sf.n0 b10 = sf.b(Boolean.TRUE);
        f3076b = b10;
        f3077c = new sf.a0(b10);
        Boolean bool = Boolean.FALSE;
        sf.n0 b11 = sf.b(bool);
        f3078d = b11;
        e = new sf.a0(b11);
        sf.n0 b12 = sf.b(bool);
        f3079f = b12;
        f3080g = new sf.a0(b12);
        sf.n0 b13 = sf.b(bool);
        f3081h = b13;
        i = new sf.a0(b13);
        sf.n0 b14 = sf.b(new pe.j(Float.valueOf(0.07f), Float.valueOf(0.08f)));
        f3082j = b14;
        f3083k = new sf.a0(b14);
        sf.n0 b15 = sf.b(0);
        f3085m = b15;
        f3086n = new sf.a0(b15);
    }

    public static u6 b(Context context) {
        String str;
        CharSequence subSequence;
        u3 u3Var = new u3(context);
        char[] cArr = {'/'};
        int i10 = 39;
        while (true) {
            int i11 = i10 - 1;
            str = "";
            if (!qe.k.b(cArr, "https://oqbcvhdykmiasihzbnus.supabase.co".charAt(i10))) {
                subSequence = "https://oqbcvhdykmiasihzbnus.supabase.co".subSequence(0, i10 + 1);
                break;
            }
            if (i11 < 0) {
                subSequence = "";
                break;
            }
            i10 = i11;
        }
        if (!mf.f.u(subSequence.toString()) && !mf.f.u("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9xYmN2aGR5a21pYXNpaHpibnVzIiwicm9sZSI6ImFub24iLCJpYXQiOjE3ODY4NTI4MTIsImV4cCI6MjEwMjQyODgxMn0._ijhLPCjqyZtZmWXnWtJwwJr8t9fgRkfkNwMyZwBgFc")) {
            p6 p6Var = p6.f2523a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            p6.f2527f = applicationContext;
            sf.n0 n0Var = p6.f2526d;
            String string = p6.d().getString("refresh_token", "");
            if (string != null) {
                str = string;
            }
            Boolean valueOf = Boolean.valueOf(true ^ mf.f.u(str));
            n0Var.getClass();
            n0Var.k(null, valueOf);
            return new z3(u3Var, new d1(context));
        }
        return u3Var;
    }

    public static sf.a0 c() {
        return i;
    }

    public static void d() {
        sf.n0 n0Var = f3085m;
        n0Var.k(null, Integer.valueOf(((Number) n0Var.getValue()).intValue() + 1));
    }

    public static void e() {
        if (!((Boolean) f3079f.getValue()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        sf.n0 n0Var = f3081h;
        n0Var.getClass();
        n0Var.k(null, bool);
    }

    public static void f(boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        sf.n0 n0Var = f3078d;
        n0Var.getClass();
        n0Var.k(null, valueOf);
    }

    public final u6 a(Context context) {
        u6 u6Var;
        context.getClass();
        u6 u6Var2 = f3084l;
        if (u6Var2 == null) {
            synchronized (this) {
                u6Var = f3084l;
                if (u6Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    u6Var = b(applicationContext);
                    f3084l = u6Var;
                }
            }
            return u6Var;
        }
        return u6Var2;
    }
}
