package com.google.android.gms.internal.ads;
import oa.b;
import ac.b;
import g9.k2;
import g9.z1;
import k9.a0;
import l9.i;
import n.r0;
import oa.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ra0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10165a;

    /* renamed from: b, reason: collision with root package name */
    public g9.z1 f10166b;

    /* renamed from: c, reason: collision with root package name */
    public un f10167c;

    /* renamed from: d, reason: collision with root package name */
    public View f10168d;
    public List e;

    /* renamed from: g, reason: collision with root package name */
    public g9.k2 f10170g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f10171h;
    public h00 i;

    /* renamed from: j, reason: collision with root package name */
    public h00 f10172j;

    /* renamed from: k, reason: collision with root package name */
    public h00 f10173k;

    /* renamed from: l, reason: collision with root package name */
    public bi0 f10174l;

    /* renamed from: m, reason: collision with root package name */
    public ac.b f10175m;

    /* renamed from: n, reason: collision with root package name */
    public yx f10176n;

    /* renamed from: o, reason: collision with root package name */
    public View f10177o;

    /* renamed from: p, reason: collision with root package name */
    public View f10178p;

    /* renamed from: q, reason: collision with root package name */
    public oa.a f10179q;

    /* renamed from: r, reason: collision with root package name */
    public double f10180r;

    /* renamed from: s, reason: collision with root package name */
    public zn f10181s;

    /* renamed from: t, reason: collision with root package name */
    public zn f10182t;

    /* renamed from: u, reason: collision with root package name */
    public String f10183u;

    /* renamed from: x, reason: collision with root package name */
    public float f10186x;

    /* renamed from: y, reason: collision with root package name */
    public String f10187y;

    /* renamed from: v, reason: collision with root package name */
    public final n.r0 f10184v = new n.r0(0);

    /* renamed from: w, reason: collision with root package name */
    public final n.r0 f10185w = new n.r0(0);

    /* renamed from: f, reason: collision with root package name */
    public List f10169f = Collections.EMPTY_LIST;

    public static ra0 l(gs gsVar) {
        qa0 qa0Var;
        gs gsVar2;
        try {
            g9.z1 n10 = gsVar.n();
            if (n10 == null) {
                gsVar2 = gsVar;
                qa0Var = null;
            } else {
                gsVar2 = gsVar;
                qa0Var = new qa0(n10, gsVar2);
            }
            return m(qa0Var, gsVar2.p(), (View) n(gsVar2.q()), gsVar2.a(), gsVar2.b(), gsVar2.e(), gsVar2.L3(), gsVar2.g(), (View) n(gsVar2.j()), gsVar2.v(), gsVar2.h(), gsVar2.m(), gsVar2.i(), gsVar2.d(), gsVar2.f(), gsVar2.s());
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.g("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static ra0 m(qa0 qa0Var, un unVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, oa.a aVar, String str4, String str5, double d2, zn znVar, String str6, float f10) {
        ra0 ra0Var = new ra0();
        ra0Var.f10165a = 6;
        ra0Var.f10166b = qa0Var;
        ra0Var.f10167c = unVar;
        ra0Var.f10168d = view;
        ra0Var.o("headline", str);
        ra0Var.e = list;
        ra0Var.o("body", str2);
        ra0Var.f10171h = bundle;
        ra0Var.o("call_to_action", str3);
        ra0Var.f10177o = view2;
        ra0Var.f10179q = aVar;
        ra0Var.o("store", str4);
        ra0Var.o("price", str5);
        ra0Var.f10180r = d2;
        ra0Var.f10181s = znVar;
        ra0Var.o("advertiser", str6);
        synchronized (ra0Var) {
            ra0Var.f10186x = f10;
        }
        return ra0Var;
    }

    public static Object n(oa.a aVar) {
        if (aVar == null) {
            return null;
        }
        return oa.b.z1(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final zn b() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return pn.v4((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.f10171h == null) {
                this.f10171h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10171h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.f10183u;
    }

    public final synchronized h00 h() {
        return this.i;
    }

    public final synchronized h00 i() {
        return this.f10172j;
    }

    public final synchronized h00 j() {
        return this.f10173k;
    }

    public final synchronized bi0 k() {
        return this.f10174l;
    }

    public final synchronized void o(String str, String str2) {
        n.r0 r0Var = this.f10185w;
        if (str2 == null) {
            r0Var.remove(str);
        } else {
            r0Var.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f10185w.get(str);
    }

    public final synchronized int q() {
        return this.f10165a;
    }

    public final synchronized g9.z1 r() {
        return this.f10166b;
    }

    public final synchronized un s() {
        return this.f10167c;
    }
}
