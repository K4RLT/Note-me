package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rt1 implements by1, kw1 {

    /* renamed from: a, reason: collision with root package name */
    public final tt1 f10289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ak0 f10290b;

    public rt1(ak0 ak0Var, tt1 tt1Var) {
        this.f10290b = ak0Var;
        this.f10289a = tt1Var;
    }

    public final Pair a(yx1 yx1Var) {
        yx1 yx1Var2;
        tt1 tt1Var = this.f10289a;
        yx1 yx1Var3 = null;
        if (yx1Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = tt1Var.f11445c;
                if (i < arrayList.size()) {
                    if (((yx1) arrayList.get(i)).f13006d == yx1Var.f13006d) {
                        Object obj = yx1Var.f13003a;
                        Object obj2 = tt1Var.f11444b;
                        int i10 = zt1.f13263k;
                        yx1Var2 = yx1Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i++;
                } else {
                    yx1Var2 = null;
                    break;
                }
            }
            if (yx1Var2 == null) {
                return null;
            }
            yx1Var3 = yx1Var2;
        }
        return Pair.create(Integer.valueOf(tt1Var.f11446d), yx1Var3);
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void g(int i, yx1 yx1Var, vx1 vx1Var) {
        Pair a10 = a(yx1Var);
        if (a10 != null) {
            ((io0) this.f10290b.E).e(new r1(14, this, a10, vx1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void l(int i, yx1 yx1Var, final qx1 qx1Var, final vx1 vx1Var, final int i10) {
        final Pair a10 = a(yx1Var);
        if (a10 != null) {
            ((io0) this.f10290b.E).e(new Runnable() { // from class: com.google.android.gms.internal.ads.qt1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = a10;
                    int intValue = ((Integer) pair.first).intValue();
                    yx1 yx1Var2 = (yx1) pair.second;
                    ((ku1) rt1.this.f10290b.D).l(intValue, yx1Var2, qx1Var, vx1Var, i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void m(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var, IOException iOException, boolean z3) {
        Pair a10 = a(yx1Var);
        if (a10 != null) {
            ((io0) this.f10290b.E).e(new zx0(this, a10, qx1Var, vx1Var, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void n(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        Pair a10 = a(yx1Var);
        if (a10 != null) {
            ((io0) this.f10290b.E).e(new pt1(this, a10, qx1Var, vx1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.by1
    public final void o(int i, yx1 yx1Var, qx1 qx1Var, vx1 vx1Var) {
        Pair a10 = a(yx1Var);
        if (a10 != null) {
            ((io0) this.f10290b.E).e(new pt1(this, a10, qx1Var, vx1Var, 1));
        }
    }
}
