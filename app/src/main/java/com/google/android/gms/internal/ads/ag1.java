package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class ag1 extends dn1 {
    private static final ag1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private om1 zzb = om1.f9167v;

    static {
        ag1 ag1Var = new ag1();
        zzc = ag1Var;
        dn1.t(ag1.class, ag1Var);
    }

    public static ag1 B(om1 om1Var, wm1 wm1Var) {
        return (ag1) dn1.m(zzc, om1Var, wm1Var);
    }

    public static zf1 C() {
        return (zf1) zzc.q();
    }

    public static fo1 D() {
        return zzc.o();
    }

    public final om1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void E(om1 om1Var) {
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
                                    synchronized (ag1.class) {
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
                return new ag1();
            }
            return new jo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza;
    }
}
