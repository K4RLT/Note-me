package a6;

import android.util.Log;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f286b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile q f287c;

    /* renamed from: a, reason: collision with root package name */
    public final int f288a;

    public q(int i) {
        this.f288a = i;
    }

    public static q d() {
        q qVar;
        synchronized (f286b) {
            try {
                if (f287c == null) {
                    f287c = new q(3);
                }
                qVar = f287c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f288a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f288a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f288a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f288a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f288a <= 5) {
            Log.w(str, str2);
        }
    }
}
