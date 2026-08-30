package a6;
import j.i0;
import t.i;

import a0.f0;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.work.Worker;
import c7.e0;
import c7.i0;
import com.daren.scraply.R;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.dw;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.iq;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import eb.c1;
import eb.c3;
import eb.d1;
import eb.d3;
import eb.h3;
import eb.k0;
import eb.l3;
import eb.m0;
import eb.s0;
import eb.t0;
import eb.t1;
import eb.u0;
import eb.u2;
import eb.v2;
import eb.y2;
import eb.z2;
import g9.m2;
import g9.o2;
import g9.p2;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import k9.a0;
import k9.c0;
import ya.la;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f296u;

    /* renamed from: v, reason: collision with root package name */
    public Object f297v;

    public x(ea.i iVar, c7.x xVar) {
        this.f296u = 10;
        this.f297v = xVar;
    }

    private final void a() {
        c0 c0Var = (c0) this.f297v;
        if (c0Var.f19643b) {
            if ((c0Var.l() && c0Var.m()) || !((Boolean) om.f9160b.p()).booleanValue()) {
                return;
            }
            synchronized (c0Var.f19642a) {
                try {
                    if (Looper.getMainLooper() == null) {
                        return;
                    }
                    if (c0Var.e == null) {
                        c0Var.e = new ki();
                    }
                    ki kiVar = c0Var.e;
                    synchronized (kiVar.f7757w) {
                        try {
                            if (kiVar.f7755u) {
                                int i = a0.f19634b;
                                l9.i.a("Content hash thread already started, quitting...");
                            } else {
                                kiVar.f7755u = true;
                                kiVar.start();
                            }
                        } finally {
                        }
                    }
                    int i10 = a0.f19634b;
                    l9.i.e("start fetching content...");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [eb.d3, eb.q3] */
    @Override // java.lang.Runnable
    public final void run() {
        AdViewConstructorParams adViewConstructorParams;
        MediaViewApi mediaViewApi;
        MediaViewApi mediaViewApi2;
        AdViewConstructorParams adViewConstructorParams2;
        long j10;
        int i = 3;
        boolean z3 = false;
        int i10 = 1;
        switch (this.f296u) {
            case 0:
                Worker worker = (Worker) this.f297v;
                try {
                    worker.f1100y.j(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f1100y.l(th);
                    return;
                }
            case 1:
                if (((ib.h) this.f297v).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 2:
                c2.x xVar = (c2.x) this.f297v;
                xVar.removeCallbacks(this);
                MotionEvent motionEvent = xVar.M0;
                if (motionEvent != null) {
                    if (motionEvent.getToolType(0) == 3) {
                        z3 = true;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (z3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i11 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i11 = 2;
                    }
                    xVar.I(motionEvent, i11, xVar.N0, false);
                    return;
                }
                return;
            case 3:
                c7.c cVar = (c7.c) this.f297v;
                c7.f fVar = e0.f3938k;
                cVar.B(24, 3, fVar);
                fVar.getClass();
                return;
            case 4:
                try {
                    ((c7.c) ((iw) this.f297v).f14490w).A.y();
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.i("BillingClient", "Exception calling onBillingServiceDisconnected.", th2);
                    return;
                }
            case 5:
                c7.u uVar = (c7.u) this.f297v;
                c7.c cVar2 = uVar.f3996y;
                cVar2.u(0);
                c7.f fVar2 = e0.f3938k;
                cVar2.t(24, uVar.f3995x, fVar2);
                uVar.c(fVar2);
                return;
            case 6:
                MediaView mediaView = (MediaView) this.f297v;
                mediaView.removeAllViews();
                ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
                adViewConstructorParams = mediaView.mConstructorParams;
                mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
                mediaViewApi = mediaView.mMediaViewApi;
                mediaView.attachAdComponentViewApi(mediaViewApi);
                mediaViewApi2 = mediaView.mMediaViewApi;
                adViewConstructorParams2 = mediaView.mConstructorParams;
                mediaViewApi2.initialize(adViewConstructorParams2, mediaView);
                return;
            case 7:
                ((ea.l) this.f297v).e();
                return;
            case 8:
                da.c cVar3 = ((ea.l) ((pd.c) this.f297v).f22681u).f16017v;
                cVar3.d(cVar3.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 9:
                ((ea.u) this.f297v).B.d(new ca.b(4, null, null));
                return;
            case 10:
                throw null;
            case 11:
                ((h3) ((i0) this.f297v).f3971d).E();
                return;
            case 12:
                y2 y2Var = (y2) this.f297v;
                j6.c cVar4 = y2Var.f16466w;
                long j11 = y2Var.f16464u;
                long j12 = y2Var.f16465v;
                ((v2) cVar4.f18915w).u();
                v2 v2Var = (v2) cVar4.f18915w;
                d6 d6Var = v2Var.A;
                v2Var.f().H.g("Application going to the background");
                v2Var.s().O.a(true);
                v2Var.u();
                v2Var.f16441y = true;
                d1 d1Var = (d1) v2Var.f3443v;
                if (!d1Var.A.I()) {
                    if (d1Var.A.F(null, eb.v.G0)) {
                        d6Var.n(j12, false, false);
                        ((z2) d6Var.f5317w).a();
                    } else {
                        ((z2) d6Var.f5317w).a();
                        d6Var.n(j12, false, false);
                    }
                }
                v2Var.f().G.f(Long.valueOf(j11), "Application backgrounded at: timestamp_millis");
                return;
            case 13:
                h3 h3Var = (h3) this.f297v;
                h3Var.h().u();
                h3Var.E = new t0(h3Var);
                eb.i iVar = new eb.i(h3Var);
                iVar.z();
                h3Var.f16171w = iVar;
                eb.e Q = h3Var.Q();
                u0 u0Var = h3Var.f16169u;
                fa.y.h(u0Var);
                Q.f16114y = u0Var;
                u2 u2Var = new u2(h3Var);
                u2Var.z();
                h3Var.C = u2Var;
                d3 d3Var = new d3(h3Var);
                d3Var.z();
                h3Var.f16174z = d3Var;
                m0 m0Var = new m0(h3Var, i10);
                m0Var.z();
                h3Var.B = m0Var;
                c3 c3Var = new c3(h3Var);
                c3Var.z();
                h3Var.f16173y = c3Var;
                h3Var.f16172x = new i0(h3Var);
                if (h3Var.L != h3Var.M) {
                    h3Var.f().A.h("Not all upload components initialized", Integer.valueOf(h3Var.L), Integer.valueOf(h3Var.M));
                }
                h3Var.G = true;
                h3Var.h().u();
                eb.i iVar2 = h3Var.f16171w;
                h3.t(iVar2);
                iVar2.A0();
                eb.i iVar3 = h3Var.f16171w;
                h3.t(iVar3);
                iVar3.u();
                iVar3.y();
                if (iVar3.f0()) {
                    eb.c0 c0Var = eb.v.f16399f0;
                    if (((Long) c0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase B = iVar3.B();
                        ((d1) iVar3.f3443v).H.getClass();
                        int delete = B.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(c0Var.a(null))});
                        if (delete > 0) {
                            iVar3.f().I.f(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (h3Var.C.B.a() == 0) {
                    s0 s0Var = h3Var.C.B;
                    h3Var.zzb().getClass();
                    s0Var.b(System.currentTimeMillis());
                }
                h3Var.E();
                return;
            case 14:
                d1 d1Var2 = (d1) this.f297v;
                l3 l3Var = d1Var2.F;
                d1.b(l3Var);
                l3Var.u();
                if (l3Var.D0() == 1) {
                    t1 t1Var = d1Var2.J;
                    d1.c(t1Var);
                    c1 c1Var = new c1(i);
                    c1Var.f16084v = t1Var;
                    new Thread(c1Var).start();
                    return;
                }
                k0 k0Var = d1Var2.C;
                d1.d(k0Var);
                k0Var.D.g("registerTrigger called but app not eligible");
                return;
            case 15:
                ((f0) this.f297v).s();
                throw null;
            case 16:
                g9.x xVar2 = ((m2) this.f297v).f17676u.f17683u;
                if (xVar2 != null) {
                    try {
                        xVar2.w(1);
                        return;
                    } catch (RemoteException e) {
                        l9.i.g("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            case 17:
                g9.x xVar3 = ((o2) this.f297v).f17687u;
                if (xVar3 != null) {
                    try {
                        xVar3.w(1);
                        return;
                    } catch (RemoteException e8) {
                        l9.i.g("Could not notify onAdFailedToLoad event.", e8);
                        return;
                    }
                }
                return;
            case 18:
                iq iqVar = ((p2) this.f297v).f17694u;
                if (iqVar != null) {
                    try {
                        iqVar.f2(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e10) {
                        l9.i.g("Could not notify onComplete event.", e10);
                        return;
                    }
                }
                return;
            case 19:
                dw dwVar = (dw) this.f297v;
                if (dwVar != null) {
                    try {
                        dwVar.u(1);
                        return;
                    } catch (RemoteException e11) {
                        l9.i.i(e11, "#007 Could not call remote method.");
                        return;
                    }
                }
                return;
            case 20:
                hb.a aVar = (hb.a) this.f297v;
                synchronized (aVar.f17991a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f17998j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f17993c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case gl.zzm /* 21 */:
                synchronized (((ib.l) this.f297v).f18378w) {
                    try {
                        ib.b bVar = (ib.b) ((ib.l) this.f297v).f18379x;
                        if (bVar != null) {
                            bVar.a();
                        }
                    } finally {
                    }
                }
                return;
            case 22:
                break;
            case 23:
                j9.b bVar2 = (j9.b) this.f297v;
                if (bVar2.B) {
                    bVar2.f19060w.finish();
                    return;
                }
                return;
            case 24:
                ((j9.d) this.f297v).v4();
                return;
            case 25:
                c1.a aVar2 = (c1.a) this.f297v;
                Thread.currentThread();
                aVar2.getClass();
                aVar2.q();
                return;
            case 26:
                a();
                return;
            case 27:
                ((ThreadLocal) ((nd.o) this.f297v).f21274x).set(Boolean.TRUE);
                return;
            case 28:
                i0 i0Var = (i0) this.f297v;
                Activity activity = (Activity) i0Var.f18636v;
                View view = (View) i0Var.f18638x;
                if (view != null) {
                    if (activity.isInPictureInPictureMode()) {
                        i0Var.N();
                        return;
                    }
                    try {
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (la.b(activity) * 0.6f));
                            if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                                layoutParams.width = la.a(activity, 640);
                            } else {
                                layoutParams.width = -1;
                            }
                            ((WindowManager) i0Var.f18637w).updateViewLayout(view, layoutParams);
                            Log.i("HsdpLoadingPanel", "updateLoadingView: updated window size.");
                            return;
                        }
                        return;
                    } catch (RuntimeException e12) {
                        Log.e("HsdpLoadingPanel", "updateLoadingView: error updating window size.", e12);
                        return;
                    }
                }
                return;
            default:
                qb.l lVar = (qb.l) ((c7.a0) this.f297v).f3898v;
                if (lVar.f23655k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    IInterface iInterface = lVar.f23655k;
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath(lVar.i, 0);
                    lVar.f23655k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    lVar.b();
                }
                lVar.f23651f = false;
                return;
        }
        while (true) {
            ig.g gVar = (ig.g) this.f297v;
            long nanoTime = System.nanoTime();
            synchronized (gVar) {
                try {
                    Iterator it = gVar.f18501d.iterator();
                    long j13 = Long.MIN_VALUE;
                    int i12 = 0;
                    int i13 = 0;
                    lg.b bVar3 = null;
                    while (it.hasNext()) {
                        lg.b bVar4 = (lg.b) it.next();
                        if (gVar.a(bVar4, nanoTime) > 0) {
                            i13++;
                        } else {
                            i12++;
                            long j14 = nanoTime - bVar4.f20383o;
                            if (j14 > j13) {
                                j13 = j14;
                                bVar3 = bVar4;
                            }
                        }
                    }
                    j10 = gVar.f18499b;
                    if (j13 < j10 && i12 <= gVar.f18498a) {
                        if (i12 > 0) {
                            j10 -= j13;
                        } else if (i13 <= 0) {
                            gVar.f18502f = false;
                            j10 = -1;
                        }
                    }
                    gVar.f18501d.remove(bVar3);
                    jg.b.e(bVar3.e);
                    j10 = 0;
                } finally {
                }
            }
            if (j10 == -1) {
                return;
            }
            if (j10 > 0) {
                long j15 = j10 / 1000000;
                long j16 = j10 - (1000000 * j15);
                synchronized (((ig.g) this.f297v)) {
                    try {
                        ((ig.g) this.f297v).wait(j15, (int) j16);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public /* synthetic */ x(int i, Object obj) {
        this.f296u = i;
        this.f297v = obj;
    }

    public /* synthetic */ x(int i) {
        this.f296u = i;
    }

    public /* synthetic */ x(Object obj, int i, Object obj2) {
        this.f296u = i;
        this.f297v = obj;
    }

    public x(i0 i0Var, boolean z3) {
        this.f296u = 11;
        this.f297v = i0Var;
    }
}