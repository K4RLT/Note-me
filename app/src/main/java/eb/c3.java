package eb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class c3 extends d3 {
    public Integer A;

    /* renamed from: y, reason: collision with root package name */
    public final AlarmManager f16091y;

    /* renamed from: z, reason: collision with root package name */
    public z2 f16092z;

    public c3(h3 h3Var) {
        super(h3Var);
        this.f16091y = (AlarmManager) ((d1) this.f3443v).f16102u.getSystemService("alarm");
    }

    @Override // eb.d3
    public final boolean A() {
        d1 d1Var = (d1) this.f3443v;
        AlarmManager alarmManager = this.f16091y;
        if (alarmManager != null) {
            Context context = d1Var.f16102u;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.n0.f13855a));
        }
        JobScheduler jobScheduler = (JobScheduler) d1Var.f16102u.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(C());
        }
        return false;
    }

    public final void B() {
        d1 d1Var = (d1) this.f3443v;
        y();
        f().I.g("Unscheduling upload");
        AlarmManager alarmManager = this.f16091y;
        if (alarmManager != null) {
            Context context = d1Var.f16102u;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.n0.f13855a));
        }
        D().a();
        JobScheduler jobScheduler = (JobScheduler) d1Var.f16102u.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(C());
        }
    }

    public final int C() {
        if (this.A == null) {
            this.A = Integer.valueOf(("measurement" + ((d1) this.f3443v).f16102u.getPackageName()).hashCode());
        }
        return this.A.intValue();
    }

    public final l D() {
        if (this.f16092z == null) {
            this.f16092z = new z2(this, this.f16125w.F, 1);
        }
        return this.f16092z;
    }
}
