package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class o3 extends b5 {
    private static final o3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        o3 o3Var = new o3();
        zzc = o3Var;
        b5.i(o3.class, o3Var);
    }

    public static n3 B() {
        return (n3) zzc.k();
    }

    public static void q(o3 o3Var, double d2) {
        o3Var.zze |= 32;
        o3Var.zzk = d2;
    }

    public static void r(o3 o3Var, long j10) {
        o3Var.zze |= 1;
        o3Var.zzf = j10;
    }

    public static void s(o3 o3Var, String str) {
        o3Var.getClass();
        str.getClass();
        o3Var.zze |= 2;
        o3Var.zzg = str;
    }

    public static void t(o3 o3Var) {
        o3Var.zze &= -5;
        o3Var.zzh = zzc.zzh;
    }

    public static void v(o3 o3Var) {
        o3Var.zze &= -9;
        o3Var.zzi = 0L;
    }

    public static void w(o3 o3Var, long j10) {
        o3Var.zze |= 8;
        o3Var.zzi = j10;
    }

    public static void x(o3 o3Var, String str) {
        o3Var.getClass();
        str.getClass();
        o3Var.zze |= 4;
        o3Var.zzh = str;
    }

    public static void z(o3 o3Var) {
        o3Var.zze &= -33;
        o3Var.zzk = 0.0d;
    }

    public final long A() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final String D() {
        return this.zzh;
    }

    public final boolean E() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
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
                return new o3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (o3.class) {
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
                q.x.h();
                return null;
        }
    }

    public final double p() {
        return this.zzk;
    }

    public final float u() {
        return this.zzj;
    }

    public final long y() {
        return this.zzi;
    }
}
