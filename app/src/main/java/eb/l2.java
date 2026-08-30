package eb;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.iv1;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class l2 extends z {
    public final ConcurrentHashMap A;
    public Activity B;
    public volatile boolean C;
    public volatile k2 D;
    public k2 E;
    public boolean F;
    public final Object G;

    /* renamed from: x, reason: collision with root package name */
    public volatile k2 f16222x;

    /* renamed from: y, reason: collision with root package name */
    public volatile k2 f16223y;

    /* renamed from: z, reason: collision with root package name */
    public k2 f16224z;

    public l2(d1 d1Var) {
        super(d1Var);
        this.G = new Object();
        this.A = new ConcurrentHashMap();
    }

    @Override // eb.z
    public final boolean A() {
        return false;
    }

    public final k2 B(boolean z3) {
        y();
        u();
        k2 k2Var = this.f16224z;
        if (!z3) {
            return k2Var;
        }
        if (k2Var != null) {
            return k2Var;
        }
        return this.E;
    }

    public final String C(Class cls) {
        String str;
        d1 d1Var = (d1) this.f3443v;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str = split[split.length - 1];
        } else {
            str = "";
        }
        if (str.length() > d1Var.A.w(null, false)) {
            return str.substring(0, d1Var.A.w(null, false));
        }
        return str;
    }

    public final void D(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((d1) this.f3443v).A.I() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.A.put(activity, new k2(bundle2.getLong(FacebookMediationAdapter.KEY_ID), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void E(Activity activity, k2 k2Var, boolean z3) {
        k2 k2Var2;
        k2 k2Var3;
        String str;
        if (this.f16222x == null) {
            k2Var2 = this.f16223y;
        } else {
            k2Var2 = this.f16222x;
        }
        k2 k2Var4 = k2Var2;
        if (k2Var.f16207b == null) {
            if (activity != null) {
                str = C(activity.getClass());
            } else {
                str = null;
            }
            k2Var3 = new k2(k2Var.f16206a, str, k2Var.f16208c, k2Var.e, k2Var.f16210f);
        } else {
            k2Var3 = k2Var;
        }
        this.f16223y = this.f16222x;
        this.f16222x = k2Var3;
        ((d1) this.f3443v).H.getClass();
        h().D(new f2(this, k2Var3, k2Var4, SystemClock.elapsedRealtime(), z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [long, android.os.BaseBundle] */
    public final void F(k2 k2Var, k2 k2Var2, long j10, boolean z3, Bundle bundle) {
        boolean z9;
        Bundle bundle2;
        String str;
        boolean z10 = k2Var.e;
        d1 d1Var = (d1) this.f3443v;
        u();
        boolean z11 = false;
        if (k2Var2 != null && k2Var2.f16208c == k2Var.f16208c && Objects.equals(k2Var2.f16207b, k2Var.f16207b) && Objects.equals(k2Var2.f16206a, k2Var.f16206a)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z3 && this.f16224z != null) {
            z11 = true;
        }
        if (z9) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            l3.Y(k2Var, bundle2, true);
            if (k2Var2 != null) {
                String str2 = k2Var2.f16206a;
                if (str2 != null) {
                    "_pn".putString("_pn", str2);
                }
                String str3 = k2Var2.f16207b;
                if (str3 != null) {
                    "_pc".putString("_pc", str3);
                }
                Object r10 = k2Var2.f16208c;
                r10.putLong("_pi", r10);
            }
            Bundle bundle3 = 0;
            long j11 = 0;
            if (z11) {
                d6 d6Var = x().A;
                long j12 = j10 - d6Var.f5316v;
                d6Var.f5316v = j10;
                if (j12 > 0) {
                    t().M(null, j12);
                }
            }
            if (!d1Var.A.I()) {
                j11.putLong("_mst", 1L);
            }
            if (z10) {
                str = "app";
            } else {
                str = "auto";
            }
            String str4 = str;
            d1Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (z10) {
                long j13 = k2Var.f16210f;
                bundle3 = j13;
                if (j13 != j13) {
                    currentTimeMillis = j13;
                    bundle3 = j13;
                }
            }
            v().B(currentTimeMillis, bundle3, str4, "_vs");
        }
        if (z11) {
            G(this.f16224z, true, j10);
        }
        this.f16224z = k2Var;
        if (z10) {
            this.E = k2Var;
        }
        n2 p10 = d1Var.p();
        p10.u();
        p10.y();
        p10.D(new iv1(12, p10, k2Var, false));
    }

    public final void G(k2 k2Var, boolean z3, long j10) {
        boolean z9;
        d1 d1Var = (d1) this.f3443v;
        q j11 = d1Var.j();
        d1Var.H.getClass();
        j11.y(SystemClock.elapsedRealtime());
        if (k2Var != null && k2Var.f16209d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (x().A.n(j10, z9, z3) && k2Var != null) {
            k2Var.f16209d = false;
        }
    }

    public final k2 H(Activity activity) {
        fa.y.h(activity);
        k2 k2Var = (k2) this.A.get(activity);
        if (k2Var == null) {
            k2 k2Var2 = new k2(t().H0(), null, C(activity.getClass()));
            this.A.put(activity, k2Var2);
            k2Var = k2Var2;
        }
        if (this.D != null) {
            return this.D;
        }
        return k2Var;
    }
}