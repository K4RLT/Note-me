package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class yr extends nn implements ho {
    private static final yr zza;
    private static volatile mo zze;
    private int zzf;
    private fs zzg;
    private long zzh;
    private String zzi = "";
    private int zzj;
    private long zzk;
    private long zzl;

    static {
        yr yrVar = new yr();
        zza = yrVar;
        nn.m(yr.class, yrVar);
    }

    public static /* synthetic */ void A(yr yrVar, long j10) {
        yrVar.zzf |= 16;
        yrVar.zzk = j10;
    }

    public static /* synthetic */ void B(yr yrVar, int i) {
        yrVar.zzf |= 8;
        yrVar.zzj = i;
    }

    public static /* synthetic */ void C(yr yrVar, fs fsVar) {
        yrVar.zzg = fsVar;
        yrVar.zzf |= 1;
    }

    public static /* synthetic */ void D(yr yrVar, String str) {
        str.getClass();
        yrVar.zzf |= 4;
        yrVar.zzi = str;
    }

    public static /* synthetic */ void E(yr yrVar, long j10) {
        yrVar.zzf |= 32;
        yrVar.zzl = j10;
    }

    public static xr x() {
        return (xr) zza.f();
    }

    public static /* synthetic */ void z(yr yrVar, long j10) {
        yrVar.zzf |= 2;
        yrVar.zzh = j10;
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
                                    synchronized (yr.class) {
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
                return new yr();
            }
            return new qo(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzj", "zzk", "zzl", "zzi"});
        }
        return (byte) 1;
    }

    public final int t() {
        return this.zzj;
    }

    public final long u() {
        return this.zzh;
    }

    public final long v() {
        return this.zzk;
    }

    public final long w() {
        return this.zzl;
    }

    public final fs y() {
        fs fsVar = this.zzg;
        if (fsVar == null) {
            return fs.u();
        }
        return fsVar;
    }
}
