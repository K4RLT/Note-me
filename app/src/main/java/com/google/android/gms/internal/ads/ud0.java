package com.google.android.gms.internal.ads;
import f9.k;
import g9.a;
import g9.r;
import g9.y1;
import g9.z2;
import j6.s;
import k9.f0;
import r0.k;
import r0.l;
import r5.c;
import ya.zb;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ud0 implements g80, a, b70, w60, v70 {
    public final String A;
    public Boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final Context f11625u;

    /* renamed from: v, reason: collision with root package name */
    public final gq0 f11626v;

    /* renamed from: w, reason: collision with root package name */
    public final be0 f11627w;

    /* renamed from: x, reason: collision with root package name */
    public final wp0 f11628x;

    /* renamed from: y, reason: collision with root package name */
    public final qp0 f11629y;

    /* renamed from: z, reason: collision with root package name */
    public final rh0 f11630z;
    public long B = -1;
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final AtomicBoolean F = new AtomicBoolean(false);
    public final boolean D = ((Boolean) r.e.f17698c.a(sl.J7)).booleanValue();

    public ud0(Context context, gq0 gq0Var, be0 be0Var, wp0 wp0Var, qp0 qp0Var, rh0 rh0Var, String str) {
        this.f11625u = context;
        this.f11626v = gq0Var;
        this.f11627w = be0Var;
        this.f11628x = wp0Var;
        this.f11629y = qp0Var;
        this.f11630z = rh0Var;
        this.A = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // com.google.android.gms.internal.ads.w60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(y1 r6) {
        /*
            r5 = this;
            boolean r0 = r5.D
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            s r0 = c(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            k(r1, r2)
            int r1 = r6.f17714u
            java.lang.String r2 = r6.f17715v
            java.lang.String r3 = r6.f17716w
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            y1 r3 = r6.f17717x
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.f17716w
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            y1 r6 = r6.f17717x
            int r1 = r6.f17714u
            java.lang.String r2 = r6.f17715v
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            k(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.gq0 r6 = r5.f11626v
            java.util.regex.Pattern r6 = r6.f6443a
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            k(r1, r6)
        L5d:
            l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ud0.F(y1):void");
    }

    @Override // a
    public final void L() {
        if (!this.f11629y.b()) {
            return;
        }
        e(c("click"));
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void N(r90 r90Var) {
        if (!this.D) {
            return;
        }
        s c10 = c("ifts");
        c10.k("reason", "exception");
        if (!TextUtils.isEmpty(r90Var.getMessage())) {
            c10.k("msg", r90Var.getMessage());
        }
        c10.l();
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void a() {
        if (!this.D) {
            return;
        }
        s c10 = c("ifts");
        c10.k("reason", "blocked");
        c10.l();
    }

    public final boolean b() {
        String str;
        if (this.C == null) {
            synchronized (this) {
                if (this.C == null) {
                    String str2 = (String) r.e.f17698c.a(sl.f10645a2);
                    f0 f0Var = k.C.f16813c;
                    try {
                        str = f0.M(this.f11625u);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z3 = false;
                    if (str2 != null && str != null) {
                        try {
                            z3 = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            k.C.f16817h.d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.C = Boolean.valueOf(z3);
                }
            }
        }
        return this.C.booleanValue();
    }

    public final s c(String str) {
        String str2;
        wp0 wp0Var = this.f11628x;
        tw twVar = wp0Var.f12313b;
        bl0 bl0Var = wp0Var.f12312a;
        s a10 = this.f11627w.a();
        a10.k("gqi", ((sp0) twVar.f11471w).f11091b);
        qp0 qp0Var = this.f11629y;
        a10.i(qp0Var);
        a10.k("action", str);
        a10.k("ad_format", this.A.toUpperCase(Locale.ROOT));
        List list = qp0Var.f9958t;
        boolean z3 = false;
        if (!list.isEmpty()) {
            a10.k("ancn", (String) list.get(0));
        }
        if (qp0Var.b()) {
            k kVar = k.C;
            if (true != kVar.f16817h.i(this.f11625u)) {
                str2 = "offline";
            } else {
                str2 = "online";
            }
            a10.k("device_connectivity", str2);
            kVar.f16819k.getClass();
            a10.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a10.k("offline_ad", "1");
        }
        if (((Boolean) r.e.f17698c.a(sl.Q7)).booleanValue()) {
            if (zb.e((aq0) bl0Var.f4819v) != 1) {
                z3 = true;
            }
            a10.k("scar", String.valueOf(z3));
            if (z3) {
                z2 z2Var = ((aq0) bl0Var.f4819v).f4581d;
                a10.k("ragent", z2Var.J);
                a10.k("rtype", zb.a(zb.b(z2Var)));
            }
        }
        return a10;
    }

    public final void e(s sVar) {
        if (this.f11629y.b()) {
            fe0 fe0Var = ((be0) sVar.f18982w).f4770a;
            String i = fe0Var.f6049f.i((ConcurrentHashMap) sVar.f18981v);
            k.C.f16819k.getClass();
            rb rbVar = new rb(2, System.currentTimeMillis(), ((sp0) this.f11628x.f12313b.f11471w).f11091b, i);
            rh0 rh0Var = this.f11630z;
            rh0Var.getClass();
            rh0Var.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(rh0Var, 7, rbVar));
            return;
        }
        sVar.l();
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void i() {
        String str;
        if (!b()) {
            return;
        }
        this.F.set(true);
        k kVar = k.C;
        kVar.f16819k.getClass();
        this.B = System.currentTimeMillis();
        s c10 = c("presentation");
        nl nlVar = sl.f10737ff;
        r rVar = r.e;
        String str2 = "1";
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && k()) {
            boolean z3 = !f0.g(this.f11625u);
            AtomicBoolean atomicBoolean = this.E;
            atomicBoolean.set(z3);
            if (true == atomicBoolean.get()) {
                str = "1";
            } else {
                str = "0";
            }
            c10.k("foreground", str);
        }
        if (((Boolean) rVar.f17698c.a(sl.f10753gf)).booleanValue() && k()) {
            if (true != kVar.f16816g.m()) {
                str2 = "0";
            }
            c10.k("fg_al", str2);
        }
        c10.l();
    }

    public final boolean k() {
        int i = this.f11629y.f9926b;
        if (i != 2 && i != 5 && i != 6 && i != 7) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void r() {
        String str;
        String str2;
        if (!b()) {
            return;
        }
        s c10 = c("adapter_impression");
        c10.k("imp_type", String.valueOf(this.f11629y.e));
        String str3 = "0";
        if (this.F.get()) {
            c10.k("po", "1");
            k.C.f16819k.getClass();
            c10.k("pil", String.valueOf(System.currentTimeMillis() - this.B));
        } else {
            c10.k("po", "0");
        }
        nl nlVar = sl.f10737ff;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && k()) {
            f0 f0Var = k.C.f16813c;
            if (true == f0.g(this.f11625u)) {
                str = "0";
            } else {
                str = "1";
            }
            c10.k("foreground", str);
            if (true != this.E.get()) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            c10.k("fg_show", str2);
        }
        if (((Boolean) rVar.f17698c.a(sl.f10753gf)).booleanValue() && k()) {
            if (true == k.C.f16816g.m()) {
                str3 = "1";
            }
            c10.k("fg_al", str3);
        }
        c10.l();
    }

    @Override // com.google.android.gms.internal.ads.g80
    public final void w() {
        if (!b()) {
            return;
        }
        c("adapter_shown").l();
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        String str;
        boolean b10 = b();
        qp0 qp0Var = this.f11629y;
        if (!b10 && !qp0Var.b()) {
            return;
        }
        s c10 = c(AdSDKNotificationListener.IMPRESSION_EVENT);
        c10.k("imp_type", String.valueOf(qp0Var.e));
        if (this.B > 0) {
            k.C.f16819k.getClass();
            c10.k("p_imp_l", String.valueOf(System.currentTimeMillis() - this.B));
        }
        if (((Boolean) r.e.f17698c.a(sl.f10737ff)).booleanValue() && k()) {
            f0 f0Var = k.C.f16813c;
            String str2 = "0";
            if (true == f0.g(this.f11625u)) {
                str = "0";
            } else {
                str = "1";
            }
            c10.k("foreground", str);
            if (true == this.E.get()) {
                str2 = "1";
            }
            c10.k("fg_show", str2);
        }
        e(c10);
    }
}
