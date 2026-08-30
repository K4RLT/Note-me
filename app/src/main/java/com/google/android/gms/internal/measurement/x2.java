package com.google.android.gms.internal.measurement;
import q.x;

/* loaded from: classes.dex */
public final class x2 extends b5 {
    private static final x2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b5, com.google.android.gms.internal.measurement.x2] */
    static {
        b5 b5Var = new b5();
        zzc = b5Var;
        b5.i(x2.class, b5Var);
    }

    public static void q(x2 x2Var, int i) {
        x2Var.zze |= 1;
        x2Var.zzf = i;
    }

    public static void r(x2 x2Var, long j10) {
        x2Var.zze |= 2;
        x2Var.zzg = j10;
    }

    public static w2 t() {
        return (w2) zzc.k();
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
                return new z5(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (x2.class) {
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

    public final long s() {
        return this.zzg;
    }

    public final boolean u() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}