package com.google.android.gms.internal.ads;
import l9.a;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c20 extends ed1 {
    public final tw P;
    public final hq0 Q;
    public final y10 R;
    public final d20 S;
    public final rr1 T;
    public final rr1 U;
    public final rr1 V;
    public final rr1 W;
    public final rr1 X;
    public final rr1 Y;
    public final rr1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final rr1 f4959a0;

    /* renamed from: b0, reason: collision with root package name */
    public final rr1 f4960b0;

    /* renamed from: c0, reason: collision with root package name */
    public final rr1 f4961c0;

    /* renamed from: d0, reason: collision with root package name */
    public final rr1 f4962d0;

    /* renamed from: e0, reason: collision with root package name */
    public final rr1 f4963e0;

    /* renamed from: f0, reason: collision with root package name */
    public final rr1 f4964f0;

    /* renamed from: g0, reason: collision with root package name */
    public final rr1 f4965g0;

    /* renamed from: h0, reason: collision with root package name */
    public final rr1 f4966h0;

    /* renamed from: i0, reason: collision with root package name */
    public final rr1 f4967i0;

    /* renamed from: j0, reason: collision with root package name */
    public final rr1 f4968j0;

    /* renamed from: k0, reason: collision with root package name */
    public final rr1 f4969k0;
    public final rr1 l0;
    public final um0 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final rr1 f4970n0;

    /* renamed from: o0, reason: collision with root package name */
    public final rr1 f4971o0;

    public c20(y10 y10Var, d20 d20Var, hq0 hq0Var, tw twVar) {
        this.R = y10Var;
        this.S = d20Var;
        this.P = twVar;
        this.Q = hq0Var;
        g50 g50Var = new g50(hq0Var, 0);
        j40 j40Var = new j40(twVar, 3);
        g50 g50Var2 = new g50(hq0Var, 3);
        rr1 rr1Var = d20Var.f5273j;
        di diVar = y10Var.I0;
        rr1 rr1Var2 = y10Var.f12716f;
        rr1 a10 = rr1.a(new f60(rr1Var, g50Var, j40Var, g50Var2, rr1Var2, y10Var.f12728m, y10Var.R));
        rr1 a11 = rr1.a(new u50(a10, 8));
        rr1 a12 = rr1.a(new s20(y10Var.J0, 12));
        rr1 a13 = rr1.a(new y30(g50Var, 0));
        u10 u10Var = y10Var.f12720h;
        di diVar2 = ct.f5156x;
        rr1 a14 = rr1.a(new rw(u10Var, a13, diVar2, 1));
        o10 o10Var = y10Var.f12718g;
        rr1 a15 = rr1.a(new v30(a12, rr1.a(new s30(o10Var, a14, 0)), y10Var.f12711c, rr1.a(new g10(a14, a12, 3)), rr1Var2));
        this.T = a15;
        rr1 a16 = rr1.a(new g10(a15, a13, 5));
        z20 z20Var = new z20(15, new z20(14, j40Var));
        int i = xr1.f12610c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(d20Var.f5284u);
        arrayList2.add(d20Var.f5285v);
        arrayList.add(a11);
        arrayList2.add(a16);
        arrayList.add(z20Var);
        rr1 a17 = rr1.a(new r60(new xr1(arrayList, arrayList2), 3));
        this.U = a17;
        rr1 a18 = rr1.a(ay0.f4632x);
        this.V = a18;
        rr1 rr1Var3 = y10Var.f12711c;
        rr1 a19 = rr1.a(new s30(a18, (wr1) rr1Var3, 4));
        g50 g50Var3 = new g50(hq0Var, 2);
        o10 o10Var2 = y10Var.f12718g;
        rr1 a20 = rr1.a(new s20(o10Var2, 24));
        rr1 a21 = rr1.a(ed1.E);
        rr1 a22 = rr1.a(new h30(o10Var2, y10Var.G, a20, a21, y10Var.G0, y10Var.f12713d));
        rr1 a23 = rr1.a(new h30(y10Var.O, y10Var.N, g50Var, g50Var3, a22, d20Var.f5275l));
        j40 j40Var2 = new j40(twVar, 0);
        rr1 a24 = rr1.a(new s30(a18, (wr1) rr1Var3, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(d20Var.A);
        arrayList3.add(a24);
        rr1 a25 = rr1.a(new rw(new xr1(arrayList3, arrayList4), g50Var, g50Var2, 5));
        rr1 a26 = rr1.a(new z20(8, g50Var2));
        this.W = a26;
        rr1 a27 = rr1.a(new o30(y10Var.f12718g, y10Var.f12711c, y10Var.f12713d, g50Var2, g50Var, d20Var.f5279p, a23, j40Var2, j40Var, y10Var.K, d20Var.f5280q, d20Var.f5275l, d20Var.f5289z, a25, a26, d20Var.f5274k));
        this.X = a27;
        q10 q10Var = new q10(a27, 24);
        u50 u50Var = new u50(rr1.a(new j30(g50Var, y10Var.f12710b0, 0)), 12);
        ArrayList arrayList5 = new ArrayList(4);
        ArrayList arrayList6 = new ArrayList(2);
        arrayList5.add(d20Var.f5286w);
        arrayList6.add(d20Var.f5287x);
        arrayList6.add(d20Var.f5288y);
        arrayList5.add(a19);
        arrayList5.add(q10Var);
        arrayList5.add(u50Var);
        rr1 a28 = rr1.a(new r60(new xr1(arrayList5, arrayList6), 4));
        this.Y = a28;
        rr1 a29 = rr1.a(new f60(y10Var.f12718g, y10Var.F0, y10Var.f12728m, g50Var2, g50Var, y10Var.M, diVar2));
        rr1 a30 = rr1.a(new u50(a29, 5));
        int i10 = 3;
        rr1 a31 = rr1.a(new s30(a18, (wr1) rr1Var3, i10));
        rr1 rr1Var4 = y10Var.B0;
        o60 o60Var = d20Var.f5266f;
        rr1 a32 = rr1.a(new u50(rr1.a(new l40(rr1Var4, o60Var, 1)), i10));
        q10 q10Var2 = new q10(a27, 23);
        ArrayList arrayList7 = new ArrayList(5);
        ArrayList arrayList8 = new ArrayList(3);
        arrayList7.add(d20Var.B);
        arrayList7.add(d20Var.C);
        arrayList8.add(d20Var.D);
        arrayList8.add(d20Var.E);
        arrayList7.add(a30);
        arrayList7.add(a31);
        arrayList8.add(a32);
        arrayList7.add(q10Var2);
        rr1 a33 = rr1.a(new r60(new xr1(arrayList7, arrayList8), 0));
        this.Z = a33;
        o10 o10Var3 = y10Var.f12718g;
        u10 u10Var2 = y10Var.f12720h;
        rr1 rr1Var5 = y10Var.f12728m;
        rr1 a34 = rr1.a(new r40(o10Var3, u10Var2, g50Var, j40Var, rr1Var5));
        this.f4959a0 = a34;
        rr1 a35 = rr1.a(new r40((wr1) o10Var3, (sr1) j40Var, (sr1) g50Var, (wr1) u10Var2, (wr1) a34, 0));
        this.f4960b0 = a35;
        int i11 = 7;
        q10 q10Var3 = new q10(a35, i11);
        z20 z20Var2 = new z20(3, new rw(j40Var, rr1Var5, g50Var, 2));
        rr1 a36 = rr1.a(new u50(a29, 6));
        rr1 a37 = rr1.a(new u50(a10, i11));
        rr1 a38 = rr1.a(new s30(a18, (wr1) rr1Var3, 6));
        rr1 a39 = rr1.a(new s20(d20Var.f5277n, 14));
        q10 q10Var4 = new q10(a25, 12);
        q10 q10Var5 = new q10(a27, 26);
        rr1 a40 = rr1.a(new g10(a15, a13, 4));
        ArrayList arrayList9 = new ArrayList(10);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(d20Var.F);
        arrayList9.add(d20Var.G);
        arrayList10.add(d20Var.H);
        arrayList10.add(d20Var.I);
        arrayList9.add(q10Var3);
        arrayList9.add(z20Var2);
        arrayList9.add(a36);
        arrayList9.add(a37);
        arrayList9.add(a38);
        arrayList9.add(a39);
        arrayList9.add(q10Var4);
        arrayList9.add(q10Var5);
        arrayList10.add(a40);
        rr1 a41 = rr1.a(new r60(new xr1(arrayList9, arrayList10), 2));
        this.f4961c0 = a41;
        q10 q10Var6 = new q10(a27, 29);
        ArrayList arrayList11 = new ArrayList(1);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add(d20Var.J);
        arrayList11.add(q10Var6);
        rr1 a42 = rr1.a(new r60(new xr1(arrayList11, arrayList12), 19));
        this.f4962d0 = a42;
        q10 q10Var7 = new q10(rr1.a(new j30(g50Var, y10Var.O, 1)), 22);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(d20Var.K);
        arrayList13.add(q10Var7);
        rr1 a43 = rr1.a(new r60(new xr1(arrayList13, arrayList14), 21));
        this.f4963e0 = a43;
        rr1 a44 = rr1.a(new s30(a18, (wr1) rr1Var3, 10));
        ArrayList arrayList15 = new ArrayList(1);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add(d20Var.L);
        arrayList15.add(a44);
        rr1 a45 = rr1.a(new r60(new xr1(arrayList15, arrayList16), 20));
        this.f4964f0 = a45;
        rr1 a46 = rr1.a(new s30(a18, (wr1) rr1Var3, 7));
        q10 q10Var8 = new q10(a25, 13);
        ArrayList arrayList17 = new ArrayList(2);
        ArrayList arrayList18 = new ArrayList(1);
        arrayList18.add(d20Var.S);
        arrayList17.add(a46);
        arrayList17.add(q10Var8);
        rr1 a47 = rr1.a(new r60(new xr1(arrayList17, arrayList18), 8));
        rr1 a48 = rr1.a(new u50(a29, 2));
        q10 q10Var9 = new q10(a27, 28);
        ArrayList arrayList19 = new ArrayList(2);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(d20Var.T);
        arrayList19.add(a48);
        arrayList19.add(q10Var9);
        rr1 a49 = rr1.a(new gm(g50Var, a41, a47, rr1.a(new r60(new xr1(arrayList19, arrayList20), 10))));
        this.f4965g0 = a49;
        rr1 a50 = rr1.a(new u50(a10, 9));
        this.f4966h0 = a50;
        u50 u50Var2 = new u50(rr1.a(new q10(a28, 11)), 1);
        rr1 a51 = rr1.a(new s30(a18, (wr1) rr1Var3, 8));
        ArrayList arrayList21 = new ArrayList(2);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(d20Var.V);
        arrayList21.add(u50Var2);
        arrayList21.add(a51);
        rr1 a52 = rr1.a(new r60(new xr1(arrayList21, arrayList22), 9));
        this.f4967i0 = a52;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add(d20Var.W);
        this.f4968j0 = rr1.a(new r60(new xr1(list, arrayList23), 24));
        q10 q10Var10 = new q10(a49, 5);
        rr1 a53 = rr1.a(new u50(a29, 4));
        ArrayList arrayList24 = new ArrayList(1);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList25.add(q10Var10);
        arrayList24.add(a53);
        this.f4969k0 = rr1.a(new r60(new xr1(arrayList24, arrayList25), 13));
        rr1 a54 = rr1.a(new s30(a18, (wr1) rr1Var3, 5));
        q10 q10Var11 = new q10(a27, 25);
        ArrayList arrayList26 = new ArrayList(2);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add(d20Var.X);
        arrayList26.add(a54);
        arrayList26.add(q10Var11);
        r60 r60Var = new r60(new xr1(arrayList26, arrayList27), 1);
        rr1 a55 = rr1.a(new u50(a29, 0));
        ArrayList arrayList28 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList28.add(a55);
        this.l0 = rr1.a(new rw(r60Var, new xr1(arrayList28, list2), y10Var.f12713d, 4));
        q10 q10Var12 = new q10(twVar, a49, 6);
        q10 q10Var13 = new q10(twVar, a35, 8);
        k40 k40Var = new k40(twVar, d20Var.f5273j, y10Var.f12720h, g50Var, d20Var.f5266f);
        q10 q10Var14 = new q10(a27, 27);
        ArrayList arrayList29 = new ArrayList(9);
        ArrayList arrayList30 = new ArrayList(5);
        arrayList29.add(d20Var.M);
        arrayList30.add(d20Var.N);
        arrayList29.add(d20Var.O);
        arrayList29.add(d20Var.P);
        arrayList30.add(d20Var.Z);
        arrayList30.add(d20Var.f5258a0);
        arrayList30.add(d20Var.f5260b0);
        arrayList29.add(d20Var.Q);
        arrayList29.add(d20Var.R);
        arrayList30.add(q10Var12);
        arrayList29.add(q10Var13);
        arrayList29.add(k40Var);
        arrayList29.add(a50);
        arrayList29.add(q10Var14);
        int i12 = 2;
        ax axVar = new ax(twVar, new xr1(arrayList29, arrayList30), i12);
        r40 r40Var = new r40(g50Var, new g50(hq0Var, 1), d20Var.f5278o, g50Var3, d20Var.f5268g);
        ArrayList arrayList31 = new ArrayList(1);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add(d20Var.f5264d0);
        arrayList31.add(d20Var.f5265e0);
        j50 j50Var = new j50(g50Var2, g50Var, a17, axVar, d20Var.f5262c0, r40Var, a18, new r60(new xr1(arrayList31, arrayList32), 6), a42, a26, y10Var.f12736q0);
        j40 j40Var3 = new j40(twVar, 1);
        j40 j40Var4 = new j40(twVar, i12);
        um0 um0Var = new um0();
        this.m0 = um0Var;
        rr1 rr1Var6 = d20Var.f5273j;
        um0.a(um0Var, new r40((wr1) rr1Var6, (wr1) d20Var.Y, (sr1) d20Var.f5266f, (sr1) new z20(2, new g40(j50Var, rr1Var6, j40Var3, j40Var2, j40Var, j40Var4, d20Var.f5267f0, a43, um0Var, y10Var.f12711c)), (wr1) y10Var.f12728m, 14));
        q10 q10Var15 = new q10(a49, 9);
        int i13 = 6;
        q10 q10Var16 = new q10(rr1.a(new z20(6, new l40(o10Var, o60Var, 0))), 10);
        z20 z20Var3 = new z20(4, new ax(j40Var, rr1Var3, 7));
        rr1 a56 = rr1.a(new g10(a15, a13, i13));
        ArrayList arrayList33 = new ArrayList(1);
        ArrayList arrayList34 = new ArrayList(4);
        arrayList34.add(d20Var.f5271h0);
        arrayList34.add(q10Var15);
        arrayList33.add(q10Var16);
        arrayList34.add(z20Var3);
        arrayList34.add(a56);
        xr1 xr1Var = new xr1(arrayList33, arrayList34);
        rr1 rr1Var7 = d20Var.f5273j;
        rr1 a57 = rr1.a(new rw(rr1Var7, xr1Var, g50Var, i13));
        this.f4970n0 = a57;
        rr1 a58 = rr1.a(new rw(rr1Var7, u10Var, g50Var, 3));
        rr1 a59 = rr1.a(new s30((wr1) rr1Var7, a58, i12));
        s20 s20Var = new s20(d20Var.f5281r, 13);
        ArrayList arrayList35 = new ArrayList(1);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add(d20Var.f5272i0);
        arrayList35.add(s20Var);
        rr1 a60 = rr1.a(new r60(new xr1(arrayList35, arrayList36), 12));
        rr1 rr1Var8 = y10Var.f12716f;
        rr1 rr1Var9 = y10Var.f12728m;
        this.f4971o0 = rr1.a(new hd0(a33, a28, d20Var.f5269g0, a52, d20Var.U, y10Var.f12711c, a57, a15, a59, a58, y10Var.K, a60, y10Var.M, y10Var.O, rr1Var9, a45, a22, a21, y10Var.f12736q0, rr1.a(new r40(g50Var2, g50Var, rr1Var8, rr1Var9, y10Var.f12713d)), a26, y10Var.R));
    }

    public final j70 l0() {
        i51 u9 = j51.u(14);
        d20 d20Var = this.S;
        u9.f(d20Var.M.zzb());
        u9.g((Iterable) d20Var.N.zzb());
        u9.f(d20Var.O.zzb());
        u9.f(d20Var.P.zzb());
        ke0 ke0Var = (ke0) d20Var.f5270h.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        Set j10 = v80.j(ke0Var, wxVar);
        lo1.b(j10);
        u9.g(j10);
        u9.g(d20Var.f5257a.f9428f);
        Set set = Collections.EMPTY_SET;
        lo1.b(set);
        u9.g(set);
        u9.f(d20Var.Q.zzb());
        u9.f(d20Var.R.zzb());
        t40 t40Var = (t40) this.f4965g0.zzb();
        wx wxVar2 = xx.f12657h;
        Set singleton = Collections.singleton(new c90(t40Var, wxVar2));
        lo1.b(singleton);
        u9.g(singleton);
        u9.f(new c90((q40) this.f4960b0.zzb(), xx.f12655f));
        Context context = (Context) d20Var.f5273j.zzb();
        k60 k60Var = d20Var.f5259b;
        a aVar = (a) this.R.f12707a.f7599b;
        lo1.b(aVar);
        qp0 qp0Var = (qp0) this.Q.f6873w;
        lo1.b(qp0Var);
        aq0 aq0Var = (aq0) k60Var.f7667b;
        lo1.b(aq0Var);
        u9.f(new c90(new i40(context, aVar, qp0Var, aq0Var, 0), wxVar2));
        u9.f(this.f4966h0.zzb());
        u9.f(new c90((n30) this.X.zzb(), wxVar));
        return this.P.q(u9.h());
    }

    public final f40 m0() {
        hq0 hq0Var = this.Q;
        wp0 wp0Var = (wp0) hq0Var.f6872v;
        lo1.b(wp0Var);
        qp0 qp0Var = (qp0) hq0Var.f6873w;
        lo1.b(qp0Var);
        e70 e70Var = (e70) this.U.zzb();
        j70 l0 = l0();
        d20 d20Var = this.S;
        jo0 jo0Var = d20Var.f5257a.f9436o;
        p60 p60Var = new p60(qp0Var, (String) hq0Var.f6874x, (ii0) d20Var.f5278o.zzb(), hq0Var.x(), (String) d20Var.f5268g.zzb());
        c80 c80Var = (c80) this.V.zzb();
        p80 p80Var = d20Var.f5257a;
        i51 u9 = j51.u(2);
        u9.g(p80Var.f9429g);
        gf0 gf0Var = (gf0) d20Var.i.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        u9.f(new c90(gf0Var, wxVar));
        um1 um1Var = new um1((Set) u9.h());
        a90 a90Var = (a90) this.f4962d0.zzb();
        c60 c60Var = (c60) this.W.zzb();
        y10 y10Var = this.R;
        hb hbVar = new hb(wp0Var, qp0Var, e70Var, l0, jo0Var, p60Var, c80Var, um1Var, a90Var, c60Var, (me0) y10Var.f12736q0.zzb());
        Context context = (Context) d20Var.f5273j.zzb();
        tw twVar = this.P;
        rp0 rp0Var = (rp0) twVar.f11472x;
        lo1.b(rp0Var);
        View view = (View) twVar.f11471w;
        lo1.b(view);
        h00 h00Var = (h00) twVar.f11473y;
        y40 y40Var = (y40) twVar.f11470v;
        wa0 wa0Var = (wa0) d20Var.f5261c.f12502v;
        lo1.b(wa0Var);
        return new f40(hbVar, context, rp0Var, view, h00Var, y40Var, wa0Var, (g90) this.f4963e0.zzb(), rr1.b(this.m0), (Executor) y10Var.f12711c.zzb());
    }
}
