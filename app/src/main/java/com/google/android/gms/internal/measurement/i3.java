package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class i3 extends b5 {
    private static final i3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf = 1;
    private i5 zzg = x5.f13969x;

    static {
        i3 i3Var = new i3();
        zzc = i3Var;
        b5.i(i3.class, i3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new i3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a2.f13634h, "zzg", a3.class});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (i3.class) {
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
}
