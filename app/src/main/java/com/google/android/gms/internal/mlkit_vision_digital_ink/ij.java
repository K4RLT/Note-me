package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ij extends nn implements ho {
    private static final ij zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        ij ijVar = new ij();
        zza = ijVar;
        nn.m(ij.class, ijVar);
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
                                    synchronized (ij.class) {
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
                return new ij();
            }
            return new qo(zza, "\u0004\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003᠌\u0000\u0004ဇ\u0001\u0005ဈ\u0002", new Object[]{"zzf", "zzg", ri.f14905h, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
