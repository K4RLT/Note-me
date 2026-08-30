package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ur extends nn implements ho {
    private static final ur zza;
    private static volatile mo zze;
    private int zzf;
    private long zzh;
    private int zzj;
    private mr zzk;
    private String zzg = "";
    private String zzi = "";

    static {
        ur urVar = new ur();
        zza = urVar;
        nn.m(ur.class, urVar);
    }

    public final int A() {
        int i = this.zzj;
        int i10 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
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
                                    synchronized (ur.class) {
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
                return new ur();
            }
            return new qo(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", lp.f14622s, "zzk"});
        }
        return (byte) 1;
    }

    public final long t() {
        return this.zzh;
    }

    public final mr u() {
        mr mrVar = this.zzk;
        if (mrVar == null) {
            return mr.t();
        }
        return mrVar;
    }

    public final String v() {
        return this.zzi;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzf & 16) != 0;
    }

    public final boolean y() {
        return (this.zzf & 2) != 0;
    }

    public final boolean z() {
        return (this.zzf & 8) != 0;
    }
}
