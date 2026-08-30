package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class nb extends nn implements ho {
    private static final nb zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;

    static {
        nb nbVar = new nb();
        zza = nbVar;
        nn.m(nb.class, nbVar);
    }

    public static mb t() {
        return (mb) zza.f();
    }

    public static /* synthetic */ void u(nb nbVar, String str) {
        str.getClass();
        nbVar.zzf |= 2;
        nbVar.zzh = str;
    }

    public static /* synthetic */ void v(nb nbVar, int i) {
        nbVar.zzf |= 4;
        nbVar.zzi = i;
    }

    public static /* synthetic */ void w(nb nbVar, int i) {
        nbVar.zzf |= 1;
        nbVar.zzg = i;
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
                                    synchronized (nb.class) {
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
                return new nb();
            }
            return new qo(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
