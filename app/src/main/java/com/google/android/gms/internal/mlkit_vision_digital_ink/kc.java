package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class kc extends nn implements ho {
    private static final kc zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private of zzh;
    private boolean zzi;
    private te zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private float zzn;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.nn, com.google.android.gms.internal.mlkit_vision_digital_ink.kc] */
    static {
        ?? nnVar = new nn();
        zza = nnVar;
        nn.m(kc.class, nnVar);
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
                                    synchronized (kc.class) {
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
            return new qo(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007င\u0006\bခ\u0007", new Object[]{"zzf", "zzg", hf.f14403b, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
