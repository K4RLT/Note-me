package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class yg extends dn1 {
    private static final yg zze;
    private static volatile fo1 zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private hn1 zzd = en1.f5735y;

    static {
        yg ygVar = new yg();
        zze = ygVar;
        dn1.t(yg.class, ygVar);
    }

    public static xg z() {
        return (xg) zze.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zzb = 15;
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
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (yg.class) {
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
                return new yg();
            }
            return new jo1(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
