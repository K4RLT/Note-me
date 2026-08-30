package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qf1 extends dn1 {
    private static final qf1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private sf1 zzb;
    private int zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.qf1] */
    static {
        ?? dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(qf1.class, dn1Var);
    }

    public static of1 B() {
        return (of1) zzd.q();
    }

    public static qf1 C() {
        return zzd;
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(sf1 sf1Var) {
        this.zzb = sf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i) {
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
                                    synchronized (qf1.class) {
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
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final sf1 z() {
        sf1 sf1Var = this.zzb;
        if (sf1Var == null) {
            return sf1.B();
        }
        return sf1Var;
    }
}
