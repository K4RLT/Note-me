package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class lg1 extends dn1 {
    private static final lg1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private ng1 zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.lg1, com.google.android.gms.internal.ads.dn1] */
    static {
        dn1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(lg1.class, dn1Var);
    }

    public static lg1 A(om1 om1Var, wm1 wm1Var) {
        return (lg1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static kg1 B() {
        return (kg1) zzd.q();
    }

    public final /* synthetic */ void C(ng1 ng1Var) {
        this.zzb = ng1Var;
        this.zza |= 1;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (lg1.class) {
                                        try {
                                            fo1Var = zze;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzd);
                                                zze = fo1Var;
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
                        return zzd;
                    }
                    return new bn1(zzd);
                }
                return new dn1();
            }
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final ng1 z() {
        ng1 ng1Var = this.zzb;
        if (ng1Var == null) {
            return ng1.B();
        }
        return ng1Var;
    }
}