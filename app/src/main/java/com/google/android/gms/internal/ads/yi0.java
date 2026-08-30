package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class yi0 implements di0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12884a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12885b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12886c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12887d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12888f;

    public yi0(Context context, d20 d20Var, kr0 kr0Var, wx wxVar, yl ylVar) {
        this.f12885b = context;
        this.f12886c = d20Var;
        this.f12888f = kr0Var;
        this.e = wxVar;
        this.f12887d = ylVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [f9.d, com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.di0
    public final ac.b a(wp0 wp0Var, qp0 qp0Var) {
        String str;
        switch (this.f12884a) {
            case 0:
                if (((Boolean) g9.r.e.f17698c.a(sl.He)).booleanValue()) {
                    j6.s a10 = ((be0) this.f12888f).a();
                    a10.k("action", "cstm_tbs_rndr");
                    a10.l();
                }
                Uri uri = null;
                try {
                    str = qp0Var.f9962v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                if (str != null) {
                    uri = Uri.parse(str);
                }
                return ed1.c0(v81.f11836v, new xi0(this, uri, wp0Var, qp0Var, (sp0) wp0Var.f12313b.f11471w, 0), (Executor) this.f12887d);
            default:
                tw twVar = new tw(new View(this.f12885b), (h00) null, v80.N, (rp0) qp0Var.f9960u.get(0));
                hq0 hq0Var = new hq0(wp0Var, qp0Var, (String) null);
                d20 d20Var = (d20) this.f12886c;
                c20 c20Var = new c20(d20Var.f5263d, d20Var.e, hq0Var, twVar);
                q60 q60Var = (q60) c20Var.Z.zzb();
                a70 a70Var = (a70) c20Var.f4961c0.zzb();
                g90 g90Var = (g90) c20Var.f4963e0.zzb();
                d90 d90Var = (d90) c20Var.f4970n0.zzb();
                u30 u30Var = (u30) c20Var.T.zzb();
                ?? obj = new Object();
                obj.f12860z = new AtomicBoolean(false);
                obj.f12855u = q60Var;
                obj.f12856v = a70Var;
                obj.f12857w = g90Var;
                obj.f12858x = d90Var;
                obj.f12859y = u30Var;
                up0 up0Var = qp0Var.f9956s;
                xl xlVar = new xl(obj, up0Var.f11696b, up0Var.f11695a);
                kr0 kr0Var = (kr0) this.f12888f;
                Objects.requireNonNull(kr0Var);
                j6.l lVar = new j6.l(this, 7, xlVar);
                k60 k60Var = new k60(kr0Var, ir0.CUSTOM_RENDER_SYN, null, kr0.f7850d, Collections.EMPTY_LIST, ((wx) this.e).j(new bo0(2, lVar)));
                k60 a11 = ((kr0) k60Var.f7670f).a(k60Var.j(), ir0.CUSTOM_RENDER_ACK);
                return new k60((kr0) a11.f7670f, a11.f7666a, (String) a11.f7667b, (ac.b) a11.f7668c, (List) a11.f7669d, ed1.c0((ac.b) a11.e, new qr(2, ed1.e(c20Var.m0())), xx.f12657h)).j();
        }
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final boolean b(wp0 wp0Var, qp0 qp0Var) {
        String str;
        up0 up0Var;
        switch (this.f12884a) {
            case 0:
                Context context = this.f12885b;
                if ((context instanceof Activity) && cm.a(context)) {
                    try {
                        str = qp0Var.f9962v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return true;
                    }
                }
                return false;
            default:
                if (((yl) this.f12887d) != null && (up0Var = qp0Var.f9956s) != null && up0Var.f11695a != null) {
                    return true;
                }
                return false;
        }
    }

    public yi0(Context context, Executor executor, h20 h20Var, pp0 pp0Var, be0 be0Var) {
        this.f12885b = context;
        this.f12886c = h20Var;
        this.f12887d = executor;
        this.e = pp0Var;
        this.f12888f = be0Var;
    }
}
