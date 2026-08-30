package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class r8 extends nn implements ho {
    private static final r8 zza;
    private static volatile mo zze;
    private int zzf;
    private int zzh;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private long zzm;
    private boolean zzo;
    private String zzg = "";
    private String zzi = "";
    private String zzn = "";

    static {
        r8 r8Var = new r8();
        zza = r8Var;
        nn.m(r8.class, r8Var);
    }

    public static /* synthetic */ void A(r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 4;
        r8Var.zzi = str;
    }

    public static /* synthetic */ void B(r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 128;
        r8Var.zzn = str;
    }

    public static q8 t() {
        return (q8) zza.f();
    }

    public static /* synthetic */ void u(r8 r8Var, long j10) {
        r8Var.zzf |= 64;
        r8Var.zzm = j10;
    }

    public static /* synthetic */ void v(r8 r8Var, int i) {
        r8Var.zzf |= 8;
        r8Var.zzj = i;
    }

    public static /* synthetic */ void w(r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 1;
        r8Var.zzg = str;
    }

    public static /* synthetic */ void x(r8 r8Var, int i) {
        r8Var.zzf |= 2;
        r8Var.zzh = i;
    }

    public static /* synthetic */ void y(r8 r8Var) {
        r8Var.zzf |= 32;
        r8Var.zzl = false;
    }

    public static /* synthetic */ void z(r8 r8Var) {
        r8Var.zzf |= 256;
        r8Var.zzo = false;
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
                                    synchronized (r8.class) {
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
                return new r8();
            }
            return new qo(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzk", "zzo"});
        }
        return (byte) 1;
    }
}
