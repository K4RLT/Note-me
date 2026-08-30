package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class rp extends nn implements ho {
    private static final rp zza;
    private static volatile mo zze;
    private int zzf;
    private kp zzg;
    private vp zzh;
    private pp zzi;
    private int zzj;
    private op zzk;
    private bq zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private int zzp;
    private byte zzq = 2;

    static {
        rp rpVar = new rp();
        zza = rpVar;
        nn.m(rp.class, rpVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nn
    public final Object q(int i, nn nnVar) {
        mo moVar;
        byte b10;
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (nnVar == null) {
                                    b10 = 0;
                                } else {
                                    b10 = 1;
                                }
                                this.zzq = b10;
                                return null;
                            }
                            mo moVar2 = zze;
                            if (moVar2 == null) {
                                synchronized (rp.class) {
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
                        return zza;
                    }
                    return new hn(zza);
                }
                return new rp();
            }
            return new qo(zza, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0003\u0004ဉ\u0004\u0005ᐉ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tင\t\nဉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzj", lp.f14609d, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzi"});
        }
        return Byte.valueOf(this.zzq);
    }
}
