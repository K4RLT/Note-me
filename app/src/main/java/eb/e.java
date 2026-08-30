package eb;
import b.a;
import c1.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.k7;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: w, reason: collision with root package name */
    public Boolean f16112w;

    /* renamed from: x, reason: collision with root package name */
    public String f16113x;

    /* renamed from: y, reason: collision with root package name */
    public f f16114y;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f16115z;

    public static long H() {
        return ((Long) v.D.a(null)).longValue();
    }

    public final long A(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        String a10 = this.f16114y.a(str, c0Var.f16079a);
        if (TextUtils.isEmpty(a10)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        try {
            return ((Long) c0Var.a(Long.valueOf(Long.parseLong(a10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c0Var.a(null)).longValue();
        }
    }

    public final m1 B(String str, boolean z3) {
        Object obj;
        fa.y.e(str);
        Bundle L = L();
        if (L == null) {
            f().A.g("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = L.get(str);
        }
        m1 m1Var = m1.UNINITIALIZED;
        if (obj == null) {
            return m1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return m1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return m1.DENIED;
        }
        if (z3 && "eu_consent_policy".equals(obj)) {
            return m1.POLICY;
        }
        f().D.f(str, "Invalid manifest metadata for");
        return m1Var;
    }

    public final String C(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return (String) c0Var.a(null);
        }
        return (String) c0Var.a(this.f16114y.a(str, c0Var.f16079a));
    }

    public final Boolean D(String str) {
        fa.y.e(str);
        Bundle L = L();
        if (L == null) {
            f().A.g("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!L.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(L.getBoolean(str));
    }

    public final boolean E(String str, c0 c0Var) {
        return F(str, c0Var);
    }

    public final boolean F(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c0Var.a(null)).booleanValue();
        }
        String a10 = this.f16114y.a(str, c0Var.f16079a);
        if (TextUtils.isEmpty(a10)) {
            return ((Boolean) c0Var.a(null)).booleanValue();
        }
        return ((Boolean) c0Var.a(Boolean.valueOf("1".equals(a10)))).booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(this.f16114y.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean I() {
        Boolean D = D("google_analytics_automatic_screen_reporting_enabled");
        if (D != null && !D.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean J() {
        if (this.f16112w == null) {
            Boolean D = D("app_measurement_lite");
            this.f16112w = D;
            if (D == null) {
                this.f16112w = Boolean.FALSE;
            }
        }
        if (!this.f16112w.booleanValue() && ((d1) this.f3443v).f16106y) {
            return false;
        }
        return true;
    }

    public final Bundle L() {
        d1 d1Var = (d1) this.f3443v;
        try {
            if (d1Var.f16102u.getPackageManager() == null) {
                f().A.g("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b10 = na.a(d1Var.f16102u).b(128, d1Var.f16102u.getPackageName());
            if (b10 == null) {
                f().A.g("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return b10.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            f().A.f(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final double v(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        String a10 = this.f16114y.a(str, c0Var.f16079a);
        if (TextUtils.isEmpty(a10)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) c0Var.a(Double.valueOf(Double.parseDouble(a10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
    }

    public final int w(String str, boolean z3) {
        k7.f13828v.get();
        if (!((d1) this.f3443v).A.F(null, v.M0)) {
            return 100;
        }
        if (!z3) {
            return 500;
        }
        return Math.max(Math.min(z(str, v.R), 500), 100);
    }

    public final String x(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            fa.y.h(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            f().A.f(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e8) {
            f().A.f(e8, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            f().A.f(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            f().A.f(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean y(c0 c0Var) {
        return F(null, c0Var);
    }

    public final int z(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        String a10 = this.f16114y.a(str, c0Var.f16079a);
        if (TextUtils.isEmpty(a10)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        try {
            return ((Integer) c0Var.a(Integer.valueOf(Integer.parseInt(a10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c0Var.a(null)).intValue();
        }
    }
}
