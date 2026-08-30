package com.google.android.gms.internal.ads;
import g9.c3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i20 {

    /* renamed from: a, reason: collision with root package name */
    public final rr1 f6968a;

    public i20(o80 o80Var, tw twVar, Context context, View view, Activity activity, String str, HashMap hashMap, wd wdVar, yx0 yx0Var) {
        tr1 a10 = tr1.a(yx0Var);
        tr1 b10 = tr1.b(str);
        tr1 a11 = tr1.a(wdVar);
        rr1 rr1Var = (rr1) twVar.f11471w;
        tr1 tr1Var = (tr1) o80Var.f9021b;
        rr1 rr1Var2 = (rr1) o80Var.i;
        xz0 xz0Var = new xz0(0, rr1Var, rr1Var2, a11, tr1Var);
        ap0 ap0Var = new ap0(a11, rr1Var, rr1Var2, 2);
        tr1 a12 = tr1.a(hashMap);
        rr1 rr1Var3 = (rr1) twVar.f11471w;
        rr1 rr1Var4 = (rr1) o80Var.i;
        uz0 uz0Var = new uz0(a11, rr1Var3, a12, rr1Var4);
        xz0 xz0Var2 = new xz0(1, rr1Var3, rr1Var4, a11, (tr1) o80Var.e);
        sz0 sz0Var = new sz0(a11, rr1Var3, a10, a12, rr1Var4, 1);
        ap0 ap0Var2 = new ap0(a11, rr1Var3, rr1Var4, 3);
        tr1 a13 = tr1.a(context);
        rr1 rr1Var5 = (rr1) twVar.f11471w;
        rr1 rr1Var6 = (rr1) o80Var.i;
        h30 h30Var = new h30(a11, rr1Var5, a10, a13, a12, rr1Var6);
        tr1 tr1Var2 = (tr1) o80Var.f9021b;
        tr1 tr1Var3 = (tr1) o80Var.e;
        w50 w50Var = new w50(a11, rr1Var5, a12, tr1Var2, a10, tr1Var3, rr1Var6);
        xz0 xz0Var3 = new xz0(2, rr1Var5, rr1Var6, a11, tr1Var2);
        r40 r40Var = new r40(a11, rr1Var5, a12, tr1Var2, rr1Var6);
        uz0 uz0Var2 = new uz0(a11, a12, tr1Var3, rr1Var6);
        int i = xr1.f12610c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(xz0Var);
        arrayList.add(ap0Var);
        arrayList.add(uz0Var);
        arrayList.add(xz0Var2);
        arrayList.add(sz0Var);
        arrayList.add(ap0Var2);
        arrayList.add(h30Var);
        arrayList.add(w50Var);
        arrayList.add(xz0Var3);
        arrayList.add(r40Var);
        arrayList.add(uz0Var2);
        xr1 xr1Var = new xr1(arrayList, list);
        tr1 b11 = tr1.b(view);
        tr1 b12 = tr1.b(activity);
        rr1 rr1Var7 = (rr1) twVar.f11471w;
        rr1 rr1Var8 = (rr1) o80Var.i;
        sz0 sz0Var2 = new sz0(a11, rr1Var7, b11, b12, rr1Var8, 0);
        rr1 a14 = rr1.a(new pe0(a13, 7));
        d01 d01Var = new d01(a11, rr1Var7, a14, b11, rr1Var8);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(xz0Var);
        arrayList2.add(ap0Var);
        arrayList2.add(xz0Var2);
        arrayList2.add(sz0Var2);
        arrayList2.add(d01Var);
        arrayList2.add(sz0Var);
        arrayList2.add(ap0Var2);
        arrayList2.add(h30Var);
        arrayList2.add(w50Var);
        arrayList2.add(xz0Var3);
        arrayList2.add(r40Var);
        xr1 xr1Var2 = new xr1(arrayList2, list2);
        d01 d01Var2 = new d01(a11, (rr1) twVar.f11471w, a12, a14, (rr1) o80Var.i);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(xz0Var);
        arrayList3.add(ap0Var);
        arrayList3.add(xz0Var2);
        arrayList3.add(sz0Var2);
        arrayList3.add(d01Var);
        arrayList3.add(sz0Var);
        arrayList3.add(ap0Var2);
        arrayList3.add(h30Var);
        arrayList3.add(w50Var);
        arrayList3.add(xz0Var3);
        arrayList3.add(r40Var);
        arrayList3.add(d01Var2);
        this.f6968a = rr1.a(new g40((rr1) o80Var.f9027j, (rr1) o80Var.f9029l, (rr1) twVar.f11471w, a10, b10, a11, xr1Var, xr1Var2, new xr1(arrayList3, list3), (rr1) o80Var.i));
    }

    public i20(y10 y10Var, Context context, String str, g9.c3 c3Var) {
        tr1 a10 = tr1.a(context);
        tr1 a11 = tr1.a(c3Var);
        tr1 a12 = tr1.a(str);
        rr1 rr1Var = y10Var.f12728m;
        rr1 a13 = rr1.a(new s20(rr1Var, 27));
        rr1 a14 = rr1.a(new um0(y10Var.L0, 11));
        this.f6968a = rr1.a(new bf0(a10, a11, a12, rr1.a(new r40(a10, y10Var.f12711c, y10Var.J, a13, a14)), a13, a14, y10Var.f12720h, y10Var.K, rr1Var));
    }
}
