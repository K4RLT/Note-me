package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class hp1 extends dn1 {
    private static final hp1 zzc;
    private static volatile fo1 zzd;
    private hn1 zza;
    private hn1 zzb;

    static {
        hp1 hp1Var = new hp1();
        zzc = hp1Var;
        dn1.t(hp1.class, hp1Var);
    }

    public hp1() {
        en1 en1Var = en1.f5735y;
        this.zza = en1Var;
        this.zzb = en1Var;
    }

    public static hp1 z(byte[] bArr, wm1 wm1Var) {
        return (hp1) dn1.n(zzc, bArr, wm1Var);
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
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (hp1.class) {
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
                return new hp1();
            }
            return new jo1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }
}
