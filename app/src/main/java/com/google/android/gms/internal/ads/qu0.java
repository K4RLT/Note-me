package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qu0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9992u;

    /* renamed from: v, reason: collision with root package name */
    public Object f9993v;

    public qu0(vu0 vu0Var) {
        this.f9992u = 1;
        Objects.requireNonNull(vu0Var);
        this.f9993v = vu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ac.b bVar;
        Object obj;
        boolean z3 = false;
        Object[] objArr = 0;
        switch (this.f9992u) {
            case 0:
                ((WebView) this.f9993v).destroy();
                return;
            case 1:
                j6.l lVar = ((vu0) this.f9993v).e;
                lVar.getClass();
                wu0 wu0Var = new wu0(lVar);
                zd1 zd1Var = (zd1) lVar.f18934w;
                wu0Var.f12334a = zd1Var;
                ArrayDeque arrayDeque = (ArrayDeque) zd1Var.f13143w;
                arrayDeque.add(wu0Var);
                if (((wu0) zd1Var.f13144x) == null) {
                    wu0 wu0Var2 = (wu0) arrayDeque.poll();
                    zd1Var.f13144x = wu0Var2;
                    if (wu0Var2 != null) {
                        wu0Var2.executeOnExecutor((ThreadPoolExecutor) zd1Var.f13142v, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ib.h hVar = (ib.h) this.f9993v;
                gw0 gw0Var = new gw0();
                Log.d("GASS", "Clearcut logging disabled");
                hVar.b(new dw0(gw0Var));
                return;
            case 3:
                ((HttpURLConnection) this.f9993v).disconnect();
                return;
            case 4:
                i01 i01Var = (i01) this.f9993v;
                p01 p01Var = (p01) i01Var.f6949a.zzb();
                long j10 = i01Var.e;
                if (j10 > 0) {
                    p01Var.e.a(new qu0(5, p01Var), j10);
                    return;
                } else {
                    p01Var.a();
                    return;
                }
            case 5:
                ((p01) this.f9993v).a();
                return;
            case 6:
                a21 a21Var = (a21) this.f9993v;
                ac.b j11 = a21Var.f4327d.j(new bo0(9, a21Var));
                a21Var.f4326c.e(53, j11);
                a21Var.f4329g = j11;
                return;
            case 7:
                b21 b21Var = (b21) this.f9993v;
                sf sfVar = new sf(4, b21Var);
                try {
                    Object systemService = b21Var.f4698a.getSystemService("connectivity");
                    if (systemService != null) {
                        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(sfVar);
                        return;
                    }
                    throw null;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                f21 f21Var = (f21) this.f9993v;
                jg jgVar = new jg(1, f21Var);
                try {
                    Object systemService2 = f21Var.f5893a.getSystemService("appops");
                    if (systemService2 != null) {
                        ((AppOpsManager) systemService2).startWatchingActive(f21.f5892g, f21Var.f5894b, jgVar);
                        return;
                    }
                    throw null;
                } catch (Throwable unused2) {
                    return;
                }
            case 9:
                bj0 bj0Var = ((t21) this.f9993v).f11230u;
                ((w91) bj0Var.f4807x).b("unlinkToDeath", new Object[0]);
                l21 l21Var = (l21) bj0Var.D;
                l21Var.getClass();
                l21Var.asBinder().unlinkToDeath((u21) bj0Var.B, 0);
                bj0Var.D = null;
                bj0Var.f4804u = false;
                return;
            case 10:
                bj0 bj0Var2 = (bj0) this.f9993v;
                if (((l21) bj0Var2.D) != null) {
                    ((w91) bj0Var2.f4807x).b("Unbind from service.", new Object[0]);
                    Context context = (Context) bj0Var2.f4805v;
                    t21 t21Var = (t21) bj0Var2.C;
                    t21Var.getClass();
                    context.unbindService(t21Var);
                    bj0Var2.f4804u = false;
                    bj0Var2.D = null;
                    bj0Var2.C = null;
                    ArrayList arrayList = (ArrayList) bj0Var2.f4809z;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    return;
                }
                return;
            case 11:
                f91 f91Var = (f91) this.f9993v;
                if (f91Var != null && (bVar = f91Var.B) != null) {
                    this.f9993v = null;
                    if (bVar.isDone()) {
                        f91Var.o(bVar);
                        return;
                    }
                    try {
                        ScheduledFuture scheduledFuture = f91Var.C;
                        f91Var.C = null;
                        String str = "Timed out";
                        if (scheduledFuture != null) {
                            try {
                                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                                if (abs > 10) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(abs).length() + 55);
                                    sb2.append("Timed out (timeout delayed by ");
                                    sb2.append(abs);
                                    sb2.append(" ms after scheduled time)");
                                    str = sb2.toString();
                                }
                            } catch (Throwable th) {
                                f91Var.e(new e91(str, 0));
                                throw th;
                            }
                        }
                        String obj2 = bVar.toString();
                        StringBuilder sb3 = new StringBuilder(str.length() + 2 + obj2.length());
                        sb3.append(str);
                        sb3.append(": ");
                        sb3.append(obj2);
                        f91Var.e(new e91(sb3.toString(), 0));
                        return;
                    } finally {
                        bVar.cancel(true);
                    }
                }
                return;
            case 12:
                ys1 ys1Var = (ys1) this.f9993v;
                String str2 = bq0.f4860a;
                int generateAudioSessionId = xy.p(ys1Var.f12961z).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                b2.d2 d2Var = ys1Var.U;
                io0 io0Var = (io0) d2Var.f1438c;
                Looper myLooper = Looper.myLooper();
                if (myLooper == io0Var.f7185a.getLooper()) {
                    obj = d2Var.e;
                } else {
                    if (myLooper == ((io0) d2Var.f1437b).f7185a.getLooper()) {
                        z3 = true;
                    }
                    b80.K(z3);
                    obj = d2Var.f1440f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    d2Var.f1440f = valueOf;
                    ac.a aVar = new ac.a(d2Var, 13, valueOf);
                    io0 io0Var2 = (io0) d2Var.f1438c;
                    if (io0Var2.f7185a.getLooper().getThread().isAlive()) {
                        io0Var2.e(aVar);
                    }
                    ys1Var.k2(1, valueOf, 10);
                    ys1Var.k2(2, valueOf, 10);
                    return;
                }
                return;
            case 13:
                ku1 ku1Var = ((et1) this.f9993v).P;
                ku1Var.p(ku1Var.r(), 1034, new tn1(26, (byte) (objArr == true ? 1 : 0)));
                return;
            case 14:
                xt1 xt1Var = (xt1) this.f9993v;
                try {
                    synchronized (xt1Var) {
                    }
                    try {
                        xt1Var.f12624a.b(xt1Var.f12626c, xt1Var.f12627d);
                        xt1Var.b(true);
                        return;
                    } catch (Throwable th2) {
                        xt1Var.b(true);
                        throw th2;
                    }
                } catch (ns1 e) {
                    x21.P("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    g5.q.k(e);
                    return;
                }
            case 15:
                ku1 ku1Var2 = (ku1) this.f9993v;
                ku1Var2.p(ku1Var2.r(), 1028, new iu1(18));
                ku1Var2.f7885f.e();
                return;
            case 16:
                ((pu) this.f9993v).l();
                return;
            case 17:
                cw1 cw1Var = (cw1) this.f9993v;
                if (cw1Var.V >= 300000) {
                    ((ew1) cw1Var.f5197l.f8135v).f5843j1 = true;
                    cw1Var.V = 0L;
                    return;
                }
                return;
            default:
                qw1 qw1Var = (qw1) this.f9993v;
                Object obj3 = qw1Var.f9998a;
                synchronized (obj3) {
                    try {
                        if (!qw1Var.f10008m) {
                            long j12 = qw1Var.f10007l - 1;
                            qw1Var.f10007l = j12;
                            if (j12 <= 0) {
                                if (j12 < 0) {
                                    IllegalStateException illegalStateException = new IllegalStateException();
                                    synchronized (obj3) {
                                        qw1Var.f10009n = illegalStateException;
                                    }
                                    return;
                                }
                                qw1Var.a();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ qu0(int i, Object obj) {
        this.f9992u = i;
        this.f9993v = obj;
    }

    public /* synthetic */ qu0(et1 et1Var, int i) {
        this.f9992u = 13;
        this.f9993v = et1Var;
    }

    public qu0(ru0 ru0Var) {
        this.f9992u = 0;
        this.f9993v = ru0Var.e;
    }

    public /* synthetic */ qu0() {
        this.f9992u = 11;
    }
}
