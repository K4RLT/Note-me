package com.google.android.gms.internal.ads;
import a5.a;
import p.a;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class mb {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8298a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f8299b = mb.class.getName();

    public static void a(String str, Object... objArr) {
        if (f8298a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static String d(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(f8299b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                    String methodName = stackTrace[i].getMethodName();
                    str2 = a.o(new StringBuilder(substring2.length() + 1 + String.valueOf(methodName).length()), substring2, ".", methodName);
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(str2);
        return a.k(sb2, ": ", format);
    }
}
