package com.google.android.gms.internal.ads;
import c2.b;
import f9.k;
import n9.b;
import r0.e;
import a0.k;
import ac.b;
import g9.r;
import g9.z1;
import ic.c;
import j6.s;
import k9.a0;
import k9.u;
import l9.i;
import r.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lx0 implements r0, e2, b71, s81, ay, n9.b, n80, qn, xg0, y40, el0, yo0 {

    /* renamed from: w, reason: collision with root package name */
    public static lx0 f8175w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8176u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f8177v;

    public lx0(byte[] bArr) {
        this.f8176u = 6;
        this.f8177v = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.f8177v)[i] = (byte) i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = (byte[]) this.f8177v;
            byte b10 = bArr2[i11];
            i10 = (i10 + b10 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b10;
        }
    }

    public static final lx0 f(Context context) {
        lx0 lx0Var;
        synchronized (lx0.class) {
            try {
                if (f8175w == null) {
                    f8175w = new lx0(context);
                }
                lx0Var = f8175w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lx0Var;
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public ac.b a(dv dvVar) {
        rg0 rg0Var = (rg0) ((zd1) this.f8177v).f13143w;
        String str = dvVar.B;
        synchronized (rg0Var.f9515v) {
            try {
                int i = rg0Var.B;
                if (i != 1 && i != 3) {
                    return ed1.A(new cg0(2));
                }
                if (rg0Var.f9516w) {
                    return rg0Var.f9514u;
                }
                rg0Var.B = 3;
                rg0Var.f9516w = true;
                rg0Var.A = str;
                rg0Var.f9519z.m();
                yx yxVar = rg0Var.f9514u;
                yxVar.f12998u.a(new qg0(rg0Var, 0), xx.f12657h);
                return yxVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b71
    public /* synthetic */ void b(long j10, xk0 xk0Var) {
        switch (this.f8176u) {
            case 3:
                ay0.i(j10, xk0Var, ((n6) this.f8177v).I);
                return;
            default:
                ay0.i(j10, xk0Var, (i3[]) ((hq0) this.f8177v).f6873w);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn
    /* renamed from: c */
    public JSONObject mo216c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e2
    public long d(long j10) {
        ((s2) this.f8177v).getClass();
        String str = bq0.f4860a;
        return Math.max(0L, Math.min((j10 * r0.e) / 1000000, r0.f10462j - 1));
    }

    @Override // com.google.android.gms.internal.ads.el0
    public void e(z40 z40Var) {
        c60 c60Var;
        wk0 wk0Var = (wk0) this.f8177v;
        f40 f40Var = (f40) z40Var;
        synchronized (wk0Var) {
            try {
                f40 f40Var2 = wk0Var.C;
                if (f40Var2 != null) {
                    c60 c60Var2 = f40Var.f13074j;
                    if (c60Var2 != null && (c60Var = f40Var2.f13074j) != null) {
                        c60Var2.a(c60Var.f5014a.get());
                    }
                    e70 e70Var = wk0Var.C.f13069c;
                    e70Var.getClass();
                    e70Var.P1(new ll(null, 2));
                }
                wk0Var.C = f40Var;
                f40Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r0
    public void g(float f10) {
        o1 o1Var = ((j1) this.f8177v).f7273b;
        if (o1Var.e == f10) {
            return;
        }
        o1Var.e = f10;
        o1Var.b(false);
    }

    @Override // com.google.android.gms.internal.ads.yo0
    public /* synthetic */ a20 h(xo0 xo0Var) {
        return ((ko0) this.f8177v).b(xo0Var);
    }

    public AtomicReference i(String str) {
        synchronized (this) {
            try {
                HashMap hashMap = (HashMap) this.f8177v;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f8177v).get(str);
    }

    public void j(gb gbVar, d dVar, com.google.android.gms.internal.mlkit_vision_digital_ink.ra raVar) {
        synchronized (gbVar.f6357y) {
            gbVar.C = true;
        }
        gbVar.a("post-response");
        ((k0) this.f8177v).f7591v.post(new r1(1, gbVar, dVar, raVar));
    }

    @Override // com.google.android.gms.internal.ads.qn
    public JSONObject k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f8176u) {
            case 10:
                uq uqVar = (uq) obj;
                k9.a0.k("Getting a new session for JS Engine.");
                uqVar.getClass();
                ((yx) ((br) this.f8177v).f3468b).b(new fr(uqVar));
                return;
            case 18:
                ((w60) obj).N((r90) this.f8177v);
                return;
            case 19:
                ((k80) obj).c((nk) this.f8177v);
                return;
            default:
                ((ai) obj).k((zh) this.f8177v);
                return;
        }
    }

    public void o() {
        synchronized (lx0.class) {
            j6.s sVar = (j6.s) this.f8177v;
            sVar.p("vendor_scoped_gpid_v2_id");
            sVar.p("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        ic.c cVar;
        yx yxVar;
        switch (this.f8176u) {
            case 8:
                String str = (String) obj;
                h00 h00Var = (h00) this.f8177v;
                if (h00Var.J() != null) {
                    cVar = h00Var.J().f9967x0;
                } else {
                    cVar = null;
                }
                new k9.u(h00Var.getContext(), h00Var.A().f20029u, str, cVar).r();
                return;
            case 13:
                ((AtomicInteger) ((c2.b) this.f8177v).f3469c).set(1);
                return;
            case 17:
                ((a60) this.f8177v).f4370u.l();
                return;
            case gl.zzm /* 21 */:
                na0 na0Var = (na0) this.f8177v;
                ra0 ra0Var = na0Var.f8615m;
                h00 h00Var2 = (h00) obj;
                synchronized (ra0Var) {
                    ra0Var.f10173k = h00Var2;
                }
                ra0 ra0Var2 = na0Var.f8615m;
                synchronized (ra0Var2) {
                    yxVar = ra0Var2.f10176n;
                }
                bi0 e = na0Var.e("Google", true);
                if (e != null && yxVar != null) {
                    yxVar.b(e);
                    return;
                } else {
                    if (yxVar != null) {
                        yxVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 22:
                h00 h00Var3 = (h00) obj;
                yx yxVar2 = (yx) this.f8177v;
                if (h00Var3 != null) {
                    h00Var3.h1("/video", new cp(7, new or(yxVar2)));
                    h00Var3.s0();
                    return;
                }
                yxVar2.c(new cg0(1, "Missing webview from video view future."));
                return;
            case 24:
                ((gf0) obj).H = true;
                ((wf0) this.f8177v).f12229x.b();
                return;
            default:
                try {
                    ((dr0) this.f8177v).l((SQLiteDatabase) obj);
                    return;
                } catch (Exception e8) {
                    String valueOf = String.valueOf(e8.getMessage());
                    int i = k9.a0.f19634b;
                    l9.i.c("Error executing function on offline signal database: ".concat(valueOf));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        int i = this.f8176u;
        Object obj = this.f8177v;
        switch (i) {
            case 8:
                f9.k.C.f16817h.d("DefaultGmsgHandlers.attributionReportingManager", th);
                return;
            case 13:
                ((AtomicInteger) ((c2.b) obj).f3469c).set(-1);
                return;
            case 17:
                return;
            case gl.zzm /* 21 */:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10888p6)).booleanValue()) {
                    f9.k.C.f16817h.e("omid native display exp", th);
                    return;
                }
                return;
            case 22:
                int i10 = k9.a0.f19634b;
                l9.i.c("Failed to load media data due to video view load failure.");
                ((yx) obj).c(th);
                return;
            case 24:
                return;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i11 = k9.a0.f19634b;
                l9.i.c("Failed to get offline signal database: ".concat(valueOf));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn, com.google.android.gms.internal.ads.el0
    /* renamed from: zza */
    public void mo201zza() {
        switch (this.f8176u) {
            case 23:
                na0 na0Var = ((lc0) this.f8177v).f8010x;
                if (na0Var != null) {
                    synchronized (na0Var) {
                        na0Var.f8616n.H("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                wk0 wk0Var = (wk0) this.f8177v;
                synchronized (wk0Var) {
                    wk0Var.C = null;
                }
                return;
        }
    }

    private final void m(Throwable th) {
    }

    private final void n(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.qn
    public void s(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.y40
    /* renamed from: zza */
    public g9.z1 mo208zza() {
        try {
            return ((zs) ((gi0) this.f8177v).f6407b).d();
        } catch (RemoteException e) {
            throw new Exception(e);
        }
    }

    public /* synthetic */ lx0(Object obj, int i, Object obj2) {
        this.f8176u = i;
        this.f8177v = obj2;
    }

    public lx0(int i) {
        this.f8176u = i;
        switch (i) {
            case 12:
                this.f8177v = new WeakHashMap();
                return;
            default:
                this.f8177v = new HashMap();
                return;
        }
    }

    public lx0(Context context) {
        this.f8176u = 0;
        if (j6.s.f18979x == null) {
            j6.s.f18979x = new j6.s(context);
        }
        this.f8177v = j6.s.f18979x;
        hx0.d(context);
    }

    public lx0(Handler handler) {
        this.f8176u = 5;
        this.f8177v = new k0(this, handler);
    }

    public lx0(cr crVar, br brVar) {
        this.f8176u = 10;
        this.f8177v = brVar;
        Objects.requireNonNull(crVar);
    }

    public lx0(ac0 ac0Var, yx yxVar) {
        this.f8176u = 22;
        this.f8177v = yxVar;
        Objects.requireNonNull(ac0Var);
    }

    public /* synthetic */ lx0(int i, Object obj) {
        this.f8176u = i;
        this.f8177v = obj;
    }
}
