package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class br1 extends dn1 {
    private static final br1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private ar1 zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.br1, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zzc = dn1Var;
        dn1.t(br1.class, dn1Var);
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
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (br1.class) {
                                        try {
                                            fo1Var = zzd;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzc);
                                                zzd = fo1Var;
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
                        return zzc;
                    }
                    return new bn1(zzc);
                }
                return new dn1();
            }
            return new jo1(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
