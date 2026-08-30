package ya;
import a.a;
import q.k;
import g5.q;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class gd {

    /* renamed from: a, reason: collision with root package name */
    public static long f31310a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f31311b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            if (f31311b == null) {
                f31310a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f31311b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f31311b.invoke(null, Long.valueOf(f31310a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (!(cause instanceof RuntimeException)) {
                    q.k(cause);
                    return false;
                }
                throw ((RuntimeException) cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }
}
