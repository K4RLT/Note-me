package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class yd extends dn1 {
    private static final yd zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb = AdError.NETWORK_ERROR_CODE;
    private int zzc = AdError.NETWORK_ERROR_CODE;
    private int zzd = AdError.NETWORK_ERROR_CODE;
    private int zze = AdError.NETWORK_ERROR_CODE;

    static {
        yd ydVar = new yd();
        zzf = ydVar;
        dn1.t(yd.class, ydVar);
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
                                    synchronized (yd.class) {
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
                return new yd();
            }
            nd ndVar = nd.f8658m;
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", ndVar, "zzc", ndVar, "zzd", ndVar, "zze", ndVar});
        }
        return (byte) 1;
    }
}
