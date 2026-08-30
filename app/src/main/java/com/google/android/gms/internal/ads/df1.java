package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class df1 extends dn1 {
    private static final df1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private om1 zzc = om1.f9167v;
    private hf1 zzd;

    static {
        df1 df1Var = new df1();
        zze = df1Var;
        dn1.t(df1.class, df1Var);
    }

    public static df1 C(om1 om1Var, wm1 wm1Var) {
        return (df1) dn1.m(zze, om1Var, wm1Var);
    }

    public static cf1 D() {
        return (cf1) zze.q();
    }

    public static fo1 E() {
        return zze.o();
    }

    public final om1 A() {
        return this.zzc;
    }

    public final hf1 B() {
        hf1 hf1Var = this.zzd;
        if (hf1Var == null) {
            return hf1.B();
        }
        return hf1Var;
    }

    public final /* synthetic */ void F(om1 om1Var) {
        om1Var.getClass();
        this.zzc = om1Var;
    }

    public final /* synthetic */ void G(hf1 hf1Var) {
        this.zzd = hf1Var;
        this.zza |= 1;
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
                                    synchronized (df1.class) {
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
                return new df1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
