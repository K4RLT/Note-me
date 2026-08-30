package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

import java.util.List;

/* loaded from: classes.dex */
public final class p1 extends b5 {
    private static final p1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private i5 zzg;
    private i5 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        p1 p1Var = new p1();
        zzc = p1Var;
        b5.i(p1.class, p1Var);
    }

    public p1() {
        x5 x5Var = x5.f13969x;
        this.zzg = x5Var;
        this.zzh = x5Var;
    }

    public static void r(p1 p1Var, int i, r1 r1Var) {
        p1Var.getClass();
        i5 i5Var = p1Var.zzh;
        if (!((o4) i5Var).f13871u) {
            p1Var.zzh = b5.e(i5Var);
        }
        p1Var.zzh.set(i, r1Var);
    }

    public static void s(p1 p1Var, int i, x1 x1Var) {
        p1Var.getClass();
        i5 i5Var = p1Var.zzg;
        if (!((o4) i5Var).f13871u) {
            p1Var.zzg = b5.e(i5Var);
        }
        p1Var.zzg.set(i, x1Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new p1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", x1.class, "zzh", r1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (p1.class) {
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

    public final int p() {
        return this.zzf;
    }

    public final r1 q(int i) {
        return (r1) this.zzh.get(i);
    }

    public final int t() {
        return this.zzh.size();
    }

    public final x1 u(int i) {
        return (x1) this.zzg.get(i);
    }

    public final int v() {
        return this.zzg.size();
    }

    public final List w() {
        return this.zzh;
    }

    public final List x() {
        return this.zzg;
    }

    public final boolean y() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}
