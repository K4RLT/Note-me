package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ff1 extends dn1 {
    private static final ff1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private int zzb;
    private hf1 zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ff1, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zzd = dn1Var;
        dn1.t(ff1.class, dn1Var);
    }

    public static ff1 B(om1 om1Var, wm1 wm1Var) {
        return (ff1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static ef1 C() {
        return (ef1) zzd.q();
    }

    public final hf1 A() {
        hf1 hf1Var = this.zzc;
        if (hf1Var == null) {
            return hf1.B();
        }
        return hf1Var;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void E(hf1 hf1Var) {
        this.zzc = hf1Var;
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
                                    synchronized (ff1.class) {
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
