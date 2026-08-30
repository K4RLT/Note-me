package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d3 extends b5 {
    private static final d3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private r2 zzh;

    static {
        d3 d3Var = new d3();
        zzc = d3Var;
        b5.i(d3.class, d3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new d3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (d3.class) {
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
}
