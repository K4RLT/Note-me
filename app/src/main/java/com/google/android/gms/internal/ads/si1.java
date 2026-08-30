package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class si1 extends dn1 {
    private static final si1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private wi1 zzc;
    private om1 zzd = om1.f9167v;

    static {
        si1 si1Var = new si1();
        zze = si1Var;
        dn1.t(si1.class, si1Var);
    }

    public static si1 C(om1 om1Var, wm1 wm1Var) {
        return (si1) dn1.m(zze, om1Var, wm1Var);
    }

    public static ri1 D() {
        return (ri1) zze.q();
    }

    public final wi1 A() {
        wi1 wi1Var = this.zzc;
        if (wi1Var == null) {
            return wi1.B();
        }
        return wi1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(wi1 wi1Var) {
        this.zzc = wi1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(om1 om1Var) {
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
                                    synchronized (si1.class) {
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
                return new si1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
