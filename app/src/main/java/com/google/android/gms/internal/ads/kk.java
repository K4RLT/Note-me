package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class kk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final kk zzf;
    private static volatile fo1 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.kk] */
    static {
        dn1 dn1Var = new dn1();
        zzf = dn1Var;
        dn1.t(kk.class, dn1Var);
    }

    public static kk A() {
        return zzf;
    }

    public static jk z() {
        return (jk) zzf.q();
    }

    public final void B(boolean z3) {
        this.zzc |= 1;
        this.zzd = z3;
    }

    public final void C(int i) {
        this.zzc |= 2;
        this.zze = i;
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
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (kk.class) {
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
            return new jo1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}