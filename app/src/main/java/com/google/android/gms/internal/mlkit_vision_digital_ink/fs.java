package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class fs extends nn implements ho {
    private static final fs zza;
    private static volatile mo zze;
    private int zzf;
    private boolean zzj;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzk = "";

    static {
        fs fsVar = new fs();
        zza = fsVar;
        nn.m(fs.class, fsVar);
    }

    public static /* synthetic */ void A(fs fsVar, String str) {
        str.getClass();
        fsVar.zzf |= 2;
        fsVar.zzh = str;
    }

    public static es t() {
        return (es) zza.f();
    }

    public static fs u() {
        return zza;
    }

    public static /* synthetic */ void y(fs fsVar, boolean z3) {
        fsVar.zzf |= 8;
        fsVar.zzj = z3;
    }

    public static /* synthetic */ void z(fs fsVar, String str) {
        str.getClass();
        fsVar.zzf |= 1;
        fsVar.zzg = str;
    }

    public final boolean B() {
        return (this.zzf & 4) != 0;
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
                                    synchronized (fs.class) {
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
                return new fs();
            }
            return new qo(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002\u0006ဈ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzj", "zzi", "zzk"});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zzi;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }
}
