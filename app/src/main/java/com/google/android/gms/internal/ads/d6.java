package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final class d6 implements h7, k0.l, q.n1 {

    /* renamed from: u, reason: collision with root package name */
    public long f5315u;

    /* renamed from: v, reason: collision with root package name */
    public long f5316v;

    /* renamed from: w, reason: collision with root package name */
    public Object f5317w;

    /* renamed from: x, reason: collision with root package name */
    public Object f5318x;

    public d6(long j10) {
        boolean z3;
        if (((v) this.f5317w) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        this.f5315u = j10;
        this.f5316v = j10 + 65536;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.d6, java.lang.Object] */
    public static d6 l(c7.f0 f0Var, byte[] bArr, boolean z3) {
        String str;
        f0Var.o();
        ((dd) f0Var.f3950v).f5404c.f11315v = oc.e(bArr);
        List list = (List) f0Var.v(Optional.empty());
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        f0Var.w(longValue, Optional.empty());
        byte[] p10 = x21.p();
        String g8 = r61.f10129d.g(p10, p10.length);
        int length = g8.length();
        if (true != z3) {
            str = "";
        } else {
            str = "-s";
        }
        String o10 = p.a.o(new StringBuilder(str.length() + length + 12), "3.904631200.", g8, str);
        Object obj = new Object();
        obj.f5318x = f0Var;
        obj.f5315u = longValue2;
        obj.f5316v = longValue3;
        obj.f5317w = o10;
        return obj;
    }

    @Override // q.n1
    public boolean a() {
        return true;
    }

    @Override // k0.l
    public void b() {
        k0.y yVar = ((k0.a1) this.f5318x).f19223h;
        if (yVar != null) {
            yVar.invoke();
        }
    }

    @Override // com.google.android.gms.internal.ads.h7
    public a3 c() {
        boolean z3;
        if (this.f5315u != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        return new r2((s2) this.f5317w, this.f5315u, 0);
    }

    public long d(long j10) {
        long j11 = this.f5316v;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f5315u;
        long j14 = j12 / j13;
        if (((q.o0) this.f5318x) != q.o0.f22960u && j14 % 2 != 0) {
            return ((j14 + 1) * j13) - j12;
        }
        return j12 - (j14 * j13);
    }

    @Override // com.google.android.gms.internal.ads.h7
    public long e(o2 o2Var) {
        long j10 = this.f5316v;
        if (j10 < 0) {
            return -1L;
        }
        this.f5316v = -1L;
        return -(j10 + 2);
    }

    @Override // q.n1
    public long f(q.q qVar, q.q qVar2, q.q qVar3) {
        return Long.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public void g(long j10) {
        long[] jArr = (long[]) ((x90) this.f5318x).f12502v;
        this.f5316v = jArr[bq0.s(jArr, j10, true)];
    }

    @Override // k0.l
    public boolean h(long j10, k0.s sVar) {
        z1.x xVar = (z1.x) ((j0.i) this.f5317w).invoke();
        if (xVar != null) {
            k0.a1 a1Var = (k0.a1) this.f5318x;
            long j11 = this.f5316v;
            if (!xVar.i() || !k0.b1.a(a1Var, j11)) {
                return false;
            }
            if (a1Var.b(xVar, j10, this.f5315u, sVar, false)) {
                this.f5315u = j10;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // q.n1
    public q.q i(long j10, q.q qVar, q.q qVar2, q.q qVar3) {
        return ((q.p1) this.f5317w).i(d(j10), qVar, qVar2, k(j10, qVar, qVar3, qVar2));
    }

    @Override // k0.l
    public boolean j(long j10, k0.s sVar) {
        z1.x xVar = (z1.x) ((j0.i) this.f5317w).invoke();
        if (xVar != null) {
            k0.a1 a1Var = (k0.a1) this.f5318x;
            long j11 = this.f5316v;
            if (xVar.i()) {
                e1.m mVar = a1Var.f19221f;
                if (mVar != null) {
                    mVar.d(Boolean.FALSE, xVar, new j1.b(j10), sVar);
                }
                this.f5315u = j10;
                return k0.b1.a(a1Var, j11);
            }
            return false;
        }
        return false;
    }

    public q.q k(long j10, q.q qVar, q.q qVar2, q.q qVar3) {
        long j11 = this.f5316v;
        long j12 = j10 + j11;
        long j13 = this.f5315u;
        if (j12 > j13) {
            return ((q.p1) this.f5317w).m(j13 - j11, qVar, qVar3, qVar2);
        }
        return qVar2;
    }

    @Override // q.n1
    public q.q m(long j10, q.q qVar, q.q qVar2, q.q qVar3) {
        return ((q.p1) this.f5317w).m(d(j10), qVar, qVar2, k(j10, qVar, qVar3, qVar2));
    }

    public boolean n(long j10, boolean z3, boolean z9) {
        eb.z2 z2Var = (eb.z2) this.f5317w;
        eb.v2 v2Var = (eb.v2) this.f5318x;
        v2Var.u();
        v2Var.y();
        eb.d1 d1Var = (eb.d1) v2Var.f3443v;
        if (d1Var.e()) {
            eb.s0 s0Var = v2Var.s().L;
            d1Var.H.getClass();
            s0Var.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f5315u;
        if (!z3 && j11 < 1000) {
            v2Var.f().I.f(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z9) {
            j11 = j10 - this.f5316v;
            this.f5316v = j10;
        }
        v2Var.f().I.f(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        eb.l3.Y(v2Var.w().B(!d1Var.A.I()), bundle, true);
        if (!z9) {
            v2Var.v().c0("auto", bundle, "_e");
        }
        this.f5315u = j10;
        z2Var.a();
        z2Var.b(((Long) eb.v.f16390a0.a(null)).longValue());
        return true;
    }

    public d6(String str, byte[] bArr, long j10, long j11) {
        this.f5317w = str;
        this.f5318x = bArr;
        this.f5315u = j10;
        this.f5316v = j11;
    }
}
