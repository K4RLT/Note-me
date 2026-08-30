package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oe extends dn1 {
    private static final oe zze;
    private static volatile fo1 zzf;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.oe, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zze = dn1Var;
        dn1.t(oe.class, dn1Var);
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
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (oe.class) {
                                        try {
                                            fo1Var = zzf;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zze);
                                                zzf = fo1Var;
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
                        return zze;
                    }
                    return new bn1(zze);
                }
                return new dn1();
            }
            return new jo1(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
