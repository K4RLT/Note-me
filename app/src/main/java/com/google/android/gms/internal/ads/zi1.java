package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class zi1 extends dn1 {
    private static final zi1 zzb;
    private static volatile fo1 zzc;
    private int zza;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zi1, com.google.android.gms.internal.ads.dn1] */
    static {
        dn1 dn1Var = new dn1();
        zzb = dn1Var;
        dn1.t(zi1.class, dn1Var);
    }

    public static zi1 A(om1 om1Var, wm1 wm1Var) {
        return (zi1) dn1.m(zzb, om1Var, wm1Var);
    }

    public static zi1 B() {
        return zzb;
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (zi1.class) {
                                        try {
                                            fo1Var = zzc;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzb);
                                                zzc = fo1Var;
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
                        return zzb;
                    }
                    return new bn1(zzb);
                }
                return new dn1();
            }
            return new jo1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza;
    }
}