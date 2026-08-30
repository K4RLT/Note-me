package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class nr0 extends dn1 {
    private static final nr0 zzg;
    private static volatile fo1 zzh;
    private long zza;
    private hn1 zzb = en1.f5735y;
    private kn1 zzc;
    private kn1 zzd;
    private kn1 zze;
    private kn1 zzf;

    static {
        nr0 nr0Var = new nr0();
        zzg = nr0Var;
        dn1.t(nr0.class, nr0Var);
    }

    public nr0() {
        io1 io1Var = io1.f7187y;
        this.zzc = io1Var;
        this.zzd = io1Var;
        this.zze = io1Var;
        this.zzf = io1Var;
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
                                fo1 fo1Var2 = zzh;
                                if (fo1Var2 == null) {
                                    synchronized (nr0.class) {
                                        try {
                                            fo1Var = zzh;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzg);
                                                zzh = fo1Var;
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
                        return zzg;
                    }
                    return new bn1(zzg);
                }
                return new nr0();
            }
            return new jo1(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
