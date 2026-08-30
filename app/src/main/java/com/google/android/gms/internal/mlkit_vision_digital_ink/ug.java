package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ug extends nn implements ho {
    private static final ug zza;
    private static volatile mo zze;
    private un zzf;
    private un zzg;
    private un zzh;

    static {
        ug ugVar = new ug();
        zza = ugVar;
        nn.m(ug.class, ugVar);
    }

    public ug() {
        po poVar = po.f14806y;
        this.zzf = poVar;
        this.zzg = poVar;
        this.zzh = poVar;
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
                                    synchronized (ug.class) {
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
                return new ug();
            }
            return new qo(zza, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"zzf", qg.class, "zzg", qg.class, "zzh", qg.class});
        }
        return (byte) 1;
    }
}
