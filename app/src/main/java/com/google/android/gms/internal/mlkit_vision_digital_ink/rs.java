package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class rs extends nn implements ho {
    private static final rs zza;
    private static volatile mo zze;
    private eo zzf = eo.f14266v;

    static {
        rs rsVar = new rs();
        zza = rsVar;
        nn.m(rs.class, rsVar);
    }

    public static ps u() {
        return (ps) zza.f();
    }

    public static rs v() {
        return zza;
    }

    public static eo w(rs rsVar) {
        eo eoVar = rsVar.zzf;
        if (!eoVar.f14267u) {
            rsVar.zzf = eoVar.a();
        }
        return rsVar.zzf;
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
                                    synchronized (rs.class) {
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
                return new rs();
            }
            return new qo(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzf", qs.f14856a});
        }
        return (byte) 1;
    }

    public final os t(String str) {
        os osVar = (os) this.zzf.get(str);
        if (osVar != null) {
            return osVar;
        }
        return null;
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.zzf);
    }
}
