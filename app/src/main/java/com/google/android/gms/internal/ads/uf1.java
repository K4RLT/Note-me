package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uf1 extends dn1 {
    private static final uf1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private yf1 zzc;
    private om1 zzd = om1.f9167v;

    static {
        uf1 uf1Var = new uf1();
        zze = uf1Var;
        dn1.t(uf1.class, uf1Var);
    }

    public static uf1 C(om1 om1Var, wm1 wm1Var) {
        return (uf1) dn1.m(zze, om1Var, wm1Var);
    }

    public static tf1 D() {
        return (tf1) zze.q();
    }

    public static fo1 E() {
        return zze.o();
    }

    public final yf1 A() {
        yf1 yf1Var = this.zzc;
        if (yf1Var == null) {
            return yf1.B();
        }
        return yf1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(yf1 yf1Var) {
        this.zzc = yf1Var;
        this.zza |= 1;
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
                                    synchronized (uf1.class) {
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
                return new uf1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
