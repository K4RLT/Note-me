package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class wg extends nn implements ho {
    private static final wg zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private vg zzh;
    private sg zzi;
    private rg zzj;
    private tg zzk;
    private ug zzl;
    private ng zzm;
    private long zzn;
    private og zzo;
    private tn zzp = pn.f14802y;
    private String zzq = "";

    static {
        wg wgVar = new wg();
        zza = wgVar;
        nn.m(wg.class, wgVar);
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
                                    synchronized (wg.class) {
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
                return new wg();
            }
            return new qo(zza, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဃ\u0007\tဉ\b\n\u0016\u000bဈ\t", new Object[]{"zzf", "zzg", hf.f14423x, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }
}
