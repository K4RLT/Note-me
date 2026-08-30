package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class xq1 extends dn1 {
    private static final xq1 zzb;
    private static volatile fo1 zzc;
    private kn1 zza = io1.f7187y;

    static {
        xq1 xq1Var = new xq1();
        zzb = xq1Var;
        dn1.t(xq1.class, xq1Var);
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (xq1.class) {
                                        try {
                                            fo1Var = zzc;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzb);
                                                zzc = fo1Var;
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
                        return zzb;
                    }
                    return new bn1(zzb);
                }
                return new xq1();
            }
            return new jo1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", wq1.class});
        }
        return (byte) 1;
    }
}
