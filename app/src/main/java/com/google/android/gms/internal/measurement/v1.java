package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class v1 extends b5 {
    private static final v1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        v1 v1Var = new v1();
        zzc = v1Var;
        b5.i(v1.class, v1Var);
    }

    public static v1 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new v1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", a2.f13629b, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (v1.class) {
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
        int b10 = wd0.b(this.zzf);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }

    public final String r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzj;
    }

    public final String t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }
}
