package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class vr extends nn implements ho {
    private static final vr zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.vr, com.google.android.gms.internal.mlkit_vision_digital_ink.nn] */
    static {
        nn nnVar = new nn();
        zza = nnVar;
        nn.m(vr.class, nnVar);
    }

    public static vr u() {
        return zza;
    }

    public static vr v(byte[] bArr, bn bnVar) {
        nn r8 = nn.r(zza, bArr, bArr.length, bnVar);
        if (r8 != null && !nn.s(r8, true)) {
            androidx.datastore.preferences.protobuf.s1.u(new xo().getMessage());
            return null;
        }
        return (vr) r8;
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
                                    synchronized (vr.class) {
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
            return new qo(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004ဂ\u0002", new Object[]{"zzf", "zzg", lp.f14625v, "zzh", lp.f14624u, "zzj", lp.f14623t, "zzi"});
        }
        return (byte) 1;
    }

    public final long t() {
        return this.zzi;
    }

    public final int w() {
        int i = this.zzj;
        int i10 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int x() {
        int i;
        int i10 = this.zzh;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                i = i10 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int y() {
        int i;
        int i10 = this.zzg;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                i = i10 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}