package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class eg extends nn implements ho {
    private static final eg zza;
    private static volatile mo zze;
    private int zzf;
    private int zzi;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        eg egVar = new eg();
        zza = egVar;
        nn.m(eg.class, egVar);
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
                                    synchronized (eg.class) {
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
                return new eg();
            }
            return new qo(zza, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005\u0007ဃ\u0006\bဇ\u0007\tဇ\b", new Object[]{"zzf", "zzg", "zzh", "zzi", hf.f14415p, "zzj", "zzk", "zzl", hf.f14414o, "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
