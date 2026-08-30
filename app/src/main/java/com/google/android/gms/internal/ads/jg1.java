package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jg1 extends dn1 {
    private static final jg1 zza;
    private static volatile fo1 zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.jg1, com.google.android.gms.internal.ads.dn1] */
    static {
        com.google.android.gms.internal.ads.dn1 dn1Var = new dn1();
        zza = dn1Var;
        dn1.t(jg1.class, dn1Var);
    }

    public static jg1 A() {
        return zza;
    }

    public static void z(om1 om1Var, wm1 wm1Var) {
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
                                fo1 fo1Var2 = zzb;
                                if (fo1Var2 == null) {
                                    synchronized (jg1.class) {
                                        try {
                                            fo1Var = zzb;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zza);
                                                zzb = fo1Var;
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
                        return zza;
                    }
                    return new bn1(zza);
                }
                return new dn1();
            }
            return new jo1(zza, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
