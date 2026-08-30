package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class w8 extends nn implements ho {
    private static final w8 zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.w8, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        nn nnVar = new nn();
        zza = nnVar;
        nn.m(w8.class, nnVar);
    }

    public static u8 t() {
        return (u8) zza.f();
    }

    public static /* synthetic */ void u(w8 w8Var, int i) {
        w8Var.zzf |= 1;
        w8Var.zzg = i;
    }

    public static /* synthetic */ void v(w8 w8Var, long j10) {
        w8Var.zzf |= 2;
        w8Var.zzh = j10;
    }

    public static /* synthetic */ void w(w8 w8Var, boolean z3) {
        w8Var.zzf |= 8;
        w8Var.zzj = z3;
    }

    public static /* synthetic */ void x(w8 w8Var, long j10) {
        w8Var.zzf |= 4;
        w8Var.zzi = j10;
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
                                    synchronized (w8.class) {
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
            return new qo(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}