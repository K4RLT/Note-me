package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class mj extends dn1 {
    private static final mj zzB;
    private static volatile fo1 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private kn1 zzA;
    private int zzl;
    private int zzm;
    private int zzn = AdError.NETWORK_ERROR_CODE;
    private yk zzo;
    private al zzp;
    private kn1 zzu;
    private bl zzv;
    private vj zzw;
    private pj zzx;
    private il zzy;
    private jl zzz;

    static {
        mj mjVar = new mj();
        zzB = mjVar;
        dn1.t(mj.class, mjVar);
    }

    public mj() {
        io1 io1Var = io1.f7187y;
        this.zzu = io1Var;
        this.zzA = io1Var;
    }

    public static mj z() {
        return zzB;
    }

    public final void A(kj kjVar) {
        this.zzm = kjVar.f7768u;
        this.zzl |= 1;
    }

    public final void B(al alVar) {
        this.zzp = alVar;
        this.zzl |= 8;
    }

    public final al C() {
        al alVar = this.zzp;
        if (alVar == null) {
            return al.z();
        }
        return alVar;
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
                                    synchronized (mj.class) {
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
                return new mj();
            }
            return new jo1(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", nd.f8661p, "zzn", nd.f8669x, "zzo", "zzp", "zzu", xk.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", ck.class});
        }
        return (byte) 1;
    }
}
