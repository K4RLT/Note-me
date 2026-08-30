package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ff extends nn implements ho {
    private static final ff zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private un zzp;
    private un zzq;
    private boolean zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private boolean zzv;
    private boolean zzw;

    static {
        ff ffVar = new ff();
        zza = ffVar;
        nn.m(ff.class, ffVar);
    }

    public ff() {
        po poVar = po.f14806y;
        this.zzp = poVar;
        this.zzq = poVar;
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
                                    synchronized (ff.class) {
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
                return new ff();
            }
            return new qo(zza, "\u0004\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဃ\u0005\u0007ဃ\u0006\bဋ\u0007\tဋ\b\n\u001b\u000b\u001b\fဇ\t\rဋ\n\u000eဋ\u000b\u000f᠌\f\u0010ဇ\r\u0011ဇ\u000e", new Object[]{"zzf", "zzg", b9.E, "zzh", b9.D, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", lj.class, "zzq", lj.class, "zzr", "zzs", "zzt", "zzu", b9.C, "zzv", "zzw"});
        }
        return (byte) 1;
    }
}
