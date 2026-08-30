package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import ba.j;
import com.google.android.gms.internal.ads.ou1;
import eb.d1;
import eb.h3;
import eb.k0;
import eb.w2;
import z5.h;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements w2 {

    /* renamed from: u, reason: collision with root package name */
    public h f15568u;

    @Override // eb.w2
    public final void a(Intent intent) {
    }

    @Override // eb.w2
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final h c() {
        if (this.f15568u == null) {
            this.f15568u = new h(11, this);
        }
        return this.f15568u;
    }

    @Override // eb.w2
    public final boolean e(int i) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        h c10 = c();
        k0 k0Var = d1.a((Service) c10.f31922v, null, null).C;
        d1.d(k0Var);
        String string = jobParameters.getExtras().getString("action");
        k0Var.I.f(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            j jVar = new j(21);
            jVar.f3134v = c10;
            jVar.f3135w = k0Var;
            jVar.f3136x = jobParameters;
            h3 e = h3.e((Service) c10.f31922v);
            e.h().D(new ou1(e, 16, jVar));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
