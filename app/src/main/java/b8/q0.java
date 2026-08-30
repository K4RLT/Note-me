package b8;
import a1.j;
import b8.q0;
import e0.b;
import l.a;
import l.f;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f2553a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fg.s f2554b = wa.a(new j(18));

    /* renamed from: c, reason: collision with root package name */
    public static final sf.n0 f2555c;

    /* renamed from: d, reason: collision with root package name */
    public static final sf.a0 f2556d;
    public static volatile String e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf.n0 f2557f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf.a0 f2558g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf.n0 f2559h;
    public static final sf.a0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final sf.n0 f2560j;

    /* renamed from: k, reason: collision with root package name */
    public static final sf.a0 f2561k;

    /* renamed from: l, reason: collision with root package name */
    public static final sf.n0 f2562l;

    /* renamed from: m, reason: collision with root package name */
    public static final sf.a0 f2563m;

    /* renamed from: n, reason: collision with root package name */
    public static final sf.n0 f2564n;

    /* renamed from: o, reason: collision with root package name */
    public static final sf.a0 f2565o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile p0 f2566p;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.q0, java.lang.Object] */
    static {
        sf.n0 b10 = sf.b(0);
        f2555c = b10;
        f2556d = new sf.a0(b10);
        Boolean bool = Boolean.FALSE;
        sf.n0 b11 = sf.b(bool);
        f2557f = b11;
        f2558g = new sf.a0(b11);
        sf.n0 b12 = sf.b(null);
        f2559h = b12;
        i = new sf.a0(b12);
        sf.n0 b13 = sf.b(null);
        f2560j = b13;
        f2561k = new sf.a0(b13);
        sf.n0 b14 = sf.b(null);
        f2562l = b14;
        f2563m = new sf.a0(b14);
        sf.n0 b15 = sf.b(bool);
        f2564n = b15;
        f2565o = new sf.a0(b15);
    }

    public static void a() {
        f2559h.j(null);
        Boolean bool = Boolean.FALSE;
        sf.n0 n0Var = f2564n;
        n0Var.getClass();
        n0Var.k(null, bool);
        sf.n0 n0Var2 = f2557f;
        n0Var2.getClass();
        n0Var2.k(null, bool);
    }

    public static sf.a0 b() {
        return f2558g;
    }

    public static void d(String str) {
        str.getClass();
        if (!mf.f.u(str) && kotlin.jvm.internal.a(f2560j.getValue(), str)) {
            sf.n0 n0Var = f2559h;
            n0Var.getClass();
            n0Var.k(null, str);
            Boolean bool = Boolean.TRUE;
            sf.n0 n0Var2 = f2564n;
            n0Var2.getClass();
            n0Var2.k(null, bool);
            sf.n0 n0Var3 = f2557f;
            n0Var3.getClass();
            n0Var3.k(null, bool);
        }
    }

    public final void c(Context context, String str, String str2, String str3, long j10, String str4, String str5) {
        long currentTimeMillis;
        pe.j jVar;
        String str6;
        String valueOf;
        str4.getClass();
        if (mf.f.u(str)) {
            return;
        }
        if (j10 > 0) {
            currentTimeMillis = j10;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        if (str3 != null && !mf.f.u(str3)) {
            jVar = new pe.j(str3, Boolean.TRUE);
        } else {
            String format = String.format("%08X", Arrays.copyOf(new Object[]{Long.valueOf(((str.hashCode() * 31) + currentTimeMillis) & 4294967295L)}, 1));
            jVar = new pe.j(a.l("SCR-", format.substring(0, 4), "-", format.substring(4)), Boolean.FALSE);
        }
        String str7 = (String) jVar.f22693u;
        boolean booleanValue = ((Boolean) jVar.f22694v).booleanValue();
        p0 e8 = e(context);
        List list = e8.f2506a;
        String str8 = Build.MANUFACTURER;
        String str9 = "";
        if (str8 == null) {
            str8 = "";
        }
        String obj = mf.f.I(str8).toString();
        String str10 = Build.MODEL;
        if (str10 != null) {
            str9 = str10;
        }
        String obj2 = mf.f.I(str9).toString();
        if (obj.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = obj.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                valueOf2.getClass();
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                valueOf.getClass();
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = valueOf.charAt(0);
                        String lowerCase = valueOf.substring(1).toLowerCase(locale);
                        lowerCase.getClass();
                        valueOf = charAt2 + lowerCase;
                    }
                } else {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            sb2.append(obj.substring(1));
            str6 = sb2.toString();
        } else {
            str6 = obj;
        }
        if (mf.f.u(obj2)) {
            obj2 = str6;
        } else if (!mf.f.u(obj) && !obj2.regionMatches(true, 0, obj, 0, obj.length())) {
            obj2 = wd0.n(str6, " ", obj2);
        }
        ArrayList F = qe.l.F(list, new k0("", str, str2, str7, booleanValue, currentTimeMillis, str4, str5, mf.f.I(obj2).toString()));
        Map map = e8.f2507b;
        map.getClass();
        f(context, new p0(F, map));
    }

    public final synchronized p0 e(Context context) {
        p0 p0Var;
        Object kVar;
        p0 p0Var2;
        p0Var = f2566p;
        if (p0Var == null) {
            File file = new File(context.getFilesDir(), "certificates.json");
            if (!file.exists()) {
                p0Var2 = new p0();
            } else {
                try {
                    fg.s sVar = f2554b;
                    String f10 = af.f(file);
                    sVar.getClass();
                    kVar = (p0) sVar.a(p0.Companion.serializer(), f10);
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                Throwable a10 = pe.a(kVar);
                if (a10 != null) {
                    Log.w("Certificates", "certificados ilegibles: " + a10.getMessage());
                    kVar = new p0();
                }
                p0Var2 = (p0) kVar;
            }
            p0Var = p0Var2;
            f2566p = p0Var;
        }
        return p0Var;
    }

    public final synchronized void f(Context context, p0 p0Var) {
        Object kVar;
        try {
            f2566p = p0Var;
            try {
                File file = new File(context.getFilesDir(), "certificates.json");
                fg.s sVar = f2554b;
                sVar.getClass();
                af.l.h(file, sVar.b(p0.Companion.serializer(), p0Var));
                kVar = pe.z.f22715a;
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            Throwable a10 = pe.a(kVar);
            if (a10 != null) {
                Log.w("Certificates", "no se pudieron guardar los certificados: " + a10.getMessage());
            }
            sf.n0 n0Var = f2555c;
            n0Var.k(null, Integer.valueOf(((Number) n0Var.getValue()).intValue() + 1));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
