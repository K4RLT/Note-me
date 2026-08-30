package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cq1 extends dn1 {
    private static final cq1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.cq1, com.google.android.gms.internal.ads.dn1] */
    static {
        com.google.android.gms.internal.ads.dn1 dn1Var = new dn1();
        zzf = dn1Var;
        dn1.t(cq1.class, dn1Var);
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = q0.d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (cq1.class) {
                                        try {
                                            fo1Var = zzg;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzf);
                                                zzg = fo1Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return fo1Var;
                                }
                                return fo1Var2;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new bn1(zzf);
                }
                return new dn1();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", np1.f8804h, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
