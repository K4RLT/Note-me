package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: classes.dex */
public final class bh extends dn1 {
    private static final bh zzj;
    private static volatile fo1 zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private om1 zzb = om1.f9167v;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        bh bhVar = new bh();
        zzj = bhVar;
        dn1.t(bh.class, bhVar);
    }

    public static zg z() {
        return (zg) zzj.q();
    }

    public final /* synthetic */ void A(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 1;
        this.zzb = om1Var;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
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

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void G(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final void H(int i) {
        this.zzi = i - 2;
        this.zza |= 128;
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
                                    synchronized (bh.class) {
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
                return new bh();
            }
            return new jo1(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
