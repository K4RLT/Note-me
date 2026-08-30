package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class wx0 extends dn1 {
    private static final wx0 zzl;
    private static volatile fo1 zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        wx0 wx0Var = new wx0();
        zzl = wx0Var;
        dn1.t(wx0.class, wx0Var);
    }

    public static vx0 G() {
        return (vx0) zzl.q();
    }

    public static wx0 H() {
        return zzl;
    }

    public final long A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final long E() {
        return this.zzj;
    }

    public final long F() {
        return this.zzk;
    }

    public final /* synthetic */ void I(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    public final /* synthetic */ void J(long j10) {
        this.zza |= 64;
        this.zzh = j10;
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
                                fo1 fo1Var2 = zzm;
                                if (fo1Var2 == null) {
                                    synchronized (wx0.class) {
                                        try {
                                            fo1Var = zzm;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzl);
                                                zzm = fo1Var;
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
                        return zzl;
                    }
                    return new bn1(zzl);
                }
                return new wx0();
            }
            return new jo1(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean z() {
        return this.zzd;
    }
}
