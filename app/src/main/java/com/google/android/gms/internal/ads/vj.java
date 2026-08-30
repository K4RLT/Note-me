package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class vj extends dn1 {
    private static final vj zzB;
    private static volatile fo1 zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private wj zzA;
    private int zzl;
    private int zzm = AdError.NETWORK_ERROR_CODE;
    private int zzn = AdError.NETWORK_ERROR_CODE;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        vj vjVar = new vj();
        zzB = vjVar;
        dn1.t(vj.class, vjVar);
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
                                fo1 fo1Var2 = zzC;
                                if (fo1Var2 == null) {
                                    synchronized (vj.class) {
                                        try {
                                            fo1Var = zzC;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzB);
                                                zzC = fo1Var;
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
                        return zzB;
                    }
                    return new bn1(zzB);
                }
                return new vj();
            }
            nd ndVar = nd.f8669x;
            return new jo1(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", ndVar, "zzn", ndVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        return (byte) 1;
    }
}
