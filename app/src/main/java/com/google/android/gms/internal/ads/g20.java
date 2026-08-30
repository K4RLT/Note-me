package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g20 extends ed1 {
    public final hq0 P;
    public final com.google.android.gms.internal.measurement.e4 Q;
    public final y10 R;
    public final h20 S;
    public final rr1 T;
    public final rr1 U;
    public final rr1 V;
    public final rr1 W;
    public final rr1 X;
    public final rr1 Y;
    public final rr1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final rr1 f6261a0;

    /* renamed from: b0, reason: collision with root package name */
    public final rr1 f6262b0;

    /* renamed from: c0, reason: collision with root package name */
    public final rr1 f6263c0;

    /* renamed from: d0, reason: collision with root package name */
    public final rr1 f6264d0;

    /* renamed from: e0, reason: collision with root package name */
    public final rr1 f6265e0;

    /* renamed from: f0, reason: collision with root package name */
    public final rr1 f6266f0;

    /* renamed from: g0, reason: collision with root package name */
    public final rr1 f6267g0;

    /* renamed from: h0, reason: collision with root package name */
    public final rr1 f6268h0;

    /* renamed from: i0, reason: collision with root package name */
    public final rr1 f6269i0;

    /* renamed from: j0, reason: collision with root package name */
    public final rr1 f6270j0;

    /* renamed from: k0, reason: collision with root package name */
    public final rr1 f6271k0;
    public final rr1 l0;
    public final rr1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final rr1 f6272n0;

    public g20(y10 y10Var, h20 h20Var, hq0 hq0Var, com.google.android.gms.internal.measurement.e4 e4Var) {
        this.R = y10Var;
        this.S = h20Var;
        this.P = hq0Var;
        this.Q = e4Var;
        g50 g50Var = new g50(hq0Var, 0);
        o90 o90Var = new o90(e4Var, 2);
        g50 g50Var2 = new g50(hq0Var, 3);
        rr1 rr1Var = h20Var.f6551g;
        di diVar = y10Var.I0;
        rr1 rr1Var2 = y10Var.f12716f;
        rr1 a10 = rr1.a(new f60(rr1Var, g50Var, o90Var, g50Var2, rr1Var2, y10Var.f12728m, y10Var.R));
        rr1 a11 = rr1.a(new u50(a10, 8));
        rr1 a12 = rr1.a(new s20(y10Var.J0, 12));
        rr1 a13 = rr1.a(new y30(g50Var, 0));
        u10 u10Var = y10Var.f12720h;
        q90 q90Var = ct.f5157y;
        rr1 a14 = rr1.a(new rw(u10Var, a13, q90Var, 1));
        o10 o10Var = y10Var.f12718g;
        rr1 a15 = rr1.a(new v30(a12, rr1.a(new s30(o10Var, a14, 0)), y10Var.f12711c, rr1.a(new g10(a14, a12, 3)), rr1Var2));
        rr1 a16 = rr1.a(new g10(a15, a13, 5));
        z20 z20Var = new z20(15, new z20(14, o90Var));
        int i = xr1.f12610c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(h20Var.f6559p);
        arrayList2.add(h20Var.f6560q);
        arrayList.add(a11);
        arrayList2.add(a16);
        arrayList.add(z20Var);
        rr1 a17 = rr1.a(new r60(new xr1(arrayList, arrayList2), 3));
        this.T = a17;
        rr1 a18 = rr1.a(ay0.f4632x);
        this.U = a18;
        rr1 rr1Var3 = y10Var.f12711c;
        rr1 a19 = rr1.a(new s30(a18, (wr1) rr1Var3, 4));
        g50 g50Var3 = new g50(hq0Var, 2);
        o10 o10Var2 = y10Var.f12718g;
        rr1 a20 = rr1.a(new s20(o10Var2, 24));
        rr1 a21 = rr1.a(ed1.E);
        rr1 a22 = rr1.a(new h30(o10Var2, y10Var.G, a20, a21, y10Var.G0, y10Var.f12713d));
        rr1 a23 = rr1.a(new h30(y10Var.O, y10Var.N, g50Var, g50Var3, a22, h20Var.i));
        o90 o90Var2 = new o90(e4Var, 1);
        rr1 a24 = rr1.a(new s30(a18, (wr1) rr1Var3, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(h20Var.f6566w);
        arrayList3.add(a24);
        rr1 a25 = rr1.a(new rw(new xr1(arrayList3, arrayList4), g50Var, g50Var2, 5));
        rr1 a26 = rr1.a(new z20(8, g50Var2));
        this.V = a26;
        o10 o10Var3 = y10Var.f12718g;
        rr1 rr1Var4 = y10Var.f12711c;
        rr1 a27 = rr1.a(new o30(o10Var3, rr1Var4, y10Var.f12713d, g50Var2, g50Var, h20Var.f6556m, a23, o90Var2, o90Var, y10Var.K, h20Var.f6557n, h20Var.i, h20Var.f6565v, a25, a26, h20Var.f6552h));
        q10 q10Var = new q10(a27, 24);
        u50 u50Var = new u50(rr1.a(new j30(g50Var, y10Var.f12710b0, 0)), 12);
        rr1 rr1Var5 = y10Var.F0;
        rr1 rr1Var6 = y10Var.f12728m;
        rr1 a28 = rr1.a(new f60(o10Var3, rr1Var5, rr1Var6, g50Var2, g50Var, y10Var.M, q90Var));
        int i10 = 6;
        rr1 a29 = rr1.a(new u50(a28, i10));
        rr1 a30 = rr1.a(new u50(a10, 7));
        rr1 a31 = rr1.a(new s30(a18, (wr1) rr1Var4, i10));
        rr1 a32 = rr1.a(new s20(h20Var.f6554k, 14));
        q10 q10Var2 = new q10(a25, 12);
        q10 q10Var3 = new q10(a27, 26);
        rr1 a33 = rr1.a(new g10(a15, a13, 4));
        u10 u10Var2 = y10Var.f12720h;
        rr1 a34 = rr1.a(new r40(o10Var3, u10Var2, g50Var, o90Var, rr1Var6));
        this.W = a34;
        rr1 a35 = rr1.a(new r40((wr1) o10Var3, (sr1) o90Var, (sr1) g50Var, (wr1) u10Var2, (wr1) a34, 4));
        u50 u50Var2 = new u50(a35, 20);
        ArrayList arrayList5 = new ArrayList(9);
        ArrayList arrayList6 = new ArrayList(3);
        arrayList5.add(h20Var.f6567x);
        arrayList5.add(h20Var.f6568y);
        arrayList6.add(h20Var.f6569z);
        arrayList6.add(h20Var.A);
        arrayList5.add(a29);
        arrayList5.add(a30);
        arrayList5.add(a31);
        arrayList5.add(a32);
        arrayList5.add(q10Var2);
        arrayList5.add(q10Var3);
        arrayList6.add(a33);
        arrayList5.add(u50Var2);
        int i11 = 2;
        rr1 a36 = rr1.a(new r60(new xr1(arrayList5, arrayList6), i11));
        this.X = a36;
        g50 g50Var4 = new g50(hq0Var, 1);
        rr1 a37 = rr1.a(new u50(a28, i11));
        q10 q10Var4 = new q10(a27, 28);
        ArrayList arrayList7 = new ArrayList(2);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add(h20Var.B);
        arrayList7.add(a37);
        arrayList7.add(q10Var4);
        rr1 a38 = rr1.a(new r40(a36, g50Var, y10Var.f12713d, g50Var4, rr1.a(new r60(new xr1(arrayList7, arrayList8), 10))));
        this.Y = a38;
        ax axVar = new ax(e4Var, a38, 12);
        o10 o10Var4 = y10Var.f12718g;
        o60 o60Var = h20Var.f6549d;
        rr1 a39 = rr1.a(new h30(new l40(o10Var4, o60Var, i11), o10Var4, y10Var.f12753z, new o90(e4Var, 0), an1.A, g50Var));
        this.Z = a39;
        u50 u50Var3 = new u50(a39, 26);
        ArrayList arrayList9 = new ArrayList(6);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(h20Var.f6561r);
        arrayList10.add(h20Var.f6562s);
        arrayList10.add(h20Var.f6563t);
        arrayList9.add(h20Var.f6564u);
        arrayList9.add(a19);
        arrayList9.add(q10Var);
        arrayList9.add(u50Var);
        arrayList10.add(axVar);
        arrayList9.add(u50Var3);
        rr1 a40 = rr1.a(new r60(new xr1(arrayList9, arrayList10), 4));
        this.f6261a0 = a40;
        rr1 a41 = rr1.a(new u50(a28, 5));
        rr1 a42 = rr1.a(new s30(a18, (wr1) rr1Var3, 3));
        rr1 a43 = rr1.a(new u50(rr1.a(new l40(y10Var.B0, o60Var, 1)), 3));
        q10 q10Var5 = new q10(a27, 23);
        rr1 a44 = rr1.a(new ax(y10Var.X, g50Var3, 11));
        u50 u50Var4 = new u50(a44, 18);
        ArrayList arrayList11 = new ArrayList(6);
        ArrayList arrayList12 = new ArrayList(3);
        arrayList11.add(h20Var.C);
        arrayList11.add(h20Var.D);
        arrayList12.add(h20Var.E);
        arrayList12.add(h20Var.F);
        arrayList11.add(a41);
        arrayList11.add(a42);
        arrayList12.add(a43);
        arrayList11.add(q10Var5);
        arrayList11.add(u50Var4);
        rr1 a45 = rr1.a(new r60(new xr1(arrayList11, arrayList12), 0));
        this.f6262b0 = a45;
        q10 q10Var6 = new q10(a27, 29);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(h20Var.G);
        arrayList13.add(q10Var6);
        this.f6263c0 = rr1.a(new r60(new xr1(arrayList13, arrayList14), 19));
        q10 q10Var7 = new q10(rr1.a(new j30(g50Var, y10Var.O, 1)), 22);
        ArrayList arrayList15 = new ArrayList(1);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add(h20Var.H);
        arrayList15.add(q10Var7);
        this.f6264d0 = rr1.a(new r60(new xr1(arrayList15, arrayList16), 21));
        rr1 a46 = rr1.a(new s30(a18, (wr1) rr1Var3, 10));
        ArrayList arrayList17 = new ArrayList(1);
        ArrayList arrayList18 = new ArrayList(1);
        arrayList18.add(h20Var.I);
        arrayList17.add(a46);
        rr1 a47 = rr1.a(new r60(new xr1(arrayList17, arrayList18), 20));
        this.f6265e0 = a47;
        rr1 a48 = rr1.a(new u50(a10, 9));
        q10 q10Var8 = new q10(a27, 27);
        u50 u50Var5 = new u50(a35, 21);
        rr1 rr1Var7 = h20Var.f6551g;
        k40 k40Var = new k40(rr1Var7, u10Var, g50Var, o60Var);
        ArrayList arrayList19 = new ArrayList(9);
        ArrayList arrayList20 = new ArrayList(4);
        arrayList19.add(h20Var.J);
        arrayList20.add(h20Var.K);
        arrayList19.add(h20Var.L);
        arrayList19.add(h20Var.M);
        arrayList20.add(h20Var.N);
        arrayList20.add(h20Var.O);
        arrayList20.add(h20Var.P);
        arrayList19.add(h20Var.Q);
        arrayList19.add(h20Var.R);
        arrayList19.add(a48);
        arrayList19.add(q10Var8);
        arrayList19.add(u50Var5);
        arrayList19.add(k40Var);
        this.f6266f0 = rr1.a(new r60(new xr1(arrayList19, arrayList20), 5));
        rr1 a49 = rr1.a(new q10(a40, 11));
        this.f6267g0 = a49;
        u50 u50Var6 = new u50(a49, 1);
        rr1 a50 = rr1.a(new s30(a18, (wr1) rr1Var3, 8));
        rr1 a51 = rr1.a(new g10(a15, a13, 7));
        u50 u50Var7 = new u50(a35, 22);
        u50 u50Var8 = new u50(a44, 19);
        rr1 a52 = rr1.a(new r40(g50Var2, g50Var, y10Var.f12716f, y10Var.f12728m, y10Var.f12713d));
        u50 u50Var9 = new u50(a52, 25);
        ArrayList arrayList21 = new ArrayList(5);
        ArrayList arrayList22 = new ArrayList(2);
        arrayList22.add(h20Var.T);
        arrayList21.add(u50Var6);
        arrayList21.add(a50);
        arrayList22.add(a51);
        arrayList21.add(u50Var7);
        arrayList21.add(u50Var8);
        arrayList21.add(u50Var9);
        rr1 a53 = rr1.a(new r60(new xr1(arrayList21, arrayList22), 9));
        this.f6268h0 = a53;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add(h20Var.U);
        this.f6269i0 = rr1.a(new r60(new xr1(list, arrayList23), 24));
        rr1 a54 = rr1.a(new u50(a28, 4));
        u50 u50Var10 = new u50(a38, 17);
        ArrayList arrayList24 = new ArrayList(1);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList24.add(a54);
        arrayList25.add(u50Var10);
        this.f6270j0 = rr1.a(new r60(new xr1(arrayList24, arrayList25), 13));
        rr1 a55 = rr1.a(new s30(a18, (wr1) rr1Var3, 5));
        q10 q10Var9 = new q10(a27, 25);
        u50 u50Var11 = new u50(a38, 14);
        rr1 a56 = rr1.a(new l40(o10Var, h20Var.i, 12));
        this.f6271k0 = a56;
        u50 u50Var12 = new u50(a56, 15);
        ArrayList arrayList26 = new ArrayList(3);
        ArrayList arrayList27 = new ArrayList(2);
        arrayList27.add(h20Var.V);
        arrayList26.add(a55);
        arrayList26.add(q10Var9);
        arrayList27.add(u50Var11);
        arrayList26.add(u50Var12);
        r60 r60Var = new r60(new xr1(arrayList26, arrayList27), 1);
        rr1 a57 = rr1.a(new u50(a28, 0));
        ArrayList arrayList28 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList28.add(a57);
        this.l0 = rr1.a(new rw(r60Var, new xr1(arrayList28, list2), y10Var.f12713d, 4));
        u50 u50Var13 = new u50(rr1.a(new u50(a17, 29)), 27);
        u50 u50Var14 = new u50(a56, 16);
        ArrayList arrayList29 = new ArrayList(1);
        ArrayList arrayList30 = new ArrayList(1);
        arrayList30.add(u50Var13);
        arrayList29.add(u50Var14);
        this.m0 = rr1.a(new g10(a53, rr1.a(new r60(new xr1(arrayList29, arrayList30), 18)), 8));
        rr1 a58 = rr1.a(new g10(a15, a13, 6));
        u50 u50Var15 = new u50(a38, 24);
        List list3 = Collections.EMPTY_LIST;
        ArrayList arrayList31 = new ArrayList(3);
        arrayList31.add(h20Var.X);
        arrayList31.add(a58);
        arrayList31.add(u50Var15);
        rr1 a59 = rr1.a(new rw(rr1Var7, new xr1(list3, arrayList31), g50Var, 6));
        rr1 a60 = rr1.a(new rw(rr1Var7, u10Var, g50Var, 3));
        rr1 a61 = rr1.a(new s30((wr1) rr1Var7, a60, 2));
        ax axVar2 = new ax(e4Var, rr1Var3, 13);
        ArrayList arrayList32 = new ArrayList(1);
        ArrayList arrayList33 = new ArrayList(1);
        arrayList33.add(h20Var.Y);
        arrayList32.add(axVar2);
        this.f6272n0 = rr1.a(new hd0(a45, a40, h20Var.W, a53, h20Var.S, y10Var.f12711c, a59, a15, a61, a60, y10Var.K, rr1.a(new r60(new xr1(arrayList32, arrayList33), 12)), y10Var.M, y10Var.O, y10Var.f12728m, a47, a22, a21, y10Var.f12736q0, a52, a26, y10Var.R));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.jr0, com.google.android.gms.internal.ads.um1] */
    public final n90 l0() {
        hq0 hq0Var = this.P;
        wp0 wp0Var = (wp0) hq0Var.f6872v;
        lo1.b(wp0Var);
        qp0 qp0Var = (qp0) hq0Var.f6873w;
        lo1.b(qp0Var);
        e70 e70Var = (e70) this.T.zzb();
        j70 j70Var = (j70) this.f6266f0.zzb();
        h20 h20Var = this.S;
        jo0 jo0Var = h20Var.f6546a.f9436o;
        p60 p60Var = new p60(qp0Var, (String) hq0Var.f6874x, (ii0) h20Var.f6555l.zzb(), hq0Var.x(), (String) h20Var.e.zzb());
        c80 c80Var = (c80) this.U.zzb();
        p80 p80Var = h20Var.f6546a;
        i51 u9 = j51.u(2);
        u9.g(p80Var.f9429g);
        gf0 gf0Var = (gf0) h20Var.f6550f.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        u9.f(new c90(gf0Var, wxVar));
        um1 um1Var = new um1((Set) u9.h());
        a90 a90Var = (a90) this.f6263c0.zzb();
        c60 c60Var = (c60) this.V.zzb();
        y10 y10Var = this.R;
        hb hbVar = new hb(wp0Var, qp0Var, e70Var, j70Var, jo0Var, p60Var, c80Var, um1Var, a90Var, c60Var, (me0) y10Var.f12736q0.zzb());
        Context context = (Context) h20Var.f6551g.zzb();
        com.google.android.gms.internal.measurement.e4 e4Var = this.Q;
        h00 h00Var = (h00) e4Var.f13729w;
        i51 u10 = j51.u(3);
        Set q10 = e4Var.q((a60) this.Y.zzb());
        lo1.b(q10);
        u10.g(q10);
        v90 v90Var = (v90) this.Z.zzb();
        wx wxVar2 = xx.f12657h;
        u10.f(new c90(v90Var, wxVar2));
        u10.f(new c90((mr0) this.f6271k0.zzb(), wxVar2));
        return new n90(hbVar, context, h00Var, new um1((Set) u10.h()), (s90) e4Var.f13728v, (h50) this.f6267g0.zzb(), (gv0) y10Var.N0.zzb(), (y60) this.l0.zzb(), ((px) y10Var.F.zzb()).f9634c, (be0) y10Var.f12728m.zzb());
    }
}
