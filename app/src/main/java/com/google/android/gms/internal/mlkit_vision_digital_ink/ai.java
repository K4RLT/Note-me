package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ai extends nn implements ho {
    private static final ai zza;
    private static volatile mo zze;
    private int zzf;
    private bi zzg;
    private long zzi;
    private long zzj;
    private tn zzh = pn.f14802y;
    private un zzk = po.f14806y;

    static {
        ai aiVar = new ai();
        zza = aiVar;
        nn.m(ai.class, aiVar);
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
                                    synchronized (ai.class) {
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
                return new ai();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ࠞ\u0003ဃ\u0001\u0004ဃ\u0002\u0005\u001b", new Object[]{"zzf", "zzg", "zzh", hf.f14403b, "zzi", "zzj", "zzk", kj.class});
        }
        return (byte) 1;
    }
}
