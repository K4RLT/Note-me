package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ku1 implements ie, by1, kw1 {

    /* renamed from: a, reason: collision with root package name */
    public final s6 f7881a;

    /* renamed from: b, reason: collision with root package name */
    public final qg f7882b;

    /* renamed from: c, reason: collision with root package name */
    public final ah f7883c;

    /* renamed from: d, reason: collision with root package name */
    public final k60 f7884d;
    public final SparseArray e;

    /* renamed from: f, reason: collision with root package name */
    public ig0 f7885f;

    /* renamed from: g, reason: collision with root package name */
    public eu1 f7886g;

    /* renamed from: h, reason: collision with root package name */
    public io0 f7887h;
    public boolean i;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.k60, java.lang.Object] */
    public ku1(s6 s6Var) {
        s6Var.getClass();
        this.f7881a = s6Var;
        String str = bq0.f4860a;
        Looper myLooper = Looper.myLooper();
        this.f7885f = new ig0((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        qg qgVar = new qg();
        this.f7882b = qgVar;
        this.f7883c = new ah();
        Object obj = new Object();
        obj.f7666a = qgVar;
        b51 b51Var = d51.f5314v;
        obj.f7667b = y51.f12781y;
        obj.f7668c = d61.A;
        this.f7884d = obj;
        this.e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void A() {
        p(u(), 23, new iu1(15));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void a() {
        p(r(), 14, new iu1(14));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void a0(int i) {
        gu1 r8 = r();
        p(r8, 4, new b8.u4(r8, i));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void b() {
        p(r(), 3, new iu1(5));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void b0(ir irVar) {
        gu1 u9 = u();
        p(u9, 25, new to0(u9, irVar, 13));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void c() {
        p(r(), 1, new iu1(3));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void c0(ze zeVar, ze zeVar2, int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        eu1 eu1Var = this.f7886g;
        eu1Var.getClass();
        k60 k60Var = this.f7884d;
        k60Var.f7669d = k60.m(eu1Var, (d51) k60Var.f7667b, (yx1) k60Var.e, (qg) k60Var.f7666a);
        gu1 r8 = r();
        p(r8, 11, new b8.u4(r8, i, zeVar, zeVar2));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void d() {
        p(r(), -1, new iu1(7));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void d0(ns1 ns1Var) {
        gu1 r8;
        yx1 yx1Var;
        if (ns1Var != null && (yx1Var = ns1Var.B) != null) {
            r8 = t(yx1Var);
        } else {
            r8 = r();
        }
        p(r8, 10, new iu1(12));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void e() {
        p(r(), 13, new iu1(6));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void e0(ns1 ns1Var) {
        gu1 r8;
        yx1 yx1Var;
        if (ns1Var != null && (yx1Var = ns1Var.B) != null) {
            r8 = t(yx1Var);
        } else {
            r8 = r();
        }
        p(r8, 10, new zq0(r8, ns1Var));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void f() {
        p(r(), 5, new iu1(8));
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void g(int i, yx1 yx1Var, vx1 vx1Var) {
        gu1 w10 = w(i, yx1Var);
        p(w10, 1004, new j6.e(w10, vx1Var));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void h() {
        p(r(), 7, new iu1(11));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void i() {
        p(r(), 6, new iu1(9));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void j() {
        p(u(), 21, new iu1(16));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void k() {
        p(r(), 2, new iu1(4));
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void l(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var, int i10) {
        p(w(i, yx1Var), AdError.NETWORK_ERROR_CODE, new tn1(28, (byte) 0));
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void m(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var, IOException iOException, boolean z3) {
        gu1 w10 = w(i, yx1Var);
        p(w10, 1003, new lt0(w10, qx1Var, vx1Var, iOException, z3));
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void n(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        p(w(i, yx1Var), AdError.NO_FILL_ERROR_CODE, new tn1(29, (byte) 0));
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void o(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        p(w(i, yx1Var), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new iu1(0));
    }

    public final void p(gu1 gu1Var, int i, ie0 ie0Var) {
        this.e.put(i, gu1Var);
        ig0 ig0Var = this.f7885f;
        ig0Var.c(i, ie0Var);
        ig0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void q() {
        p(r(), 12, new iu1(13));
    }

    public final gu1 r() {
        return t((yx1) this.f7884d.f7669d);
    }

    public final gu1 s(uh uhVar, int i, yx1 yx1Var) {
        yx1 yx1Var2;
        if (true == uhVar.g()) {
            yx1Var2 = null;
        } else {
            yx1Var2 = yx1Var;
        }
        this.f7881a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (uhVar.equals(this.f7886g.J1()) && i == this.f7886g.N1()) {
            z3 = true;
        }
        long j10 = 0;
        if (yx1Var2 != null && yx1Var2.b()) {
            if (z3 && this.f7886g.q0() == yx1Var2.f13004b && this.f7886g.Z1() == yx1Var2.f13005c) {
                j10 = this.f7886g.W1();
            }
        } else if (z3) {
            eu1 eu1Var = this.f7886g;
            eu1Var.f5814x.b();
            ys1 ys1Var = eu1Var.f5813w;
            ys1Var.Q0();
            j10 = ys1Var.a2(ys1Var.f12954r0);
        } else if (!uhVar.g()) {
            uhVar.b(i, this.f7883c, 0L).getClass();
            j10 = bq0.t(0L);
        }
        long j11 = j10;
        yx1 yx1Var3 = (yx1) this.f7884d.f7669d;
        uh J1 = this.f7886g.J1();
        int N1 = this.f7886g.N1();
        long W1 = this.f7886g.W1();
        eu1 eu1Var2 = this.f7886g;
        eu1Var2.f5814x.b();
        return new gu1(elapsedRealtime, uhVar, i, yx1Var2, j11, J1, N1, yx1Var3, W1, eu1Var2.f5813w.r2());
    }

    public final gu1 t(yx1 yx1Var) {
        uh uhVar;
        this.f7886g.getClass();
        if (yx1Var == null) {
            uhVar = null;
        } else {
            uhVar = (uh) ((d61) this.f7884d.f7668c).get(yx1Var);
        }
        if (yx1Var != null && uhVar != null) {
            return s(uhVar, uhVar.o(yx1Var.f13003a, this.f7882b).f9841c, yx1Var);
        }
        int N1 = this.f7886g.N1();
        uh J1 = this.f7886g.J1();
        if (N1 >= J1.a()) {
            J1 = uh.f11636a;
        }
        return s(J1, N1, null);
    }

    public final gu1 u() {
        return t((yx1) this.f7884d.f7670f);
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void v() {
        p(u(), 22, new tn1(19, (byte) 0));
    }

    public final gu1 w(int i, yx1 yx1Var) {
        eu1 eu1Var = this.f7886g;
        eu1Var.getClass();
        if (yx1Var != null) {
            if (((uh) ((d61) this.f7884d.f7668c).get(yx1Var)) != null) {
                return t(yx1Var);
            }
            return s(uh.f11636a, i, yx1Var);
        }
        uh J1 = eu1Var.J1();
        if (i >= J1.a()) {
            J1 = uh.f11636a;
        }
        return s(J1, i, null);
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void x() {
        p(u(), 24, new tn1(27, (byte) 0));
    }

    public final void y(eu1 eu1Var, Looper looper) {
        boolean z3 = true;
        if (this.f7886g != null && !((d51) this.f7884d.f7667b).isEmpty()) {
            z3 = false;
        }
        b80.K(z3);
        this.f7886g = eu1Var;
        s6 s6Var = this.f7881a;
        this.f7887h = s6Var.x(looper, null);
        ig0 ig0Var = this.f7885f;
        j6.l lVar = new j6.l(this, 10, eu1Var);
        ig0Var.getClass();
        this.f7885f = new ig0(ig0Var.f7134d, looper, looper.getThread(), s6Var, lVar, ig0Var.i);
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void zzb() {
        eu1 eu1Var = this.f7886g;
        eu1Var.getClass();
        k60 k60Var = this.f7884d;
        k60Var.f7669d = k60.m(eu1Var, (d51) k60Var.f7667b, (yx1) k60Var.e, (qg) k60Var.f7666a);
        k60Var.k(eu1Var.J1());
        p(r(), 0, new iu1(2));
    }

    @Override // com.google.android.gms.internal.ads.ie
    public final void zza() {
    }
}
