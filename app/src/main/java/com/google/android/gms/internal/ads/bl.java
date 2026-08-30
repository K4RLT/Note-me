package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class bl extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final bl zzn;
    private static volatile fo1 zzo;
    private int zzg;
    private int zzh;
    private zj zzi;
    private zj zzj;
    private zj zzk;
    private kn1 zzl = io1.f7187y;
    private int zzm;

    static {
        bl blVar = new bl();
        zzn = blVar;
        dn1.t(bl.class, blVar);
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
                                fo1 fo1Var2 = zzo;
                                if (fo1Var2 == null) {
                                    synchronized (bl.class) {
                                        try {
                                            fo1Var = zzo;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzn);
                                                zzo = fo1Var;
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
                        return zzn;
                    }
                    return new bn1(zzn);
                }
                return new bl();
            }
            return new jo1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zj.class, "zzm"});
        }
        return (byte) 1;
    }
}
