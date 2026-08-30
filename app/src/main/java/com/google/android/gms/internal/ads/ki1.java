package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ki1 extends dn1 {
    private static final ki1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private mi1 zzb;
    private int zzc;
    private om1 zzd = om1.f9167v;

    static {
        ki1 ki1Var = new ki1();
        zze = ki1Var;
        dn1.t(ki1.class, ki1Var);
    }

    public static ki1 C(om1 om1Var, wm1 wm1Var) {
        return (ki1) dn1.m(zze, om1Var, wm1Var);
    }

    public static ji1 D() {
        return (ji1) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(mi1 mi1Var) {
        this.zzb = mi1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void G(om1 om1Var) {
        om1Var.getClass();
        this.zzd = om1Var;
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
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (ki1.class) {
                                        try {
                                            fo1Var = zzf;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zze);
                                                zzf = fo1Var;
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
                        return zze;
                    }
                    return new bn1(zze);
                }
                return new ki1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final mi1 z() {
        mi1 mi1Var = this.zzb;
        if (mi1Var == null) {
            return mi1.D();
        }
        return mi1Var;
    }
}
