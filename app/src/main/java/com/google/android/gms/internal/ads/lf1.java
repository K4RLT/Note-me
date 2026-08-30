package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lf1 extends dn1 {
    private static final lf1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private qf1 zzb;
    private ch1 zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.lf1] */
    static {
        com.google.android.gms.internal.ads.lf1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(lf1.class, dn1Var);
    }

    public static lf1 B(om1 om1Var, wm1 wm1Var) {
        return (lf1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static kf1 C() {
        return (kf1) zzd.q();
    }

    public final ch1 A() {
        ch1 ch1Var = this.zzc;
        if (ch1Var == null) {
            return ch1.E();
        }
        return ch1Var;
    }

    public final /* synthetic */ void D(qf1 qf1Var) {
        this.zzb = qf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(ch1 ch1Var) {
        this.zzc = ch1Var;
        this.zza |= 2;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (lf1.class) {
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
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final qf1 z() {
        qf1 qf1Var = this.zzb;
        if (qf1Var == null) {
            return qf1.C();
        }
        return qf1Var;
    }
}
