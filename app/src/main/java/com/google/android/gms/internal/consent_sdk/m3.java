package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class m3 extends q5 {
    private static final m3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private boolean zzg;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        q5.k(m3.class, m3Var);
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
                return new m3();
            }
            return new l6(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", k3.class, l3.class});
        }
        return (byte) 1;
    }
}
