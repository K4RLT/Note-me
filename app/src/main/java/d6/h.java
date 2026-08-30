package d6;
import j.b;

import a6.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import eb.z1;
import g5.d0;
import java.util.ArrayDeque;
import k6.o;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15750u;

    /* renamed from: v, reason: collision with root package name */
    public final j f15751v;

    public /* synthetic */ h(j jVar, int i) {
        this.f15750u = i;
        this.f15751v = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var;
        h hVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f15750u) {
            case 0:
                synchronized (this.f15751v.A) {
                    j jVar = this.f15751v;
                    jVar.B = (Intent) jVar.A.get(0);
                }
                Intent intent = this.f15751v.B;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f15751v.B.getIntExtra("KEY_START_ID", 0);
                    q d2 = q.d();
                    String str = j.E;
                    d2.a(str, "Processing command " + this.f15751v.B + ", " + intExtra);
                    PowerManager.WakeLock a10 = o.a(this.f15751v.f15756u, action + " (" + intExtra + ")");
                    try {
                        q.d().a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                        a10.acquire();
                        j jVar2 = this.f15751v;
                        jVar2.f15761z.a(jVar2.B, intExtra, jVar2);
                        q.d().a(str, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        j jVar3 = this.f15751v;
                        z1Var = ((m6.b) jVar3.f15757v).f20616d;
                        hVar = new h(jVar3, 1);
                    } catch (Throwable th) {
                        try {
                            q d10 = q.d();
                            String str2 = j.E;
                            d10.c(str2, "Unexpected error in onHandleIntent", th);
                            q.d().a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar4 = this.f15751v;
                            z1Var = ((m6.b) jVar4.f15757v).f20616d;
                            hVar = new h(jVar4, 1);
                        } catch (Throwable th2) {
                            q.d().a(j.E, "Releasing operation wake lock (" + action + ") " + a10);
                            a10.release();
                            j jVar5 = this.f15751v;
                            ((m6.b) jVar5.f15757v).f20616d.execute(new h(jVar5, 1));
                            throw th2;
                        }
                    }
                    z1Var.execute(hVar);
                    return;
                }
                return;
            default:
                j jVar6 = this.f15751v;
                q d11 = q.d();
                String str3 = j.E;
                d11.a(str3, "Checking if commands are complete.");
                b();
                synchronized (jVar6.A) {
                    try {
                        if (jVar6.B != null) {
                            q.d().a(str3, "Removing command " + jVar6.B);
                            if (((Intent) jVar6.A.remove(0)).equals(jVar6.B)) {
                                jVar6.B = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        d0 d0Var = ((m6.b) jVar6.f15757v).f20613a;
                        c cVar = jVar6.f15761z;
                        synchronized (cVar.f15734w) {
                            isEmpty = cVar.f15733v.isEmpty();
                        }
                        if (isEmpty && jVar6.A.isEmpty()) {
                            synchronized (d0Var.f17432y) {
                                isEmpty2 = ((ArrayDeque) d0Var.f17429v).isEmpty();
                            }
                            if (isEmpty2) {
                                q.d().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = jVar6.C;
                                if (systemAlarmService != null) {
                                    systemAlarmService.b();
                                }
                            }
                        }
                        if (!jVar6.A.isEmpty()) {
                            jVar6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
