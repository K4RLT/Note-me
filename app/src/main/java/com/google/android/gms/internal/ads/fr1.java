package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class fr1 extends dn1 {
    private static final fr1 zzj;
    private static volatile fo1 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private kn1 zzd;
    private kn1 zze;
    private kn1 zzf;
    private int zzg;
    private xq1 zzh;
    private String zzi;

    static {
        fr1 fr1Var = new fr1();
        zzj = fr1Var;
        dn1.t(fr1.class, fr1Var);
    }

    public fr1() {
        io1 io1Var = io1.f7187y;
        this.zzd = io1Var;
        this.zze = io1Var;
        this.zzf = io1Var;
        this.zzg = -1;
        this.zzi = "";
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
                                    synchronized (fr1.class) {
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
                return new fr1();
            }
            return new jo1(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zq1.class, "zze", cr1.class, "zzg", "zzb", "zzf", ir1.class, "zzi", "zzh"});
        }
        return (byte) 1;
    }
}
