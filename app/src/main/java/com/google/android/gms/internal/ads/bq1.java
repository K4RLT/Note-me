package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bq1 extends dn1 {
    private static final bq1 zzi;
    private static volatile fo1 zzj;
    private int zza;
    private aq1 zzb;
    private om1 zzd;
    private om1 zze;
    private int zzf;
    private om1 zzg;
    private byte zzh = 2;
    private kn1 zzc = io1.f7187y;

    static {
        bq1 bq1Var = new bq1();
        zzi = bq1Var;
        dn1.t(bq1.class, bq1Var);
    }

    public bq1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
        this.zzg = mm1Var;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        byte b10;
        fo1 fo1Var;
        switch (q0.d.b(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                if (dn1Var == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzh = b10;
                return null;
            case 2:
                return new jo1(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", wp1.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new bq1();
            case 4:
                return new bn1(zzi);
            case 5:
                return zzi;
            case 6:
                fo1 fo1Var2 = zzj;
                if (fo1Var2 == null) {
                    synchronized (bq1.class) {
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
            default:
                throw null;
        }
    }
}
