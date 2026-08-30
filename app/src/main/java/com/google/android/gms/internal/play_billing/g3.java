package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class g3 extends r1 {
    private static final g3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        r1.f(g3.class, g3Var);
    }

    public static f3 p() {
        return (f3) zzb.k();
    }

    public static /* synthetic */ void q(g3 g3Var, String str) {
        g3Var.zzd |= 8;
        g3Var.zzh = str;
    }

    public static /* synthetic */ void r(g3 g3Var, String str) {
        str.getClass();
        g3Var.zzd |= 2;
        g3Var.zzf = str;
    }

    public static /* synthetic */ void s(g3 g3Var, int i) {
        g3Var.zzd |= 16;
        g3Var.zzi = i;
    }

    public static void t(g3 g3Var, int i) {
        g3Var.zzg = wd0.g(i);
        g3Var.zzd |= 4;
    }

    public static /* synthetic */ void u(g3 g3Var, int i) {
        g3Var.zzd |= 1;
        g3Var.zze = i;
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
                return new g3();
            }
            return new o2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", a1.f15373d, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
