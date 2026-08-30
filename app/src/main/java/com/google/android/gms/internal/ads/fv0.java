package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class fv0 implements fa.b, fa.c, q.g {
    public final Object A;
    public final Object B;

    /* renamed from: u, reason: collision with root package name */
    public final long f6183u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f6184v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f6185w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f6186x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6187y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6188z;

    public fv0(q.u uVar, q.l1 l1Var, Object obj, q.q qVar) {
        j6.n nVar = new j6.n(uVar.f23013a);
        this.f6184v = nVar;
        this.f6185w = l1Var;
        this.f6186x = obj;
        q.q qVar2 = (q.q) l1Var.f22943a.invoke(obj);
        this.f6187y = qVar2;
        this.f6188z = q.e.j(qVar);
        this.B = l1Var.f22944b.invoke(nVar.h(qVar2, qVar));
        if (((q.q) nVar.f18940x) == null) {
            nVar.f18940x = qVar2.c();
        }
        q.q qVar3 = (q.q) nVar.f18940x;
        if (qVar3 != null) {
            int b10 = qVar3.b();
            long j10 = 0;
            for (int i = 0; i < b10; i++) {
                k6.i iVar = (k6.i) nVar.f18938v;
                qVar2.getClass();
                j10 = Math.max(j10, ((long) (Math.exp(((je.e) iVar.f19569v).b(qVar.a(i)) / (p.t0.f22259a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.f6183u = j10;
            q.q j11 = q.e.j(((j6.n) this.f6184v).i(j10, (q.q) this.f6187y, qVar));
            this.A = j11;
            int b11 = j11.b();
            for (int i10 = 0; i10 < b11; i10++) {
                q.q qVar4 = (q.q) this.A;
                float a10 = qVar4.a(i10);
                ((j6.n) this.f6184v).getClass();
                ((j6.n) this.f6184v).getClass();
                qVar4.e(i10, wa.b9.d(a10, -0.0f, 0.0f));
            }
            return;
        }
        kotlin.jvm.internal.l.h("velocityVector");
        throw null;
    }

    @Override // fa.b
    public void R(int i) {
        try {
            i(4011, this.f6183u, null);
            ((LinkedBlockingQueue) this.f6188z).put(new wv0());
        } catch (InterruptedException unused) {
        }
    }

    @Override // q.g
    public boolean a() {
        return false;
    }

    @Override // q.g
    public long b() {
        return this.f6183u;
    }

    @Override // q.g
    public q.l1 c() {
        return (q.l1) this.f6185w;
    }

    @Override // q.g
    public q.q d(long j10) {
        if (!e(j10)) {
            return ((j6.n) this.f6184v).i(j10, (q.q) this.f6187y, (q.q) this.f6188z);
        }
        return (q.q) this.A;
    }

    @Override // q.g
    public Object f(long j10) {
        float f10;
        if (!e(j10)) {
            df.l lVar = ((q.l1) this.f6185w).f22944b;
            j6.n nVar = (j6.n) this.f6184v;
            q.q qVar = (q.q) this.f6187y;
            q.q qVar2 = (q.q) this.f6188z;
            if (((q.q) nVar.f18939w) == null) {
                nVar.f18939w = qVar.c();
            }
            q.q qVar3 = (q.q) nVar.f18939w;
            String str = "valueVector";
            if (qVar3 != null) {
                int b10 = qVar3.b();
                int i = 0;
                while (true) {
                    q.q qVar4 = (q.q) nVar.f18939w;
                    if (i < b10) {
                        if (qVar4 != null) {
                            k6.i iVar = (k6.i) nVar.f18938v;
                            float a10 = qVar.a(i);
                            long j11 = j10 / 1000000;
                            p.s0 a11 = ((je.e) iVar.f19569v).a(qVar2.a(i));
                            String str2 = str;
                            long j12 = a11.f22251c;
                            if (j12 > 0) {
                                f10 = ((float) j11) / ((float) j12);
                            } else {
                                f10 = 1.0f;
                            }
                            qVar4.e(i, (Math.signum(a11.f22249a) * a11.f22250b * p.c.a(f10).f22100a) + a10);
                            i++;
                            str = str2;
                        } else {
                            kotlin.jvm.internal.l.h(str);
                            throw null;
                        }
                    } else {
                        String str3 = str;
                        if (qVar4 != null) {
                            return lVar.invoke(qVar4);
                        }
                        kotlin.jvm.internal.l.h(str3);
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.l.h("valueVector");
                throw null;
            }
        } else {
            return this.B;
        }
    }

    @Override // q.g
    public Object g() {
        return this.B;
    }

    @Override // fa.b
    public void g0() {
        tv0 tv0Var;
        long j10 = this.f6183u;
        HandlerThread handlerThread = (HandlerThread) this.A;
        try {
            tv0Var = (tv0) ((qv0) this.f6184v).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            tv0Var = null;
        }
        if (tv0Var != null) {
            try {
                vv0 vv0Var = new vv0(1, 1, ((hh) this.f6187y).f6816u, (String) this.f6185w, (String) this.f6186x);
                Parcel g22 = tv0Var.g2();
                qh.c(g22, vv0Var);
                Parcel u22 = tv0Var.u2(g22, 3);
                wv0 wv0Var = (wv0) qh.b(u22, wv0.CREATOR);
                u22.recycle();
                i(5011, j10, null);
                ((LinkedBlockingQueue) this.f6188z).put(wv0Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public void h() {
        qv0 qv0Var = (qv0) this.f6184v;
        if (qv0Var != null) {
            if (qv0Var.h() || qv0Var.e()) {
                qv0Var.o();
            }
        }
    }

    public void i(int i, long j10, Exception exc) {
        cv0 cv0Var = (cv0) this.B;
        if (cv0Var != null) {
            cv0Var.c(i, System.currentTimeMillis() - j10, exc);
        }
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        try {
            i(4012, this.f6183u, null);
            ((LinkedBlockingQueue) this.f6188z).put(new wv0());
        } catch (InterruptedException unused) {
        }
    }

    public fv0(Context context, hh hhVar, String str, String str2, cv0 cv0Var) {
        this.f6185w = str;
        this.f6187y = hhVar;
        this.f6186x = str2;
        this.B = cv0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.A = handlerThread;
        handlerThread.start();
        this.f6183u = System.currentTimeMillis();
        qv0 qv0Var = new qv0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f6184v = qv0Var;
        this.f6188z = new LinkedBlockingQueue();
        qv0Var.m();
    }
}
