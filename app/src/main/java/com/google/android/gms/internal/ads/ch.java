package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class ch extends dn1 {
    private static final ch zzd;
    private static volatile fo1 zze;
    private int zza;
    private jh zzb;
    private hn1 zzc = en1.f5735y;

    static {
        ch chVar = new ch();
        zzd = chVar;
        dn1.t(ch.class, chVar);
    }

    public static ch B(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zzd, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (ch) x9;
    }

    public final List A() {
        return this.zzc;
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
                                    synchronized (ch.class) {
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
                return new ch();
            }
            return new jo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final jh z() {
        jh jhVar = this.zzb;
        if (jhVar == null) {
            return jh.D();
        }
        return jhVar;
    }
}
