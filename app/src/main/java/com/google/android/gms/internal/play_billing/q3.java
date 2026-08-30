package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class q3 extends r1 {
    private static final q3 zzb;
    private int zzd;
    private v1 zze = n2.f15493y;
    private String zzf = "";
    private boolean zzg;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        r1.f(q3.class, q3Var);
    }

    public static q3 p() {
        return zzb;
    }

    public static /* synthetic */ void q(q3 q3Var, boolean z3) {
        q3Var.zzd |= 2;
        q3Var.zzg = z3;
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
                return new q3();
            }
            return new o2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", p3.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
