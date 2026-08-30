package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class h3 extends r1 {
    private static final h3 zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.h3] */
    static {
        ?? r1Var = new r1();
        zzb = r1Var;
        r1.f(h3.class, r1Var);
    }

    public static h3 p() {
        return zzb;
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
                return new r1();
            }
            return new o2(zzb, "\u0004\u0000", null);
        }
        return (byte) 1;
    }
}
