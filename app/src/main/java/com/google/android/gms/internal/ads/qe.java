package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qe extends dn1 {
    private static final qe zzi;
    private static volatile fo1 zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        qe qeVar = new qe();
        zzi = qeVar;
        dn1.t(qe.class, qeVar);
    }

    public static pe z() {
        return (pe) zzi.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
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
                                fo1 fo1Var2 = zzj;
                                if (fo1Var2 == null) {
                                    synchronized (qe.class) {
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
                return new qe();
            }
            return new jo1(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
