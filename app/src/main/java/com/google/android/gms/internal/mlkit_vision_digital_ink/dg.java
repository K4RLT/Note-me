package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class dg extends nn implements ho {
    private static final dg zza;
    private static volatile mo zze;
    private int zzf;
    private hg zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private int zzk;
    private long zzl;
    private tn zzm = pn.f14802y;

    static {
        dg dgVar = new dg();
        zza = dgVar;
        nn.m(dg.class, dgVar);
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
                                    synchronized (dg.class) {
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
                return new dg();
            }
            return new qo(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003᠌\u0002\u0004ဃ\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u0016", new Object[]{"zzf", "zzg", "zzh", "zzi", hf.f14403b, "zzj", "zzk", hf.f14413n, "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
