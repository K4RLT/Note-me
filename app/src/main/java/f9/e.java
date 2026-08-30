package f9;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.an1;
import com.google.android.gms.internal.ads.bf;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.jd;
import com.google.android.gms.internal.ads.jf;
import com.google.android.gms.internal.ads.jk0;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.tf;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.xv0;
import com.google.android.gms.internal.ads.xx;
import g9.p;
import g9.r;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import k9.a0;
import k9.f0;

/* loaded from: classes.dex */
public final class e implements Runnable, lf {
    public static final long J = System.currentTimeMillis();
    public final ExecutorService A;
    public final cv0 B;
    public Context C;
    public final Context D;
    public l9.a E;
    public final l9.a F;
    public final boolean G;
    public int I;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16795x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16796y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f16797z;

    /* renamed from: u, reason: collision with root package name */
    public final Vector f16792u = new Vector();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f16793v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f16794w = new AtomicReference();
    public final CountDownLatch H = new CountDownLatch(1);

    public e(Context context, l9.a aVar) {
        this.C = context;
        this.D = context;
        this.E = aVar;
        this.F = aVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.A = newCachedThreadPool;
        nl nlVar = sl.f10789j3;
        r rVar = r.e;
        boolean booleanValue = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        this.G = booleanValue;
        this.B = cv0.a(context, newCachedThreadPool, booleanValue);
        nl nlVar2 = sl.f10742g3;
        ql qlVar = rVar.f17698c;
        this.f16796y = ((Boolean) qlVar.a(nlVar2)).booleanValue();
        this.f16797z = ((Boolean) qlVar.a(sl.k3)).booleanValue();
        if (((Boolean) qlVar.a(sl.f10773i3)).booleanValue()) {
            this.I = 2;
        } else {
            this.I = 1;
        }
        if (!((Boolean) qlVar.a(sl.f10869o4)).booleanValue()) {
            this.f16795x = l();
        }
        if (((Boolean) qlVar.a(sl.k4)).booleanValue()) {
            xx.f12651a.execute(this);
            return;
        }
        l9.d dVar = p.f17688g.f17689a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            xx.f12651a.execute(this);
        } else {
            run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.ads.dv0] */
    public static final jf p(Context context, l9.a aVar, boolean z3, boolean z9) {
        jf m4;
        jd D = kd.D();
        D.b();
        ((kd) D.f4845v).F(z3);
        String str = aVar.f20029u;
        D.b();
        ((kd) D.f4845v).E(str);
        kd kdVar = (kd) D.c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (jf.class) {
            Object obj = new Object();
            obj.f5533b = false;
            byte b10 = (byte) (obj.f5536f | 1);
            obj.f5534c = true;
            obj.f5535d = 100L;
            obj.e = 300L;
            obj.f5536f = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
            String z10 = kdVar.z();
            if (z10 != null) {
                obj.f5532a = z10;
                obj.f5533b = kdVar.A();
                obj.f5536f = (byte) (obj.f5536f | 1);
                m4 = jf.m(context, Executors.newCachedThreadPool(), obj.a(), z9);
            } else {
                throw new NullPointerException("Null clientVersion");
            }
        }
        return m4;
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void a(int i, int i10, int i11) {
        lf o10 = o();
        if (o10 != null) {
            m();
            try {
                o10.a(i, i10, i11);
            } catch (NullPointerException unused) {
            }
        } else {
            this.f16792u.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11)});
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void b(MotionEvent motionEvent) {
        lf o10 = o();
        if (o10 != null) {
            m();
            try {
                o10.b(motionEvent);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        this.f16792u.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String c(Context context, String str, View view, Activity activity) {
        if (j()) {
            lf o10 = o();
            if (((Boolean) r.e.f17698c.a(sl.f10671bc)).booleanValue()) {
                f0 f0Var = k.C.f16813c;
                f0.j(view, 4);
            }
            if (o10 != null) {
                m();
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    return o10.c(context, str, view, activity);
                } catch (NullPointerException unused) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String d(Context context) {
        try {
            return (String) ed1.E(new xe(this, 20, context), this.A).get(((Integer) r.e.f17698c.a(sl.f11011x3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.F.f20029u;
            long j10 = J;
            try {
                pe z3 = qe.z();
                z3.b();
                ((qe) z3.f4845v).B(str);
                z3.b();
                ((qe) z3.f4845v).A("0.828153725");
                String packageName = context.getPackageName();
                z3.b();
                ((qe) z3.f4845v).D(packageName);
                long currentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
                z3.b();
                ((qe) z3.f4845v).F(currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                z3.b();
                ((qe) z3.f4845v).C(currentTimeMillis2);
                try {
                    long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    z3.b();
                    ((qe) z3.f4845v).E(j11);
                } catch (PackageManager.NameNotFoundException unused3) {
                    z3.b();
                    ((qe) z3.f4845v).E(-1L);
                }
                te b10 = bf.b(null, ((qe) z3.c()).b());
                b10.b();
                ((ue) b10.f4845v).C(5);
                b10.b();
                ((ue) b10.f4845v).D(2);
                return Base64.encodeToString(((ue) b10.c()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void e(StackTraceElement[] stackTraceElementArr) {
        lf o10;
        lf o11;
        if (((Boolean) r.e.f17698c.a(sl.D3)).booleanValue()) {
            if (this.H.getCount() == 0 && (o11 = o()) != null) {
                try {
                    o11.e(stackTraceElementArr);
                    return;
                } catch (NullPointerException unused) {
                    return;
                }
            }
            return;
        }
        if (j() && (o10 = o()) != null) {
            try {
                o10.e(stackTraceElementArr);
            } catch (NullPointerException unused2) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void g(View view) {
        lf o10 = o();
        if (o10 != null) {
            try {
                o10.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String i(Context context, View view, Activity activity) {
        nl nlVar = sl.f10655ac;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        try {
            if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                if (j()) {
                    lf o10 = o();
                    if (((Boolean) qlVar2.a(sl.f10671bc)).booleanValue()) {
                        f0 f0Var = k.C.f16813c;
                        f0.j(view, 2);
                    }
                    if (o10 != null) {
                        return o10.i(context, view, activity);
                    }
                    return "";
                }
                return "";
            }
            lf o11 = o();
            if (((Boolean) qlVar2.a(sl.f10671bc)).booleanValue()) {
                f0 f0Var2 = k.C.f16813c;
                f0.j(view, 2);
            }
            if (o11 != null) {
                return o11.i(context, view, activity);
            }
            return "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() {
        try {
            this.H.await();
            return true;
        } catch (InterruptedException e) {
            int i = a0.f19634b;
            l9.i.g("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String k(Context context) {
        lf o10;
        if (j() && (o10 = o()) != null) {
            m();
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return o10.f(context);
            } catch (NullPointerException unused) {
                return "";
            }
        }
        return "";
    }

    public final boolean l() {
        Context context = this.C;
        pd.c cVar = new pd.c(this);
        xv0 xv0Var = new xv0(context, an1.q(context, this.B), cVar, ((Boolean) r.e.f17698c.a(sl.h3)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (xv0.f12632z) {
            try {
                mh q10 = xv0Var.q(1);
                if (q10 == null) {
                    xv0Var.o(4025, currentTimeMillis);
                    return false;
                }
                File h3 = xv0Var.h(q10.z());
                if (!new File(h3, "pcam.jar").exists()) {
                    xv0Var.o(4026, currentTimeMillis);
                    return false;
                }
                if (!new File(h3, "pcbc").exists()) {
                    xv0Var.o(4027, currentTimeMillis);
                    return false;
                }
                xv0Var.o(5019, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        lf o10 = o();
        Vector vector = this.f16792u;
        if (!vector.isEmpty() && o10 != null) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                Object[] objArr = (Object[]) it.next();
                try {
                    int length = objArr.length;
                    if (length == 1) {
                        o10.b((MotionEvent) objArr[0]);
                    } else if (length == 3) {
                        o10.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                    }
                } catch (NullPointerException unused) {
                }
            }
            vector.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.mf] */
    public final void n(boolean z3) {
        String str = this.E.f20029u;
        Context context = this.C;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        jd D = kd.D();
        D.b();
        ((kd) D.f4845v).F(z3);
        D.b();
        ((kd) D.f4845v).E(str);
        kd kdVar = (kd) D.c();
        Object obj = new Object();
        obj.f8337v = kdVar.z();
        obj.f8336u = kdVar.A();
        obj.f8338w = kdVar.B();
        kdVar.C();
        synchronized (nf.class) {
            if (!nf.S) {
                nf.T = System.currentTimeMillis() / 1000;
                nf.Q = nf.n(context, obj.f8336u);
                nf.U = tf.c(context);
                ExecutorService executorService = nf.Q.f5419b;
                nf.V = kg.a(context, executorService);
                nf.W = new d2();
                jk0 jk0Var = new jk0(context, executorService);
                nf.Y = jk0Var;
                nf.X = new hq0(context, executorService, (sd) obj.f8338w, jk0Var);
                nf.S = true;
            }
        }
        this.f16793v.set(new nf(context, obj));
    }

    public final lf o() {
        int i;
        if (this.f16796y && !this.f16795x) {
            i = 1;
        } else {
            i = this.I;
        }
        if (i == 2) {
            return (lf) this.f16794w.get();
        }
        return (lf) this.f16793v.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z3;
        try {
            nl nlVar = sl.f10869o4;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                this.f16795x = l();
            }
            boolean z9 = this.E.f20032x;
            boolean z10 = false;
            if (!((Boolean) rVar.f17698c.a(sl.E1)).booleanValue() && z9) {
                z10 = true;
            }
            if (this.f16796y && !this.f16795x) {
                i = 1;
            } else {
                i = this.I;
            }
            if (i == 1) {
                n(z10);
                if (this.I == 2) {
                    this.A.execute(new lt(4, this, z10));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    jf p10 = p(this.C, this.E, z10, this.G);
                    this.f16794w.set(p10);
                    if (this.f16797z) {
                        synchronized (p10) {
                            z3 = p10.K;
                        }
                        if (!z3) {
                            this.I = 1;
                            n(z10);
                        }
                    }
                } catch (NullPointerException e) {
                    this.I = 1;
                    n(z10);
                    this.B.c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
            this.H.countDown();
            this.C = null;
            this.E = null;
        } catch (Throwable th) {
            this.H.countDown();
            this.C = null;
            this.E = null;
            throw th;
        }
    }
}