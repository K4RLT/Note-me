package rd;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class g {
    public static final Pattern e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f24711f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24712a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f24713b;

    /* renamed from: c, reason: collision with root package name */
    public final b f24714c;

    /* renamed from: d, reason: collision with root package name */
    public final b f24715d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f24711f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public g(Executor executor, b bVar, b bVar2) {
        this.f24713b = executor;
        this.f24714c = bVar;
        this.f24715d = bVar2;
    }

    public static String b(b bVar, String str) {
        c c10 = bVar.c();
        if (c10 != null) {
            try {
                return c10.f24691b.getString(str);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", a5.a.h("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.f24712a) {
            try {
                Iterator it = this.f24712a.iterator();
                while (it.hasNext()) {
                    this.f24713b.execute(new b6.f(4, (qd.f) it.next(), str, cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
