package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class we extends nn implements ho {
    private static final we zza;
    private static volatile mo zze;
    private int zzf;
    private int zzj;
    private long zzl;
    private int zzm;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private un zzk = po.f14806y;

    static {
        we weVar = new we();
        zza = weVar;
        nn.m(we.class, weVar);
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
                                    synchronized (we.class) {
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
                return new we();
            }
            return new qo(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005\u001b\u0006ဂ\u0004\u0007᠌\u0005", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", b9.f14083q, "zzk", ve.class, "zzl", "zzm", b9.f14085s});
        }
        return (byte) 1;
    }
}
