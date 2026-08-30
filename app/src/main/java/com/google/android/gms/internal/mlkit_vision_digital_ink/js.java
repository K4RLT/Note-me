package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class js extends nn implements ho {
    private static final js zza;
    private static volatile mo zze;
    private int zzf;
    private wo zzg;
    private boolean zzi;
    private ms zzj;
    private eo zzk = eo.f14266v;
    private un zzh = po.f14806y;

    static {
        js jsVar = new js();
        zza = jsVar;
        nn.m(js.class, jsVar);
    }

    public static js u() {
        return zza;
    }

    public static void w(js jsVar, yr yrVar) {
        un unVar = jsVar.zzh;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            jsVar.zzh = unVar.f(size + size);
        }
        jsVar.zzh.add(yrVar);
    }

    public static void x(js jsVar, int i, yr yrVar) {
        un unVar = jsVar.zzh;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            jsVar.zzh = unVar.f(size + size);
        }
        jsVar.zzh.set(i, yrVar);
    }

    public static /* synthetic */ void y(js jsVar) {
        jsVar.zzf |= 2;
        jsVar.zzi = true;
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
                                    synchronized (js.class) {
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
                return new js();
            }
            return new qo(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"zzf", "zzg", "zzh", yr.class, "zzi", "zzj", "zzk", is.f14483a});
        }
        return (byte) 1;
    }

    public final yr t(int i) {
        return (yr) this.zzh.get(i);
    }

    public final un v() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzi;
    }
}
