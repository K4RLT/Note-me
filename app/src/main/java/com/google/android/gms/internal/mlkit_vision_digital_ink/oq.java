package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class oq extends nn implements ho {
    private static final oq zza;
    private static volatile mo zze;
    private int zzf = 0;
    private Object zzg;

    static {
        oq oqVar = new oq();
        zza = oqVar;
        nn.m(oq.class, oqVar);
    }

    public static /* synthetic */ void A(oq oqVar, mq mqVar) {
        mqVar.getClass();
        oqVar.zzg = mqVar;
        oqVar.zzf = 3;
    }

    public static /* synthetic */ void B(oq oqVar, sq sqVar) {
        oqVar.zzg = sqVar;
        oqVar.zzf = 4;
    }

    public static nq w() {
        return (nq) zza.f();
    }

    public static /* synthetic */ void y(oq oqVar, hq hqVar) {
        hqVar.getClass();
        oqVar.zzg = hqVar;
        oqVar.zzf = 1;
    }

    public static /* synthetic */ void z(oq oqVar, lq lqVar) {
        lqVar.getClass();
        oqVar.zzg = lqVar;
        oqVar.zzf = 2;
    }

    public final boolean C() {
        if (this.zzf == 1) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        return this.zzf == 6;
    }

    public final boolean E() {
        return this.zzf == 4;
    }

    public final int F() {
        switch (this.zzf) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
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
                                    synchronized (oq.class) {
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
                return new oq();
            }
            return new qo(zza, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zzg", "zzf", hq.class, lq.class, mq.class, sq.class, jq.class, kq.class});
        }
        return (byte) 1;
    }

    public final jq t() {
        if (this.zzf == 5) {
            return (jq) this.zzg;
        }
        return jq.u();
    }

    public final lq u() {
        if (this.zzf == 2) {
            return (lq) this.zzg;
        }
        return lq.t();
    }

    public final mq v() {
        if (this.zzf == 3) {
            return (mq) this.zzg;
        }
        return mq.t();
    }

    public final sq x() {
        if (this.zzf == 4) {
            return (sq) this.zzg;
        }
        return sq.u();
    }
}
