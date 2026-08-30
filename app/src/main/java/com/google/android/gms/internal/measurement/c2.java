package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class c2 extends b5 {
    private static final c2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.c2, com.google.android.gms.internal.measurement.b5] */
    static {
        com.google.android.gms.internal.measurement.b5 b5Var = new b5();
        zzc = b5Var;
        b5.i(c2.class, b5Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new b5();
            case 2:
                return new a5(zzc);
            case 3:
                a2 a2Var = a2.e;
                return new z5(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", a2Var, "zzg", a2Var});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (c2.class) {
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
        int c10 = wd0.c(this.zzg);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    public final int q() {
        int c10 = wd0.c(this.zzf);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }
}
