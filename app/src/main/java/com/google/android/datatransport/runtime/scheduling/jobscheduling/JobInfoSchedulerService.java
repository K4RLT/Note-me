package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b6.g;
import com.google.android.gms.internal.consent_sdk.c;
import j.i0;
import java.util.concurrent.Executor;
import n8.i;
import n8.q;
import t8.d;
import x8.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4210u = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        i0 a10 = i.a();
        a10.E(string);
        a10.f18638x = a.b(i);
        if (string2 != null) {
            a10.f18637w = Base64.decode(string2, 0);
        }
        c cVar = q.a().f21204d;
        ((Executor) cVar.f13375z).execute(new d(cVar, a10.d(), i10, new g(this, 19, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
