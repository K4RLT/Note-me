package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jb extends nn implements ho {
    private static final jb zza;
    private static volatile mo zze;
    private int zzf;
    private un zzg = po.f14806y;
    private int zzh;

    static {
        jb jbVar = new jb();
        zza = jbVar;
        nn.m(jb.class, jbVar);
    }

    public static ib t() {
        return (ib) zza.f();
    }

    public static void u(jb jbVar, ArrayList arrayList) {
        un unVar = jbVar.zzg;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            jbVar.zzg = unVar.f(size + size);
        }
        km.c(arrayList, jbVar.zzg);
    }

    public static /* synthetic */ void v(jb jbVar, int i) {
        jbVar.zzf |= 1;
        jbVar.zzh = i;
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
                                    synchronized (jb.class) {
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
                return new jb();
            }
            return new qo(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzf", "zzg", pb.class, "zzh"});
        }
        return (byte) 1;
    }
}
