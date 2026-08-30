package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ai1 extends dn1 {
    public static final /* synthetic */ int zza = 0;
    private static final ai1 zzd;
    private static volatile fo1 zze;
    private String zzb = "";
    private kn1 zzc = io1.f7187y;

    static {
        ai1 ai1Var = new ai1();
        zzd = ai1Var;
        dn1.t(ai1.class, ai1Var);
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (ai1.class) {
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
                return new ai1();
            }
            return new jo1(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", jh1.class});
        }
        return (byte) 1;
    }
}
