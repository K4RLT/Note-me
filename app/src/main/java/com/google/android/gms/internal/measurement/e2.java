package com.google.android.gms.internal.measurement;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class e2 extends b5 {
    private static final e2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private i5 zzf;
    private i5 zzg;
    private i5 zzh;
    private boolean zzi;
    private i5 zzj;

    static {
        e2 e2Var = new e2();
        zzc = e2Var;
        b5.i(e2.class, e2Var);
    }

    public e2() {
        x5 x5Var = x5.f13969x;
        this.zzf = x5Var;
        this.zzg = x5Var;
        this.zzh = x5Var;
        this.zzj = x5Var;
    }

    public static e2 p() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new e2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b2.class, "zzg", c2.class, "zzh", d2.class, "zzi", "zzj", b2.class});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (e2.class) {
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

    public final i5 q() {
        return this.zzh;
    }

    public final List r() {
        return this.zzf;
    }

    public final List s() {
        return this.zzg;
    }

    public final List t() {
        return this.zzj;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}
