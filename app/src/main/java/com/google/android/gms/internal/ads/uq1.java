package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uq1 extends dn1 {
    private static final uq1 zzp;
    private static volatile fo1 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private kn1 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private kn1 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        uq1 uq1Var = new uq1();
        zzp = uq1Var;
        dn1.t(uq1.class, uq1Var);
    }

    public uq1() {
        io1 io1Var = io1.f7187y;
        this.zze = io1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = io1Var;
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
                                fo1 fo1Var2 = zzu;
                                if (fo1Var2 == null) {
                                    synchronized (uq1.class) {
                                        try {
                                            fo1Var = zzu;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzp);
                                                zzu = fo1Var;
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
                        return zzp;
                    }
                    return new bn1(zzp);
                }
                return new uq1();
            }
            return new jo1(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", np1.f8813r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", tq1.class, "zzc", "zzk", np1.f8812q, "zzl", "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
