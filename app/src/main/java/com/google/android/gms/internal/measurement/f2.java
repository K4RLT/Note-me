package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f2 extends b5 {
    private static final f2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private String zzf = "";
    private i5 zzg = x5.f13969x;
    private boolean zzh;

    static {
        f2 f2Var = new f2();
        zzc = f2Var;
        b5.i(f2.class, f2Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new f2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", l2.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (f2.class) {
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

    public final String p() {
        return this.zzf;
    }
}
