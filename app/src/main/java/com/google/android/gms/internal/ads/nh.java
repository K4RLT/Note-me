package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nh extends dn1 {
    private static final nh zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.nh] */
    static {
        com.google.android.gms.internal.ads.nh dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(nh.class, dn1Var);
    }

    public static nh B() {
        return zzd;
    }

    public final int A() {
        return this.zzc;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (nh.class) {
                                        try {
                                            fo1Var = zze;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzd);
                                                zze = fo1Var;
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
                        return zzd;
                    }
                    return new bn1(zzd);
                }
                return new dn1();
            }
            return new jo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
