package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class zf extends nn implements ho {
    private static final zf zza;
    private static volatile mo zze;
    private int zzf;
    private bg zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private int zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.zf, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        ?? nnVar = new nn();
        zza = nnVar;
        nn.m(zf.class, nnVar);
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
                                    synchronized (zf.class) {
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
                return new nn();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဃ\u0003\u0005᠌\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", hf.f14403b});
        }
        return (byte) 1;
    }
}
