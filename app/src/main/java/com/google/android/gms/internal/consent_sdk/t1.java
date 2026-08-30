package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class t1 extends q5 {
    private static final t1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        q5.k(t1.class, t1Var);
    }

    public static s1 l() {
        return (s1) zzb.g();
    }

    public static /* synthetic */ void m(t1 t1Var, String str) {
        str.getClass();
        t1Var.zzd |= 1;
        t1Var.zze = str;
    }

    public static /* synthetic */ void n(t1 t1Var, String str) {
        str.getClass();
        t1Var.zzd |= 2;
        t1Var.zzf = str;
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
                return new t1();
            }
            return new l6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
