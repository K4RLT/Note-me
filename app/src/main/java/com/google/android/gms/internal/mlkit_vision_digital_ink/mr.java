package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class mr extends nn implements ho {
    private static final mr zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";

    static {
        mr mrVar = new mr();
        zza = mrVar;
        nn.m(mr.class, mrVar);
    }

    public static mr t() {
        return zza;
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
                                    synchronized (mr.class) {
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
                return new mr();
            }
            return new qo(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String u() {
        return this.zzg;
    }
}
