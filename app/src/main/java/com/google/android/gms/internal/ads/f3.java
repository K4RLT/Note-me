package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.v81;
import com.google.android.gms.internal.ads.vr0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import k9.c0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f3 implements o2, p2, dr0, ib.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5898u;

    /* renamed from: v, reason: collision with root package name */
    public long f5899v;

    /* renamed from: w, reason: collision with root package name */
    public Object f5900w;

    public f3(int i, byte b10) {
        this.f5898u = i;
        switch (i) {
            case 5:
                this.f5900w = null;
                this.f5899v = -1L;
                return;
            case 8:
                return;
            default:
                this.f5900w = new ArrayList();
                return;
        }
    }

    public static final void j(be0 be0Var, String str, long j10) {
        if (be0Var != null) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f10719ee)).booleanValue()) {
                j6.s a10 = be0Var.a();
                a10.k("action", "lat_init");
                a10.k(str, Long.toString(j10));
                a10.l();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p2
    public i3 A(int i, int i10) {
        return ((p2) this.f5900w).A(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void B(a3 a3Var) {
        ((p2) this.f5900w).B(new g3(this, a3Var, a3Var));
    }

    @Override // com.google.android.gms.internal.ads.o2
    public boolean C(byte[] bArr, int i, int i10, boolean z3) {
        return ((o2) this.f5900w).C(bArr, 0, i10, z3);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public int D(byte[] bArr, int i, int i10) {
        return ((o2) this.f5900w).D(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public boolean E(byte[] bArr, int i, int i10, boolean z3) {
        return ((o2) this.f5900w).E(bArr, i, i10, z3);
    }

    public long d(v1.t tVar, float f10) {
        float abs;
        long j10;
        long h3 = j1.b.h(this.f5899v, j1.b.g(tVar.f27343c, tVar.f27346g));
        this.f5899v = h3;
        t.z0 z0Var = (t.z0) this.f5900w;
        if (z0Var == null) {
            abs = j1.b.d(h3);
        } else {
            abs = Math.abs(g(h3));
        }
        if (abs >= f10) {
            long j11 = this.f5899v;
            if (z0Var == null) {
                return j1.b.g(this.f5899v, j1.b.i(j1.b.b(j11, j1.b.d(j11)), f10));
            }
            float g8 = g(j11) - (Math.signum(g(this.f5899v)) * f10);
            long j12 = this.f5899v;
            t.z0 z0Var2 = t.z0.f25598v;
            if (z0Var == z0Var2) {
                j10 = j12 & 4294967295L;
            } else {
                j10 = j12 >> 32;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j10);
            if (z0Var == z0Var2) {
                return (Float.floatToRawIntBits(g8) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
            }
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(g8) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public int e(byte[] bArr, int i, int i10) {
        return ((o2) this.f5900w).e(bArr, i, i10);
    }

    public float g(long j10) {
        long j11;
        if (((t.z0) this.f5900w) == t.z0.f25598v) {
            j11 = j10 >> 32;
        } else {
            j11 = j10 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j11);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void h() {
        ((o2) this.f5900w).h();
    }

    public void i(Context context, l9.a aVar, boolean z3, mx mxVar, String str, String str2, Runnable runnable, final vr0 vr0Var, final be0 be0Var, final Long l10, boolean z9) {
        PackageInfo c10;
        f9.k kVar = f9.k.C;
        la.a aVar2 = kVar.f16819k;
        la.a aVar3 = kVar.f16819k;
        aVar2.getClass();
        if (SystemClock.elapsedRealtime() - this.f5899v < 5000) {
            int i = k9.a0.f19634b;
            l9.i.f("Not retrying to fetch app settings");
            return;
        }
        aVar3.getClass();
        this.f5899v = SystemClock.elapsedRealtime();
        if (mxVar != null && !TextUtils.isEmpty(mxVar.e)) {
            long j10 = mxVar.f8475f;
            aVar3.getClass();
            if (System.currentTimeMillis() - j10 <= ((Long) g9.r.e.f17698c.a(sl.f10648a5)).longValue() && mxVar.f8477h) {
                return;
            }
        }
        if (context == null) {
            int i10 = k9.a0.f19634b;
            l9.i.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i11 = k9.a0.f19634b;
            l9.i.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f5900w = applicationContext;
        final rr0 d2 = rr0.d(context, 4);
        d2.zza();
        jr i12 = kVar.f16826r.i((Context) this.f5900w, aVar, vr0Var);
        fp fpVar = ct.f5155w;
        lr a10 = i12.a("google.afma.config.fetchAppSettings", fpVar, fpVar);
        int i13 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z3);
            jSONObject.put("pn", context.getPackageName());
            nl nlVar = sl.f10642a;
            g9.r rVar = g9.r.e;
            jSONObject.put("experiment_ids", TextUtils.join(",", rVar.f17696a.F()));
            jSONObject.put("js", aVar.f20029u);
            if (((Boolean) rVar.f17698c.a(sl.Qa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z9);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f5900w).getApplicationInfo();
                if (applicationInfo != null && (c10 = na.b.a(context).c(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", c10.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                k9.a0.k("Error fetching PackageInfo.");
            }
            ac.b a11 = a10.a(jSONObject);
            j81 j81Var = new j81() { // from class: f9.c
                @Override // com.google.android.gms.internal.ads.j81
                public final ac.b l(Object obj) {
                    Long l11 = l10;
                    be0 be0Var2 = be0Var;
                    rr0 rr0Var = d2;
                    vr0 vr0Var2 = vr0Var;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i14 = 0;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        k kVar2 = k.C;
                        c0 g8 = kVar2.f16817h.g();
                        g8.i();
                        synchronized (g8.f19642a) {
                            try {
                                kVar2.f16819k.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (string != null && !string.equals(g8.f19653n.e)) {
                                    g8.f19653n = new mx(string, currentTimeMillis);
                                    SharedPreferences.Editor editor = g8.f19647g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        g8.f19647g.putLong("app_settings_last_update_ms", currentTimeMillis);
                                        g8.f19647g.apply();
                                    }
                                    g8.j();
                                    ArrayList arrayList = g8.f19644c;
                                    int size = arrayList.size();
                                    while (i14 < size) {
                                        Object obj2 = arrayList.get(i14);
                                        i14++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                                g8.f19653n.f8475f = currentTimeMillis;
                            } finally {
                            }
                        }
                        if (l11 != null) {
                            k.C.f16819k.getClass();
                            f3.j(be0Var2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                        }
                    }
                    String optString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(optString)) {
                        rr0Var.R(optString);
                    }
                    rr0Var.a(optBoolean);
                    vr0Var2.b(rr0Var.m());
                    return v81.f11836v;
                }
            };
            wx wxVar = xx.f12657h;
            b81 c02 = ed1.c0(a11, j81Var, wxVar);
            if (runnable != null) {
                ((yx) a11).f12998u.a(runnable, wxVar);
            }
            if (l10 != null) {
                ((yx) a11).f12998u.a(new pu1(be0Var, 14, l10), wxVar);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) g9.r.e.f17698c.a(sl.D8)).booleanValue()) {
                c02.a(new t81(c02, i13, new q91(str3, 6)), wxVar);
            } else {
                x21.i(c02, "ConfigLoader.maybeFetchNewAppSettings", wxVar);
            }
        } catch (Exception e) {
            int i14 = k9.a0.f19634b;
            l9.i.d("Error requesting application settings", e);
            d2.b(e);
            d2.a(false);
            vr0Var.b(d2.m());
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public int k() {
        return ((o2) this.f5900w).k();
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((k9.c0) ((mh0) this.f5900w).f3468b).t()) {
            long j10 = this.f5899v;
            qj P = rj.P();
            P.b();
            ((rj) P.f4845v).L(j10);
            byte[] b10 = ((rj) P.c()).b();
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
            ed1.K(sQLiteDatabase, j10, b10);
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public long m() {
        return ((o2) this.f5900w).m() - this.f5899v;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public long n() {
        return ((o2) this.f5900w).n() - this.f5899v;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public long p() {
        return ((o2) this.f5900w).p() - this.f5899v;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void s(int i) {
        ((o2) this.f5900w).s(i);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void u(int i) {
        ((o2) this.f5900w).u(i);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void v(byte[] bArr, int i, int i10) {
        ((o2) this.f5900w).v(bArr, i, i10);
    }

    @Override // ib.d
    public void w(Exception exc) {
        switch (this.f5898u) {
            case 6:
                j6.e eVar = (j6.e) this.f5900w;
                ((AtomicLong) eVar.f18919v).set(this.f5899v);
                return;
            default:
                i0.m mVar = (i0.m) this.f5900w;
                ((AtomicLong) mVar.f18054v).set(this.f5899v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public boolean x(int i, boolean z3) {
        return ((o2) this.f5900w).x(i, true);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void y(byte[] bArr, int i, int i10) {
        ((o2) this.f5900w).y(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void z() {
        ((p2) this.f5900w).z();
    }

    public f3(o2 o2Var, long j10) {
        this.f5898u = 0;
        this.f5900w = o2Var;
        b80.l(o2Var.n() >= j10);
        this.f5899v = j10;
    }

    public /* synthetic */ f3(Object obj, long j10, int i) {
        this.f5898u = i;
        this.f5900w = obj;
        this.f5899v = j10;
    }

    public /* synthetic */ f3(long j10, Object obj, int i) {
        this.f5898u = i;
        this.f5899v = j10;
        this.f5900w = obj;
    }

    public f3(la.a aVar) {
        this.f5898u = 7;
        fa.y.h(aVar);
        this.f5900w = aVar;
    }

    public f3(int i) {
        this.f5898u = 9;
        this.f5900w = new MotionEvent.PointerCoords[i];
        for (int i10 = 0; i10 < i; i10++) {
            ((MotionEvent.PointerCoords[]) this.f5900w)[i10] = new MotionEvent.PointerCoords();
        }
    }
}
