package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ye extends nn implements ho {
    private static final ye zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private String zzi = "";
    private String zzj = "";
    private long zzk;

    static {
        ye yeVar = new ye();
        zza = yeVar;
        nn.m(ye.class, yeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nn
    public final Object q(int i, nn nnVar) {
        mo moVar;
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                mo moVar2 = zze;
                                if (moVar2 == null) {
                                    synchronized (ye.class) {
                                        try {
                                            moVar = zze;
                                            if (moVar == null) {
                                                moVar = new in(zza);
                                                zze = moVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return moVar;
                                }
                                return moVar2;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new hn(zza);
                }
                return new ye();
            }
            b9 b9Var = b9.f14087u;
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzf", "zzg", b9Var, "zzh", b9Var, "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
