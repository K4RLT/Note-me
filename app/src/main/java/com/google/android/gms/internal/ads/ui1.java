package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ui1 extends dn1 {
    private static final ui1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private wi1 zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.ui1] */
    static {
        com.google.android.gms.internal.ads.ui1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(ui1.class, dn1Var);
    }

    public static ui1 B(om1 om1Var, wm1 wm1Var) {
        return (ui1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static ti1 C() {
        return (ti1) zzd.q();
    }

    public final wi1 A() {
        wi1 wi1Var = this.zzc;
        if (wi1Var == null) {
            return wi1.B();
        }
        return wi1Var;
    }

    public final /* synthetic */ void D(wi1 wi1Var) {
        this.zzc = wi1Var;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (ui1.class) {
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
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
