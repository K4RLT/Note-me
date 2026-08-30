package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class fh extends kn {
    private static final fh zze;
    private static volatile mo zzf;
    private int zzg;
    private long zzj;
    private int zzk;
    private qq zzm;
    private long zzo;
    private qq zzp;
    private un zzq;
    private int zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private om zzv;
    private un zzw;
    private byte zzx = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";

    static {
        fh fhVar = new fh();
        zze = fhVar;
        nn.m(fh.class, fhVar);
    }

    public fh() {
        po poVar = po.f14806y;
        this.zzq = poVar;
        this.zzt = "";
        this.zzu = "";
        this.zzw = poVar;
    }

    public static /* synthetic */ void A(fh fhVar, String str) {
        str.getClass();
        fhVar.zzg |= 1;
        fhVar.zzh = str;
    }

    public static /* synthetic */ void B(fh fhVar, String str) {
        str.getClass();
        fhVar.zzg |= 2;
        fhVar.zzi = str;
    }

    public static gg u() {
        return (gg) zze.f();
    }

    public static fh v() {
        return zze;
    }

    public static /* synthetic */ void x(fh fhVar, long j10) {
        fhVar.zzg |= 4;
        fhVar.zzj = j10;
    }

    public static /* synthetic */ void y(fh fhVar, qq qqVar) {
        fhVar.zzm = qqVar;
        fhVar.zzg |= 32;
    }

    public static /* synthetic */ void z(fh fhVar, String str) {
        str.getClass();
        fhVar.zzg |= 64;
        fhVar.zzn = str;
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
                                this.zzx = b10;
                                return null;
                            }
                            mo moVar2 = zzf;
                            if (moVar2 == null) {
                                synchronized (fh.class) {
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
                return new fh();
            }
            return new qo(zze, "\u0001\u0010\u0000\u0001\u0002\u0016\u0010\u0000\u0002\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r\u0016\u001a", new Object[]{"zzg", "zzi", "zzj", "zzl", "zzh", "zzm", "zzp", "zzq", nk.class, "zzn", "zzk", hf.f14422w, "zzo", "zzr", hf.f14411l, "zzs", hf.f14405d, "zzt", "zzu", "zzv", "zzw"});
        }
        return Byte.valueOf(this.zzx);
    }

    public final String w() {
        return this.zzh;
    }
}
