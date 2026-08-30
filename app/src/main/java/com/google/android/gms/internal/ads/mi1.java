package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mi1 extends dn1 {
    private static final mi1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.mi1, com.google.android.gms.internal.ads.dn1] */
    static {
        com.google.android.gms.internal.ads.dn1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(mi1.class, dn1Var);
    }

    public static li1 C() {
        return (li1) zzd.q();
    }

    public static mi1 D() {
        return zzd;
    }

    public final yg1 A() {
        yg1 a10 = yg1.a(this.zzb);
        return a10 == null ? yg1.UNRECOGNIZED : a10;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(yg1 yg1Var) {
        this.zza = yg1Var.zza();
    }

    public final /* synthetic */ void F(yg1 yg1Var) {
        this.zzb = yg1Var.zza();
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = q0.d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (mi1.class) {
                                        try {
                                            fo1Var = zze;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzd);
                                                zze = fo1Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return fo1Var;
                                }
                                return fo1Var2;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new bn1(zzd);
                }
                return new dn1();
            }
            return new jo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final yg1 z() {
        yg1 a10 = yg1.a(this.zza);
        return a10 == null ? yg1.UNRECOGNIZED : a10;
    }
}
