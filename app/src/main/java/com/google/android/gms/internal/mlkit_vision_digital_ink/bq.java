package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class bq extends kn {
    private static final bq zze;
    private static volatile mo zzf;
    private int zzg;
    private boolean zzi;
    private byte zzj = 2;
    private un zzh = po.f14806y;

    static {
        bq bqVar = new bq();
        zze = bqVar;
        nn.m(bq.class, bqVar);
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
                                this.zzj = b10;
                                return null;
                            }
                            mo moVar2 = zzf;
                            if (moVar2 == null) {
                                synchronized (bq.class) {
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
                return new bq();
            }
            return new qo(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"zzg", "zzh", aq.class, "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
