package eb;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.measurement.f7;

/* loaded from: classes.dex */
public final class k0 extends k1 {
    public final js A;
    public final js B;
    public final js C;
    public final js D;
    public final js E;
    public final js F;
    public final js G;
    public final js H;
    public final js I;

    /* renamed from: x, reason: collision with root package name */
    public char f16202x;

    /* renamed from: y, reason: collision with root package name */
    public long f16203y;

    /* renamed from: z, reason: collision with root package name */
    public String f16204z;

    public k0(d1 d1Var) {
        super(d1Var);
        this.f16202x = (char) 0;
        this.f16203y = -1L;
        this.A = new js(this, 6, false, false);
        this.B = new js(this, 6, true, false);
        this.C = new js(this, 6, false, true);
        this.D = new js(this, 5, false, false);
        this.E = new js(this, 5, true, false);
        this.F = new js(this, 5, false, true);
        this.G = new js(this, 4, false, false);
        this.H = new js(this, 3, false, false);
        this.I = new js(this, 2, false, false);
    }

    public static String A(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String z9 = z(obj, z3);
        String z10 = z(obj2, z3);
        String z11 = z(obj3, z3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(z9)) {
            sb2.append(str2);
            sb2.append(z9);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(z10)) {
            sb2.append(str2);
            sb2.append(z10);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(z11)) {
            sb2.append(str3);
            sb2.append(z11);
        }
        return sb2.toString();
    }

    public static String D(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                f7.f13753v.get();
                if (!((Boolean) v.f16428v0.a(null)).booleanValue()) {
                    return str;
                }
            } else {
                return str.substring(0, lastIndexOf);
            }
        }
        return "";
    }

    public static l0 y(String str) {
        if (str == null) {
            return null;
        }
        return new l0(str);
    }

    public static String z(Object obj, boolean z3) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z3) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z3) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String D = D(d1.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof l0) {
            return ((l0) obj).f16221a;
        }
        if (z3) {
            return "-";
        }
        return String.valueOf(obj);
    }

    public final void B(int i, boolean z3, boolean z9, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && C(i)) {
            Log.println(i, I(), A(false, str, obj, obj2, obj3));
        }
        if (!z9 && i >= 5) {
            fa.y.h(str);
            y0 y0Var = ((d1) this.f3443v).D;
            if (y0Var == null) {
                Log.println(6, I(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!y0Var.f16205w) {
                Log.println(6, I(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i < 0) {
                i = 0;
            }
            if (i >= 9) {
                i = 8;
            }
            y0Var.D(new j0(this, i, str, obj, obj2, obj3));
        }
    }

    public final boolean C(int i) {
        return Log.isLoggable(I(), i);
    }

    public final js E() {
        return this.H;
    }

    public final js F() {
        return this.A;
    }

    public final js G() {
        return this.I;
    }

    public final js H() {
        return this.D;
    }

    public final String I() {
        String str;
        synchronized (this) {
            try {
                if (this.f16204z == null) {
                    String str2 = ((d1) this.f3443v).f16105x;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f16204z = str2;
                }
                fa.y.h(this.f16204z);
                str = this.f16204z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // eb.k1
    public final boolean x() {
        return false;
    }
}
