package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class y8 extends nn implements ho {
    private static final y8 zza;
    private static volatile mo zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private un zzi = po.f14806y;
    private long zzj;

    static {
        y8 y8Var = new y8();
        zza = y8Var;
        nn.m(y8.class, y8Var);
    }

    public static x8 t() {
        return (x8) zza.f();
    }

    public static void u(y8 y8Var, r8 r8Var) {
        r8Var.getClass();
        un unVar = y8Var.zzi;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            y8Var.zzi = unVar.f(size + size);
        }
        y8Var.zzi.add(r8Var);
    }

    public static /* synthetic */ void v(y8 y8Var, long j10) {
        y8Var.zzf |= 4;
        y8Var.zzj = j10;
    }

    public static /* synthetic */ void w(y8 y8Var, int i) {
        y8Var.zzg = i - 2;
        y8Var.zzf |= 1;
    }

    public static /* synthetic */ void x(y8 y8Var, int i) {
        y8Var.zzh = i - 2;
        y8Var.zzf |= 2;
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
                                    synchronized (y8.class) {
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
                return new y8();
            }
            return new qo(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"zzf", "zzg", b9.f14071c, "zzh", b9.f14072d, "zzi", r8.class, "zzj"});
        }
        return (byte) 1;
    }
}
