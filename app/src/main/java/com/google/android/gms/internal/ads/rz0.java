package com.google.android.gms.internal.ads;
import ac.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class rz0 extends c01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10401f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10402g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10403h;

    public rz0(wd wdVar, pz0 pz0Var, DisplayMetrics displayMetrics, View view, h21 h21Var) {
        super("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", wdVar, pz0Var, h21Var.a(124));
        this.f10402g = displayMetrics;
        this.f10403h = view;
    }

    @Override // com.google.android.gms.internal.ads.c01
    public final void a(Method method, wd wdVar) {
        switch (this.f10401f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f10403h, (Activity) this.f10402g);
                objArr.getClass();
                synchronized (wdVar) {
                    long longValue = ((Long) objArr[0]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).c0(longValue);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).d0(longValue2);
                    String str = (String) objArr[2];
                    wdVar.b();
                    ((je) wdVar.f4845v).e0(str);
                }
                return;
            case 1:
                Long l10 = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l11 = (Long) method.invoke("", (Context) this.f10402g);
                        if (l11 != null) {
                            l10 = l11;
                        } else {
                            throw null;
                        }
                    } else {
                        ac.b bVar = (ac.b) ((Map) this.f10403h).get("gs");
                        if (bVar != null && bVar.isDone()) {
                            l10 = Long.valueOf(((je) bVar.get()).x0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (wdVar) {
                    long longValue3 = l10.longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).b0(longValue3);
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.f10402g;
                Long l12 = (Long) map.get("tcq");
                if (l12 == null) {
                    l12 = -1L;
                }
                lArr[0] = l12;
                Long l13 = (Long) map.get("tpq");
                if (l13 == null) {
                    l13 = -1L;
                }
                lArr[1] = l13;
                Long l14 = (Long) map.get("tcv");
                if (l14 == null) {
                    l14 = -1L;
                }
                lArr[2] = l14;
                Long l15 = (Long) map.get("tpv");
                if (l15 == null) {
                    l15 = -1L;
                }
                lArr[3] = l15;
                Long l16 = (Long) map.get("tchv");
                if (l16 == null) {
                    l16 = -1L;
                }
                lArr[4] = l16;
                Long l17 = (Long) map.get("tphv");
                if (l17 == null) {
                    l17 = -1L;
                }
                lArr[5] = l17;
                Long l18 = (Long) map.get("tcc");
                if (l18 == null) {
                    l18 = -1L;
                }
                lArr[6] = l18;
                Long l19 = (Long) map.get("tpc");
                if (l19 == null) {
                    l19 = -1L;
                }
                lArr[7] = l19;
                Long l20 = (Long) map.get("tst");
                if (l20 == null) {
                    l20 = -1L;
                }
                lArr[8] = l20;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((yx0) this.f10403h).ordinal()));
                lArr2.getClass();
                synchronized (wdVar) {
                    long longValue4 = lArr2[0].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).m0(longValue4);
                    long longValue5 = lArr2[1].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).C(longValue5);
                    long longValue6 = lArr2[2].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).Q0(longValue6);
                    long longValue7 = lArr2[3].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).N0(longValue7);
                    long longValue8 = lArr2[4].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).i0(longValue8);
                    long longValue9 = lArr2[5].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).j0(longValue9);
                    long longValue10 = lArr2[6].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).P(longValue10);
                    long longValue11 = lArr2[7].longValue();
                    wdVar.b();
                    ((je) wdVar.f4845v).Q(longValue11);
                }
                return;
            default:
                View view = (View) this.f10403h;
                if (view != null) {
                    Object invoke = method.invoke("", (DisplayMetrics) this.f10402g, view);
                    invoke.getClass();
                    Long[] lArr3 = (Long[]) invoke;
                    ge z3 = he.z();
                    long longValue12 = lArr3[2].longValue();
                    z3.b();
                    ((he) z3.f4845v).B(longValue12);
                    long longValue13 = lArr3[1].longValue();
                    z3.b();
                    ((he) z3.f4845v).C(longValue13);
                    long longValue14 = lArr3[0].longValue();
                    z3.b();
                    ((he) z3.f4845v).D(longValue14);
                    long longValue15 = lArr3[3].longValue();
                    z3.b();
                    ((he) z3.f4845v).A(longValue15);
                    long longValue16 = lArr3[4].longValue();
                    z3.b();
                    ((he) z3.f4845v).E(longValue16);
                    he heVar = (he) z3.c();
                    wdVar.b();
                    ((je) wdVar.f4845v).V(heVar);
                    return;
                }
                return;
        }
    }

    public rz0(wd wdVar, pz0 pz0Var, View view, Activity activity, h21 h21Var) {
        super("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", wdVar, pz0Var, h21Var.a(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION));
        this.f10403h = view;
        this.f10402g = activity;
    }

    public rz0(wd wdVar, pz0 pz0Var, yx0 yx0Var, Map map, h21 h21Var) {
        super("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", wdVar, pz0Var, h21Var.a(122));
        this.f10402g = map;
        this.f10403h = yx0Var;
    }

    public rz0(wd wdVar, pz0 pz0Var, Map map, Context context, h21 h21Var) {
        super("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", wdVar, pz0Var, h21Var.a(120));
        this.f10402g = context;
        this.f10403h = map;
    }
}
