package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

/* loaded from: classes.dex */
public final class z2 extends b5 {
    private static final z2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private i5 zzf = x5.f13969x;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        z2 z2Var = new z2();
        zzc = z2Var;
        b5.i(z2.class, z2Var);
    }

    public static y2 C() {
        return (y2) zzc.k();
    }

    public static void r(int i, z2 z2Var) {
        z2Var.I();
        z2Var.zzf.remove(i);
    }

    public static void s(long j10, z2 z2Var) {
        z2Var.zze |= 2;
        z2Var.zzh = j10;
    }

    public static void t(z2 z2Var) {
        z2Var.getClass();
        z2Var.zzf = x5.f13969x;
    }

    public static void u(z2 z2Var, int i, c3 c3Var) {
        z2Var.getClass();
        z2Var.I();
        z2Var.zzf.set(i, c3Var);
    }

    public static void v(z2 z2Var, c3 c3Var) {
        z2Var.getClass();
        c3Var.getClass();
        z2Var.I();
        z2Var.zzf.add(c3Var);
    }

    public static void w(z2 z2Var, Iterable iterable) {
        z2Var.I();
        m4.b(iterable, z2Var.zzf);
    }

    public static void x(z2 z2Var, String str) {
        z2Var.getClass();
        str.getClass();
        z2Var.zze |= 1;
        z2Var.zzg = str;
    }

    public static void z(long j10, z2 z2Var) {
        z2Var.zze |= 4;
        z2Var.zzi = j10;
    }

    public final long A() {
        return this.zzi;
    }

    public final long B() {
        return this.zzh;
    }

    public final String D() {
        return this.zzg;
    }

    public final i5 E() {
        return this.zzf;
    }

    public final boolean F() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void I() {
        i5 i5Var = this.zzf;
        if (!((o4) i5Var).f13871u) {
            this.zzf = b5.e(i5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new z2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", c3.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (z2.class) {
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
        return this.zzj;
    }

    public final c3 q(int i) {
        return (c3) this.zzf.get(i);
    }

    public final int y() {
        return this.zzf.size();
    }
}
