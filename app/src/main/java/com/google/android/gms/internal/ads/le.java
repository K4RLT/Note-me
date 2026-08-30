package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class le extends dn1 {
    private static final le zzc;
    private static volatile fo1 zzd;
    private jn1 zza;
    private jn1 zzb;

    static {
        le leVar = new le();
        zzc = leVar;
        dn1.t(le.class, leVar);
    }

    public le() {
        vn1 vn1Var = vn1.f11956y;
        this.zza = vn1Var;
        this.zzb = vn1Var;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = q0.d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (le.class) {
                                        try {
                                            fo1Var = zzd;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzc);
                                                zzd = fo1Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return fo1Var;
                                }
                                return fo1Var2;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new bn1(zzc);
                }
                return new le();
            }
            return new jo1(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
