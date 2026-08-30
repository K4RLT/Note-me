package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class s3 extends r1 {
    private static final s3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private l3 zzg;
    private m3 zzh;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        r1.f(s3.class, s3Var);
    }

    public static /* synthetic */ void p(s3 s3Var, w3 w3Var) {
        s3Var.zzf = w3Var;
        s3Var.zze = 4;
    }

    public static r3 q() {
        return (r3) zzb.k();
    }

    public static /* synthetic */ void r(s3 s3Var, b3 b3Var) {
        s3Var.zzf = b3Var;
        s3Var.zze = 2;
    }

    public static /* synthetic */ void s(s3 s3Var, e3 e3Var) {
        s3Var.zzf = e3Var;
        s3Var.zze = 3;
    }

    public static /* synthetic */ void t(s3 s3Var, h3 h3Var) {
        h3Var.getClass();
        s3Var.zzf = h3Var;
        s3Var.zze = 7;
    }

    public static /* synthetic */ void u(s3 s3Var, l3 l3Var) {
        l3Var.getClass();
        s3Var.zzg = l3Var;
        s3Var.zzd |= 1;
    }

    public static /* synthetic */ void v(s3 s3Var, v3 v3Var) {
        s3Var.zzf = v3Var;
        s3Var.zze = 8;
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
                return new s3();
            }
            return new o2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", b3.class, e3.class, w3.class, j3.class, "zzh", h3.class, v3.class});
        }
        return (byte) 1;
    }
}
