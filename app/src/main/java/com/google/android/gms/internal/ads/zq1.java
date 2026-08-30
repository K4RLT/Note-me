package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zq1 extends dn1 {
    private static final zq1 zzn;
    private static volatile fo1 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private br1 zzk;
    private yq1 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zq1 zq1Var = new zq1();
        zzn = zq1Var;
        dn1.t(zq1.class, zq1Var);
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
                                fo1 fo1Var2 = zzo;
                                if (fo1Var2 == null) {
                                    synchronized (zq1.class) {
                                        try {
                                            fo1Var = zzo;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzn);
                                                zzo = fo1Var;
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
                        return zzn;
                    }
                    return new bn1(zzn);
                }
                return new zq1();
            }
            return new jo1(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", np1.f8816u, "zze", np1.f8815t, "zzf", "zzg", "zzh", "zzi", "zzj", np1.f8814s, "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
