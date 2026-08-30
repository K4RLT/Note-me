package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class hl extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final hl zzj;
    private static volatile fo1 zzk;
    private int zze;
    private int zzg;
    private zj zzi;
    private String zzf = "";
    private hn1 zzh = en1.f5735y;

    static {
        hl hlVar = new hl();
        zzj = hlVar;
        dn1.t(hl.class, hlVar);
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
                                fo1 fo1Var2 = zzk;
                                if (fo1Var2 == null) {
                                    synchronized (hl.class) {
                                        try {
                                            fo1Var = zzk;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzj);
                                                zzk = fo1Var;
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
                        return zzj;
                    }
                    return new bn1(zzj);
                }
                return new hl();
            }
            return new jo1(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", nd.f8669x, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
