package eb;
import b.a;
import d1.b;
import d1.d;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16372a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f16373b;

    public t0(h3 h3Var) {
        this.f16372a = 0;
        this.f16373b = h3Var.F;
    }

    public void a(String str, Bundle bundle) {
        String uri;
        d1 d1Var = this.f16373b;
        q0 q0Var = d1Var.B;
        y0 y0Var = d1Var.D;
        d(y0Var);
        y0Var.u();
        if (!d1Var.e()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                b(q0Var);
                q0Var.S.j(uri);
                b(q0Var);
                s0 s0Var = q0Var.T;
                d1Var.H.getClass();
                s0Var.b(System.currentTimeMillis());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.f16372a) {
            case 0:
                d1 d1Var = this.f16373b;
                boolean z3 = false;
                try {
                    c4.n a10 = na.a(d1Var.f16102u);
                    if (a10 == null) {
                        k0 k0Var = d1Var.C;
                        d(k0Var);
                        k0Var.I.g("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        d1Var = d1Var;
                    } else {
                        int i = a10.c(128, "com.android.vending").versionCode;
                        d1Var = i;
                        if (i >= 80837300) {
                            z3 = true;
                            d1Var = i;
                        }
                    }
                } catch (Exception e) {
                    k0 k0Var2 = d1Var.C;
                    d(k0Var2);
                    k0Var2.I.f(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z3;
            default:
                d1 d1Var2 = this.f16373b;
                if (TextUtils.isEmpty(d1Var2.f16103v)) {
                    k0 k0Var3 = d1Var2.C;
                    d(k0Var3);
                    if (k0Var3.C(3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public boolean c() {
        q0 q0Var = this.f16373b.B;
        b(q0Var);
        if (q0Var.T.a() > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (c()) {
            d1 d1Var = this.f16373b;
            d1Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            q0 q0Var = d1Var.B;
            b(q0Var);
            if (currentTimeMillis - q0Var.T.a() > d1Var.A.A(null, v.T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ t0(d1 d1Var, int i) {
        this.f16372a = i;
        this.f16373b = d1Var;
    }
}
