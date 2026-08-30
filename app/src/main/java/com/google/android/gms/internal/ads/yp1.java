package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class yp1 extends dn1 {
    private static final yp1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private om1 zzb;
    private om1 zzc;
    private om1 zzd;

    static {
        yp1 yp1Var = new yp1();
        zze = yp1Var;
        dn1.t(yp1.class, yp1Var);
    }

    public yp1() {
        mm1 mm1Var = om1.f9167v;
        this.zzb = mm1Var;
        this.zzc = mm1Var;
        this.zzd = mm1Var;
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
                                    synchronized (yp1.class) {
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
                return new yp1();
            }
            return new jo1(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
