package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sq1 extends dn1 {
    private static final sq1 zzh;
    private static volatile fo1 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private hn1 zzd = en1.f5735y;
    private kn1 zzf = io1.f7187y;
    private om1 zzg = om1.f9167v;

    static {
        sq1 sq1Var = new sq1();
        zzh = sq1Var;
        dn1.t(sq1.class, sq1Var);
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
                                fo1 fo1Var2 = zzi;
                                if (fo1Var2 == null) {
                                    synchronized (sq1.class) {
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
                return new sq1();
            }
            return new jo1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", rq1.class, "zzg"});
        }
        return (byte) 1;
    }
}
