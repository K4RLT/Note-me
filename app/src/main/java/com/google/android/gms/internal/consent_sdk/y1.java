package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class y1 extends q5 {
    private static final y1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        q5.k(y1.class, y1Var);
    }

    public static x1 l() {
        return (x1) zzb.g();
    }

    public static /* synthetic */ void m(y1 y1Var, String str) {
        y1Var.zzd |= 2;
        y1Var.zzf = str;
    }

    public static /* synthetic */ void n(y1 y1Var, long j10) {
        y1Var.zzd |= 4;
        y1Var.zzg = j10;
    }

    public static /* synthetic */ void o(y1 y1Var, int i) {
        y1Var.zze = i - 2;
        y1Var.zzd |= 1;
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
                return new y1();
            }
            return new l6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
