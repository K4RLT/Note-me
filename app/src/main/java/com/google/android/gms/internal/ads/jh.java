package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jh extends dn1 {
    private static final jh zzd;
    private static volatile fo1 zze;
    private int zza;
    private kh zzb;
    private om1 zzc = om1.f9167v;

    static {
        jh jhVar = new jh();
        zzd = jhVar;
        dn1.t(jh.class, jhVar);
    }

    public static jh D() {
        return zzd;
    }

    public final kh A() {
        kh khVar = this.zzb;
        if (khVar == null) {
            return kh.C();
        }
        return khVar;
    }

    public final boolean B() {
        return (this.zza & 2) != 0;
    }

    public final om1 C() {
        return this.zzc;
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
                                    synchronized (jh.class) {
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
                return new jh();
            }
            return new jo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
