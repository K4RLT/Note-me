package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class q6 extends q5 {
    private static final q6 zzb;
    private long zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.consent_sdk.q6, com.google.android.gms.internal.consent_sdk.q5] */
    static {
        ?? q5Var = new q5();
        zzb = q5Var;
        q5.k(q6.class, q5Var);
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
                return new q5();
            }
            return new l6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
