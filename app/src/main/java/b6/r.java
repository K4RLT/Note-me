package b6;
import b.b;
import q.a;
import q.f;
import r.c;

import a6.w;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import g5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static r f1769k;

    /* renamed from: l, reason: collision with root package name */
    public static r f1770l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1771m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1772a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.a f1773b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f1774c;

    /* renamed from: d, reason: collision with root package name */
    public final m6.a f1775d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1776f;

    /* renamed from: g, reason: collision with root package name */
    public final ic.c f1777g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1778h = false;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public final h6.j f1779j;

    static {
        a6.f("WorkManagerImpl");
        f1769k = null;
        f1770l = null;
        f1771m = new Object();
    }

    public r(Context context, final a6.a aVar, m6.a aVar2, final WorkDatabase workDatabase, final List list, h hVar, h6.j jVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a(applicationContext)) {
            a6.q qVar = new a6.q(aVar.f250g);
            synchronized (a6.q.f286b) {
                a6.q.f287c = qVar;
            }
            this.f1772a = applicationContext;
            this.f1775d = aVar2;
            this.f1774c = workDatabase;
            this.f1776f = hVar;
            this.f1779j = jVar;
            this.f1773b = aVar;
            this.e = list;
            this.f1777g = new ic.c(7, workDatabase);
            final d0 d0Var = ((m6.b) aVar2).f20613a;
            String str = m.f1758a;
            hVar.a(new c() { // from class: b6.k
                @Override // b6.c
                public final void e(j6.j jVar2, boolean z3) {
                    d0Var.execute(new l(list, jVar2, aVar, workDatabase, 0));
                }
            });
            aVar2.a(new k6.f(applicationContext, this));
            return;
        }
        x.o("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static r b(Context context) {
        r rVar;
        Object obj = f1771m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    rVar = f1769k;
                    if (rVar == null) {
                        rVar = f1770l;
                    }
                }
                return rVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (rVar != null) {
            return rVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (b6.r.f1770l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        b6.r.f1770l = b6.b(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        b6.r.f1769k = b6.r.f1770l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r3, a6.a r4) {
        /*
            java.lang.Object r0 = b6.r.f1771m
            monitor-enter(r0)
            b6.r r1 = b6.r.f1769k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            b6.r r2 = b6.r.f1770l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            b6.r r1 = b6.r.f1770l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            b6.r r3 = b6.b(r3, r4)     // Catch: java.lang.Throwable -> L14
            b6.r.f1770l = r3     // Catch: java.lang.Throwable -> L14
        L26:
            b6.r r3 = b6.r.f1770l     // Catch: java.lang.Throwable -> L14
            b6.r.f1769k = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c(android.content.Context, a6.a):void");
    }

    public final w a(a6.s sVar) {
        List singletonList = Collections.singletonList(sVar);
        if (!singletonList.isEmpty()) {
            return new o(this, null, 2, singletonList).a();
        }
        x.n("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final void d() {
        synchronized (f1771m) {
            try {
                this.f1778h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList e;
        String str = e6.b.f15925z;
        Context context = this.f1772a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e = e6.b.e(context, jobScheduler)) != null && !e.isEmpty()) {
            int size = e.size();
            int i = 0;
            while (i < size) {
                Object obj = e.get(i);
                i++;
                e6.b(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f1774c;
        j6.q C = workDatabase.C();
        WorkDatabase_Impl workDatabase_Impl = C.f18965a;
        workDatabase_Impl.b();
        j6.h hVar = C.f18975m;
        r5.j a10 = hVar.a();
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
            workDatabase_Impl.h();
            hVar.f(a10);
            b(this.f1773b, workDatabase, this.e);
        } catch (Throwable th) {
            workDatabase_Impl.h();
            hVar.f(a10);
            throw th;
        }
    }
}
