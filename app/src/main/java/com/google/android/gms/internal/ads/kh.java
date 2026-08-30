package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class kh extends dn1 {
    private static final kh zzf;
    private static volatile fo1 zzg;
    private int zza;
    private nh zzb;
    private om1 zzc = om1.f9167v;
    private long zzd;
    private long zze;

    static {
        kh khVar = new kh();
        zzf = khVar;
        dn1.t(kh.class, khVar);
    }

    public static kh C() {
        return zzf;
    }

    public final om1 A() {
        return this.zzc;
    }

    public final long B() {
        return this.zze;
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
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (kh.class) {
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
                return new kh();
            }
            return new jo1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final nh z() {
        nh nhVar = this.zzb;
        if (nhVar == null) {
            return nh.B();
        }
        return nhVar;
    }
}
