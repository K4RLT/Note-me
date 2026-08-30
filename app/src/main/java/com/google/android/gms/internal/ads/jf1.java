package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class jf1 extends dn1 {
    private static final jf1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private nf1 zzc;
    private ah1 zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.jf1, com.google.android.gms.internal.ads.dn1] */
    static {
        dn1 dn1Var = new dn1();
        zze = dn1Var;
        dn1.t(jf1.class, dn1Var);
    }

    public static jf1 C(om1 om1Var, wm1 wm1Var) {
        return (jf1) dn1.m(zze, om1Var, wm1Var);
    }

    public static if1 D() {
        return (if1) zze.q();
    }

    public static fo1 E() {
        return zze.o();
    }

    public final nf1 A() {
        nf1 nf1Var = this.zzc;
        if (nf1Var == null) {
            return nf1.D();
        }
        return nf1Var;
    }

    public final ah1 B() {
        ah1 ah1Var = this.zzd;
        if (ah1Var == null) {
            return ah1.E();
        }
        return ah1Var;
    }

    public final /* synthetic */ void F(nf1 nf1Var) {
        this.zzc = nf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(ah1 ah1Var) {
        this.zzd = ah1Var;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (jf1.class) {
                                        try {
                                            fo1Var = zzf;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zze);
                                                zzf = fo1Var;
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
                        return zze;
                    }
                    return new bn1(zze);
                }
                return new dn1();
            }
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zzb;
    }
}