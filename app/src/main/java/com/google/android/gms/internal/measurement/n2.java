package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class n2 extends b5 {
    private static final n2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        n2 n2Var = new n2();
        zzc = n2Var;
        b5.i(n2.class, n2Var);
    }

    public static n2 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new n2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (n2.class) {
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
        return this.zzg;
    }

    public final String s() {
        return this.zzf;
    }
}
