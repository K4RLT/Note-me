package com.google.android.gms.internal.play_billing;
import a1.e;
import q3.p;

/* loaded from: classes.dex */
public final class e3 extends r1 {
    private static final e3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        e3 e3Var = new e3();
        zzb = e3Var;
        r1.f(e3.class, e3Var);
    }

    public static /* synthetic */ void p(e3 e3Var, int i) {
        e3Var.zzg = i - 1;
        e3Var.zzd |= 1;
    }

    public static c3 q() {
        return (c3) zzb.k();
    }

    public static void s(e3 e3Var, i3 i3Var) {
        e3Var.zzh = i3Var.f15455u;
        e3Var.zzd |= 2;
    }

    public static /* synthetic */ void t(e3 e3Var, q3 q3Var) {
        e3Var.zzf = q3Var;
        e3Var.zze = 4;
    }

    public static /* synthetic */ void u(e3 e3Var, y3 y3Var) {
        e3Var.zzf = y3Var;
        e3Var.zze = 3;
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
                return new e3();
            }
            return new o2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", a1.f15372c, n3.class, y3.class, q3.class, "zzh", a1.e});
        }
        return (byte) 1;
    }

    public final q3 r() {
        if (this.zze == 4) {
            return (q3) this.zzf;
        }
        return q3.p();
    }
}
