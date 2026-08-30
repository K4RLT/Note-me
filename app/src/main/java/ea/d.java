package ea;
import l.b;
import n.f;
import p.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.z11;
import fa.k0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status I = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status J = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object K = new Object();
    public static d L;
    public final z11 A;
    public final AtomicInteger B;
    public final AtomicInteger C;
    public final ConcurrentHashMap D;
    public final f E;
    public final f F;
    public final bb.a G;
    public volatile boolean H;

    /* renamed from: u, reason: collision with root package name */
    public long f16006u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16007v;

    /* renamed from: w, reason: collision with root package name */
    public fa.n f16008w;

    /* renamed from: x, reason: collision with root package name */
    public ha.b f16009x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f16010y;

    /* renamed from: z, reason: collision with root package name */
    public final ca.e f16011z;

    public d(Context context, Looper looper) {
        ca.e eVar = ca.e.f4034d;
        this.f16006u = 10000L;
        this.f16007v = false;
        this.B = new AtomicInteger(1);
        this.C = new AtomicInteger(0);
        this.D = new ConcurrentHashMap(5, 0.75f, 1);
        this.E = new f(0);
        this.F = new f(0);
        this.H = true;
        this.f16010y = context;
        bb.a aVar = new bb.a(looper, this, 3);
        Looper.getMainLooper();
        this.G = aVar;
        this.f16011z = eVar;
        this.A = new z11(14);
        PackageManager packageManager = context.getPackageManager();
        if (la.b.f20068g == null) {
            la.b.f20068g = Boolean.valueOf(la.b.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (la.b.f20068g.booleanValue()) {
            this.H = false;
        }
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    public static Status c(a aVar, ca.b bVar) {
        return new Status(17, a.l("API: ", (String) aVar.f15998b.f8423w, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f4023w, bVar);
    }

    public static d e(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (K) {
            if (L == null) {
                synchronized (k0.f16886g) {
                    try {
                        handlerThread = k0.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            k0.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = k0.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ca.e.f4033c;
                L = new d(applicationContext, looper);
            }
            dVar = L;
        }
        return dVar;
    }

    public final boolean a() {
        if (!this.f16007v) {
            fa.m mVar = (fa.m) fa.b().f16895u;
            if (mVar == null || mVar.f16899v) {
                int i = ((SparseIntArray) this.A.f13046v).get(203400000, -1);
                if (i != -1 && i != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean b(ca.b bVar, int i) {
        boolean z3;
        ca.e eVar = this.f16011z;
        eVar.getClass();
        Context context = this.f16010y;
        if (!na.a.c(context)) {
            int i10 = bVar.f4022v;
            PendingIntent pendingIntent = bVar.f4023w;
            if (i10 != 0 && pendingIntent != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                pendingIntent = null;
                Intent b10 = eVar.b(context, null, i10);
                if (b10 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b10, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i11 = GoogleApiActivity.f4279v;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, sa.c.f25130a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final l d(da.f fVar) {
        a aVar = fVar.f15826y;
        ConcurrentHashMap concurrentHashMap = this.D;
        l lVar = (l) concurrentHashMap.get(aVar);
        if (lVar == null) {
            lVar = new l(this, fVar);
            concurrentHashMap.put(aVar, lVar);
        }
        if (lVar.f16017v.l()) {
            this.F.add(aVar);
        }
        lVar.j();
        return lVar;
    }

    public final void f(ca.b bVar, int i) {
        if (!b(bVar, i)) {
            bb.a aVar = this.G;
            aVar.sendMessage(aVar.obtainMessage(5, i, 0, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARN: Type inference failed for: r0v54, types: [da.f, ha.b] */
    /* JADX WARN: Type inference failed for: r0v63, types: [da.f, ha.b] */
    /* JADX WARN: Type inference failed for: r4v8, types: [da.f, ha.b] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.d.handleMessage(android.os.Message):boolean");
    }
}
