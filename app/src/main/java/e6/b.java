package e6;
import d.b;

import a6.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import b6.j;
import j6.g;
import j6.h;
import j6.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import k6.i;
import wa.y8;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: z, reason: collision with root package name */
    public static final String f15925z = q.f("SystemJobScheduler");

    /* renamed from: u, reason: collision with root package name */
    public final Context f15926u;

    /* renamed from: v, reason: collision with root package name */
    public final JobScheduler f15927v;

    /* renamed from: w, reason: collision with root package name */
    public final a f15928w;

    /* renamed from: x, reason: collision with root package name */
    public final WorkDatabase f15929x;

    /* renamed from: y, reason: collision with root package name */
    public final a6.a f15930y;

    public b(Context context, WorkDatabase workDatabase, a6.a aVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar2 = new a(context, aVar.f247c);
        this.f15926u = context;
        this.f15927v = jobScheduler;
        this.f15928w = aVar2;
        this.f15929x = workDatabase;
        this.f15930y = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            q.d().c(f15925z, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            q.d().c(f15925z, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j6.j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new j6.j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // b6.j
    public final void a(p... pVarArr) {
        int intValue;
        a6.a aVar = this.f15930y;
        WorkDatabase workDatabase = this.f15929x;
        final i iVar = new i(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                j6.q C = workDatabase.C();
                String str = pVar.f18944a;
                p j10 = C.j(str);
                String str2 = f15925z;
                if (j10 == null) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.v();
                } else if (j10.f18945b != 1) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.v();
                } else {
                    j6.j a10 = y8.a(pVar);
                    g g8 = workDatabase.z().g(a10);
                    if (g8 != null) {
                        intValue = g8.f18922c;
                    } else {
                        aVar.getClass();
                        final int i = aVar.f251h;
                        Object u9 = ((WorkDatabase) iVar.f19569v).u(new Callable() { // from class: k6.h
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i10;
                                int i11;
                                WorkDatabase workDatabase2 = (WorkDatabase) i.this.f19569v;
                                Long g10 = workDatabase2.y().g("next_job_scheduler_id");
                                int i12 = 0;
                                if (g10 != null) {
                                    i10 = (int) g10.longValue();
                                } else {
                                    i10 = 0;
                                }
                                if (i10 == Integer.MAX_VALUE) {
                                    i11 = 0;
                                } else {
                                    i11 = i10 + 1;
                                }
                                workDatabase2.y().h(new j6.d("next_job_scheduler_id", Long.valueOf(i11)));
                                if (i10 >= 0 && i10 <= i) {
                                    i12 = i10;
                                } else {
                                    workDatabase2.y().h(new j6.d("next_job_scheduler_id", Long.valueOf(1)));
                                }
                                return Integer.valueOf(i12);
                            }
                        });
                        u9.getClass();
                        intValue = ((Number) u9).intValue();
                    }
                    if (g8 == null) {
                        workDatabase.z().h(new g(a10.f18928a, a10.f18929b, intValue));
                    }
                    g(pVar, intValue);
                    workDatabase.v();
                }
            } finally {
                workDatabase.h();
            }
        }
    }

    @Override // b6.j
    public final boolean c() {
        return true;
    }

    @Override // b6.j
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.f15926u;
        JobScheduler jobScheduler = this.f15927v;
        ArrayList e = e(context, jobScheduler);
        int i = 0;
        if (e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = e.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = e.get(i10);
                i10++;
                JobInfo jobInfo = (JobInfo) obj;
                j6.j f10 = f(jobInfo);
                if (f10 != null && str.equals(f10.f18928a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                b(jobScheduler, ((Integer) obj2).intValue());
            }
            j6.i z3 = this.f15929x.z();
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) z3.f18924u;
            workDatabase_Impl.b();
            h hVar = (h) z3.f18927x;
            r5.j a10 = hVar.a();
            if (str == null) {
                a10.g(1);
            } else {
                a10.n(1, str);
            }
            workDatabase_Impl.c();
            try {
                a10.f();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.h();
                hVar.f(a10);
            }
        }
    }

    public final void g(p pVar, int i) {
        int i10;
        boolean z3;
        boolean z9;
        int i11;
        int i12;
        int i13;
        JobScheduler jobScheduler = this.f15927v;
        a aVar = this.f15928w;
        aVar.getClass();
        a6.d dVar = pVar.f18951j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f18944a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f18961t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, aVar.f15923a);
        boolean z10 = dVar.f259b;
        Set<a6.c> set = dVar.f264h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z10);
        boolean z11 = dVar.f260c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        int i14 = dVar.f258a;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30 && i14 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int b10 = q0.d.b(i14);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        i10 = 3;
                        if (b10 != 3) {
                            i10 = 4;
                            if (b10 != 4 || i15 < 26) {
                                q.d().a(a.f15922c, "API version too low. Cannot convert network type value ".concat(a5.a.x(i14)));
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            extras.setRequiredNetworkType(i10);
        }
        if (!z11) {
            if (pVar.f18953l == 2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(pVar.f18954m, i13);
        }
        long a10 = pVar.a();
        aVar.f15924b.getClass();
        long max = Math.max(a10 - System.currentTimeMillis(), 0L);
        if (i15 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f18958q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (a6.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f256a, cVar.f257b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f262f);
            extras.setTriggerContentMaxDelay(dVar.f263g);
        }
        extras.setPersisted(false);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f261d);
            extras.setRequiresStorageNotLow(dVar.e);
        }
        if (pVar.f18952k > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (max > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i16 >= 31 && pVar.f18958q && !z3 && !z9) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f15925z;
        q.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    q.d().g(str2, "Unable to schedule work ID " + str);
                    if (pVar.f18958q) {
                        if (pVar.f18959r == 1) {
                            i11 = 0;
                            try {
                                pVar.f18958q = false;
                                q.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(pVar, i);
                            } catch (IllegalStateException e) {
                                e = e;
                                ArrayList e8 = e(this.f15926u, jobScheduler);
                                if (e8 != null) {
                                    i12 = e8.size();
                                } else {
                                    i12 = i11;
                                }
                                String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i12), Integer.valueOf(this.f15929x.C().f().size()), Integer.valueOf(this.f15930y.f252j));
                                q.d().b(str2, format);
                                throw new IllegalStateException(format, e);
                            }
                        }
                    }
                }
            } catch (IllegalStateException e10) {
                e = e10;
                i11 = 0;
            }
        } catch (Throwable th) {
            q.d().c(str2, "Unable to schedule " + pVar, th);
        }
    }
}
