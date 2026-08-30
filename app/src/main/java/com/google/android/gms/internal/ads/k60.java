package com.google.android.gms.internal.ads;
import ac.a;
import p.a;
import a5.a;
import ac.b;
import f9.k;
import g9.p;
import g9.r;
import g9.u0;
import g9.z2;
import j6.s;
import k9.a0;
import k9.f0;
import l9.i;
import r.e;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k60 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7666a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7667b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7668c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7669d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7670f;

    public /* synthetic */ k60(yd1 yd1Var) {
        this.f7666a = (Context) yd1Var.f12855u;
        this.f7667b = (aq0) yd1Var.f12856v;
        this.f7668c = (Bundle) yd1Var.f12857w;
        this.f7669d = (xp0) yd1Var.f12858x;
        this.e = (zd1) yd1Var.f12859y;
        this.f7670f = (ii0) yd1Var.f12860z;
    }

    public static yx1 m(eu1 eu1Var, d51 d51Var, yx1 yx1Var, qg qgVar) {
        Object f10;
        uh J1 = eu1Var.J1();
        eu1Var.f5814x.b();
        int n22 = eu1Var.f5813w.n2();
        if (J1.g()) {
            f10 = null;
        } else {
            f10 = J1.f(n22);
        }
        if (!eu1Var.Y1() && !J1.g()) {
            qg d2 = J1.d(n22, qgVar, false);
            eu1Var.W1();
            String str = bq0.f4860a;
            d2.getClass();
        }
        for (int i = 0; i < d51Var.size(); i++) {
            yx1 yx1Var2 = (yx1) d51Var.get(i);
            if (o(yx1Var2, f10, eu1Var.Y1(), eu1Var.q0(), eu1Var.Z1())) {
                return yx1Var2;
            }
        }
        if (!d51Var.isEmpty() || yx1Var == null || !o(yx1Var, f10, eu1Var.Y1(), eu1Var.q0(), eu1Var.Z1())) {
            return null;
        }
        return yx1Var;
    }

    public static boolean o(yx1 yx1Var, Object obj, boolean z3, int i, int i10) {
        if (yx1Var.f13003a.equals(obj)) {
            int i11 = yx1Var.f13004b;
            if (z3) {
                if (i11 == i && yx1Var.f13005c == i10) {
                    return true;
                }
                return false;
            }
            if (i11 == -1 && yx1Var.e == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public yd1 a() {
        com.google.android.gms.internal.ads.yd1 obj = new Object();
        obj.f12855u = (Context) this.f7666a;
        obj.f12856v = (aq0) this.f7667b;
        obj.f12857w = (Bundle) this.f7668c;
        obj.f12859y = (zd1) this.e;
        obj.f12860z = (ii0) this.f7670f;
        return obj;
    }

    public String b() {
        String str = (String) g9.r.e.f17698c.a(sl.f10942sb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f7666a);
            jSONObject.put("eventCategory", (String) this.f7667b);
            jSONObject.putOpt("event", (String) this.f7668c);
            jSONObject.putOpt("errorCode", (Integer) this.f7669d);
            jSONObject.putOpt("rewardType", (String) this.e);
            jSONObject.putOpt("rewardAmount", (Integer) this.f7670f);
        } catch (JSONException unused) {
            int i = k9.a0.f19634b;
            l9.i.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        int length = String.valueOf(str).length();
        return a5.a.l(new StringBuilder(String.valueOf(jSONObject2).length() + length + 14 + 2), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f7669d) {
            try {
                if (((Context) this.f7666a) != null) {
                    return;
                }
                this.f7666a = context.getApplicationContext();
                nl nlVar = sl.f10727f5;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    n();
                } else {
                    if (((Boolean) rVar.f17698c.a(sl.f10711e5)).booleanValue()) {
                        f9.k.C.f16816g.g(new zi(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    public boolean d(g9.z2 z2Var, String str, an1 an1Var, el0 el0Var) {
        ur0 ur0Var;
        yk0 yk0Var = (yk0) ((zd1) this.f7669d).f13143w;
        y10 y10Var = (y10) this.f7668c;
        nl nlVar = sl.f10709e3;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            g9.p.a();
        }
        f9.k kVar = f9.k.C;
        k9.f0 f0Var = kVar.f16813c;
        Context context = (Context) this.f7666a;
        final int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final int i10 = 1;
        if (k9.f0.h(context) && z2Var.M == null) {
            int i11 = k9.a0.f19634b;
            l9.i.c("Failed to load the ad because app ID is missing.");
            y10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gl0

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ k60 f6426v;

                {
                    this.f6426v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ((dl0) ((zd1) this.f6426v.f7669d).f13144x).x(x21.J(6, null, null));
                            return;
                        default:
                            ((dl0) ((zd1) this.f6426v.f7669d).f13144x).x(x21.J(4, null, null));
                            return;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i12 = k9.a0.f19634b;
            l9.i.c("Ad unit ID should not be null for NativeAdLoader.");
            y10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gl0

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ k60 f6426v;

                {
                    this.f6426v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((dl0) ((zd1) this.f6426v.f7669d).f13144x).x(x21.J(6, null, null));
                            return;
                        default:
                            ((dl0) ((zd1) this.f6426v.f7669d).f13144x).x(x21.J(4, null, null));
                            return;
                    }
                }
            });
            return false;
        }
        boolean z3 = z2Var.f17726z;
        ay0.p(context, z3);
        if (((Boolean) rVar.f17698c.a(sl.f10811ka)).booleanValue() && z3) {
            ((nf0) y10Var.D.zzb()).b(true);
        }
        int i13 = ((fl0) an1Var).O;
        kVar.f16819k.getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Bundle e = b80.e(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        zp0 zp0Var = (zp0) this.f7667b;
        zp0Var.f13226a = z2Var;
        zp0Var.f13243t = e;
        zp0Var.f13236m = i13;
        aq0 a10 = zp0Var.a();
        rr0 g8 = rr0.g(context, ed1.P(a10), 8, z2Var);
        g9.u0 u0Var = a10.f4590o;
        if (u0Var != null) {
            yk0Var.l(u0Var);
        }
        y10 y10Var2 = y10Var.f12709b;
        Object obj = new Object();
        obj.f12855u = context;
        obj.f12856v = a10;
        k60 k60Var = new k60((yd1) obj);
        o80 o80Var = new o80();
        o80Var.d(yk0Var, y10Var.b());
        p80 p80Var = new p80(o80Var);
        x90 x90Var = new x90(r2.f13142v, (int) (objArr3 == true ? 1 : 0), (Object) yk0Var.k());
        int i14 = 16;
        x10 x10Var = new x10(y10Var2, new lx0(i14, (Object) null), x90Var, new v80(i14), p80Var, k60Var, new tf(28, (boolean) (objArr2 == true ? 1 : 0)), null, null);
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            ur0Var = (ur0) x10Var.e.zzb();
            ur0Var.i(8);
            ur0Var.c(z2Var.J);
            ur0Var.d(z2Var.G);
        } else {
            ur0Var = null;
        }
        ((jq0) y10Var.S.zzb()).a(1);
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) y10Var.f12713d.zzb();
        i50 i50Var = (i50) x10Var.f12413p.zzb();
        hr0 c10 = i50Var.c(i50Var.b());
        f50 f50Var = new f50(wxVar, scheduledExecutorService, c10);
        this.f7670f = f50Var;
        c10.a(new t81((Object) c10, (int) (objArr == true ? 1 : 0), (Object) new j6.s(f50Var, new p8(this, (jk0) el0Var, ur0Var, g8, x10Var, 5, false))), wxVar);
        return true;
    }

    public k60 e(dr0 dr0Var) {
        return g(new dq(13, dr0Var));
    }

    public aj f(dj djVar) {
        synchronized (this.f7669d) {
            if (((ej) this.f7670f) == null) {
                return new aj();
            }
            try {
                boolean A = ((cj) this.e).A();
                ej ejVar = (ej) this.f7670f;
                if (A) {
                    Parcel g22 = ejVar.g2();
                    qh.c(g22, djVar);
                    Parcel u22 = ejVar.u2(g22, 2);
                    aj ajVar = (aj) qh.b(u22, aj.CREATOR);
                    u22.recycle();
                    return ajVar;
                }
                Parcel g23 = ejVar.g2();
                qh.c(g23, djVar);
                Parcel u23 = ejVar.u2(g23, 1);
                aj ajVar2 = (aj) qh.b(u23, aj.CREATOR);
                u23.recycle();
                return ajVar2;
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.d("Unable to call into cache service.", e);
                return new aj();
            }
        }
    }

    public k60 g(j81 j81Var) {
        kr0 kr0Var = (kr0) this.f7670f;
        wx wxVar = kr0Var.f7851a;
        return new k60(kr0Var, this.f7666a, (String) this.f7667b, (ac.b) this.f7668c, (List) this.f7669d, ed1.c0((ac.b) this.e, j81Var, wxVar));
    }

    public /* synthetic */ void h() {
        synchronized (this.f7669d) {
            try {
                cj cjVar = (cj) this.e;
                if (cjVar == null) {
                    return;
                }
                if (cjVar.h() || ((cj) this.e).e()) {
                    ((cj) this.e).o();
                }
                this.e = null;
                this.f7670f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k60 i(long j10) {
        kr0 kr0Var = (kr0) this.f7670f;
        ScheduledExecutorService scheduledExecutorService = kr0Var.f7852b;
        return new k60(kr0Var, this.f7666a, (String) this.f7667b, (ac.b) this.f7668c, (List) this.f7669d, ed1.Y((ac.b) this.e, j10, TimeUnit.SECONDS, scheduledExecutorService));
    }

    public hr0 j() {
        kr0 kr0Var = (kr0) this.f7670f;
        Object obj = this.f7666a;
        String str = (String) this.f7667b;
        if (str == null) {
            kr0Var.getClass();
            str = ((ir0) obj).f7202u;
        }
        hr0 hr0Var = new hr0(obj, str, (ac.b) this.e);
        kr0Var.f7853c.P1(new jk0(29, hr0Var));
        ac.b bVar = (ac.b) this.f7668c;
        ac.a aVar = new ac.a(this, 23, hr0Var);
        wx wxVar = xx.f12657h;
        bVar.a(aVar, wxVar);
        hr0Var.a(new t81(hr0Var, 0, new com.google.android.gms.internal.measurement.e4(this, 8, hr0Var)), wxVar);
        return hr0Var;
    }

    public void k(uh uhVar) {
        d51 d51Var;
        nb nbVar = new nb(4);
        if (((d51) this.f7667b).isEmpty()) {
            l(nbVar, (yx1) this.e, uhVar);
            if (!Objects.equals((yx1) this.f7670f, (yx1) this.e)) {
                l(nbVar, (yx1) this.f7670f, uhVar);
            }
            if (!Objects.equals((yx1) this.f7669d, (yx1) this.e) && !Objects.equals((yx1) this.f7669d, (yx1) this.f7670f)) {
                l(nbVar, (yx1) this.f7669d, uhVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((d51) this.f7667b).size();
                d51Var = (d51) this.f7667b;
                if (i >= size) {
                    break;
                }
                l(nbVar, (yx1) d51Var.get(i), uhVar);
                i++;
            }
            if (!d51Var.contains((yx1) this.f7669d)) {
                l(nbVar, (yx1) this.f7669d, uhVar);
            }
        }
        this.f7668c = nbVar.q(true);
    }

    public void l(nb nbVar, yx1 yx1Var, uh uhVar) {
        if (yx1Var != null) {
            if (uhVar.e(yx1Var.f13003a) != -1) {
                nbVar.e(yx1Var, uhVar);
                return;
            }
            uh uhVar2 = (uh) ((d61) this.f7668c).get(yx1Var);
            if (uhVar2 != null) {
                nbVar.e(yx1Var, uhVar2);
            }
        }
    }

    public void n() {
        cj cjVar;
        synchronized (this.f7669d) {
            if (((Context) this.f7666a) != null && ((cj) this.e) == null) {
                tf tfVar = new tf(8, this);
                jk0 jk0Var = new jk0(9, this);
                synchronized (this) {
                    cjVar = new cj((Context) this.f7666a, f9.k.C.f16828t.a(), tfVar, jk0Var, 0);
                }
                this.e = cjVar;
                cjVar.m();
            }
        }
    }

    public /* synthetic */ k60(String str) {
        this.f7667b = str;
    }

    public k60(kr0 kr0Var, Object obj, String str, ac.b bVar, List list, ac.b bVar2) {
        Objects.requireNonNull(kr0Var);
        this.f7670f = kr0Var;
        this.f7666a = obj;
        this.f7667b = str;
        this.f7668c = bVar;
        this.f7669d = list;
        this.e = bVar2;
    }
}
