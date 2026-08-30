package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class nk extends dn1 {
    public static final int zza = 1;
    private static final nk zzc;
    private static volatile fo1 zzd;
    private kn1 zzb = io1.f7187y;

    static {
        nk nkVar = new nk();
        zzc = nkVar;
        dn1.t(nk.class, nkVar);
    }

    public static ik z() {
        return (ik) zzc.q();
    }

    public final void A(hk hkVar) {
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(hkVar);
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
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (nk.class) {
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
                return new nk();
            }
            return new jo1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", hk.class});
        }
        return (byte) 1;
    }
}
