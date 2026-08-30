package com.google.android.gms.internal.measurement;
import q.x;

/* loaded from: classes.dex */
public final class t2 extends b5 {
    private static final t2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.t2, com.google.android.gms.internal.measurement.b5] */
    static {
        b5 b5Var = new b5();
        zzc = b5Var;
        b5.i(t2.class, b5Var);
    }

    public static void A(t2 t2Var, boolean z3) {
        t2Var.zze |= 64;
        t2Var.zzl = z3;
    }

    public static s2 p() {
        return (s2) zzc.k();
    }

    public static void q(t2 t2Var, boolean z3) {
        t2Var.zze |= 1;
        t2Var.zzf = z3;
    }

    public static void r(t2 t2Var, boolean z3) {
        t2Var.zze |= 2;
        t2Var.zzg = z3;
    }

    public static t2 s() {
        return zzc;
    }

    public static void t(t2 t2Var, boolean z3) {
        t2Var.zze |= 4;
        t2Var.zzh = z3;
    }

    public static void u(t2 t2Var, boolean z3) {
        t2Var.zze |= 8;
        t2Var.zzi = z3;
    }

    public static void w(t2 t2Var, boolean z3) {
        t2Var.zze |= 16;
        t2Var.zzj = z3;
    }

    public static void y(t2 t2Var, boolean z3) {
        t2Var.zze |= 32;
        t2Var.zzk = z3;
    }

    public final boolean B() {
        return this.zzl;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
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
                return new z5(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (t2.class) {
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

    public final boolean v() {
        return this.zzk;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzf;
    }
}