package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ef extends nn implements ho {
    private static final ef zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private tn zzo = pn.f14802y;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;

    static {
        ef efVar = new ef();
        zza = efVar;
        nn.m(ef.class, efVar);
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
                                    synchronized (ef.class) {
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
                return new ef();
            }
            return new qo(zza, "\u0004\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001ဋ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bဋ\u0007\tࠬ\nဇ\b\u000bဇ\t\fဇ\n\rဇ\u000b\u000eင\f\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f", new Object[]{"zzf", "zzg", "zzh", b9.A, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", b9.B, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        return (byte) 1;
    }
}
