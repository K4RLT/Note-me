package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ti extends nn implements ho {
    private static final ti zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private tn zzj = pn.f14802y;
    private int zzk;

    static {
        ti tiVar = new ti();
        zza = tiVar;
        nn.m(ti.class, tiVar);
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
                                    synchronized (ti.class) {
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
                return new ti();
            }
            hf hfVar = hf.E;
            ri riVar = ri.f14901c;
            return new qo(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003", new Object[]{"zzf", "zzg", hfVar, "zzh", riVar, "zzi", riVar, "zzj", ri.f14900b, "zzk", ri.f14902d});
        }
        return (byte) 1;
    }
}
