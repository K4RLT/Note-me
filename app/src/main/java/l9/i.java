package l9;

import android.util.Log;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.p31;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final mf f20053a = new mf(new ho0(12, 0));

    public static void a(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            mf mfVar = f20053a;
            Iterator f10 = ((p31) mfVar.f8338w).f(mfVar, str);
            boolean z3 = true;
            while (true) {
                o31 o31Var = (o31) f10;
                if (o31Var.hasNext()) {
                    String str2 = (String) o31Var.next();
                    if (z3) {
                        Log.d("Ads", str2);
                    } else {
                        Log.d("Ads-cont", str2);
                    }
                    z3 = false;
                } else {
                    return;
                }
            }
        }
    }

    public static void b(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (j(6)) {
            if (str != null && str.length() > 4000) {
                mf mfVar = f20053a;
                Iterator f10 = ((p31) mfVar.f8338w).f(mfVar, str);
                boolean z3 = true;
                while (true) {
                    o31 o31Var = (o31) f10;
                    if (o31Var.hasNext()) {
                        String str2 = (String) o31Var.next();
                        if (z3) {
                            Log.e("Ads", str2);
                        } else {
                            Log.e("Ads-cont", str2);
                        }
                        z3 = false;
                    } else {
                        return;
                    }
                }
            } else {
                Log.e("Ads", str);
            }
        }
    }

    public static void d(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void e(String str) {
        if (j(4)) {
            if (str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            mf mfVar = f20053a;
            Iterator f10 = ((p31) mfVar.f8338w).f(mfVar, str);
            boolean z3 = true;
            while (true) {
                o31 o31Var = (o31) f10;
                if (o31Var.hasNext()) {
                    String str2 = (String) o31Var.next();
                    if (z3) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z3 = false;
                } else {
                    return;
                }
            }
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str != null && str.length() > 4000) {
                mf mfVar = f20053a;
                Iterator f10 = ((p31) mfVar.f8338w).f(mfVar, str);
                boolean z3 = true;
                while (true) {
                    o31 o31Var = (o31) f10;
                    if (o31Var.hasNext()) {
                        String str2 = (String) o31Var.next();
                        if (z3) {
                            Log.w("Ads", str2);
                        } else {
                            Log.w("Ads-cont", str2);
                        }
                        z3 = false;
                    } else {
                        return;
                    }
                }
            } else {
                Log.w("Ads", str);
            }
        }
    }

    public static void g(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
            sb2.append(str);
            sb2.append(" @");
            sb2.append(lineNumber);
            return sb2.toString();
        }
        return str;
    }

    public static void i(Exception exc, String str) {
        if (j(5)) {
            if (exc != null) {
                g(h(str), exc);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i) {
        if (i < 5 && !Log.isLoggable("Ads", i)) {
            return false;
        }
        return true;
    }
}
