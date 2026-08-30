package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class df extends nn implements ho {
    private static final df zza;
    private static volatile mo zze;
    private int zzf;
    private ef zzg;
    private long zzi;
    private int zzk;
    private un zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private cf zzq;
    private un zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private String zzh = "";
    private String zzj = "";

    static {
        df dfVar = new df();
        zza = dfVar;
        nn.m(df.class, dfVar);
    }

    public df() {
        po poVar = po.f14806y;
        this.zzl = poVar;
        this.zzr = poVar;
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
                                    synchronized (df.class) {
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
                return new df();
            }
            return new qo(zza, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006\u001b\u0007ဇ\u0005\b᠌\u0006\tဋ\u0007\n᠌\b\u000bဉ\t\f\u001b\rင\n\u000eင\u000b\u000fင\f\u0010င\r", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", ff.class, "zzm", "zzn", b9.f14088v, "zzo", "zzp", b9.f14089w, "zzq", "zzr", bf.class, "zzs", "zzt", "zzu", "zzv"});
        }
        return (byte) 1;
    }
}
