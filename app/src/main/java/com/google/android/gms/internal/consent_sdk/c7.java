package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class c7 extends q5 {
    private static final c7 zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        c7 c7Var = new c7();
        zzb = c7Var;
        q5.k(c7.class, c7Var);
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
                return new c7();
            }
            return new l6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
