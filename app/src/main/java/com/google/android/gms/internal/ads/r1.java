package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10051u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f10052v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f10053w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10054x;

    public r1(ki kiVar, fi fiVar, WebView webView, boolean z3) {
        this.f10051u = 2;
        this.f10053w = webView;
        this.f10054x = kiVar;
        this.f10052v = new ji(this, fiVar, webView, z3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ib ibVar;
        final int i = 1;
        final int i10 = 0;
        switch (this.f10051u) {
            case 0:
                j6.s sVar = (j6.s) this.f10052v;
                mw1 mw1Var = (mw1) this.f10053w;
                is1 is1Var = (is1) this.f10054x;
                sVar.getClass();
                String str = bq0.f4860a;
                ku1 ku1Var = ((rs1) sVar.f18982w).f10282u.L;
                gu1 u9 = ku1Var.u();
                ku1Var.p(u9, 1017, new zq0(u9, mw1Var, is1Var));
                return;
            case 1:
                gb gbVar = (gb) this.f10052v;
                synchronized (gbVar.f6357y) {
                }
                d dVar = (d) this.f10053w;
                jb jbVar = (jb) dVar.f5232x;
                if (jbVar == null) {
                    gbVar.i(dVar.f5230v);
                } else {
                    synchronized (gbVar.f6357y) {
                        ibVar = gbVar.f6358z;
                    }
                    ibVar.e(jbVar);
                }
                if (dVar.f5229u) {
                    gbVar.a("intermediate-response");
                } else {
                    gbVar.b("done");
                }
                Runnable runnable = (Runnable) this.f10054x;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ji jiVar = (ji) this.f10052v;
                WebView webView = (WebView) this.f10053w;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", jiVar);
                        return;
                    } catch (Throwable unused) {
                        jiVar.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                ly lyVar = ((hy) this.f10054x).K;
                if (lyVar != null) {
                    lyVar.c("error", "what", (String) this.f10052v, "extra", (String) this.f10053w);
                    return;
                }
                return;
            case 4:
                ((s00) this.f10052v).B((String) this.f10053w, (ValueCallback) this.f10054x);
                return;
            case 5:
                f10 f10Var = (f10) this.f10052v;
                Context context = (Context) this.f10053w;
                l9.a aVar = (l9.a) this.f10054x;
                f9.k kVar = f9.k.C;
                kVar.f16819k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                kVar.f16813c.E(context, aVar.f20029u);
                nl nlVar = sl.f11053zf;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    kVar.f16819k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    j6.s a10 = f10Var.f5881b.a();
                    a10.k("action", "webview_startup_l");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length());
                    sb2.append(elapsedRealtime2);
                    a10.k("webview_startup_l", sb2.toString());
                    a10.l();
                }
                if (((Boolean) rVar.f17698c.a(sl.Ff)).booleanValue()) {
                    xx.f12655f.execute(new f(25, f10Var));
                    return;
                }
                return;
            case 6:
                ((xs0) this.f10052v).b((String) this.f10053w, (ic.c) this.f10054x, null, null);
                return;
            case 7:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f10052v;
                String str2 = (String) this.f10053w;
                l9.l lVar = (l9.l) this.f10054x;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                rh0.k(sQLiteDatabase, lVar);
                return;
            case 8:
                wj0.c((wp0) this.f10052v, (qp0) this.f10053w, (gi0) this.f10054x);
                return;
            case 9:
                ft0 ft0Var = (ft0) this.f10052v;
                at0 at0Var = (at0) this.f10053w;
                dt0 dt0Var = (dt0) this.f10054x;
                if (ft0Var.f6161b.compareAndSet(false, true)) {
                    at0Var.b(dt0Var, true);
                    return;
                }
                return;
            case 10:
                c11 c11Var = (c11) this.f10052v;
                HashMap hashMap = (HashMap) this.f10053w;
                Context context2 = (Context) this.f10054x;
                hashMap.putAll(c11Var.e.a());
                c11Var.f(hashMap);
                hashMap.put("f", "q");
                hashMap.put("ctx", context2);
                return;
            case 11:
                s21 s21Var = (s21) this.f10052v;
                m21 m21Var = (m21) this.f10053w;
                z5.h hVar = (z5.h) this.f10054x;
                String str3 = s21Var.f10470b;
                try {
                    bj0 bj0Var = s21Var.f10469a;
                    if (bj0Var != null) {
                        l21 l21Var = (l21) bj0Var.D;
                        if (l21Var != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("callerPackage", str3);
                            String str4 = m21Var.f8211a;
                            if (!s21.b(str4)) {
                                str4.getClass();
                                bundle.putString("sessionToken", str4.trim());
                            }
                            String str5 = m21Var.f8212b;
                            if (!s21.b(str5)) {
                                str5.getClass();
                                bundle.putString("appId", str5.trim());
                            }
                            r21 r21Var = new r21(s21Var, hVar);
                            j21 j21Var = (j21) l21Var;
                            Parcel g22 = j21Var.g2();
                            qh.c(g22, bundle);
                            qh.e(g22, r21Var);
                            j21Var.o3(g22, 2);
                            return;
                        }
                        return;
                    }
                    throw null;
                } catch (RemoteException e) {
                    s21.f10467c.e(e, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 12:
                s21 s21Var2 = (s21) this.f10052v;
                o21 o21Var = (o21) this.f10053w;
                z5.h hVar2 = (z5.h) this.f10054x;
                String str6 = s21Var2.f10470b;
                try {
                    bj0 bj0Var2 = s21Var2.f10469a;
                    if (bj0Var2 != null) {
                        l21 l21Var2 = (l21) bj0Var2.D;
                        if (l21Var2 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("callerPackage", str6);
                            bundle2.putBinder("windowToken", o21Var.f8926a);
                            String str7 = o21Var.f8930f;
                            if (!s21.b(str7)) {
                                str7.getClass();
                                bundle2.putString("adFieldEnifd", str7.trim());
                            }
                            bundle2.putInt("layoutGravity", o21Var.f8928c);
                            bundle2.putFloat("layoutVerticalMargin", o21Var.f8929d);
                            bundle2.putInt("displayMode", 0);
                            bundle2.putInt("triggerMode", 0);
                            bundle2.putInt("theme", 0);
                            bundle2.putInt("windowWidthPx", o21Var.e);
                            if (s21.b(null)) {
                                if (s21.b(null)) {
                                    String str8 = o21Var.f8927b;
                                    if (!s21.b(str8)) {
                                        str8.getClass();
                                        bundle2.putString("appId", str8.trim());
                                    }
                                    if (s21.b(null)) {
                                        bundle2.putBoolean("stableSessionToken", true);
                                        r21 r21Var2 = new r21(s21Var2, hVar2);
                                        j21 j21Var2 = (j21) l21Var2;
                                        Parcel g23 = j21Var2.g2();
                                        g23.writeString(str6);
                                        qh.c(g23, bundle2);
                                        qh.e(g23, r21Var2);
                                        j21Var2.o3(g23, 1);
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        return;
                    }
                    throw null;
                } catch (RemoteException e8) {
                    s21.f10467c.e(e8, "show overlay display from: %s", str6);
                    return;
                }
            case 13:
                nt1 nt1Var = (nt1) this.f10052v;
                a51 a51Var = (a51) this.f10053w;
                yx1 yx1Var = (yx1) this.f10054x;
                ku1 ku1Var2 = nt1Var.f8852c;
                y51 f10 = a51Var.f();
                eu1 eu1Var = ku1Var2.f7886g;
                eu1Var.getClass();
                k60 k60Var = ku1Var2.f7884d;
                k60Var.getClass();
                k60Var.f7667b = d51.u(f10);
                if (!f10.isEmpty()) {
                    k60Var.e = (yx1) f10.get(0);
                    yx1Var.getClass();
                    k60Var.f7670f = yx1Var;
                }
                if (((yx1) k60Var.f7669d) == null) {
                    k60Var.f7669d = k60.m(eu1Var, (d51) k60Var.f7667b, (yx1) k60Var.e, (qg) k60Var.f7666a);
                }
                k60Var.k(eu1Var.J1());
                return;
            case 14:
                Pair pair = (Pair) this.f10053w;
                ((ku1) ((rt1) this.f10052v).f10290b.D).g(((Integer) pair.first).intValue(), (yx1) pair.second, (vx1) this.f10054x);
                return;
            case 15:
                mu muVar = (mu) this.f10052v;
                mw1 mw1Var2 = (mw1) this.f10053w;
                is1 is1Var2 = (is1) this.f10054x;
                muVar.getClass();
                String str9 = bq0.f4860a;
                ku1 ku1Var3 = ((rs1) muVar.f8423w).f10282u.L;
                gu1 u10 = ku1Var3.u();
                ku1Var3.p(u10, 1009, new bl0(u10, mw1Var2, is1Var2));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f10052v;
                Handler handler = (Handler) this.f10053w;
                final ig0 ig0Var = (ig0) this.f10054x;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pv1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        ig0 ig0Var2 = ig0Var;
                                        ig0Var2.getClass();
                                        if (Thread.currentThread() == ig0Var2.f7131a) {
                                            ig0Var2.c(-1, iu1.f7225v);
                                            ig0Var2.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ig0 ig0Var3 = ig0Var;
                                        ig0Var3.getClass();
                                        if (Thread.currentThread() == ig0Var3.f7131a) {
                                            ig0Var3.c(-1, iu1.f7225v);
                                            ig0Var3.d();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    synchronized (tv1.f11453o) {
                        try {
                            int i11 = tv1.f11455q - 1;
                            tv1.f11455q = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = tv1.f11454p;
                                if (scheduledExecutorService != null) {
                                    scheduledExecutorService.shutdown();
                                    tv1.f11454p = null;
                                } else {
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pv1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        ig0 ig0Var2 = ig0Var;
                                        ig0Var2.getClass();
                                        if (Thread.currentThread() == ig0Var2.f7131a) {
                                            ig0Var2.c(-1, iu1.f7225v);
                                            ig0Var2.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ig0 ig0Var3 = ig0Var;
                                        ig0Var3.getClass();
                                        if (Thread.currentThread() == ig0Var3.f7131a) {
                                            ig0Var3.c(-1, iu1.f7225v);
                                            ig0Var3.d();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    synchronized (tv1.f11453o) {
                        try {
                            int i12 = tv1.f11455q - 1;
                            tv1.f11455q = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = tv1.f11454p;
                                if (scheduledExecutorService2 != null) {
                                    scheduledExecutorService2.shutdown();
                                    tv1.f11454p = null;
                                } else {
                                    throw null;
                                }
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public /* synthetic */ r1(int i, Object obj, Object obj2, Object obj3) {
        this.f10051u = i;
        this.f10052v = obj;
        this.f10053w = obj2;
        this.f10054x = obj3;
    }

    public r1(hy hyVar, String str, String str2) {
        this.f10051u = 3;
        this.f10052v = str;
        this.f10053w = str2;
        this.f10054x = hyVar;
    }
}
