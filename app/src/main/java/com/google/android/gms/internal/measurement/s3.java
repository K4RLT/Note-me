package com.google.android.gms.internal.measurement;
import q.x;
import q3.q;

/* loaded from: classes.dex */
public final class s3 extends b5 {
    private static final s3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private i5 zzf = x5.f13969x;
    private q3 zzg;

    static {
        s3 s3Var = new s3();
        zzc = s3Var;
        b5.i(s3.class, s3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (u3.f13936a[i - 1]) {
            case 1:
                return new s3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", t3.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (s3.class) {
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

    public final q3 p() {
        q3 q3Var = this.zzg;
        if (q3Var == null) {
            return q();
        }
        return q3Var;
    }

    public final i5 q() {
        return this.zzf;
    }
}
