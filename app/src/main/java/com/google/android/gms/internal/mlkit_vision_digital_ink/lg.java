package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class lg extends nn implements ho {
    private static final lg zza;
    private static volatile mo zze;
    private int zzf;
    private tf zzg;
    private gl zzh;
    private tn zzi;
    private tn zzj;
    private of zzk;

    static {
        lg lgVar = new lg();
        zza = lgVar;
        nn.m(lg.class, lgVar);
    }

    public lg() {
        pn pnVar = pn.f14802y;
        this.zzi = pnVar;
        this.zzj = pnVar;
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
                                    synchronized (lg.class) {
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
                return new lg();
            }
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠞ\u0004ࠞ\u0005ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", hf.f14418s, "zzj", hf.f14419t, "zzk"});
        }
        return (byte) 1;
    }
}
