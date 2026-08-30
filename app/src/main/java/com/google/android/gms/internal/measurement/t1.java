package com.google.android.gms.internal.measurement;
import q.x;
import v1.q;

/* loaded from: classes.dex */
public final class t1 extends b5 {
    private static final t1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private y1 zzf;
    private v1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        t1 t1Var = new t1();
        zzc = t1Var;
        b5.i(t1.class, t1Var);
    }

    public static void p(t1 t1Var, String str) {
        t1Var.getClass();
        t1Var.zze |= 8;
        t1Var.zzi = str;
    }

    public static t1 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new t1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (t1.class) {
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

    public final v1 r() {
        v1 v1Var = this.zzg;
        if (v1Var == null) {
            return q();
        }
        return v1Var;
    }

    public final y1 s() {
        y1 y1Var = this.zzf;
        if (y1Var == null) {
            return y1.r();
        }
        return y1Var;
    }

    public final String t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}
