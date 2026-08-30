package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class a1 extends nn implements ho {
    public static final mn zza;
    private static final a1 zze;
    private static volatile mo zzf;
    private int zzg;
    private long zzh;
    private long zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.nn, com.google.android.gms.internal.mlkit_vision_digital_ink.a1] */
    static {
        com.google.android.gms.internal.mlkit_vision_digital_ink.a1 nnVar = new nn();
        zze = nnVar;
        nn.m(a1.class, nnVar);
        zza = new mn(ax.v(), nnVar, nnVar, new ln(AdError.NETWORK_ERROR_CODE, gp.f14375y));
    }

    public static o0 t() {
        return (o0) zze.f();
    }

    public static /* synthetic */ void u(a1 a1Var, long j10) {
        a1Var.zzg |= 2;
        a1Var.zzi = j10;
    }

    public static /* synthetic */ void v(a1 a1Var, long j10) {
        a1Var.zzg |= 1;
        a1Var.zzh = j10;
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
                                mo moVar2 = zzf;
                                if (moVar2 == null) {
                                    synchronized (a1.class) {
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
                            throw null;
                        }
                        return zze;
                    }
                    return new hn(zze);
                }
                return new nn();
            }
            return new qo(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
