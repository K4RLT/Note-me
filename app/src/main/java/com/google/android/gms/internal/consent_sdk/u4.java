package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class u4 extends q5 {
    private static final u4 zzb;
    private int zzd;
    private String zze = "";

    static {
        u4 u4Var = new u4();
        zzb = u4Var;
        q5.k(u4.class, u4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q5
    public final Object f(int i) {
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
                    return new p5(zzb);
                }
                return new u4();
            }
            return new l6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
