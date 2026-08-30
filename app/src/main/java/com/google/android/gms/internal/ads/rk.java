package com.google.android.gms.internal.ads;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class rk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final rk zzn;
    private static volatile fo1 zzo;
    private int zzg;
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private ek zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        rk rkVar = new rk();
        zzn = rkVar;
        dn1.t(rk.class, rkVar);
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
                                fo1 fo1Var2 = zzo;
                                if (fo1Var2 == null) {
                                    synchronized (rk.class) {
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
                return new rk();
            }
            return new jo1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", nd.f8669x, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
