package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class e2 extends q5 {
    private static final e2 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        q5.k(e2.class, e2Var);
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
                return new e2();
            }
            return new l6(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", d2.class, c2.class});
        }
        return (byte) 1;
    }
}
