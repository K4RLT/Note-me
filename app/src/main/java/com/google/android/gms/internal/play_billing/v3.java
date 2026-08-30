package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class v3 extends r1 {
    private static final v3 zzb;
    private int zzd;
    private g3 zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.v3] */
    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        r1.f(v3.class, r1Var);
    }

    public static u3 p() {
        return (u3) zzb.k();
    }

    public static /* synthetic */ void q(v3 v3Var, g3 g3Var) {
        v3Var.zze = g3Var;
        v3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(v3 v3Var, long j10) {
        v3Var.zzd |= 2;
        v3Var.zzf = j10;
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
            return new o2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}