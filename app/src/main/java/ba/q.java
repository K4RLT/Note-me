package ba;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import c7.b0;
import c7.e0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.mlkit_vision_digital_ink.da;
import com.google.android.gms.internal.mlkit_vision_digital_ink.g2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ia;
import com.google.android.gms.internal.mlkit_vision_digital_ink.km;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.p0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.r0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.x0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ya;
import com.google.android.gms.internal.play_billing.t;
import fa.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import k9.a0;

/* loaded from: classes.dex */
public final class q implements da {

    /* renamed from: y, reason: collision with root package name */
    public static q f3156y;

    /* renamed from: u, reason: collision with root package name */
    public int f3157u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3158v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3159w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3160x;

    public q(h00 h00Var) {
        this.f3159w = h00Var.getLayoutParams();
        ViewParent parent = h00Var.getParent();
        this.f3158v = h00Var.h0();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f3160x = viewGroup;
            this.f3157u = viewGroup.indexOfChild(h00Var.U());
            viewGroup.removeView(h00Var.U());
            h00Var.m1(true);
            return;
        }
        throw new Exception("Could not get the parent of the WebView for an overlay.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ba.q] */
    public static synchronized q c(Context context) {
        q qVar;
        synchronized (q.class) {
            try {
                if (f3156y == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ma.a("MessengerIpcClient")));
                    Object obj = new Object();
                    obj.f3160x = new n(obj);
                    obj.f3157u = 1;
                    obj.f3159w = unconfigurableScheduledExecutorService;
                    obj.f3158v = context.getApplicationContext();
                    f3156y = obj;
                }
                qVar = f3156y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public Looper a() {
        Looper looper;
        Object obj = this.f3160x;
        synchronized (obj) {
            try {
                int i = this.f3157u;
                HandlerThread handlerThread = (HandlerThread) this.f3158v;
                if (i == 0) {
                    if (handlerThread == null) {
                        a0.k("Starting the looper thread.");
                        HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                        this.f3158v = handlerThread2;
                        handlerThread2.start();
                        this.f3159w = new bb.a(((HandlerThread) this.f3158v).getLooper(), 1);
                        a0.k("Looper thread started.");
                    } else {
                        a0.k("Resuming the looper thread");
                        obj.notifyAll();
                    }
                } else {
                    y.i(handlerThread, "Invalid state: handlerThread should already been initialized.");
                }
                this.f3157u++;
                looper = ((HandlerThread) this.f3158v).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void b(Throwable th) {
        boolean z3 = th instanceof TimeoutException;
        b0 b0Var = (b0) this.f3160x;
        if (z3) {
            b0Var.J(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 28, e0.f3945r);
            t.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            b0Var.J(95, 28, e0.f3945r);
            t.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f3159w).run();
    }

    public synchronized ib.o d(o oVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(oVar.toString()));
            }
            if (!((n) this.f3160x).d(oVar)) {
                n nVar = new n(this);
                this.f3160x = nVar;
                nVar.d(oVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return oVar.f3152b.f18363a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        r0 r0Var = (r0) this.f3158v;
        km kmVar = (km) this.f3159w;
        int i = this.f3157u;
        ArrayList arrayList = (ArrayList) this.f3160x;
        ya m4 = n5.m(kmVar);
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            if (((Boolean) n5.r((Future) arrayList.get(i11))).booleanValue()) {
                p0 p0Var = new p0(i10, (x0) ((List) r0Var.f14883b).get(i11));
                int i12 = g2.f14354a;
                m4 = n5.q(m4, new r0(q1.b(), 3, p0Var), ia.f14473u);
            }
        }
        return m4;
    }
}