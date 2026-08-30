package eb;
import b.b;
import c.a;
import d1.b;
import d1.c;
import d1.d;
import i0.m;
import m.a;
import m.c;
import q1.a;
import q1.e;
import q1.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t1 extends z {
    public boolean A;
    public final AtomicReference B;
    public final Object C;
    public boolean D;
    public int E;
    public a2 F;
    public PriorityQueue G;
    public o1 H;
    public final AtomicLong I;
    public long J;
    public final t0 K;
    public boolean L;
    public a2 M;
    public x1 N;
    public a2 O;
    public final pd.c P;

    /* renamed from: x, reason: collision with root package name */
    public h2 f16374x;

    /* renamed from: y, reason: collision with root package name */
    public iw f16375y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet f16376z;

    public t1(d1 d1Var) {
        super(d1Var);
        this.f16376z = new CopyOnWriteArraySet();
        this.C = new Object();
        this.D = false;
        this.E = 1;
        this.L = true;
        this.P = new pd.c(this);
        this.B = new AtomicReference();
        this.H = o1.f16283c;
        this.J = -1L;
        this.I = new AtomicLong(0L);
        this.K = new t0(d1Var, 2);
    }

    public static void I(t1 t1Var, o1 o1Var, long j10, boolean z3, boolean z9) {
        int i = o1Var.f16285b;
        t1Var.u();
        d1 d1Var = (d1) t1Var.f3443v;
        t1Var.y();
        o1 F = t1Var.s().F();
        if (j10 <= t1Var.J && o1.h(F.f16285b, i)) {
            t1Var.f().G.f(o1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        q0 s10 = t1Var.s();
        s10.u();
        if (s10.z(i)) {
            SharedPreferences.Editor edit = s10.D().edit();
            edit.putString("consent_settings", o1Var.o());
            edit.putInt("consent_source", i);
            edit.apply();
            t1Var.f().I.f(o1Var, "Setting storage consent(FE)");
            t1Var.J = j10;
            n2 p10 = d1Var.p();
            p10.u();
            p10.y();
            if (!p10.L() || p10.t().B0() >= 241200) {
                n2 p11 = d1Var.p();
                p11.u();
                p11.y();
                p6.a();
                d1 d1Var2 = (d1) p11.f3443v;
                if (!d1Var2.A.F(null, v.T0) && z3) {
                    d1Var2.n().D();
                }
                o2 o2Var = new o2(1);
                o2Var.f16287v = p11;
                p11.D(o2Var);
            } else {
                d1Var.p().F(z3);
            }
            if (z9) {
                d1Var.p().E(new AtomicReference());
                return;
            }
            return;
        }
        t1Var.f().G.f(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
    }

    public static void J(t1 t1Var, o1 o1Var, o1 o1Var2) {
        p6.a();
        d1 d1Var = (d1) t1Var.f3443v;
        if (!d1Var.A.F(null, v.T0)) {
            n1 n1Var = n1.ANALYTICS_STORAGE;
            n1 n1Var2 = n1.AD_STORAGE;
            n1[] n1VarArr = {n1Var, n1Var2};
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                n1 n1Var3 = n1VarArr[i];
                if (!o1Var2.i(n1Var3) && o1Var.i(n1Var3)) {
                    z3 = true;
                    break;
                }
                i++;
            }
            boolean k3 = o1Var.k(o1Var2, n1Var, n1Var2);
            if (z3 || k3) {
                d1Var.m().D();
            }
        }
    }

    @Override // eb.z
    public final boolean A() {
        return false;
    }

    public final void B(long j10, Bundle bundle, String str, String str2) {
        boolean z3;
        u();
        if (this.f16375y != null && !l3.C0(str2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        O(str, str2, j10, bundle, true, z3, true);
    }

    public final void C(long j10, Object obj, String str, String str2) {
        long j11;
        d1 d1Var = (d1) this.f3443v;
        fa.y.e(str);
        fa.y.e(str2);
        u();
        y();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if ("false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j11 = 1;
                    } else {
                        j11 = 0;
                    }
                    obj = Long.valueOf(j11);
                    com.google.android.gms.internal.ads.d dVar = s().I;
                    if (j11 == 1) {
                        str4 = "true";
                    }
                    dVar.j(str4);
                    str2 = "_npa";
                    f().I.h("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                s().I.j("unset");
                str2 = "_npa";
            }
            f().I.h("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        Object obj2 = obj;
        String str5 = str2;
        if (!d1Var.e()) {
            f().I.g("User property not set since app measurement is disabled");
            return;
        }
        if (!d1Var.g()) {
            return;
        }
        k3 k3Var = new k3(j10, obj2, str5, str);
        n2 p10 = d1Var.p();
        p10.u();
        p10.y();
        f0 n10 = ((d1) p10.f3443v).n();
        n10.getClass();
        Parcel obtain = Parcel.obtain();
        boolean z3 = false;
        k3Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            n10.f().B.g("User property too long for local database. Sending directly to service");
        } else {
            z3 = n10.C(marshall, 1);
        }
        p10.D(new ba.k(p10, p10.P(true), z3, k3Var, 2));
    }

    public final void D(long j10, boolean z3) {
        d1 d1Var = (d1) this.f3443v;
        u();
        y();
        f().H.g("Resetting analytics data (FE)");
        v2 x9 = x();
        x9.u();
        d6 d6Var = x9.A;
        ((z2) d6Var.f5317w).a();
        d1 d1Var2 = (d1) ((v2) d6Var.f5318x).f3443v;
        if (d1Var2.A.F(null, v.X0)) {
            d1Var2.H.getClass();
            d6Var.f5315u = SystemClock.elapsedRealtime();
        } else {
            d6Var.f5315u = 0L;
        }
        d6Var.f5316v = d6Var.f5315u;
        d1Var.m().D();
        boolean e = d1Var.e();
        q0 s10 = s();
        s10.B.b(j10);
        if (!TextUtils.isEmpty(s10.s().R.i())) {
            s10.R.j(null);
        }
        s10.L.b(0L);
        s10.M.b(0L);
        Boolean D = ((d1) s10.f3443v).A.D("firebase_analytics_collection_deactivated");
        if (D == null || !D.booleanValue()) {
            s10.B(!e);
        }
        s10.S.j(null);
        s10.T.b(0L);
        s10.U.p(null);
        if (z3) {
            n2 p10 = d1Var.p();
            p10.u();
            p10.y();
            o3 P = p10.P(false);
            ((d1) p10.f3443v).n().D();
            p10.D(new q2(p10, P, 0));
        }
        x().f16442z.u();
        this.L = !e;
    }

    public final void E(Bundle bundle, int i, long j10) {
        Object obj;
        String str;
        String string;
        y();
        o1 o1Var = o1.f16283c;
        n1[] n1VarArr = p1.STORAGE.f16312u;
        int length = n1VarArr.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            n1 n1Var = n1VarArr[i10];
            if (bundle.containsKey(n1Var.f16278u) && (string = bundle.getString(n1Var.f16278u)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i10++;
        }
        if (obj != null) {
            f().F.f(obj, "Ignoring invalid consent setting");
            f().F.g("Valid consent values are 'granted', 'denied'");
        }
        boolean F = h().F();
        o1 d2 = o1.d(i, bundle);
        if (d2.q()) {
            H(d2, j10, F);
        }
        m a10 = a(i, bundle);
        Iterator it = a10.e.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((m1) it.next()) != m1.UNINITIALIZED) {
                F(a10, F);
                break;
            }
        }
        Boolean c10 = c(bundle);
        if (c10 != null) {
            if (i == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            Q(str, "allow_personalized_ads", c10.toString(), false);
        }
    }

    public final void F(m mVar, boolean z3) {
        pu1 pu1Var = new pu1(12, this, mVar, false);
        if (z3) {
            u();
            pu1Var.run();
        } else {
            h().D(pu1Var);
        }
    }

    public final void G(o1 o1Var) {
        boolean z3;
        Boolean bool;
        u();
        if ((o1Var.i(n1.ANALYTICS_STORAGE) && o1Var.i(n1.AD_STORAGE)) || ((d1) this.f3443v).p().J()) {
            z3 = true;
        } else {
            z3 = false;
        }
        d1 d1Var = (d1) this.f3443v;
        y0 y0Var = d1Var.D;
        d(y0Var);
        y0Var.u();
        if (z3 != d1Var.X) {
            d1 d1Var2 = (d1) this.f3443v;
            y0 y0Var2 = d1Var2.D;
            d(y0Var2);
            y0Var2.u();
            d1Var2.X = z3;
            q0 s10 = s();
            s10.u();
            if (s10.D().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(s10.D().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z3 || bool == null || bool.booleanValue()) {
                L(Boolean.valueOf(z3), false);
            }
        }
    }

    public final void H(o1 o1Var, long j10, boolean z3) {
        o1 o1Var2;
        boolean z9;
        o1 o1Var3;
        boolean z10;
        int i;
        boolean z11;
        y();
        int i10 = o1Var.f16285b;
        l6.a();
        if (((d1) this.f3443v).A.F(null, v.P0)) {
            if (i10 != -10) {
                m1 m1Var = (m1) o1Var.f16284a.get(n1.AD_STORAGE);
                if (m1Var == null) {
                    m1Var = m1.UNINITIALIZED;
                }
                m1 m1Var2 = m1.UNINITIALIZED;
                if (m1Var == m1Var2) {
                    m1 m1Var3 = (m1) o1Var.f16284a.get(n1.ANALYTICS_STORAGE);
                    if (m1Var3 == null) {
                        m1Var3 = m1Var2;
                    }
                    if (m1Var3 == m1Var2) {
                        f().F.g("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i10 != -10 && o1Var.l() == null && o1Var.m() == null) {
            f().F.g("Discarding empty consent settings");
            return;
        }
        synchronized (this.C) {
            try {
                o1Var2 = this.H;
                z9 = false;
                if (o1.h(i10, o1Var2.f16285b)) {
                    z10 = o1Var.k(this.H, (n1[]) o1Var.f16284a.keySet().toArray(new n1[0]));
                    n1 n1Var = n1.ANALYTICS_STORAGE;
                    if (o1Var.i(n1Var) && !this.H.i(n1Var)) {
                        z9 = true;
                    }
                    o1Var3 = o1Var.j(this.H);
                    this.H = o1Var3;
                    i = i10;
                    z11 = z9;
                    z9 = true;
                } else {
                    o1Var3 = o1Var;
                    z10 = false;
                    i = i10;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            f().G.f(o1Var3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.I.getAndIncrement();
        if (z10) {
            b0(null);
            g2 g2Var = new g2(this, o1Var3, j10, andIncrement, z11, o1Var2);
            if (z3) {
                u();
                g2Var.run();
                return;
            } else {
                h().E(g2Var);
                return;
            }
        }
        f2 f2Var = new f2(this, o1Var3, andIncrement, z11, o1Var2);
        if (z3) {
            u();
            f2Var.run();
        } else if (i != 30 && i != -10) {
            h().D(f2Var);
        } else {
            h().E(f2Var);
        }
    }

    public final void L(Boolean bool, boolean z3) {
        u();
        y();
        f().H.f(bool, "Setting app measurement enabled (FE)");
        q0 s10 = s();
        s10.u();
        SharedPreferences.Editor edit = s10.D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z3) {
            q0 s11 = s();
            s11.u();
            SharedPreferences.Editor edit2 = s11.D().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        d1 d1Var = (d1) this.f3443v;
        y0 y0Var = d1Var.D;
        d(y0Var);
        y0Var.u();
        if (!d1Var.X && (bool == null || bool.booleanValue())) {
            return;
        }
        Z();
    }

    public final void M(String str, Bundle bundle, String str2) {
        ((d1) this.f3443v).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fa.y.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        h().D(new iv1(10, this, bundle2, false));
    }

    public final void O(String str, String str2, long j10, Bundle bundle, boolean z3, boolean z9, boolean z10) {
        boolean z11;
        long j11;
        boolean b10;
        long j12;
        ArrayList arrayList;
        Bundle[] bundleArr;
        la.a aVar;
        boolean z12;
        long j13;
        String str3;
        boolean C;
        Bundle[] bundleArr2;
        Class<?> cls;
        fa.y.e(str);
        fa.y.h(bundle);
        u();
        y();
        d1 d1Var = (d1) this.f3443v;
        boolean e = d1Var.e();
        Context context = d1Var.f16102u;
        h0 h0Var = d1Var.G;
        la.a aVar2 = d1Var.H;
        if (!e) {
            f().H.g("Event not sent since app measurement is disabled");
            return;
        }
        List list = d1Var.m().D;
        if (list != null && !list.contains(str2)) {
            f().H.h("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.A) {
            this.A = true;
            try {
                if (!d1Var.f16106y) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e8) {
                    f().D.f(e8, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                f().G.g("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar2.getClass();
            C(System.currentTimeMillis(), string, "auto", "_lgclid");
        }
        t1 t1Var = this;
        boolean z13 = false;
        int i = 0;
        int i10 = 0;
        if (z3 && !l3.E[0].equals(str2)) {
            t1Var.t().O(bundle, t1Var.s().U.n());
        }
        pd.c cVar = t1Var.P;
        if (!z10 && !"_iap".equals(str2)) {
            l3 l3Var = d1Var.F;
            b(l3Var);
            int i11 = 2;
            if (l3Var.x0("event", str2)) {
                if (!l3Var.m0("event", e, q1.f16326f, str2)) {
                    i11 = 13;
                } else if (l3Var.h0("event", 40, str2)) {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                t1Var.f().C.f(h0Var.c(str2), "Invalid public event name. Event will not be logged (FE)");
                d1Var.q();
                String J = l3.J(40, str2, true);
                if (str2 != null) {
                    i = str2.length();
                }
                d1Var.q();
                l3.Z(cVar, null, i11, "_ev", J, i);
                return;
            }
        }
        k2 B = t1Var.w().B(false);
        if (B != null && !bundle.containsKey("_sc")) {
            B.f16209d = true;
        }
        if (z3 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        l3.Y(B, bundle, z11);
        boolean equals = "am".equals(str);
        boolean C0 = l3.C0(str2);
        if (z3 && t1Var.f16375y != null && !C0 && !equals) {
            t1Var.f().H.h("Passing event to registered event handler (FE)", h0Var.c(str2), h0Var.a(bundle));
            fa.y.h(t1Var.f16375y);
            iw iwVar = t1Var.f16375y;
            iwVar.getClass();
            try {
                ((com.google.android.gms.internal.measurement.u0) iwVar.f14489v).u3(j10, bundle, str, str2);
                return;
            } catch (RemoteException e10) {
                d1 d1Var2 = ((AppMeasurementDynamiteService) iwVar.f14490w).f15571u;
                if (d1Var2 != null) {
                    k0 k0Var = d1Var2.C;
                    d(k0Var);
                    k0Var.D.f(e10, "Event interceptor threw exception");
                    return;
                }
                return;
            }
        }
        if (d1Var.g()) {
            int z14 = t1Var.t().z(str2);
            if (z14 != 0) {
                t1Var.f().C.f(h0Var.c(str2), "Invalid event name. Event will not be logged (FE)");
                t1Var.t();
                String J2 = l3.J(40, str2, true);
                if (str2 != null) {
                    i10 = str2.length();
                }
                d1Var.q();
                l3.Z(cVar, null, z14, "_ev", J2, i10);
                return;
            }
            Bundle E = t1Var.t().E(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z10);
            fa.y.h(E);
            if (t1Var.w().B(false) != null && "_ae".equals(str2)) {
                d6 d6Var = t1Var.x().A;
                ((d1) ((v2) d6Var.f5318x).f3443v).H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j11 = 0;
                long j14 = elapsedRealtime - d6Var.f5316v;
                d6Var.f5316v = elapsedRealtime;
                if (j14 > 0) {
                    t1Var.t().M(E, j14);
                }
            } else {
                j11 = 0;
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                l3 t3 = t1Var.t();
                String string2 = E.getString("_ffr");
                if (la.a(string2)) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                if (Objects.equals(string2, t3.s().R.i())) {
                    t3.f().H.g("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                t3.s().R.j(string2);
            } else if ("_ae".equals(str2)) {
                String i12 = t1Var.t().s().R.i();
                if (!TextUtils.isEmpty(i12)) {
                    E.putString("_ffr", i12);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(E);
            if (d1Var.A.F(null, v.F0)) {
                v2 x9 = t1Var.x();
                x9.u();
                b10 = x9.f16441y;
            } else {
                b10 = t1Var.s().O.b();
            }
            if (t1Var.s().L.a() > j11) {
                if (t1Var.s().A(j10) && b10) {
                    t1Var.f().I.g("Current session is expired, remove the session number, ID, and engagement time");
                    aVar2.getClass();
                    j12 = j11;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    z12 = equals;
                    bundleArr = null;
                    j13 = j10;
                    C(System.currentTimeMillis(), null, "auto", "_sid");
                    aVar.getClass();
                    C(System.currentTimeMillis(), null, "auto", "_sno");
                    aVar.getClass();
                    C(System.currentTimeMillis(), null, "auto", "_se");
                    t1Var = this;
                    t1Var.s().M.b(j12);
                } else {
                    j12 = j11;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    z12 = equals;
                    bundleArr = null;
                    j13 = j10;
                }
            } else {
                j12 = j11;
                arrayList = arrayList2;
                bundleArr = null;
                aVar = aVar2;
                z12 = equals;
                j13 = j10;
            }
            if (E.getLong("extend_session", j12) == 1) {
                t1Var.f().I.g("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                v2 v2Var = d1Var.E;
                c(v2Var);
                v2Var.f16442z.v(j13);
            }
            ArrayList arrayList3 = new ArrayList(E.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str4 = (String) obj;
                if (str4 != null) {
                    t1Var.t();
                    Object obj2 = E.get(str4);
                    if (obj2 instanceof Bundle) {
                        bundleArr2 = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj2;
                        bundleArr2 = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr2 = bundleArr;
                    }
                    if (bundleArr2 != null) {
                        E.putParcelableArray(str4, bundleArr2);
                    }
                }
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i14);
                if (i14 != 0) {
                    str3 = "_ep";
                } else {
                    str3 = str2;
                }
                bundle2.putString("_o", str);
                if (z9) {
                    bundle2 = t1Var.t().D(bundle2);
                }
                Bundle bundle3 = bundle2;
                long j15 = j13;
                boolean z15 = z13;
                u uVar = new u(str3, new t(bundle3), str, j15);
                n2 p10 = d1Var.p();
                p10.getClass();
                p10.u();
                p10.y();
                f0 n10 = ((d1) p10.f3443v).n();
                n10.getClass();
                Parcel obtain = Parcel.obtain();
                uVar.writeToParcel(obtain, z15 ? 1 : 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    n10.f().B.g("Event is too long for local database. Sending event directly to service");
                    C = z15 ? 1 : 0;
                } else {
                    C = n10.C(marshall, z15 ? 1 : 0);
                }
                p10.D(new ba.k(p10, p10.P(true), C, uVar, 3));
                if (!z12) {
                    Iterator it = t1Var.f16376z.iterator();
                    while (it.hasNext()) {
                        ((s1) it.next()).a(j10, new Bundle(bundle3), str, str2);
                    }
                }
                i14++;
                arrayList = arrayList5;
                z13 = z15 ? 1 : 0;
                j13 = j10;
            }
            if (t1Var.w().B(z13) != null && "_ae".equals(str2)) {
                v2 x10 = t1Var.x();
                aVar.getClass();
                x10.A.n(SystemClock.elapsedRealtime(), true, true);
            }
        }
    }

    public final void P(String str, String str2, Bundle bundle, boolean z3, boolean z9, long j10) {
        String str3;
        Bundle bundle2;
        boolean z10;
        String str4;
        k2 k2Var;
        String str5;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            l2 w10 = w();
            synchronized (w10.G) {
                try {
                    if (!w10.F) {
                        w10.f().F.g("Cannot log screen view event when the app is in the background.");
                        return;
                    }
                    String string = bundle2.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > ((d1) w10.f3443v).A.w(null, false))) {
                        w10.f().F.f(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                        return;
                    }
                    String string2 = bundle2.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > ((d1) w10.f3443v).A.w(null, false))) {
                        w10.f().F.f(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                        return;
                    }
                    if (string2 == null) {
                        Activity activity = w10.B;
                        if (activity != null) {
                            str5 = w10.C(activity.getClass());
                        } else {
                            str5 = "Activity";
                        }
                        string2 = str5;
                    }
                    String str6 = string2;
                    k2 k2Var2 = w10.f16222x;
                    if (w10.C && k2Var2 != null) {
                        w10.C = false;
                        boolean equals = Objects.equals(k2Var2.f16207b, str6);
                        boolean equals2 = Objects.equals(k2Var2.f16206a, string);
                        if (equals && equals2) {
                            w10.f().F.g("Ignoring call to log screen view event with duplicate parameters.");
                            return;
                        }
                    }
                    js jsVar = w10.f().I;
                    if (string == null) {
                        str4 = "null";
                    } else {
                        str4 = string;
                    }
                    jsVar.h("Logging screen view with name, class", str4, str6);
                    if (w10.f16222x == null) {
                        k2Var = w10.f16223y;
                    } else {
                        k2Var = w10.f16222x;
                    }
                    k2 k2Var3 = new k2(string, str6, w10.t().H0(), true, j10);
                    w10.f16222x = k2Var3;
                    w10.f16223y = k2Var;
                    w10.D = k2Var3;
                    ((d1) w10.f3443v).H.getClass();
                    w10.h().D(new i1(w10, bundle2, k2Var3, k2Var, SystemClock.elapsedRealtime(), 2));
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z9 && this.f16375y != null && !l3.C0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Bundle bundle3 = new Bundle(bundle2);
        for (String str7 : bundle3.keySet()) {
            Object obj = bundle3.get(str7);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str7, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i = 0; i < parcelableArr.length; i++) {
                    if (parcelableArr[i] instanceof Bundle) {
                        parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object obj2 = list.get(i10);
                    if (obj2 instanceof Bundle) {
                        list.set(i10, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        h().D(new c2(this, str3, str2, j10, bundle3, z9, z10, z3));
    }

    public final void Q(String str, String str2, Object obj, boolean z3) {
        ((d1) this.f3443v).H.getClass();
        R(str, str2, obj, z3, System.currentTimeMillis());
    }

    public final void R(String str, String str2, Object obj, boolean z3, long j10) {
        String str3;
        int i;
        d1 d1Var = (d1) this.f3443v;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        int i10 = 0;
        if (z3) {
            i = t().q0(str2);
        } else {
            l3 t3 = t();
            if (t3.x0("user property", str2)) {
                if (!t3.m0("user property", i, null, str2)) {
                    i = 15;
                } else if (t3.h0("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        pd.c cVar = this.P;
        if (i != 0) {
            t();
            String J = l3.J(24, str2, true);
            if (str2 != null) {
                i10 = str2.length();
            }
            d1Var.q();
            l3.Z(cVar, null, i, "_ev", J, i10);
            return;
        }
        if (obj != null) {
            int y10 = t().y(obj, str2);
            if (y10 != 0) {
                t();
                String J2 = l3.J(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i10 = String.valueOf(obj).length();
                }
                d1Var.q();
                l3.Z(cVar, null, y10, "_ev", J2, i10);
                return;
            }
            Object w02 = t().w0(obj, str2);
            if (w02 != null) {
                h().D(new i1(this, str3, str2, w02, j10, 1));
                return;
            }
            return;
        }
        h().D(new i1(this, str3, str2, null, j10, 1));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Function] */
    public final PriorityQueue S() {
        if (this.G == null) {
            this.G = new PriorityQueue(Comparator.comparing(new Object(), new u1(0)));
        }
        return this.G;
    }

    public final void T() {
        u();
        y();
        d1 d1Var = (d1) this.f3443v;
        if (d1Var.g()) {
            Boolean D = d1Var.A.D("google_analytics_deferred_deep_link_enabled");
            if (D != null && D.booleanValue()) {
                f().H.g("Deferred Deep Link feature enabled.");
                y0 h3 = h();
                c1 c1Var = new c1(1);
                c1Var.f16084v = this;
                h3.D(c1Var);
            }
            n2 p10 = d1Var.p();
            p10.u();
            p10.y();
            o3 P = p10.P(true);
            ((d1) p10.f3443v).n().C(new byte[0], 3);
            p10.D(new ou1(14, p10, P, false));
            this.L = false;
            q0 s10 = s();
            s10.u();
            String string = s10.D().getString("previous_os_version", null);
            ((d1) s10.f3443v).l().v();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = s10.D().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                d1Var.l().v();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    c0("auto", bundle, "_ou");
                }
            }
        }
    }

    public final void U() {
        d1 d1Var = (d1) this.f3443v;
        if ((d1Var.f16102u.getApplicationContext() instanceof Application) && this.f16374x != null) {
            ((Application) d1Var.f16102u.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16374x);
        }
    }

    public final void V() {
        v7.a();
        if (!((d1) this.f3443v).A.F(null, v.f16436z0)) {
            return;
        }
        if (h().F()) {
            f().A.g("Cannot get trigger URIs from analytics worker thread");
            return;
        }
        if (de.b()) {
            f().A.g("Cannot get trigger URIs from main thread");
            return;
        }
        y();
        f().I.g("Getting trigger URIs (FE)");
        AtomicReference atomicReference = new AtomicReference();
        y0 h3 = h();
        w1 w1Var = new w1();
        w1Var.f16447w = this;
        w1Var.f16446v = atomicReference;
        h3.z(atomicReference, 5000L, "get trigger URIs", w1Var);
        List list = (List) atomicReference.get();
        if (list == null) {
            f().A.g("Timed out waiting for get trigger URIs");
            return;
        }
        y0 h10 = h();
        ou1 ou1Var = new ou1(10);
        ou1Var.f9238v = this;
        ou1Var.f9239w = list;
        h10.D(ou1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.t1.X():void");
    }

    public final void Y() {
        b3 b3Var;
        u();
        if (!S().isEmpty() && !this.D && (b3Var = (b3) S().poll()) != null) {
            String str = b3Var.f16070u;
            l3 t3 = t();
            if (t3.A == null) {
                t3.A = b5.b(((d1) t3.f3443v).f16102u);
            }
            b5.b bVar = t3.A;
            if (bVar != null) {
                this.D = true;
                f().I.f(str, "Registering trigger URI");
                ac.b e = bVar.e(Uri.parse(str));
                if (e == null) {
                    this.D = false;
                    S().add(b3Var);
                    return;
                }
                if (!((d1) this.f3443v).A.F(null, v.E0)) {
                    SparseArray E = s().E();
                    E.put(b3Var.f16072w, Long.valueOf(b3Var.f16071v));
                    s().y(E);
                }
                e.a(new ac.a(e, 0, new m(this, 14, b3Var)), new z1(0, this));
            }
        }
    }

    public final void Z() {
        t1 t1Var;
        long j10;
        d1 d1Var = (d1) this.f3443v;
        u();
        String i = s().I.i();
        if (i != null) {
            if ("unset".equals(i)) {
                d1Var.H.getClass();
                t1Var = this;
                t1Var.C(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if ("true".equals(i)) {
                    j10 = 1;
                } else {
                    j10 = 0;
                }
                Long valueOf = Long.valueOf(j10);
                d1Var.H.getClass();
                C(System.currentTimeMillis(), valueOf, "app", "_npa");
                t1Var = this;
            }
        } else {
            t1Var = this;
        }
        if (d1Var.e() && t1Var.L) {
            f().H.g("Recording app launch after enabling measurement for the first time (FE)");
            T();
            x().f16442z.u();
            h().D(new c1(this));
            return;
        }
        f().H.g("Updating Scion state (FE)");
        n2 p10 = d1Var.p();
        p10.u();
        p10.y();
        p10.D(new q2(p10, p10.P(true), 1));
    }

    public final void a0(Bundle bundle, long j10) {
        d1 d1Var = (d1) this.f3443v;
        fa.y.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            f().D.g("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a(bundle2, "app_id", String.class, null);
        a(bundle2, "origin", String.class, null);
        a(bundle2, "name", String.class, null);
        a(bundle2, "value", Object.class, null);
        a(bundle2, "trigger_event_name", String.class, null);
        a(bundle2, "trigger_timeout", Long.class, 0L);
        a(bundle2, "timed_out_event_name", String.class, null);
        a(bundle2, "timed_out_event_params", Bundle.class, null);
        a(bundle2, "triggered_event_name", String.class, null);
        a(bundle2, "triggered_event_params", Bundle.class, null);
        a(bundle2, "time_to_live", Long.class, 0L);
        a(bundle2, "expired_event_name", String.class, null);
        a(bundle2, "expired_event_params", Bundle.class, null);
        fa.y.e(bundle2.getString("name"));
        fa.y.e(bundle2.getString("origin"));
        fa.y.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (t().q0(string) != 0) {
            f().A.f(d1Var.G.g(string), "Invalid conditional user property name");
            return;
        }
        if (t().y(obj, string) != 0) {
            f().A.h("Invalid conditional user property value", d1Var.G.g(string), obj);
            return;
        }
        Object w02 = t().w0(obj, string);
        if (w02 == null) {
            f().A.h("Unable to normalize conditional user property value", d1Var.G.g(string), obj);
            return;
        }
        e(bundle2, w02);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            f().A.h("Invalid conditional user property timeout", d1Var.G.g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 <= 15552000000L && j12 >= 1) {
            h().D(new pu1(11, this, bundle2, false));
        } else {
            f().A.h("Invalid conditional user property time to live", d1Var.G.g(string), Long.valueOf(j12));
        }
    }

    public final void b0(String str) {
        this.B.set(str);
    }

    public final void c0(String str, Bundle bundle, String str2) {
        u();
        ((d1) this.f3443v).H.getClass();
        B(System.currentTimeMillis(), bundle, str, str2);
    }
}
