package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class a2 extends q5 {
    private static final a2 zzb;
    private int zzd;
    private String zze = "";

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        q5.k(a2.class, a2Var);
    }

    public static z1 l() {
        return (z1) zzb.g();
    }

    public static /* synthetic */ void m(a2 a2Var) {
        a2Var.zzd |= 1;
        a2Var.zze = "4.0.0";
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
                return new a2();
            }
            return new l6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
