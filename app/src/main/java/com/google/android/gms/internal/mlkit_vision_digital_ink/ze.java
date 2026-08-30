package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ze extends nn implements ho {
    private static final ze zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private long zzi;
    private ef zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private int zzq;
    private String zzh = "";
    private String zzp = "";

    static {
        ze zeVar = new ze();
        zza = zeVar;
        nn.m(ze.class, zeVar);
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
                                    synchronized (ze.class) {
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
                return new ze();
            }
            return new qo(zza, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bဇ\u0007\t᠌\b\nဈ\t\u000bဋ\n", new Object[]{"zzf", "zzg", b9.f14087u, "zzh", "zzi", "zzj", "zzk", b9.f14086t, "zzl", "zzm", "zzn", "zzo", hf.f14403b, "zzp", "zzq"});
        }
        return (byte) 1;
    }
}
