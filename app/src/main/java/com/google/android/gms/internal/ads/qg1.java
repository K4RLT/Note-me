package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class qg1 extends dn1 {
    private static final qg1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private sg1 zzc;
    private om1 zzd = om1.f9167v;

    static {
        qg1 qg1Var = new qg1();
        zze = qg1Var;
        dn1.t(qg1.class, qg1Var);
    }

    public static qg1 C(om1 om1Var, wm1 wm1Var) {
        return (qg1) dn1.m(zze, om1Var, wm1Var);
    }

    public static og1 D() {
        return (og1) zze.q();
    }

    public static fo1 E() {
        return zze.o();
    }

    public final sg1 A() {
        sg1 sg1Var = this.zzc;
        if (sg1Var == null) {
            return sg1.F();
        }
        return sg1Var;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(sg1 sg1Var) {
        this.zzc = sg1Var;
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
                                    synchronized (qg1.class) {
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
                return new qg1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
