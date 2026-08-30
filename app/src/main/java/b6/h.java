package b6;
import o.a;
import q.d;
import q.f;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import wa.y8;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: l, reason: collision with root package name */
    public static final String f1737l = a6.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.a f1740c;

    /* renamed from: d, reason: collision with root package name */
    public final m6.b f1741d;
    public final WorkDatabase e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1743g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1742f = new HashMap();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1745j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f1738a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1746k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1744h = new HashMap();

    public h(Context context, a6.a aVar, m6.b bVar, WorkDatabase workDatabase) {
        this.f1739b = context;
        this.f1740c = aVar;
        this.f1741d = bVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, v vVar, int i) {
        if (vVar != null) {
            vVar.L = i;
            vVar.h();
            vVar.K.cancel(true);
            if (vVar.f1791y != null && (vVar.K.f19962u instanceof l6.a)) {
                vVar.f1791y.stop(i);
            } else {
                a6.d().a(v.M, "WorkSpec " + vVar.f1790x + " is already done. Not interrupting.");
            }
            a6.d().a(f1737l, "WorkerWrapper interrupted for " + str);
            return true;
        }
        a6.d().a(f1737l, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(c cVar) {
        synchronized (this.f1746k) {
            this.f1745j.add(cVar);
        }
    }

    public final v b(String str) {
        boolean z3;
        v vVar = (v) this.f1742f.remove(str);
        if (vVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            vVar = (v) this.f1743g.remove(str);
        }
        this.f1744h.remove(str);
        if (z3) {
            synchronized (this.f1746k) {
                try {
                    if (this.f1742f.isEmpty()) {
                        Context context = this.f1739b;
                        String str2 = i6.a.D;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f1739b.startService(intent);
                        } catch (Throwable th) {
                            a6.d().c(f1737l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f1738a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f1738a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return vVar;
    }

    public final v c(String str) {
        v vVar = (v) this.f1742f.get(str);
        if (vVar == null) {
            return (v) this.f1743g.get(str);
        }
        return vVar;
    }

    public final void e(c cVar) {
        synchronized (this.f1746k) {
            this.f1745j.remove(cVar);
        }
    }

    public final void f(j6.j jVar) {
        this.f1741d.f20616d.execute(new g(this, 0, jVar));
    }

    public final void g(String str, a6.h hVar) {
        synchronized (this.f1746k) {
            try {
                a6.d().e(f1737l, "Moving WorkSpec (" + str + ") to the foreground");
                v vVar = (v) this.f1743g.remove(str);
                if (vVar != null) {
                    if (this.f1738a == null) {
                        PowerManager.WakeLock a10 = k6.a(this.f1739b, "ProcessorForegroundLck");
                        this.f1738a = a10;
                        a10.acquire();
                    }
                    this.f1742f.put(str, vVar);
                    Intent c10 = i6.a.c(this.f1739b, y8.a(vVar.f1790x), hVar);
                    Context context = this.f1739b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f2.b.m(context, c10);
                    } else {
                        context.startService(c10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean h(n nVar, ra.e eVar) {
        Throwable th;
        boolean z3;
        j6.j jVar = nVar.f1759a;
        String str = jVar.f18928a;
        ArrayList arrayList = new ArrayList();
        j6.p pVar = (j6.p) this.e.u(new e(0, this, arrayList, str));
        if (pVar == null) {
            a6.d().g(f1737l, "Didn't find WorkSpec for id " + jVar);
            f(jVar);
            return false;
        }
        synchronized (this.f1746k) {
            try {
                synchronized (this.f1746k) {
                    try {
                        try {
                            if (c(str) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                if (z3) {
                    Set set = (Set) this.f1744h.get(str);
                    if (((n) set.iterator().next()).f1759a.f18929b == jVar.f18929b) {
                        set.add(nVar);
                        a6.d().a(f1737l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        f(jVar);
                    }
                    return false;
                }
                if (pVar.f18961t != jVar.f18929b) {
                    f(jVar);
                    return false;
                }
                u uVar = new u(this.f1739b, this.f1740c, this.f1741d, this, this.e, pVar, arrayList);
                if (eVar != null) {
                    uVar.B = eVar;
                }
                v vVar = new v(uVar);
                l6.j jVar2 = vVar.J;
                jVar2.a(new f(0, this, jVar2, vVar), this.f1741d.f20616d);
                this.f1743g.put(str, vVar);
                HashSet hashSet = new HashSet();
                hashSet.add(nVar);
                this.f1744h.put(str, hashSet);
                this.f1741d.f20613a.execute(vVar);
                a6.d().a(f1737l, h.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }
}
