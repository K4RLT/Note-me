package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class iq extends nn implements ho {
    private static final iq zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        iq iqVar = new iq();
        zza = iqVar;
        nn.m(iq.class, iqVar);
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
                                    synchronized (iq.class) {
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
                return new iq();
            }
            return new qo(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zzg;
    }

    public final String u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzf & 1) != 0;
    }

    public final boolean w() {
        return (this.zzf & 2) != 0;
    }
}
