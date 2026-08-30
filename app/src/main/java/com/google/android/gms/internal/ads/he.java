package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class he extends dn1 {
    private static final he zzj;
    private static volatile fo1 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        he heVar = new he();
        zzj = heVar;
        dn1.t(he.class, heVar);
    }

    public static ge z() {
        return (ge) zzj.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 32;
        this.zzg = j10;
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
                                    synchronized (he.class) {
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
                return new he();
            }
            return new jo1(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
