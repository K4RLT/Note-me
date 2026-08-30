package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class op extends nn implements ho {
    private static final op zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private jp zzk;
    private np zzl;
    private int zzm;
    private int zzo;
    private String zzi = "";
    private String zzj = "";
    private un zzn = po.f14806y;

    static {
        op opVar = new op();
        zza = opVar;
        nn.m(op.class, opVar);
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
                                    synchronized (op.class) {
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
                return new op();
            }
            return new qo(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\b\u001b\tင\u0007", new Object[]{"zzf", "zzg", lp.f14607b, "zzh", lp.f14608c, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", sp.class, "zzo"});
        }
        return (byte) 1;
    }
}
