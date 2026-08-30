package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class mq1 extends dn1 {
    private static final mq1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private String zzb = "";
    private kn1 zzc;
    private kn1 zzd;
    private String zze;

    static {
        mq1 mq1Var = new mq1();
        zzf = mq1Var;
        dn1.t(mq1.class, mq1Var);
    }

    public mq1() {
        io1 io1Var = io1.f7187y;
        this.zzc = io1Var;
        this.zzd = io1Var;
        this.zze = "";
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
                                    synchronized (mq1.class) {
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
                return new mq1();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
