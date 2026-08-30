package com.google.android.gms.internal.measurement;
import q.x;

/* loaded from: classes.dex */
public final class v2 extends b5 {
    private static final v2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private k3 zzg;
    private k3 zzh;
    private boolean zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b5, com.google.android.gms.internal.measurement.v2] */
    static {
        b5 b5Var = new b5();
        zzc = b5Var;
        b5.i(v2.class, b5Var);
    }

    public static void q(v2 v2Var, int i) {
        v2Var.zze |= 1;
        v2Var.zzf = i;
    }

    public static void r(v2 v2Var, k3 k3Var) {
        v2Var.getClass();
        v2Var.zzg = k3Var;
        v2Var.zze |= 2;
    }

    public static void s(v2 v2Var, boolean z3) {
        v2Var.zze |= 8;
        v2Var.zzi = z3;
    }

    public static u2 t() {
        return (u2) zzc.k();
    }

    public static void u(v2 v2Var, k3 k3Var) {
        v2Var.getClass();
        k3Var.getClass();
        v2Var.zzh = k3Var;
        v2Var.zze |= 4;
    }

    public final boolean A() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new b5();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (v2.class) {
                        try {
                            v5Var = zzd;
                            if (v5Var == null) {
                                v5Var = new c5(6);
                                zzd = v5Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return v5Var;
                }
                return v5Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                x.h();
                return null;
        }
    }

    public final int p() {
        return this.zzf;
    }

    public final k3 v() {
        k3 k3Var = this.zzg;
        if (k3Var == null) {
            return k3.C();
        }
        return k3Var;
    }

    public final k3 w() {
        k3 k3Var = this.zzh;
        if (k3Var == null) {
            return k3.C();
        }
        return k3Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }
}