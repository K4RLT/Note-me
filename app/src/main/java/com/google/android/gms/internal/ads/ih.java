package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class ih extends dn1 {
    private static final ih zze;
    private static volatile fo1 zzf;
    private int zza;
    private mh zzb;
    private om1 zzc;
    private om1 zzd;

    static {
        ih ihVar = new ih();
        zze = ihVar;
        dn1.t(ih.class, ihVar);
    }

    public ih() {
        mm1 mm1Var = om1.f9167v;
        this.zzc = mm1Var;
        this.zzd = mm1Var;
    }

    public static ih C(mm1 mm1Var, wm1 wm1Var) {
        return (ih) dn1.m(zze, mm1Var, wm1Var);
    }

    public static ih D(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zze, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (ih) x9;
    }

    public final om1 A() {
        return this.zzc;
    }

    public final om1 B() {
        return this.zzd;
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
                                    synchronized (ih.class) {
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
                return new ih();
            }
            return new jo1(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }

    public final mh z() {
        mh mhVar = this.zzb;
        if (mhVar == null) {
            return mh.H();
        }
        return mhVar;
    }
}
