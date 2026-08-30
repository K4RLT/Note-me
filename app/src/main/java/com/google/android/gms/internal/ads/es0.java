package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class es0 extends dn1 {
    private static final es0 zzi;
    private static volatile fo1 zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        es0 es0Var = new es0();
        zzi = es0Var;
        dn1.t(es0.class, es0Var);
    }

    public static ds0 z() {
        return (ds0) zzi.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zzc = j10;
    }

    public final /* synthetic */ void D(boolean z3) {
        this.zzd = z3;
    }

    public final /* synthetic */ void E(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zzf = j10;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzh = i - 2;
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
                                fo1 fo1Var2 = zzj;
                                if (fo1Var2 == null) {
                                    synchronized (es0.class) {
                                        try {
                                            fo1Var = zzj;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzi);
                                                zzj = fo1Var;
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
                        return zzi;
                    }
                    return new bn1(zzi);
                }
                return new es0();
            }
            return new jo1(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
