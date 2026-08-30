package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* loaded from: classes.dex */
public final class w1 extends q5 {
    private static final w1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        q5.k(w1.class, w1Var);
    }

    public static v1 l() {
        return (v1) zzb.g();
    }

    public static /* synthetic */ void m(w1 w1Var, int i) {
        w1Var.zzd |= 8;
        w1Var.zzh = i;
    }

    public static /* synthetic */ void n(w1 w1Var) {
        String str = Build.MODEL;
        str.getClass();
        w1Var.zzd |= 4;
        w1Var.zzg = str;
    }

    public static /* synthetic */ void o(w1 w1Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        w1Var.zzd |= 2;
        w1Var.zzf = str;
    }

    public static /* synthetic */ void p(w1 w1Var) {
        w1Var.zze = 1;
        w1Var.zzd = 1 | w1Var.zzd;
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
                return new w1();
            }
            return new l6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
