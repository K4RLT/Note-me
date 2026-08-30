package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class oe extends nn implements ho {
    private static final oe zza;
    private static volatile mo zze;
    private int zzf;
    private tf zzg;
    private hg zzh;
    private un zzi;
    private un zzj;
    private long zzk;

    static {
        oe oeVar = new oe();
        zza = oeVar;
        nn.m(oe.class, oeVar);
    }

    public oe() {
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
                                    synchronized (oe.class) {
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
                return new oe();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005ဃ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", ne.class, "zzj", ne.class, "zzk"});
        }
        return (byte) 1;
    }
}
