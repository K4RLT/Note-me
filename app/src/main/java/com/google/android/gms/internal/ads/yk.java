package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final yk zzh;
    private static volatile fo1 zzi;
    private int zzd;
    private String zze = "";
    private kn1 zzf = io1.f7187y;
    private int zzg;

    static {
        yk ykVar = new yk();
        zzh = ykVar;
        dn1.t(yk.class, ykVar);
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
                                    synchronized (yk.class) {
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
                return new yk();
            }
            return new jo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", xk.class, "zzg", nd.f8669x});
        }
        return (byte) 1;
    }
}
