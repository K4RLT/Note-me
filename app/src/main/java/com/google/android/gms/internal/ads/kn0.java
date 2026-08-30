package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;
import ya.zb;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class kn0 implements qn0 {

    /* renamed from: j, reason: collision with root package name */
    public static final vm0 f7813j = new vm0(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: a, reason: collision with root package name */
    public final wx f7814a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f7815b;

    /* renamed from: c, reason: collision with root package name */
    public final ok0 f7816c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7817d;
    public final aq0 e;

    /* renamed from: f, reason: collision with root package name */
    public final mk0 f7818f;

    /* renamed from: g, reason: collision with root package name */
    public final od0 f7819g;

    /* renamed from: h, reason: collision with root package name */
    public final cf0 f7820h;
    public final String i;

    public kn0(wx wxVar, ScheduledExecutorService scheduledExecutorService, String str, ok0 ok0Var, Context context, aq0 aq0Var, mk0 mk0Var, od0 od0Var, cf0 cf0Var) {
        this.f7814a = wxVar;
        this.f7815b = scheduledExecutorService;
        this.i = str;
        this.f7816c = ok0Var;
        this.f7817d = context;
        this.e = aq0Var;
        this.f7818f = mk0Var;
        this.f7819g = od0Var;
        this.f7820h = cf0Var;
    }

    public final void a(ArrayList arrayList, Map map) {
        Bundle bundle;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rk0 rk0Var = (rk0) ((Map.Entry) it.next()).getValue();
            String str = rk0Var.f10223a;
            Bundle bundle2 = this.e.f4581d.G;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            arrayList.add(b(str, Collections.singletonList(rk0Var.e), bundle, rk0Var.f10224b, rk0Var.f10225c));
        }
    }

    public final q81 b(String str, List list, Bundle bundle, boolean z3, boolean z9) {
        in0 in0Var = new in0(this, str, list, bundle, z3, z9);
        wx wxVar = this.f7814a;
        q81 t3 = q81.t(ed1.O(in0Var, wxVar));
        nl nlVar = sl.f10741g2;
        r rVar = r.e;
        if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            t3 = (q81) ed1.Y(t3, ((Long) rVar.f17698c.a(sl.Z1)).longValue(), TimeUnit.MILLISECONDS, this.f7815b);
        }
        return ed1.S(t3, Throwable.class, new ip(str, 3), wxVar);
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final b zza() {
        aq0 aq0Var = this.e;
        if (aq0Var.f4594s) {
            if (!Arrays.asList(((String) r.e.f17698c.a(sl.f10834m2)).split(",")).contains(zb.a(zb.b(aq0Var.f4581d)))) {
                return ed1.e(f7813j);
            }
        }
        return ed1.O(new hx0(27, this), this.f7814a);
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 32;
    }
}
