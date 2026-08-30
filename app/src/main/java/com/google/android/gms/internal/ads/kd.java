package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class kd extends dn1 {
    private static final kd zzj;
    private static volatile fo1 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private sd zzg;
    private vd zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        kd kdVar = new kd();
        zzj = kdVar;
        dn1.t(kd.class, kdVar);
    }

    public static jd D() {
        return (jd) zzj.q();
    }

    public final boolean A() {
        return this.zze;
    }

    public final sd B() {
        sd sdVar = this.zzg;
        if (sdVar == null) {
            return sd.C();
        }
        return sdVar;
    }

    public final void C() {
        if (this.zzh == null) {
            int i = vd.f11886a;
        }
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(boolean z3) {
        this.zza |= 8;
        this.zze = z3;
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
                                fo1 fo1Var2 = zzk;
                                if (fo1Var2 == null) {
                                    synchronized (kd.class) {
                                        try {
                                            fo1Var = zzk;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzj);
                                                zzk = fo1Var;
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
                        return zzj;
                    }
                    return new bn1(zzj);
                }
                return new kd();
            }
            return new jo1(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", nd.f8649b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zzd;
    }
}
