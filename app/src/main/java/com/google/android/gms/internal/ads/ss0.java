package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ss0 extends dn1 {
    private static final ss0 zzf;
    private static volatile fo1 zzg;
    private long zza;
    private long zzb;
    private kn1 zzc;
    private kn1 zzd;
    private kn1 zze;

    static {
        ss0 ss0Var = new ss0();
        zzf = ss0Var;
        dn1.t(ss0.class, ss0Var);
    }

    public ss0() {
        io1 io1Var = io1.f7187y;
        this.zzc = io1Var;
        this.zzd = io1Var;
        this.zze = io1Var;
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
                                    synchronized (ss0.class) {
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
                return new ss0();
            }
            return new jo1(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
