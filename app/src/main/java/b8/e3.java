package b8;
import b8.e3;
import e0.b;
import l.a;
import l.f;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3 f2015a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fg.s f2016b = wa.a(new n1(22));

    /* renamed from: c, reason: collision with root package name */
    public static final sf.n0 f2017c;

    /* renamed from: d, reason: collision with root package name */
    public static final sf.a0 f2018d;
    public static volatile List e;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.e3, java.lang.Object] */
    static {
        sf.n0 b10 = sf.b(0);
        f2017c = b10;
        f2018d = new sf.a0(b10);
    }

    public static void a(Context context, String str) {
        str.getClass();
        int b10 = b(context, str);
        if (b10 <= 0) {
            return;
        }
        context.getSharedPreferences("scraply_house", 0).edit().putInt("credits_".concat(str), b10 - 1).apply();
        sf.n0 n0Var = f2017c;
        n0Var.k(null, Integer.valueOf(((Number) n0Var.getValue()).intValue() + 1));
    }

    public static int b(Context context, String str) {
        str.getClass();
        if (mf.f.u(str)) {
            return 0;
        }
        return context.getSharedPreferences("scraply_house", 0).getInt("credits_".concat(str), 0);
    }

    public static void c(Context context, String str) {
        str.getClass();
        if (mf.f.u(str)) {
            return;
        }
        context.getSharedPreferences("scraply_house", 0).edit().putInt("credits_".concat(str), b(context, str) + 1).apply();
        sf.n0 n0Var = f2017c;
        n0Var.k(null, Integer.valueOf(((Number) n0Var.getValue()).intValue() + 1));
    }

    public final d3 d(Context context, String str) {
        Object obj;
        context.getClass();
        str.getClass();
        Iterator it = e(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.a(((d3) obj).f1968a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (d3) obj;
    }

    public final List e(Context context) {
        List list;
        Object kVar;
        List list2;
        context.getClass();
        List list3 = e;
        if (list3 == null) {
            synchronized (this) {
                list = e;
                if (list == null) {
                    File file = new File(context.getFilesDir(), "house_notebooks.json");
                    if (!file.exists()) {
                        list2 = qe.s.f24023u;
                    } else {
                        try {
                            fg.s sVar = f2016b;
                            String f10 = af.f(file);
                            sVar.getClass();
                            kVar = (List) sVar.a(new eg.c(d3.Companion.serializer()), f10);
                        } catch (Throwable th) {
                            kVar = new pe.k(th);
                        }
                        Throwable a10 = pe.a(kVar);
                        if (a10 != null) {
                            Log.w("HouseNotebooks", "catálogo de la casa ilegible: " + a10.getMessage());
                            kVar = qe.s.f24023u;
                        }
                        list2 = (List) kVar;
                    }
                    list = list2;
                    e = list;
                }
            }
            return list;
        }
        return list3;
    }

    public final String f(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        d3 d2 = d(context, str);
        if (d2 != null) {
            str2 = d2.f1969b;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
