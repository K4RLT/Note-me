package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class ty0 extends dn1 {
    private static final ty0 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private vy0 zzb;
    private om1 zzc;
    private om1 zzd;
    private int zze;

    static {
        ty0 ty0Var = new ty0();
        zzf = ty0Var;
        dn1.t(ty0.class, ty0Var);
    }

    public ty0() {
        mm1 mm1Var = om1.f9167v;
        this.zzc = mm1Var;
        this.zzd = mm1Var;
    }

    public static sy0 C() {
        return (sy0) zzf.q();
    }

    public final om1 A() {
        return this.zzc;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void D(vy0 vy0Var) {
        this.zzb = vy0Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 2;
        this.zzc = om1Var;
    }

    public final /* synthetic */ void F(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 4;
        this.zzd = om1Var;
    }

    public final int G() {
        int a10 = x21.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final /* synthetic */ void H(int i) {
        this.zze = i - 1;
        this.zza |= 8;
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
                                    synchronized (ty0.class) {
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
                return new ty0();
            }
            return new jo1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", nd.B});
        }
        return (byte) 1;
    }

    public final vy0 z() {
        vy0 vy0Var = this.zzb;
        if (vy0Var == null) {
            return vy0.F();
        }
        return vy0Var;
    }
}
