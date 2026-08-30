package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class al extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final al zzl;
    private static volatile fo1 zzm;
    private int zzf;
    private String zzg = "";
    private kn1 zzh = io1.f7187y;
    private int zzi = AdError.NETWORK_ERROR_CODE;
    private int zzj = AdError.NETWORK_ERROR_CODE;
    private int zzk = AdError.NETWORK_ERROR_CODE;

    static {
        al alVar = new al();
        zzl = alVar;
        dn1.t(al.class, alVar);
    }

    public static al z() {
        return zzl;
    }

    public final void A(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
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
                                fo1 fo1Var2 = zzm;
                                if (fo1Var2 == null) {
                                    synchronized (al.class) {
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
                return new al();
            }
            nd ndVar = nd.f8669x;
            return new jo1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", xk.class, "zzi", ndVar, "zzj", ndVar, "zzk", ndVar});
        }
        return (byte) 1;
    }
}
