package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import b8.u4;
import f9.a;
import f9.k;
import g9.c3;
import g9.r;
import k9.f0;
import k9.g;
import l9.a;

import android.content.Context;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d50 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5313d;

    public /* synthetic */ d50(int i, Object obj, Object obj2, Object obj3) {
        this.f5310a = i;
        this.f5311b = obj;
        this.f5312c = obj2;
        this.f5313d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final b l(Object obj) {
        op opVar;
        View id0Var;
        rp0 rp0Var;
        zd0 zd0Var;
        op opVar2;
        op opVar3;
        switch (this.f5310a) {
            case 0:
                f50 f50Var = (f50) this.f5311b;
                p8 p8Var = (p8) this.f5312c;
                b bVar = (b) this.f5313d;
                z40 z40Var = (z40) obj;
                f50Var.getClass();
                if (z40Var != null) {
                    p8Var.mo202r(z40Var);
                }
                return ed1.Y(bVar, ((Long) in.f7177a.p()).longValue(), TimeUnit.MILLISECONDS, f50Var.f5935b);
            case 1:
                fc0 fc0Var = (fc0) this.f5311b;
                a aVar = (a) this.f5312c;
                mw mwVar = (mw) this.f5313d;
                h00 a10 = fc0Var.f6012c.a(c3.a(), null, null);
                fj fjVar = new fj(a10);
                fc0Var.a(a10, aVar, mwVar);
                a10.j0().B = new hx0(17, fjVar);
                a10.loadUrl((String) r.e.f17698c.a(sl.F4));
                return fjVar;
            case 2:
                rc0 rc0Var = (rc0) this.f5311b;
                String str = (String) this.f5312c;
                JSONObject jSONObject = (JSONObject) this.f5313d;
                h00 h00Var = (h00) obj;
                jp jpVar = rc0Var.f10205h;
                jpVar.getClass();
                yx yxVar = new yx();
                f0 f0Var = k.C.f16813c;
                String uuid = UUID.randomUUID().toString();
                jpVar.a(uuid, new up(jpVar, yxVar));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FacebookMediationAdapter.KEY_ID, uuid);
                    jSONObject2.put("args", jSONObject);
                    h00Var.a(str, jSONObject2);
                } catch (Exception e) {
                    yxVar.c(e);
                }
                return yxVar;
            case 3:
                li0 li0Var = (li0) this.f5311b;
                qp0 qp0Var = (qp0) this.f5312c;
                wp0 wp0Var = (wp0) this.f5313d;
                zd0 zd0Var2 = li0Var.i;
                nl nlVar = sl.M2;
                ql qlVar = r.e.f17698c;
                if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var2, "rendering-webview-creation-start");
                }
                gd0 gd0Var = li0Var.f8039b;
                aq0 aq0Var = li0Var.f8040c;
                final h00 a11 = gd0Var.a(aq0Var.f4582f, qp0Var, (sp0) wp0Var.f12313b.f11471w);
                a11.e1(qp0Var.W);
                if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var2, "rendering-webview-creation-end");
                }
                yx yxVar2 = new yx();
                b20 b20Var = li0Var.f8038a;
                hq0 hq0Var = new hq0(wp0Var, qp0Var, (String) null);
                a aVar2 = li0Var.e;
                boolean z3 = li0Var.f8043g;
                op opVar4 = li0Var.f8042f;
                z10 z10Var = new z10(b20Var.f4676c, b20Var.f4677d, hq0Var, new com.google.android.gms.internal.measurement.e4(6, new ni0(aVar2, yxVar2, qp0Var, a11, aq0Var, z3, opVar4, li0Var.f8044h, li0Var.f8045j), a11, false), new u4(qp0Var.f9925a0, 2));
                if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var2, "rendering-ad-component-creation-end");
                }
                rr1 rr1Var = z10Var.l0;
                fd0 fd0Var = (fd0) rr1Var.zzb();
                if (true != z3) {
                    opVar = null;
                } else {
                    opVar = opVar4;
                }
                final int i = 0;
                fd0Var.a(a11, false, opVar, zd0Var2);
                yxVar2.b(z10Var);
                ((a70) z10Var.Y.zzb()).L1(new b70() { // from class: com.google.android.gms.internal.ads.ki0
                    @Override // com.google.android.gms.internal.ads.b70
                    public final /* synthetic */ void y() {
                        switch (i) {
                            case 0:
                                h00 h00Var2 = a11;
                                if (h00Var2.j0() != null) {
                                    h00Var2.j0().D();
                                    return;
                                }
                                return;
                            case 1:
                                h00 h00Var3 = a11;
                                if (h00Var3.j0() != null) {
                                    h00Var3.j0().D();
                                    return;
                                }
                                return;
                            case 2:
                                h00 h00Var4 = a11;
                                if (h00Var4.j0() != null) {
                                    h00Var4.j0().D();
                                    return;
                                }
                                return;
                            default:
                                h00 h00Var5 = a11;
                                if (h00Var5.j0() != null) {
                                    h00Var5.j0().D();
                                    return;
                                }
                                return;
                        }
                    }
                }, xx.f12657h);
                up0 up0Var = qp0Var.f9956s;
                String str2 = up0Var.f11695a;
                if (((Boolean) qlVar.a(sl.f10807k6)).booleanValue() && ((ai0) z10Var.X.zzb()).a()) {
                    str2 = z00.a(str2, z00.b(qp0Var));
                }
                return ed1.d0(fd0.b(a11, up0Var.f11696b, str2, zd0Var2, (ur0) b20Var.f4678f.zzb()), new y50(1, a11, qp0Var, z10Var), li0Var.f8041d);
            case 4:
                si0 si0Var = (si0) this.f5311b;
                wp0 wp0Var2 = (wp0) this.f5312c;
                qp0 qp0Var2 = (qp0) this.f5313d;
                Executor executor = si0Var.e;
                zd0 zd0Var3 = si0Var.f10622g;
                nl nlVar2 = sl.M2;
                ql qlVar2 = r.e.f17698c;
                if (((Boolean) qlVar2.a(nlVar2)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var3, "rendering-webview-creation-start");
                }
                Context context = si0Var.f10618b;
                c3 t3 = xy.t(context, qp0Var2.f9960u);
                final h00 a12 = si0Var.f10619c.a(t3, qp0Var2, (sp0) wp0Var2.f12313b.f11471w);
                a12.e1(qp0Var2.W);
                if (((Boolean) qlVar2.a(sl.W8)).booleanValue() && qp0Var2.f9936g0) {
                    id0Var = p40.a(context, a12.U(), qp0Var2);
                } else {
                    id0Var = new id0(context, a12.U(), (g) si0Var.f10621f.apply(qp0Var2));
                }
                if (((Boolean) qlVar2.a(nlVar2)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var3, "rendering-webview-creation-end");
                }
                d20 d20Var = si0Var.f10617a;
                hq0 hq0Var2 = new hq0(wp0Var2, qp0Var2, (String) null);
                ri0 ri0Var = new ri0(a12);
                if (t3.C) {
                    rp0Var = new rp0(-3, 0, true);
                } else {
                    rp0Var = new rp0(t3.f17593y, t3.f17590v, false);
                }
                c20 c20Var = new c20(d20Var.f5263d, d20Var.e, hq0Var2, new tw(id0Var, a12, ri0Var, rp0Var));
                if (((Boolean) qlVar2.a(nlVar2)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var3, "rendering-ad-component-creation-end");
                }
                rr1 rr1Var2 = c20Var.f4971o0;
                ((fd0) rr1Var2.zzb()).a(a12, false, null, zd0Var3);
                a70 a70Var = (a70) c20Var.f4961c0.zzb();
                final int i10 = 1;
                b70 b70Var = new b70() { // from class: com.google.android.gms.internal.ads.ki0
                    @Override // com.google.android.gms.internal.ads.b70
                    public final /* synthetic */ void y() {
                        switch (i10) {
                            case 0:
                                h00 h00Var2 = a12;
                                if (h00Var2.j0() != null) {
                                    h00Var2.j0().D();
                                    return;
                                }
                                return;
                            case 1:
                                h00 h00Var3 = a12;
                                if (h00Var3.j0() != null) {
                                    h00Var3.j0().D();
                                    return;
                                }
                                return;
                            case 2:
                                h00 h00Var4 = a12;
                                if (h00Var4.j0() != null) {
                                    h00Var4.j0().D();
                                    return;
                                }
                                return;
                            default:
                                h00 h00Var5 = a12;
                                if (h00Var5.j0() != null) {
                                    h00Var5.j0().D();
                                    return;
                                }
                                return;
                        }
                    }
                };
                wx wxVar = xx.f12657h;
                a70Var.L1(b70Var, wxVar);
                up0 up0Var2 = qp0Var2.f9956s;
                String str3 = up0Var2.f11695a;
                if (((Boolean) qlVar2.a(sl.f10807k6)).booleanValue() && ((ai0) c20Var.f4959a0.zzb()).a()) {
                    str3 = z00.a(str3, z00.b(qp0Var2));
                }
                yx b10 = fd0.b(a12, up0Var2.f11696b, str3, zd0Var3, (ur0) d20Var.f5275l.zzb());
                d91 d91Var = b10.f12998u;
                if (qp0Var2.M) {
                    d91Var.a(new p00(a12, 7), executor);
                }
                d91Var.a(new t81(si0Var, 21, a12), executor);
                return ed1.d0(b10, new cv(2, c20Var), wxVar);
            case 5:
                return ed1.e(p40.a(((oi0) this.f5311b).f9129b, (View) this.f5312c, (qp0) this.f5313d));
            case 6:
                return ed1.e(p40.a(((vi0) this.f5311b).f11908b, (View) this.f5312c, (qp0) this.f5313d));
            case 7:
                cj0 cj0Var = (cj0) this.f5311b;
                qp0 qp0Var3 = (qp0) this.f5312c;
                wp0 wp0Var3 = (wp0) this.f5313d;
                zd0 zd0Var4 = cj0Var.f5100j;
                nl nlVar3 = sl.M2;
                ql qlVar3 = r.e.f17698c;
                if (((Boolean) qlVar3.a(nlVar3)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var4, "rendering-webview-creation-start");
                }
                gd0 gd0Var2 = cj0Var.f5095c;
                aq0 aq0Var2 = cj0Var.f5096d;
                final h00 a13 = gd0Var2.a(aq0Var2.f4582f, qp0Var3, (sp0) wp0Var3.f12313b.f11471w);
                a13.e1(qp0Var3.W);
                if (((Boolean) qlVar3.a(nlVar3)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var4, "rendering-webview-creation-end");
                }
                yx yxVar3 = new yx();
                h20 h20Var = (h20) cj0Var.f5102l;
                hq0 hq0Var3 = new hq0(wp0Var3, qp0Var3, (String) null);
                Context context2 = cj0Var.f5094b;
                a aVar3 = cj0Var.f5097f;
                boolean z9 = cj0Var.f5099h;
                op opVar5 = cj0Var.f5098g;
                g20 g20Var = new g20(h20Var.f6547b, h20Var.f6548c, hq0Var3, new com.google.android.gms.internal.measurement.e4(6, new bj0(context2, aVar3, yxVar3, qp0Var3, a13, aq0Var2, z9, opVar5, cj0Var.i, cj0Var.f5101k), a13, false));
                yxVar3.b(g20Var);
                if (((Boolean) qlVar3.a(nlVar3)).booleanValue()) {
                    zd0Var = zd0Var4;
                    a.u(k.C.f16819k, zd0Var, "rendering-ad-component-creation-end");
                } else {
                    zd0Var = zd0Var4;
                }
                final int i11 = 2;
                ((a70) g20Var.X.zzb()).L1(new b70() { // from class: com.google.android.gms.internal.ads.ki0
                    @Override // com.google.android.gms.internal.ads.b70
                    public final /* synthetic */ void y() {
                        switch (i11) {
                            case 0:
                                h00 h00Var2 = a13;
                                if (h00Var2.j0() != null) {
                                    h00Var2.j0().D();
                                    return;
                                }
                                return;
                            case 1:
                                h00 h00Var3 = a13;
                                if (h00Var3.j0() != null) {
                                    h00Var3.j0().D();
                                    return;
                                }
                                return;
                            case 2:
                                h00 h00Var4 = a13;
                                if (h00Var4.j0() != null) {
                                    h00Var4.j0().D();
                                    return;
                                }
                                return;
                            default:
                                h00 h00Var5 = a13;
                                if (h00Var5.j0() != null) {
                                    h00Var5.j0().D();
                                    return;
                                }
                                return;
                        }
                    }
                }, xx.f12657h);
                up0 up0Var3 = qp0Var3.f9956s;
                String str4 = up0Var3.f11695a;
                if (((Boolean) qlVar3.a(sl.f10807k6)).booleanValue() && ((ai0) g20Var.W.zzb()).a()) {
                    str4 = z00.a(str4, z00.b(qp0Var3));
                }
                rr1 rr1Var3 = g20Var.f6272n0;
                fd0 fd0Var2 = (fd0) rr1Var3.zzb();
                if (true != z9) {
                    opVar2 = null;
                } else {
                    opVar2 = opVar5;
                }
                fd0Var2.a(a13, true, opVar2, zd0Var);
                return ed1.d0(fd0.b(a13, up0Var3.f11696b, str4, zd0Var, (ur0) h20Var.i.zzb()), new y50(2, a13, qp0Var3, g20Var), cj0Var.e);
            case 8:
                gj0 gj0Var = (gj0) this.f5311b;
                wp0 wp0Var4 = (wp0) this.f5312c;
                qp0 qp0Var4 = (qp0) this.f5313d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return ed1.A(new cg0(3));
                }
                int i12 = ((aq0) wp0Var4.f12312a.f4819v).f4587l;
                if (i12 > 1) {
                    int length = jSONArray.length();
                    if (((Boolean) r.e.f17698c.a(sl.N2)).booleanValue()) {
                        gj0Var.f6414f.b("nsl", String.valueOf(length));
                    }
                    gj0Var.f6413d.a(Math.min(length, i12));
                    ArrayList arrayList = new ArrayList(i12);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (i13 < length) {
                            arrayList.add(gj0Var.c(wp0Var4, qp0Var4, jSONArray.getJSONObject(i13)));
                        } else {
                            arrayList.add(ed1.A(new cg0(3)));
                        }
                    }
                    return ed1.e(arrayList);
                }
                return ed1.d0(gj0Var.c(wp0Var4, qp0Var4, jSONArray.getJSONObject(0)), i6.f7006k, gj0Var.f6411b);
            default:
                cj0 cj0Var2 = (cj0) this.f5311b;
                qp0 qp0Var5 = (qp0) this.f5312c;
                wp0 wp0Var5 = (wp0) this.f5313d;
                zd0 zd0Var5 = cj0Var2.f5100j;
                nl nlVar4 = sl.M2;
                ql qlVar4 = r.e.f17698c;
                if (((Boolean) qlVar4.a(nlVar4)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var5, "rendering-webview-creation-start");
                }
                gd0 gd0Var3 = cj0Var2.f5095c;
                aq0 aq0Var3 = cj0Var2.f5096d;
                final h00 a14 = gd0Var3.a(aq0Var3.f4582f, qp0Var5, (sp0) wp0Var5.f12313b.f11471w);
                a14.e1(qp0Var5.W);
                if (((Boolean) qlVar4.a(nlVar4)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var5, "rendering-webview-creation-end");
                }
                yx yxVar4 = new yx();
                k20 k20Var = (k20) cj0Var2.f5102l;
                hq0 hq0Var4 = new hq0(wp0Var5, qp0Var5, (String) null);
                Context context3 = cj0Var2.f5094b;
                a aVar4 = cj0Var2.f5097f;
                op opVar6 = cj0Var2.f5098g;
                boolean z10 = cj0Var2.f5099h;
                wh0 wh0Var = cj0Var2.i;
                zd0 zd0Var6 = cj0Var2.f5100j;
                j20 j20Var = new j20(k20Var.f7611c, k20Var.f7613d, hq0Var4, new zc0(new ak0(context3, gd0Var3, aq0Var3, aVar4, qp0Var5, yxVar4, a14, opVar6, z10, wh0Var, zd0Var6, cj0Var2.f5101k), a14, 0));
                yxVar4.b(j20Var);
                if (((Boolean) qlVar4.a(nlVar4)).booleanValue()) {
                    a.u(k.C.f16819k, zd0Var6, "rendering-ad-component-creation-end");
                }
                a14.h1("/reward", new cp(5, (i90) j20Var.m0.zzb()));
                final int i14 = 3;
                ((a70) j20Var.X.zzb()).L1(new b70() { // from class: com.google.android.gms.internal.ads.ki0
                    @Override // com.google.android.gms.internal.ads.b70
                    public final /* synthetic */ void y() {
                        switch (i14) {
                            case 0:
                                h00 h00Var2 = a14;
                                if (h00Var2.j0() != null) {
                                    h00Var2.j0().D();
                                    return;
                                }
                                return;
                            case 1:
                                h00 h00Var3 = a14;
                                if (h00Var3.j0() != null) {
                                    h00Var3.j0().D();
                                    return;
                                }
                                return;
                            case 2:
                                h00 h00Var4 = a14;
                                if (h00Var4.j0() != null) {
                                    h00Var4.j0().D();
                                    return;
                                }
                                return;
                            default:
                                h00 h00Var5 = a14;
                                if (h00Var5.j0() != null) {
                                    h00Var5.j0().D();
                                    return;
                                }
                                return;
                        }
                    }
                }, xx.f12657h);
                rr1 rr1Var4 = j20Var.f7299n0;
                fd0 fd0Var3 = (fd0) rr1Var4.zzb();
                if (true != z10) {
                    opVar3 = null;
                } else {
                    opVar3 = opVar6;
                }
                fd0Var3.a(a14, true, opVar3, zd0Var6);
                up0 up0Var4 = qp0Var5.f9956s;
                String str5 = up0Var4.f11695a;
                if (((Boolean) qlVar4.a(sl.f10807k6)).booleanValue() && ((ai0) j20Var.W.zzb()).a()) {
                    str5 = z00.a(str5, z00.b(qp0Var5));
                }
                return ed1.d0(fd0.b(a14, up0Var4.f11696b, str5, zd0Var6, (ur0) k20Var.f7615g.zzb()), new y50(3, a14, qp0Var5, j20Var), cj0Var2.e);
        }
    }

    public /* synthetic */ d50(di0 di0Var, qp0 qp0Var, wp0 wp0Var, v80 v80Var, int i) {
        this.f5310a = i;
        this.f5311b = di0Var;
        this.f5312c = qp0Var;
        this.f5313d = wp0Var;
    }
}
