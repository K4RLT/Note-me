package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.n;

/* loaded from: classes.dex */
public final class t8 extends nn implements ho {
    private static final t8 zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private boolean zzk;
    private long zzl;
    private boolean zzm;
    private long zzn;
    private String zzh = "";
    private String zzj = "";
    private String zzo = "";

    static {
        t8 t8Var = new t8();
        zza = t8Var;
        nn.m(t8.class, t8Var);
    }

    public static /* synthetic */ void A(t8 t8Var, String str) {
        str.getClass();
        t8Var.zzf |= 256;
        t8Var.zzo = str;
    }

    public static /* synthetic */ void B(t8 t8Var, int i) {
        if (i != 1) {
            t8Var.zzg = i - 2;
            t8Var.zzf |= 1;
        } else {
            q.x.n("Can't get the number of an unknown enum value.");
        }
    }

    public static s8 t() {
        return (s8) zza.f();
    }

    public static /* synthetic */ void u(t8 t8Var, long j10) {
        t8Var.zzf |= 128;
        t8Var.zzn = j10;
    }

    public static /* synthetic */ void v(t8 t8Var, String str) {
        str.getClass();
        t8Var.zzf |= 2;
        t8Var.zzh = str;
    }

    public static /* synthetic */ void w(t8 t8Var, int i) {
        t8Var.zzf |= 4;
        t8Var.zzi = i;
    }

    public static /* synthetic */ void x(t8 t8Var, String str) {
        str.getClass();
        t8Var.zzf |= 8;
        t8Var.zzj = str;
    }

    public static /* synthetic */ void y(t8 t8Var) {
        t8Var.zzf |= 16;
        t8Var.zzk = true;
    }

    public static /* synthetic */ void z(t8 t8Var, long j10) {
        t8Var.zzf |= 32;
        t8Var.zzl = j10;
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
                                    synchronized (t8.class) {
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
                return new t8();
            }
            return new qo(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007\tဈ\b", new Object[]{"zzf", "zzg", b9.f14070b, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
