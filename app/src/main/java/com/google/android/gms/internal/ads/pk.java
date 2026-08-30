package com.google.android.gms.internal.ads;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class pk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final pk zzl;
    private static volatile fo1 zzm;
    private int zzf;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private ek zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        pk pkVar = new pk();
        zzl = pkVar;
        dn1.t(pk.class, pkVar);
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
                                fo1 fo1Var2 = zzm;
                                if (fo1Var2 == null) {
                                    synchronized (pk.class) {
                                        try {
                                            fo1Var = zzm;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzl);
                                                zzm = fo1Var;
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
                        return zzl;
                    }
                    return new bn1(zzl);
                }
                return new pk();
            }
            return new jo1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", nd.f8669x, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
