package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ud extends nn implements ho {
    private static final ud zza;
    private static volatile mo zze;
    private int zzf;
    private long zzg;
    private gl zzh;
    private int zzi;
    private int zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.ud, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        nn nnVar = new nn();
        zza = nnVar;
        nn.m(ud.class, nnVar);
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
                                    synchronized (ud.class) {
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
            return new qo(zza, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", ri.f14906j, "zzj", hf.f14403b});
        }
        return (byte) 1;
    }
}