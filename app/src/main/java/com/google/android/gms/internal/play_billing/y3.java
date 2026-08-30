package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class y3 extends r1 {
    private static final y3 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.y3] */
    static {
        ?? r1Var = new r1();
        zzb = r1Var;
        r1.f(y3.class, r1Var);
    }

    public static x3 p() {
        return (x3) zzb.k();
    }

    public static /* synthetic */ void q(y3 y3Var, boolean z3) {
        y3Var.zzd |= 8;
        y3Var.zzh = z3;
    }

    public static /* synthetic */ void r(y3 y3Var, int i) {
        y3Var.zzd |= 16;
        y3Var.zzi = i;
    }

    public static /* synthetic */ void s(y3 y3Var, long j10) {
        y3Var.zzd |= 4;
        y3Var.zzg = j10;
    }

    public static /* synthetic */ void t(y3 y3Var) {
        y3Var.zzd |= 2;
        y3Var.zzf = true;
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
            return new o2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
