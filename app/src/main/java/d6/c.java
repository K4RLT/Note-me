package d6;
import a.a;
import b.a;
import b.b;

import a6.q;
import a6.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b6.n;
import i0.m;
import j6.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wa.y8;

/* loaded from: classes.dex */
public final class c implements b6.c {

    /* renamed from: z, reason: collision with root package name */
    public static final String f15731z = q.f("CommandHandler");

    /* renamed from: u, reason: collision with root package name */
    public final Context f15732u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f15733v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final Object f15734w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final r f15735x;

    /* renamed from: y, reason: collision with root package name */
    public final m f15736y;

    public c(Context context, r rVar, m mVar) {
        this.f15732u = context;
        this.f15735x = rVar;
        this.f15736y = mVar;
    }

    public static j6.j b(Intent intent) {
        return new j6.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j6.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f18928a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f18929b);
    }

    public final void a(Intent intent, int i, j jVar) {
        List<n> list;
        boolean z3;
        String action = intent.getAction();
        int i10 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f15731z, "Handling constraints changed " + intent);
            Context context = this.f15732u;
            e eVar = new e(context, this.f15735x, i, jVar);
            ArrayList f10 = jVar.f15760y.f1774c.C().f();
            String str = d.f15737a;
            int size = f10.size();
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = f10.get(i11);
                i11++;
                a6.d dVar = ((p) obj).f18951j;
                z9 |= dVar.f261d;
                z10 |= dVar.f259b;
                z11 |= dVar.e;
                if (dVar.f258a != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z12 |= z3;
                if (z9 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1116a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(f10.size());
            eVar.f15739a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = f10.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = f10.get(i12);
                i12++;
                p pVar = (p) obj2;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || eVar.f15741c.a(pVar))) {
                    arrayList.add(pVar);
                }
            }
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList.get(i13);
                i13++;
                p pVar2 = (p) obj3;
                String str3 = pVar2.f18944a;
                j6.j a10 = y8.a(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, a10);
                q.d().a(e.f15738d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                ((m6.b) jVar.f15757v).f20616d.execute(new i(eVar.f15740b, i10, jVar, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f15731z, "Handling reschedule " + intent + ", " + i);
            jVar.f15760y.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                Context context2 = this.f15732u;
                j6.j b10 = b(intent);
                q d2 = q.d();
                String str4 = f15731z;
                d2.a(str4, "Handling schedule work for " + b10);
                WorkDatabase workDatabase = jVar.f15760y.f1774c;
                workDatabase.c();
                try {
                    p j10 = workDatabase.C().j(b10.f18928a);
                    if (j10 == null) {
                        q.d().g(str4, "Skipping scheduling " + b10 + " because it's no longer in the DB");
                        return;
                    }
                    if (a5.a(j10.f18945b)) {
                        q.d().g(str4, "Skipping scheduling " + b10 + "because it is finished.");
                        return;
                    }
                    long a11 = j10.a();
                    if (!j10.b()) {
                        q.d().a(str4, "Setting up Alarms for " + b10 + "at " + a11);
                        b(context2, workDatabase, b10, a11);
                    } else {
                        q.d().a(str4, "Opportunistically setting an alarm for " + b10 + "at " + a11);
                        b(context2, workDatabase, b10, a11);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((m6.b) jVar.f15757v).f20616d.execute(new i(i, i10, jVar, intent4));
                    }
                    workDatabase.v();
                    return;
                } finally {
                    workDatabase.h();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.f15734w) {
                    try {
                        j6.j b11 = b(intent);
                        q d10 = q.d();
                        String str5 = f15731z;
                        d10.a(str5, "Handing delay met for " + b11);
                        if (!this.f15733v.containsKey(b11)) {
                            g gVar = new g(this.f15732u, i, jVar, this.f15736y.q(b11));
                            this.f15733v.put(b11, gVar);
                            gVar.e();
                        } else {
                            q.d().a(str5, "WorkSpec " + b11 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                m mVar = this.f15736y;
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i14 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    n n10 = mVar.n(new j6.j(string, i14));
                    list = arrayList2;
                    if (n10 != null) {
                        arrayList2.add(n10);
                        list = arrayList2;
                    }
                } else {
                    list = mVar.o(string);
                }
                for (n nVar : list) {
                    q.d().a(f15731z, "Handing stopWork work for " + string);
                    j6.c cVar = jVar.D;
                    cVar.getClass();
                    nVar.getClass();
                    cVar.j(nVar, -512);
                    j6.j jVar2 = nVar.f1759a;
                    Context context3 = this.f15732u;
                    WorkDatabase workDatabase2 = jVar.f15760y.f1774c;
                    String str6 = b.f15730a;
                    j6.i z13 = workDatabase2.z();
                    j6.g g8 = z13.g(jVar2);
                    if (g8 != null) {
                        a(context3, jVar2, g8.f18922c);
                        q.d().a(b.f15730a, "Removing SystemIdInfo for workSpecId (" + jVar2 + ")");
                        String str7 = jVar2.f18928a;
                        int i15 = jVar2.f18929b;
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) z13.f18924u;
                        workDatabase_Impl.b();
                        j6.h hVar = (j6.h) z13.f18926w;
                        r5.j a12 = hVar.a();
                        if (str7 == null) {
                            a12.g(1);
                        } else {
                            a12.n(1, str7);
                        }
                        a12.b(2, i15);
                        workDatabase_Impl.c();
                        try {
                            a12.f();
                            workDatabase_Impl.v();
                        } finally {
                            workDatabase_Impl.h();
                            hVar.f(a12);
                        }
                    }
                    jVar.e(jVar2, false);
                }
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                j6.j b12 = b(intent);
                boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                q.d().a(f15731z, "Handling onExecutionCompleted " + intent + ", " + i);
                e(b12, z14);
                return;
            }
            q.d().g(f15731z, "Ignoring intent " + intent);
            return;
        }
        q.d().b(f15731z, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
    }

    @Override // b6.c
    public final void e(j6.j jVar, boolean z3) {
        synchronized (this.f15734w) {
            try {
                g gVar = (g) this.f15733v.remove(jVar);
                this.f15736y.n(jVar);
                if (gVar != null) {
                    gVar.f(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
