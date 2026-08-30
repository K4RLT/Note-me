package com.google.android.gms.internal.ads;
import ac.b;
import f9.d;
import j6.s;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fk0 implements di0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f6096b;

    /* renamed from: c, reason: collision with root package name */
    public final kr0 f6097c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6098d;
    public final Object e;

    public /* synthetic */ fk0(kr0 kr0Var, wx wxVar, Object obj, Object obj2, int i) {
        this.f6095a = i;
        this.f6097c = kr0Var;
        this.f6096b = wxVar;
        this.e = obj2;
        this.f6098d = obj;
    }

    public static final String c(int i, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i);
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.lk0, d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.android.gms.internal.ads.mf] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.h70] */
    @Override // com.google.android.gms.internal.ads.di0
    public final b a(wp0 wp0Var, qp0 qp0Var) {
        gi0 gi0Var;
        switch (this.f6095a) {
            case 0:
                Iterator it = qp0Var.f9958t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            gi0Var = ((fi0) this.f6098d).a((String) it.next(), qp0Var.f9962v);
                        } catch (dq0 unused) {
                        }
                    } else {
                        gi0Var = null;
                    }
                }
                if (gi0Var == null) {
                    return ed1.A(new cg0(3, "Unable to instantiate mediation adapter class."));
                }
                yx yxVar = new yx();
                Object obj = new Object();
                obj.f8337v = gi0Var;
                obj.f8338w = yxVar;
                obj.f8336u = false;
                gi0Var.f6408c.v1(obj);
                if (qp0Var.M) {
                    Bundle bundle = ((aq0) wp0Var.f12312a.f4819v).f4581d.G;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                kr0 kr0Var = this.f6097c;
                ir0 ir0Var = ir0.ADAPTER_LOAD_AD_SYN;
                Objects.requireNonNull(kr0Var);
                ek0 ek0Var = new ek0(this, wp0Var, qp0Var, gi0Var);
                k60 k60Var = new k60(kr0Var, ir0Var, null, kr0.f7850d, Collections.EMPTY_LIST, this.f6096b.j(new bo0(2, ek0Var)));
                k60 a10 = ((kr0) k60Var.f7670f).a(k60Var.j(), ir0.ADAPTER_LOAD_AD_ACK);
                qr qrVar = new qr(2, yxVar);
                wx wxVar = xx.f12657h;
                k60 k60Var2 = new k60((kr0) a10.f7670f, a10.f7666a, (String) a10.f7667b, (b) a10.f7668c, (List) a10.f7669d, ed1.c0((b) a10.e, qrVar, wxVar));
                return ((kr0) k60Var2.f7670f).a(k60Var2.j(), ir0.ADAPTER_WRAP_ADAPTER).e(new ek0(this, wp0Var, qp0Var, gi0Var)).j();
            default:
                yx yxVar2 = new yx();
                Object obj2 = new Object();
                p8 p8Var = new p8(this, yxVar2, wp0Var, qp0Var, obj2, 4, false);
                synchronized (obj2) {
                    obj2.f8048u = p8Var;
                }
                up0 up0Var = qp0Var.f9956s;
                xl xlVar = new xl(obj2, up0Var.f11696b, up0Var.f11695a);
                ir0 ir0Var2 = ir0.CUSTOM_RENDER_SYN;
                kr0 kr0Var2 = this.f6097c;
                Objects.requireNonNull(kr0Var2);
                s sVar = new s(this, 6, xlVar);
                k60 k60Var3 = new k60(kr0Var2, ir0Var2, null, kr0.f7850d, Collections.EMPTY_LIST, this.f6096b.j(new bo0(2, sVar)));
                k60 a11 = ((kr0) k60Var3.f7670f).a(k60Var3.j(), ir0.CUSTOM_RENDER_ACK);
                qr qrVar2 = new qr(2, yxVar2);
                wx wxVar2 = xx.f12657h;
                return new k60((kr0) a11.f7670f, a11.f7666a, (String) a11.f7667b, (b) a11.f7668c, (List) a11.f7669d, ed1.c0((b) a11.e, qrVar2, wxVar2)).j();
        }
    }

    @Override // com.google.android.gms.internal.ads.di0
    public final boolean b(wp0 wp0Var, qp0 qp0Var) {
        up0 up0Var;
        switch (this.f6095a) {
            case 0:
                return !qp0Var.f9958t.isEmpty();
            default:
                if (((yl) this.f6098d) != null && (up0Var = qp0Var.f9956s) != null && up0Var.f11695a != null) {
                    return true;
                }
                return false;
        }
    }
}