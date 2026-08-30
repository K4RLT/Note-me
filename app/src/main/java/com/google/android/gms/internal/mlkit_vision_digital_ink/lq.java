package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class lq extends nn implements ho {
    private static final lq zza;
    private static volatile mo zze;
    private int zzf = 0;
    private Object zzg;

    static {
        lq lqVar = new lq();
        zza = lqVar;
        nn.m(lq.class, lqVar);
    }

    public static lq t() {
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
                                    synchronized (lq.class) {
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
                return new lq();
            }
            return new qo(zza, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000", new Object[]{"zzg", "zzf"});
        }
        return (byte) 1;
    }

    public final String u() {
        if (this.zzf == 2) {
            return (String) this.zzg;
        }
        return "";
    }

    public final String v() {
        if (this.zzf == 1) {
            return (String) this.zzg;
        }
        return "";
    }

    public final boolean w() {
        return this.zzf == 2;
    }

    public final boolean x() {
        return this.zzf == 1;
    }
}
