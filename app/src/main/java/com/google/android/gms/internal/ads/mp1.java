package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class mp1 extends dn1 {
    private static final mp1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private om1 zzd = om1.f9167v;

    static {
        mp1 mp1Var = new mp1();
        zze = mp1Var;
        dn1.t(mp1.class, mp1Var);
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (mp1.class) {
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
                return new mp1();
            }
            return new jo1(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", nd.E, "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
