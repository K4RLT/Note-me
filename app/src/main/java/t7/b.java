package t7;
import b.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import bc.g;
import qd.h;
import sf.a0;
import sf.e0;
import sf.n0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f25651a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f25652b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f25653c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f25654d;
    public static ub.a e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f25655f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f25656g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f25657h;

    static {
        Boolean bool = Boolean.FALSE;
        n0 b10 = e0.b(bool);
        f25651a = b10;
        f25652b = new a0(b10);
        n0 b11 = e0.b(bool);
        f25653c = b11;
        f25654d = new a0(b11);
        f25656g = true;
    }

    public static a0 a() {
        return f25652b;
    }

    public static void b(Context context) {
        context.getClass();
        context.getApplicationContext().getSharedPreferences("scraply_rating", 0).edit().putBoolean("opted_out", true).apply();
        Boolean bool = Boolean.FALSE;
        n0 n0Var = f25651a;
        n0Var.getClass();
        n0Var.k(null, bool);
        n0 n0Var2 = f25653c;
        n0Var2.getClass();
        n0Var2.k(null, bool);
        String packageName = context.getPackageName();
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)).addFlags(1342177280);
        addFlags.getClass();
        try {
            try {
                context.startActivity(addFlags);
            } catch (Exception unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)).addFlags(268435456));
            }
        } catch (Exception e8) {
            Log.e("RatingPrompt", "No hay dónde abrir la ficha de Play", e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if ((r8 - r12) < r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, t7.a r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.c(android.content.Context, t7.a):void");
    }

    public static int d(int i, String str) {
        try {
            qd.a a10 = ((h) g.c().b(h.class)).a();
            a10.getClass();
            long b10 = a10.b(str);
            if (b10 > 0) {
                return (int) b10;
            }
            return i;
        } catch (Exception unused) {
            return i;
        }
    }

    public static void e(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("scraply_rating", 0);
        sharedPreferences.edit().putInt("asks", sharedPreferences.getInt("asks", 0) + 1).putLong("last_ask_at", System.currentTimeMillis()).apply();
        Boolean bool = Boolean.FALSE;
        n0 n0Var = f25651a;
        n0Var.getClass();
        n0Var.k(null, bool);
        n0 n0Var2 = f25653c;
        n0Var2.getClass();
        n0Var2.k(null, bool);
    }

    public static void f(String str) {
        Log.d("RatingPrompt", str);
    }
}
