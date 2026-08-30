package com.google.android.gms.internal.measurement;
import q.x;
import v1.q;
import x.h;

/* loaded from: classes.dex */
public final class r1 extends b5 {
    private static final r1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private i5 zzh = x5.f13969x;
    private boolean zzi;
    private v1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        r1 r1Var = new r1();
        zzc = r1Var;
        b5.i(r1.class, r1Var);
    }

    public static void r(r1 r1Var, int i, t1 t1Var) {
        r1Var.getClass();
        i5 i5Var = r1Var.zzh;
        if (!((o4) i5Var).f13871u) {
            r1Var.zzh = b5.e(i5Var);
        }
        r1Var.zzh.set(i, t1Var);
    }

    public static void s(r1 r1Var, String str) {
        r1Var.getClass();
        r1Var.zze |= 2;
        r1Var.zzg = str;
    }

    public static q1 u() {
        return (q1) zzc.k();
    }

    public final boolean A() {
        return this.zzm;
    }

    public final boolean B() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new r1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", t1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (r1.class) {
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
        return this.zzh.size();
    }

    public final t1 q(int i) {
        return (t1) this.zzh.get(i);
    }

    public final int t() {
        return this.zzf;
    }

    public final v1 v() {
        v1 v1Var = this.zzj;
        if (v1Var == null) {
            return v1.q();
        }
        return v1Var;
    }

    public final String w() {
        return this.zzg;
    }

    public final i5 x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzl;
    }
}
