package com.google.android.gms.internal.ads;
import g9.r;
import l9.a;
import oa.b;
import wa.g9;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vi0 implements ji0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11907a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11909c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11910d;
    public Object e;

    public vi0(Context context, a aVar, h20 h20Var, wx wxVar) {
        this.f11908b = context;
        this.f11910d = aVar;
        this.f11909c = h20Var;
        this.e = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final Object a(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        View view;
        int i = this.f11907a;
        Object obj = this.f11909c;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (((Boolean) r.e.f17698c.a(sl.W8)).booleanValue() && qp0Var.f9936g0) {
                    try {
                        view = (View) b.z1(((bs) this.e).u4());
                        boolean b10 = ((bs) this.e).b();
                        if (view != null) {
                            if (b10) {
                                try {
                                    view = (View) ed1.c0(v81.f11836v, new d50(6, this, view, qp0Var), xx.f12655f).get();
                                } catch (InterruptedException | ExecutionException e) {
                                    throw new Exception(e);
                                }
                            }
                        } else {
                            throw new Exception(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                    } catch (RemoteException e8) {
                        throw new Exception(e8);
                    }
                } else {
                    view = (View) this.f11910d;
                }
                d20 d20Var = (d20) obj;
                hq0 hq0Var = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                tw twVar = new tw(view, (h00) null, new lx0(27, gi0Var), (rp0) qp0Var.f9960u.get(0));
                y10 y10Var = d20Var.f5263d;
                d20 d20Var2 = d20Var.e;
                c20 c20Var = new c20(y10Var, d20Var2, hq0Var, twVar);
                ((d90) c20Var.f4970n0.zzb()).U1(view);
                ((zi0) gi0Var.f6408c).w4(new dk0((q60) c20Var.Z.zzb(), (e90) c20Var.f4964f0.zzb(), (a70) c20Var.f4961c0.zzb(), (g70) c20Var.Y.zzb(), c20Var.l0(), (h80) d20Var2.U.zzb(), (r70) c20Var.f4967i0.zzb(), (l90) c20Var.f4968j0.zzb(), (f80) c20Var.f4969k0.zzb(), (y60) c20Var.l0.zzb()));
                return c20Var.m0();
            case 1:
                hq0 hq0Var2 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(6, new hq0(16, this, gi0Var, qp0Var), obj2, false);
                h20 h20Var = (h20) obj;
                y10 y10Var2 = h20Var.f6547b;
                h20 h20Var2 = h20Var.f6548c;
                g20 g20Var = new g20(y10Var2, h20Var2, hq0Var2, e4Var);
                ((e70) g20Var.T.zzb()).L1(new e30(0, (iq0) gi0Var.f6407b), (Executor) this.e);
                ((zi0) gi0Var.f6408c).w4(new gk0((q60) g20Var.f6262b0.zzb(), (e90) g20Var.f6265e0.zzb(), (a70) g20Var.X.zzb(), (g70) g20Var.f6261a0.zzb(), (j70) g20Var.f6266f0.zzb(), (h80) h20Var2.S.zzb(), (r70) g20Var.f6268h0.zzb(), (l90) g20Var.f6269i0.zzb(), (f80) g20Var.f6270j0.zzb(), (y60) g20Var.l0.zzb()));
                return g20Var.l0();
            default:
                ArrayList arrayList = ((aq0) wp0Var.f12312a.f4819v).f4584h;
                if (arrayList.contains(Integer.toString(6))) {
                    ra0 l10 = ra0.l((gs) this.f11910d);
                    if (arrayList.contains(Integer.toString(l10.q()))) {
                        x10 x10Var = (x10) obj;
                        hq0 hq0Var3 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                        tf tfVar = new tf(20, l10);
                        zd1 zd1Var = new zd1((es) null, (ds) null, (gs) this.f11910d);
                        y10 y10Var3 = x10Var.f12401b;
                        x10 x10Var2 = x10Var.f12402c;
                        g50 g50Var = new g50(hq0Var3, 0);
                        q90 q90Var = new q90(3);
                        g50 g50Var2 = new g50(hq0Var3, 3);
                        rr1 rr1Var = x10Var2.f12406h;
                        di diVar = y10Var3.I0;
                        rr1 a10 = rr1.a(new f60(rr1Var, g50Var, q90Var, g50Var2, y10Var3.f12716f, y10Var3.f12728m, y10Var3.R));
                        rr1 a11 = rr1.a(new u50(a10, 8));
                        int i10 = xr1.f12610c;
                        ArrayList arrayList2 = new ArrayList(1);
                        ArrayList arrayList3 = new ArrayList(2);
                        arrayList3.add(x10Var2.f12414q);
                        arrayList3.add(x10Var2.f12415r);
                        arrayList2.add(a11);
                        rr1 a12 = rr1.a(new r60(new xr1(arrayList2, arrayList3), 3));
                        rr1 a13 = rr1.a(ay0.f4632x);
                        rr1 rr1Var2 = y10Var3.f12711c;
                        rr1 a14 = rr1.a(new s30(a13, (wr1) rr1Var2, 4));
                        g50 g50Var3 = new g50(hq0Var3, 2);
                        o10 o10Var = y10Var3.f12718g;
                        rr1 a15 = rr1.a(new h30(y10Var3.O, y10Var3.N, g50Var, g50Var3, rr1.a(new h30(o10Var, y10Var3.G, rr1.a(new s20(o10Var, 24)), rr1.a(ed1.E), y10Var3.G0, y10Var3.f12713d)), x10Var2.e));
                        q90 q90Var2 = new q90(5);
                        rr1 a16 = rr1.a(new s30(a13, (wr1) rr1Var2, 9));
                        rr1 a17 = rr1.a(ay0.f4633y);
                        fa0 fa0Var = new fa0(a17, 3);
                        ArrayList arrayList4 = new ArrayList(2);
                        ArrayList arrayList5 = new ArrayList(1);
                        arrayList5.add(x10Var2.f12420w);
                        arrayList4.add(a16);
                        arrayList4.add(fa0Var);
                        rr1 a18 = rr1.a(new rw(new xr1(arrayList4, arrayList5), g50Var, g50Var2, 5));
                        rr1 a19 = rr1.a(new z20(8, g50Var2));
                        rr1 a20 = rr1.a(new o30(y10Var3.f12718g, y10Var3.f12711c, y10Var3.f12713d, g50Var2, g50Var, x10Var2.f12410m, a15, q90Var2, q90Var, y10Var3.K, x10Var2.f12411n, x10Var2.e, x10Var2.f12419v, a18, a19, x10Var2.f12408k));
                        q10 q10Var = new q10(a20, 24);
                        u50 u50Var = new u50(rr1.a(new j30(g50Var, y10Var3.f12710b0, 0)), 12);
                        ArrayList arrayList6 = new ArrayList(4);
                        ArrayList arrayList7 = new ArrayList(2);
                        arrayList6.add(x10Var2.f12416s);
                        arrayList7.add(x10Var2.f12417t);
                        arrayList7.add(x10Var2.f12418u);
                        arrayList6.add(a14);
                        arrayList6.add(q10Var);
                        arrayList6.add(u50Var);
                        rr1 a21 = rr1.a(new r60(new xr1(arrayList6, arrayList7), 4));
                        rr1 a22 = rr1.a(new f60(y10Var3.f12718g, y10Var3.F0, y10Var3.f12728m, g50Var2, g50Var, y10Var3.M, b80.E));
                        rr1 a23 = rr1.a(new u50(a22, 5));
                        rr1 a24 = rr1.a(new s30(a13, (wr1) rr1Var2, 3));
                        rr1 rr1Var3 = y10Var3.B0;
                        o60 o60Var = x10Var2.f12403d;
                        rr1 a25 = rr1.a(new u50(rr1.a(new l40(rr1Var3, o60Var, 1)), 3));
                        q10 q10Var2 = new q10(a20, 23);
                        ArrayList arrayList8 = new ArrayList(5);
                        ArrayList arrayList9 = new ArrayList(3);
                        arrayList8.add(x10Var2.f12421x);
                        arrayList8.add(x10Var2.f12422y);
                        arrayList9.add(x10Var2.f12423z);
                        arrayList9.add(x10Var2.A);
                        arrayList8.add(a23);
                        arrayList8.add(a24);
                        arrayList9.add(a25);
                        arrayList8.add(q10Var2);
                        rr1 a26 = rr1.a(new r60(new xr1(arrayList8, arrayList9), 0));
                        int i11 = 6;
                        rr1 a27 = rr1.a(new u50(a22, i11));
                        rr1 a28 = rr1.a(new u50(a10, 7));
                        rr1 a29 = rr1.a(new s30(a13, (wr1) rr1Var2, i11));
                        rr1 a30 = rr1.a(new s20(x10Var2.f12405g, 14));
                        q10 q10Var3 = new q10(a18, 12);
                        q10 q10Var4 = new q10(a20, 26);
                        ArrayList arrayList10 = new ArrayList(8);
                        ArrayList arrayList11 = new ArrayList(2);
                        arrayList10.add(x10Var2.B);
                        arrayList10.add(x10Var2.C);
                        arrayList11.add(x10Var2.D);
                        arrayList11.add(x10Var2.E);
                        arrayList10.add(a27);
                        arrayList10.add(a28);
                        arrayList10.add(a29);
                        arrayList10.add(a30);
                        arrayList10.add(q10Var3);
                        arrayList10.add(q10Var4);
                        rr1 a31 = rr1.a(new r60(new xr1(arrayList10, arrayList11), 2));
                        q10 q10Var5 = new q10(a20, 29);
                        ArrayList arrayList12 = new ArrayList(1);
                        ArrayList arrayList13 = new ArrayList(1);
                        arrayList13.add(x10Var2.F);
                        arrayList12.add(q10Var5);
                        rr1 a32 = rr1.a(new r60(new xr1(arrayList12, arrayList13), 19));
                        q10 q10Var6 = new q10(rr1.a(new j30(g50Var, y10Var3.O, 1)), 22);
                        ArrayList arrayList14 = new ArrayList(1);
                        new ArrayList(1).add(x10Var2.G);
                        arrayList14.add(q10Var6);
                        rr1 a33 = rr1.a(new s30(a13, (wr1) rr1Var2, 10));
                        ArrayList arrayList15 = new ArrayList(1);
                        ArrayList arrayList16 = new ArrayList(1);
                        arrayList16.add(x10Var2.H);
                        arrayList15.add(a33);
                        rr1 a34 = rr1.a(new r60(new xr1(arrayList15, arrayList16), 20));
                        rr1 a35 = rr1.a(new u50(a10, 9));
                        q10 q10Var7 = new q10(a20, 27);
                        ArrayList arrayList17 = new ArrayList(7);
                        ArrayList arrayList18 = new ArrayList(4);
                        arrayList17.add(x10Var2.I);
                        arrayList18.add(x10Var2.J);
                        arrayList17.add(x10Var2.K);
                        arrayList17.add(x10Var2.L);
                        arrayList18.add(x10Var2.M);
                        arrayList18.add(x10Var2.N);
                        arrayList18.add(x10Var2.O);
                        arrayList17.add(x10Var2.P);
                        arrayList17.add(x10Var2.Q);
                        arrayList17.add(a35);
                        arrayList17.add(q10Var7);
                        rr1 a36 = rr1.a(new r60(new xr1(arrayList17, arrayList18), 5));
                        u50 u50Var2 = new u50(rr1.a(new q10(a21, 11)), 1);
                        rr1 a37 = rr1.a(new s30(a13, (wr1) rr1Var2, 8));
                        ArrayList arrayList19 = new ArrayList(2);
                        ArrayList arrayList20 = new ArrayList(1);
                        arrayList20.add(x10Var2.S);
                        arrayList19.add(u50Var2);
                        arrayList19.add(a37);
                        rr1 a38 = rr1.a(new r60(new xr1(arrayList19, arrayList20), 9));
                        z20 z20Var = new z20(13, tfVar);
                        ax axVar = new ax(new ja0(z20Var, 1), rr1Var2, 15);
                        ArrayList arrayList21 = new ArrayList(1);
                        ArrayList arrayList22 = new ArrayList(1);
                        arrayList22.add(x10Var2.T);
                        arrayList21.add(axVar);
                        rr1 a39 = rr1.a(new r60(new xr1(arrayList21, arrayList22), 24));
                        rr1 a40 = rr1.a(new u50(a22, 4));
                        pb0 pb0Var = new pb0(zd1Var, 0);
                        pb0 pb0Var2 = new pb0(zd1Var, 1);
                        int i12 = 2;
                        pb0 pb0Var3 = new pb0(zd1Var, i12);
                        rr1 a41 = rr1.a(new u50(a22, i12));
                        q10 q10Var8 = new q10(a20, 28);
                        ArrayList arrayList23 = new ArrayList(2);
                        ArrayList arrayList24 = new ArrayList(1);
                        arrayList24.add(x10Var2.f12400a0);
                        arrayList23.add(a41);
                        arrayList23.add(q10Var8);
                        rr1 a42 = rr1.a(new j50(pb0Var, pb0Var2, pb0Var3, a31, rr1.a(new r60(new xr1(arrayList23, arrayList24), 10)), a26, a34, x10Var2.f12406h, g50Var, y10Var3.f12720h, o60Var));
                        fa0 fa0Var2 = new fa0(a42, 6);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList25.add(a40);
                        arrayList26.add(fa0Var2);
                        rr1 a43 = rr1.a(new r60(new xr1(arrayList25, arrayList26), 13));
                        rr1 a44 = rr1.a(new s30(a13, (wr1) rr1Var2, 5));
                        q10 q10Var9 = new q10(a20, 25);
                        ArrayList arrayList27 = new ArrayList(2);
                        ArrayList arrayList28 = new ArrayList(1);
                        arrayList28.add(x10Var2.U);
                        arrayList27.add(a44);
                        arrayList27.add(q10Var9);
                        r60 r60Var = new r60(new xr1(arrayList27, arrayList28), 1);
                        rr1 a45 = rr1.a(new u50(a22, 0));
                        ArrayList arrayList29 = new ArrayList(1);
                        List list = Collections.EMPTY_LIST;
                        arrayList29.add(a45);
                        rr1 a46 = rr1.a(new rw(r60Var, new xr1(arrayList29, list), y10Var3.f12713d, 4));
                        g50 g50Var4 = new g50(hq0Var3, 1);
                        r40 r40Var = new r40(g50Var, g50Var4, x10Var2.i, g50Var3, x10Var2.f12404f);
                        ArrayList arrayList30 = new ArrayList(1);
                        ArrayList arrayList31 = new ArrayList(1);
                        arrayList31.add(x10Var2.W);
                        arrayList30.add(x10Var2.X);
                        xr1 xr1Var = new xr1(arrayList30, arrayList31);
                        int i13 = 6;
                        j50 j50Var = new j50(g50Var2, g50Var, a12, a36, x10Var2.V, r40Var, a13, new r60(xr1Var, i13), a32, a19, y10Var3.f12736q0);
                        fa0 fa0Var3 = new fa0(a42, 5);
                        rr1 a47 = rr1.a(new y30(g50Var, 1));
                        q90 q90Var3 = new q90(i13);
                        q90 q90Var4 = new q90(7);
                        rr1 a48 = rr1.a(new z20(12, new ja0(z20Var, 0)));
                        l10 l10Var = y10Var3.G;
                        rr1 rr1Var4 = y10Var3.f12711c;
                        bb0 bb0Var = new bb0(l10Var, o60Var, a47, z20Var, q90Var3, q90Var4, rr1Var4, a48);
                        um0 um0Var = new um0();
                        rr1 a49 = rr1.a(new jc0(g50Var4, um0Var, z20Var, 1));
                        rr1 a50 = rr1.a(new jc0(g50Var4, um0Var, z20Var, 0));
                        rr1 a51 = rr1.a(new gm((wr1) g50Var4, (wr1) um0Var, (wr1) z20Var, (wr1) y10Var3.f12728m, 9));
                        rr1 a52 = rr1.a(new ax(um0Var, z20Var, 17));
                        o10 o10Var2 = y10Var3.f12718g;
                        um0.a(um0Var, rr1.a(new oa0(j50Var, rr1Var4, z20Var, fa0Var3, bb0Var, a47, x10Var2.f12407j, a49, a50, a51, a52, rr1.a(new gm(o10Var2, z20Var, bb0Var, um0Var, 8)), new xa0(o10Var2, o60Var), y10Var3.K, y10Var3.f12720h, o10Var2, a48, a17, y10Var3.P0)));
                        ((zi0) gi0Var.f6408c).w4(new dk0((q60) a26.zzb(), (e90) a34.zzb(), (a70) a31.zzb(), (g70) a21.zzb(), (j70) a36.zzb(), (h80) x10Var2.R.zzb(), (r70) a38.zzb(), (l90) a39.zzb(), (f80) a43.zzb(), (y60) a46.zzb()));
                        return (na0) um0Var.zzb();
                    }
                    throw new cg0(1, "No corresponding native ad listener");
                }
                throw new cg0(2, "Unified must be used for RTB.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void b(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        switch (this.f11907a) {
            case 0:
                try {
                    Object obj = gi0Var.f6407b;
                    IInterface iInterface = gi0Var.f6408c;
                    zs zsVar = (zs) obj;
                    String str = qp0Var.Z;
                    JSONObject jSONObject = qp0Var.f9962v;
                    zsVar.Z2(str);
                    boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.W8)).booleanValue();
                    Context context = this.f11908b;
                    if (booleanValue && qp0Var.f9936g0) {
                        String str2 = qp0Var.U;
                        String jSONObject2 = jSONObject.toString();
                        aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
                        zsVar.m2(str2, jSONObject2, aq0Var.f4581d, new b(context), new ui0(this, gi0Var), (as) iInterface, aq0Var.f4582f);
                        return;
                    }
                    String str3 = qp0Var.U;
                    String jSONObject3 = jSONObject.toString();
                    aq0 aq0Var2 = (aq0) wp0Var.f12312a.f4819v;
                    zsVar.U0(str3, jSONObject3, aq0Var2.f4581d, new b(context), new ui0(this, gi0Var), (as) iInterface, aq0Var2.f4582f);
                    return;
                } catch (RemoteException th) {
                    throw new Exception(th);
                }
            case 1:
                iq0 iq0Var = (iq0) gi0Var.f6407b;
                aq0 aq0Var3 = (aq0) wp0Var.f12312a.f4819v;
                String jSONObject4 = qp0Var.f9962v.toString();
                String i = g9.i(qp0Var.f9956s);
                Context context2 = this.f11908b;
                as asVar = (as) gi0Var.f6408c;
                try {
                    iq0Var.f7192a.Z3(new b(context2), aq0Var3.f4581d, jSONObject4, i, asVar);
                    return;
                } finally {
                    Exception exc = new Exception(th);
                }
            default:
                try {
                    Object obj2 = gi0Var.f6407b;
                    IInterface iInterface2 = gi0Var.f6408c;
                    zs zsVar2 = (zs) obj2;
                    String str4 = qp0Var.Z;
                    JSONObject jSONObject5 = qp0Var.f9962v;
                    zsVar2.Z2(str4);
                    int i10 = ((a) this.e).f20031w;
                    int intValue = ((Integer) r.e.f17698c.a(sl.f10867o2)).intValue();
                    String str5 = qp0Var.U;
                    Context context3 = this.f11908b;
                    if (i10 < intValue) {
                        zsVar2.j4(str5, jSONObject5.toString(), ((aq0) wp0Var.f12312a.f4819v).f4581d, new b(context3), new hj0(this, gi0Var), (as) iInterface2);
                        return;
                    }
                    String jSONObject6 = jSONObject5.toString();
                    aq0 aq0Var4 = (aq0) wp0Var.f12312a.f4819v;
                    zsVar2.p4(str5, jSONObject6, aq0Var4.f4581d, new b(context3), new hj0(this, gi0Var), (as) iInterface2, aq0Var4.f4585j);
                    return;
                } catch (RemoteException th2) {
                    throw new Exception(th2);
                }
        }
    }

    public vi0(Context context, d20 d20Var) {
        this.f11908b = context;
        this.f11909c = d20Var;
    }

    public vi0(Context context, x10 x10Var, a aVar) {
        this.f11908b = context;
        this.f11909c = x10Var;
        this.e = aVar;
    }
}
