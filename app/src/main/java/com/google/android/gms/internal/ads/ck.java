package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ck extends dn1 {
    private static final ck zzL;
    private static volatile fo1 zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private qk zzA;
    private fk zzB;
    private int zzC;
    private int zzD;
    private zj zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private pk zzv;
    private rk zzw;
    private sk zzx;
    private tk zzy;
    private dk zzz;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ck, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zzL = dn1Var;
        dn1.t(ck.class, dn1Var);
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
                                fo1 fo1Var2 = zzM;
                                if (fo1Var2 == null) {
                                    synchronized (ck.class) {
                                        try {
                                            fo1Var = zzM;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzL);
                                                zzM = fo1Var;
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
                        return zzL;
                    }
                    return new bn1(zzL);
                }
                return new dn1();
            }
            return new jo1(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        return (byte) 1;
    }
}
