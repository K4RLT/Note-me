package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ax extends kn {
    private static final ax zze;
    private static volatile mo zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private om zzl;
    private boolean zzm;
    private byte zzo = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzn = "";

    static {
        ax axVar = new ax();
        zze = axVar;
        nn.m(ax.class, axVar);
    }

    public static /* synthetic */ void A(ax axVar, String str) {
        str.getClass();
        axVar.zzg |= 1;
        axVar.zzh = str;
    }

    public static /* synthetic */ void B(ax axVar, String str) {
        str.getClass();
        axVar.zzg |= 2;
        axVar.zzi = str;
    }

    public static /* synthetic */ void C(ax axVar, long j10) {
        axVar.zzg |= 4;
        axVar.zzj = j10;
    }

    public static /* synthetic */ void D(ax axVar, boolean z3) {
        axVar.zzg |= 32;
        axVar.zzm = z3;
    }

    public static tw u() {
        return (tw) zze.f();
    }

    public static ax v() {
        return zze;
    }

    public static /* synthetic */ void x(ax axVar, String str) {
        str.getClass();
        axVar.zzg |= 64;
        axVar.zzn = str;
    }

    public static /* synthetic */ void y(ax axVar, om omVar) {
        axVar.zzl = omVar;
        axVar.zzg |= 16;
    }

    public static /* synthetic */ void z(ax axVar, long j10) {
        axVar.zzg |= 8;
        axVar.zzk = j10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nn
    public final Object q(int i, nn nnVar) {
        mo moVar;
        byte b10;
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (nnVar == null) {
                                    b10 = 0;
                                } else {
                                    b10 = 1;
                                }
                                this.zzo = b10;
                                return null;
                            }
                            mo moVar2 = zzf;
                            if (moVar2 == null) {
                                synchronized (ax.class) {
                                    try {
                                        moVar = zzf;
                                        if (moVar == null) {
                                            moVar = new in(zze);
                                            zzf = moVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return moVar;
                            }
                            return moVar2;
                        }
                        return zze;
                    }
                    return new hn(zze);
                }
                return new ax();
            }
            return new qo(zze, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return Byte.valueOf(this.zzo);
    }

    public final String w() {
        return this.zzi;
    }
}
