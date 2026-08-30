package com.google.android.gms.internal.ads;
import a0.k;
import ac.b;
import ca.b;
import fa.b;
import fa.c;
import g9.r;
import k9.a0;
import l9.i;
import p9.b;
import r.e;
import tf.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.DeadObjectException;
import android.os.Parcel;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tf implements r0, b71, qb, nv0, fa.b, fa.c, ay, zx, p9.b, s81, n80, a10, xg0, s90 {

    /* renamed from: w, reason: collision with root package name */
    public static final tn1 f11337w = new tn1(1, (byte) 0);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11338u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11339v;

    public tf(int i) {
        this.f11338u = i;
        switch (i) {
            case 14:
                this.f11339v = new AtomicBoolean(false);
                return;
            default:
                int i10 = em1.f5727a;
                this.f11339v = new zq0(10, new zn1[]{s6.C, f11337w});
                return;
        }
    }

    public static tf c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        tf tfVar = new tf(0, false);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new sf(0, tfVar));
                return tfVar;
            } catch (RuntimeException unused) {
                synchronized (tf.class) {
                    tfVar.f11339v = null;
                }
            }
        }
        return tfVar;
    }

    @Override // fa.b
    public void R(int i) {
        k60 k60Var = (k60) this.f11339v;
        synchronized (k60Var.f7669d) {
            k60Var.f7670f = null;
            k60Var.f7669d.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public /* synthetic */ ac.b a(dv dvVar) {
        return ((eh0) ((pr1) ((zd1) this.f11339v).f13144x).zzb()).x4(dvVar.B);
    }

    @Override // com.google.android.gms.internal.ads.b71
    public /* synthetic */ void b(long j10, xk0 xk0Var) {
        ay0.o(j10, xk0Var, (i3[]) ((zd1) this.f11339v).f13143w);
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public void d(String str, long j10, int i) {
        ((cv0) this.f11339v).e(i, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public void f(int i, long j10) {
        ((cv0) this.f11339v).b(i, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.r0
    public void g(float f10) {
        y0 y0Var = (y0) this.f11339v;
        o1 o1Var = y0Var.f12678c1.f7273b;
        if (o1Var.e != f10) {
            o1Var.e = f10;
            o1Var.b(false);
        }
        y0Var.j0(y0Var.f13301h0);
    }

    @Override // fa.b
    public void g0() {
        k60 k60Var = (k60) this.f11339v;
        synchronized (k60Var.f7669d) {
            try {
                cj cjVar = (cj) k60Var.e;
                if (cjVar != null) {
                    k60Var.f7670f = (ej) cjVar.t();
                }
            } catch (DeadObjectException e) {
                int i = k9.a0.f19634b;
                l9.i.d("Unable to obtain a cache service instance.", e);
                ((k60) this.f11339v).h();
            }
            ((k60) this.f11339v).f7669d.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.a10
    public /* synthetic */ void h(String str, int i, String str2, boolean z3) {
        ((fj) this.f11339v).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x00e9, TRY_ENTER, TryCatch #1 {Exception -> 0x00e9, blocks: (B:3:0x0008, B:10:0x0020, B:12:0x002d, B:14:0x0032, B:16:0x0036, B:18:0x003c, B:20:0x0044, B:22:0x00b6, B:23:0x00c8, B:25:0x00d6, B:29:0x00eb, B:31:0x00f7, B:32:0x0109, B:34:0x012d, B:35:0x0140), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tf.i(int):void");
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f11338u) {
            case 10:
                dr drVar = (dr) this.f11339v;
                drVar.getClass();
                h00 h00Var = ((uq) obj).f11699u;
                if (h00Var == null || h00Var.o0()) {
                    drVar.f5483b = 1;
                    return;
                }
                return;
            case 16:
                ((m70) obj).C((z40) this.f11339v);
                return;
            case 17:
                ((a80) obj).r((dv) this.f11339v);
                return;
            case 18:
                ((k80) obj).B((nk) this.f11339v);
                return;
            default:
                ((xp) obj).K((qv) this.f11339v);
                return;
        }
    }

    public void m(long j10) {
        k60 k60Var = new k60("creation");
        k60Var.f7666a = Long.valueOf(j10);
        k60Var.f7668c = "nativeObjectNotCreated";
        n(k60Var);
    }

    public void n(k60 k60Var) {
        String b10 = k60Var.b();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(b10);
        int i = k9.a0.f19634b;
        l9.i.e(concat);
        yp ypVar = (yp) this.f11339v;
        Parcel g22 = ypVar.g2();
        g22.writeString(b10);
        ypVar.v2(g22, 1);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        switch (this.f11338u) {
            case 13:
                mw.f8437l.remove((ac.b) this.f11339v);
                return;
            case 15:
                ((i50) this.f11339v).f6992f.w(true);
                return;
            case 22:
                ((h00) obj).b("sendMessageToNativeJs", (Map) this.f11339v);
                return;
            case 25:
                ((tg0) this.f11339v).f11344c.S((wp0) obj);
                return;
            default:
                try {
                    ((dr0) this.f11339v).l((SQLiteDatabase) obj);
                    return;
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    int i = k9.a0.f19634b;
                    l9.i.c("Error executing function on offline buffered ping database: ".concat(valueOf));
                    return;
                }
        }
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        ((yx) this.f11339v).c(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f11338u) {
            case 13:
                mw.f8437l.remove((ac.b) this.f11339v);
                return;
            case 15:
                ((i50) this.f11339v).f6992f.w(false);
                return;
            case 22:
            case 25:
                return;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i = k9.a0.f19634b;
                l9.i.c("Failed to get offline buffered ping database: ".concat(valueOf));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zx
    /* renamed from: zza, reason: collision with other method in class */
    public void mo212zza() {
        k9.a0.k("Rejecting reference for JS Engine.");
        boolean booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.C8)).booleanValue();
        br brVar = (br) this.f11339v;
        if (booleanValue) {
            brVar.k("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
        } else {
            brVar.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f11339v;
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    public /* synthetic */ tf(int i, boolean z3) {
        this.f11338u = i;
    }

    @Override // com.google.android.gms.internal.ads.qb
    public File zza() {
        return (File) this.f11339v;
    }

    public /* synthetic */ tf(Object obj, int i, Object obj2) {
        this.f11338u = i;
        this.f11339v = obj2;
    }

    public /* synthetic */ tf(int i, Object obj) {
        this.f11338u = i;
        this.f11339v = obj;
    }

    public tf(cr crVar, br brVar) {
        this.f11338u = 11;
        this.f11339v = brVar;
        Objects.requireNonNull(crVar);
    }

    public tf(mw mwVar, ac.b bVar) {
        this.f11338u = 13;
        this.f11339v = bVar;
        Objects.requireNonNull(mwVar);
    }

    public tf(rc0 rc0Var, Map map) {
        this.f11338u = 22;
        this.f11339v = map;
        Objects.requireNonNull(rc0Var);
    }

    public tf(zf0 zf0Var) {
        this.f11338u = 24;
        Objects.requireNonNull(zf0Var);
        this.f11339v = zf0Var;
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
    }
}
