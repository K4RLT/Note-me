package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.an1;
import com.google.android.gms.internal.ads.ap0;
import com.google.android.gms.internal.ads.ay0;
import com.google.android.gms.internal.ads.bb0;
import com.google.android.gms.internal.ads.by1;
import com.google.android.gms.internal.ads.dp0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.gi0;
import com.google.android.gms.internal.ads.gs1;
import com.google.android.gms.internal.ads.h30;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.iq0;
import com.google.android.gms.internal.ads.oi0;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.rr1;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.tk0;
import com.google.android.gms.internal.ads.tr1;
import com.google.android.gms.internal.ads.um0;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.vx1;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.y10;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.ads.ys1;
import com.google.android.gms.internal.ads.yx1;
import com.google.android.gms.internal.ads.zb0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class pw implements a6.w, c7.d0, com.google.android.gms.internal.ads.ba, n9.e, a10, s90, s81, zb0, qa, uq, l9.c, ib.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14820u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14821v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14822w;

    public pw(y10 y10Var, Context context, String str) {
        this.f14820u = 5;
        tr1 a10 = tr1.a(context);
        rr1 rr1Var = y10Var.L0;
        ap0 ap0Var = new ap0(a10, rr1Var, y10Var.M0, 1);
        rr1 a11 = rr1.a(new um0(rr1Var, 11));
        rr1 a12 = rr1.a(ay0.B);
        rr1 a13 = rr1.a(new h30(a10, y10Var.f12711c, y10Var.J, ap0Var, a11, a12));
        this.f14821v = rr1.a(new com.google.android.gms.internal.ads.rw(a13, a11, a12, 29));
        this.f14822w = rr1.a(new bb0(tr1.b(str), a13, a10, a11, a12, y10Var.f12720h, y10Var.K, y10Var.f12728m));
    }

    public static final gs1 n(gs1 gs1Var, List list) {
        HashMap hashMap = new HashMap(gs1Var.f6445a);
        HashSet hashSet = new HashSet(list);
        for (String str : gs1Var.f6445a.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new gs1(hashMap);
    }

    public static void p(pw pwVar, iw iwVar) {
        hq0 hq0Var = (hq0) iwVar.f14489v;
        hq0 hq0Var2 = (hq0) pwVar.f14821v;
        long[] jArr = (long[]) hq0Var2.f6872v;
        long[] jArr2 = (long[]) hq0Var.f6872v;
        long[] jArr3 = (long[]) iwVar.f14490w;
        an1.K(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) hq0Var2.f6873w;
        long[] jArr5 = (long[]) hq0Var.f6873w;
        long[] jArr6 = (long[]) hq0Var.f6874x;
        an1.K(jArr4, jArr5, jArr6);
        an1.K((long[]) hq0Var2.f6874x, jArr6, jArr3);
        an1.K((long[]) pwVar.f14822w, jArr2, jArr5);
    }

    public void A(com.google.android.gms.internal.play_billing.w3 w3Var) {
        if (w3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.r3 q10 = com.google.android.gms.internal.play_billing.s3.q();
            q10.c((com.google.android.gms.internal.play_billing.l3) this.f14821v);
            q10.b();
            com.google.android.gms.internal.play_billing.s3.p((com.google.android.gms.internal.play_billing.s3) q10.f15516v, w3Var);
            ((c7.f0) this.f14822w).q((com.google.android.gms.internal.play_billing.s3) q10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(com.google.android.gms.internal.play_billing.b3 b3Var, com.google.android.gms.internal.play_billing.l3 l3Var) {
        if (b3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.r3 q10 = com.google.android.gms.internal.play_billing.s3.q();
            q10.c(l3Var);
            q10.b();
            com.google.android.gms.internal.play_billing.s3.r((com.google.android.gms.internal.play_billing.s3) q10.f15516v, b3Var);
            ((c7.f0) this.f14822w).q((com.google.android.gms.internal.play_billing.s3) q10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(com.google.android.gms.internal.play_billing.e3 e3Var, com.google.android.gms.internal.play_billing.l3 l3Var) {
        try {
            com.google.android.gms.internal.play_billing.r3 q10 = com.google.android.gms.internal.play_billing.s3.q();
            q10.c(l3Var);
            q10.b();
            com.google.android.gms.internal.play_billing.s3.s((com.google.android.gms.internal.play_billing.s3) q10.f15516v, e3Var);
            ((c7.f0) this.f14822w).q((com.google.android.gms.internal.play_billing.s3) q10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public boolean a() {
        synchronized (this) {
            if (((AtomicBoolean) this.f14822w).get()) {
                return false;
            }
            ((AtomicInteger) this.f14821v).incrementAndGet();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        Context e = ((s5) this.f14821v).e();
        q2 q2Var = (q2) ((tq) this.f14822w).c();
        Pattern pattern = l.f14581a;
        tc.c cVar = new tc.c(e, 1);
        cVar.m("mdd_pds_config");
        cVar.n(n5.i("DestFileGroups", q2Var));
        Uri k3 = cVar.k();
        pa.f(k3);
        return k3;
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14821v;
        try {
            ((com.google.android.gms.internal.ads.ks) this.f14822w).B = (n9.z) obj;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new com.google.android.gms.internal.ads.is(asVar);
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        Exception exc;
        try {
            iq0 iq0Var = (iq0) ((gi0) this.f14821v).f6407b;
            iq0Var.b(z3);
            try {
                iq0Var.f7192a.d1(new oa.b(context));
            } finally {
            }
        } catch (dq0 e) {
            throw new Exception(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void f(xk0 xk0Var) {
        com.google.android.gms.internal.ads.da daVar = (com.google.android.gms.internal.ads.da) this.f14822w;
        if (xk0Var.K() == 0 && (xk0Var.K() & 128) != 0) {
            xk0Var.G(6);
            int B = xk0Var.B() / 4;
            for (int i = 0; i < B; i++) {
                tk0 tk0Var = (tk0) this.f14821v;
                xk0Var.H(tk0Var.f11365a, 0, 4);
                tk0Var.d(0);
                int h3 = tk0Var.h(16);
                tk0Var.f(3);
                if (h3 == 0) {
                    tk0Var.f(13);
                } else {
                    int h10 = tk0Var.h(13);
                    if (daVar.f5353f.get(h10) == null) {
                        daVar.f5353f.put(h10, new com.google.android.gms.internal.ads.ca(new com.google.android.gms.internal.ads.u(daVar, h10)));
                    }
                }
            }
            daVar.f5353f.remove(0);
        }
    }

    public void g(ge.b bVar) {
        boolean z3;
        l6.j jVar = (l6.j) this.f14822w;
        androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.f14821v;
        synchronized (d0Var.f1018a) {
            if (d0Var.f1021d == androidx.lifecycle.d0.i) {
                z3 = true;
            } else {
                z3 = false;
            }
            d0Var.f1021d = bVar;
        }
        if (z3) {
            k.a a10 = k.a.a();
            androidx.lifecycle.b0 b0Var = d0Var.f1024h;
            k.b bVar2 = a10.f19208a;
            if (bVar2.f19211c == null) {
                synchronized (bVar2.f19209a) {
                    try {
                        if (bVar2.f19211c == null) {
                            bVar2.f19211c = k.b.a(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            bVar2.f19211c.post(b0Var);
        }
        if (bVar instanceof a6.v) {
            jVar.j((a6.v) bVar);
        } else if (bVar instanceof a6.t) {
            jVar.l(((a6.t) bVar).f293a);
        }
    }

    @Override // com.google.android.gms.internal.ads.a10
    public /* synthetic */ void h(String str, int i, String str2, boolean z3) {
        ib0 ib0Var = (ib0) this.f14821v;
        Map map = (Map) this.f14822w;
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        ib0Var.f7077b.d(hashMap);
    }

    public void i(m3.e eVar) {
        ea.j jVar = (ea.j) this.f14822w;
        ya.o0 o0Var = (ya.o0) this.f14821v;
        int i = eVar.f20600b;
        if (i == 0) {
            jVar.execute(new ou1(o0Var, 24, eVar.f20599a));
        } else {
            jVar.execute(new c4.i(o0Var, i, 11));
        }
    }

    public void j() {
        synchronized (this) {
            ((AtomicInteger) this.f14821v).decrementAndGet();
            if (((AtomicInteger) this.f14821v).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public /* synthetic */ void k(gs1 gs1Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.f14821v).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!n(gs1Var, list).equals(n((gs1) this.f14822w, list))) {
                    throw null;
                }
            } else {
                g5.q.b();
                return;
            }
        }
        this.f14822w = gs1Var;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    public /* synthetic */ void mo213l(Object obj) {
        ((by1) obj).g(0, (yx1) ((i0.m) this.f14821v).f18055w, (vx1) this.f14822w);
    }

    public void m(com.google.android.gms.internal.play_billing.b3 b3Var) {
        try {
            B(b3Var, (com.google.android.gms.internal.play_billing.l3) this.f14821v);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // l9.c
    public /* synthetic */ l9.k o(String str) {
        new com.facebook.ads.internal.dynamicloading.a((l9.d) this.f14821v, (Context) this.f14822w, str).start();
        return l9.k.f20054u;
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        return ((oc.n) this.f14822w).e.u(new com.google.android.gms.internal.ads.xe(24, this, (Boolean) obj, false));
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f14820u) {
            case 8:
                return;
            default:
                e2 c10 = q1.c(q1.a(), (e2) this.f14821v);
                try {
                    ((qa) this.f14822w).r(obj);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f14820u) {
            case 8:
                rr0 rr0Var = (rr0) this.f14822w;
                rr0Var.b(th);
                rr0Var.a(false);
                ((ur0) this.f14821v).a(rr0Var);
                return;
            default:
                th.getClass();
                e2 c10 = q1.c(q1.a(), (e2) this.f14821v);
                try {
                    ((qa) this.f14822w).t(th);
                    return;
                } finally {
                }
        }
    }

    public void u(com.google.android.gms.internal.play_billing.b3 b3Var, int i, long j10) {
        try {
            com.google.android.gms.internal.play_billing.k3 k3Var = (com.google.android.gms.internal.play_billing.k3) ((com.google.android.gms.internal.play_billing.l3) this.f14821v).l();
            k3Var.b();
            com.google.android.gms.internal.play_billing.l3.C((com.google.android.gms.internal.play_billing.l3) k3Var.f15516v, i);
            com.google.android.gms.internal.play_billing.l3 l3Var = (com.google.android.gms.internal.play_billing.l3) k3Var.a();
            this.f14821v = l3Var;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.k3 k3Var2 = (com.google.android.gms.internal.play_billing.k3) l3Var.l();
                k3Var2.b();
                com.google.android.gms.internal.play_billing.l3.E((com.google.android.gms.internal.play_billing.l3) k3Var2.f15516v, j10);
                l3Var = (com.google.android.gms.internal.play_billing.l3) k3Var2.a();
            }
            B(b3Var, l3Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void v(com.google.android.gms.internal.play_billing.b3 b3Var, long j10, boolean z3) {
        try {
            com.google.android.gms.internal.play_billing.a3 a3Var = (com.google.android.gms.internal.play_billing.a3) b3Var.l();
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) b3Var.u().l();
            o3Var.b();
            com.google.android.gms.internal.play_billing.q3.q((com.google.android.gms.internal.play_billing.q3) o3Var.f15516v, z3);
            a3Var.b();
            com.google.android.gms.internal.play_billing.b3.p((com.google.android.gms.internal.play_billing.b3) a3Var.f15516v, (com.google.android.gms.internal.play_billing.q3) o3Var.a());
            com.google.android.gms.internal.play_billing.b3 b3Var2 = (com.google.android.gms.internal.play_billing.b3) a3Var.a();
            com.google.android.gms.internal.play_billing.l3 l3Var = (com.google.android.gms.internal.play_billing.l3) this.f14821v;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.k3 k3Var = (com.google.android.gms.internal.play_billing.k3) l3Var.l();
                k3Var.b();
                com.google.android.gms.internal.play_billing.l3.E((com.google.android.gms.internal.play_billing.l3) k3Var.f15516v, j10);
                l3Var = (com.google.android.gms.internal.play_billing.l3) k3Var.a();
            }
            B(b3Var2, l3Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(com.google.android.gms.internal.play_billing.b3 b3Var, int i, long j10, boolean z3) {
        try {
            com.google.android.gms.internal.play_billing.k3 k3Var = (com.google.android.gms.internal.play_billing.k3) ((com.google.android.gms.internal.play_billing.l3) this.f14821v).l();
            k3Var.b();
            com.google.android.gms.internal.play_billing.l3.C((com.google.android.gms.internal.play_billing.l3) k3Var.f15516v, i);
            this.f14821v = (com.google.android.gms.internal.play_billing.l3) k3Var.a();
            com.google.android.gms.internal.play_billing.a3 a3Var = (com.google.android.gms.internal.play_billing.a3) b3Var.l();
            com.google.android.gms.internal.play_billing.o3 o3Var = (com.google.android.gms.internal.play_billing.o3) b3Var.u().l();
            o3Var.b();
            com.google.android.gms.internal.play_billing.q3.q((com.google.android.gms.internal.play_billing.q3) o3Var.f15516v, z3);
            a3Var.b();
            com.google.android.gms.internal.play_billing.b3.p((com.google.android.gms.internal.play_billing.b3) a3Var.f15516v, (com.google.android.gms.internal.play_billing.q3) o3Var.a());
            com.google.android.gms.internal.play_billing.b3 b3Var2 = (com.google.android.gms.internal.play_billing.b3) a3Var.a();
            com.google.android.gms.internal.play_billing.l3 l3Var = (com.google.android.gms.internal.play_billing.l3) this.f14821v;
            if (j10 != 0) {
                com.google.android.gms.internal.play_billing.k3 k3Var2 = (com.google.android.gms.internal.play_billing.k3) l3Var.l();
                k3Var2.b();
                com.google.android.gms.internal.play_billing.l3.E((com.google.android.gms.internal.play_billing.l3) k3Var2.f15516v, j10);
                l3Var = (com.google.android.gms.internal.play_billing.l3) k3Var2.a();
            }
            B(b3Var2, l3Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(com.google.android.gms.internal.play_billing.h3 h3Var) {
        try {
            com.google.android.gms.internal.play_billing.r3 q10 = com.google.android.gms.internal.play_billing.s3.q();
            q10.c((com.google.android.gms.internal.play_billing.l3) this.f14821v);
            q10.b();
            com.google.android.gms.internal.play_billing.s3.t((com.google.android.gms.internal.play_billing.s3) q10.f15516v, h3Var);
            ((c7.f0) this.f14822w).q((com.google.android.gms.internal.play_billing.s3) q10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(com.google.android.gms.internal.play_billing.v3 v3Var) {
        try {
            c7.f0 f0Var = (c7.f0) this.f14822w;
            com.google.android.gms.internal.play_billing.r3 q10 = com.google.android.gms.internal.play_billing.s3.q();
            q10.c((com.google.android.gms.internal.play_billing.l3) this.f14821v);
            q10.b();
            com.google.android.gms.internal.play_billing.s3.v((com.google.android.gms.internal.play_billing.s3) q10.f15516v, v3Var);
            f0Var.q((com.google.android.gms.internal.play_billing.s3) q10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((com.google.android.gms.internal.ads.ks) this.f14822w).f7860u.getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14821v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f14822w;
    }

    private final void s(Object obj) {
    }

    public /* synthetic */ pw(Object obj, int i, Object obj2) {
        this.f14820u = i;
        this.f14821v = obj;
        this.f14822w = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c7.f0, java.lang.Object] */
    public pw(Context context, com.google.android.gms.internal.play_billing.l3 l3Var) {
        this.f14820u = 2;
        c7.f0 obj = new Object();
        try {
            n8.q.b(context);
            obj.f3950v = n8.q.a().c(l8.a.e).a("PLAY_BILLING_LIBRARY", new k8.c("proto"), new va.t(10));
        } catch (Throwable unused) {
            obj.f3949u = true;
        }
        this.f14822w = obj;
        this.f14821v = l3Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void b(dp0 dp0Var, com.google.android.gms.internal.ads.p2 p2Var, com.google.android.gms.internal.ads.fa faVar) {
    }

    public pw(com.google.android.gms.internal.ads.da daVar) {
        this.f14820u = 3;
        this.f14822w = daVar;
        this.f14821v = new tk0(new byte[4], 4);
    }

    public /* synthetic */ pw(int i, Object obj, Object obj2, boolean z3) {
        this.f14820u = i;
        this.f14821v = obj2;
        this.f14822w = obj;
    }

    public pw(oi0 oi0Var, gi0 gi0Var, qp0 qp0Var) {
        this.f14820u = 7;
        this.f14821v = gi0Var;
        this.f14822w = qp0Var;
    }

    public /* synthetic */ pw(ys1 ys1Var) {
        this.f14820u = 10;
        this.f14821v = new HashMap();
        this.f14822w = gs1.f6444b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw(iw iwVar) {
        this(9);
        this.f14820u = 9;
        p(this, iwVar);
    }

    public pw(c.f0 f0Var) {
        this.f14820u = 15;
        this.f14821v = new AtomicInteger(0);
        this.f14822w = new AtomicBoolean(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw(int i) {
        this(new hq0(22), 9, new long[10]);
        this.f14820u = i;
        switch (i) {
            case 9:
                return;
            case 19:
                this.f14821v = new w1.c(0);
                this.f14822w = new w1.c(0);
                return;
            case 20:
                return;
            default:
                this.f14821v = new androidx.lifecycle.d0();
                this.f14822w = new Object();
                g(a6.w.f295b);
                return;
        }
    }
}
