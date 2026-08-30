package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class ch1 extends dn1 {
    private static final ch1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private eh1 zzb;
    private int zzc;
    private int zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.ch1] */
    static {
        com.google.android.gms.internal.ads.ch1 dn1Var = new dn1();
        zze = dn1Var;
        dn1.t(ch1.class, dn1Var);
    }

    public static ch1 C(om1 om1Var, wm1 wm1Var) {
        return (ch1) dn1.m(zze, om1Var, wm1Var);
    }

    public static bh1 D() {
        return (bh1) zze.q();
    }

    public static ch1 E() {
        return zze;
    }

    public final int A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(eh1 eh1Var) {
        this.zzb = eh1Var;
        this.zza |= 1;
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
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (ch1.class) {
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
            return new jo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final eh1 z() {
        eh1 eh1Var = this.zzb;
        if (eh1Var == null) {
            return eh1.C();
        }
        return eh1Var;
    }
}
