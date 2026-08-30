package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class hk extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final hk zzh;
    private static volatile fo1 zzi;
    private int zzd;
    private int zze;
    private kk zzf;
    private mk zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.hk, com.google.android.gms.internal.ads.dn1] */
    static {
        com.google.android.gms.internal.ads.dn1 dn1Var = new dn1();
        zzh = dn1Var;
        dn1.t(hk.class, dn1Var);
    }

    public static gk A() {
        return (gk) zzh.q();
    }

    public final void B() {
        this.zze = q0.d.b(2);
        this.zzd |= 1;
    }

    public final void C(kk kkVar) {
        kkVar.getClass();
        this.zzf = kkVar;
        this.zzd |= 2;
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
                                fo1 fo1Var2 = zzi;
                                if (fo1Var2 == null) {
                                    synchronized (hk.class) {
                                        try {
                                            fo1Var = zzi;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzh);
                                                zzi = fo1Var;
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
                        return zzh;
                    }
                    return new bn1(zzh);
                }
                return new dn1();
            }
            return new jo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", nd.f8666u, "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final void z(mk mkVar) {
        this.zzg = mkVar;
        this.zzd |= 4;
    }
}
