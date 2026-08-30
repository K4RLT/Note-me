package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ik extends nn implements ho {
    private static final ik zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.ik, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        com.google.android.gms.internal.mlkit_vision_digital_ink.nn nnVar = new nn();
        zza = nnVar;
        nn.m(ik.class, nnVar);
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
                                    synchronized (ik.class) {
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
            return new qo(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzf", "zzg", ri.f14914r, "zzh", ri.f14915s, "zzi", ri.f14910n});
        }
        return (byte) 1;
    }
}
