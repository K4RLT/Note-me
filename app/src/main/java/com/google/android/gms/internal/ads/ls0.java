package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ls0 extends dn1 {
    private static final ls0 zzc;
    private static volatile fo1 zzd;
    private kn1 zza = io1.f7187y;
    private long zzb;

    static {
        ls0 ls0Var = new ls0();
        zzc = ls0Var;
        dn1.t(ls0.class, ls0Var);
    }

    public static ks0 z() {
        return (ks0) zzc.q();
    }

    public final void A(pr0 pr0Var) {
        kn1 kn1Var = this.zza;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zza = kn1Var.B(size + size);
        }
        this.zza.add(pr0Var);
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
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
                                    synchronized (ls0.class) {
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
                return new ls0();
            }
            return new jo1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", pr0.class, "zzb"});
        }
        return (byte) 1;
    }
}
