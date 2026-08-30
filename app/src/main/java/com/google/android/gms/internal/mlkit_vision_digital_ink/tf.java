package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class tf extends nn implements ho {
    private static final tf zza;
    private static volatile mo zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private un zzn = po.f14806y;
    private boolean zzo;
    private boolean zzp;

    static {
        tf tfVar = new tf();
        zza = tfVar;
        nn.m(tf.class, tfVar);
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
                                    synchronized (tf.class) {
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
                return new tf();
            }
            return new qo(zza, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\b\u001b\tဇ\u0007\nဇ\b", new Object[]{"zzf", "zzg", "zzh", hf.f14403b, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", kj.class, "zzo", "zzp"});
        }
        return (byte) 1;
    }
}
