package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class z10 extends ed1 {
    public final hq0 P;
    public final com.google.android.gms.internal.measurement.e4 Q;
    public final b8.u4 R;
    public final y10 S;
    public final b20 T;
    public final rr1 U;
    public final rr1 V;
    public final rr1 W;
    public final rr1 X;
    public final rr1 Y;
    public final rr1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final rr1 f13034a0;

    /* renamed from: b0, reason: collision with root package name */
    public final rr1 f13035b0;

    /* renamed from: c0, reason: collision with root package name */
    public final rr1 f13036c0;

    /* renamed from: d0, reason: collision with root package name */
    public final rr1 f13037d0;

    /* renamed from: e0, reason: collision with root package name */
    public final rr1 f13038e0;

    /* renamed from: f0, reason: collision with root package name */
    public final rr1 f13039f0;

    /* renamed from: g0, reason: collision with root package name */
    public final rr1 f13040g0;

    /* renamed from: h0, reason: collision with root package name */
    public final rr1 f13041h0;

    /* renamed from: i0, reason: collision with root package name */
    public final rr1 f13042i0;

    /* renamed from: j0, reason: collision with root package name */
    public final rr1 f13043j0;

    /* renamed from: k0, reason: collision with root package name */
    public final rr1 f13044k0;
    public final rr1 l0;
    public final rr1 m0;

    public z10(y10 y10Var, b20 b20Var, hq0 hq0Var, com.google.android.gms.internal.measurement.e4 e4Var, b8.u4 u4Var) {
        this.S = y10Var;
        this.T = b20Var;
        this.P = hq0Var;
        this.Q = e4Var;
        this.R = u4Var;
        g50 g50Var = new g50(hq0Var, 0);
        o90 o90Var = new o90(e4Var, 2);
        g50 g50Var2 = new g50(hq0Var, 3);
        rr1 rr1Var = b20Var.f4681j;
        di diVar = y10Var.I0;
        rr1 rr1Var2 = y10Var.f12716f;
        rr1 a10 = rr1.a(new f60(rr1Var, g50Var, o90Var, g50Var2, rr1Var2, y10Var.f12728m, y10Var.R));
        rr1 a11 = rr1.a(new u50(a10, 8));
        rr1 a12 = rr1.a(new s20(y10Var.J0, 12));
        rr1 a13 = rr1.a(new y30(g50Var, 0));
        u10 u10Var = y10Var.f12720h;
        di diVar2 = ed1.C;
        rr1 a14 = rr1.a(new rw(u10Var, a13, diVar2, 1));
        o10 o10Var = y10Var.f12718g;
        rr1 a15 = rr1.a(new v30(a12, rr1.a(new s30(o10Var, a14, 0)), y10Var.f12711c, rr1.a(new g10(a14, a12, 3)), rr1Var2));
        rr1 a16 = rr1.a(new g10(a15, a13, 5));
        int i = xr1.f12610c;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(b20Var.f4688q);
        arrayList2.add(b20Var.f4689r);
        arrayList.add(a11);
        arrayList2.add(a16);
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
        rr1 a23 = rr1.a(new h30(y10Var.O, y10Var.N, g50Var, g50Var3, a22, b20Var.f4678f));
        o90 o90Var2 = new o90(e4Var, 1);
        rr1 a24 = rr1.a(new s30(a18, (wr1) rr1Var3, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(b20Var.f4694w);
        arrayList3.add(a24);
        rr1 a25 = rr1.a(new rw(new xr1(arrayList3, arrayList4), g50Var, g50Var2, 5));
        rr1 a26 = rr1.a(new z20(8, g50Var2));
        this.W = a26;
        o10 o10Var3 = y10Var.f12718g;
        rr1 rr1Var4 = y10Var.f12711c;
        rr1 a27 = rr1.a(new o30(o10Var3, rr1Var4, y10Var.f12713d, g50Var2, g50Var, b20Var.f4685n, a23, o90Var2, o90Var, y10Var.K, b20Var.f4686o, b20Var.f4678f, b20Var.f4693v, a25, a26, b20Var.f4683l));
        q10 q10Var = new q10(a27, 24);
        u50 u50Var = new u50(rr1.a(new j30(g50Var, y10Var.f12710b0, 0)), 12);
        rr1 rr1Var5 = y10Var.F0;
        rr1 rr1Var6 = y10Var.f12728m;
        rr1 a28 = rr1.a(new f60(o10Var3, rr1Var5, rr1Var6, g50Var2, g50Var, y10Var.M, diVar2));
        int i10 = 6;
        rr1 a29 = rr1.a(new u50(a28, i10));
        rr1 a30 = rr1.a(new u50(a10, 7));
        rr1 a31 = rr1.a(new s30(a18, (wr1) rr1Var4, i10));
        rr1 a32 = rr1.a(new s20(b20Var.i, 14));
        q10 q10Var2 = new q10(a25, 12);
        q10 q10Var3 = new q10(a27, 26);
        rr1 a33 = rr1.a(new g10(a15, a13, 4));
        u10 u10Var2 = y10Var.f12720h;
        rr1 a34 = rr1.a(new r40(o10Var3, u10Var2, g50Var, o90Var, rr1Var6));
        this.X = a34;
        rr1 a35 = rr1.a(new r40((wr1) o10Var3, (sr1) o90Var, (sr1) g50Var, (wr1) u10Var2, (wr1) a34, 4));
        u50 u50Var2 = new u50(a35, 20);
        ArrayList arrayList5 = new ArrayList(9);
        ArrayList arrayList6 = new ArrayList(3);
        arrayList5.add(b20Var.f4695x);
        arrayList5.add(b20Var.f4696y);
        arrayList6.add(b20Var.f4697z);
        arrayList6.add(b20Var.A);
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
        this.Y = a36;
        g50 g50Var4 = new g50(hq0Var, 1);
        rr1 a37 = rr1.a(new u50(a28, i11));
        q10 q10Var4 = new q10(a27, 28);
        ArrayList arrayList7 = new ArrayList(2);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add(b20Var.B);
        arrayList7.add(a37);
        arrayList7.add(q10Var4);
        rr1 a38 = rr1.a(new r40(a36, g50Var, y10Var.f12713d, g50Var4, rr1.a(new r60(new xr1(arrayList7, arrayList8), 10))));
        this.Z = a38;
        ax axVar = new ax(e4Var, a38, 12);
        o10 o10Var4 = y10Var.f12718g;
        o60 o60Var = b20Var.e;
        rr1 a39 = rr1.a(new h30(new l40(o10Var4, o60Var, i11), o10Var4, y10Var.f12753z, new o90(e4Var, 0), x21.Y, g50Var));
        this.f13034a0 = a39;
        u50 u50Var3 = new u50(a39, 26);
        ArrayList arrayList9 = new ArrayList(5);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(b20Var.f4690s);
        arrayList10.add(b20Var.f4691t);
        arrayList10.add(b20Var.f4692u);
        arrayList9.add(a19);
        arrayList9.add(q10Var);
        arrayList9.add(u50Var);
        arrayList10.add(axVar);
        arrayList9.add(u50Var3);
        rr1 a40 = rr1.a(new r60(new xr1(arrayList9, arrayList10), 4));
        this.f13035b0 = a40;
        rr1 a41 = rr1.a(new u50(a28, 5));
        rr1 a42 = rr1.a(new s30(a18, (wr1) rr1Var3, 3));
        rr1 a43 = rr1.a(new u50(rr1.a(new l40(y10Var.B0, o60Var, 1)), 3));
        q10 q10Var5 = new q10(a27, 23);
        rr1 a44 = rr1.a(new ax(y10Var.X, g50Var3, 11));
        u50 u50Var4 = new u50(a44, 18);
        ArrayList arrayList11 = new ArrayList(6);
        ArrayList arrayList12 = new ArrayList(3);
        arrayList11.add(b20Var.C);
        arrayList11.add(b20Var.D);
        arrayList12.add(b20Var.E);
        arrayList12.add(b20Var.F);
        arrayList11.add(a41);
        arrayList11.add(a42);
        arrayList12.add(a43);
        arrayList11.add(q10Var5);
        arrayList11.add(u50Var4);
        rr1 a45 = rr1.a(new r60(new xr1(arrayList11, arrayList12), 0));
        this.f13036c0 = a45;
        q10 q10Var6 = new q10(a27, 29);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(b20Var.G);
        arrayList13.add(q10Var6);
        this.f13037d0 = rr1.a(new r60(new xr1(arrayList13, arrayList14), 19));
        q10 q10Var7 = new q10(rr1.a(new j30(g50Var, y10Var.O, 1)), 22);
        ArrayList arrayList15 = new ArrayList(1);
        new ArrayList(1).add(b20Var.H);
        arrayList15.add(q10Var7);
        rr1 a46 = rr1.a(new s30(a18, (wr1) rr1Var3, 10));
        ArrayList arrayList16 = new ArrayList(1);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add(b20Var.I);
        arrayList16.add(a46);
        rr1 a47 = rr1.a(new r60(new xr1(arrayList16, arrayList17), 20));
        this.f13038e0 = a47;
        rr1 a48 = rr1.a(new u50(a10, 9));
        q10 q10Var8 = new q10(a27, 27);
        u50 u50Var5 = new u50(a35, 21);
        rr1 rr1Var7 = b20Var.f4681j;
        k40 k40Var = new k40(rr1Var7, u10Var, g50Var, o60Var);
        ArrayList arrayList18 = new ArrayList(9);
        ArrayList arrayList19 = new ArrayList(4);
        arrayList18.add(b20Var.J);
        arrayList19.add(b20Var.K);
        arrayList18.add(b20Var.L);
        arrayList18.add(b20Var.M);
        arrayList19.add(b20Var.N);
        arrayList19.add(b20Var.O);
        arrayList19.add(b20Var.P);
        arrayList18.add(b20Var.Q);
        arrayList18.add(b20Var.R);
        arrayList18.add(a48);
        arrayList18.add(q10Var8);
        arrayList18.add(u50Var5);
        arrayList18.add(k40Var);
        this.f13039f0 = rr1.a(new r60(new xr1(arrayList18, arrayList19), 5));
        u50 u50Var6 = new u50(rr1.a(new q10(a40, 11)), 1);
        rr1 a49 = rr1.a(new s30(a18, (wr1) rr1Var3, 8));
        u50 u50Var7 = new u50(a35, 22);
        u50 u50Var8 = new u50(a44, 19);
        rr1 a50 = rr1.a(new r40(g50Var2, g50Var, y10Var.f12716f, y10Var.f12728m, y10Var.f12713d));
        u50 u50Var9 = new u50(a50, 25);
        ArrayList arrayList20 = new ArrayList(5);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add(b20Var.T);
        arrayList20.add(u50Var6);
        arrayList20.add(a49);
        arrayList20.add(u50Var7);
        arrayList20.add(u50Var8);
        arrayList20.add(u50Var9);
        rr1 a51 = rr1.a(new r60(new xr1(arrayList20, arrayList21), 9));
        this.f13040g0 = a51;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(b20Var.U);
        this.f13041h0 = rr1.a(new r60(new xr1(list, arrayList22), 24));
        rr1 a52 = rr1.a(new u50(a28, 4));
        u50 u50Var10 = new u50(a38, 17);
        ArrayList arrayList23 = new ArrayList(1);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList23.add(a52);
        arrayList24.add(u50Var10);
        this.f13042i0 = rr1.a(new r60(new xr1(arrayList23, arrayList24), 13));
        rr1 a53 = rr1.a(new s30(a18, (wr1) rr1Var3, 5));
        q10 q10Var9 = new q10(a27, 25);
        u50 u50Var11 = new u50(a38, 14);
        rr1 a54 = rr1.a(new l40(o10Var, b20Var.f4678f, 12));
        this.f13043j0 = a54;
        u50 u50Var12 = new u50(a54, 15);
        ArrayList arrayList25 = new ArrayList(3);
        ArrayList arrayList26 = new ArrayList(2);
        arrayList26.add(b20Var.V);
        arrayList25.add(a53);
        arrayList25.add(q10Var9);
        arrayList26.add(u50Var11);
        arrayList25.add(u50Var12);
        r60 r60Var = new r60(new xr1(arrayList25, arrayList26), 1);
        rr1 a55 = rr1.a(new u50(a28, 0));
        ArrayList arrayList27 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList27.add(a55);
        this.f13044k0 = rr1.a(new rw(r60Var, new xr1(arrayList27, list2), y10Var.f12713d, 4));
        rr1 a56 = rr1.a(new g10(a15, a13, 6));
        u50 u50Var13 = new u50(a38, 24);
        List list3 = Collections.EMPTY_LIST;
        ArrayList arrayList28 = new ArrayList(3);
        arrayList28.add(b20Var.X);
        arrayList28.add(a56);
        arrayList28.add(u50Var13);
        rr1 a57 = rr1.a(new rw(rr1Var7, new xr1(list3, arrayList28), g50Var, 6));
        rr1 a58 = rr1.a(new rw(rr1Var7, u10Var, g50Var, 3));
        rr1 a59 = rr1.a(new s30((wr1) rr1Var7, a58, 2));
        ax axVar2 = new ax(e4Var, rr1Var3, 13);
        ArrayList arrayList29 = new ArrayList(1);
        ArrayList arrayList30 = new ArrayList(1);
        arrayList30.add(b20Var.Y);
        arrayList29.add(axVar2);
        this.l0 = rr1.a(new hd0(a45, a40, b20Var.W, a51, b20Var.S, y10Var.f12711c, a57, a15, a59, a58, y10Var.K, rr1.a(new r60(new xr1(arrayList29, arrayList30), 12)), y10Var.M, y10Var.O, y10Var.f12728m, a47, a22, a21, y10Var.f12736q0, a50, a26, y10Var.R));
        u50 u50Var14 = new u50(rr1.a(new u50(a17, 29)), 27);
        u50 u50Var15 = new u50(a54, 16);
        ArrayList arrayList31 = new ArrayList(1);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add(u50Var14);
        arrayList31.add(u50Var15);
        this.m0 = rr1.a(new g10(a51, rr1.a(new r60(new xr1(arrayList31, arrayList32), 18)), 8));
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [com.google.android.gms.internal.ads.jr0, com.google.android.gms.internal.ads.um1] */
    public final a40 l0() {
        hq0 hq0Var = this.P;
        wp0 wp0Var = (wp0) hq0Var.f6872v;
        lo1.b(wp0Var);
        qp0 qp0Var = (qp0) hq0Var.f6873w;
        lo1.b(qp0Var);
        e70 e70Var = (e70) this.U.zzb();
        j70 j70Var = (j70) this.f13039f0.zzb();
        b20 b20Var = this.T;
        jo0 jo0Var = b20Var.f4675b.f9436o;
        p60 p60Var = new p60(qp0Var, (String) hq0Var.f6874x, (ii0) b20Var.f4682k.zzb(), hq0Var.x(), (String) b20Var.f4679g.zzb());
        c80 c80Var = (c80) this.V.zzb();
        p80 p80Var = b20Var.f4675b;
        i51 u9 = j51.u(2);
        u9.g(p80Var.f9429g);
        gf0 gf0Var = (gf0) b20Var.f4680h.zzb();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        u9.f(new c90(gf0Var, wxVar));
        um1 um1Var = new um1((Set) u9.h());
        a90 a90Var = (a90) this.f13037d0.zzb();
        c60 c60Var = (c60) this.W.zzb();
        y10 y10Var = this.S;
        hb hbVar = new hb(wp0Var, qp0Var, e70Var, j70Var, jo0Var, p60Var, c80Var, um1Var, a90Var, c60Var, (me0) y10Var.f12736q0.zzb());
        Context context = (Context) b20Var.f4681j.zzb();
        com.google.android.gms.internal.measurement.e4 e4Var = this.Q;
        h00 h00Var = (h00) e4Var.f13729w;
        int i = this.R.f2825v;
        rr1 rr1Var = y10Var.f12728m;
        be0 be0Var = (be0) rr1Var.zzb();
        lo1.b(wp0Var);
        j6.e eVar = new j6.e(be0Var, wp0Var);
        s90 s90Var = (s90) e4Var.f13728v;
        i51 u10 = j51.u(3);
        Set q10 = e4Var.q((a60) this.Z.zzb());
        lo1.b(q10);
        u10.g(q10);
        v90 v90Var = (v90) this.f13034a0.zzb();
        wx wxVar2 = xx.f12657h;
        u10.f(new c90(v90Var, wxVar2));
        u10.f(new c90((mr0) this.f13043j0.zzb(), wxVar2));
        return new a40(hbVar, context, h00Var, i, eVar, s90Var, new um1((Set) u10.h()), (y60) this.f13044k0.zzb(), ((px) y10Var.F.zzb()).f9634c, (be0) rr1Var.zzb());
    }
}
