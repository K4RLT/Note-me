package com.google.android.gms.internal.measurement;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class f3 extends b5 {
    private static final f3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private i5 zzf = x5.f13969x;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        f3 f3Var = new f3();
        zzc = f3Var;
        b5.i(f3.class, f3Var);
    }

    public static void r(f3 f3Var, h3 h3Var) {
        f3Var.getClass();
        i5 i5Var = f3Var.zzf;
        if (!((o4) i5Var).f13871u) {
            f3Var.zzf = b5.e(i5Var);
        }
        f3Var.zzf.add(h3Var);
    }

    public static void s(f3 f3Var, String str) {
        f3Var.getClass();
        str.getClass();
        f3Var.zze |= 2;
        f3Var.zzh = str;
    }

    public static e3 t() {
        return (e3) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new f3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", h3.class, "zzg", "zzh", "zzi", a2.f13633g});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (f3.class) {
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
        return this.zzf.size();
    }

    public final h3 q() {
        return (h3) this.zzf.get(0);
    }

    public final String u() {
        return this.zzh;
    }

    public final List v() {
        return this.zzf;
    }

    public final boolean w() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }
}
