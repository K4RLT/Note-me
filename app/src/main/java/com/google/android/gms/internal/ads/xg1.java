package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class xg1 extends dn1 {
    private static final xg1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private om1 zzb = om1.f9167v;

    static {
        xg1 xg1Var = new xg1();
        zzc = xg1Var;
        dn1.t(xg1.class, xg1Var);
    }

    public static xg1 B(om1 om1Var, wm1 wm1Var) {
        return (xg1) dn1.m(zzc, om1Var, wm1Var);
    }

    public static wg1 C() {
        return (wg1) zzc.q();
    }

    public static xg1 D() {
        return zzc;
    }

    public static fo1 E() {
        return zzc.o();
    }

    public final om1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void F(om1 om1Var) {
        om1Var.getClass();
        this.zzb = om1Var;
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
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (xg1.class) {
                                        try {
                                            fo1Var = zzd;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzc);
                                                zzd = fo1Var;
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
                        return zzc;
                    }
                    return new bn1(zzc);
                }
                return new xg1();
            }
            return new jo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza;
    }
}
