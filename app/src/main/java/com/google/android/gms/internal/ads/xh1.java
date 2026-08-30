package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class xh1 extends dn1 {
    private static final xh1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private zh1 zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.xh1, com.google.android.gms.internal.ads.dn1] */
    static {
        com.google.android.gms.internal.ads.dn1 dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(xh1.class, dn1Var);
    }

    public static xh1 B(om1 om1Var, wm1 wm1Var) {
        return (xh1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static wh1 C() {
        return (wh1) zzd.q();
    }

    public static fo1 D() {
        return zzd.o();
    }

    public final zh1 A() {
        zh1 zh1Var = this.zzc;
        if (zh1Var == null) {
            return zh1.D();
        }
        return zh1Var;
    }

    public final /* synthetic */ void E(zh1 zh1Var) {
        this.zzc = zh1Var;
        this.zza |= 1;
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
                                    synchronized (xh1.class) {
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
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}
