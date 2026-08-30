package com.google.android.gms.internal.measurement;
import q.x;

/* loaded from: classes.dex */
public final class x1 extends b5 {
    private static final x1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private t1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        x1 x1Var = new x1();
        zzc = x1Var;
        b5.i(x1.class, x1Var);
    }

    public static void q(x1 x1Var, String str) {
        x1Var.getClass();
        x1Var.zze |= 2;
        x1Var.zzg = str;
    }

    public static w1 s() {
        return (w1) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new x1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (x1.class) {
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

    public final t1 r() {
        t1 t1Var = this.zzh;
        if (t1Var == null) {
            return t1.q();
        }
        return t1Var;
    }

    public final String t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final boolean w() {
        return this.zzk;
    }

    public final boolean x() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }
}
