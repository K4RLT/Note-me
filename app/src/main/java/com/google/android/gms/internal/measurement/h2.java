package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class h2 extends b5 {
    private static final h2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        h2 h2Var = new h2();
        zzc = h2Var;
        b5.i(h2.class, h2Var);
    }

    public static void q(h2 h2Var, String str) {
        h2Var.getClass();
        str.getClass();
        h2Var.zze |= 1;
        h2Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new h2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (h2.class) {
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
        return this.zzi;
    }

    public final String r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }
}
