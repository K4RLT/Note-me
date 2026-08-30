package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class d4 extends q5 {
    private static final d4 zzb;
    private int zzd;
    private c4 zze;
    private u0 zzf;
    private String zzg = "";

    static {
        d4 d4Var = new d4();
        zzb = d4Var;
        q5.k(d4.class, d4Var);
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
                return new d4();
            }
            return new l6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
