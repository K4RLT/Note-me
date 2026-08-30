package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class bc extends nn implements ho {
    private static final bc zza;
    private static volatile mo zze;
    private int zzf;
    private long zzg;
    private tn zzh;
    private tn zzi;
    private tn zzj;
    private String zzk;
    private int zzl;
    private int zzm;

    static {
        bc bcVar = new bc();
        zza = bcVar;
        nn.m(bc.class, bcVar);
    }

    public bc() {
        pn pnVar = pn.f14802y;
        this.zzh = pnVar;
        this.zzi = pnVar;
        this.zzj = pnVar;
        this.zzk = "";
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
                                    synchronized (bc.class) {
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
                return new bc();
            }
            b9 b9Var = b9.f14075h;
            return new qo(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဃ\u0000\u0002ࠞ\u0003ࠞ\u0004ࠞ\u0005ဈ\u0001\u0006᠌\u0002\u0007င\u0003", new Object[]{"zzf", "zzg", "zzh", b9Var, "zzi", b9Var, "zzj", b9Var, "zzk", "zzl", b9.f14074g, "zzm"});
        }
        return (byte) 1;
    }
}
