package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ms0 extends dn1 {
    private static final ms0 zzg;
    private static volatile fo1 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        ms0 ms0Var = new ms0();
        zzg = ms0Var;
        dn1.t(ms0.class, ms0Var);
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
                                fo1 fo1Var2 = zzh;
                                if (fo1Var2 == null) {
                                    synchronized (ms0.class) {
                                        try {
                                            fo1Var = zzh;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzg);
                                                zzh = fo1Var;
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
                        return zzg;
                    }
                    return new bn1(zzg);
                }
                return new ms0();
            }
            return new jo1(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
