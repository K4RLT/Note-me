package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class dl extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final dl zzv;
    private static volatile fo1 zzw;
    private int zzi;
    private zj zzk;
    private int zzl;
    private bk zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = AdError.NETWORK_ERROR_CODE;
    private int zzp = AdError.NETWORK_ERROR_CODE;
    private int zzu = AdError.NETWORK_ERROR_CODE;

    static {
        dl dlVar = new dl();
        zzv = dlVar;
        dn1.t(dl.class, dlVar);
    }

    public static dl z() {
        return zzv;
    }

    public final void A(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void B(bk bkVar) {
        this.zzm = bkVar;
        this.zzi |= 8;
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
                                fo1 fo1Var2 = zzw;
                                if (fo1Var2 == null) {
                                    synchronized (dl.class) {
                                        try {
                                            fo1Var = zzw;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzv);
                                                zzw = fo1Var;
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
                        return zzv;
                    }
                    return new bn1(zzv);
                }
                return new dl();
            }
            nd ndVar = nd.f8669x;
            return new jo1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", ndVar, "zzp", ndVar, "zzu", ndVar});
        }
        return (byte) 1;
    }
}
