package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class qh1 extends dn1 {
    private static final qh1 zze;
    private static volatile fo1 zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        qh1 qh1Var = new qh1();
        zze = qh1Var;
        dn1.t(qh1.class, qh1Var);
    }

    public static ph1 z() {
        return (ph1) zze.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(int i) {
        this.zzc = i;
    }

    public final void C(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            ln1.a();
            throw null;
        }
    }

    public final void D(int i) {
        if (i != 1) {
            this.zzd = i - 2;
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
                                fo1 fo1Var2 = zzf;
                                if (fo1Var2 == null) {
                                    synchronized (qh1.class) {
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
                return new qh1();
            }
            return new jo1(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
