package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bl0 implements el0, yo0, n80, ib.c, xk1, r31, ie0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4818u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4819v;

    public bl0(byte[] bArr) {
        this.f4818u = 8;
        this.f4819v = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.f4819v)[i] = (byte) i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = (byte[]) this.f4819v;
            byte b10 = bArr2[i11];
            i10 = (i10 + b10 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b10;
        }
    }

    public static bl0 c(int i) {
        return new bl0(12, gl1.a(ae1.a(i)));
    }

    public JSONObject a(View view) {
        int i;
        int currentModeType;
        boolean z3 = false;
        JSONObject a10 = su0.a(0, 0, 0, 0);
        UiModeManager uiModeManager = ct.J;
        if (uiModeManager != null && (currentModeType = uiModeManager.getCurrentModeType()) != 1 && currentModeType == 4) {
            i = b80.M;
        } else {
            i = 2;
        }
        int i10 = i - 1;
        if (i != 0) {
            if (i10 == 0) {
                z3 = true;
            }
            try {
                a10.put("noOutputDevice", z3);
                return a10;
            } catch (JSONException e) {
                xy.v(e, "Error with setting output device status");
                return a10;
            }
        }
        throw null;
    }

    public void b(int i, long j10, jt0 jt0Var, String str) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("action", "start_preload");
        a10.k("sp_ts", Long.toString(j10));
        a10.k("ad_format", jt0Var.a());
        a10.k("ad_unit_id", jt0Var.f7536a);
        a10.k("pid", jt0Var.f7538c);
        a10.k("max_ads", Integer.toString(i));
        a10.k("pv", str);
        a10.l();
    }

    public void d(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z3 = true;
            while (it.hasNext()) {
                if (!z3) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z3 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            s41 s41Var = (s41) this.f4819v;
            if (s41Var == null) {
                s41Var = new s41();
                this.f4819v = s41Var;
            }
            y41 y41Var = (y41) s41Var.get(obj);
            if (y41Var == null) {
                int i = 4;
                if (asList instanceof Set) {
                    i = Math.max(4, ((Set) asList).size());
                }
                y41Var = j51.u(i);
                s41 s41Var2 = (s41) this.f4819v;
                if (s41Var2 == null) {
                    s41Var2 = new s41();
                    this.f4819v = s41Var2;
                }
                s41Var2.put(obj, y41Var);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                ed1.k(obj, next);
                y41Var.c(next);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.el0
    public void e(z40 z40Var) {
        switch (this.f4818u) {
            case 0:
                cl0 cl0Var = (cl0) this.f4819v;
                n90 n90Var = (n90) z40Var;
                synchronized (cl0Var) {
                    cl0Var.D = n90Var;
                    n90Var.a();
                }
                return;
            default:
                a40 a40Var = (a40) z40Var;
                no0 no0Var = (no0) this.f4819v;
                synchronized (no0Var) {
                    try {
                        a40 a40Var2 = no0Var.E;
                        if (a40Var2 != null) {
                            a40Var2.d();
                        }
                        no0Var.E = a40Var;
                        h00 h00Var = a40Var.f4344l;
                        if (h00Var != null) {
                            h00Var.V0(no0Var);
                        }
                        no0Var.f8790z.a(new b40(a40Var, no0Var, no0Var.f8790z, no0Var.B));
                        a40Var.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        nx0 nx0Var = (nx0) this.f4819v;
        if (oVar.f18384d) {
            nx0Var.cancel(false);
            return;
        }
        if (oVar.l()) {
            nx0Var.d(oVar.j());
            return;
        }
        Exception i = oVar.i();
        if (i != null) {
            nx0Var.e(i);
        } else {
            g5.q.l();
        }
    }

    public void g(EnumMap enumMap, long j10) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("action", "start_preload");
        a10.k("sp_ts", Long.toString(j10));
        a10.k("pv", "1");
        for (z8.b bVar : enumMap.keySet()) {
            String valueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            a10.k(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(bVar)).intValue()));
        }
        a10.l();
    }

    @Override // com.google.android.gms.internal.ads.yo0
    public /* synthetic */ a20 h(xo0 xo0Var) {
        return ((kp0) this.f4819v).b(xo0Var);
    }

    public void i(int i, int i10, long j10, Long l10, String str, jt0 jt0Var, String str2) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("plaac_ts", Long.toString(j10));
        a10.k("max_ads", Integer.toString(i));
        a10.k("cache_size", Integer.toString(i10));
        a10.k("action", "is_ad_available");
        if (jt0Var != null) {
            a10.k("ad_unit_id", jt0Var.f7536a);
            a10.k("pid", jt0Var.f7538c);
            a10.k("ad_format", jt0Var.a());
        }
        if (l10 != null) {
            a10.k("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            a10.k("gqi", str);
        }
        a10.k("pv", str2);
        a10.l();
    }

    public void j(long j10, int i, int i10, String str, jt0 jt0Var, String str2) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("ppla_ts", Long.toString(j10));
        a10.k("ad_format", jt0Var.a());
        a10.k("ad_unit_id", jt0Var.f7536a);
        a10.k("pid", jt0Var.f7538c);
        a10.k("max_ads", Integer.toString(i));
        a10.k("cache_size", Integer.toString(i10));
        a10.k("action", "poll_ad");
        if (str != null) {
            a10.k("gqi", str);
        }
        a10.k("pv", str2);
        a10.l();
    }

    public void k(long j10, long j11, long j12, long j13, long j14) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("action", "iic");
        a10.k("pat", Long.toString(j10));
        a10.k("bot", Long.toString(j11));
        a10.k("cim", Long.toString(j12));
        a10.k("mbot", Long.toString(j13));
        a10.k("mim", Long.toString(j14));
        a10.l();
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f4818u) {
            case 4:
                hr0 hr0Var = (hr0) this.f4819v;
                ((lr0) obj).z((ir0) hr0Var.f6875u, hr0Var.f6876v);
                return;
            case 15:
                ((hu1) obj).p();
                return;
            default:
                ((hu1) obj).i((mw1) this.f4819v);
                return;
        }
    }

    public void m(String str, long j10, String str2, String str3, z8.b bVar, int i, int i10, int i11) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("action", str);
        a10.k("pat", Long.toString(j10));
        a10.k("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        a10.k("max_ads", Integer.toString(i));
        a10.k("cache_size", Integer.toString(i10));
        a10.k("pas", Integer.toString(i11));
        a10.k("pv", "2");
        a10.k("ad_unit_id", str3);
        a10.k("pid", str2);
        a10.l();
    }

    public void n(String str, String str2, long j10, int i, int i10, String str3, jt0 jt0Var, String str4) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k(str2, Long.toString(j10));
        if (jt0Var != null) {
            a10.k("ad_unit_id", jt0Var.f7536a);
            a10.k("ad_format", jt0Var.a());
            a10.k("pid", jt0Var.f7538c);
        }
        a10.k("action", str);
        if (str3 != null) {
            a10.k("gqi", str3);
        }
        if (i >= 0) {
            a10.k("max_ads", Integer.toString(i));
        }
        if (i10 >= 0) {
            a10.k("cache_size", Integer.toString(i10));
        }
        a10.k("pv", str4);
        a10.l();
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public Object o(String str) {
        ck1 ck1Var = (ck1) this.f4819v;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ck1Var.e(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return ck1Var.e(str, null);
    }

    public void p(String str, long j10, String str2, String str3, z8.b bVar, int i, int i10, int i11, int i12, int i13) {
        j6.s a10 = ((be0) this.f4819v).a();
        a10.k("action", str);
        a10.k("pat", Long.toString(j10));
        a10.k("pid", str2);
        a10.k("ad_unit_id", str3);
        a10.k("max_ads", Integer.toString(i));
        a10.k("cache_size", Integer.toString(i10));
        a10.k("tpcnt", Integer.toString(i12));
        a10.k("mpl", Integer.toString(i13));
        if (bVar != null) {
            a10.k("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i11 > 0) {
            a10.k("nptr", Integer.toString(i11));
        }
        a10.l();
    }

    @Override // com.google.android.gms.internal.ads.el0
    /* renamed from: zza, reason: collision with other method in class */
    public void mo201zza() {
        switch (this.f4818u) {
            case 0:
                cl0 cl0Var = (cl0) this.f4819v;
                synchronized (cl0Var) {
                    cl0Var.D = null;
                }
                return;
            default:
                no0 no0Var = (no0) this.f4819v;
                synchronized (no0Var) {
                    no0Var.E = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        int i = os1.A;
        return (rz) this.f4819v;
    }

    public /* synthetic */ bl0(gu1 gu1Var, mw1 mw1Var, is1 is1Var) {
        this.f4818u = 16;
        this.f4819v = mw1Var;
    }

    public /* synthetic */ bl0(gu1 gu1Var, Object obj, long j10) {
        this.f4818u = 15;
        this.f4819v = obj;
    }

    public bl0(int i) {
        this.f4818u = i;
        switch (i) {
            case 10:
                return;
            default:
                this.f4819v = yf.d.a();
                return;
        }
    }

    public /* synthetic */ bl0(int i, Object obj) {
        this.f4818u = i;
        this.f4819v = obj;
    }
}
