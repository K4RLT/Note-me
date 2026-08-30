package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class pe extends nn implements ho {
    private static final pe zza;
    private static volatile mo zze;
    private int zzf;
    private hg zzg;
    private hg zzh;
    private tn zzi = pn.f14802y;
    private long zzj;
    private boolean zzk;

    static {
        pe peVar = new pe();
        zza = peVar;
        nn.m(pe.class, peVar);
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
                                    synchronized (pe.class) {
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
                return new pe();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠞ\u0004ဃ\u0002\u0005ဇ\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", hf.f14403b, "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
