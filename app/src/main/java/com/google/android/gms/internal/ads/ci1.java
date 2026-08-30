package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ci1 extends dn1 {
    private static final ci1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private ei1 zzb;
    private int zzc;
    private om1 zzd = om1.f9167v;

    static {
        ci1 ci1Var = new ci1();
        zze = ci1Var;
        dn1.t(ci1.class, ci1Var);
    }

    public static ci1 C(om1 om1Var, wm1 wm1Var) {
        return (ci1) dn1.m(zze, om1Var, wm1Var);
    }

    public static bi1 D() {
        return (bi1) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(ei1 ei1Var) {
        this.zzb = ei1Var;
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
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (ci1.class) {
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
                return new ci1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final ei1 z() {
        ei1 ei1Var = this.zzb;
        if (ei1Var == null) {
            return ei1.B();
        }
        return ei1Var;
    }
}
