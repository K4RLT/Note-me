package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ii1 extends dn1 {
    private static final ii1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb;
    private ei1 zzc;
    private om1 zzd;
    private om1 zze;

    static {
        ii1 ii1Var = new ii1();
        zzf = ii1Var;
        dn1.t(ii1.class, ii1Var);
    }

    public ii1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
    }

    public static ii1 D(om1 om1Var, wm1 wm1Var) {
        return (ii1) dn1.m(zzf, om1Var, wm1Var);
    }

    public static hi1 E() {
        return (hi1) zzf.q();
    }

    public static ii1 F() {
        return zzf;
    }

    public static fo1 G() {
        return zzf.o();
    }

    public final ei1 A() {
        ei1 ei1Var = this.zzc;
        if (ei1Var == null) {
            return ei1.B();
        }
        return ei1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final om1 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(ei1 ei1Var) {
        this.zzc = ei1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(om1 om1Var) {
        om1Var.getClass();
        this.zzd = om1Var;
    }

    public final /* synthetic */ void J(mm1 mm1Var) {
        mm1Var.getClass();
        this.zze = mm1Var;
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
                                    synchronized (ii1.class) {
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
                return new ii1();
            }
            return new jo1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
