package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cs extends nn implements ho {
    private static final cs zza;
    private static volatile mo zze;
    private eo zzf;
    private eo zzg;
    private un zzh;

    static {
        cs csVar = new cs();
        zza = csVar;
        nn.m(cs.class, csVar);
    }

    public cs() {
        eo eoVar = eo.f14266v;
        this.zzf = eoVar;
        this.zzg = eoVar;
        this.zzh = po.f14806y;
    }

    public static zr t() {
        return (zr) zza.f();
    }

    public static cs u() {
        return zza;
    }

    public static eo v(cs csVar) {
        eo eoVar = csVar.zzf;
        if (!eoVar.f14267u) {
            csVar.zzf = eoVar.a();
        }
        return csVar.zzf;
    }

    public static void y(cs csVar, ArrayList arrayList) {
        un unVar = csVar.zzh;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            csVar.zzh = unVar.f(size + size);
        }
        km.c(arrayList, csVar.zzh);
    }

    public static void z(cs csVar) {
        csVar.zzh = po.f14806y;
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
                                    synchronized (cs.class) {
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
                return new cs();
            }
            return new qo(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"zzf", as.f14029a, "zzg", bs.f14114a, "zzh", tr.class});
        }
        return (byte) 1;
    }

    public final Map w() {
        return Collections.unmodifiableMap(this.zzf);
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.zzg);
    }
}
