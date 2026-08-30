package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;
import r.e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class lp {

    /* renamed from: a, reason: collision with root package name */
    public static final hp f8076a = new hp(12);

    /* renamed from: b, reason: collision with root package name */
    public static final hp f8077b = new hp(13);

    /* renamed from: c, reason: collision with root package name */
    public static final hp f8078c = new hp(14);

    /* renamed from: d, reason: collision with root package name */
    public static final hp f8079d = new hp(15);
    public static final hp e = new hp(16);

    /* renamed from: f, reason: collision with root package name */
    public static final hp f8080f = new hp(17);

    /* renamed from: g, reason: collision with root package name */
    public static final az f8081g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final hp f8082h = new hp(25);
    public static final gp i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final jp f8083j = new jp();

    /* renamed from: k, reason: collision with root package name */
    public static final hp f8084k = new hp(18);

    /* renamed from: l, reason: collision with root package name */
    public static final hp f8085l = new hp(19);

    /* renamed from: m, reason: collision with root package name */
    public static final hp f8086m = new hp(0);

    /* renamed from: n, reason: collision with root package name */
    public static final hp f8087n = new hp(1);

    /* renamed from: o, reason: collision with root package name */
    public static final hp f8088o = new hp(2);

    /* renamed from: p, reason: collision with root package name */
    public static final hp f8089p = new hp(3);

    /* renamed from: q, reason: collision with root package name */
    public static final hp f8090q = new hp(4);

    /* renamed from: r, reason: collision with root package name */
    public static final hp f8091r = new hp(5);

    /* renamed from: s, reason: collision with root package name */
    public static final hp f8092s = new hp(6);

    /* renamed from: t, reason: collision with root package name */
    public static final hp f8093t = new hp(7);

    /* renamed from: u, reason: collision with root package name */
    public static final hp f8094u = new hp(8);

    /* renamed from: v, reason: collision with root package name */
    public static final hp f8095v = new hp(9);

    /* renamed from: w, reason: collision with root package name */
    public static final hp f8096w = new hp(10);

    /* renamed from: x, reason: collision with root package name */
    public static final hp f8097x = new hp(11);

    public static ac.b a(h00 h00Var, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            of T0 = h00Var.T0();
            cq0 i02 = h00Var.i0();
            if (((Boolean) g9.r.e.f17698c.a(sl.f10988vd)).booleanValue() && i02 != null) {
                if (T0 != null && T0.a(parse)) {
                    parse = i02.a(parse, h00Var.getContext(), h00Var.U(), h00Var.f());
                }
            } else if (T0 != null && T0.a(parse)) {
                parse = T0.b(parse, h00Var.getContext(), h00Var.U(), h00Var.f());
            }
        } catch (pf unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i10 = k9.a0.f19634b;
            l9.i.f(concat);
        }
        HashMap hashMap = new HashMap();
        if (h00Var.J() != null) {
            hashMap = h00Var.J().f9965w0;
        }
        Context context = h00Var.getContext();
        ww wwVar = f9.k.C.f16833y;
        if (!wwVar.a(context)) {
            str2 = parse.toString();
        } else {
            String d2 = wwVar.d(context);
            if (d2 == null) {
                str2 = parse.toString();
            } else {
                nl nlVar = sl.Q0;
                ql qlVar = g9.r.e.f17698c;
                String str3 = (String) qlVar.a(nlVar);
                String uri = parse.toString();
                if (((Boolean) qlVar.a(sl.P0)).booleanValue() && uri.contains(str3)) {
                    wwVar.h(context, "_ac", d2, ww.f((Map) hashMap.get("_ac")));
                    str2 = ay0.A(context, uri).replace(str3, d2);
                } else if (TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid")) && !((Boolean) qlVar.a(sl.O0)).booleanValue()) {
                    String uri2 = ay0.u(ay0.A(context, uri), "fbs_aeid", d2).toString();
                    wwVar.h(context, "_ac", d2, ww.f((Map) hashMap.get("_ac")));
                    str2 = uri2;
                } else {
                    str2 = uri;
                }
            }
        }
        long longValue = ((Long) vm.e.p()).longValue();
        if (longValue > 0 && longValue <= 262180000) {
            q81 t3 = q81.t(h00Var.v0());
            i6 i6Var = i6.f7000c;
            wx wxVar = xx.f12657h;
            return ed1.S(ed1.d0(ed1.S(t3, Throwable.class, i6Var, wxVar), new ip(str2, 0), wxVar), Throwable.class, new ip(str2, 1), wxVar);
        }
        return ed1.e(str2);
    }

    public static void b(Map map, f90 f90Var) {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10734fc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && f90Var != null) {
            f90Var.M();
        }
    }
}
