package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class yf1 extends dn1 {
    private static final yf1 zzb;
    private static volatile fo1 zzc;
    private int zza;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.yf1, com.google.android.gms.internal.ads.dn1] */
    static {
        dn1 dn1Var = new dn1();
        zzb = dn1Var;
        dn1.t(yf1.class, dn1Var);
    }

    public static xf1 A() {
        return (xf1) zzb.q();
    }

    public static yf1 B() {
        return zzb;
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i;
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (yf1.class) {
                                        try {
                                            fo1Var = zzc;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzb);
                                                zzc = fo1Var;
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
                        return zzb;
                    }
                    return new bn1(zzb);
                }
                return new dn1();
            }
            return new jo1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza;
    }
}