package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gi1 extends dn1 {
    private static final gi1 zzj;
    private static volatile fo1 zzk;
    private int zza;
    private int zzb;
    private ii1 zzc;
    private om1 zzd;
    private om1 zze;
    private om1 zzf;
    private om1 zzg;
    private om1 zzh;
    private om1 zzi;

    static {
        gi1 gi1Var = new gi1();
        zzj = gi1Var;
        dn1.t(gi1.class, gi1Var);
    }

    public gi1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
        this.zzf = mm1Var;
        this.zzg = mm1Var;
        this.zzh = mm1Var;
        this.zzi = mm1Var;
    }

    public static gi1 H(om1 om1Var, wm1 wm1Var) {
        return (gi1) dn1.m(zzj, om1Var, wm1Var);
    }

    public static fi1 I() {
        return (fi1) zzj.q();
    }

    public static fo1 J() {
        return zzj.o();
    }

    public final ii1 A() {
        ii1 ii1Var = this.zzc;
        if (ii1Var == null) {
            return ii1.F();
        }
        return ii1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final om1 C() {
        return this.zze;
    }

    public final om1 D() {
        return this.zzf;
    }

    public final om1 E() {
        return this.zzg;
    }

    public final om1 F() {
        return this.zzh;
    }

    public final om1 G() {
        return this.zzi;
    }

    public final /* synthetic */ void K() {
        this.zzb = 0;
    }

    public final /* synthetic */ void L(ii1 ii1Var) {
        this.zzc = ii1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(mm1 mm1Var) {
        mm1Var.getClass();
        this.zzd = mm1Var;
    }

    public final /* synthetic */ void N(mm1 mm1Var) {
        mm1Var.getClass();
        this.zze = mm1Var;
    }

    public final /* synthetic */ void O(mm1 mm1Var) {
        mm1Var.getClass();
        this.zzf = mm1Var;
    }

    public final /* synthetic */ void P(mm1 mm1Var) {
        mm1Var.getClass();
        this.zzg = mm1Var;
    }

    public final /* synthetic */ void Q(mm1 mm1Var) {
        mm1Var.getClass();
        this.zzh = mm1Var;
    }

    public final /* synthetic */ void R(mm1 mm1Var) {
        mm1Var.getClass();
        this.zzi = mm1Var;
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
                                    synchronized (gi1.class) {
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
                return new gi1();
            }
            return new jo1(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
