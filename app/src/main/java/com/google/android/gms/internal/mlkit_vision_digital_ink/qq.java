package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class qq extends nn implements ho {
    private static final qq zza;
    private static volatile mo zze;
    private un zzf = po.f14806y;

    static {
        qq qqVar = new qq();
        zza = qqVar;
        nn.m(qq.class, qqVar);
    }

    public static mo u() {
        return (mo) zza.q(7, null);
    }

    public static pq w() {
        return (pq) zza.f();
    }

    public static qq x() {
        return zza;
    }

    public static void z(qq qqVar, oq oqVar) {
        un unVar = qqVar.zzf;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            qqVar.zzf = unVar.f(size + size);
        }
        qqVar.zzf.add(oqVar);
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
                                    synchronized (qq.class) {
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
                return new qq();
            }
            return new qo(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", oq.class});
        }
        return (byte) 1;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final oq v() {
        return (oq) this.zzf.get(0);
    }

    public final un y() {
        return this.zzf;
    }
}
