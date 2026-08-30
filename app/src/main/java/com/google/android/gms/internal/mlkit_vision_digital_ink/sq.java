package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class sq extends nn implements ho {
    private static final sq zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";

    static {
        sq sqVar = new sq();
        zza = sqVar;
        nn.m(sq.class, sqVar);
    }

    public static rq t() {
        return (rq) zza.f();
    }

    public static sq u() {
        return zza;
    }

    public static /* synthetic */ void w(sq sqVar) {
        sqVar.zzf |= 1;
        sqVar.zzg = "*";
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
                                    synchronized (sq.class) {
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
                return new sq();
            }
            return new qo(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzf & 1) != 0;
    }
}
