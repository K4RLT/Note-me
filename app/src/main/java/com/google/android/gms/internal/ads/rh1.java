package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rh1 extends dn1 {
    private static final rh1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private kn1 zzb = io1.f7187y;

    static {
        rh1 rh1Var = new rh1();
        zzc = rh1Var;
        dn1.t(rh1.class, rh1Var);
    }

    public static oh1 z() {
        return (oh1) zzc.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = i;
    }

    public final void B(qh1 qh1Var) {
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(qh1Var);
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
                                    synchronized (rh1.class) {
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
                return new rh1();
            }
            return new jo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", qh1.class});
        }
        return (byte) 1;
    }
}
