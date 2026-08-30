package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.wd0;
import java.util.List;

/* loaded from: classes.dex */
public final class t3 extends b5 {
    private static final t3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private i5 zzg = x5.f13969x;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        t3 t3Var = new t3();
        zzc = t3Var;
        b5.i(t3.class, t3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (u3.f13936a[i - 1]) {
            case 1:
                return new t3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a2.i, "zzg", t3.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (t3.class) {
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

    public final int q() {
        int d2 = wd0.d(this.zzf);
        if (d2 == 0) {
            return 1;
        }
        return d2;
    }

    public final String r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzi;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzj;
    }

    public final boolean v() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }
}
