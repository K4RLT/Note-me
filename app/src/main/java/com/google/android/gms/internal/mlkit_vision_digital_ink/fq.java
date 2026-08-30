package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class fq extends kn {
    private static final fq zze;
    private static volatile mo zzf;
    private int zzg;
    private kp zzh;
    private vp zzi;
    private pp zzj;
    private eq zzk;
    private dq zzl;
    private int zzm;
    private int zzn;
    private int zzp;
    private bq zzq;
    private long zzr;
    private int zzs;
    private byte zzt = 2;
    private un zzo = po.f14806y;

    static {
        fq fqVar = new fq();
        zze = fqVar;
        nn.m(fq.class, fqVar);
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
                                this.zzt = b10;
                                return null;
                            }
                            mo moVar2 = zzf;
                            if (moVar2 == null) {
                                synchronized (fq.class) {
                                    try {
                                        moVar = zzf;
                                        if (moVar == null) {
                                            moVar = new in(zze);
                                            zzf = moVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return moVar;
                            }
                            return moVar2;
                        }
                        return zze;
                    }
                    return new hn(zze);
                }
                return new fq();
            }
            return new qo(zze, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007᠌\u0006\b\u001b\t᠌\u0007\nᐉ\b\u000bဂ\t\fင\n", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", lp.i, "zzn", lp.f14614k, "zzo", cq.class, "zzp", lp.f14613j, "zzq", "zzr", "zzs"});
        }
        return Byte.valueOf(this.zzt);
    }
}
