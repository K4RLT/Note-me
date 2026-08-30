package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

import java.util.List;

/* loaded from: classes.dex */
public final class q3 extends b5 {
    private static final q3 zzc;
    private static volatile v5 zzd;
    private i5 zze = x5.f13969x;

    static {
        q3 q3Var = new q3();
        zzc = q3Var;
        b5.i(q3.class, q3Var);
    }

    public static q3 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (u3.f13936a[i - 1]) {
            case 1:
                return new q3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", r3.class});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (q3.class) {
                        try {
                            v5Var = zzd;
                            if (v5Var == null) {
                                v5Var = new c5(6);
                                zzd = v5Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return v5Var;
                }
                return v5Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                q.x.h();
                return null;
        }
    }

    public final int p() {
        return this.zze.size();
    }

    public final List r() {
        return this.zze;
    }
}
