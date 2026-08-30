package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class lp1 extends dn1 {
    private static final lp1 zzb;
    private static volatile fo1 zzc;
    private kn1 zza = io1.f7187y;

    static {
        lp1 lp1Var = new lp1();
        zzb = lp1Var;
        dn1.t(lp1.class, lp1Var);
    }

    public static kp1 z() {
        return (kp1) zzb.q();
    }

    public final void A(jp1 jp1Var) {
        kn1 kn1Var = this.zza;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zza = kn1Var.B(size + size);
        }
        this.zza.add(jp1Var);
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (lp1.class) {
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
                return new lp1();
            }
            return new jo1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", jp1.class});
        }
        return (byte) 1;
    }
}
