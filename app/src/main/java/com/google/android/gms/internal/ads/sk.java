package com.google.android.gms.internal.ads;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class sk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final sk zzh;
    private static volatile fo1 zzi;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private ek zzf;
    private zj zzg;

    static {
        sk skVar = new sk();
        zzh = skVar;
        dn1.t(sk.class, skVar);
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
                                fo1 fo1Var2 = zzi;
                                if (fo1Var2 == null) {
                                    synchronized (sk.class) {
                                        try {
                                            fo1Var = zzi;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzh);
                                                zzi = fo1Var;
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
                        return zzh;
                    }
                    return new bn1(zzh);
                }
                return new sk();
            }
            return new jo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", nd.f8669x, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
