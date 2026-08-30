package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class sg1 extends dn1 {
    private static final sg1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb;
    private ng1 zzc;
    private om1 zzd;
    private om1 zze;

    static {
        sg1 sg1Var = new sg1();
        zzf = sg1Var;
        dn1.t(sg1.class, sg1Var);
    }

    public sg1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
    }

    public static sg1 D(om1 om1Var, wm1 wm1Var) {
        return (sg1) dn1.m(zzf, om1Var, wm1Var);
    }

    public static rg1 E() {
        return (rg1) zzf.q();
    }

    public static sg1 F() {
        return zzf;
    }

    public static fo1 G() {
        return zzf.o();
    }

    public final ng1 A() {
        ng1 ng1Var = this.zzc;
        if (ng1Var == null) {
            return ng1.B();
        }
        return ng1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final om1 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(ng1 ng1Var) {
        this.zzc = ng1Var;
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
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (sg1.class) {
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
                return new sg1();
            }
            return new jo1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
