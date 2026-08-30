package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class jq extends nn implements ho {
    private static final jq zza;
    private static volatile mo zze;
    private int zzf;
    private String zzg = "";
    private un zzh = po.f14806y;

    static {
        jq jqVar = new jq();
        zza = jqVar;
        nn.m(jq.class, jqVar);
    }

    public static jq u() {
        return zza;
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
                                    synchronized (jq.class) {
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
                return new jq();
            }
            return new qo(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzf", "zzg", "zzh", iq.class});
        }
        return (byte) 1;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final String v() {
        return this.zzg;
    }

    public final un w() {
        return this.zzh;
    }
}
