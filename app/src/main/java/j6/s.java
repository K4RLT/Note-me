package j6;
import r.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.datastore.preferences.protobuf.s1;
import androidx.work.impl.WorkDatabase_Impl;
import com.daren.scraply.MainActivity;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.ae0;
import com.google.android.gms.internal.ads.af1;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.c50;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.d50;
import com.google.android.gms.internal.ads.dq;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.gr0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.rs1;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.v81;
import com.google.android.gms.internal.ads.vs;
import com.google.android.gms.internal.ads.xl;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.c1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.cx;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.dt;
import com.google.android.gms.internal.mlkit_vision_digital_ink.es;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fs;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.r0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ra;
import com.google.android.gms.internal.mlkit_vision_digital_ink.v8;
import com.google.android.gms.internal.mlkit_vision_digital_ink.va;
import com.google.android.gms.internal.mlkit_vision_digital_ink.w9;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import g5.a0;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lb.k0;
import lb.q0;
import lb.s0;
import lb.t0;
import n.i0;
import q.x;
import ya.c0;
import ya.j1;

/* loaded from: classes.dex */
public class s implements ib.a, n9.e, s81, gr0, af1, b0, da, kb.c, s0 {

    /* renamed from: x, reason: collision with root package name */
    public static s f18979x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18980u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f18981v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18982w;

    public s(byte[] bArr, Provider provider) {
        this.f18980u = 8;
        if (ct.i(1)) {
            this.f18981v = new SecretKeySpec(bArr, "AES");
            this.f18982w = provider;
        } else {
            s1.q("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b0
    public n a(com.google.android.gms.internal.measurement.n nVar) {
        n u9 = ((n) this.f18981v).u();
        u9.w((String) this.f18982w, nVar);
        return u9;
    }

    @Override // lb.s0
    public Object b() {
        t0 t0Var = (t0) this.f18981v;
        Bundle bundle = (Bundle) this.f18982w;
        HashMap hashMap = t0Var.f20281c;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        if (((q0) hashMap.get(valueOf)).f20236c.f6274b == 6) {
            return Boolean.FALSE;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return Boolean.valueOf(!lb.a.c(r0.f20236c.f6274b, bundle.getInt(j1.a("status", stringArrayList.get(0)))));
        }
        throw new k0("Session without pack received.");
    }

    public ArrayList c(String str) {
        String string;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18981v;
        a0 k3 = a0.k(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (d2.isNull(0)) {
                    string = null;
                } else {
                    string = d2.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            d2.close();
            k3.m();
        }
    }

    @Override // n9.e
    public /* bridge */ /* synthetic */ Object d(Object obj) {
        try {
            ((vs) this.f18981v).k1(new ms(1, (com.google.ads.mediation.a) obj));
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new et((as) this.f18982w);
    }

    @Override // com.google.android.gms.internal.ads.af1
    public byte[] e(byte[] bArr, int i) {
        if (i <= 16) {
            Provider provider = (Provider) this.f18982w;
            SecretKeySpec secretKeySpec = (SecretKeySpec) this.f18981v;
            Mac mac = Mac.getInstance("AESCMAC", provider);
            mac.init(secretKeySpec);
            byte[] doFinal = mac.doFinal(bArr);
            if (i == doFinal.length) {
                return doFinal;
            }
            return Arrays.copyOf(doFinal, i);
        }
        throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
    }

    public void f() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f18981v;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
    }

    @Override // ib.a
    public Object g(ib.o oVar) {
        ba.b bVar = (ba.b) this.f18981v;
        Bundle bundle = (Bundle) this.f18982w;
        bVar.getClass();
        if (!oVar.l()) {
            return oVar;
        }
        Bundle bundle2 = (Bundle) oVar.j();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return bVar.a(bundle).n(ba.h.f3130w, ba.d.f3125x);
        }
        return oVar;
    }

    public void h(b1.h hVar) {
        this.f18982w = hVar;
        View findViewById = ((MainActivity) this.f18981v).findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new n3.a(this, findViewById, 0));
    }

    public void i(qp0 qp0Var) {
        k("aai", qp0Var.f9964w);
        k("request_id", qp0Var.f9947n0);
        k("ad_format", qp0.a(qp0Var.f9926b));
    }

    public void j(Object obj, String str) {
        boolean commit;
        String str2 = (String) this.f18981v;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f18982w;
        if (obj instanceof String) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else if (obj instanceof Integer) {
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        } else {
            String valueOf = String.valueOf(obj.getClass());
            Log.e("GpidLifecycleSPHandler", a5.a.l(new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", valueOf, " for app ", str2));
            x.p(a5.a.l(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
        }
        if (commit) {
            return;
        }
        x.p(a5.a.l(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public void k(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((ConcurrentHashMap) this.f18981v).put(str, str2);
        }
    }

    public void l() {
        ((be0) this.f18982w).f4771b.execute(new ae0(this, 1));
    }

    public l9.k m() {
        boolean booleanValue = ((Boolean) g9.e.f17698c.a(sl.Pf)).booleanValue();
        l9.k kVar = l9.k.f20054u;
        if (booleanValue) {
            be0 be0Var = (be0) this.f18982w;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18981v;
            fe0 fe0Var = be0Var.f4770a;
            fe0Var.getClass();
            if (concurrentHashMap.isEmpty()) {
                int i = k9.a0.f19634b;
                l9.i.a("Empty paramMap.");
                return kVar;
            }
            String i10 = fe0Var.f6049f.i(concurrentHashMap);
            k9.a0.k(i10);
            return fe0Var.f6048d.a(null, i10);
        }
        l();
        return kVar;
    }

    public void n() {
        ((be0) this.f18982w).f4771b.execute(new ae0(this, 0));
    }

    public void o(ir irVar) {
        Handler handler = (Handler) this.f18981v;
        if (handler != null) {
            handler.post(new ra(this, 4, irVar));
        }
    }

    public void p(String str) {
        if (((SharedPreferences) this.f18982w).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.f18981v;
        x.p(a5.a.l(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        List list = ((c50) obj).f5003a;
        p8 p8Var = (p8) this.f18981v;
        f50 f50Var = (f50) this.f18982w;
        Executor executor = f50Var.f5934a;
        if (list != null && !list.isEmpty()) {
            ac.b bVar = v81.f11836v;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bVar = ed1.c0(ed1.U(bVar, Throwable.class, new dq(3, p8Var), executor), new d50(0, f50Var, p8Var, (ac.b) it.next()), executor);
            }
            bVar.a(new t81(bVar, 0, new mu(f50Var, p8Var)), executor);
            return;
        }
        executor.execute(new e50(p8Var, 0));
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        ((p8) this.f18981v).t(th);
        f50 f50Var = (f50) this.f18982w;
        f50Var.getClass();
        xx.f12655f.execute(new e40(1, f50Var));
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            ((vs) this.f18981v).r(aVar.a());
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        int i = this.f18980u;
        Object obj = this.f18981v;
        switch (i) {
            case 11:
                dt dtVar = (dt) obj;
                v8 v8Var = (v8) this.f18982w;
                String str = v8Var.f15123a;
                es t3 = fs.t();
                t3.m(str);
                t3.n(dtVar.f14213a.getPackageName());
                fs fsVar = (fs) t3.i();
                w9 d2 = dtVar.f14214b.d(fsVar, true);
                c1 c1Var = new c1(5, dtVar, v8Var, fsVar);
                int i10 = g2.f14354a;
                return n5.q(d2, new r0(q1.b(), 3, c1Var), dtVar.f14218g);
            default:
                ra.e eVar = (ra.e) obj;
                String str2 = (String) this.f18982w;
                try {
                    HashMap hashMap = (HashMap) eVar.f24677x;
                    hashMap.remove(str2);
                    hashMap.size();
                    return va.f15125v;
                } catch (Exception e) {
                    cx.j(e, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", str2);
                    return n5.l(e);
                }
        }
    }

    public s(Context context) {
        this.f18980u = 7;
        this.f18981v = context.getPackageName();
        this.f18982w = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public s(Handler handler, rs1 rs1Var) {
        this.f18980u = 2;
        if (rs1Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f18981v = handler;
        this.f18982w = rs1Var;
    }

    public s(com.google.android.gms.internal.ads.dt dtVar, vs vsVar, as asVar) {
        this.f18980u = 3;
        this.f18981v = vsVar;
        this.f18982w = asVar;
    }

    public s(f50 f50Var, p8 p8Var) {
        this.f18980u = 4;
        this.f18981v = p8Var;
        this.f18982w = f50Var;
    }

    public s(be0 be0Var) {
        this.f18980u = 5;
        this.f18982w = be0Var;
        this.f18981v = new ConcurrentHashMap();
    }

    public /* synthetic */ s(Object obj, int i, Object obj2) {
        this.f18980u = i;
        this.f18981v = obj;
        this.f18982w = obj2;
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f18980u = 0;
        this.f18981v = workDatabase_Impl;
        this.f18982w = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 20);
    }

    public s(MainActivity mainActivity) {
        this.f18980u = 15;
        this.f18981v = mainActivity;
        this.f18982w = new l4.a(16);
    }

    public s() {
        this.f18980u = 16;
        this.f18981v = new i0();
        this.f18982w = new i0();
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public Object mo207zza() {
        return new jb.i(((jb.f) ((z5.h) this.f18981v).f31922v).f19108a, (jb.j) ((kb.c) this.f18982w).mo207zza());
    }

    @Override // com.google.android.gms.internal.ads.gr0
    /* renamed from: zza */
    public void mo227zza() {
        fk0 fk0Var = (fk0) this.f18981v;
        xl xlVar = (xl) this.f18982w;
        yl ylVar = (yl) fk0Var.f6098d;
        Parcel g22 = ylVar.g2();
        qh.e(g22, xlVar);
        ylVar.v2(g22, 1);
    }
}
