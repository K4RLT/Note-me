package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final bk zzh;
    private static volatile fo1 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.bk] */
    static {
        com.google.android.gms.internal.ads.bk dn1Var = new dn1();
        zzh = dn1Var;
        dn1.t(bk.class, dn1Var);
    }

    public static ak A() {
        return (ak) zzh.q();
    }

    public final void B(int i) {
        this.zzd |= 1;
        this.zze = i;
    }

    public final void C(int i) {
        this.zzd |= 2;
        this.zzf = i;
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
                                fo1 fo1Var2 = zzi;
                                if (fo1Var2 == null) {
                                    synchronized (bk.class) {
                                        try {
                                            fo1Var = zzi;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzh);
                                                zzi = fo1Var;
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
                        return zzh;
                    }
                    return new bn1(zzh);
                }
                return new dn1();
            }
            return new jo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final void z(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }
}
