package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ec extends nn implements ho {
    private static final ec zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private un zzi;
    private un zzj;
    private hg zzk;

    static {
        ec ecVar = new ec();
        zza = ecVar;
        nn.m(ec.class, ecVar);
    }

    public ec() {
        po poVar = po.f14806y;
        this.zzi = poVar;
        this.zzj = poVar;
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
                                    synchronized (ec.class) {
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
                return new ec();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဉ\u0002", new Object[]{"zzf", "zzg", hf.f14403b, "zzh", "zzi", ne.class, "zzj", ne.class, "zzk"});
        }
        return (byte) 1;
    }
}
