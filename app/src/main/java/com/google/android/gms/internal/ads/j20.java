package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class j20 extends ed1 {
    public final hq0 P;
    public final zc0 Q;
    public final y10 R;
    public final k20 S;
    public final rr1 T;
    public final rr1 U;
    public final rr1 V;
    public final rr1 W;
    public final rr1 X;
    public final rr1 Y;
    public final rr1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final rr1 f7288a0;

    /* renamed from: b0, reason: collision with root package name */
    public final rr1 f7289b0;

    /* renamed from: c0, reason: collision with root package name */
    public final rr1 f7290c0;

    /* renamed from: d0, reason: collision with root package name */
    public final rr1 f7291d0;

    /* renamed from: e0, reason: collision with root package name */
    public final rr1 f7292e0;

    /* renamed from: f0, reason: collision with root package name */
    public final rr1 f7293f0;

    /* renamed from: g0, reason: collision with root package name */
    public final rr1 f7294g0;

    /* renamed from: h0, reason: collision with root package name */
    public final rr1 f7295h0;

    /* renamed from: i0, reason: collision with root package name */
    public final rr1 f7296i0;

    /* renamed from: j0, reason: collision with root package name */
    public final rr1 f7297j0;

    /* renamed from: k0, reason: collision with root package name */
    public final rr1 f7298k0;
    public final rr1 l0;
    public final rr1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final rr1 f7299n0;

    /* renamed from: o0, reason: collision with root package name */
    public final rr1 f7300o0;

    public j20(y10 y10Var, k20 k20Var, hq0 hq0Var, zc0 zc0Var) {
        this.R = y10Var;
        this.S = k20Var;
        this.P = hq0Var;
        this.Q = zc0Var;
        g50 g50Var = new g50(hq0Var, 0);
        o90 o90Var = new o90(zc0Var, 2);
        g50 g50Var2 = new g50(hq0Var, 3);
        rr1 rr1Var = k20Var.f7619l;
        di diVar = y10Var.I0;
        rr1 rr1Var2 = y10Var.f12716f;
        rr1 a10 = rr1.a(new f60(rr1Var, g50Var, o90Var, g50Var2, rr1Var2, y10Var.f12728m, y10Var.R));
        rr1 a11 = rr1.a(new u50(a10, 8));
        rr1 a12 = rr1.a(new s20(y10Var.J0, 12));
        rr1 a13 = rr1.a(new y30(g50Var, 0));
        u10 u10Var = y10Var.f12720h;
        ad0 ad0Var = k20Var.f7614f;
        rr1 a14 = rr1.a(new rw(u10Var, a13, ad0Var, 1));
        o10 o10Var = y10Var.f12718g;
        rr1 a15 = rr1.a(new v30(a12, rr1.a(new s30(o10Var, a14, 0)), y10Var.f12711c, rr1.a(new g10(a14, a12, 3)), rr1Var2));
        rr1 a16 = rr1.a(new g10(a15, a13, 5));
        z20 z20Var = new z20(15, new z20(14, o90Var));
        int i = xr1.f12610c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(k20Var.f7627t);
        arrayList2.add(k20Var.f7628u);
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
        rr1 a23 = rr1.a(new h30(y10Var.O, y10Var.N, g50Var, g50Var3, a22, k20Var.f7615g));
        o90 o90Var2 = new o90(zc0Var, 1);
        rr1 a24 = rr1.a(new s30(a18, (wr1) rr1Var3, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(k20Var.A);
        arrayList3.add(a24);
        rr1 a25 = rr1.a(new rw(new xr1(arrayList3, arrayList4), g50Var, g50Var2, 5));
        rr1 a26 = rr1.a(new z20(8, g50Var2));
        this.V = a26;
        o10 o10Var3 = y10Var.f12718g;
        rr1 rr1Var4 = y10Var.f12711c;
        rr1 a27 = rr1.a(new o30(o10Var3, rr1Var4, y10Var.f12713d, g50Var2, g50Var, k20Var.f7624q, a23, o90Var2, o90Var, y10Var.K, k20Var.f7625r, k20Var.f7615g, k20Var.f7633z, a25, a26, k20Var.f7621n));
        q10 q10Var = new q10(a27, 24);
        u50 u50Var = new u50(rr1.a(new j30(g50Var, y10Var.f12710b0, 0)), 12);
        rr1 rr1Var5 = y10Var.F0;
        rr1 rr1Var6 = y10Var.f12728m;
        rr1 a28 = rr1.a(new f60(o10Var3, rr1Var5, rr1Var6, g50Var2, g50Var, y10Var.M, ad0Var));
        int i10 = 6;
        rr1 a29 = rr1.a(new u50(a28, i10));
        rr1 a30 = rr1.a(new u50(a10, 7));
        rr1 a31 = rr1.a(new s30(a18, (wr1) rr1Var4, i10));
        rr1 a32 = rr1.a(new s20(k20Var.f7618k, 14));
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
        arrayList5.add(k20Var.B);
        arrayList5.add(k20Var.C);
        arrayList6.add(k20Var.D);
        arrayList6.add(k20Var.E);
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
        arrayList8.add(k20Var.F);
        arrayList7.add(a37);
        arrayList7.add(q10Var4);
        rr1 a38 = rr1.a(new r40(a36, g50Var, y10Var.f12713d, g50Var4, rr1.a(new r60(new xr1(arrayList7, arrayList8), 10))));
        this.Y = a38;
        ax axVar = new ax(zc0Var, a38, 12);
        o10 o10Var4 = y10Var.f12718g;
        o60 o60Var = k20Var.e;
        rr1 a39 = rr1.a(new h30(new l40(o10Var4, o60Var, i11), o10Var4, y10Var.f12753z, new o90(zc0Var, 0), k20Var.i, g50Var));
        this.Z = a39;
        u50 u50Var3 = new u50(a39, 26);
        ArrayList arrayList9 = new ArrayList(6);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(k20Var.f7629v);
        arrayList10.add(k20Var.f7630w);
        arrayList10.add(k20Var.f7631x);
        arrayList9.add(k20Var.f7632y);
        arrayList9.add(a19);
        arrayList9.add(q10Var);
        arrayList9.add(u50Var);
        arrayList10.add(axVar);
        arrayList9.add(u50Var3);
        rr1 a40 = rr1.a(new r60(new xr1(arrayList9, arrayList10), 4));
        this.f7288a0 = a40;
        rr1 a41 = rr1.a(new u50(a28, 5));
        rr1 a42 = rr1.a(new s30(a18, (wr1) rr1Var3, 3));
        rr1 a43 = rr1.a(new u50(rr1.a(new l40(y10Var.B0, o60Var, 1)), 3));
        q10 q10Var5 = new q10(a27, 23);
        rr1 a44 = rr1.a(new ax(y10Var.X, g50Var3, 11));
        u50 u50Var4 = new u50(a44, 18);
        ArrayList arrayList11 = new ArrayList(6);
        ArrayList arrayList12 = new ArrayList(3);
        arrayList11.add(k20Var.G);
        arrayList11.add(k20Var.H);
        arrayList12.add(k20Var.I);
        arrayList12.add(k20Var.J);
        arrayList11.add(a41);
        arrayList11.add(a42);
        arrayList12.add(a43);
        arrayList11.add(q10Var5);
        arrayList11.add(u50Var4);
        rr1 a45 = rr1.a(new r60(new xr1(arrayList11, arrayList12), 0));
        this.f7289b0 = a45;
        q10 q10Var6 = new q10(a27, 29);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(k20Var.K);
        arrayList13.add(q10Var6);
        this.f7290c0 = rr1.a(new r60(new xr1(arrayList13, arrayList14), 19));
        q10 q10Var7 = new q10(rr1.a(new j30(g50Var, y10Var.O, 1)), 22);
        ArrayList arrayList15 = new ArrayList(1);
        new ArrayList(1).add(k20Var.L);
        arrayList15.add(q10Var7);
        rr1 a46 = rr1.a(new s30(a18, (wr1) rr1Var3, 10));
        ArrayList arrayList16 = new ArrayList(1);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add(k20Var.M);
        arrayList16.add(a46);
        rr1 a47 = rr1.a(new r60(new xr1(arrayList16, arrayList17), 20));
        this.f7291d0 = a47;
        rr1 a48 = rr1.a(new u50(a10, 9));
        q10 q10Var8 = new q10(a27, 27);
        u50 u50Var5 = new u50(a35, 21);
        rr1 rr1Var7 = k20Var.f7619l;
        k40 k40Var = new k40(rr1Var7, u10Var, g50Var, o60Var);
        ArrayList arrayList18 = new ArrayList(9);
        ArrayList arrayList19 = new ArrayList(4);
        arrayList18.add(k20Var.N);
        arrayList19.add(k20Var.O);
        arrayList18.add(k20Var.P);
        arrayList18.add(k20Var.Q);
        arrayList19.add(k20Var.R);
        arrayList19.add(k20Var.S);
        arrayList19.add(k20Var.T);
        arrayList18.add(k20Var.U);
        arrayList18.add(k20Var.V);
        arrayList18.add(a48);
        arrayList18.add(q10Var8);
        arrayList18.add(u50Var5);
        arrayList18.add(k40Var);
        rr1 a49 = rr1.a(new r60(new xr1(arrayList18, arrayList19), 5));
        this.f7292e0 = a49;
        rr1 a50 = rr1.a(new q10(a40, 11));
        this.f7293f0 = a50;
        u50 u50Var6 = new u50(a50, 1);
        rr1 a51 = rr1.a(new s30(a18, (wr1) rr1Var3, 8));
        rr1 a52 = rr1.a(new g10(a15, a13, 7));
        u50 u50Var7 = new u50(a35, 22);
        u50 u50Var8 = new u50(a44, 19);
        rr1 a53 = rr1.a(new r40(g50Var2, g50Var, y10Var.f12716f, y10Var.f12728m, y10Var.f12713d));
        u50 u50Var9 = new u50(a53, 25);
        ArrayList arrayList20 = new ArrayList(5);
        ArrayList arrayList21 = new ArrayList(2);
        arrayList21.add(k20Var.X);
        arrayList20.add(u50Var6);
        arrayList20.add(a51);
        arrayList21.add(a52);
        arrayList20.add(u50Var7);
        arrayList20.add(u50Var8);
        arrayList20.add(u50Var9);
        rr1 a54 = rr1.a(new r60(new xr1(arrayList20, arrayList21), 9));
        this.f7294g0 = a54;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(k20Var.Y);
        rr1 a55 = rr1.a(new r60(new xr1(list, arrayList22), 24));
        this.f7295h0 = a55;
        rr1 a56 = rr1.a(new u50(a28, 4));
        u50 u50Var10 = new u50(a38, 17);
        ArrayList arrayList23 = new ArrayList(1);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList23.add(a56);
        arrayList24.add(u50Var10);
        rr1 a57 = rr1.a(new r60(new xr1(arrayList23, arrayList24), 13));
        this.f7296i0 = a57;
        rr1 a58 = rr1.a(new s30(a18, (wr1) rr1Var3, 5));
        q10 q10Var9 = new q10(a27, 25);
        u50 u50Var11 = new u50(a38, 14);
        rr1 a59 = rr1.a(new l40(o10Var, k20Var.f7615g, 12));
        this.f7297j0 = a59;
        u50 u50Var12 = new u50(a59, 15);
        ArrayList arrayList25 = new ArrayList(3);
        ArrayList arrayList26 = new ArrayList(2);
        arrayList26.add(k20Var.Z);
        arrayList25.add(a58);
        arrayList25.add(q10Var9);
        arrayList26.add(u50Var11);
        arrayList25.add(u50Var12);
        r60 r60Var = new r60(new xr1(arrayList25, arrayList26), 1);
        rr1 a60 = rr1.a(new u50(a28, 0));
        ArrayList arrayList27 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList27.add(a60);
        rr1 a61 = rr1.a(new rw(r60Var, new xr1(arrayList27, list2), y10Var.f12713d, 4));
        this.f7298k0 = a61;
        u50 u50Var13 = new u50(rr1.a(new u50(a17, 29)), 27);
        u50 u50Var14 = new u50(a59, 16);
        ArrayList arrayList28 = new ArrayList(1);
        ArrayList arrayList29 = new ArrayList(1);
        arrayList29.add(u50Var13);
        arrayList28.add(u50Var14);
        int i12 = 18;
        this.l0 = rr1.a(new g10(a54, rr1.a(new r60(new xr1(arrayList28, arrayList29), i12)), 8));
        u50 u50Var15 = new u50(rr1.a(new ax(a40, g50Var, i12)), 23);
        ArrayList arrayList30 = new ArrayList(1);
        List list3 = Collections.EMPTY_LIST;
        arrayList30.add(u50Var15);
        rr1 a62 = rr1.a(new r60(new xr1(arrayList30, list3), 22));
        this.m0 = a62;
        rr1 a63 = rr1.a(new g10(a15, a13, 6));
        u50 u50Var16 = new u50(a38, 24);
        List list4 = Collections.EMPTY_LIST;
        ArrayList arrayList31 = new ArrayList(3);
        arrayList31.add(k20Var.f7610b0);
        arrayList31.add(a63);
        arrayList31.add(u50Var16);
        rr1 a64 = rr1.a(new rw(rr1Var7, new xr1(list4, arrayList31), g50Var, 6));
        rr1 a65 = rr1.a(new rw(rr1Var7, u10Var, g50Var, 3));
        rr1 a66 = rr1.a(new s30((wr1) rr1Var7, a65, 2));
        ax axVar2 = new ax(zc0Var, rr1Var3, 13);
        ArrayList arrayList32 = new ArrayList(1);
        ArrayList arrayList33 = new ArrayList(1);
        arrayList33.add(k20Var.f7612c0);
        arrayList32.add(axVar2);
        rr1 a67 = rr1.a(new r60(new xr1(arrayList32, arrayList33), 12));
        rr1 rr1Var8 = k20Var.f7608a0;
        rr1 rr1Var9 = k20Var.W;
        this.f7299n0 = rr1.a(new hd0(a45, a40, rr1Var8, a54, rr1Var9, y10Var.f12711c, a64, a15, a66, a65, y10Var.K, a67, y10Var.M, y10Var.O, y10Var.f12728m, a47, a22, a21, y10Var.f12736q0, a53, a26, y10Var.R));
        this.f7300o0 = rr1.a(new j50(a45, a47, a36, a40, a49, a61, rr1Var9, a55, a54, a62, a57));
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.ads.jr0, com.google.android.gms.internal.ads.um1] */
    public final yc0 l0() {
        hq0 hq0Var = this.P;
        wp0 wp0Var = (wp0) hq0Var.f6872v;
        lo1.b(wp0Var);
        qp0 qp0Var = (qp0) hq0Var.f6873w;
        lo1.b(qp0Var);
        e70 e70Var = (e70) this.T.zzb();
        j70 j70Var = (j70) this.f7292e0.zzb();
        k20 k20Var = this.S;
        jo0 jo0Var = k20Var.f7609b.f9436o;
        p60 p60Var = new p60(qp0Var, (String) hq0Var.f6874x, (ii0) k20Var.f7620m.zzb(), hq0Var.x(), (String) k20Var.f7616h.zzb());
        c80 c80Var = (c80) this.U.zzb();
        p80 p80Var = k20Var.f7609b;
        i51 u9 = j51.u(2);
        u9.g(p80Var.f9429g);
        gf0 gf0Var = (gf0) k20Var.f7617j.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        u9.f(new c90(gf0Var, wxVar));
        um1 um1Var = new um1((Set) u9.h());
        a90 a90Var = (a90) this.f7290c0.zzb();
        c60 c60Var = (c60) this.V.zzb();
        y10 y10Var = this.R;
        hb hbVar = new hb(wp0Var, qp0Var, e70Var, j70Var, jo0Var, p60Var, c80Var, um1Var, a90Var, c60Var, (me0) y10Var.f12736q0.zzb());
        Context context = (Context) k20Var.f7619l.zzb();
        zc0 zc0Var = this.Q;
        h00 h00Var = (h00) zc0Var.f13729w;
        s90 s90Var = (s90) zc0Var.f13728v;
        i51 u10 = j51.u(3);
        Set q10 = zc0Var.q((a60) this.Y.zzb());
        lo1.b(q10);
        u10.g(q10);
        v90 v90Var = (v90) this.Z.zzb();
        wx wxVar2 = xx.f12657h;
        u10.f(new c90(v90Var, wxVar2));
        u10.f(new c90((mr0) this.f7297j0.zzb(), wxVar2));
        return new yc0(hbVar, context, h00Var, s90Var, new um1((Set) u10.h()), (y60) this.f7298k0.zzb(), (n70) k20Var.f7608a0.zzb(), (h50) this.f7293f0.zzb(), qp0Var, (gv0) y10Var.N0.zzb(), (yp0) k20Var.f7623p.zzb(), (be0) y10Var.f12728m.zzb());
    }
}
