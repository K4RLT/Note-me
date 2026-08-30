package eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.measurement.p6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n2 extends z {
    public final p2 A;
    public final com.google.android.gms.internal.ads.f3 B;
    public final ArrayList C;
    public final p2 D;

    /* renamed from: x, reason: collision with root package name */
    public final r2 f16279x;

    /* renamed from: y, reason: collision with root package name */
    public d0 f16280y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Boolean f16281z;

    public n2(d1 d1Var) {
        super(d1Var);
        this.C = new ArrayList();
        this.B = new com.google.android.gms.internal.ads.f3(d1Var.H);
        this.f16279x = new r2(this);
        this.A = new p2(this, d1Var, 0);
        this.D = new p2(this, d1Var, 1);
    }

    @Override // eb.z
    public final boolean A() {
        return false;
    }

    public final void B(d dVar) {
        boolean C;
        u();
        y();
        f0 n10 = ((d1) this.f3443v).n();
        n10.t();
        byte[] n02 = l3.n0(dVar);
        if (n02.length > 131072) {
            n10.f().B.g("Conditional user property too long for local database. Sending directly to service");
            C = false;
        } else {
            C = n10.C(n02, 2);
        }
        boolean z3 = C;
        D(new ba.k(this, P(true), z3, new d(dVar), dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01a6 A[Catch: all -> 0x00f5, SQLiteFullException -> 0x0103, SQLiteException -> 0x018a, SQLiteDatabaseLockedException -> 0x021e, TryCatch #15 {all -> 0x00f5, blocks: (B:208:0x00ec, B:210:0x00f1, B:223:0x0123, B:224:0x0126, B:221:0x011f, B:140:0x013d, B:143:0x0151, B:148:0x0168, B:153:0x016c, B:154:0x016f, B:151:0x0162, B:163:0x0172, B:171:0x0186, B:173:0x01a6, B:184:0x01aa, B:185:0x01ad, B:182:0x01a0, B:158:0x01b9, B:160:0x01c5, B:239:0x01ec, B:241:0x0205, B:242:0x0210), top: B:207:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(eb.d0 r29, ga.a r30, eb.o3 r31) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.n2.C(eb.d0, ga.a, eb.o3):void");
    }

    public final void D(Runnable runnable) {
        u();
        if (I()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.C;
        if (arrayList.size() >= 1000) {
            f().A.g("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.D.b(60000L);
        G();
    }

    public final void E(AtomicReference atomicReference) {
        u();
        y();
        D(new ba.j(this, atomicReference, P(false), 19, false));
    }

    public final void F(boolean z3) {
        u();
        y();
        p6.a();
        d1 d1Var = (d1) this.f3443v;
        if (!d1Var.A.F(null, v.T0) && z3) {
            d1Var.n().D();
        }
        if (J()) {
            D(new iv1(13, this, P(false), false));
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [eb.i0, fa.e] */
    public final void G() {
        u();
        y();
        if (!I()) {
            if (L()) {
                r2 r2Var = this.f16279x;
                r2Var.f16355w.u();
                Context context = ((d1) r2Var.f16355w.f3443v).f16102u;
                synchronized (r2Var) {
                    try {
                        if (r2Var.f16353u) {
                            r2Var.f16355w.f().I.g("Connection attempt already in progress");
                            return;
                        }
                        if (r2Var.f16354v != null && (r2Var.f16354v.e() || r2Var.f16354v.h())) {
                            r2Var.f16355w.f().I.g("Already awaiting connection attempt");
                            return;
                        }
                        r2Var.f16354v = new fa.e(context, Looper.getMainLooper(), 93, r2Var, r2Var);
                        r2Var.f16355w.f().I.g("Connecting to remote service");
                        r2Var.f16353u = true;
                        fa.y.h(r2Var.f16354v);
                        r2Var.f16354v.m();
                        return;
                    } finally {
                    }
                }
            }
            if (!((d1) this.f3443v).A.J()) {
                List<ResolveInfo> queryIntentServices = ((d1) this.f3443v).f16102u.getPackageManager().queryIntentServices(new Intent().setClassName(((d1) this.f3443v).f16102u, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(((d1) this.f3443v).f16102u, "com.google.android.gms.measurement.AppMeasurementService"));
                    r2 r2Var2 = this.f16279x;
                    r2Var2.f16355w.u();
                    Context context2 = ((d1) r2Var2.f16355w.f3443v).f16102u;
                    ka.a b10 = ka.a.b();
                    synchronized (r2Var2) {
                        try {
                            boolean z3 = r2Var2.f16353u;
                            n2 n2Var = r2Var2.f16355w;
                            if (z3) {
                                n2Var.f().I.g("Connection attempt already in progress");
                                return;
                            }
                            n2Var.f().I.g("Using local app measurement service");
                            r2Var2.f16353u = true;
                            b10.a(context2, intent, r2Var2.f16355w.f16279x, 129);
                            return;
                        } finally {
                        }
                    }
                }
                f().A.g("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    public final void H() {
        u();
        y();
        r2 r2Var = this.f16279x;
        if (r2Var.f16354v != null && (r2Var.f16354v.h() || r2Var.f16354v.e())) {
            r2Var.f16354v.o();
        }
        r2Var.f16354v = null;
        try {
            ka.a.b().c(((d1) this.f3443v).f16102u, this.f16279x);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16280y = null;
    }

    public final boolean I() {
        u();
        y();
        if (this.f16280y != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        u();
        y();
        if (!L() || t().B0() >= ((Integer) v.f16412n0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.n2.L():boolean");
    }

    public final void M() {
        u();
        js jsVar = f().I;
        ArrayList arrayList = this.C;
        jsVar.f(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                f().A.f(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.D.a();
    }

    public final void O() {
        u();
        com.google.android.gms.internal.ads.f3 f3Var = this.B;
        ((la.a) f3Var.f5900w).getClass();
        f3Var.f5899v = SystemClock.elapsedRealtime();
        this.A.b(((Long) v.J.a(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cb  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.o3 P(boolean r47) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.n2.P(boolean):eb.o3");
    }
}
