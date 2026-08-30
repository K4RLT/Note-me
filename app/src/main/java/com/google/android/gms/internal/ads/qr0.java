package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class qr0 extends dn1 {
    private static final qr0 zzi;
    private static volatile fo1 zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        qr0 qr0Var = new qr0();
        zzi = qr0Var;
        dn1.t(qr0.class, qr0Var);
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
                                fo1 fo1Var2 = zzj;
                                if (fo1Var2 == null) {
                                    synchronized (qr0.class) {
                                        try {
                                            fo1Var = zzj;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzi);
                                                zzj = fo1Var;
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
                        return zzi;
                    }
                    return new bn1(zzi);
                }
                return new qr0();
            }
            return new jo1(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
