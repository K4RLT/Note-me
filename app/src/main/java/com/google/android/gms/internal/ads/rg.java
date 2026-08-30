package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class rg extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10219h = 3;
    public final Object i;

    public rg(dg dgVar, wd wdVar, int i, View view) {
        super(dgVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", wdVar, i, 57);
        this.i = view;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.gms.internal.ads.an1, com.google.android.gms.internal.ads.gg] */
    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        switch (this.f10219h) {
            case 0:
                Method method = this.e;
                d2 d2Var = (d2) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(d2Var.f5252c), Long.valueOf(d2Var.f5253d), Long.valueOf(d2Var.e), Long.valueOf(d2Var.f5254f));
                wd wdVar = this.f12235d;
                synchronized (wdVar) {
                    long j10 = jArr[0];
                    wdVar.b();
                    ((je) wdVar.f4845v).i0(j10);
                    long j11 = jArr[1];
                    wdVar.b();
                    ((je) wdVar.f4845v).j0(j11);
                }
                return;
            case 1:
                Method method2 = this.e;
                g9 g9Var = (g9) this.i;
                List list = g9Var.f6330a;
                g9Var.f6330a = Collections.EMPTY_LIST;
                int intValue = ((Integer) method2.invoke(null, list)).intValue();
                wd wdVar2 = this.f12235d;
                synchronized (wdVar2) {
                    int o10 = ed1.o(intValue);
                    wdVar2.b();
                    ((je) wdVar2.f4845v).t0(o10);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    rf rfVar = new rf((String) this.e.invoke(null, stackTraceElementArr));
                    wd wdVar3 = this.f12235d;
                    synchronized (wdVar3) {
                        try {
                            long longValue = rfVar.P.longValue();
                            wdVar3.b();
                            ((je) wdVar3.f4845v).M(longValue);
                            if (((Boolean) rfVar.Q).booleanValue()) {
                                int i = 1;
                                if (true != ((Boolean) rfVar.R).booleanValue()) {
                                    i = 2;
                                }
                                wdVar3.b();
                                ((je) wdVar3.f4845v).q0(i);
                            } else {
                                wdVar3.b();
                                ((je) wdVar3.f4845v).q0(3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    nl nlVar = sl.f10820l4;
                    g9.r rVar = g9.r.e;
                    Boolean bool = (Boolean) rVar.f17698c.a(nlVar);
                    Boolean bool2 = (Boolean) rVar.f17698c.a(sl.f10926rc);
                    String str = (String) this.e.invoke(null, view, this.f12232a.f5418a.getResources().getDisplayMetrics(), bool, bool2);
                    ?? an1Var = new an1(16);
                    HashMap s10 = an1.s(str);
                    if (s10 != null) {
                        an1Var.O = (Long) s10.get(0);
                        an1Var.P = (Long) s10.get(1);
                        an1Var.Q = (Long) s10.get(2);
                        an1Var.R = (Long) s10.get(3);
                        an1Var.S = (Long) s10.get(4);
                    }
                    ge z3 = he.z();
                    long longValue2 = an1Var.O.longValue();
                    z3.b();
                    ((he) z3.f4845v).B(longValue2);
                    long longValue3 = an1Var.P.longValue();
                    z3.b();
                    ((he) z3.f4845v).C(longValue3);
                    long longValue4 = an1Var.Q.longValue();
                    z3.b();
                    ((he) z3.f4845v).D(longValue4);
                    if (bool2.booleanValue()) {
                        long longValue5 = an1Var.S.longValue();
                        z3.b();
                        ((he) z3.f4845v).A(longValue5);
                    }
                    if (bool.booleanValue()) {
                        long longValue6 = an1Var.R.longValue();
                        z3.b();
                        ((he) z3.f4845v).E(longValue6);
                    }
                    wd wdVar4 = this.f12235d;
                    he heVar = (he) z3.c();
                    wdVar4.b();
                    ((je) wdVar4.f4845v).V(heVar);
                    return;
                }
                return;
        }
    }

    public rg(dg dgVar, wd wdVar, int i, d2 d2Var) {
        super(dgVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", wdVar, i, 85);
        this.i = d2Var;
    }

    public rg(dg dgVar, wd wdVar, int i, g9 g9Var) {
        super(dgVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", wdVar, i, 94);
        this.i = g9Var;
    }

    public rg(dg dgVar, wd wdVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(dgVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", wdVar, i, 45);
        this.i = stackTraceElementArr;
    }
}
