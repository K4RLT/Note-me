package d6;
import c.c;

import a6.q;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b6.r;
import eb.z1;
import i0.m;
import java.util.ArrayList;
import k6.o;
import k6.u;
import q.x;

/* loaded from: classes.dex */
public final class j implements b6.c {
    public static final String E = q.f("SystemAlarmDispatcher");
    public final ArrayList A;
    public Intent B;
    public SystemAlarmService C;
    public final j6.c D;

    /* renamed from: u, reason: collision with root package name */
    public final Context f15756u;

    /* renamed from: v, reason: collision with root package name */
    public final m6.a f15757v;

    /* renamed from: w, reason: collision with root package name */
    public final u f15758w;

    /* renamed from: x, reason: collision with root package name */
    public final b6.h f15759x;

    /* renamed from: y, reason: collision with root package name */
    public final r f15760y;

    /* renamed from: z, reason: collision with root package name */
    public final c f15761z;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f15756u = applicationContext;
        m mVar = new m();
        r b10 = r.b(systemAlarmService);
        a6.a aVar = b10.f1773b;
        this.f15760y = b10;
        this.f15761z = new c(applicationContext, aVar.f247c, mVar);
        this.f15758w = new u(aVar.f249f);
        b6.h hVar = b10.f1776f;
        this.f15759x = hVar;
        m6.a aVar2 = b10.f1775d;
        this.f15757v = aVar2;
        this.D = new j6.c(hVar, aVar2);
        hVar.a(this);
        this.A = new ArrayList();
        this.B = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        x.o("Needs to be invoked on the main thread.");
    }

    public final void a(Intent intent, int i) {
        q d2 = q.d();
        String str = E;
        d2.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.A) {
                try {
                    ArrayList arrayList = this.A;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.A) {
            try {
                boolean isEmpty = this.A.isEmpty();
                this.A.add(intent);
                if (isEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock a10 = o.a(this.f15756u, "ProcessCommand");
        try {
            a10.acquire();
            this.f15760y.f1775d.a(new h(this, 0));
        } finally {
            a10.release();
        }
    }

    @Override // b6.c
    public final void e(j6.j jVar, boolean z3) {
        z1 z1Var = ((m6.b) this.f15757v).f20616d;
        String str = c.f15731z;
        Intent intent = new Intent(this.f15756u, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        c(intent, jVar);
        z1Var.execute(new i(0, 0, this, intent));
    }
}
