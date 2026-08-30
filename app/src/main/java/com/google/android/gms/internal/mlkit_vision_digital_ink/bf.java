package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class bf extends nn implements ho {
    private static final bf zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi;
    private long zzj;
    private int zzk;

    static {
        bf bfVar = new bf();
        zza = bfVar;
        nn.m(bf.class, bfVar);
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
                                    synchronized (bf.class) {
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
                return new bf();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", "zzh", b9.f14091y, "zzi", b9.f14090x, "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
