package com.google.android.gms.internal.ads;
import b8.u4;
import g9.z2;
import j6.c;
import j6.e;
import k9.a0;
import l9.i;
import oa.b;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wj0 implements ji0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12250a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12251b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12252c;

    /* renamed from: d, reason: collision with root package name */
    public final k20 f12253d;

    public /* synthetic */ wj0(Context context, Executor executor, k20 k20Var, int i) {
        this.f12250a = i;
        this.f12251b = context;
        this.f12252c = executor;
        this.f12253d = k20Var;
    }

    public static final void c(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        try {
            iq0 iq0Var = (iq0) gi0Var.f6407b;
            try {
                iq0Var.f7192a.W2(((aq0) wp0Var.f12312a.f4819v).f4581d, qp0Var.f9962v.toString());
            } catch (Throwable th) {
                throw new Exception(th);
            }
        } catch (Exception e) {
            String str = gi0Var.f6406a;
            int i = a0.f19634b;
            i.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final Object a(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        switch (this.f12250a) {
            case 0:
                hq0 hq0Var = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                zc0 zc0Var = new zc0(new c(7, this, gi0Var, qp0Var), null, 0);
                k20 k20Var = this.f12253d;
                j20 j20Var = new j20(k20Var.f7611c, k20Var.f7613d, hq0Var, zc0Var);
                ((e70) j20Var.T.zzb()).L1(new e30(0, (iq0) gi0Var.f6407b), this.f12252c);
                ((zi0) gi0Var.f6408c).w4((yj0) j20Var.f7300o0.zzb());
                return j20Var.l0();
            default:
                hq0 hq0Var2 = new hq0(wp0Var, qp0Var, gi0Var.f6406a);
                zc0 zc0Var2 = new zc0(new e(this, gi0Var, qp0Var), null, 0);
                k20 k20Var2 = this.f12253d;
                j20 j20Var2 = new j20(k20Var2.f7611c, k20Var2.f7613d, hq0Var2, zc0Var2);
                ((e70) j20Var2.T.zzb()).L1(new e30(0, (iq0) gi0Var.f6407b), this.f12252c);
                g70 g70Var = (g70) j20Var2.f7288a0.zzb();
                q60 q60Var = (q60) j20Var2.f7289b0.zzb();
                r70 r70Var = (r70) j20Var2.f7294g0.zzb();
                i90 i90Var = (i90) j20Var2.m0.zzb();
                aj0 aj0Var = (aj0) gi0Var.f6408c;
                bk0 bk0Var = new bk0(this, r70Var, q60Var, g70Var, i90Var);
                synchronized (aj0Var) {
                    aj0Var.f4522u = bk0Var;
                }
                return j20Var2.l0();
        }
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final void b(wp0 wp0Var, qp0 qp0Var, gi0 gi0Var) {
        Exception exc;
        switch (this.f12250a) {
            case 0:
                JSONObject jSONObject = qp0Var.f9962v;
                IInterface iInterface = gi0Var.f6408c;
                Context context = this.f12251b;
                try {
                    aq0 aq0Var = (aq0) wp0Var.f12312a.f4819v;
                    u4 u4Var = aq0Var.f4591p;
                    z2 z2Var = aq0Var.f4581d;
                    int i = u4Var.f2825v;
                    Object obj = gi0Var.f6407b;
                    if (i == 3) {
                        iq0 iq0Var = (iq0) obj;
                        try {
                            iq0Var.f7192a.V1(new b(context), z2Var, jSONObject.toString(), (as) iInterface);
                            return;
                        } finally {
                        }
                    }
                    iq0 iq0Var2 = (iq0) obj;
                    try {
                        iq0Var2.f7192a.y3(new b(context), z2Var, jSONObject.toString(), (as) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e) {
                    String str = gi0Var.f6406a;
                    int i10 = a0.f19634b;
                    i.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
                    return;
                }
                String str2 = gi0Var.f6406a;
                int i102 = a0.f19634b;
                i.g("Fail to load ad from adapter ".concat(String.valueOf(str2)), e);
                return;
            default:
                iq0 iq0Var3 = (iq0) gi0Var.f6407b;
                if (!iq0Var3.a()) {
                    tw twVar = new tw(this, wp0Var, qp0Var, gi0Var, 18, false);
                    IInterface iInterface2 = gi0Var.f6408c;
                    aj0 aj0Var = (aj0) iInterface2;
                    synchronized (aj0Var) {
                        aj0Var.f4524w = twVar;
                    }
                    Context context2 = this.f12251b;
                    aq0 aq0Var2 = (aq0) wp0Var.f12312a.f4819v;
                    pv pvVar = (pv) iInterface2;
                    String jSONObject2 = qp0Var.f9962v.toString();
                    try {
                        iq0Var3.f7192a.w2(new b(context2), aq0Var2.f4581d, pvVar, jSONObject2);
                        return;
                    } finally {
                    }
                }
                c(wp0Var, qp0Var, gi0Var);
                return;
        }
    }
}
