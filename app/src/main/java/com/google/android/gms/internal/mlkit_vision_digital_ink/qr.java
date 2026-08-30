package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class qr extends nn implements ho {
    private static final qr zza;
    private static volatile mo zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.qr, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        ?? nnVar = new nn();
        zza = nnVar;
        nn.m(qr.class, nnVar);
    }

    public static /* synthetic */ void A(qr qrVar, long j10) {
        qrVar.zzf |= 4;
        qrVar.zzi = j10;
    }

    public static /* synthetic */ void B(qr qrVar, long j10) {
        qrVar.zzf |= 2;
        qrVar.zzh = j10;
    }

    public static /* synthetic */ void C(qr qrVar, boolean z3) {
        qrVar.zzf |= 64;
        qrVar.zzm = z3;
    }

    public static /* synthetic */ void D(qr qrVar, long j10) {
        qrVar.zzf |= 1;
        qrVar.zzg = j10;
    }

    public static qr x() {
        return zza;
    }

    public static /* synthetic */ void y(qr qrVar, int i) {
        qrVar.zzf |= 16;
        qrVar.zzk = i;
    }

    public static /* synthetic */ void z(qr qrVar, long j10) {
        qrVar.zzf |= 8;
        qrVar.zzj = j10;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zzf & 8) != 0;
    }

    public final boolean G() {
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
                                    synchronized (qr.class) {
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
            return new qo(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    public final int t() {
        return this.zzk;
    }

    public final long u() {
        return this.zzj;
    }

    public final long v() {
        return this.zzi;
    }

    public final long w() {
        return this.zzh;
    }
}
