package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class gs0 extends dn1 {
    private static final gs0 zzb;
    private static volatile fo1 zzc;
    private String zza = "";

    static {
        gs0 gs0Var = new gs0();
        zzb = gs0Var;
        dn1.t(gs0.class, gs0Var);
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (gs0.class) {
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
                return new gs0();
            }
            return new jo1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        return (byte) 1;
    }
}
