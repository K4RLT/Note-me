package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.f0;
import l9.a;
import la.a;
import r.e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ws0 {

    /* renamed from: a, reason: collision with root package name */
    public final qj0 f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12321c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12322d;
    public final Context e;

    /* renamed from: f, reason: collision with root package name */
    public final xp0 f12323f;

    /* renamed from: g, reason: collision with root package name */
    public final yp0 f12324g;

    /* renamed from: h, reason: collision with root package name */
    public final la.a f12325h;
    public final of i;

    public ws0(qj0 qj0Var, l9.a aVar, String str, String str2, Context context, xp0 xp0Var, yp0 yp0Var, la.a aVar2, of ofVar) {
        this.f12319a = qj0Var;
        this.f12320b = aVar.f20029u;
        this.f12321c = str;
        this.f12322d = str2;
        this.e = context;
        this.f12323f = xp0Var;
        this.f12324g = yp0Var;
        this.f12325h = aVar2;
        this.i = ofVar;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(wp0 wp0Var, qp0 qp0Var, List list) {
        return b(wp0Var, qp0Var, false, "", "", list, null, null);
    }

    public final ArrayList b(wp0 wp0Var, qp0 qp0Var, boolean z3, String str, String str2, List list, c60 c60Var, x0 x0Var) {
        String str3;
        String str4;
        long j10;
        String str5;
        String str6;
        String str7;
        String str8;
        c60 c60Var2 = c60Var;
        x0 x0Var2 = x0Var;
        String str9 = "1";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (true != z3) {
                str3 = "0";
            } else {
                str3 = str9;
            }
            String c10 = c(c(c((String) it.next(), "@gw_adlocid@", ((aq0) wp0Var.f12312a.f4819v).f4583g), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f12320b);
            if (qp0Var != null) {
                String c11 = c(c(c(c10, "@gw_qdata@", qp0Var.f9968y), "@gw_adnetid@", qp0Var.f9966x), "@gw_allocid@", qp0Var.f9964w);
                Context context = this.e;
                c10 = ay0.f(c11, context, qp0Var.W, qp0Var.f9965w0);
                nl nlVar = sl.f10720ef;
                g9.r rVar = g9.r.e;
                str4 = str9;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && qp0Var.e == 4) {
                    k9.f0 f0Var = f9.k.C.f16813c;
                    if (true != k9.f0.g(context)) {
                        str8 = "0";
                    } else {
                        str8 = str4;
                    }
                    c10 = c(c10, "@gw_aps@", str8);
                }
                if (((Boolean) rVar.f17698c.a(sl.f10914qf)).booleanValue() && x0Var2 != null) {
                    int i = x0Var2.f12384a;
                    if (i < 0) {
                        str5 = "";
                    } else {
                        str5 = Integer.toString(i);
                    }
                    String c12 = c(c10, "@gw_is@", str5);
                    int i10 = x0Var2.f12385b;
                    if (i10 < 0) {
                        str6 = "";
                    } else {
                        str6 = Integer.toString(i10);
                    }
                    String c13 = c(c12, "@gw_fis@", str6);
                    int i11 = x0Var2.f12386c;
                    if (i11 < 0) {
                        str7 = "";
                    } else {
                        str7 = Integer.toString(i11);
                    }
                    c10 = c(c13, "@gw_sfis@", str7);
                }
            } else {
                str4 = str9;
            }
            qj0 qj0Var = this.f12319a;
            String c14 = c(c10, "@gw_adnetstatus@", qj0Var.d());
            synchronized (qj0Var) {
                j10 = qj0Var.f9859h;
            }
            String c15 = c(c(c(c14, "@gw_ttr@", Long.toString(j10, 10)), "@gw_seqnum@", this.f12321c), "@gw_sessid@", this.f12322d);
            nl nlVar2 = sl.f10880of;
            g9.r rVar2 = g9.r.e;
            if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                if (c60Var2 != null) {
                    AtomicLong atomicLong = c60Var2.f5014a;
                    if (atomicLong.get() > 0) {
                        c15 = c(c15, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    }
                }
                c15 = c(c15, "@gw_placement_id@", "");
            }
            boolean z9 = false;
            if (((Boolean) rVar2.f17698c.a(sl.f10935s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z9 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z10 = !isEmpty;
            if (!z9) {
                if (!isEmpty) {
                    z10 = true;
                }
                arrayList.add(c15);
                c60Var2 = c60Var;
                x0Var2 = x0Var;
                str9 = str4;
            }
            if (this.i.a(Uri.parse(c15))) {
                Uri.Builder buildUpon = Uri.parse(c15).buildUpon();
                if (z9) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c15 = buildUpon.build().toString();
                arrayList.add(c15);
                c60Var2 = c60Var;
                x0Var2 = x0Var;
                str9 = str4;
            }
            arrayList.add(c15);
            c60Var2 = c60Var;
            x0Var2 = x0Var;
            str9 = str4;
        }
        return arrayList;
    }
}
