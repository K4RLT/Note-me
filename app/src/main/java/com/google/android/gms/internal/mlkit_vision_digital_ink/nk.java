package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class nk extends nn implements ho {
    private static final nk zza;
    private static volatile mo zze;
    private int zzf;
    private long zzh;
    private int zzj;
    private af zzk;
    private String zzg = "";
    private String zzi = "";

    static {
        nk nkVar = new nk();
        zza = nkVar;
        nn.m(nk.class, nkVar);
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
                                    synchronized (nk.class) {
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
                return new nk();
            }
            return new qo(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", ri.f14913q, "zzk"});
        }
        return (byte) 1;
    }
}
