package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class oj extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final oj zzf;
    private static volatile fo1 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.oj] */
    static {
        dn1 dn1Var = new dn1();
        zzf = dn1Var;
        dn1.t(oj.class, dn1Var);
    }

    public static nj z() {
        return (nj) zzf.q();
    }

    public final void A(int i) {
        this.zzd = d.b(i);
        this.zzc |= 1;
    }

    public final void B(int i) {
        int i10 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i10 = 4;
                    if (i != 4) {
                        throw null;
                    }
                } else {
                    i10 = 2;
                }
            }
        } else {
            i10 = 0;
        }
        this.zze = i10;
        this.zzc |= 2;
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
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (oj.class) {
                                        try {
                                            fo1Var = zzg;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzf);
                                                zzg = fo1Var;
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
                        return zzf;
                    }
                    return new bn1(zzf);
                }
                return new dn1();
            }
            return new jo1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", nd.f8663r, "zze", nd.f8662q});
        }
        return (byte) 1;
    }
}