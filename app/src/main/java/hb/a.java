package hb;
import b.a;

import a6.x;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import fa.y;
import g5.q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import la.c;
import la.d;
import wa.u6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static volatile ScheduledExecutorService f17989n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f17990o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f17991a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f17992b;

    /* renamed from: c, reason: collision with root package name */
    public int f17993c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f17994d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f17995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17996g;

    /* renamed from: h, reason: collision with root package name */
    public ab.a f17997h;
    public final la.a i;

    /* renamed from: j, reason: collision with root package name */
    public final String f17998j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f17999k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f18000l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f18001m;

    public a(Context context) {
        boolean z3;
        String str;
        String packageName = context.getPackageName();
        this.f17991a = new Object();
        this.f17993c = 0;
        this.f17995f = new HashSet();
        this.f17996g = true;
        this.i = la.a.f20062a;
        this.f17999k = new HashMap();
        this.f18000l = new AtomicInteger(0);
        y.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f17997h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f17998j = str;
        } else {
            this.f17998j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f17992b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = d.f20072a;
            synchronized (d.class) {
                Boolean bool = d.f20074c;
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    if (u6.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d.f20074c = Boolean.valueOf(z3);
                }
            }
            if (z3) {
                packageName = c.a(packageName) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo b10 = na.b.a(context).b(0, packageName);
                        if (b10 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i = b10.uid;
                            workSource = new WorkSource();
                            Method method2 = d.f20073b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i), packageName);
                                } catch (Exception e) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                }
                            } else {
                                Method method3 = d.f20072a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, Integer.valueOf(i));
                                    } catch (Exception e8) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f17992b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f17989n;
            if (scheduledExecutorService == null) {
                synchronized (f17990o) {
                    try {
                        scheduledExecutorService = f17989n;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f17989n = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f18001m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new ab.b(sb2.toString(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        this.f18000l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.f17991a) {
            try {
                if (!b()) {
                    this.f17997h = ab.a.f361u;
                    this.f17992b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f17993c++;
                if (this.f17996g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f17999k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f17999k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f18002a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > min) {
                    j10 = elapsedRealtime + min;
                }
                if (j10 > this.e) {
                    this.e = j10;
                    ScheduledFuture scheduledFuture = this.f17994d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f17994d = this.f18001m.schedule(new x(20, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f17991a) {
            if (this.f17993c > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void c() {
        if (this.f18000l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f17998j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f17991a) {
            try {
                if (this.f17996g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f17999k.containsKey(null)) {
                    b bVar = (b) this.f17999k.get(null);
                    if (bVar != null) {
                        int i = bVar.f18002a - 1;
                        bVar.f18002a = i;
                        if (i == 0) {
                            this.f17999k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f17998j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f17995f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            q.b();
        }
    }

    public final void e() {
        synchronized (this.f17991a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f17996g) {
                    int i = this.f17993c - 1;
                    this.f17993c = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f17993c = 0;
                }
                d();
                Iterator it = this.f17999k.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f18002a = 0;
                }
                this.f17999k.clear();
                ScheduledFuture scheduledFuture = this.f17994d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f17994d = null;
                    this.e = 0L;
                }
                if (this.f17992b.isHeld()) {
                    try {
                        try {
                            this.f17992b.release();
                            if (this.f17997h != null) {
                                this.f17997h = null;
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.f17998j).concat(" failed to release!"), e);
                                if (this.f17997h != null) {
                                    this.f17997h = null;
                                }
                            } else {
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f17997h != null) {
                            this.f17997h = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f17998j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
