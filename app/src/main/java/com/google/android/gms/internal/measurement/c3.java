package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c3 extends b5 {
    private static final c3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private i5 zzk = x5.f13969x;

    static {
        c3 c3Var = new c3();
        zzc = c3Var;
        b5.i(c3.class, c3Var);
    }

    public static void A(c3 c3Var) {
        c3Var.zze &= -17;
        c3Var.zzj = 0.0d;
    }

    public static void C(c3 c3Var) {
        c3Var.getClass();
        c3Var.zzk = x5.f13969x;
    }

    public static b3 D() {
        return (b3) zzc.k();
    }

    public static void q(c3 c3Var, double d2) {
        c3Var.zze |= 16;
        c3Var.zzj = d2;
    }

    public static void r(c3 c3Var, long j10) {
        c3Var.zze |= 4;
        c3Var.zzh = j10;
    }

    public static void s(c3 c3Var, c3 c3Var2) {
        c3Var.getClass();
        i5 i5Var = c3Var.zzk;
        if (!((o4) i5Var).f13871u) {
            c3Var.zzk = b5.e(i5Var);
        }
        c3Var.zzk.add(c3Var2);
    }

    public static void t(c3 c3Var, String str) {
        c3Var.getClass();
        str.getClass();
        c3Var.zze |= 1;
        c3Var.zzf = str;
    }

    public static void u(c3 c3Var, ArrayList arrayList) {
        i5 i5Var = c3Var.zzk;
        if (!((o4) i5Var).f13871u) {
            c3Var.zzk = b5.e(i5Var);
        }
        m4.b(arrayList, c3Var.zzk);
    }

    public static void v(c3 c3Var) {
        c3Var.zze &= -3;
        c3Var.zzg = zzc.zzg;
    }

    public static void x(c3 c3Var) {
        c3Var.zze &= -5;
        c3Var.zzh = 0L;
    }

    public static void y(c3 c3Var, String str) {
        c3Var.getClass();
        str.getClass();
        c3Var.zze |= 2;
        c3Var.zzg = str;
    }

    public final long B() {
        return this.zzh;
    }

    public final String E() {
        return this.zzf;
    }

    public final String F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzk;
    }

    public final boolean H() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new c3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", c3.class});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (c3.class) {
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
        return this.zzj;
    }

    public final float w() {
        return this.zzi;
    }

    public final int z() {
        return this.zzk.size();
    }
}
