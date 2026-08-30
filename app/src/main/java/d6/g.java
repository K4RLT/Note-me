package d6;
import c.c;
import j.a;

import a6.q;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b6.n;
import eb.z1;
import g5.d0;
import j6.p;
import k6.o;
import k6.t;
import k6.u;
import pf.f1;
import pf.v;

/* loaded from: classes.dex */
public final class g implements f6.e {
    public static final String I = q.f("DelayMetCommandHandler");
    public int A;
    public final d0 B;
    public final z1 C;
    public PowerManager.WakeLock D;
    public boolean E;
    public final n F;
    public final v G;
    public volatile f1 H;

    /* renamed from: u, reason: collision with root package name */
    public final Context f15744u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15745v;

    /* renamed from: w, reason: collision with root package name */
    public final j6.j f15746w;

    /* renamed from: x, reason: collision with root package name */
    public final j f15747x;

    /* renamed from: y, reason: collision with root package name */
    public final c7.n f15748y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f15749z;

    public g(Context context, int i, j jVar, n nVar) {
        this.f15744u = context;
        this.f15745v = i;
        this.f15747x = jVar;
        this.f15746w = nVar.f1759a;
        this.F = nVar;
        h6.j jVar2 = jVar.f15760y.f1779j;
        m6.b bVar = (m6.b) jVar.f15757v;
        this.B = bVar.f20613a;
        this.C = bVar.f20616d;
        this.G = bVar.f20614b;
        this.f15748y = new c7.n(jVar2);
        this.E = false;
        this.A = 0;
        this.f15749z = new Object();
    }

    public static void a(g gVar) {
        boolean z3;
        int i = gVar.f15745v;
        z1 z1Var = gVar.C;
        Context context = gVar.f15744u;
        String str = I;
        j jVar = gVar.f15747x;
        j6.j jVar2 = gVar.f15746w;
        String str2 = jVar2.f18928a;
        if (gVar.A < 2) {
            gVar.A = 2;
            q.d().a(str, "Stopping work for WorkSpec " + str2);
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            c(intent, jVar2);
            z1Var.execute(new i(i, 0, jVar, intent));
            b6.h hVar = jVar.f15759x;
            String str3 = jVar2.f18928a;
            synchronized (hVar.f1746k) {
                if (hVar.c(str3) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                q.d().a(str, "WorkSpec " + str2 + " needs to be rescheduled");
                Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                c(intent2, jVar2);
                z1Var.execute(new i(i, 0, jVar, intent2));
                return;
            }
            q.d().a(str, "Processor does not have WorkSpec " + str2 + ". No need to reschedule");
            return;
        }
        q.d().a(str, "Already stopped work for " + str2);
    }

    public static void c(g gVar) {
        if (gVar.A == 0) {
            gVar.A = 1;
            q.d().a(I, "onAllConstraintsMet for " + gVar.f15746w);
            if (gVar.f15747x.f15759x.h(gVar.F, null)) {
                u uVar = gVar.f15747x.f15758w;
                j6.j jVar = gVar.f15746w;
                synchronized (uVar.f19592d) {
                    q.d().a(u.e, "Starting timer for " + jVar);
                    uVar.a(jVar);
                    t tVar = new t(uVar, jVar);
                    uVar.f19590b.put(jVar, tVar);
                    uVar.f19591c.put(jVar, gVar);
                    ((Handler) uVar.f19589a.f22681u).postDelayed(tVar, 600000L);
                }
                return;
            }
            gVar.d();
            return;
        }
        q.d().a(I, "Already started work for " + gVar.f15746w);
    }

    @Override // f6.e
    public final void b(p pVar, f6.c cVar) {
        boolean z3 = cVar instanceof f6.a;
        d0 d0Var = this.B;
        if (z3) {
            d0Var.execute(new f(this, 1));
        } else {
            d0Var.execute(new f(this, 0));
        }
    }

    public final void d() {
        synchronized (this.f15749z) {
            try {
                if (this.H != null) {
                    this.H.j(null);
                }
                this.f15747x.f15758w.a(this.f15746w);
                PowerManager.WakeLock wakeLock = this.D;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q.d().a(I, "Releasing wakelock " + this.D + "for WorkSpec " + this.f15746w);
                    this.D.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.f15746w.f18928a;
        this.D = o.a(this.f15744u, str + " (" + this.f15745v + ")");
        q d2 = q.d();
        String str2 = I;
        d2.a(str2, "Acquiring wakelock " + this.D + "for WorkSpec " + str);
        this.D.acquire();
        p j10 = this.f15747x.f15760y.f1774c.C().j(str);
        if (j10 == null) {
            this.B.execute(new f(this, 0));
            return;
        }
        boolean b10 = j10.b();
        this.E = b10;
        if (!b10) {
            q.d().a(str2, "No constraints for " + str);
            this.B.execute(new f(this, 1));
            return;
        }
        this.H = f6.a(this.f15748y, j10, this.G, this);
    }

    public final void f(boolean z3) {
        q d2 = q.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        j6.j jVar = this.f15746w;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z3);
        d2.a(I, sb2.toString());
        d();
        int i = this.f15745v;
        j jVar2 = this.f15747x;
        z1 z1Var = this.C;
        Context context = this.f15744u;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c(intent, jVar);
            z1Var.execute(new i(i, 0, jVar2, intent));
        }
        if (this.E) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            z1Var.execute(new i(i, 0, jVar2, intent2));
        }
    }
}
