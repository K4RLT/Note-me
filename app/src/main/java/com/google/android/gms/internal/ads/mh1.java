package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mh1 extends dn1 {
    private static final mh1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private gh1 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.mh1, com.google.android.gms.internal.ads.dn1] */
    static {
        ?? dn1Var = new dn1();
        zzf = dn1Var;
        dn1.t(mh1.class, dn1Var);
    }

    public static lh1 C() {
        return (lh1) zzf.q();
    }

    public final gh1 A() {
        gh1 gh1Var = this.zzb;
        if (gh1Var == null) {
            return gh1.C();
        }
        return gh1Var;
    }

    public final int B() {
        return this.zzd;
    }

    public final /* synthetic */ void D(gh1 gh1Var) {
        this.zzb = gh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i) {
        this.zzd = i;
    }

    public final int F() {
        int i = this.zzc;
        int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int G() {
        int l10 = ct.l(this.zze);
        if (l10 == 0) {
            return 1;
        }
        return l10;
    }

    public final void H(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            ln1.a();
            throw null;
        }
    }

    public final void I(int i) {
        if (i != 1) {
            this.zze = i - 2;
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
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (mh1.class) {
                                        try {
                                            fo1Var = zzg;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzf);
                                                zzg = fo1Var;
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
                        return zzf;
                    }
                    return new bn1(zzf);
                }
                return new dn1();
            }
            return new jo1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
