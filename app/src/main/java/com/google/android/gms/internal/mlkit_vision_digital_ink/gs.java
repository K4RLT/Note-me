package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class gs extends nn implements ho {
    private static final gs zza;
    private static volatile mo zze;
    private int zzf;
    private boolean zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.gs, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        com.google.android.gms.internal.mlkit_vision_digital_ink.nn nnVar = new nn();
        zza = nnVar;
        nn.m(gs.class, nnVar);
    }

    public static gs t() {
        return zza;
    }

    public static mo u() {
        return (mo) zza.q(7, null);
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
                                    synchronized (gs.class) {
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
                return new nn();
            }
            return new qo(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean v() {
        return this.zzg;
    }
}
