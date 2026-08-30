package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ml;
import eb.d1;
import eb.f1;
import eb.h3;
import eb.k0;
import eb.w2;
import t4.a;
import z5.h;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements w2 {

    /* renamed from: u, reason: collision with root package name */
    public h f15570u;

    @Override // eb.w2
    public final void a(Intent intent) {
        SparseArray sparseArray = a.f25641a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f25641a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // eb.w2
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final h c() {
        if (this.f15570u == null) {
            this.f15570u = new h(11, this);
        }
        return this.f15570u;
    }

    @Override // eb.w2
    public final boolean e(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h c10 = c();
        if (intent == null) {
            c10.x().A.g("onBind called with null intent");
            return null;
        }
        c10.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new f1(h3.e((Service) c10.f31922v));
        }
        c10.x().D.f(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        k0 k0Var = d1.a((Service) c().f31922v, null, null).C;
        d1.d(k0Var);
        k0Var.I.g("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        k0 k0Var = d1.a((Service) c().f31922v, null, null).C;
        d1.d(k0Var);
        k0Var.I.g("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        h c10 = c();
        if (intent == null) {
            c10.x().A.g("onRebind called with null intent");
            return;
        }
        c10.getClass();
        c10.x().I.f(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        h c10 = c();
        k0 k0Var = d1.a((Service) c10.f31922v, null, null).C;
        d1.d(k0Var);
        if (intent == null) {
            k0Var.D.g("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        k0Var.I.h("Local AppMeasurementService called. startId, action", Integer.valueOf(i10), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            ml mlVar = new ml(2);
            mlVar.f14667w = c10;
            mlVar.f14666v = i10;
            mlVar.f14668x = k0Var;
            mlVar.f14669y = intent;
            h3 e = h3.e((Service) c10.f31922v);
            e.h().D(new ou1(e, 16, mlVar));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        h c10 = c();
        if (intent == null) {
            c10.x().A.g("onUnbind called with null intent");
            return true;
        }
        c10.getClass();
        c10.x().I.f(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
