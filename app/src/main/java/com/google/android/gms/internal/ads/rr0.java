package com.google.android.gms.internal.ads;
import g9.r;
import g9.y1;
import g9.z2;
import r.e;
import ya.zb;
import zb.c;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public interface rr0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.rr0, java.lang.Object] */
    static rr0 d(Context context, int i) {
        boolean booleanValue;
        if (vr0.a()) {
            int i10 = i - 2;
            if (i10 != 20 && i10 != 21) {
                if (i10 != 110) {
                    switch (i10) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            booleanValue = ((Boolean) rm.f10240c.p()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            booleanValue = ((Boolean) rm.f10241d.p()).booleanValue();
                            break;
                        case 5:
                            booleanValue = ((Boolean) rm.f10239b.p()).booleanValue();
                            break;
                    }
                } else {
                    booleanValue = ((Boolean) g9.r.e.f17698c.a(sl.f10732fa)).booleanValue();
                }
            } else {
                booleanValue = ((Boolean) rm.e.p()).booleanValue();
            }
            if (booleanValue) {
                return new sr0(context, i);
            }
        }
        return new Object();
    }

    static rr0 g(Context context, int i, int i10, g9.z2 z2Var) {
        boolean matches;
        rr0 d2 = d(context, i);
        if (d2 instanceof sr0) {
            sr0 sr0Var = (sr0) d2;
            sr0Var.k();
            sr0Var.i(i10);
            sr0Var.u(ya.zb.c(z2Var.G));
            String str = z2Var.J;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) g9.r.e.f17698c.a(sl.X9), str);
            }
            if (matches) {
                sr0Var.G(str);
            }
        }
        return d2;
    }

    rr0 G(String str);

    rr0 R(String str);

    rr0 a(boolean z3);

    rr0 b(Throwable th);

    rr0 c();

    rr0 e(tw twVar);

    rr0 f(g9.y1 y1Var);

    boolean h();

    rr0 i(int i);

    rr0 j(String str);

    tr0 m();

    rr0 u(int i);

    rr0 zza();

    boolean zzb();
}
