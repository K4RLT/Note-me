package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class z0 extends r1 {
    private static final z0 zzb;
    private int zzd;
    private String zze = "";

    static {
        z0 z0Var = new z0();
        zzb = z0Var;
        r1.f(z0.class, z0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final Object j(int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new q1(zzb);
                }
                return new z0();
            }
            return new o2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
