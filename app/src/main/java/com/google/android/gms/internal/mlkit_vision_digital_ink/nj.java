package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class nj extends nn implements ho {
    private static final nj zza;
    private static volatile mo zze;
    private int zzf;
    private long zzg;
    private tn zzh;
    private tn zzi;
    private tn zzj;
    private int zzk;

    static {
        nj njVar = new nj();
        zza = njVar;
        nn.m(nj.class, njVar);
    }

    public nj() {
        pn pnVar = pn.f14802y;
        this.zzh = pnVar;
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
                                    synchronized (nj.class) {
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
                return new nj();
            }
            ri riVar = ri.f14908l;
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဃ\u0000\u0002ࠞ\u0003ࠞ\u0004ࠞ\u0005င\u0001", new Object[]{"zzf", "zzg", "zzh", riVar, "zzi", riVar, "zzj", riVar, "zzk"});
        }
        return (byte) 1;
    }
}
