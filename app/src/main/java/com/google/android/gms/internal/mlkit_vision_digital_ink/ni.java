package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ni extends nn implements ho {
    private static final ni zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private float zzk;
    private hg zzl;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.ni, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        com.google.android.gms.internal.mlkit_vision_digital_ink.nn nnVar = new nn();
        zza = nnVar;
        nn.m(ni.class, nnVar);
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
                                    synchronized (ni.class) {
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
            return new qo(zza, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"zzf", "zzg", hf.D, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
