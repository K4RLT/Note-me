package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ls extends nn implements ho {
    private static final ls zza;
    private static volatile mo zze;
    private int zzf;
    private long zzh;
    private int zzj;
    private qq zzk;
    private String zzg = "";
    private String zzi = "";

    static {
        ls lsVar = new ls();
        zza = lsVar;
        nn.m(ls.class, lsVar);
    }

    public static /* synthetic */ void A(ls lsVar, qq qqVar) {
        qqVar.getClass();
        lsVar.zzk = qqVar;
        lsVar.zzf |= 16;
    }

    public static /* synthetic */ void B(ls lsVar, String str) {
        str.getClass();
        lsVar.zzf |= 1;
        lsVar.zzg = str;
    }

    public static /* synthetic */ void E(ls lsVar, int i) {
        lsVar.zzj = i - 1;
        lsVar.zzf |= 8;
    }

    public static ks u() {
        return (ks) zza.f();
    }

    public static /* synthetic */ void y(ls lsVar, long j10) {
        lsVar.zzf |= 2;
        lsVar.zzh = j10;
    }

    public static /* synthetic */ void z(ls lsVar, String str) {
        str.getClass();
        lsVar.zzf |= 4;
        lsVar.zzi = str;
    }

    public final boolean C() {
        return (this.zzf & 16) != 0;
    }

    public final int D() {
        int i = tl.i(this.zzj);
        if (i == 0) {
            return 1;
        }
        return i;
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
                                    synchronized (ls.class) {
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
                return new ls();
            }
            return new qo(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", lp.f14621r, "zzk"});
        }
        return (byte) 1;
    }

    public final long t() {
        return this.zzh;
    }

    public final qq v() {
        qq qqVar = this.zzk;
        if (qqVar == null) {
            return qq.x();
        }
        return qqVar;
    }

    public final String w() {
        return this.zzi;
    }

    public final String x() {
        return this.zzg;
    }
}
