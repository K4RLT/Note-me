package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class pb extends nn implements ho {
    private static final pb zza;
    private static volatile mo zze;
    private int zzf;
    private ub zzg;
    private wb zzh;
    private long zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.pb, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        ?? nnVar = new nn();
        zza = nnVar;
        nn.m(pb.class, nnVar);
    }

    public static ob t() {
        return (ob) zza.f();
    }

    public static /* synthetic */ void u(pb pbVar, long j10) {
        pbVar.zzf |= 4;
        pbVar.zzi = j10;
    }

    public static /* synthetic */ void v(pb pbVar, ub ubVar) {
        pbVar.zzg = ubVar;
        pbVar.zzf |= 1;
    }

    public static /* synthetic */ void w(pb pbVar, wb wbVar) {
        pbVar.zzh = wbVar;
        pbVar.zzf |= 2;
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
                                    synchronized (pb.class) {
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
            return new qo(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
