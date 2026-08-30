package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class or extends nn implements ho {
    private static final or zza;
    private static volatile mo zze;
    private int zzf;
    private long zzi;
    private int zzj;
    private qq zzl;
    private long zzn;
    private qq zzo;
    private un zzp;
    private int zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private om zzu;
    private un zzv;
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";

    static {
        or orVar = new or();
        zza = orVar;
        nn.m(or.class, orVar);
    }

    public or() {
        po poVar = po.f14806y;
        this.zzp = poVar;
        this.zzs = "";
        this.zzt = "";
        this.zzv = poVar;
    }

    public static /* synthetic */ void H(or orVar, long j10) {
        orVar.zzf |= 4;
        orVar.zzi = j10;
    }

    public static /* synthetic */ void I(or orVar, String str) {
        orVar.zzf |= 16;
        orVar.zzk = str;
    }

    public static /* synthetic */ void J(or orVar, long j10) {
        orVar.zzf |= 128;
        orVar.zzn = j10;
    }

    public static /* synthetic */ void K(or orVar, String str) {
        orVar.zzf |= 64;
        orVar.zzm = str;
    }

    public final String A() {
        return this.zzs;
    }

    public final String B() {
        return this.zzk;
    }

    public final String C() {
        return this.zzm;
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzt;
    }

    public final String F() {
        return this.zzh;
    }

    public final un G() {
        return this.zzp;
    }

    public final boolean L() {
        return (this.zzf & 16) != 0;
    }

    public final boolean M() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean N() {
        return (this.zzf & 32) != 0;
    }

    public final boolean O() {
        return (this.zzf & 64) != 0;
    }

    public final boolean P() {
        return (this.zzf & 256) != 0;
    }

    public final int Q() {
        int i = this.zzr;
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
                                    synchronized (or.class) {
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
                return new or();
            }
            return new qo(zza, "\u0001\u0010\u0000\u0001\u0002\u0016\u0010\u0000\u0002\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r\u0016\u001a", new Object[]{"zzf", "zzh", "zzi", "zzk", "zzg", "zzl", "zzo", "zzp", ur.class, "zzm", "zzj", lp.f14620q, "zzn", "zzq", lp.f14619p, "zzr", lp.f14618o, "zzs", "zzt", "zzu", "zzv"});
        }
        return (byte) 1;
    }

    public final int t() {
        int i = this.zzq;
        int i10 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int u() {
        int i = this.zzj;
        int i10 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final long v() {
        return this.zzi;
    }

    public final long w() {
        return this.zzn;
    }

    public final om x() {
        om omVar = this.zzu;
        if (omVar == null) {
            return om.t();
        }
        return omVar;
    }

    public final qq y() {
        qq qqVar = this.zzl;
        if (qqVar == null) {
            return qq.x();
        }
        return qqVar;
    }

    public final qq z() {
        qq qqVar = this.zzo;
        if (qqVar == null) {
            return qq.x();
        }
        return qqVar;
    }
}
