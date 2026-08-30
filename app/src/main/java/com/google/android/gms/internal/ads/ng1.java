package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class ng1 extends dn1 {
    private static final ng1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.ng1] */
    static {
        com.google.android.gms.internal.ads.ng1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(ng1.class, dn1Var);
    }

    public static mg1 A() {
        return (mg1) zzd.q();
    }

    public static ng1 B() {
        return zzd;
    }

    public final /* synthetic */ void C(yg1 yg1Var) {
        this.zza = yg1Var.zza();
    }

    public final int D() {
        int i = this.zzb;
        int i10 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int E() {
        int i = this.zzc;
        int i10 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void F(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            ln1.a();
            throw null;
        }
    }

    public final void G(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            ln1.a();
            throw null;
        }
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
                                    synchronized (ng1.class) {
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
            return new jo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final yg1 z() {
        yg1 a10 = yg1.a(this.zza);
        return a10 == null ? yg1.UNRECOGNIZED : a10;
    }
}
