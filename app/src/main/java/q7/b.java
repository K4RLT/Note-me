package q7;

import android.content.Context;
import android.os.Build;
import com.daren.scraply.notify.ScraplyMessagingService;
import rd.m;
import sf.a0;
import sf.e0;
import sf.n0;
import wa.u6;
import ya.ka;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f23562a;

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f23563b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f23564c;

    static {
        n0 b10 = e0.b(Boolean.FALSE);
        f23563b = b10;
        f23564c = new a0(b10);
    }

    public static void a(Context context) {
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 33 && b("notif_primer_enabled") && i >= 33 && u6.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            n0 n0Var = e.f23567a;
            if (!context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getBoolean("perm_blocked", false) && e.c(context).f23569a && !((Boolean) t7.b.f25652b.f25140u.getValue()).booleanValue() && context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getInt("primer_shown", 0) < 2 && context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getInt("launches", 0) >= 3) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getLong("first_seen_at", 0L);
                if (j10 <= 0 || currentTimeMillis - j10 >= 86400000) {
                    long j11 = context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getLong("primer_last_at", 0L);
                    if (j11 <= 0 || currentTimeMillis - j11 >= 1209600000) {
                        z3 = true;
                    }
                }
            }
        }
        Boolean valueOf = Boolean.valueOf(z3);
        n0 n0Var2 = f23563b;
        n0Var2.getClass();
        n0Var2.k(null, valueOf);
    }

    public static boolean b(String str) {
        try {
            qd.a a10 = ((qd.h) bc.g.c().b(qd.h.class)).a();
            a10.getClass();
            m c10 = a10.c(str);
            if (c10.f24742a != 0) {
                return c10.a();
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void c(Context context) {
        g c10 = e.c(context);
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        boolean z3 = c10.f23569a;
        int i = ScraplyMessagingService.B;
        ka.a("seasonal", z3);
        ka.a("seasonal_" + language, z3);
        ka.a("tips", z3);
    }
}
