package com.google.android.gms.internal.ads;
import d.i;
import ee.a;
import f.a;
import l9.d;
import l9.i;
import a5.a;
import ba.p;
import ca.i;
import f.b;
import f9.k;
import g9.r;
import j6.s;
import j9.d;
import k9.a0;
import k9.c0;
import k9.f0;
import k9.z;
import m.f;
import r.e;
import ya.ee;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProfileStore;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5874v;

    public /* synthetic */ f(int i, Object obj) {
        this.f5873u = i;
        this.f5874v = obj;
    }

    private final void a() {
        gi giVar = (gi) this.f5874v;
        synchronized (giVar.f6402w) {
            if (giVar.f6403x.get() && giVar.f6404y) {
                giVar.f6403x.set(false);
                int i = k9.a0.f19634b;
                l9.i.a("App went background");
                ArrayList arrayList = giVar.f6405z;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((ii) obj).g0(false);
                    } catch (Exception e) {
                        l9.i.d("", e);
                    }
                }
            } else {
                int i11 = k9.a0.f19634b;
                l9.i.a("App is still foreground");
            }
        }
    }

    private final void b() {
        nb nbVar = (nb) this.f5874v;
        synchronized (nbVar) {
            try {
                mf mfVar = (mf) nbVar.f8636w;
                if (mfVar.f8336u) {
                    xh xhVar = (xh) mfVar.f8337v;
                    byte[] bArr = (byte[]) nbVar.f8635v;
                    vh vhVar = (vh) xhVar;
                    Parcel g22 = vhVar.g2();
                    g22.writeByteArray(bArr);
                    vhVar.v2(g22, 5);
                    vh vhVar2 = (vh) ((xh) mfVar.f8337v);
                    Parcel g23 = vhVar2.g2();
                    g23.writeInt(0);
                    vhVar2.v2(g23, 6);
                    xh xhVar2 = (xh) mfVar.f8337v;
                    int i = nbVar.f8634u;
                    vh vhVar3 = (vh) xhVar2;
                    Parcel g24 = vhVar3.g2();
                    g24.writeInt(i);
                    vhVar3.v2(g24, 7);
                    vh vhVar4 = (vh) ((xh) mfVar.f8337v);
                    Parcel g25 = vhVar4.g2();
                    g25.writeIntArray(null);
                    vhVar4.v2(g25, 4);
                    vh vhVar5 = (vh) ((xh) mfVar.f8337v);
                    vhVar5.v2(vhVar5.g2(), 3);
                }
            } catch (RemoteException e) {
                l9.i.b("Clearcut log failed", e);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f5874v;
        cVar.getClass();
        while (true) {
            try {
                wl wlVar = (wl) ((ArrayBlockingQueue) cVar.f13371v).take();
                vl b10 = wlVar.b();
                if (!TextUtils.isEmpty(b10.f11932a)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f13372w;
                    synchronized (wlVar.f12272c) {
                        f9.k.C.f16817h.a();
                        linkedHashMap = wlVar.f12271b;
                    }
                    cVar.f(cVar.e(linkedHashMap2, linkedHashMap), b10);
                }
            } catch (InterruptedException e) {
                int i = k9.a0.f19634b;
                l9.i.g("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void d() {
        g9.r rVar;
        long longValue;
        long intValue;
        boolean booleanValue;
        boolean z3;
        g9.r rVar2;
        long j10;
        long j11;
        long j12;
        boolean z9;
        long j13;
        long j14;
        long j15;
        oz ozVar = (oz) this.f5874v;
        String o10 = oz.o(ozVar.f9285y);
        try {
            nl nlVar = sl.f10755h0;
            rVar = g9.r.e;
            longValue = ((Long) rVar.f17698c.a(nlVar)).longValue() * 1000;
            intValue = ((Integer) rVar.f17698c.a(sl.A)).intValue();
            booleanValue = ((Boolean) rVar.f17698c.a(sl.f11010x2)).booleanValue();
        } catch (Exception e) {
            String str = ozVar.f9285y;
            String message = e.getMessage();
            String l10 = a5.a.l(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i = k9.a0.f19634b;
            l9.i.f(l10);
            f9.k.C.f16817h.e("VideoStreamExoPlayerCache.preload", e);
            ozVar.a();
            ozVar.m(ozVar.f9285y, o10, "error", oz.p(e, "error"));
        }
        synchronized (ozVar) {
            f9.k.C.f16819k.getClass();
            if (System.currentTimeMillis() - ozVar.C <= longValue) {
                if (!ozVar.f9286z) {
                    if (!ozVar.A) {
                        eu1 eu1Var = ozVar.f9284x.A;
                        if (eu1Var != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            long V1 = eu1Var.V1();
                            if (V1 > 0) {
                                long X1 = ozVar.f9284x.A.X1();
                                if (X1 != ozVar.D) {
                                    if (X1 > 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    String str2 = ozVar.f9285y;
                                    if (booleanValue) {
                                        wz wzVar = ozVar.f9284x;
                                        if (wzVar.M != null && wzVar.M.J) {
                                            j13 = 0;
                                        } else {
                                            j13 = wzVar.E;
                                        }
                                    } else {
                                        j13 = -1;
                                    }
                                    if (booleanValue) {
                                        j14 = ozVar.f9284x.q();
                                    } else {
                                        j14 = -1;
                                    }
                                    if (booleanValue) {
                                        j15 = ozVar.f9284x.r();
                                    } else {
                                        j15 = -1;
                                    }
                                    long j16 = j14;
                                    j10 = intValue;
                                    rVar2 = rVar;
                                    j12 = X1;
                                    j11 = V1;
                                    l9.d.f20036b.post(new ez(ozVar, str2, o10, X1, V1, j13, j16, j15, z9, wz.O.get(), wz.P.get()));
                                    ozVar.D = j12;
                                } else {
                                    rVar2 = rVar;
                                    j10 = intValue;
                                    j11 = V1;
                                    j12 = X1;
                                }
                                if (j12 >= j11) {
                                    l9.d.f20036b.post(new hz(ozVar, ozVar.f9285y, o10, j11));
                                } else if (ozVar.f9284x.E >= j10 && j12 > 0) {
                                }
                            } else {
                                rVar2 = rVar;
                            }
                            k9.f0.f19676l.postDelayed(new f(21, ozVar), ((Long) rVar2.f17698c.a(sl.f10770i0)).longValue());
                            return;
                        }
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    f9.k.C.A.f5226u.remove(ozVar.B);
                    return;
                }
                throw new IOException("Abort requested before buffering finished. ");
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(longValue).length() + 27);
            sb2.append("Timeout reached. Limit: ");
            sb2.append(longValue);
            sb2.append(" ms");
            throw new IOException(sb2.toString());
        }
    }

    private final void e() {
        boolean z3;
        zf0 zf0Var = (zf0) this.f5874v;
        zf0Var.getClass();
        try {
            k9.c0 c0Var = zf0Var.f13162d;
            c0Var.i();
            synchronized (c0Var.f19642a) {
                z3 = c0Var.E;
            }
            if (!z3) {
                yf0 yf0Var = zf0Var.f13160b;
                yf0Var.f12865b = new u(yf0Var.f12864a);
                yf0Var.a(new tf(zf0Var));
            }
        } catch (Exception e) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Q5)).booleanValue()) {
                if (zf0Var.f13163f == null) {
                    zf0Var.f13163f = pu.e(zf0Var.f13159a);
                }
                zf0Var.f13163f.c("InstallReferrerUnsampled.initializeAndReport", e);
            } else {
                if (zf0Var.e == null) {
                    zf0Var.e = pu.a(zf0Var.f13159a);
                }
                zf0Var.e.c("InstallReferrer.initializeAndReport", e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        String b10;
        be0 be0Var;
        ActivityManager.MemoryInfo i;
        String str;
        ProfileStore profileStore = null;
        boolean z9 = false;
        int i10 = 1;
        switch (this.f5873u) {
            case 0:
                ((p) this.f5874v).i();
                return;
            case 1:
                ((q0) this.f5874v).i.zza();
                return;
            case 2:
                g1 g1Var = (g1) this.f5874v;
                g1Var.f6248m--;
                return;
            case 3:
                n1 n1Var = (n1) this.f5874v;
                n1Var.f7916u.postVsyncCallback(n1Var);
                return;
            case 4:
                jf jfVar = (jf) this.f5874v;
                synchronized (jfVar.I) {
                    if (!jfVar.J) {
                        jfVar.J = true;
                        try {
                            jfVar.l();
                        } catch (Exception e) {
                            ((jf) this.f5874v).f7432z.c(2023, -1L, e);
                        }
                        jf jfVar2 = (jf) this.f5874v;
                        synchronized (jfVar2.I) {
                            jfVar2.J = false;
                        }
                        return;
                    }
                    return;
                }
            case 5:
                kf kfVar = (kf) this.f5874v;
                if (kfVar.f7728b == null) {
                    synchronized (kf.f7725c) {
                        if (kfVar.f7728b == null) {
                            try {
                                z3 = ((Boolean) sl.f10902q3.p()).booleanValue();
                            } catch (IllegalStateException unused) {
                                z3 = false;
                            }
                            if (z3) {
                                try {
                                    kf.f7726d = dw0.a(((kf) this.f5874v).f7727a.f5418a, "ADSHIELD");
                                } catch (Throwable unused2) {
                                }
                            }
                            z9 = z3;
                            ((kf) this.f5874v).f7728b = Boolean.valueOf(z9);
                            kf.f7725c.open();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                ((ig) this.f5874v).c();
                return;
            case 7:
                vg vgVar = (vg) this.f5874v;
                vgVar.getClass();
                try {
                    dg dgVar = vgVar.f11898a;
                    DexClassLoader dexClassLoader = dgVar.f5420c;
                    byte[] bArr = dgVar.e;
                    String str2 = vgVar.f11899b;
                    dgVar.f5421d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(s6.v(str2, bArr), "UTF-8"));
                    if (loadClass != null) {
                        byte[] bArr2 = dgVar.e;
                        String str3 = vgVar.f11900c;
                        vgVar.f11898a.f5421d.getClass();
                        vgVar.f11901d = loadClass.getMethod(new String(s6.v(str3, bArr2), "UTF-8"), vgVar.e);
                    }
                } catch (uf | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } catch (Throwable th) {
                    vgVar.f11902f.countDown();
                    throw th;
                }
                vgVar.f11902f.countDown();
                return;
            case 8:
                ((bi) this.f5874v).d(3);
                return;
            case 9:
                a();
                return;
            case 10:
                ((k60) this.f5874v).h();
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                bm bmVar = (bm) this.f5874v;
                Context context = bmVar.f4825w;
                if (bmVar.f4828z == null && context != null && (b10 = m.f.b(context)) != null && !b10.equals(context.getPackageName())) {
                    m.f.a(context, b10, bmVar);
                    return;
                }
                return;
            case 14:
                ((fm) this.f5874v).d();
                return;
            case 15:
                ca.i iVar = (ca.i) this.f5874v;
                if (((cj) iVar.f4043v) != null) {
                    ((cj) iVar.f4043v).o();
                    Binder.flushPendingCommands();
                    return;
                }
                return;
            case 16:
                ((AtomicBoolean) ((a8) this.f5874v).f4410z).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f5874v).getAndSet(true);
                return;
            case 18:
                tx txVar = (tx) this.f5874v;
                while (txVar.e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    k9.f0.f19676l.post(new f(17, atomicBoolean));
                    try {
                        Thread.sleep(txVar.f11483f);
                        if (!atomicBoolean.get()) {
                            nl nlVar = sl.f10975uf;
                            ql qlVar = g9.r.e.f17698c;
                            if (((Boolean) qlVar.a(nlVar)).booleanValue() && (be0Var = txVar.f11480b) != null) {
                                j6.s a10 = be0Var.a();
                                a10.k("action", "panr");
                                if (((Boolean) qlVar.a(sl.Wf)).booleanValue() && (i = l9.d.i(txVar.f11481c)) != null) {
                                    a10.k("mem_avl", String.valueOf(i.availMem));
                                    a10.k("mem_tt", String.valueOf(i.totalMem));
                                    if (true != i.lowMemory) {
                                        str = "0";
                                    } else {
                                        str = "1";
                                    }
                                    a10.k("low_m", str);
                                }
                                a10.n();
                            }
                            if (((Boolean) qlVar.a(sl.vf)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                ba.p pVar = new ba.p("Potential ANR detected", 3);
                                pVar.setStackTrace(stackTrace);
                                if (((Boolean) qlVar.a(sl.f11006wf)).booleanValue()) {
                                    pu.e(txVar.f11481c).d(pVar, "AnrWatchdog", ((Integer) qlVar.a(sl.f11022xf)).intValue() / 100.0f);
                                } else {
                                    f9.k.C.f16817h.d("AnrWatchdog", pVar);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(txVar.f11484g);
                            } catch (InterruptedException unused4) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 19:
                ((iy) this.f5874v).g();
                return;
            case 20:
                f9.k.C.A.f5226u.remove((bz) this.f5874v);
                return;
            case gl.zzm /* 21 */:
                d();
                return;
            case 22:
                q00 q00Var = ((x00) this.f5874v).f12390u;
                k9.z zVar = q00Var.f9696u.m0;
                zVar.f19733c = true;
                if (zVar.f19732b) {
                    zVar.b();
                }
                j9.d z02 = q00Var.f9696u.z0();
                if (z02 != null) {
                    z02.F.removeView(z02.f19068z);
                    z02.y4(true);
                    return;
                }
                return;
            case 23:
                int i11 = x00.f12387c0;
                com.google.android.gms.internal.consent_sdk.c a11 = f9.k.C.f16817h.a();
                String str4 = (String) this.f5874v;
                if (!((HashSet) a11.B).contains(str4)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdkVersion", (String) a11.A);
                    linkedHashMap.put("ue", str4);
                    a11.f(a11.e((LinkedHashMap) a11.f13372w, linkedHashMap), null);
                    return;
                }
                return;
            case 24:
                v80 v80Var = f9.k.C.f16832x;
                tt0 tt0Var = ((bi0) this.f5874v).f4801a;
                v80Var.getClass();
                v80.p(new xh0(tt0Var, i10));
                return;
            case 25:
                f10 f10Var = (f10) this.f5874v;
                be0 be0Var2 = f10Var.f5881b;
                f9.k.C.f16819k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c10 c10Var = f10Var.f5880a;
                c10Var.getClass();
                if (ya.ee.a("MULTI_PROFILE")) {
                    try {
                        profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e8) {
                        String valueOf = String.valueOf(e8.getMessage());
                        int i12 = k9.a0.f19634b;
                        l9.i.a("Unable to get ProfileStore instance: ".concat(valueOf));
                        try {
                            profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                            l9.i.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e10.getMessage())));
                        }
                    }
                    if (profileStore != null) {
                        c10Var.f4942a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                        if (((Boolean) g9.r.e.f17698c.a(sl.Df)).booleanValue()) {
                            f9.k.C.f16819k.getClass();
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            j6.s a12 = be0Var2.a();
                            a12.k("action", "webview_p_l");
                            a12.k("webview_p_l", Long.toString(elapsedRealtime2));
                            a12.l();
                            return;
                        }
                        return;
                    }
                    int i13 = k9.a0.f19634b;
                    l9.i.f("WebViewCompat failure: No instance");
                    if (((Boolean) g9.r.e.f17698c.a(sl.Df)).booleanValue()) {
                        j6.s a13 = be0Var2.a();
                        a13.k("action", "webview_p_f");
                        a13.k("webview_p_f", "No instance");
                        a13.l();
                        return;
                    }
                    return;
                }
                int i14 = k9.a0.f19634b;
                l9.i.a("WebViewFeature.MULTI_PROFILE is not supported");
                return;
            case 26:
                ((h10) this.f5874v).b();
                return;
            case 27:
                e();
                return;
            case 28:
                ((p30) this.f5874v).f9351v.f9728d.h();
                return;
            default:
                u30 u30Var = ((p30) this.f5874v).f9351v.f9728d;
                synchronized (u30Var) {
                    u30Var.a();
                    u30Var.C = true;
                }
                return;
        }
    }
}
