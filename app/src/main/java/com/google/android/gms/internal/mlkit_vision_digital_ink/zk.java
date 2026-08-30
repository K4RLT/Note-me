package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class zk extends nn implements ho {
    private static final zk zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private un zzn = po.f14806y;
    private String zzo = "";
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private int zzs;
    private int zzt;

    static {
        zk zkVar = new zk();
        zza = zkVar;
        nn.m(zk.class, zkVar);
    }

    public static /* synthetic */ void A(zk zkVar, int i) {
        zkVar.zzf |= 2048;
        zkVar.zzs = i;
    }

    public static /* synthetic */ void B(zk zkVar) {
        zkVar.zzf |= 4;
        zkVar.zzi = "";
    }

    public static /* synthetic */ void C(zk zkVar) {
        zkVar.zzf |= 32;
        zkVar.zzl = "";
    }

    public static /* synthetic */ void D(zk zkVar, boolean z3) {
        zkVar.zzf |= 256;
        zkVar.zzp = z3;
    }

    public static /* synthetic */ void E(zk zkVar, boolean z3) {
        zkVar.zzf |= 512;
        zkVar.zzq = z3;
    }

    public static /* synthetic */ void F(zk zkVar, String str) {
        zkVar.zzf |= 128;
        zkVar.zzo = str;
    }

    public static /* synthetic */ void G(zk zkVar, String str) {
        zkVar.zzf |= 8;
        zkVar.zzj = str;
    }

    public static /* synthetic */ void H(zk zkVar, int i) {
        zkVar.zzf |= 4096;
        zkVar.zzt = i;
    }

    public static /* synthetic */ void I(zk zkVar, String str) {
        zkVar.zzf |= 16;
        zkVar.zzk = str;
    }

    public static yk t() {
        return (yk) zza.f();
    }

    public static zk u() {
        return zza;
    }

    public static void w(zk zkVar, z4 z4Var) {
        un unVar = zkVar.zzn;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            zkVar.zzn = unVar.f(size + size);
        }
        km.c(z4Var, zkVar.zzn);
    }

    public static /* synthetic */ void x(zk zkVar) {
        zkVar.zzf |= 64;
        zkVar.zzm = "";
    }

    public static /* synthetic */ void y(zk zkVar, String str) {
        zkVar.zzf |= 1;
        zkVar.zzg = str;
    }

    public static /* synthetic */ void z(zk zkVar, String str) {
        zkVar.zzf |= 2;
        zkVar.zzh = str;
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
                                    synchronized (zk.class) {
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
                return new zk();
            }
            return new qo(zza, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\tဈ\u0007\nဇ\b\u000bဇ\t\fဇ\n\rဋ\u000b\u000eင\f", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zzk;
    }
}
