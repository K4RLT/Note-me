package com.google.android.gms.internal.ads;
import c7.f0;
import f9.k;
import i0.m;
import k9.c0;
import la.b;
import q.x;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class xv0 implements dr0, zb0 {

    /* renamed from: z, reason: collision with root package name */
    public static final Object f12632z = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final boolean f12633u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f12634v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f12635w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f12636x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f12637y;

    public xv0(Context context, hh hhVar, nv0 nv0Var, boolean z3) {
        this.f12633u = false;
        this.f12634v = context;
        this.f12636x = Integer.toString(hhVar.f6816u);
        this.f12635w = context.getSharedPreferences("pcvmspf", 0);
        this.f12637y = nv0Var;
        this.f12633u = z3;
    }

    public static xv0 a(ut0 ut0Var, wt0 wt0Var, yt0 yt0Var, yt0 yt0Var2, boolean z3) {
        if (yt0Var != yt0.NONE) {
            ut0 ut0Var2 = ut0.DEFINED_BY_JAVASCRIPT;
            yt0 yt0Var3 = yt0.NATIVE;
            if (ut0Var == ut0Var2 && yt0Var == yt0Var3) {
                x.n("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                return null;
            }
            if (wt0Var == wt0.DEFINED_BY_JAVASCRIPT && yt0Var == yt0Var3) {
                x.n("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                return null;
            }
            return new xv0(ut0Var, wt0Var, yt0Var, yt0Var2, z3);
        }
        x.n("Impression owner is none");
        return null;
    }

    public static String m(ih ihVar) {
        lh G = mh.G();
        String z3 = ihVar.z().z();
        G.b();
        ((mh) G.f4845v).I(z3);
        String A = ihVar.z().A();
        G.b();
        ((mh) G.f4845v).J(A);
        long C = ihVar.z().C();
        G.b();
        ((mh) G.f4845v).L(C);
        long D = ihVar.z().D();
        G.b();
        ((mh) G.f4845v).M(D);
        long B = ihVar.z().B();
        G.b();
        ((mh) G.f4845v).K(B);
        return b.b(((mh) G.c()).b());
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        te z3 = ue.z();
        z3.b();
        ((ue) z3.f4845v).D(5);
        mm1 z9 = om1.z(bArr, 0, bArr.length);
        z3.b();
        ((ue) z3.f4845v).A(z9);
        return Base64.encodeToString(((ue) z3.c()).b(), 11);
    }

    public synchronized String b(Context context) {
        byte[] p10;
        try {
            HashMap zzb = ((cw0) this.f12636x).zzb();
            zzb.put("f", "q");
            zzb.put("ctx", context);
            zzb.put("aid", null);
            p10 = p(zzb);
            if (this.f12633u) {
                zzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(p10);
    }

    public boolean c(ih ihVar, s6 s6Var) {
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f12632z) {
            try {
                mh q10 = q(1);
                String z9 = ihVar.z().z();
                if (q10 != null && q10.z().equals(z9)) {
                    o(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File h3 = h(z9);
                if (h3.exists()) {
                    String str = "1";
                    if (true != h3.isDirectory()) {
                        str = "0";
                    }
                    boolean isFile = h3.isFile();
                    String str2 = "1";
                    if (true != isFile) {
                        str2 = "0";
                    }
                    StringBuilder sb2 = new StringBuilder(7);
                    sb2.append("d:");
                    sb2.append(str);
                    sb2.append(",f:");
                    sb2.append(str2);
                    ((nv0) this.f12637y).d(sb2.toString(), currentTimeMillis2, 4023);
                    o(4015, currentTimeMillis2);
                } else if (!h3.mkdirs()) {
                    String str3 = "1";
                    if (true != h3.canWrite()) {
                        str3 = "0";
                    }
                    ((nv0) this.f12637y).d("cw:".concat(str3), currentTimeMillis2, 4024);
                    o(4015, currentTimeMillis2);
                    return false;
                }
                File h10 = h(z9);
                File file = new File(h10, "pcam.jar");
                File file2 = new File(h10, "pcbc");
                if (!ct.o(file, ihVar.A().a())) {
                    o(4016, currentTimeMillis);
                    return false;
                }
                if (!ct.o(file2, ihVar.B().a())) {
                    o(4017, currentTimeMillis);
                    return false;
                }
                if (s6Var != null) {
                    try {
                        z3 = bv0.a(file);
                    } catch (GeneralSecurityException unused) {
                        z3 = false;
                    }
                    if (!z3) {
                        o(4018, currentTimeMillis);
                        ct.A(h10);
                        return false;
                    }
                }
                String m4 = m(ihVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f12635w;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.f12636x)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f12636x)), m4);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f12636x)), string);
                }
                if (!edit.commit()) {
                    o(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                mh q11 = q(1);
                if (q11 != null) {
                    hashSet.add(q11.z());
                }
                mh q12 = q(2);
                if (q12 != null) {
                    hashSet.add(q12.z());
                }
                for (File file3 : new File(((Context) this.f12634v).getDir("pccache", 0), (String) this.f12636x).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        ct.A(file3);
                    }
                }
                o(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public synchronized String d(Context context, View view, Activity activity) {
        byte[] p10;
        try {
            HashMap c10 = ((cw0) this.f12636x).c();
            c10.put("f", "v");
            c10.put("ctx", context);
            c10.put("aid", null);
            c10.put("view", view);
            c10.put("act", activity);
            p10 = p(c10);
            if (this.f12633u) {
                c10.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(p10);
    }

    public boolean e(ih ihVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f12632z) {
            try {
                if (!ct.o(new File(h(ihVar.z().z()), "pcbc"), ihVar.B().a())) {
                    o(4020, currentTimeMillis);
                    return false;
                }
                String m4 = m(ihVar);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f12635w).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f12636x)), m4);
                boolean commit = edit.commit();
                if (commit) {
                    o(5015, currentTimeMillis);
                } else {
                    o(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String f(Context context, String str, View view, Activity activity) {
        byte[] p10;
        try {
            HashMap k3 = ((cw0) this.f12636x).k();
            k3.put("f", "c");
            k3.put("ctx", context);
            k3.put("cs", str);
            k3.put("aid", null);
            k3.put("view", view);
            k3.put("act", activity);
            p10 = p(k3);
            if (this.f12633u) {
                k3.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return n(p10);
    }

    public synchronized void g(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap a10 = ((cw0) this.f12636x).a();
            a10.put("aid", null);
            a10.put("evt", motionEvent);
            Object obj = this.f12634v;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, a10);
            ((cv0) this.f12637y).b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new aw0(2005, e);
        }
    }

    public File h(String str) {
        return new File(new File(((Context) this.f12634v).getDir("pccache", 0), (String) this.f12636x), str);
    }

    public synchronized boolean i() {
        Object obj;
        try {
            obj = this.f12634v;
        } catch (Exception e) {
            throw new aw0(AdError.INTERNAL_ERROR_CODE, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void j() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.f12634v;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((cv0) this.f12637y).b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new aw0(AdError.INTERNAL_ERROR_2003, e);
        }
    }

    public synchronized int k() {
        Object obj;
        try {
            obj = this.f12634v;
        } catch (Exception e) {
            throw new aw0(AdError.INTERNAL_ERROR_2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    @Override // com.google.android.gms.internal.ads.dr0
    public Object l(Object obj) {
        int i;
        long j10;
        long j11;
        int i10;
        int i11;
        nh0 nh0Var = (nh0) ((f0) this.f12634v).f3950v;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((c0) nh0Var.f3468b).t()) {
            tj tjVar = (tj) this.f12637y;
            oj ojVar = (oj) this.f12636x;
            ArrayList arrayList = (ArrayList) this.f12635w;
            boolean z3 = this.f12633u;
            qj P = rj.P();
            P.b();
            ((rj) P.f4845v).D(arrayList);
            Context context = nh0Var.f8714d;
            int i12 = 1;
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                i = 2;
            } else {
                i = 1;
            }
            P.b();
            ((rj) P.f4845v).G(i);
            TelephonyManager telephonyManager = nh0Var.f8715f;
            k kVar = k.C;
            int h3 = kVar.f16815f.h(context, telephonyManager);
            P.b();
            ((rj) P.f4845v).H(h3);
            lh0 lh0Var = nh0Var.f8716g;
            synchronized (lh0Var.f8032h) {
                j10 = lh0Var.f8028c;
            }
            P.b();
            ((rj) P.f4845v).B(j10);
            synchronized (lh0Var) {
                synchronized (lh0Var.f8033j) {
                    j11 = lh0Var.e;
                }
            }
            P.b();
            ((rj) P.f4845v).C(j11);
            synchronized (lh0Var.f8031g) {
                i10 = lh0Var.f8027b;
            }
            P.b();
            ((rj) P.f4845v).I(i10);
            P.b();
            ((rj) P.f4845v).K(tjVar);
            P.b();
            ((rj) P.f4845v).E(ojVar);
            int i13 = nh0Var.f8717h;
            P.b();
            ((rj) P.f4845v).J(i13);
            if (z3) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            P.b();
            ((rj) P.f4845v).A(i11);
            long a10 = lh0Var.a();
            P.b();
            ((rj) P.f4845v).L(a10);
            kVar.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            P.b();
            ((rj) P.f4845v).z(currentTimeMillis);
            if (Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0) {
                i12 = 2;
            }
            P.b();
            ((rj) P.f4845v).F(i12);
            byte[] b10 = ((rj) P.c()).b();
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
            if (!z3) {
                sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
            }
            ed1.K(sQLiteDatabase, nh0Var.f8716g.a(), b10);
            return null;
        }
        return null;
    }

    public void o(int i, long j10) {
        ((nv0) this.f12637y).f(i, j10);
    }

    public synchronized byte[] p(Map map) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f12634v;
        } catch (Exception e) {
            ((cv0) this.f12637y).c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public mh q(int i) {
        String string;
        wm1 a10;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f12635w;
        String str = (String) this.f12636x;
        if (i == 1) {
            string = sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null);
        } else {
            string = sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        }
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] m4 = b.m(string);
                mm1 z3 = om1.z(m4, 0, m4.length);
                if (this.f12633u) {
                    wm1 wm1Var = wm1.f12302a;
                    int i10 = em1.f5727a;
                    a10 = wm1.f12303b;
                } else {
                    a10 = wm1.a();
                }
                return mh.F(z3, a10);
            } catch (pn1 unused) {
            } catch (NullPointerException unused2) {
                o(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                o(2032, currentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ xv0(Object obj, Object obj2, Object obj3, Object obj4, boolean z3) {
        this.f12634v = obj;
        this.f12635w = obj2;
        this.f12636x = obj3;
        this.f12637y = obj4;
        this.f12633u = z3;
    }

    public /* synthetic */ xv0(f0 f0Var, boolean z3, ArrayList arrayList, oj ojVar, tj tjVar) {
        this.f12634v = f0Var;
        this.f12633u = z3;
        this.f12635w = arrayList;
        this.f12636x = ojVar;
        this.f12637y = tjVar;
    }

    public xv0(ut0 ut0Var, wt0 wt0Var, yt0 yt0Var, yt0 yt0Var2, boolean z3) {
        this.f12636x = ut0Var;
        this.f12637y = wt0Var;
        this.f12634v = yt0Var;
        this.f12635w = yt0Var2;
        this.f12633u = z3;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l, reason: collision with other method in class */
    public /* synthetic */ void mo213l(Object obj) {
        ((by1) obj).m(0, (yx1) ((m) this.f12634v).f18055w, (qx1) this.f12635w, (vx1) this.f12636x, (IOException) this.f12637y, this.f12633u);
    }
}
