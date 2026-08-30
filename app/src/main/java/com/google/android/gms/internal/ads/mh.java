package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class mh extends dn1 {
    private static final mh zzg;
    private static volatile fo1 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        mh mhVar = new mh();
        zzg = mhVar;
        dn1.t(mh.class, mhVar);
    }

    public static mh E(mm1 mm1Var) {
        mh mhVar = zzg;
        wm1 wm1Var = wm1.f12302a;
        int i = em1.f5727a;
        dn1 m4 = dn1.m(mhVar, mm1Var, wm1.f12303b);
        dn1.y(m4);
        return (mh) m4;
    }

    public static mh F(mm1 mm1Var, wm1 wm1Var) {
        return (mh) dn1.m(zzg, mm1Var, wm1Var);
    }

    public static lh G() {
        return (lh) zzg.q();
    }

    public static mh H() {
        return zzg;
    }

    public final String A() {
        return this.zzc;
    }

    public final long B() {
        return this.zzd;
    }

    public final long C() {
        return this.zze;
    }

    public final long D() {
        return this.zzf;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zza |= 16;
        this.zzf = j10;
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
                                fo1 fo1Var2 = zzh;
                                if (fo1Var2 == null) {
                                    synchronized (mh.class) {
                                        try {
                                            fo1Var = zzh;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzg);
                                                zzh = fo1Var;
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
                        return zzg;
                    }
                    return new bn1(zzg);
                }
                return new mh();
            }
            return new jo1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zzb;
    }
}
