package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j91 extends dn1 {
    private static final j91 zzd;
    private static volatile fo1 zze;
    private int zza;
    private long zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.j91, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(j91.class, dn1Var);
    }

    public static i91 z() {
        return (i91) zzd.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (j91.class) {
                                        try {
                                            fo1Var = zze;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzd);
                                                zze = fo1Var;
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
                        return zzd;
                    }
                    return new bn1(zzd);
                }
                return new dn1();
            }
            return new jo1(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", nd.C});
        }
        return (byte) 1;
    }
}
