package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class gc extends nn implements ho {
    private static final gc zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private of zzj;
    private gl zzk;
    private tn zzl;
    private tn zzm;

    static {
        gc gcVar = new gc();
        zza = gcVar;
        nn.m(gc.class, gcVar);
    }

    public gc() {
        pn pnVar = pn.f14802y;
        this.zzl = pnVar;
        this.zzm = pnVar;
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
                                    synchronized (gc.class) {
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
                return new gc();
            }
            return new qo(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ࠞ\u0007ࠞ", new Object[]{"zzf", "zzg", hf.f14403b, "zzh", "zzi", "zzj", "zzk", "zzl", hf.f14418s, "zzm", hf.f14419t});
        }
        return (byte) 1;
    }
}
